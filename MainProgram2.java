package com.codegynan.Day26.program;

public class MainProgram2 {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("Shashi");
		System.out.println(str1);
		System.out.println(str1.reverse());
		System.out.println(str1);
		System.out.println(str1.append("Suma"));
		System.out.println(str1);
		
		System.out.println();
		
		StringBuffer str2 = new StringBuffer("Shashi");
		System.out.println(str2);
		System.out.println(str2.reverse());
		System.out.println(str2);
		System.out.println(str2.append("Suma"));
		System.out.println(str2);
		
		/*String str1 = "Hello";
		System.out.println(str1);
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.replace('l','x'));
		System.out.println(str1);*/
	}
}
