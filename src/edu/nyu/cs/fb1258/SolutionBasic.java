package edu.nyu.cs.fb1258;
import java.util.Scanner;

/**
 * Illustration of one way to work around Scanner's idiocy by adding a useless call to nextLine() just to get rid fo the line break that the user typed after entering an interger.
 * It's not nice to have to write code that seems so useless.
 */
public class SolutionBasic {
    public static void main(String[] args) throws Exception {
			Scanner scnr = new Scanner(System.in);

			// get user's age
			System.out.println("Please enter your age: "); 
			int ageAsInt = scnr.nextInt(); // an int
			scnr.nextLine(); // a useless call just to get rid of the line break character from the input buffer

			// get user's name
			System.out.println("Please enter your name: "); 
			String name = scnr.nextLine(); // a String

			// print out a friendly welcome message
			System.out.println("Welcome, " +  name + "! You are " + ageAsInt/7 + " years old in dog years!");
			scnr.close();
    }
    
}
