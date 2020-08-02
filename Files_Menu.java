package com.Lockme;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Files_Menu {

	public static void main(String[] args) {
		System.out.println("Select an option Below");
		System.out.println("1.View the Current Files");
		System.out.println("2.ADD/DELETE/SEARCH Files");
		System.out.println("3.Close the Application");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char choice=s.charAt(0);
		switch(choice) {
		case '1':
			System.out.println("Viewing The Current Files In The Folder\n");
			File dir = new File("C:\\Users\\ddevarapalli\\OneDrive - DXC Production\\Documents\\Divya");

		      File[] files = dir.listFiles();

		      Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

		      for (File file : files) {
		         if (!file.isHidden()) {
		            if (file.isDirectory()) {
		               System.out.println("DIR \t" + file.getName());
		            } else {
		               System.out.println("FILE\t" + file.getName());
		            }
		         }
		      }Files_Menu.main(null);
			break;
		case '2':
			System.out.println("1.Add files to the Current Folder\n");
			System.out.println("2.Delete files in the Current Folder\n");
			System.out.println("3.Search files In the Current Folder\n");
			File_Select.main(null);
			break;
		case '3':
			System.out.println("Closed the Application!");
			System.exit(0);
			
			}

	}

}
