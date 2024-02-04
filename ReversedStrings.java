import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {
        // Print a welcome message to user
        System.out.println("Welcome to My Strings Program");

        // Create a Scanner Object for user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter word or sentence
        System.out.println("\nEnter a word or a sentence: ");

        // Read the user's input and store in userInput variable
        String userInput = scanner.nextLine();

        // Make empty string to store reversed string...
        System.out.println("\nOriginal Input: " + userInput);

        String reversedString = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversedString += userInput.charAt(i);
        }

        //Display reversed string
        System.out.println("\nReversed String: " + reversedString);
        scanner.close();
    }
}