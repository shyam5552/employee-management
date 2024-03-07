package org.example;

public class Employee {
    private String empId;
    private String empName;
    private String empdob;

    public Employee() {

        this.empId = "none";
        this.empName = "none";
        this.empdob="none";

    }

    public String getEmpId() {
        return empId;
    }
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpdob(String empdob) {
        this.empdob = empdob;
    }
    public String getEmpdob(){
        return empdob;
    }
    //	public Date getDob() {





}
