package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Arm;

public class ArmDown extends Command {
     private int setpoint;
    private final Arm arm;
    private final double speed;
    public ArmDown(Arm armSubsystem, double speed, int set){
        arm = armSubsystem;
        setpoint = set;
        this.speed = speed;
        addRequirements(armSubsystem);
    }
    @Override
    public void execute() {
      arm.movedown(speed, setpoint);
    }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    arm.stop();
  }
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
