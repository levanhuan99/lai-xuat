package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double money=1.0;
	    int month=1;
	    double interest_rate=1.0;

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your money: ");
        money=input.nextDouble();
        System.out.println("Enter your month: ");
        month=input.nextInt();
        System.out.println("Enter your interest rate: ");
        interest_rate=input.nextDouble();

        double total_interest=0;
        for (int i=0;i<month;i++){
            total_interest  = money*(interest_rate/100)/12 *month;
        }
        System.out.println("your total money : "+ total_interest);


    }
}
