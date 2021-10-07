package com.home;

import java.util.Scanner;

public class BuzzNumber7 
{
	public void checkBuzz(int number)
	{
		if(number%10==7||number%10==0)
		{
			System.out.println("number"+number+"is a buzz number");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check buzz number or not");
		int number=sc.nextInt();
		BuzzNumber7 bn=new BuzzNumber7();
		bn.checkBuzz(number);
		

	}
}
