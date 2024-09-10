package logica;

public class Caballo extends Pieza{
	public Caballo(int coordenadaX, int coordenadaY) {
		super(coordenadaX,coordenadaY);

	}
	
	@Override
	public int calcularCasillas() {
		if ((coordenadaX==1 || coordenadaX==8 )&&(coordenadaY==1 || coordenadaY==8)){
			
			return 2;
		}
		else if ((coordenadaX==2 || coordenadaX==7 )&&(coordenadaY==2 || coordenadaY==7)) {
			return 4;
			
		}
		else if (coordenadaX==1 || coordenadaX==8 || coordenadaY==1 || coordenadaY==8) {
			return 4;
			
		}
		else {
			return 8;
		}
		
		
	}
	
}

