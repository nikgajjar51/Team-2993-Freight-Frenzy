package org.firstinspires.ftc.team2993;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends OpMode {
    private final ElapsedTime runtime = new ElapsedTime();
    public Hardware robot;

    @Override
    public void init() {
        robot = new Hardware(hardwareMap);
        robot.right_stick_y = gamepad1.right_stick_y;
        robot.right_stick_x = gamepad1.right_stick_x;
        robot.left_stick_x = gamepad1.left_stick_x;
        robot.right_trigger = gamepad1.right_trigger;
        robot.left_trigger = gamepad1.left_trigger;
        robot.a = gamepad1.a;
        robot.b = gamepad1.b;
        robot.x = gamepad1.x;
        robot.y = gamepad1.y;
        robot.dpad_right = gamepad1.dpad_right;
        robot.dpad_left = gamepad1.dpad_left;
        robot.dpad_up = gamepad1.dpad_up;
        robot.dpad_down = gamepad1.dpad_down;
        robot.left_bumper = gamepad1.left_bumper;
        robot.right_bumper = gamepad1.right_bumper;
        telemetry.addData("Status:", "Robot Hardware Initialized");
        telemetry.addData("Status:", "Waiting to Start the Match:");
        telemetry.update();
    }

    public void init_loop() {
    }

    public void start() {
        robot.reset();
    }

    public void loop() {
        robot.normalDriveOp(.85);
        robot.turnOp(1);
        robot.intakeOp(.9);
        robot.liftOp(.6);
        telemetry.addData("Status", "Run Time: " + runtime.toString());
        telemetry.addData("Status:", "Running the Tele-Operation Functions");
        telemetry.update();
    }
}
