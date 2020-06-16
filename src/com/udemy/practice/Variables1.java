package com.udemy.practice;

import java.math.BigDecimal;

import javax.sound.midi.Soundbank;

public class Variables1 {
	public static void main(String[] args) {
		System.out.printf("byte minimum = %s, maximum = %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("short minimum = %s, maximum = %s%n", Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("int minimum = %s, maximum = %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("long minimum = %s, maximum = %s%n", Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.printf("float minimum = %s, maximum = %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("double minimum = %s, maximum = %s%n", Double.MIN_VALUE, Double.MAX_VALUE);
		
		float f = 123.456789012345678f;
		double d = 123.456789012345678;
		System.out.printf("f is %.99f %n", f);
		System.out.printf("d is %.99f %n", d);
		System.out.println("f is " + f);
		System.out.println("d is " + d);
		
		BigDecimal z = new BigDecimal("123.45678901234567890123456789012345678");
		System.out.printf("z is %.99f %n", z);
		
	}

}
