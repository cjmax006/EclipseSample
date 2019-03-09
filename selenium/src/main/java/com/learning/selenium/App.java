package com.learning.selenium;

import org.testng.annotations.Test;

public class App{
	
	@Test
	public void TestRun()
    {
        System.out.println( "Hello World!" );
        
        AppTest obj = new AppTest();
        obj.beforeTest();
        obj.TC01();
        obj.TC02();
        obj.afterTest();
    }
}
