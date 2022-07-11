package com.transaction;

import java.util.Scanner;

public class MainTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter the size of transaction array:");
	    int size=sc.nextInt();
	    System.out.println("Enter the value of array:");
	    int a[]=new int[size];
	     for(int i=0;i<size;i++)
	      {
	       a[i]=sc.nextInt();
	       }
	     System.out.println("Enter the total number of targets that needs to be achieved:"); 
	     int count=sc.nextInt();
	     
	    
	     while(count--!=0) 
	     {
	    	 int flag=0;
	    	 long value;
	    	 
	    	 System.out.println("Enter the value of target:");
		     value=sc.nextInt();
		     long sum=0;
		     
		     for(int i=0;i<size;i++)
		     {
		    	 sum=sum+a[i];
		    	 if(sum>=value)
		    	 {
		    		 System.out.println("target is achived after "+(i+1)+ " transaction");
		    		 flag=1;
		    		 break;
		    	 }
		     }
		    	 
		     if(flag==0)
		     {
		    	 System.out.println("target is not achieved");
		    	 
		     }
		     
	    	 
	     }
	     sc.close();  
	}

}
