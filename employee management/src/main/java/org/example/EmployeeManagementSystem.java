package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeManagementSystem {
    // Database connection and operations
    // - Implement methods to insert, update, and retrieve employee data
    // - Implement methods to insert and retrieve attendance data
    // - Implement methods to calculate pay details

    public void insertEmployee(String eid,String ename,String empdob) {
        // Code to insert employee data into the database
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql:///employeemanagement","root","root");
            Statement st=con.createStatement();
            //String query="select *from templo. where studentid=1";
            String query="insert into employeemanagement.employee values ('"+eid+"','"+ename+"','"+empdob+"')";
            //ResultSet rs = st.executeQuery(query);
            int i=st.executeUpdate(query);

            if(i==1) {
                System.out.println("inserted");

            }
            else {
                System.out.println("not");
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public void updateEmployee(String eid,String uename) {
//         Code to update employee data in the database
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql:///employeemanagement","root","root");
            Statement st=con.createStatement();
            //String query="select *from templo. where studentid=1";
            String query="update employeemanagement.employee set empName='"+uename+"' where empid='"+eid+"'";
            //ResultSet rs = st.executeQuery(query);
            int i=st.executeUpdate(query);

            if(i==1) {
                System.out.println("updated");

            }
            else {
                System.out.println("not");
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }

    }
//     public void getEmployeeById(String empId) {
//         // Code to retrieve an employee by empId from the database
//    	 try {
//   			Connection con=DriverManager.getConnection("jdbc:mysql:///templo","root","root");
//   			Statement st=con.createStatement();
//   			//String query="select *from templo. where studentid=1";
//   			String query="select *from templo.tempdetails where tempid='"+empId+"'";
//   			ResultSet rs = st.executeQuery(query);
//   			while(rs.next()) {
//   				System.out.println(rs.getString(1)+" "+rs.getString(2));
//   			}
//
//   		}
//   		catch(Exception e) {
//   			System.out.println(e);
//   		}


//
//
//
//}

    public void getEmployeeById(String empid) {
        // TODO Auto-generated method stub
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql:///employeemanagement","root","root");
            Statement st=con.createStatement();
            //String query="select *from templo. where studentid=1";
            String query="select *from employeemanagement.employee where empid='"+empid+"'";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }

    }

    public void insertEmployeeAttendance(String empid,String status) {
        // Code to insert attendance data into the database

        int salperday=1000;

        try {
            Connection con=DriverManager.getConnection("jdbc:mysql:///employeemanagement","root","root");
            Statement st=con.createStatement();
            
            //String query="select *from templo. where studentid=1";
            String query = "INSERT INTO employeemanagement.attendance (empid, attendancestatus, attendancedate) VALUES ('" + empid + "','" + status + "', DATE(NOW()))";

            //ResultSet rs = st.executeQuery(query);
            int i=st.executeUpdate(query);

            if(i==1) {
                System.out.println("attendance updated ");

            }
            else {
                System.out.println("not");
            }

        }
        catch(Exception e) {
            System.out.println(e);
        }

    }

    public void getEmployeesalarydetails(String empid) {
        // TODO Auto-generated method stub
        try {
            Connection con=DriverManager.getConnection("jdbc:mysql:///employeemanagement","root","root");
            Statement st=con.createStatement();
            //String query="select *from templo. where studentid=1";
            String query="select employeemanagement.employee.empid,employeemanagement.employee.empName,employeemanagement.employee.empdob,employeemanagement.attendance.attendanceid,employeemanagement.attendance.attendancedate from employeemanagement.employee inner join employeemanagement.attendance on  employeemanagement.employee.empid= employeemanagement.attendance.empid where employeemanagement.attendance.attendancestatus='p' and employeemanagement.employee.empid='"+empid+"' ";

            String query1="select count(*) from employeemanagement.employee inner join employeemanagement.attendance on  employeemanagement.employee.empid= employeemanagement.attendance.empid where employeemanagement.attendance.attendancestatus='p' and employeemanagement.employee.empid='"+empid+"' ";


            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {

                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
            }
            ResultSet rs1=st.executeQuery(query1);
            while(rs1.next()){
                System.out.println("salary of the employee is:"+rs1.getInt(1)*1500);
            }



        }
        catch(Exception e) {
            System.out.println(e);
        }


    }


}
