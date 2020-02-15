package _02_Advanced_Robot_Race;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	ArrayList<Robot> racers = new ArrayList<Robot>();
	ArrayList<Thread> threads = new ArrayList<Thread>();
	int speed;

	// Re-do the robot race recipe from level 3 module 0.
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		AdvancedRobotRace robRace = new AdvancedRobotRace();
		robRace.setup();
		System.out.println(robRace.threads.size());
		for (Thread t : robRace.threads) {
			t.start();
		}

	}

	protected void setup() {
		JFrame f = new JFrame();
		f.setSize(800, 300);
		f.setResizable(false);
		Random rand = new Random();
		for (int i = 0; i < 23; i++) {
			racers.add(new Robot(50 + (i * 75), 800));
		}
		for (Robot r : racers) {
			speed = rand.nextInt(10);
			do {
				speed = rand.nextInt(10);
			} while (!(speed > 1));
			r.setSpeed(speed);

		}
		for (int i = 0; i < 23; i++) {
			Robot current = racers.get(i);
			threads.add(new Thread(() -> {
				current.move(800);
			}));
		}

	}
}
