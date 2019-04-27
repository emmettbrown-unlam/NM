package mapa.y.objetos;
public class Mapa {
	public static final int ANCHO = 5;
	public static final int ALTO = 5;
	private static Entidad[][] entMapa; //Temporal inicialmente
	
	public Mapa() {
		entMapa = new Entidad[ANCHO][ALTO];
		entMapa[1][1] = new Muro(1,1);
		entMapa[1][3] = new Muro(1,3);
		entMapa[3][1] = new Muro(3,1);
		entMapa[3][3] = new Muro(3,3);
		entMapa[2][2] = new Obstaculo(2,2);
		//las posiciones de entMapa que no reciben un objeto quedan en null
	}
	
	public void mostrar() {
		
		for(int i=0; i<ALTO; i++) {
			for(int j=0; j<ANCHO; j++) {
				if(entMapa[i][j] != null) {
					System.out.printf("%s\t",(entMapa[i][j].getClass().getSimpleName()).substring(0, 4));
				}
				else{
					System.out.printf("nulo\t");
				}
			}
			System.out.println();
		}
	}	
	
	public void agregarJugador(Jugador j) {
		if (entMapa[j.obtenerBomberman().posX][j.obtenerBomberman().posY] == null) {
			entMapa[j.obtenerBomberman().posX][j.obtenerBomberman().posY] = j.obtenerBomberman();
		}else {
			System.out.println("Lugar ocupado");
		}	
	}
	
	public static void main(String[] args) {
		Mapa mapa = new Mapa();
		
		Jugador j1 = new Jugador(new Bomberman(0,0));
		Jugador j2 = new Jugador(new Bomberman(4,4));
		mapa.agregarJugador(j1);
		mapa.agregarJugador(j2);
		mapa.mostrar();
		
		j1.moverDer(entMapa);
		j2.moverDer(entMapa);
		
		System.out.println("Se movieron los jugadores");
		mapa.mostrar();
		
		
		System.out.println();
		
		//Usar el bomberman obtenido de cada jugador para poner la bomba
		//j1.obtenerBomberman().ponerBomba(entMapa);
		//j2.obtenerBomberman().ponerBomba(entMapa);
		
		j1.ponerBomba(entMapa); //Temporalmente para poner bombas
		j2.ponerBomba(entMapa); //Temporalmente para poner bombas

		System.out.println();
		mapa.mostrar(); //Mapa con bombas colocadas
	}

}
