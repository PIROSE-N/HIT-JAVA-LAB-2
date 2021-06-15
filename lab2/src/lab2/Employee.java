package lab2;

public class Employee {
	int empId;
	String empName;
	
	//parameterized constructor with two parameters
	
	Employee(int id, String name){
		this.empId = id;
		this.empName = name;
		
	}
	void info() {
		System.out.println("id: "+empId+" Name: "+empName);
		
	}
	public static void main(String[] args) {
		Employee obj1 = new Employee(10344,"chaitanya");
		Employee obj2 = new Employee(10366,"negan");

	}
}
