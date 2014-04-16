package pdd.bridge1.abstraction;

import pdd.bridge1.interfaz.Bridge;

/*
 * Objetivo: Contiene los métodos base del cual
 * 	el cliente llamara. 
 */
public class Abstraction {

	private Bridge bridge;
	
	public Abstraction(Bridge implementation) {
		bridge = implementation;
	}
	
	public String operation() {
		return "Abstraction " + "<<<<BRIDGE>>>>>" + bridge.operationImp();
	}
	
}//Fin class Abstraction
