/**
 * /**
 * @author aortiz16
 * @version 1.1
 * {@code 15/02/18}
 
 */

package Ccuenta;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 // import Ccuenta.Ccuenta;

 
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
		
	//	@BeforeAll                        // copiado de la pizarra  DA ERROR, q Significa esta linea??
	//	static void setupBeforeClass() throws Exception{
			
	//	}
		
		//public Ccuenta(String nombre, String apellido, int saldo, int cantidad) {
		public Ccuenta(String n, String a, double s, double pts) {
			// TODO Apéndice de constructor generado automáticamente  << CONSTRUCTOR DE LA CLASE  >>
			nombre    = n;
			apellido  = a;
			saldo     = s;
			cantidad  = pts;
		}
	}

	
		@Before
		public void inicioPruebas() {
		//	Ccuenta = new Ccuenta("Ana","López",3200,1);
			Ccuenta miCuenta=new Ccuenta ("Ana", "Lopez", 3200, 2);
			assertNotNull(miCuenta);
		}
	
	
	@After
	public void finPruebas() {
		miCuenta  = null;  // eliminamos el objeto
	}
	
	
	@Test
	public void testGetSaldoCRM() {
		//2.-prueba de que al crear una cuenta con un saldo 3200, al obtener el saldo, éste es correcto
 		assertEquals(3200, (int) miCuenta.getSaldo());//valor esperado y el devuelto
	}


	@Test
	public void testIngresarAJOB() throws Exception {
	//	Ccuenta cuent = new Ccuenta("Ana","López",3200,1);
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
													//6.-prueba de retirar más dienero de lo que se tiene
	public void testRetirar1CRM() throws Exception{
		miCuenta.retirar(3300);	
	}

}
	
 
