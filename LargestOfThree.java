import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter the first integer:");
        int user1 = scanner.nextInt();

        System.out.println("Enter the second integer:");
        int user2 = scanner.nextInt();

        System.out.println("Enter the third integer:");
        int user3 = scanner.nextInt();

        int largest;

        // Determine the largest integer using nested if statements
        if (user1 >= user2) {
            largest = user1;
        } else {
            largest = user2;
        }

        if (user3 >= largest) {
            largest = user3;
        }

        // Display the largest integer
        System.out.println("The largest integer among the three is: " + largest);

        scanner.close();
    }
}