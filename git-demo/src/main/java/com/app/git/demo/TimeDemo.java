package com.app.git.demo;

import java.util.Calendar;

public class TimeDemo {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		
		long start = cal.getTimeInMillis();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		long end = cal.getTimeInMillis();
		
		long sectime = (end - start)/(1000*60*60*24);
		
		System.out.println(sectime);
	}
	
	public static int getAge(int age) {
		return age;
	}
	
	public static String getAddress(String address) {
		return address;
	}
	

	public void method4D(){};


}
