import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import com.google.gson.Gson;
public class CSVPerson15 {
	/*
	 * created method to to read csv file
	 */
	public static void readCSVfileUsingScanner(String filePath) {
		/*
		 * try catch block to check file exists or not
		 */
		try {
			/*
			 * Scanning the file path
			 */
			Scanner sc = new Scanner(new File(filePath));

			/*
			 * creating a loop to pop out every string values
			 */
			while (sc.hasNext()) {
				String line = sc.next().toString();
				//System.out.println("User data  :" + line);
				
				String[] userData = line.split(",");
				User user = new User(userData[0],userData[1],userData[2],userData[3],userData[4],userData[5],userData[6],userData[7]);
				System.out.println("User json: "+ new Gson().toJson(user));
			}
			sc.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	/*
	 * created method to write in csv file
	 */
	public static void writeCSVfileUsingScanner() {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\SHREEKANT\\Desktop\\CSV&JSON\\Book3.csv");

		/*
		 * try catch block to check file exists or not
		 */
		try {
			/*
			 * creation object of file writer
			 */
			FileWriter fileWriter = new FileWriter(file);

			/*
			 * creating object of print writer
			 */
			PrintWriter printWriter = new PrintWriter(fileWriter);

			System.out.println("Enter the First name :");
			String a = sc.nextLine();
			System.out.println("Enter the Last name :");
			String b = sc.nextLine();
			System.out.println("Enter the Address :");
			String c = sc.nextLine();
			System.out.println("Enter the city :");
			String d = sc.nextLine();
			System.out.println("Enter the state :");
			String e = sc.nextLine();
			System.out.println("Enter the zipCode :");
			String f = sc.nextLine();
			System.out.println("Enter the phoneNumber :");
			String g = sc.nextLine();
			System.out.println("Enter the emailID :");
			String h = sc.nextLine();

			printWriter.print(a);

			printWriter.print(b);

			printWriter.print(c);

			printWriter.print(d);

			printWriter.print(e);

			printWriter.print(f);
			printWriter.print(g);

			printWriter.print(h);

			printWriter.close();

		} catch (IOException e) {

		}
		sc.close();

	}

	public static void main(String[] args) {

		/*
		 * Switch Cases to make a choice for user
		 */
		while (true) {
			System.out.println("Enter \n 1. Read csv file \n2.Write csv file \n0.exit");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {

			/*
			 * calling Static method to read and write
			 */
			case 1:
				readCSVfileUsingScanner("C:\\Users\\SHREEKANT\\Desktop\\CSV&JSON\\CSV_Book1.csv");

				break;
			case 2:
				writeCSVfileUsingScanner();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the wrong input");
			}
			sc.close();
		}

	}
}
