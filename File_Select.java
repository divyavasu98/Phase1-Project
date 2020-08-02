package com.Lockme;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;


public class File_Select {

	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		String s1=scan1.next();
		char choice1=s1.charAt(0);
		switch(choice1) {
		case'1':
			try { 
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter filename");
				String filename = scan.next();
				File file = new File("C:\\Users\\ddevarapalli\\OneDrive - DXC Production\\Documents\\Divya" + filename);
				boolean status;
				if (file.exists())
					System.out.println("File exists");
				else {
					status = file.createNewFile();
					System.out.println((status == true) ? "File Created.." : "File Not Created..");
				}
			}
		         catch(IOException ex) {
		        	 ex.printStackTrace();
		        
		         }
			 Files_Menu.main(null);
			 break;
			
			
		case '2':	
			
			try { 
		         Serializable file = new File("C:\\Users\\ddevarapalli\\OneDrive - DXC Production\\Documents\\Divya");
		         File[] filelist=((File) file).listFiles();
		         System.out.println("Enter The FileName To be Deleted Followed By .txt");
		         Scanner scan=new Scanner(System.in);
		         String filename=scan.next();
		         String abs_path="";
		         for (File file2 : filelist) {
					if(file2.getName().equals(filename)) {
						abs_path=file2.getAbsolutePath();
						file2.delete();
					}}
		         if(abs_path.isEmpty()) {
		        	 System.out.println("file Not Found");
		        	 
		         }
		         else {
		        	 System.out.println("file is deleted");
		        	 Files_Menu.main(null);
		        	 break;
		         }
					
		         
			 }
		         catch(Exception ex) {
		        	 ex.printStackTrace();
		        
		         }
			 
			 break;
		case '3':
			try{
				Serializable file = new File("C:\\Users\\ddevarapalli\\OneDrive - DXC Production\\Documents\\Divya");
			
			File[] filelist=((File) file).listFiles();
			System.out.println("enter the file Name followed by .txt");
			Scanner scan=new Scanner(System.in);
			String filename=scan.next();
			
			 String abs_path = " ";
	    	 for (File file2 : filelist) {
	    		
	    		 if(file2.getName().equals(filename))
	    	        {
	    	            
	    	            abs_path=file2.getAbsolutePath();
	    	        }
	    	 }
	          if(abs_path.isEmpty())
	        	  System.out.println("not found");
	          else {
	        	  System.out.println("found at" +abs_path);
	        	  Files_Menu.main(null);
	          break;
	          }
		 }
	    	 catch( Exception ex) {
	    		 ex.printStackTrace();
	    	}
		
		 break;
			
			case '4':
			AppMenuPage.main(null);
			break;
		default :
			System.out.println("Select the correct option");
		}
	}

}
