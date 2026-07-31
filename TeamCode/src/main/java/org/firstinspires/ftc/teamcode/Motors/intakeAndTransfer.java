package org.firstinspires.ftc.teamcode.Motors;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class intakeAndTransfer {
    public intakeAndTransfer(HardwareMap hardwareMap, String name) {
        DcMotorEx Transfer = hardwareMap.get(DcMotorEx.class, name);
        DcMotorEx intake = hardwareMap.get(DcMotorEx.class, name);
        intake.setDirection(DcMotor.Direction.FORWARD);
        Transfer.setDirection(DcMotor.Direction.REVERSE);
        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Transfer.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        intake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Transfer.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        intake.setPower(1.0);
        Transfer.setPower(1.0);
    }

}