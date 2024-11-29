package Controller;

import java.util.Scanner;

import src.Model.Database;
import src.Model.Operation;
import src.Model.User;

public class AddNewAccount implements Operation {
	
	@Override
	public void operation(Database database, Scanner s,User user){
		System.out.println("Enter First Name:");
		String firstName = s.next();
		System.out.println("Enter Last Name:");
		String lastName = s.next();
		System.out.println("Enter Email:");
		String email = s.next();
		System.out.println("Enter Phone Number:");
		String phoneNumber = s.next();
		System.out.println("Enter Password:");
		String password = s.next();
		System.out.println("Confirm Password:");
		String confirmPassword = s.next();
	}
	
}
