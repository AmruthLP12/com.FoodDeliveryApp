package com.FoodDeliveryApp;

import java.util.Scanner;

public class MainFoodDeliveryApp
{
	public static void app()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("Enter the food delivary app name you want");
		System.out.println("=================================");
		String app = sc.next();
		if(app.equals("Zomato"))
		{
			FoodDeliveryApp fda ;
			fda = new Zomato();
			fda.orderPlacement();
			fda.orderTracking();
			fda.delivery();
			fda.payment();
		}
		else if(app.equals("Swiggy"))
		{
			FoodDeliveryApp fda ;
			fda = new Swiggy();
			fda.orderPlacement();
			fda.orderTracking();
			fda.delivery();
			fda.payment();
		}
		else if(app.equals("EatSure"))
		{
			FoodDeliveryApp fda ;
			fda = new EatSure();
			fda.orderPlacement();
			fda.orderTracking();
			fda.delivery();
			fda.payment();
		}
		else 
		{
			System.out.println("Invaid Data");
		}
		app();
	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		app();

	}
}
