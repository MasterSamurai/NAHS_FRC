package Commands;

import org.usfirst.frc.team3694.robot.OI;

import Subsystems.DriveTrain;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class TankDrive {
	public static void tankDrive () {
		if (OI.leftStick.getY() < 0) {
			DriveTrain.left.set(Math.pow(OI.leftStick.getY(), 2) * -1);
		}
		else if (OI.leftStick.getY() > 0) {
			DriveTrain.left.set(Math.pow(OI.leftStick.getY(), 2));
		}
		if (OI.rightStick.getY() < 0) {
			DriveTrain.right.set(Math.pow(OI.rightStick.getY(), 2) * -1);
		}
		else if (OI.rightStick.getY() > 0) {
			DriveTrain.right.set(Math.pow(OI.rightStick.getY(), 2));
		}
	}
	
}
