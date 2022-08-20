import java.util.Scanner;

public class guessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 1 + (int)(100 * Math.random());
        int Trails = 6;
        int i, guess;

        System.out.println("Number Is In The Range 1-100. You Have 4 Trials To Guess The Number");

        for (i = 0; i < Trails; i++) {
            System.out.println(" ");
            System.out.print("Guess the number:");
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println("Congratulations!! You Guessed The Number.");
                break;
            }
            else if (number > guess  ) {
                System.out.println("The Number Is Higher Than " + guess);
            }
            else if (number < guess ) {
                System.out.println("The Number Is Lower Than " + guess);
            }
        }

        if (i == Trails) {
            System.out.println(" ");
            System.out.println("Better Luck Next Time :(  You have ran out your 4 trials.");
            System.out.println("The Number Was " + number );
        }
    }

}