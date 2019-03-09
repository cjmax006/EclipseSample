package com.learning.selenium;

public class AppTest{
	
	public AppTest(){
		System.out.println("This is constructor");
	}
	
	public void beforeTest(){
		System.out.println("BeforeTest");
	}
	
	public void TC01()
    {
		System.out.println("Test01");
    }

    public void TC02()
    {
    	System.out.println("Test02");
    }
    
    
    public void afterTest(){
    	System.out.println("AfterTest");
    }
    
}
