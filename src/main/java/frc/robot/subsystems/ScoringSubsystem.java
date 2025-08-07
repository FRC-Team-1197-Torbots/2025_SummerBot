package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ScoringSubsystem extends SubsystemBase{
    private final SparkFlex m_turningMotor;
    private final double MotorSpeed = 0.6f;

    public ScoringSubsystem() {
        m_turningMotor = new SparkFlex(10, MotorType.kBrushless);
    }

    public void MotorON() {
        m_turningMotor.set(MotorSpeed);
    }

    public void MotorOFF() {
        m_turningMotor.set(0);
    }

    public void setA() {
        MotorON();
    }
}
