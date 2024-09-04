package ar.edu.et29;

import robocode.Robot;
import robocode.Rules;
import robocode.ScannedRobotEvent;
import robocode.HitWallEvent;
import robocode.BulletHitEvent;

/**
 * @author nombrealumno
 * 
 */

public class MiRobotFerreyra extends Robot {

	public void run() {

		while (true) {

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
			fire(10);
		} else {
			// Disparar
			fire(5);
		}
	}
	
	   public void onHitWall(HitWallEvent event) {

		   // Al colisionar contra una pared
	       out.println("Choque contra la pared en direccion " + event.getBearing() + " degrees.");
	   }	
	   
	   public void onBulletHit(BulletHitEvent event) {
		   
		   // Al acertar un disparo
	       out.println("Le acerte un disparo a " + event.getName() + "!");
	   }	   
}
