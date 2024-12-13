package Practise;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        System.out.println("Give the number :");
	        int num = scan.nextInt();
	        boolean isPrime = true;
	        
	        for(int i=2; i<num; i++)
	        {
	            if(num%i==0)
	            {
	            	isPrime=false;
	            
	            }
	            
	        }
	        if(isPrime==true)
	        {
	            System.out.println("The number "+num+" is prime number.");
	        }
	        else
	        {
	            System.out.println("The number "+num+" is not prime number.");
	        }
	        
	    }
	}

