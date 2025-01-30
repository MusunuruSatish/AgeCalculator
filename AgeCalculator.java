import java.util.Scanner;
import java.time.LocalDate;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the current year
        int currentYear = LocalDate.now().getYear();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        if (birthYear > currentYear || birthYear < 0) {
            System.out.println("Invalid birth year. Please enter a valid year.");
        } else {
            int age = currentYear - birthYear;
            System.out.println("Your age is: " + age + " years.");
        }

        scanner.close();
    }
}

