class MyThread extends Thread {
	@Override
	public void run(){

		System.out.println("Thread is running");

	}
	
    // TODO: Override the run() method
    // Inside run(), print "Thread is running"
}

public class ExtendThread {
    public static void main(String[] args) {
        // TODO: Create an object of MyThread
        // TODO: Start the thread using start() method
	Thread td= new MyThread();
	td.start();
    }
}
