package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> taskQueue;

	@Override
	public void run() {
		while (!taskQueue.isEmpty()) {
			taskQueue.remove().perform();
		}
	}

	Worker(ConcurrentLinkedQueue<Task> taskQueue) {
		this.taskQueue = taskQueue;
	}

}
