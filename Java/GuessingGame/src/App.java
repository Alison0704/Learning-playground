import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int guess = (low + high) / 2;
        System.out.println("Think of a number between 1 and 100 and I'll try to guess it!");
        while (true) {
            System.out.println("Is your number " + guess + "?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("I guessed it! Your number is " + guess);
                break;
            } else if (answer.equalsIgnoreCase("higher")) {
                low = guess + 1;
                guess = (low + high) / 2;
            } else if (answer.equalsIgnoreCase("lower")) {
                high = guess - 1;
                guess = (low + high) / 2;
            } else {
                System.out.println("Invalid input. Please answer 'yes', 'higher', or 'lower'.");
            }
        }
    }
}
