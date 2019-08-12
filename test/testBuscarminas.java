import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Buscaminas;
import modelo.Casilla;

class testBuscarminas {

	@Test
	void test() {
		
	}
	@Test
	public void generarMinas(){
		Buscaminas a = new Buscaminas(Buscaminas.PRINCIPIANTE);
		int contador = 0;
		for(int i = 0; i<a.casillas.length; i++) {
			for(int j = 0; j<a.casillas[0].length; j++) {
				if(a.casillas[i][j].esMina() == true) {
					contador++;
				}
			}
		}
		
		assertEquals(10,contador);
	}
	
	@Test
	public void mostrarTablero() {
		
		
	}
	
	@Test
	public void recorridoEsquinaDerechaSuperior() {
		Buscaminas b = new Buscaminas(Buscaminas.PRINCIPIANTE);
		b.casillas[0][6] = new Casilla(Casilla.MINA);
		b.inicializarCasillasLibres();
		int minas = b.recorridoEsquinaDerechaSuperior(1, 8);
		assertEquals(1, minas);
	}

}
