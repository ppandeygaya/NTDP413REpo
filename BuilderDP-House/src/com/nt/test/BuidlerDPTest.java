package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class BuidlerDPTest {
	public static void main(String[] args) {
		House house=null; 
		System.out.println("BuidlerDPTest.main()");
		//get Proudct object
		house=HouseFactory.getInstance("igloo");
		System.out.println(house);
		 
	}

}
