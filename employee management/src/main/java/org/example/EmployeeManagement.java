package org.example;
import java.util.*;
public class EmployeeManagement {
    public static void main(String[] args) {
//        String dstring="02-03-2022";
//        SimpleDateFormat ss=new SimpleDateFormat("dd-mm-yyyy");
//
//        Date dob= ss.parse()
        Scanner sc= new Scanner(System.in);



        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        Employee employee = new Employee();

        EmployeeAttendance att=new EmployeeAttendance();


        System.out.println("enter operation1.insert2.update3.retrive 4.insert empattendance sal5.getsalarydetails");
        int operation=sc.nextInt();
        switch(operation) {
            case 1:
                Scanner sc1=new Scanner(System.in);
                System.out.println("enter employee id:");
                String empId=sc1.nextLine();
                employee.setEmpId(empId);
                System.out.println("enter employee name:");
                String EmpName=sc1.nextLine();
                employee.setEmpId(EmpName);
                System.out.println("enter employee dob");
                String empdob=sc1.nextLine();
                employee.setEmpdob(empdob);
                ems.insertEmployee(empId, EmpName,empdob);
                break;

            case 2:
                Scanner sc2=new Scanner(System.in);
                System.out.println("enter employee id:");
                String empu=sc2.nextLine();
                System.out.println("enter employee name:");
                String uname=sc2.nextLine();
                ems.updateEmployee(empu,uname);
                break;
            case 3:
                Scanner sc3=new Scanner(System.in);
                System.out.println("enter empid:");
                String empid=sc3.nextLine();
                ems.getEmployeeById(empid);
                break;
            case 4:
                Scanner sc4=new Scanner(System.in);

                System.out.println("enter employeeid:");
                String empidd=sc4.nextLine();
                System.out.println("enter status of days:");
                String status=sc4.nextLine();
                att.setEmpId(empidd);
                att.setDaysPresent(status);
                ems.insertEmployeeAttendance(att.getEmpId(),att.getDaysPresent());
                break;
            case 5:
                Scanner sc5=new Scanner(System.in);
                System.out.println("enter employeeid:");
                String employ=sc5.nextLine();
                ems.getEmployeesalarydetails(employ);
                break;
        }












        // Retrieve an employee by ID and update their information


        // Create EmployeeAttendance objects and insert them into the database

        // Calculate pay details and generate payslips

        // Display the final list of employees and their pay details
    }
}