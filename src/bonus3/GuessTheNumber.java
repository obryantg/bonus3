package bonus3;

import java.util.*;


public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		int guess = 0;
		int attempts = 0;
		String reply = "yes";
		
		
		
			

		while(reply.equalsIgnoreCase("yes")) {
			int answer = rdm.nextInt(100) + 1;
			//System.out.println(answer);
			// left previous code to validate random number
			
			while (answer != guess){
				System.out.println("Guess a number from 1 to 100:");
				attempts++;
				guess = sc.nextInt();
			

			reply = getGuess(sc, guess, attempts, reply, answer);
	

			}
		
		}sc.close();
		
		
		
		}

	private static String getGuess(Scanner sc, int guess, int attempts, String reply, int answer) {
		/*this is my method. uses if conditions through the process of filtering different answers
		for each guess.
		*/
		if (answer == guess) {
			System.out.println("Good job! The number was " + answer);
			System.out.println("It only took you " + attempts + " attempts");
			System.out.println("Try again? yes or no: ");
			reply = sc.next();
		} else if (Math.abs(answer - guess) <= 5) {
			System.out.println("Wow almost there..try again.");
		} else if (Math.abs(answer - guess) > 10) {
			System.out.println("You're bad at this. Try again silly.");
		} else if (Math.abs(answer - guess) <= 10) {
			System.out.println("Number is close! Try again.");
		}
		return reply;
	}

}



	
		




