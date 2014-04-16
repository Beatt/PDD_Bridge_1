package pdd.bridge1.test;

import pdd.bridge1.abstraction.Abstraction;
import pdd.bridge1.implementaciones.ImplementationA;
import pdd.bridge1.implementaciones.ImplementationB;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Bridge Pattern\n");
		System.out.println(new Abstraction(new ImplementationA()).operation());
		System.out.println(new Abstraction(new ImplementationB()).operation());
	}

}//Fin class Test
