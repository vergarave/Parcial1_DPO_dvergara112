package logica;

public class Rey extends Pieza{
	public Rey(int coordenadaX, int coordenadaY) {
		super(coordenadaX,coordenadaY);
	}
	@Override
	public int calcularCasillas() {
		if ((coordenadaX==1 || coordenadaX==8 )&&(coordenadaY==1 || coordenadaY==8)) {
			return 3;
		}
		else if (coordenadaX==1 || coordenadaX==8 || coordenadaY==1 || coordenadaY==8) {
			return 5;
		}
		else {
			return 8;
		}
		
	}
	}