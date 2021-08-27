package com.firstmaven.maven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Enter your input ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<0)
        {
        	System.out.println("You entered a negative value");
        	
        }
        else
        {
        	System.out.println("You entered a positive value");
        }
        sc.close();
    }
}
