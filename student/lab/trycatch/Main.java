package com.olympic.cis143.m05.student.lab.trycatch;

public class Main {

    public static void main (String[] a) {
        Main main = new Main();
        main.testNeedsToBeModified();;
    }

    public void testNeedsToBeModified() {
        try {
			new ThrowsException().throwAnExceptionForMe();
		} catch (MyException err) {
			System.out.println("Exception caught.");
			throw new RuntimeException();
		}
    }
}
