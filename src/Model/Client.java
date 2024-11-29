package src.Model;

import java.util.Scanner;

public class Client extends User {
	
	
	
	public Client() {
		super();
	}

	@Override
	public void showList(Database database, Scanner s) {
		System.out.println("\n1. View Cars");
		System.out.println("2. Rent Car");
		System.out.println("3. Return Car");
		System.out.println("4. Show My Rents");
		System.out.println("5. Edit My Data");
		System.out.println("6. Change Password");
		System.out.println("7. Quit\n");
		
		int i = s.nextInt();
		if (i<1 || i>7) {
			showList(database, s);
			return;
		}
		operations[i-1].operation(database, s, this);
		if (i!=7) showList(database, s);
	}
	
}
