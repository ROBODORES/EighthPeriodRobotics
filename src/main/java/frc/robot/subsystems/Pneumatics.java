package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.Pneumatics;


public class Pneumatics extends SubsystemBase {
  // Creates a new Pnuematics Subsystem 

  Solenoid barrel1;
  Solenoid barrel2;
  Solenoid barrel3;
  Solenoid barrel4;
  Solenoid barrel5;
  Solenoid barrel6;

  public void Pneumaticss() {

    this.barrel1 = new Solenoid(PneumaticsModuleType.CTREPCM, 1);
    barrel2 = new Solenoid(PneumaticsModuleType.CTREPCM, 2);
    barrel3 = new Solenoid(PneumaticsModuleType.CTREPCM, 3);
    barrel4 = new Solenoid(PneumaticsModuleType.CTREPCM, 4);
    barrel5 = new Solenoid(PneumaticsModuleType.CTREPCM, 5);
    barrel6 = new Solenoid(PneumaticsModuleType.CTREPCM, 6);
  }

  public void Barrelmeth() {
    this.barrel1.set(false);
  }
}