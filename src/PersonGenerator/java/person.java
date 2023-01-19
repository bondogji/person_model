package PersonGenerator.java;

public class person {

    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }



    @Override
    public String toString() {
        return "PersonGenerator.java.person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;

    }

    public String getFormallName()
    {
        return title + " "+ firstName + " "+ lastName;

    }
}
