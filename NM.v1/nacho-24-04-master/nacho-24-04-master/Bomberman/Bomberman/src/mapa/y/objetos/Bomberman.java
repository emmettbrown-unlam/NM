package mapa.y.objetos;

public class Bomberman extends Entidad {
	private static int nroBomberman = 0;
	private int idBomberman;
	private Entidad[][] entMapa;

	public Bomberman(final int posIniX, final int posIniY) {
		super(posIniX, posIniY);
		idBomberman = nroBomberman;
		nroBomberman++;
	}

	public void morir() {
		if (this.esVisible == true) {
			esVisible = false;
			System.out.println("El bomberman ha muerto");
		}

	}
	
	public void ponerBomba(Entidad[][] entMapa ) {
		entMapa[posX][posY] = new Bomba(posX,posY);
		System.out.println("SE HA PUESTO LA BOMBA");
	}

	public void moverIzq() {
		if (this.posX > 0) {
			this.posX--;
		}
			
	}

	public void moverDer() {
		if (Mapa.ANCHO-1 > this.posX) {
			this.posX++;
		}
		
	}
	public void moverUp() {
		if (posY > 0) {
			this.posY--;
		}
			
	}

	public void moverDown() {
		if (Mapa.ALTO-1 > posY) {
			this.posY++;
		}
		
	}

}
