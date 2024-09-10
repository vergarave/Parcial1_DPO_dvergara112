package logica;


public abstract class Pieza{
	protected int coordenadaX;
	protected int coordenadaY;
	
	public int getX(){
		return coordenadaX;
	}
	public int getY(){
		return coordenadaY;
	}
	public void setX(int coordenadaX){
		this.coordenadaX=coordenadaX;
	}
	public void setY(int coordenadaY){
		this.coordenadaY=coordenadaY;
		}
	public Pieza(int coordenadaX, int coordenadaY) {
		this.coordenadaX=coordenadaX;
		this.coordenadaY=coordenadaY;
	}
	
	public abstract int calcularCasillas();
}
