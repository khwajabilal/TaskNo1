package com.maventhird.name.Third;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App obj=new App();
    	String number;
    	Scanner input =new Scanner(System.in);
    	System.out.println("enter the number");
    	number=input.next();	
    	if(number.matches("\\d+"))
    	{
    		System.out.println("the multiple is =" + obj.findMultiples(number));
    	}
    	else
    	{
    		
    		System.out.println("soryy you had enterd the wrong input");
    	}
    	
    	System.out.println("enter the word to check weather it is palindrome or not ?");
    	number=input.next();
    	int palindromeNumber=obj.palindromeCheck(number);
    	if(palindromeNumber!=0)
    	{
    		System.out.println("the word enter is a palindrome and its center index is " + (palindromeNumber+1));
    	}
    	else
    	{
    		System.out.println("the word enter is not a palindrome ");
    	}
    }
    
    /**
     * calculates multiple of number of the enterd number
     * 
     * @param number
     * @return multiples
     */
    int findMultiples(String number){
    	int product = 1; //intialize by 1 to save value of product after each itteration
    	for(int i=0;i<number.length();i++)
    	{
    		//product=product*Integer.parseInt(String.valueOf(number.charAt(i)));
    		product = product*Character.getNumericValue(number.charAt(i));
    	}
    	return product; // the calculated result has been returned	
    }
    
    
   /**
    * palindrome check by khw
    * 
    * @param word
    * @return middle index
    */
   int palindromeCheck(String word)
    {
    	char temp;
    	for(int i=0;i<word.length()/2;i++) //checking if the word doesnt match 
    	{
    		if(word.charAt(i)!=word.charAt(word.length()-i-1))
    				{	
    					return 0; // return 0 if not palindrome
    				}
    	}
    	return word.length()/2; //return palindromeNumber if palindrome
    }
}
