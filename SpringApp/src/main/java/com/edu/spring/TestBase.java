package com.edu.spring;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;

public class TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("Wiring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Base2 s = (Base2) factory.getBean("base2");
		s.base2display();
	}

}
