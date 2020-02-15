package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	static Robot r1 = new Robot(200, 300);
	static Robot r2 = new Robot(300, 300);
	static Robot r3 = new Robot(400, 300);
	static Robot r4 = new Robot(250, 350);
	static Robot r5 = new Robot(350, 350);
	static Robot[] robots = new Robot[5];
	


	public static void main(String[] args) {
r1.setPenColor(Color.blue);
r2.setPenColor(Color.black);
r3.setPenColor(Color.red);
r4.setPenColor(Color.green);
r5.setPenColor(Color.yellow);

		robots[0] = r1;
		robots[1] = r2;
		robots[2] = r3;
		robots[3] = r4;
		robots[4] = r5;
		for (Robot r : robots) {
			r.penDown();
			r.hide();
		}
		Thread ring1 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r1.move(1);
				r1.turn(1);
			}

		});
		Thread ring2 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r2.move(1);
				r2.turn(1);
			}

		});
		Thread ring3 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r3.move(1);
				r3.turn(1);
			}

		});
		Thread ring4 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r4.move(1);
				r4.turn(1);
			}

		});
		Thread ring5 = new Thread(() -> {
			for (int i = 0; i < 360; i++) {
				r5.move(1);
				r5.turn(1);
			}

		});


		ring1.start();
		ring2.start();
		ring3.start();
		ring4.start();
		ring5.start();


	}

}