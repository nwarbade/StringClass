package com.stringClassDisc;

public class ConceptOfString {
	
	public static void main(String[] args) {

//		There are 2 ways to define String:

//		1. using new keyword

		String s1 = new String("abc");

		System.out.println(s1);//abc

		String s3 = new String("def");

		String s4 = new String("abc");


		String s5 = new String("xyz");

//		2. without new Keyword

		String s2 = "wxy";

		String s9 = "abc";

		System.out.println(s9);//abc

		String s6 = "ghi";

		String s7 = "abc";

		String s8 = "abc";

//		comparison of String

	boolean a = s1 == s3;   //== is an operator which compares 2 strings whether they are pointing to the same object or not 

	System.out.println(a);//false


	boolean	b = s1==s9;

	System.out.println(b);//false


	boolean	c = s9 == s7;

	System.out.println(c);//true



	boolean d = s1.equals(s7);   //equals method is used to compare the content of 2 strings.

	System.out.println(d);//true



	}



}
