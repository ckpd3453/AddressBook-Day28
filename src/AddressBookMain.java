import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddressBookMain {

	/**
	 * Procedure:-
	 * ===========
	 * @param args
	 *1. Created a method to read the csv file given
	 *2. called the same method and pssing a file path as an argument
	 */
	public static void main(String[] args) {
		
		readCSVfileUsingScanner("C:\\Users\\SHREEKANT\\Desktop\\CSV&JSON\\CSV_Book1.csv");
		
	}
	
	// Created a method to read the csv file given
	public static void readCSVfileUsingScanner(String filePath) {
		
			try {
				Scanner	scanner = new Scanner(new File(filePath)); //Creating an object of Scanner class to scan a file given
			
			while(scanner.hasNext()) //iterating to print the information given in the file
			{
				System.out.println("User Data: "+ scanner.next().toString());
			}
			scanner.close();
			}
			//Exception Handling as if file not exist
			catch (FileNotFoundException e) {
				System.out.println("File not found...");
			}
		}

}
