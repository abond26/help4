package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class HaolinIsStupid {
    public DcMotor Frontleft, Frontright, Backright, Backleft;
    public LinearOpMode myOpMode;

    public HaolinIsStupid(LinearOpMode opmode){
        myOpMode = opmode;
    }

    public void init(){
        Frontleft = myOpMode.hardwareMap.get(DcMotor.class, "frontLeft");
        Frontright = myOpMode.hardwareMap.get(DcMotor.class, "frontRight");
        Backleft = myOpMode.hardwareMap.get(DcMotor.class, "backLeft");
        Backright = myOpMode.hardwareMap.get(DcMotor.class, "backRight");
        Frontleft.setDirection(DcMotorSimple.Direction.REVERSE);
        Backleft.setDirection(DcMotorSimple.Direction.REVERSE);
    }
}
