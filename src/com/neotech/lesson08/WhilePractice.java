package com.neotech.lesson08;

import java.util.Scanner;

public class WhilePractice {

	public static void main(String[] args) {
		 
//		// How can I enter 5 numbers from the console 
//				// using while-loop
//		
//		
//		
//		int var;
//		Scanner scan = new Scanner(System.in);
//        int count = 1;
//		
//		while (count <= 5)
//		{
//			System.out.println("Enter a number:");
//			var = scan.nextInt();
//			System.out.println(var); //Simple display of the entered number
//			
//			count++;
//		}
		
		
		//How can I print only even numbers from 50 to 1?
		
int x = 50;
		
		while (x > 1) 
		{
			System.out.print(x + " ");
			//We need to update the loop control variable --> x
			x = x - 2; // x -= 2;
						// x--;
						// x--;
		}
		
		System.out.println();
		
		int y = 50;
		while (y > 1) 
		{
			if (y % 2 == 0)
			{
				System.out.print(y + " ");
			}
			
			y--; //OR --y; 
		}
		
		// Print odd numbers until 50 
		
		int z=49;
		
		while (z<=49) {
			
			if (z%1 ==0) {
				
			System.out.println(z +" ");	
			z++;
			}
			
			
			
			
		}
		
		
		
		
		
		
		}
		
		
		
		
		
		

	}


