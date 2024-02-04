import java.util.Scanner;
public class MadnessWithMethod {
    public static void main(String[] args) {
    //obtain 2 integers from user
        int value2 = getAnIntFromTheUser();
        int value3 = getAnIntFromTheUser();
    //compare the two integers and calculate sum
        int highestInteger = compareTwoInts(value2, value3);
        int sumOfNum = sumTwoInts(value2, value3);
    //print result
        System.out.println("\n" + "The largest of the two numbers entered is: " + highestInteger);
        System.out.println("\n" + "The sum of both two numbers entered is: " + sumOfNum);

    }
    // Method to obtain an integer from the user
    public static int getAnIntFromTheUser() {
        Scanner learner = new Scanner(System.in);
        System.out.println("\n" + "Enter a number here: "); // Prompt user for input
        int value = learner.nextInt(); // Read an integer from the user
        return value;
    }
    //Method to compare two integers and return the larger one
    public static int compareTwoInts(int value2, int value3) {
        if (value2 > value3) {
            return value2; // Return value2 if it's greater
        } else {
            return value3; // Return value3 if it's greater or equal
        }
    }
//Method to calculate and return the sum of two integers
    public static int sumTwoInts(int value2, int value3) {
        return value2 + value3;
    }
}