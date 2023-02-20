package edu.nyu.cs.fb1258;
import java.util.Scanner;

/**
 * Illustration of Scanner's idiocy when inputting any type besides a String.
 * How any popular language can lack ability to retrieve a simple integer input in a sensible way may be baffling to some.
 */
public class TheProblem {
    public static void main(String[] args) throws Exception {
			Scanner scnr = new Scanner(System.in);

			// get user's age
			System.out.println("Please enter your age: "); 
			int ageAsInt = scnr.nextInt(); // an int

			// get user's name
			System.out.println("Please enter your name: "); 
			String name = scnr.nextLine(); // a String

			// print out a friendly welcome message
			System.out.println("Welcome, " +  name + "! You are " + ageAsInt/7 + " years old in dog years!");
			scnr.close();
    }
}
