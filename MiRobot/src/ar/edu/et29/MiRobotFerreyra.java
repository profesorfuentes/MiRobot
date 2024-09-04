package ar.edu.et29;

import robocode.Robot;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.HitWallEvent;
import robocode.BulletHitEvent;

/**
 * @author fran
 * 
 */

public class MiRobotFerreyra extends Robot {

	public void run() {

		while (true) {

			// Desplaza el robot 100 pixels hacia adelante
			//ahead(0);

			// Gira el cañon hacia la derecha 90 grados
			//turnGunRight(360);

			// Dispara con la maxima potencia
			//fire(Rules.MAX_BULLET_POWER);

			// Desplaza el robot 100 pixels hacia adelante
			//ahead(50);

			// Gira el cañon hacia la derecha 180 grados
			//turnGunLeft(360);

			// Dispara con la maxima potencia
			//fire(Rules.MAX_BULLET_POWER);

			// Gira hacia la izquierda 90 grados
			//turnLeft(360);

			// Gira el radar hacia la izquierda 15 grados
			//turnRadarLeft(15);
			
			// Escanear otros robots
			//scan();
			
			//turnLeft(360);
			//ahead(10);
			
			fire(Rules.MAX_BULLET_POWER);
			turnRight(90);
			fire(Rules.MAX_BULLET_POWER);
			ahead(50);
			
			
		}
	}

	public void onScannedRobot(ScannedRobotEvent event) {

		// Al escanear un robot
		if (event.getDistance() < 100) {
			// Disparar
			fire(20);
		} else {
			// Disparar
			fire(10);
		}
	}
	
	   public void onHitWall(HitWallEvent event) {

		   // Al colisionar contra una pared
	       out.println("Me choque a " + event.getBearing() + " degrees.");
	       back(200);
	   }	
	   
	   public void onBulletHit(BulletHitEvent event) {
		   
		   // Al acertar un disparo
	       out.println("Le acerte un disparo a " + event.getName() + "!");
	   }	   
}
