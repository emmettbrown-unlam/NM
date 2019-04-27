package mapa.y.objetos;

public class Jugador{
	private Bomberman sujeto;
	static int maxX;
	static int maxY;
	public Jugador(Bomberman jug) {
		sujeto = jug;
	}
	
	public Bomberman obtenerBomberman() {
		return sujeto;
	}
	
	public void moverIzq(Entidad[][] entMapa) {
		entMapa[sujeto.posY][sujeto.posX] = null;
		sujeto.moverIzq();
		entMapa[sujeto.posY][sujeto.posX] = sujeto;
	}
	
	public void moverDown(Entidad[][] entMapa) {
		entMapa[sujeto.posY][sujeto.posX] = null;
		sujeto.moverIzq();
		entMapa[sujeto.posY][sujeto.posX] = sujeto;
	}
	
	public void moverDer(Entidad[][] entMapa) {
		entMapa[sujeto.posY][sujeto.posX] = null;
		sujeto.moverDer();
		entMapa[sujeto.posY][sujeto.posX] = sujeto;
	}
	
	public void moverUp(Entidad[][] entMapa) {
		entMapa[sujeto.posY][sujeto.posX] = null;
		sujeto.moverUp();
		entMapa[sujeto.posY][sujeto.posX] = sujeto;
	}
	
	public void ponerBomba(Entidad [][] Ent) {
		sujeto.ponerBomba(Ent);
	}
}
