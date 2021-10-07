package com.home;

import java.util.Scanner;

public class AtomorpicNumber 
{
	public static boolean atomorphicNumber(int number)
	{
		int Square=number*number;
		while(number>0)
		{
			if(number%10 !=Square%10)
				return false;
		
			number=number/10;
			Square=Square/10;
		
		}return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check Atomic number or not");
		int number=sc.nextInt();
		AtomorpicNumber an=new AtomorpicNumber();
		atomorphicNumber(number);
		System.out.println(number+" ");
       System.out.println(atomorphicNumber(number) ? "Automorphic" : "Not Automorphic");
		
	}

}
