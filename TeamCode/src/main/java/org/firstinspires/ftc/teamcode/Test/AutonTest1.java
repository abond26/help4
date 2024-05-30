package org.firstinspires.ftc.teamcode.Test;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HaolinIsStupid;
import org.firstinspires.ftc.teamcode.LevineLocalization.ActionRunnerCenterStageAuton;
import org.firstinspires.ftc.teamcode.LevineLocalization.PointFollower;
import org.firstinspires.ftc.teamcode.LevineLocalization.PosesAndActions;

import java.util.ArrayList;

public class AutonTest1 extends LinearOpMode {
    HaolinIsStupid bot = new HaolinIsStupid(this);
    ActionRunnerCenterStageAuton actionRunner = new ActionRunnerCenterStageAuton(this, bot);
    PointFollower follower = new PointFollower(this, actionRunner);
    public static double xPosStart = 0, yPosStart = 0, headingStart = 90;
    public static double xPosEnd = 10, yPosEnd = 10, headingEnd = 90;
    public static double maxVel = 20;
    @Override
    public void runOpMode() throws InterruptedException {
        ArrayList<PosesAndActions> pointToGoTo = new ArrayList<>();
        Pose2d startPos = new Pose2d(xPosStart, yPosStart, Math.toRadians(headingStart));
        Pose2d endPos = new Pose2d(xPosEnd, yPosEnd, Math.toRadians(headingEnd));
        bot.init();
        pointToGoTo.add(new PosesAndActions(startPos, ""));
        pointToGoTo.add(new PosesAndActions(endPos, ""));
        follower.init(pointToGoTo, false, true);
        waitForStart();
        follower.goToPoints(true, maxVel);
        pointToGoTo.clear();
        pointToGoTo.add(new PosesAndActions(startPos, ""));
        follower.reinit(pointToGoTo);
        follower.goToPoints(true, maxVel);

        }
    }
}
