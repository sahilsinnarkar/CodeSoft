import java.util.*;

class NumberGuessingGame{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;
        int wins = 0;

        while(playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean correctGuess = false;

            System.out.println("Guess any Number between 1 to 100:");
            while(attempts < 10 && !correctGuess){
                System.out.print("Guess number:");
                int input = sc.nextInt();
                attempts++;

                if(input < numberToGuess){
                    System.out.println("Too low, Try again!");
                } else if(input > numberToGuess){
                    System.out.println("Too high, Try again!");
                } else {
                    System.out.println("Wohhooo! You guessed correct number!");
                    correctGuess = true;
                    wins++;
                }
            }
            if(!correctGuess){
                System.out.print("Attempts limit exceeded!");
            }

            System.out.print("Do you want to play again? (yes/no) :");
            playAgain = sc.next().equalsIgnoreCase("yes");

        }

        System.out.println("You have won " + wins + " rounds!");

        sc.close();
    }

}