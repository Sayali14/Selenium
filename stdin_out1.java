package com.Stdin_out;

import java.util.Scanner;

public class stdin_out1{

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your roll number:");
	int roll=sc.nextInt();
	
	System.out.println("Enter your name:");
	String name=sc.next();
	
	System.out.println("Enter your fee");
	double fee=sc.nextDouble();
	
	System.out.println("RollNo:"+roll+"Name:"+ name +"Fee:" + fee);
	
	sc.close();
	
}

}
