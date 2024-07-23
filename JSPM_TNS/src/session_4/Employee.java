package session_4;

public class Employee {
	
	private int empId;
	private String empNa; 
	Date dt_of_me;

	
	public Employee() {}


	public Employee(int empId, String empNa, Date dt_of_me) {
		super();
		this.empId = empId;
		this.empNa = empNa;
		this.dt_of_me = dt_of_me;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNa=" + empNa + ", dt_of_me=" + dt_of_me + "]";
	}
	
	
	public static void main(String []arg) {
		Employee e1 = new Employee(111, "kishan", new Date(12,9,2024));
	}
	
	
}
