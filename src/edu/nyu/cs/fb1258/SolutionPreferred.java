package edu.nyu.cs.fb1258;
import java.util.Scanner;

/**
 * Illustration of one way to work around Scanner's idiocy by always inputting a String and then converting to other data types as needed.
 */
public class SolutionPreferred {
    public static void main(String[] args) throws Exception {
			Scanner scnr = new Scanner(System.in);

			// get user's age
			System.out.println("Please enter your age: "); 
			String age = scnr.nextLine(); // a String... avoid nextInt() and nextDouble!
			int ageAsInt = Integer.parseInt(age); // and for doubles use Double.parseDouble(age)

			// get user's name
			System.out.println("Please enter your name: "); 
			String name = scnr.nextLine(); // a String

			// print out a friendly welcome message
			System.out.println("Welcome, " +  name + "! You are " + ageAsInt/7 + " years old in dog years!");
			scnr.close();
    }
    
}
