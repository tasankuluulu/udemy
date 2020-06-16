package com.udemy.practice;

import java.util.Scanner;
import java.util.Random;

public class Variables {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int firstNumber = 2;
		int secondNumber = 5;
		int $class = 8;
		int substraction = 7;
		int answer;
		String promt = ". Don't type in the answer, just press ENTER";
		
		System.out.println("Think about the number between 1 and 10" + promt);
		scanner.nextLine();
		System.out.println("Multiply your number by " + firstNumber + promt);
		scanner.nextLine();
		System.out.println("Now multiply the result by " + secondNumber + promt);
		scanner.nextLine();
		System.out.println("Divide the result by the number you orginally thought of" + promt);
		scanner.nextLine();
		System.out.println("Now substract " + substraction + promt);
		scanner.nextLine();
		
		answer = firstNumber * secondNumber - substraction;
		System.out.println("The answer is " + answer);
		
		
		scanner.close();
		
		
	}

}
