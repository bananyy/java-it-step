public class Doctor {

    private final String lastName;
    private String specialization;

    public Doctor(String lastName, String specialization) {
        this.lastName = lastName;
        this.specialization = specialization;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
