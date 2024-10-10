package org.braindata.impl;

import org.braindata.model.*;
import java.util.Scanner;
public class Display extends Student {
	
	Scanner sc = new Scanner(System.in);
	
	public void Studentfirst()
	
	{
		Display d = new Display();
		
		System.out.println("Enter the roll no");
		d.rollno = sc.nextInt();
		
		System.out.println("Enter name");
		
		d.name = sc.next();
		
		
		System.out.println(d.rollno);
		
		System.out.println(d.name);
		
		
	}
	
	public void Studentsecond()
	
	{
		
		Display d1 = new Display();
		System.out.println("Enter the roll no");
		d1.rollno = sc.nextInt();
		
		System.out.println("Enter name");
		
		d1.name = sc.next();
		
		
		System.out.println(d1.rollno);
		
		System.out.println(d1.name);
		
		
		
	}


}
