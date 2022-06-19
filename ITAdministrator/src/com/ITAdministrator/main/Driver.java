package com.ITAdministrator.main;

import java.util.Scanner;

import com.ITAdministrator.model.Employee;
import com.ITAdministrator.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		Employee emp = new Employee("Anil", "Kar");
		CredentialService credentalService = new CredentialService();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		switch (sc.nextLine()) {
		case "1":
			emp.setDepartment("tech");
			break;

		case "2":
			emp.setDepartment("adm");
			break;

		case "3":
			emp.setDepartment("hr");
			break;

		case "4":
			emp.setDepartment("lg");
			break;

		default:
			System.out.println("Please enter valid option");
		}

		emp.setEmailAddress(
				credentalService.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(),
						emp.getDepartment().toLowerCase(), emp.getCOMPANY_NAME().toLowerCase()));

		emp.setPassword(credentalService.generatePassword());

		credentalService.showCredentials(emp.getFirstName(), emp.getEmailAddress(), emp.getPassword());
	}

}
