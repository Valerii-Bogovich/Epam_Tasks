package by.java.fundamentals.main;

import java.util.Scanner;

public class MainTask {
	@SuppressWarnings("resource")
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Приветствовать любого пользователя при вводе его имени через командную строку.

		print(greetUser(args));
		
		// Отобразить в окне консоли аргументы командной строки в обратном порядке.
		
		print(displayComLineArgsInReverseOrder(args));
		
		// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
		
		printRandomNumbersWithNewLine();
		
		printRandomNumbersWithoutNewLine();
		
		/*Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и 
		вывести результат на консоль  */
		
		print(CountTheSum(enterIntegersAsCommandLineArguments(args)));
		
		print(CountTheComposition(enterIntegersAsCommandLineArguments(args)));
		
		
		/*Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. 
		Осуществить проверку корректности ввода чисел.  */
		
		enterTheNumFrom1to12AndDetirmMonth();
		
		}
	
	
	public static String greetUser(String[] args) {
		
		return "Здравствуйте, " + args[0];
	}
	
	public static String displayComLineArgsInReverseOrder(String[] args) {
		String text = null;
		
		for (int i = args.length - 1; i >= 0; i--) {
			text += args[i];
		}
		
		return text;
	}
	
	public static void printRandomNumbersWithNewLine() {
		int quantity = enterNumberFromConsole();
		for (int i = 1; i <= quantity; i++) {
			double number = Math.random() * 100;
			System.out.format("%.0f\t", number);
		}
	}
	
	
	public static int enterNumberFromConsole() {
		System.out.println("Введите целое положительное число");
		
		while(!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Число должно быть целым и положительным. Введите ещё раз.");
		}
		
		return scanner.nextInt();
	}
	
	public static void printRandomNumbersWithoutNewLine() {
		int quantity = enterNumberFromConsole();;
		
		for (int i = 1; i <= quantity; i++) {
			double number = Math.random() * 100;
			System.out.format("%.0f\t", number);
		}
	}
	
	public static int[] enterIntegersAsCommandLineArguments(String[] args){
		int[] array = new int[args.length];
		
		for (int i = 0; i < array.length; i++) {
			int number = Integer.parseInt(args[i]);
			while(number < 0) {
				System.out.println(i + "-е число должно быть положительным. Введите ещё раз.");
				number = enterIntegerAsCommandLineArguments(args);
			}
			array[i] = number;
			
		}
		
		return array;
	}
	
	public static int enterIntegerAsCommandLineArguments(String[] args) {
		int number = Integer.parseInt(args[0]);
		while (number < 0) {
			System.out.println("Число должно быть положительным. Введите ещё раз.");
			number = enterIntegerAsCommandLineArguments(args);
		}
		
		return number;
	}
	
	public static int CountTheSum(int[] array) {
		System.out.print("Сумма введённых чисел равна : ");
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	public static int CountTheComposition(int[] array) {
		System.out.print("Произведение введённых чисел равна : ");
		int composition = 1;
		for (int i = 0; i < array.length; i++) {
			composition *= array[i];
		}
		return composition;
	}
	
	public static void enterTheNumFrom1to12AndDetirmMonth() {
		System.out.println("Введите число от 1 до 12");
		
		int number = scanner.nextInt();
		while(number < 1 || number > 12) {
			System.out.println("Число должно быть от 1 до 12. Введите ещё раз");
		}
		
		
		switch(number) {
		
			case 1 :
				System.out.println("Январь");
				break;
			case 2 :
				System.out.println("Февраль");
				break;
			case 3 :
				System.out.println("Март");
				break;
			case 4 :
				System.out.println("Апрель");
				break;
			case 5 :
				System.out.println("Май");
				break;
			case 6 :
				System.out.println("Июнь");
				break;
			case 7 :
				System.out.println("Июль");
				break;
			case 8 :
				System.out.println("Август");
				break;
			case 9 :
				System.out.println("Сентябрь");
				break;
			case 10 :
				System.out.println("Октябрь");
				break;
			case 11 :
				System.out.println("Ноябрь");
				break;
			case 12 :
				System.out.println("Декабрь");
				break;
						
		}
	}
		
	public static void print(String text) {
		System.out.println(text);
	}
	
	public static void print(int number) {
		System.out.println(number);
	}
	
}
