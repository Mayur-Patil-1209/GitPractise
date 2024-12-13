package Practise;

import java.util.Scanner;

public class Factorial_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Give number :");
		
		int num = scn.nextInt();
		int fact = 1;
		
		for(int i =1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("The factoral of "+num+" is "+ fact);
	}

}
