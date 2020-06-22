package com.epam.java8;
import java.util.*;
import java.util.function.Predicate;

 class PredicateExmaple {

	  public static void main(String[] args) {
	     String [] strArray = {"Hello", "amam", "malylam", "chess", "sunrornus", "alha", "mam"};
	     List<String> strList = Arrays.asList(strArray);
	     
		 List<String> listpalindromeStr = filterEmptyStrings(strList, (String str) ->isPalindrome(str));
	     System.out.println(listpalindromeStr);
	  }

	  public static List<String> filterEmptyStrings(List<String> list, Predicate<String> predicate) {
	     List<String> finalList = new ArrayList<>();
	     
		 for (String str : list) {
	       if(predicate.test(str)) {
	         finalList.add(str);
	       }
	    }
	  return finalList;
	  }
	  static boolean isPalindrome(String str) 
	    { 
	  
	        // Pointers pointing to the beginning 
	        // and the end of the string 
	        int i = 0, j = str.length() - 1; 
	  
	        // While there are characters toc compare 
	        while (i < j) { 
	  
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	            // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--; 
	        } 
	  
	        // Given string is a palindrome 
	        return true; 
	    } 
	}