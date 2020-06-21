package com.sophos.Nivel1.Capacitacion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        	Carro carro = new Carro();
        	carro.setCantidadDeLlantas(4);
        	carro.setColor("Negro");
        	carro.setTipoFuenteEnergia("Electrico");
        	
        System.out.print ("" + carro.getCantidadDeLlantas() + "," + carro.getColor() + "," + carro.getTipoFuenteEnergia());
    }
}
