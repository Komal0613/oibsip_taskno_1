package com.task1.oasis;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userAnswer = 0;
        int count = 1;

        while (userAnswer != computerNumber)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));
            count++;
        }  
    }

    public static String determineGuess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
/*public class NumberGuesssingGame{
		public static void main(String arg[]) {

			// Function Call
			guessingNumberGame();
		}

	// Function that implements the
	// number guessing game
	public static void guessingNumberGame() {
		Scanner sc = new Scanner(System.in);

		// Generate the numbers
		int number = 1 + (int) (100 * Math.random());

		// Given K trials
		int K = 5;

		int i, guess;

		System.out.println("A number is chosen between 1 to 100, Guess the number" + 
		" within 5 trials.");

		// Iterate over K Trials
		for (i = 0; i < K; i++) {

			System.out.println("Guess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println("Congratulations! You guessed the number.");
				break;
			} else if (number > guess && i != K - 1) {
				System.out.println("The number is greater than " + guess);
			} else if (number < guess && i != K - 1) {
				System.out.println("The number is less than " + guess);
			}
		}

		if (i == K) {
			System.out.println("You have exhausted " +K+ " trials.");

			System.out.println("The number was " + number);
		}
	}*/


