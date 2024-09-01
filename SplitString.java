package com.stringClass;

public class SplitString {

	public static void main(String[] args) {
int[] x= {10,20,30};
String s1[] ={"hello java"};
String s= new String ("hello,java,programming");
String [] split=s.split(",");
for (String  sp: split) {
	System.out.println(sp);
}
	
	}

}
