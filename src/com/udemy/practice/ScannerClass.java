package com.udemy.practice;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose one of the following options");
		System.out.println("1 - Cappucino");
		System.out.println("2 - Latte");
		System.out.println("3 - Americano");
		System.out.println("4 - Mocha");
		System.out.println("5 - Macchiato");
		System.out.println("6 - Espresso");
		System.out.println("8 - Quit the program");

		String userChoice = scanner.nextLine();
		System.out.println("You chose " + userChoice);

		scanner.close();
	}

}
