package com.neotech.lesson08;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign it true create int variable day and
		 * assign it to 1 - As long as it is workDay print "I need a day off" and
		 * increase day. - Once day is 6 print "I do not need a day off any more"
		 */
		
		boolean workday = true;
		int day=1;
		
		while (day <=5) {
			
			if(day==6 || day==7) {
				
				System.out.println("I do not need a day off ");
				day++;
				workday=false;
			}
			
			System.out.println("I need a day off");
			day++;
			
			
		}
		
	}

}
