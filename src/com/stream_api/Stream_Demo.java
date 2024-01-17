package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_Demo {

	public static void main(String[] args) {
		//program to check even number
		List<Integer> num=Arrays.asList(100,2,30,4,15,6,2,6);
		List <Integer> evenNum=num.stream().filter(x-> x % 2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		
		//Square of the number
		List <Integer> squareNum=num.stream().map(x-> x *x).collect(Collectors.toList());
		System.out.println(squareNum);
		
		//odd
		List <Integer> oddNum=num.stream().filter(x-> x % 2!=0).collect(Collectors.toList());
		System.out.println(oddNum);
		
		//starts with m
		List<String> strList=Arrays.asList("maneesh","kumar","mike","smith","mohan", "maneesh","maneesh");
		Set<String> resSet=strList.stream().filter(s-> s.startsWith("m")).collect(Collectors.toSet());
		System.out.println(resSet);
		
		//convert upper case
		resSet=strList.stream().map(s-> s.toUpperCase()).collect(Collectors.toSet());
		System.out.println(resSet);
		
		//how many times present a word
		List<String> resList=strList.stream().filter(s-> s.equals("maneesh")).collect(Collectors.toList());
		System.out.println(resList.get(0)+" present "+resList.size() +" times.");
		
		//sort
		List <Integer> sortNum=num.stream().sorted().collect(Collectors.toList());
		System.out.println(sortNum);
		
		//remove repetition
		List <Integer> distinctNum=num.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNum);
		
		int ij=Integer.valueOf("56");
		System.out.println(ij);
		
		String s="My name is Maneesh";
		List<String> subs=Arrays.asList(s.split(" "));
		String ress=subs.stream().map(x-> makefirstcap(x)).reduce("", (ans,i)->ans+i+" ");	
		System.out.println(ress);
		
	}
	public static String makefirstcap(String strname) {
		
		//String fch=String.valueOf(strname.charAt(0));
		String fch= strname.substring(0,1);
		String lstr=strname.substring(1);
		return fch.toUpperCase()+lstr;
		
	}
}
