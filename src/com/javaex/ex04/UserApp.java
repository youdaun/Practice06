package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User c1 = new Customer("jws", "j1234", "정우성", 1000);
		User c2 = new Customer("yjs", "y2345", "이효리", 2000);
		User e1 = new Employee("master", "m7788", "운영자", 5000000);
		
		User[] uArray = new User[] {c1, c2, e1};
		
		for(int i=0; i<uArray.length; i++) {
			uArray[i].showInfo();
		}

	}

}
