package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	/*
	 * Refactor the Code to write a Class Method to Compute Employee Wage
	 */

	public static int wagePerHour = 20;
	public static int fullDayHours = 8;
	public static int halfDayHours = 4;
	public static int salary = 0;
	public static int monthlysalary = 0;
	public static int workingDaysPerMonth = 20;
	public static int days = 0;
	public static int monthlyHours = 0;

	public static int EmpWage() {
		System.out.println("Welcome to Employee Wage Computation Program");
		Random random = new Random(); // create object

		/*
		 * for a month assuming 100 hours and 20day will give 0,1,2 random number
		 */
		while (days != 20 && monthlyHours != 100) { // condition till working hours reaches for month
			days++;
			int randomNum = random.nextInt(3);

			/*
			 * By using Switch case statement Calculate and getting this salary
			 */
			switch (randomNum) {

			case 0:
				// System.out.println("Employee is Absent");
				break;
			case 1:
				System.out.println("Monthly salary for Full Day: ");
				salary = wagePerHour * fullDayHours;
				break;
			case 2:
				System.out.println("Monthly Salary for Half Day: ");
				salary = wagePerHour * halfDayHours;

			}
			monthlysalary = monthlysalary + salary;
			System.out.println("Day" + days + " Salary is: " + salary); // print days and with salary base

		}
		System.out.println("Monthly Salary: " + monthlysalary); // Print the total of monthly salary
		return monthlysalary;

	}

	public static void main(String[] args) {
		EmpWage();
	}

}