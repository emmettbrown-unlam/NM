package mapa.y.objetos;

public class Entidad {
	protected int posX;
	protected int posY;
	protected boolean esVisible;
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public Entidad(final int posX,final int posY)
	{
		this.posX = posX;
		this.posY = posY;
		this.esVisible = true;
	}
	
	public boolean esVisible() {
		return this.esVisible;
	}
	
}
