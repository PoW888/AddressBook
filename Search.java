import java.util.*;
import java.io.*;

public class Search {
	

	static String text, extra;
	static int number;
	static double decimal;
	static Contacts[] contacts = new Contacts[500];

	// static String input_file = "data/temp.txt"; //relative path
	static String input_file = "c:/data/addrbook.csv";

//	public static void main(String[] args) {
//		if (args.length > 0)
//			input_file = args[0]; // if arg0 is provided, take it instead
//
//		System.out.println("Read data from a file... \n");

		try {

			File inputFile = new File(input_file);

			Scanner input = new Scanner(inputFile);

			int row = 1;
			int num = 0;
			while (input.hasNext()) {
				String record = input.nextLine();
				String[] tokens = record.split(",");
				if (tokens.length == 8) {
					String firstname = (tokens[0]);
					String lastname = (tokens[1]);
					String address = (tokens[2]);
					String city = (tokens[3]);
					String state = (tokens[4]);
					String zipcode = (tokens[5]);
					String phone = (tokens[6]);
					String etc = (tokens[7]);

					contacts[num] = new Contacts(firstname, lastname, address,
							city, state, zipcode, phone, etc);
					num++;
				} else {
					System.out.println("Row " + row
							+ " skipped (record not complete)");
				}
				row++;
			}
			input.close();}
		 catch (IOException e) {
			System.out.println(e);
		}

		// Printing Student Array
		for (Contacts p : contacts) {

			if (p != null) {
				System.out.println(p.toString());
			}
		}
	}
}
