package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

	/*
	 * compute Employee Wage for multiple companies
	 */

	public static int fullDayHours = 8;
	public static int halfDayHours = 4;

	private final String companyName;
	private final int WagePerHour;
	private final int workingHours;
	private final int workingDays;

	static Random random = new Random(); // create an object

	public EmployeeWage(String companyName, int wagePerHour, int workingHours, int workingDays) {
		this.companyName = companyName;
		this.WagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.workingHours = workingHours;

	}

	public int calculateWage() {
		int salary = 0;
		int totalSalary = 0;
		int totalWorkingHours = 0;
		int days = 0;

		while (totalWorkingHours <= workingHours && days <= workingDays) {
			days++;
			int empCheck = random.nextInt(3); // give 0,1,2 numbers

			/*
			 * By using switch case for empCheck Calculating of salary and total working
			 * hours
			 */
			switch (empCheck) {
			case 1:

				System.out.println("Present Fullday.");
				salary = WagePerHour * fullDayHours;
				totalWorkingHours = totalWorkingHours + fullDayHours;
				break;
			case 2:

				System.out.println("Present HalfDay.");
				salary = WagePerHour * halfDayHours;
				totalWorkingHours = totalWorkingHours + halfDayHours;
				break;
			default:
				System.out.println("Employee Absent"); // printed
			}
			/*
			 * if we have to print days show the working hours and to getting of salary
			 */
			System.out.print("Day: " + days + empCheck + " ");
			System.out.print("Working Hours: " + totalWorkingHours + " ");
			System.out.print("Salary is: " + salary + " ");
			totalSalary = totalSalary + salary;
		}
		return totalWorkingHours * WagePerHour;

	}

	// main method
	public static void main(String[] args) {
		/*
		 * it create employeeWage object and add to company names print the total
		 * employee wage company
		 */
		EmployeeWage TCS = new EmployeeWage("TCS", 23, 90, 21);
		EmployeeWage Honda = new EmployeeWage("Honda", 24, 109, 22);

		System.out.println("Total employee's wage of Company: " + TCS.companyName + ": " + TCS.calculateWage());
		System.out.println("Total employee's wage of Company: " + Honda.companyName + ": " + Honda.calculateWage());

	}
}