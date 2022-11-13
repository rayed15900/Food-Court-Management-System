package classes;

public class Employee {
	private String name;
	private String empId;
	private double salary;
	
	public Employee(){}

	public Employee(String empId, String name, double salary){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void setEmpId(String empId){
		this.empId = empId;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public String getEmpId(){
		return empId;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}	
}