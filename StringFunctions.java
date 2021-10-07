package com.home;

import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions 
{
	public static boolean anagram(String str1,String str2)
	{
	    if(str1.length() == str2.length())
	    {
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	       boolean result = Arrays.equals(charArray1, charArray2);

	        if(result)
	        {
	          System.out.println(str1 + " and " + str2 + " are anagram.");
	        }
	        else 
	        {
	          System.out.println(str1 + " and " + str2 + " are not anagram.");
	        }
	      }	    	 
	    return false;
	}
	public static boolean palindrome(String str)
	{
		String rev="";
	      int length = str.length();
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
		return false ;
	}
    private static void swap(char[] arr, int i, int j)
    {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
 
    private static void reverse(char[] arr, int i, int j)
    {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
 
    // Iterative function to find permutations of a string 
    public static void permutations(String str)
    {
        // base case
        if (str == null || str.length() == 0)
        {
            return;
        }
 
        // base case
        if (str.length() == 1)
        {
            System.out.print(str);
            return;
        }
 
        // sort the string in a natural order
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
 
        // get length of the string
        int n = str.length();
 
        while (true)
        {
            // print the current permutation
            System.out.print(String.valueOf(chars) + " ");
            // Find the largest index `i` such that `chars[i-1]` is less than `chars[i]`
            int i = n - 1;
            while (chars[i-1] >= chars[i])
            {
               if (--i == 0)
               {
                    return;
                }
            }
            int j = n - 1;
            while (j > i && chars[j] <= chars[i-1]) {
                j--;
            }
 
            // swap character at index `i-1` with index `j`
            swap(chars, i - 1, j);
 
            // reverse substring `chars[i…n-1]`
            reverse (chars, i, n - 1);
        }
    }
    // Recursive function to generate all permutations of a string
    private static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }
 
        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }
 
    public static void findPermutations(String str) {
 
        // base case
        if (str == null || str.length() == 0) {
            return;
        }
 
        permutations(str.toCharArray(), 0);
    }
 


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1");
		String string1=sc.next();
		System.out.println("enter string 2");
		String string2=sc.next();
		System.out.println("______________________________");
		System.out.println("Anagram");
		anagram(string1,string2);
		System.out.println("______________________________");
		System.out.println("plaindrome for srting 1");
		palindrome(string1);
		System.out.println("______________________________");
		System.out.println("plaindrome for srting 2");
		palindrome(string2);
		System.out.println("______________________________");
		System.out.println("iterative permutaion for srting 1");
		permutations(string1);
		System.out.println("______________________________");
		System.out.println("iterative permutaion for srting 2");
		permutations(string2);
		System.out.println("______________________________");
		System.out.println("recursive permutaion for srting 1");
		findPermutations(string1);
		System.out.println("______________________________");
		System.out.println("recursive permutaion for srting 2");
		findPermutations(string2);

	}
}
