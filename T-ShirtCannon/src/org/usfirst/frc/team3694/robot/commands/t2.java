package org.usfirst.frc.team3694.robot.commands;

import org.usfirst.frc.team3694.robot.Robot;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class t2 extends Command {

    public t2() {
        requires(Robot.airshoot);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while (org.usfirst.frc.team3694.robot.OI.shoot.get() == true) {
    		org.usfirst.frc.team3694.robot.subsystems.airShoot.t2.set(Relay.Value.kOn);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
