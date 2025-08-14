package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

public class ScoringSubsystem extends SubsystemBase {
    private final SparkFlex m_turningMotor;
    private final double MotorSpeed = 0.1f;

    public ScoringSubsystem() {
        m_turningMotor = new SparkFlex(DriveConstants.kScoringTurningCanId, MotorType.kBrushless);
    }

    public void MotorON() {
        m_turningMotor.set(MotorSpeed);
    }

    public void MotorOFF() {
        m_turningMotor.set(0);
    }
}