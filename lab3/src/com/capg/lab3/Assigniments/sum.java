package com.capg.lab3.Assigniments;

public class sum {
	public static void main(String args[])
	{
		int[] numbers = {1,2,3,4};
	int sumu = 0;
	for( int i : numbers) {
		sumu=sumu+i;
		System.out.println(sumu);
	}
	    if(sumu%2==0||sumu%5==0)
	    {
	    	System.out.println("even");
	    }
	    else
	    {
	    	System.out.println("odd");
	    }
	}

	//System.out.println(sum);
	}


