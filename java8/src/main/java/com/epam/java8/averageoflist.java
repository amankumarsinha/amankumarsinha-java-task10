package com.epam.java8;

import java.util.*;
interface avr
{
	 float foo(int[] arr);
}

public class averageoflist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>arr= new ArrayList<Integer>();
		int range=25;
		for(int i=0;i<=range;i++)
			arr.add(i);
		int size=arr.size();
		//int sum=0;
		float res=getans(arr,range);
		System.out.print(res);
	}
	public static float getans(List<Integer>ar,int range)
	{ int rar[]=new int[range+1];
	    for(int i:ar)
	    	rar[i]=i;
		 avr average;
		 average=(int []a)->{
			 int sum=0;
			 for(int i:rar)
			sum+=i;
		      return (sum/range);
           };
          // System.out.print(average.foo(ar));
		   return average.foo(rar);
	}


}
