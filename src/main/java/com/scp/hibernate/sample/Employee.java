package com.scp.hibernate.sample;

public class Employee {

	private int empId;
	private String empName;
	private String empAddress;
	private double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "\n Employee [empId=" + empId + ", empName=" + empName
				+ ", empAddress=" + empAddress + ", empSalary=" + empSalary
				+ "]";
	}
	public Employee(int empId, String empName, String empAddress,
			double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
}
