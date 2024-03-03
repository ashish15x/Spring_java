package com.edu.spring;

public class Base2 {

	Base1 bref;
	
	Base2(){
		System.out.println("Base 2");
	}

	public Base1 getBref() {
		return bref;
	}

	public void setBref(Base1 bref) {
		this.bref = bref;
	}
	
	public void base2display() {
		bref.display();
	}

}
