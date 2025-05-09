public class Student {
    //private fields
    private String name;
    private String address;
    private double GPA;
    //default constructor
    public Student () {
        this.name = null;
        this.address = null;
        this.GPA = 0.0;
    }
    //parametrized constructor
    public Student (String name, String address, double GPA) {
        this.name = name;
        this.address = address;
        this.GPA = GPA;
    }
    //getters and setters
    public String getName() {return name;}
    public String getAddress() {return address;}
    public double getGPA() {return GPA;}
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override //Overrides toString method to a personalized string
    public String toString () {
        return "\tName: " + name + "\tG.P.A. : " + GPA + "\tAddress: " + address;
    }
}
