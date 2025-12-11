package frc.subsystems;

import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class ElevatorSubsystem extends SubsystemBase{
    private TalonFX ElevatorMotor1 = new TalonFX(RobotMap.ElevatorCanID1);
    private TalonFX ElevatorMotor2 = new TalonFX(RobotMap.ElevatorCanID2);
     public ElevatorSubsystem() {
        ElevatorMotor1 = new TalonFX(RobotMap.ElevatorPort1);
        ElevatorMotor2 = new TalonFX(RobotMap.ElevatorPort2);
        
    }

    public void setSpeed(double ElevatorSpeed){
        ElevatorMotor1.setControl(new VoltageOut(ElevatorSpeed));
        ElevatorMotor2.setControl(new VoltageOut(-ElevatorSpeed));

    }
    public void stop(){
        ElevatorMotor1.setControl(new VoltageOut(Output:0));
        ElevatorMotor2.setControl(new VoltageOut(Output:0));

    }
}


