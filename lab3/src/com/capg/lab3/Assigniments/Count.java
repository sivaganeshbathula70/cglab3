package com.capg.lab3.Assigniments;
import java.util.*;
public class Count {


	void abc(String str)
	{
		int ci, i, j, k, l=0;
		 char c, ch;
		 i=str.length();
	        for(c='A'; c<='z'; c++)
	        {
	            k=0;
	            for(j=0; j<i; j++)
	            {
	                ch = str.charAt(j);
	                if(ch == c)
	                {
	                    k++;
	                }
	            }
	            if(k>0)
	            {
	                System.out.println("The character " + c + " has occurred for " + k + " times");
	            }
	        }
	}
   public static void main(String args[])
   {
        
        String str, str1;
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str=scan.nextLine(); 
        Count d=new Count();
        d.abc(str);
       
   }

}
