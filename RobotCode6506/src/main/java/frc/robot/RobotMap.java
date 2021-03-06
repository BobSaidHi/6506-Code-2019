/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import frc.robot.subsystems.Spintake;
import frc.robot.subsystems.Tentacle;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static Spintake spinboi = new Spintake();
  public static Tentacle arm = new Tentacle();

  public static final int SPINTAKE_MOTOR_1 = 3;
  public static final int SPINTAKE_MOTOR_2 = 4;

  // bob r
  public static final int ARM_MOTOR = 2;

  // drive
  public static final int DRIVE_MOTORS_L = 0;
  public static final int DRIVE_MOTORS_R = 1;

  // digital inputs
  public static final int ENCODER_DIGITAL1 = 0;
  public static final int ENCODER_DIGITAL2 = 1;
}