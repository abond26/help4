package org.firstinspires.ftc.teamcode.Test;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HaolinIsStupid;
import org.firstinspires.ftc.teamcode.MecanumDrive;

public class HaolinCantDrive extends LinearOpMode {
    public HaolinIsStupid botboy = new HaolinIsStupid(this);
    public MecanumDrive drive;
    public static double movementSpeed = 0.5;
    @Override
    public void runOpMode() throws InterruptedException {
        botboy.init();
        drive = new MecanumDrive(botboy.Frontleft, botboy.Frontright, botboy.Backleft, botboy.Backright);
        waitForStart();
        while (opModeIsActive()){
            double ly1 = gamepad1.left_stick_y;
            double lx1 = gamepad1.left_stick_x;
            double rx1 = gamepad1.right_stick_x;
            drive.moveInTeleop(lx1, ly1, rx1, movementSpeed);
        }
    }
}
