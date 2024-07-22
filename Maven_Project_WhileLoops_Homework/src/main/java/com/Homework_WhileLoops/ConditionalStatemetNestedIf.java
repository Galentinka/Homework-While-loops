package com.Homework_WhileLoops;

public class ConditionalStatemetNestedIf {

	public static void main(String[] args) {
		
		determineLeapYearNestedIf();

	}
	
	public static void determineLeapYearNestedIf() {

		int year1 = 1900;
		int year2 = 1996;

		if (year1 % 400 == 0) {
			if (year1 % 4 == 0) {
				if (year1 % 100 != 0) {
					System.out.println("Year1 is a leap year : " + year1);
				}
			}
		} else {
			System.out.println("Year1 is NOT a leap year : " + year1);
		}

		if (year2 % 400 == 0) {
			if (year2 % 4 == 0) {
				if (year2 % 100 != 0) {
					System.out.println("Year2 is a leap year : " + year2);
				}
			}
		} else {
			System.out.println("Year2 is NOT a leap year : " + year2);
		}

	}


}
