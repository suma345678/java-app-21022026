package com.codegynan.Day26.program;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

	public class MainProgram {
		public static void main(String[] args) {
			/*//long milliSeconds = 1234567865456L;
			long milliSeconds = System.currentTimeMillis();
			GregorianCalendar gregorianCalendar = new GregorianCalendar();
			gregorianCalendar.setTimeInMillis(milliSeconds);
			int dd = gregorianCalendar.get(Calendar.DATE);
			int mm = gregorianCalendar.get(Calendar.MONTH);
			mm++;
			int yyyy = gregorianCalendar.get(Calendar.YEAR);
					
			int hr = gregorianCalendar.get(Calendar.HOUR);
			int min = gregorianCalendar.get(Calendar.MINUTE);
			int sec = gregorianCalendar.get(Calendar.SECOND);
			int amPm = gregorianCalendar.get(Calendar.AM_PM);
			
			System.out.println("Today's Date: " + dd + "/" + mm + "/" + yyyy);
			System.out.print("Current Time: " + hr + ":" + min + ":" + sec);
			System.out.println((amPm == 0) ? " AM" : " PM");*/
			
			//GregorianCalendar gregorianCalendar = new GregorianCalendar();
			//long milliSeconds = gregorianCalendar.getTimeInMillis();
			//System.out.println(milliSeconds);
			
			/*//Date date = new Date();
			//Date date = new Date(110, 5, 19);
			//Date date = new Date(110, 5, 19, 8, 15, 23);
			Date date = new Date(110, 5, 19, 20, 15, 23);
			int dd = date.getDate();
			int mm = date.getMonth();
			mm++;
			int yyyy = date.getYear();
			yyyy += 1990;
					
			int hr = date.getHours();
			int min = date.getMinutes();
			int sec = date.getSeconds();
			
			System.out.println("Today's Date: " + dd + "/" + mm + "/" + yyyy);
			System.out.print("Current Time: " + hr + ":" + min + ":" + sec);*/
			
			/*GregorianCalendar date1 = new GregorianCalendar(2025, 8, 22, 10, 25, 59);
			//GregorianCalendar date2 = new GregorianCalendar(2025, 8, 22, 10, 25, 59);
			//GregorianCalendar date2 = new GregorianCalendar(2024, 8, 22, 10, 25, 59);
			GregorianCalendar date2 = new GregorianCalendar(2026, 8, 22, 10, 25, 59);*/
			
			/*boolean areDatesSame = date1.equals(date2);
			System.out.println(areDatesSame);
			int status = date1.compareTo(date2);
			System.out.println(status);*/
			
			/*boolean isDate1BeforeDate2 = date1.before(date2);
			System.out.println(isDate1BeforeDate2);
			boolean isDate1AfterDate2 = date1.after(date2);
			System.out.println(isDate1AfterDate2);*/
			
			//GregorianCalendar gregorianCalendar = new GregorianCalendar();
			//GregorianCalendar gregorianCalendar = new GregorianCalendar(2025, 8, 22);
			GregorianCalendar gregorianCalendar = new GregorianCalendar(2026, 1, 22, 07, 46, 23);
			
			int dd = gregorianCalendar.get(Calendar.DATE);
			int mm = gregorianCalendar.get(Calendar.MONTH);
			mm++;
			int yyyy = gregorianCalendar.get(Calendar.YEAR);
					
			int hr = gregorianCalendar.get(Calendar.HOUR);
			int min = gregorianCalendar.get(Calendar.MINUTE);
			int sec = gregorianCalendar.get(Calendar.SECOND);
			int amPm = gregorianCalendar.get(Calendar.AM_PM);
			
			System.out.println("Today's Date: " + dd + "/" + mm + "/" + yyyy);
			System.out.print("Current Time: " + hr + ":" + min + ":" + sec);
			System.out.println((amPm == 0) ? " PM" : " AM");
		}
	}

