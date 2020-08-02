package com.Lockme;
import java.util.Scanner;

public class AppMenuPage {

	public static void main(String[] args) {
		
		System.out.println("***************************************************************************************");
		System.out.println("-----------                  Welcome to Lockedme.com                     --------------");
		System.out.println("***************************************************************************************");
		System.out.println("/*/*-------$$$$$$$--------Devoloped by D.Divya Sravanthi------$$$$$$$$-----------/*/*");
		System.out.println("-----------        */*/*/*/        MenuPage@        */*/*/*/         ------------------");
		
		System.out.println("1.Register for Lockedme.com");
		System.out.println("2.Login for lockedme.com");
		System.out.println("enter your option");
		
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char  c =s.charAt(0);
		switch(c) {
		case '1':
			IRegister_Page.main(null);
			break;
		case '2':
			Login_Page.main(null);
			break;
		default :
			System.out.println("Enter Correct Options");
		}
		
	}

	}
