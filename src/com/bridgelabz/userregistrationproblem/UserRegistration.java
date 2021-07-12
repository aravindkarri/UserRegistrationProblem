package com.bridgelabz.userregistrationproblem;

import java.util.regex.Pattern;

public class UserRegistration
{
	/**
	 * Method to check given first name is valid or not
	 * with minimum characters 3 and ensure first letter is captial
	 * @param name
	 */
	public void checkFirstName(String name)
	{
		boolean isMatched = Pattern.compile("(^([A-Z]{1})[a-z]{2,})+$").matcher(name).matches();
		if(isMatched)
		{
			System.out.println("It is valid name");
		}
		else
		{
			System.out.println("It is not a valid name");
		}
	}
	/**
	 * Method to check given last name is valid or not
	 * with minimum characters 3 and ensure first letter is captial
	 * @param name
	 */
	public void checkLastName(String name)
	{
		boolean isMatched = Pattern.compile("(^([A-Z]{1})[a-z]{2,})+$").matcher(name).matches();
		if(isMatched)
		{
			System.out.println("It is valid last name");
		}
		else
		{
			System.out.println("It is not a valid last name");
		}
	}
	/**
	 * Method to check given email is valid or not
	 * @param email
	 */
	public void isValidEmail(String email) 
	{
		boolean isMatched = Pattern.compile("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,4})([.][a-zA-Z]{2})*$").matcher(email).matches();
		if(isMatched)
		{
			System.out.println("It is valid email");
		}
		else
		{
			System.out.println("invalid email");
		}
	}
	/**
	 * Method to check given mobile number is valid or not
	 * @param name
	 */
	public void isValidMobileNumber(String name)
	{
		boolean isMatched = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$").matcher(name).matches();
		if(isMatched)
		{
			System.out.println("It is valid mobile number");
		}
		else
		{
			System.out.println("It is not a valid mobile number");
		}
	}
	/**
	 * Method to check given password has minimum 8 characters
	 * @param name
	 */
	public void isValidPassword(String name)
	{
		boolean isMatched = Pattern.compile("[0-9a-zA-Z@!+_.-]{8,}").matcher(name).matches();
		if(isMatched)
		{
			System.out.println("It has minimum 8 character");
		}
		else
		{
			System.out.println("Enter minimum 8 characters");
		}
	}
	/**
	 * Method to ensure password have atleast one uppercase letter
	 * @param name
	 */
	public void checkUpperCase(String name)
	{
		boolean isMatched = Pattern.compile("(?=.*[A-Z])[0-9a-zA-Z@!+_.]{8,}").matcher(name).matches();
		if(isMatched)
		{
			System.out.println("Valid ! It contains uppercase letter");
		}
		else
		{
			System.out.println("Enter atleast one uppercase letter");
		}
	}
	/**
	 * Method to ensure password have atleast one numeric number
	 * @param name
	 */
	public void checkNumericNumber(String name)
	{
		boolean isMatched = Pattern.compile("(?=.*[0-9])[0-9a-zA-Z@!+_.]{8,}").matcher(name).matches();
		if(isMatched)
		{
			System.out.println("Valid ! It contains numeric number");
		}
		else
		{
			System.out.println("Enter atleast one numeric number");
		}
	}
	
}
