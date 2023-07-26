package com.icia.ex.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = args[0];
		String password = args[1];
		System.out.println(id);
		System.out.println(password);
		if (id.equals("egoing")) {
			if (password.equals("1111")) {
				System.out.println("right");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}

		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

}
