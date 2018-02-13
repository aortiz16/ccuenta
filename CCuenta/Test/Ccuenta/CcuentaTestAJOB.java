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
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//  import Ccuenta.Ccuenta;   

 
public class CcuentaTestAJOB {
	/**
		 * @author aortiz16
		 *
		 */
	public class Ccuenta {
		private String 	nombre;
		private String 	apellido;
		private double 	saldo;
		private double 	cantidad;
		
		  Ccuenta miCuenta ;     // crear un objeto para todos los metodos

		
		  public Ccuenta(String n, String a, double s, double c) {
			// TODO Ap�ndice de constructor generado autom�ticamente
		}


	//	@BeforeAll                        // copiado de la pizarra  DA ERROR, q Significa esta linea??
	//	static void setupBeforeClass() throws Exception{
			
	//	}
		
		
	/*	//public Ccuenta(String nombre, String apellido, int saldo, int cantidad) {
		public Ccuenta(String n, String a, double s, double pts) {
			// TODO Ap�ndice de constructor generado autom�ticamente  << CONSTRUCTOR DE LA CLASE  >>
			nombre    = n;
			apellido  = a;
			saldo     = s;
			cantidad  = pts;
		}
	}

	*/
		  
		@Before
		public void inicioPruebasAJOB()   throws Exception{
	// 			COMO SERIA LA FORMA CORRECTA ??    ****
	  		nombre = "Ana";
	 		apellido = "Lopez";
	 		saldo = 3200 ;
	 		cantidad = 2;
	 //		Ccuenta miCuenta=new Ccuenta (n, a, s, pts);
	  	
			miCuenta = new Ccuenta (nombre, apellido , saldo ,  cantidad);
	 
			assertNotNull(miCuenta);
		}
	
	
		@After
		public void finPruebasAJOB() {
			miCuenta  = null;  // eliminamos el objeto
		}
		
	
	@Test
	public void testGetSaldoAJOB() {
		//2.-prueba de que al crear una cuenta con un saldo 3200, al obtener el saldo, �ste es correcto
 		assertEquals(3200, (int) miCuenta.getSaldo());//valor esperado y el devuelto
	}


	@Test
	public void testIngresarAJOB() throws Exception {
	//	Ccuenta cuent = new Ccuenta("Ana","L�pez",3200,1);
		int resul = miCuenta.ingresar(300);
		assertEquals(3200+300, (int) miCuenta.getSaldo() ) ; // Valor esperado y el Valor devuelto << SI no coinciden la pruieba falla   >>>

	}

	@Test
	public void testRetirarAJOB() {
		miCuenta.retirar(300);
		assertEquals(3200-300, (int) miCuenta.getSaldo()); 
	}

	@Test(expected=Exception.class)
													//4.-prueba de ingresar una cantidad negativa
	public void testIngresarCantidadNegativaAJOB() throws Exception{
		miCuenta.ingresar(-600);	
	}	
	
	@Test(expected=Exception.class)
													//6.-prueba de retirar m�s dienero de lo que se tiene
	public void testRetirar1AJOB() throws Exception{
		miCuenta.retirar(3300);	
	}

}
}
 
