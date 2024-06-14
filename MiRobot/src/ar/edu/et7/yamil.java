
import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.Robot;

//TODO Renombrar este archivo y el nombre de la clase, 
//el nombre debe incluir el apellido del alumno

public class Yamil extends AdvancedRobot {
	
	public void run() {
		
		while(true) {
			
			//TODO modificar este bloque de código y recargar 
			//en Robocode presionando Restart
			
			setAllColors(Color.RED);
			
            ahead(156);

            turnGunRight(91);

            back(150);
            
            fire (12);

            turnGunRight(90);		
			
			getRadarHeading();
			
			fire(15);
			
			execute();		}
	
	}
}
