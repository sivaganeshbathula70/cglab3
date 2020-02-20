package com.capg.lab3.Assigniments;


public class Array {  
	int [] abc(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			while(a[i]!=0)
			{
				int n,m;
				
				m=a[i]%10;
				k=k*10+m;
				a[i]=a[i]/10;
				
				
			}
			a[i]=k;
		}
		return(a);
	}
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int[] {12, 21, 31, 894, 875};  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();
       Array a=new Array();
       int []b=new int[arr.length];
       b=a.abc(arr);
        
        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(b[i] + " ");  
        }  
    }  
}  


