
import java.util.Scanner;

public class IdApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of employees to get ID number: ");
        int numOfEmployees = scanner.nextInt();
        Employee[] employees = new Employee[numOfEmployees];

        for (int i = 0; i < numOfEmployees; i++) {
            employees[i] = new Employee();
        }
    }
}


























