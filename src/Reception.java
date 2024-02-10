public class Reception {

    private final String Day;
    private final String Shift;
    private final int NumberOfVisitors;

    public Reception(String Day, String Shift, int NumberOfVisitors) {
        this.Day = Day;
        this.Shift = Shift;
        this.NumberOfVisitors = NumberOfVisitors;
    }

    public String getDay() {
        return Day;
    }

    public String getShift() {
        return Shift;
    }

    public int getNumberOfVisitors() {
        return NumberOfVisitors;
    }

}
