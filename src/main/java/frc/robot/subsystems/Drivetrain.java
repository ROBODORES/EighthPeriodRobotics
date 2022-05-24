// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  private WPI_TalonSRX leftM1Talon;
  private WPI_TalonSRX RightM1Talon;
  private WPI_TalonSRX leftM2Talon; 
  private WPI_TalonSRX RightM2Talon;
  private DifferentialDrive differentialDrive;
  
  public Drivetrain() {
    leftM1Talon = new WPI_TalonSRX(0);
    RightM1Talon = new WPI_TalonSRX(1);
    leftM2Talon = new WPI_TalonSRX(2);
    RightM2Talon = new WPI_TalonSRX(3);
    MotorControllerGroup leftMotors;
    MotorControllerGroup rightMotors; 
    
    leftMotors = new MotorControllerGroup(leftM1Talon, leftM2Talon);
    leftMotors.setInverted(true);

    rightMotors = new MotorControllerGroup(RightM1Talon, RightM2Talon);

    differentialDrive = new DifferentialDrive(leftMotors,rightMotors);
    
  }

  public void arcadeDrive(double throttle, double turn){
    differentialDrive.arcadeDrive(throttle, turn);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
