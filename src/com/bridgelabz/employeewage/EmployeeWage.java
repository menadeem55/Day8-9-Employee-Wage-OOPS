package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	/*
	 * Calculate Wages till a condition of total working hours or days is reached
	 */
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program");

		Random random = new Random(); // random object
		// input
		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;
		int monthlysalary = 0;
		int days = 0;
		int monthlyHours = 0;

		/*
		 * for a month assuming 100 hours and 20day will give 0,1,2 random number
		 */
		while (days != 20 && monthlyHours != 100) {
			days++;
			int randomNum = random.nextInt(3);

			/*
			 * By using Switch case statement Calculate and getting this salary
			 */
			switch (randomNum) {

			case 0:
				// System.out.println("Employee is Absent");
				// System.out.println("Monthly Salary will be: ");
				break;
			case 1:
				// System.out.println("Employee is Present for Full Day");
				System.out.println("Monthly salary for Full Day: ");
				salary = wagePerHour * fullDayHours;
				break;
			case 2:
				// System.out.println("Employee is Present for Half Day");
				System.out.println("Monthly Salary for Half Day: ");
				salary = wagePerHour * halfDayHours;
				break;

			}
			monthlysalary = monthlysalary + salary;
			System.out.println("Day" + days + " Salary is: " + salary); // print days and with salary base

		}
		System.out.println("Monthly Salary: " + monthlysalary); // Print the total of monthly salary

	}

}