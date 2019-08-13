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
		String esperado = "  1 2 3 4 5 6 7 8"+"\n"+"1 - - - - - - - -"+"\n"+"2 - - - - - - - -"+"\n"+"3 - - - - - - - -"+"\n"+"4 - - - - - - - -"+"\n"+"5 - - - - - - - -"+"\n"+"6 - - - - - - - -"+"\n"+"7 - - - - - - - -"+"\n"+"8 - - - - - - - -";
		assertEquals(esperado, tablero);
	}
	
	@Test
	public void recorridoEsquinaDerechaSuperior() {
		Buscaminas b = new Buscaminas(Buscaminas.PRINCIPIANTE);
		b.darCasillas()[0][6] = new Casilla(Casilla.MINA);
		b.darCasillas()[1][6] = new Casilla(Casilla.MINA);
		b.darCasillas()[1][7] = new Casilla(Casilla.MINA);
//		b.inicializarCasillasLibres();
		int minas = b.recorridoEsquinaDerechaSuperior(1, 8);
		assertEquals(1, minas);
	}
	
	@Test
	public void recorridoSuperior() {
		Buscaminas d = new Buscaminas(Buscaminas.PRINCIPIANTE);
		d.darCasillas()[1][3] = new Casilla(Casilla.MINA);
//		d.inicializarCasillasLibres();
		int minas = d.recorridoCentroSuperior(0, 3);
		assertEquals(1, minas);
		
	}

}
