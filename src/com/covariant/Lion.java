package com.covariant;

public class Lion extends Animal{

	public Lion roar() {
		System.out.println("Lion is not roaring");
		return new Lion();
	}
}
