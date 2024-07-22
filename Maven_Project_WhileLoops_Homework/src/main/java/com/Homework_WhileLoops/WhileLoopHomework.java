package com.Homework_WhileLoops;

public class WhileLoopHomework {

	public static void main(String[] args) {

		sumAllNumbers();
		printEvenNumbers();
		printOddNumbers();
		prinEvery5thNumber();
		sumOfAllEvenNumbers();
		sumOfAllOddNumbers();
		countDown();
		printAllEvenNumbersInRevers();
		printAllOddNumbersInRevers();
		numbersMultiplyBy3PrintOnlyEven();
		numbersMultiplyBy5PrintOnlyOdd();
		averageOfSumFrom1To100();
		sumOfEvery5thNumberFrom1000();
		factorialOf5();
		printStarsFrom1To10();
	}

	//Write a program that calculates the sum of all numbers from 1 to 1000 using a while loop.
	public static void sumAllNumbers() {
		int number = 1;
		int sum = 0;

		while (number <= 1000) {
			sum += number;
			number++;
		}
		System.out.println("The sum of all numbers from 1 to 1000 is: " + sum);
	}

	//Write a program to print all even numbers from 1 to 50 using a while loop.
	public static void printEvenNumbers() {
		int i = 1;

		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println();
	}

	//Write a program to print all odd numbers from 1 to 20 using a while loop.
	public static void prinEvery5thNumber() {
		int i = 5;

		while (i <= 100) {
			
			System.out.print(i + " ");
			
			i += 5;
		}

		System.out.println();
	}
	
	//Write a program to print every 5th number
	public static void printOddNumbers() {
		int i = 1;

		while (i <= 21) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.println();
	}

	//Write a program to print the sum of all even numbers from 1 to 100 using a while loop.
	public static void sumOfAllEvenNumbers() {
		int number = 1;
		int sum = 0;

		while (number <= 100) {
			if (number % 2 == 0) {
				sum += number;
			}

			number++;
		}

		System.out.println("The sum of all even numbers is: " + sum);
	}

	//Write a program to print the sum of all odd numbers from 1 to 100 using a while loop.
	public static void sumOfAllOddNumbers() {
		int number = 1;
		int sum = 0;

		while (number <= 100) {
			if (number % 2 != 0) {
				sum += number;
			}

			number++;
		}

		System.out.println("The sum of all odd numbers is: " + sum);
	}

	//Write a program to print all numbers from 0 to 10 in reverse.
	public static void countDown() {
		int i = 10;

		while (i >= 0) {
			System.out.print(i + " ");
			i--;
		}

		System.out.println();
	}

	//Write a program to print all even numbers from 0 to 100 in reverse.
	public static void printAllEvenNumbersInRevers() {
		int i = 10;

		while (i >= 0) {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i--;
		}

		System.out.println();
	}
	
	//Write a program to print all odd numbers from 0 to 100 in reverse.
	public static void printAllOddNumbersInRevers() {
		int i = 10;

		while (i >= 0) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i--;
		}

		System.out.println();
	}

	//Write a program to print all even numbers from 1 to 10 multiply by 3.
	public static void numbersMultiplyBy3PrintOnlyEven() {
		int number = 1;

		while (number <= 10) {

			if (number * 3 % 2 == 0) {
				System.out.print(number * 3 + " ");
			}

			number++;
		}

		System.out.println();
	}
	
	//Write a program to print all odd numbers from 1 to 10 multiply by 5.
	public static void numbersMultiplyBy5PrintOnlyOdd() {
		int number = 1;

		while (number <= 10) {

			if (number * 3 % 2 != 0) {
				System.out.print(number * 5 + " ");
			}

			number++;
		}

		System.out.println();
	}
	
	//Write a program that calculates the sum of all numbers from 1 to 100 using a while loop and the average of it.
	public static void averageOfSumFrom1To100() {
		int number = 1;
		int sum = 0;

		while (number <= 100) {
			sum += number;
			number++;
		}
		
		int average = sum / 2;
		
		System.out.println("The sum of all numbers from 1 to 100 is: " + sum);
		System.out.println("The average number of the sum of all numbers from 1 to 100 is: " + average);
	}
	
	//Write a program what calculates the sum of every 5th number from 1000.
	public static void sumOfEvery5thNumberFrom1000() {
		int i = 5;
		int sum = 0;
		
		while (i <= 1000) {
			sum += i;
			i += 5;
		}
		
		System.out.println(sum);
	}
	
	//Write a program to print factorial of 5.
	public static void factorialOf5() {
		int num = 10; 
		int i = 1;
        int factorial = 1;
        
        while(i <= num) {
            factorial *= i;
            i++;
        }
        
        System.out.printf("Factorial of 5 is: "+ factorial);
        System.out.println();
	}

	//Write a program to print stars from 1 to 10.
	public static void printStarsFrom1To10() {
		int rows = 10;
		int i = 1;

		while (i <= rows) {
			int j = 1;

			while (j <= i) {
				System.out.print("*");
				j++;
			}

			System.out.println();
			i++;
		}
	}
}
