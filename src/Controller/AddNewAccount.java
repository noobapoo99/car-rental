package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import src.Model.Client;
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
		while (!password.equals(confirmPassword)) {
			System.out.println("Password doesn't match");
			System.out.println("Enter Password:");
			password = s.next();
			System.out.println("Confirm Password:");
			confirmPassword = s.next();
		}
		int accType = 1;
		try {
			
			ResultSet rs = database.getStatement().executeQuery("SELECT COUNT(*) FROM `users`;");
			rs.next();
			int ID = rs.getInt("COUNT(*)");
			
			String insert = "INSERT INTO `users`(`ID`, `FirstName`, `LastName`,"
					+ " `Email`, `PhoneNumber`, `Password`, `Type`) VALUES"
					+ " ('"+ID+"','"+firstName+"','"+lastName+"','"+email+"',"
							+ "'"+phoneNumber+"','"+password+"','"+accType+"');";
			database.getStatement().execute(insert);
			System.out.println("Account created successfully\n");

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
