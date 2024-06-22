package com.FoodDeliveryApp;

public abstract class FoodDeliveryApp 
{
	abstract void orderPlacement();
	abstract void orderTracking();	
	abstract void delivery();
	abstract void payment();
}

class Zomato extends FoodDeliveryApp
{

	@Override
	void orderPlacement() 
	{
		// TODO Auto-generated method stub
		System.out.println("Order Placed in Zamato");
	}

	@Override
	void orderTracking()
	{
		// TODO Auto-generated method stub
		System.out.println("Tracking the order");
	}
	
	@Override
	void delivery()
	{
		// TODO Auto-generated method stub
		System.out.println("Delivery on the way");
	}

	@Override
	void payment()
	{
		// TODO Auto-generated method stub
		System.out.println("Ready the money");
	}	
}

class Swiggy extends FoodDeliveryApp
{
	@Override
	void orderPlacement() 
	{
		// TODO Auto-generated method stub
		System.out.println("Order Placed in Swiggy");
	}

	@Override
	void orderTracking()
	{
		// TODO Auto-generated method stub
		System.out.println("Tracking the order of Swiggy");
	}
	
	@Override
	void delivery()
	{
		// TODO Auto-generated method stub
		System.out.println("Delivery on the way by Swiggy");
	}

	@Override
	void payment()
	{
		// TODO Auto-generated method stub
		System.out.println("Ready the money for Swiggy");
	}
}

class EatSure extends FoodDeliveryApp
{
	@Override
	void orderPlacement() 
	{
		// TODO Auto-generated method stub
		System.out.println("Order Placed in EatSure");
	}

	@Override
	void orderTracking()
	{
		// TODO Auto-generated method stub
		System.out.println("Tracking the order of EatSure");
	}
	
	@Override
	void delivery()
	{
		// TODO Auto-generated method stub
		System.out.println("Delivery on the way by EatSure");
	}

	@Override
	void payment()
	{
		// TODO Auto-generated method stub
		System.out.println("Ready the money for EatSure");
	}
}