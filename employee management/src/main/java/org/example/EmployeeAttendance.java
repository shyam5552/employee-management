package org.example;

public class EmployeeAttendance {
    private String empId;
    private String status;


    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getDaysPresent() {
        return status;
    }
    public void setDaysPresent(String status) {
        this.status = status;
    }

}
