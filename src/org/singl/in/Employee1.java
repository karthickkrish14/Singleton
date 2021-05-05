package org.singl.in;

public class Employee1 {
	  static Employee1 e ;
	private Employee1() {

	}
	public static  Employee1 getInsurance() {
		if(e==null) {
			e = new Employee1();
		}
		return e;

		
	}
	public void empID() {
		System.out.println("Emp id is 12345");
		
	}
	public static void main(String[] args) {
		Employee1 e = getInsurance();
		e.empID();
		
	}

}
