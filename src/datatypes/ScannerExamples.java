package datatypes;

import java.util.Scanner;

public class ScannerExamples {
	public static void main(String [] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.print("Enter your name"); // Print will not go to the next line unlike println
		String name = scanner.nextLine();
		System.out.print("Thanks," + name);
		
		System.out.println( "How many cats do you have?");
		int numCats = scanner.nextInt();
		System.out.print("wow, you have " + numCats + " "
				+ "cats!");
		
	
		scanner.close();
     }
}