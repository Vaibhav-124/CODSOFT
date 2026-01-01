import java.util.Random;
import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;

        for (int round = 1; round <= 10; round++) {

            int number = random.nextInt(100) + 1;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("\nRound " + round);
            System.out.println("Guess the number between 1 and 100");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {

                System.out.print("Attempt " + attempt + ": ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct!");
                    guessed = true;
                    score++;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guessed) {
                System.out.println("You lost! Number was: " + number);
            }

            System.out.println("Score: " + score);

            System.out.print("Play again? (y/n): ");
            char choice = sc.next().charAt(0);

            if (choice != 'y' && choice != 'Y') {
                break;
            }
        }

        System.out.println("\nGame Over. Final Score: " + score);
        sc.close();
    }
}
