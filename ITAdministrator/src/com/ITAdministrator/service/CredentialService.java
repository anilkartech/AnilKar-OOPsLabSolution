package com.ITAdministrator.service;

import java.util.Random;

public class CredentialService {
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$*+=-";
		String numbers = "1234567890";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password = new char[8];
		password[0] = smallLetters.charAt(random.nextInt(smallLetters.length()));
		password[1] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));
		for (int i = 4; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department, String Company) {
		StringBuffer sb = new StringBuffer();
		sb.append(firstName);
		sb.append(lastName);
		sb.append("@");
		sb.append(department);
		sb.append(".");
		sb.append(Company);
		sb.append(".com");
		return sb.toString();
	}

	public void showCredentials(String firstName, String email, char[] password) {
		System.out.println("Dear " + firstName + "  your generated credentials are as follows");
		System.out.println("Email ---> " + email);
		System.out.print("Password ---> ");
		System.out.println(password);
	}
}
