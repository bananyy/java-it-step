// Main.java
public class Main {
    public static void main(String[] args) {
        // Створення об'єкта лікаря
        Doctor doctor = new Doctor("Костилів", "Хірург");

        // Створення масиву прийомів
        Reception[] receptions = {
                new Reception("Понеділок", "Ранок", 10),
                new Reception("Вівторок", "Вечір", 15),
                new Reception("Середа", "Ранок", 8)
        };

        // Пошук та виведення результатів основного завдання
        GetDates(doctor, receptions);
    }

    private static void GetDates(Doctor doctor, Reception[] receptions) {
        // Загальна кількість відвідувачів
        int NumberOfVisitors = 0;
        // Прийом з мінімальною кількістю відвідувачів
        Reception mincount = null;
        // Довжина прізвища лікаря
        int lenghtlastname = doctor.getLastName().length();

        // Обчислення загальної кількості відвідувачів та пошук прийому з мінімальною кількістю відвідувачів
        for (Reception reception : receptions) {
            NumberOfVisitors += reception.getNumberOfVisitors();
            if (mincount == null || reception.getNumberOfVisitors() < mincount.getNumberOfVisitors()) {
                mincount = reception;
            }
        }

        // Виведення результатів
        System.out.println("Загальна кількість відвідувачів: " + NumberOfVisitors);
        assert mincount != null;
        System.out.println("Прийом з мінімальною кількістю відвідувачів: " +
                mincount.getDay() + " " +
                mincount.getShift() + " " +
                mincount.getNumberOfVisitors());
        System.out.println("Довжина прізвища лікаря: " + lenghtlastname);
    }
}