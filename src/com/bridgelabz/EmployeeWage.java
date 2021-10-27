package com.bridgelabz;

public class EmployeeWage {
    public static double IS_FULL_TIME = 2;
    public static double IS_PART_TIME = 1;
   public static double EMP_WAGE_PER_HR = 20;

    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        //Computation
        double empCheck = Math.floor(Math.Random() * 10) % 3;
        if (empCheck == IS_PART_TIME)
            empHrs = 4;
        else if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Emp Wage:" + empWage);
    }
}





