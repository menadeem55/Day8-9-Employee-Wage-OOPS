package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	/*
	 * Calculating Wages for a Month by assuming 20 working day per month
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
		int workingDaysPerMonth = 20;

		/*
		 * using a loop to ask how many salary in working day per monthly will give
		 * 0,1,2 random number
		 */
		for (int i = 1; i <= workingDaysPerMonth; i++) {
			int randomNum = random.nextInt(3);

			/*
			 * By using Switch case statement Calculate and getting this salary Getting this
			 * salary employee Present and Absent and print salary
			 */
			switch (randomNum) {

			case 0:
				System.out.println("Employee is Absent");
				System.out.println("Monthly Salary will be: ");
				break;
			case 1:
				System.out.println("Employee is Present");
				System.out.println("Monthly salary for Full Day: ");
				salary = wagePerHour * fullDayHours;
				break;
			case 2:
				System.out.println("Employee is Present");
				System.out.println("Monthly Salary for Half Day: ");
				salary = wagePerHour * halfDayHours;
				break;

			}
			monthlysalary = monthlysalary + salary;
			System.out.println(+salary);

		}
		System.out.println("Monthly Salary: " + monthlysalary); // Print the total of monthly salary

	}

}