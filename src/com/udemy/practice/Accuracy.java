package com.udemy.practice;

import java.math.BigDecimal;

public class Accuracy {
	
	public static void main(String[] args) {
		
//		double result1 = 0.1 * 7;
//		double result2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
//
//		System.out.printf("result1 is %.99f %n", result1);
//		System.out.printf("result2 is %.99f %n", result2);
//		
//		double difference = result1 - result2;
//		System.out.printf("The difference is %.99f %n", difference);

		BigDecimal oneTenth = BigDecimal.valueOf(0.1);
		
		BigDecimal result1 = oneTenth.multiply(BigDecimal.valueOf(7));
		BigDecimal result2 = oneTenth.add(oneTenth
				.add(oneTenth)
				.add(oneTenth)
				.add(oneTenth)
				.add(oneTenth)
				.add(oneTenth));
		BigDecimal difference = result1.subtract(result2);
		System.out.printf("The difference is %.99f %n", difference);
		
		int apples = 18;
		int oranges = 9;
		
		System.out.println(apples == oranges);
		System.out.println(apples != oranges);
		
		System.out.printf("%d > %d is %s %n", apples, oranges, apples > oranges);
		System.out.printf("%d < %d is %s %n", apples, oranges, apples < oranges);
		System.out.printf("%d >= %d is %s %n", apples, oranges, apples >= oranges);
		System.out.printf("%d <= %d is %s %n", apples, oranges, apples <= oranges);
	}
}
