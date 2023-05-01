import java.util.Scanner;

public class NumberGuessing {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numberGuess = (int) (Math.random() * 100) + 1;
        int guess;
        int numGuesses = 0;
        boolean guessedCorrectly = false;
        
        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numGuesses++;
            
            if (guess == numberGuess) {
                guessedCorrectly = true;
            } else if (guess < numberGuess) {
                System.out.println("Too lower, try again.");
            } else {
                System.out.println("Too higher, try again.");
            }
        }
        
        System.out.println("You guessed the number in " + numGuesses + " guesses.");
        scanner.close();
    }
}


