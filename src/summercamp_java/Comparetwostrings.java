package summercamp_java;

	import java.util.Scanner;

	public class Comparetwostrings {
	        public static void main(String[] args) 
	        {  
	            System.out.println("--------Remove Character-------");
	            String s1,s2;
	            String str = "REST ASSURED";  
	            String str1 = str.substring(0, 4);
	            String str2 = str.substring(4, 12);
	            String str3 = str1.substring(0, str1.length() - 2);
	            String str4 = str3.concat(str2);
	            System.out.println("Removed ST: "+str4);
	            System.out.println("--------Compare two String-------");
	            Scanner s=new Scanner(System.in);
	            System.out.println("Enter the First string :");
	            s1 =s.nextLine();
	    
	            System.out.println("Enter the Second string :");
	            s2 =s.nextLine();

	 

	           if(s1.equals(s2))
	           {
	               System.out.println("Strings are equal");
	           }
	           else
	           {
	               System.out.println("Strings are not equal");
	             
	           }
	            
	          
	            
	        }  

	 
	}
	
	/************************************RESULT*************************
	--------Remove Character-------
	Removed ST: RE ASSURED
	--------Compare two String-------
	Enter the First string :
	test
	Enter the Second string :
	test
	Strings are equal*/
	/************************************ RESULT **************************/
