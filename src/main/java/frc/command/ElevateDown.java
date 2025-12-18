package frc.command;

import frc.subsystems.ElevatorSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotMap.ElevatorSpeed;

public class ElevateDown extends Command {
    public ElevatorSubsystem ElevatorSubsystem;

    public ElevateDown(ElevatorSubsystem ElevatorSubsystem) {
        this.ElevatorSubsystem = ElevatorSubsystem;
    }

    public void initialize(){
        //put things that need to be initialized here (such as a timer). No need to @Override.
    }

    @Override
    public void execute() {
        //This gets called when the command does. 
        ElevatorSubsystem.setSpeed(-ElevatorSpeed);
    }

    @Override
    public void end(boolean interrDownted) {
        //this gets called when the input stops being given. 
        ElevatorSubsystem.stop();
    }

    @Override
    public boolean isFinished(){
        //If true is returned, the command will stop being run. Can be used to check if a encoder is at right place or limit switch is press (for example)
        return false;
    }
}
