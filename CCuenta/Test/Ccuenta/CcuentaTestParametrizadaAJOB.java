/**
 * 
 * @author aortiz16
 *  
 * {@code 15/02/18}  
 *  
 * @Version 2.0  - 15 / 2 / 18 -
 *  
 * 
 */
 
package Ccuenta;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;//importaciones necesarias
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

 


@RunWith(Parameterized.class)
public class CcuentaTestParametrizadaAJOB {
	 private String nombre;
	 private String cuenta;
	 private double saldo;
	 private double interes;
	 
	 public CcuentaTestParametrizadaAJOB(String nom, String cue, double sal, double tipoI){
		 nombre=nom;
		 cuenta=cue;
		 saldo=sal;
		 interes=tipoI;
		 
	 }
	  Ccuenta miCuenta ;     // crear un objeto para todos los metodos

		
	//  public Ccuenta(String n, String a, double s, double c) {
		// TODO Apéndice de constructor generado automáticamente  	}



	 @Parameters
	 public static Collection<Object[]> datos(){
		 //Bateria de pruebas a realizar
		 return Arrays.asList(new Object[] []{
			 {"Pablo", "Sánchez", 3200, 2}, {"Maria", "Gónzalez", 4500, 2.7}, 
			 {"Pablos", "Motos", 1800, 3}, {"Cris", "Gómez", 6850, 1.8 }   } ) ;
		 }
	 
	

	@Test
	public void testIngresarAJOB() {
	//	Ccuenta miCuenta=new Ccuenta(nombre, cuenta, saldo, interes);
		int resultado=(int) miCuenta.getSaldo();
		assertEquals((int)saldo, resultado); //valor esperado y el devuelto
			
	}
	
	@Test
	public void testRetirarAJOB() throws Exception{
		
	//	Ccuenta miCuenta=new Ccuenta(nombre, cuenta, saldo, interes);
		miCuenta.retirar(200);
		assertEquals((int)saldo-200, (int) miCuenta.getSaldo()); //valor esperado y el devuelto
	}

	 
	@Test
	public void testGetCuenta() {
		fail("No implementado aun");
		
	}

	/*
	@Test(expected=Exception.class)    //  retirar más dienero de lo que se tiene 			
		public void testRetirar1AJOB() throws Exception{
		miCuenta.retirar(3300);	
		}
	*/
}
