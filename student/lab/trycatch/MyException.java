package com.olympic.cis143.m05.student.lab.trycatch;

@SuppressWarnings("serial")
public class MyException extends Exception{
	
	public MyException(String msg, Throwable t) {
		super(msg, t);
	}
}
