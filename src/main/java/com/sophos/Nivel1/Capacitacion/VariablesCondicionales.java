package com.sophos.Nivel1.Capacitacion;

import java.util.Scanner;

public class VariablesCondicionales {
	
	Scanner reader = new Scanner(System.in);
	
	private  void variables () {
		byte variableByte1;
		byte variableByte2;
		short variableShort1;
		short variableShort2;
		int variableInt1;
		int variableInt2;
		long variableLong1;
		long variableLong2;
		float variableFloat1;
		float variableFloat2;
		double variableDouble1;
		double variableDouble2;
		boolean variableBoolean1;
		boolean variableBoolean2;
		char variableChar1;
		char variableChar2;
		String variableString1;
		String variableString2;
		
		variableByte1 = reader.nextByte();
		
		if (variableByte1 > 18) {
			
			System.out.print("Usted es mayor de edad");
		}else {
			
			System.out.print("Usted es menor de edad");
		}
	 
	}

}
