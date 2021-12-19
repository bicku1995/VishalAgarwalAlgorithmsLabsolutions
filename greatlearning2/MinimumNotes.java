package com.greatlearning2;

import java.util.Scanner;

public class MinimumNotes {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of denominations");
		int size=sc.nextInt();
		int notes[]=new int[size];
		int numnotes[]=new int[size];
		System.out.println("Enter the denomination");
		for(int i=0;i<size;i++)
		{
			notes[i]=sc.nextInt();
	}
		Mergesort  ns=new Mergesort();
		ns.mergesort(notes,0,notes.length-1);
		for(int j=0;j<notes.length;j++)
		{
			System.out.println(notes[j]);
		}
			System.out.println("What is the amount to pay");
			int amount=sc.nextInt();
		for(int i=0;i<notes.length;i++)
		{
			int n=(int)(amount/notes[i]);
			numnotes[i]=n;
			
			amount=amount-(numnotes[i]*notes[i]);
		
		
		if(i==notes.length-1 && amount!=0)
		{
			System.out.println("Not possible to pay the ammount");
		}
		else if(i==notes.length-1 && amount==0)
		{
			for(int j=0;j<numnotes.length;j++)
			{
				System.out.println(notes[j]+":"+numnotes[j]);	
			}
		}
		}
		
			
		

	}

}
