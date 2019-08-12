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
		for(int i = 0; i<a.darCasillas().length; i++) {
			for(int j = 0; j<a.darCasillas()[0].length; j++) {
				if(a.darCasillas()[i][j].esMina() == true) {
					contador++;
				}
			}
		}
		
		assertEquals(10,contador);
	}
	
	@Test
	public void mostrarTablero() {
		Buscaminas c = new Buscaminas(Buscaminas.PRINCIPIANTE);
		String tablero = c.mostrarTablero();
		String esperado = " 1 2 3 4 5 6 7 8";
		//cual assert seria mejor para comparar los dos String
		assertEquals(esperado, tablero);
	}
	
	@Test
	public void recorridoEsquinaDerechaSuperior() {
		Buscaminas b = new Buscaminas(Buscaminas.PRINCIPIANTE);
		b.darCasillas()[0][6] = new Casilla(Casilla.MINA);
		
		b.inicializarCasillasLibres();
		int minas = b.recorridoEsquinaDerechaSuperior(1, 8);
		assertEquals(1, minas);
	}

}
