import java.util.Locale;
import java.util.Scanner;

public class Employee {

    private String firstName;
    private String lastName;
    private String employeeID;



    public Employee() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter employee last name: ");
        this.lastName = scan.nextLine();

        System.out.println(firstName + " " + lastName + ": "  + setEmployeeID());

    }

    //use first 3 char of last name

    private String setEmployeeID() {

        int min = 0;
        int max = 1000;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);

        this.employeeID = firstName + lastName.substring(0,3) + randomInt;
        return employeeID.toLowerCase(Locale.ROOT);



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


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
