
public class Coche {

	public Integer velocidad = 0;

	public void acelerar_Laura_Pinedo(int aceleracion) {
		velocidad += aceleracion;
		
	}

	public void decelerar_Laura_Pinedo(int deceleracion) {
		velocidad -= deceleracion;
		if(velocidad < 0) velocidad = 0;
		
	}

}
