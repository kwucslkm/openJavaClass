package com.icia.ex.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		System.out.println(id);
		if(id.equals("egoing")){
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}

}
