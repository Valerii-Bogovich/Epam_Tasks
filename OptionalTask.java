package by.java.fundamentals.main;

import java.util.Scanner;

public class OptionalTask {
	
	

	public static void main(String[] args) {
		
//		Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
		
		printTheShortestNumber(new double[] {4.7686, 765, 764367});
		
//		printTheShortestNumber(new double[] {87654.876, 765423, 98});
		
//		Вывести числа в порядке возрастания (убывания) значений их длины.
		
//		printNumbersInAscOrderTheirLength(new double[]{54.0, 654.0, 765.8});
		
//		printNumbersInDescOrderTheirLength(new double[]{54.0, 984.0, 765.8});

	}
	
	
	
	public static void printTheShortestNumber(double[] array) {
		int minLength = Integer.MAX_VALUE;
		double minNumber = 0;
		int length = 0;
		
		for (int i = 0; i < array.length; i++) {
			length = findTheLengthOfNumber(array[i]);
			
			if (length < minLength) {
				minLength = length;
				minNumber = array[i];
			}
		}
		
		System.out.println("Самое короткое число равно " + minNumber + ", его длина равна " + minLength);
		
	}
	
	public static void printTheLongestNumber(double[] array) {
		int maxLength = Integer.MIN_VALUE;
		double maxNumber = 0;
		int length = 0;
		
		for (int i = 0; i < array.length; i++) {
			length = findTheLengthOfNumber(array[i]);
			
			if (length > maxLength) {
				maxLength = length;
				maxNumber = array[i];
			}
		}
		
		System.out.println("Самое длинное число равно " + maxNumber + ", его длина равна " + maxLength);
		
	}
	
	
	public static int findTheLengthOfNumber(double number) {
		int length = 0;
		int intPartOfNumber = (int)number;
		double fractionalPartOfNumber = number - intPartOfNumber;
		
		while(Math.abs(intPartOfNumber) != 0) {
			intPartOfNumber /= 10;
			length++;
		}
		
		while(Math.abs(fractionalPartOfNumber % 10) <= 1) {
			fractionalPartOfNumber *= 10;
			length++;
			
		}
		
		return length;
		
	}
	
	
	public static void printNumbersInAscOrderTheirLength(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			
				if (findTheLengthOfNumber(array[i]) > findTheLengthOfNumber(array[i + 1])) {
					double temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
				
		}
		
		printArray(array);
		
	}
	
	public static void printNumbersInDescOrderTheirLength(double[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			
				if (findTheLengthOfNumber(array[i]) < findTheLengthOfNumber(array[i + 1])) {
					double temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
		}
		
		printArray(array);
		
	}
	
	public static void printArray(double[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
