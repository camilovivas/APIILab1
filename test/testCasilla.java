import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Casilla;

class testCasilla {
	
	@Test
	public void esMina() {
		Casilla a = new Casilla(Casilla.MINA);
		boolean verificacion = a.esMina();
		assertTrue(verificacion == true);
		
	}


}
