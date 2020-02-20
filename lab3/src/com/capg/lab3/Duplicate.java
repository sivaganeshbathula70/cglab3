package com.capg.lab3;

public class Duplicate {
 int sum = 0;
	int i;
	static int a[] = {1,2,3,4,5,7};
	 static int sum()
	{
		 int sum =0;
		for(int i=0;i<a.length;i++)
			sum = sum+a[i];
		return sum();
	}
	public static void main(String args[])
	{
		System.out.println(sum());
	}

}
