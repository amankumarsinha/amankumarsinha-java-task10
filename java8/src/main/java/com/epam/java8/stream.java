package com.epam.java8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>l=new ArrayList<String>();
l.add("amam");
l.add("ama");
l.add("bab");
l.add("aye");
l.add("ayoyo");
l.add("zaa");
List<String> res=streammethod(l);
System.out.print(res);



	}
	public static List<String> streammethod(List<String> l)
	{
		List<String>res=l.stream().filter(s->s.startsWith("a")&& s.length()==3).collect(Collectors.toList());
		return res;
		
	}
	
}
