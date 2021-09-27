package com.yml.employeepayroll;

import java.io.PrintWriter;
import java.util.Scanner;

public class EmployeePayrollMain {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out,true);

        out.println("Enter Employee ID: ");
        int id = in.nextInt();
        in.nextLine();
        out.println("Enter Employee Name: ");
        String name = in.nextLine();
        out.println("Enter Employee Salary: ");
        double salary = in.nextDouble();
        EmployeePayroll payroll = new EmployeePayroll(id, name, salary);

        out.println("Entered Data: ");
        out.println("Employee ID : "+ payroll.getId());
        out.println("Employee Name : "+ payroll.getName());
        out.println("Employee Salary : " + payroll.getSalary());

        out.close();
        in.close();
    }
}
