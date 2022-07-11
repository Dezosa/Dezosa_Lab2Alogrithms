package com.Currency;

import java.util.Scanner;

import CurrencyCal.Mergesort;
import CurrencyCal.TotalNote;

public class MainCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mergesort mergesort=new Mergesort();
		TotalNote totalNote=new TotalNote();
		
		
		 Scanner sc=new Scanner(System.in);
			
		    System.out.println("Enter the size of currency denomination:");
		    int size=sc.nextInt();
		    System.out.println("Enter the currency denominations value:");
		    int notes[]=new int[size];
		     for(int i=0;i<size;i++)
		      {
		       notes[i]=sc.nextInt();
		       }
		     System.out.println("Enter the amount you want to pay:");
		     int amount=sc.nextInt();
		     mergesort.sort(notes,0,notes.length-1);
		     totalNote.notecount(notes,amount);
		     sc.close();
	}

}