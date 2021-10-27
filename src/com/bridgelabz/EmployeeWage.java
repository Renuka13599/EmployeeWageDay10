package com.bridgelabz;
import java.util.random;

public class EmployeeWage {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;

    public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHourPerMonth){
        int empHrs=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        //computation

        while (totalEmpHrs<= maxHourPerMonth  && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck =(int) Math.floor(Math.random() * 10 ) % 3 ;
            switch (empCheck) {
                case  IS_PART_TIME:
                    empHrs =4;
                    break;
                case IS_FULL_TIME:
                    empHrs =8;
                    break;
                default:
                    empHrs =0;

            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:" + totalWorkingDays + " Emp Hr:" +empHrs);
        }
        int totalEmpWage = totalEmpHrs *EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage:" + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage("Infosys",30,10,20);
        computeEmpWage("DXC",32,25,10)
    }
}























