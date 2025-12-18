package frc.subsystems;

import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class ShooterSubsystem extends SubsystemBase{
    private TalonFX UpperMotor = new TalonFX(RobotMap.UpperCanID);
    private TalonFX LowerMotor = new TalonFX(RobotMap.LowerCanID);
     
    public ShooterSubsystem() {
        UpperMotor = new TalonFX(RobotMap.UpperShooterPort);
        LowerMotor = new TalonFX(RobotMap.LowerShooterPort);  
    }

    public void run (){
        UpperMotor.setControl(new VoltageOut(RobotMap.UpperShooterSpeed));
        LowerMotor.setControl(new VoltageOut(-RobotMap.LowerShooterSpeed));
    }
    public void stop(){
        UpperMotor.setControl(new VoltageOut(0));
        LowerMotor.setControl(new VoltageOut(0));
    }
}


