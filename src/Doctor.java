public class Doctor {

    private final String LastName;
    private String Specilization;

    public Doctor(String LastName, String Specilization) {
        this.LastName = LastName;
        this.Specilization = Specilization;
    }

    public String getLastName() {
        return LastName;
    }

    public void setSpecilization(String Specilization) {
        this.Specilization = Specilization;
    }

}
