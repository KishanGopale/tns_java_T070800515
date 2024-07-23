package session_4;

public class B extends A{
	
	public B() {
		
		System.out.println(" default of B");
	}
	
	public B (int a) {
		
		super(1000);
		System.out.println("parameterized of B"+ a);
	}
	
	public static void main(String[] args) {
		B b = new B (10);
	}

}
