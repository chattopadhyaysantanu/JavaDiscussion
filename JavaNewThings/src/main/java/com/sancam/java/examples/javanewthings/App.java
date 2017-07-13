package com.sancam.java.examples.javanewthings;

import com.sancam.java.examples.javanewthings.thread.ThreadExtendingThread;
import com.sancam.java.examples.javanewthings.thread.ThreadImplementsRunnable;

/**
 * Hello world!
 *
 */
public class App {

	/*
	 * public static void main( String[] args ) { 
	 * /*When you run this java progran,
	 * the JVM creates a starting thread of execution, which executes the main()
	 * method. By executing mt.start ();, the starting thread tells the JVM to
	 * create a second thread of execution that executes the byte code instructions
	 * comprising the MyThread object's run() method. When the start() method
	 * returns, the starting thread executes its for loop to print a table of
	 * squares, while the new thread executes the run() method to print the
	 * right-angle triangle. You will notice each thread's output tends to
	 * intersperse with the other's output. That results because both threads send
	 * their output to the same standard output stream.
	 * 
	 * This is for 1st main and 1st runin ThreadExteingThread class
	 */

	/*
	 * ThreadExtendingThread mythread=new ThreadExtendingThread(); mythread.start();
	 * 
	 * for (int i = 0; i < 50; i++) System.out.println ("i = " + i + ", i * i = " +
	 * i * i);
	 * 
	 * ThreadImplementsRunnable mythread1=new ThreadImplementsRunnable();
	 * mythread1.start();
	 * 
	 * }
	 */

	/* 2nd Main Method show isAlive() method*/

	/*public static void main(String[] args) {

		ThreadExtendingThread mythread = new ThreadExtendingThread();
		mythread.start();*/

		/*
		 * The JVM considers the thread to be alive with isAlive() method immediately prior to the thread's
		 * call to run(), during the thread's execution of run(), and immediately after
		 * run() returns.
		 */

		/*while (mythread.isAlive()) {
			try {
				/*
				 * If thread sleep for 1 second then the PI value will negative something like
				 * pi = -0.2146112266265879. The starting thread awoke too soon. Just as the new
				 * thread was beginning to calculate pi, the starting thread woke up, read pi's
				 * current value, and printed that value.
				 */
				/*Thread.sleep(1); // Sleep for 1 milliseconds
			} catch (InterruptedException e) {
			}
			System.out.println("pi = " + mythread.pi);

		}

	}*/
	
	/* 3rd Main Method show join method*/

	/*public static void main(String[] args) {

		ThreadExtendingThread mythread = new ThreadExtendingThread();
		mythread.start();		
		try
	      {*/
			
		/* Because the while loop/isAlive() method/sleep() method technique proves useful, 
		 * Sun packaged it into a trio of methods: join(), join(long millis),
		 * and join(long millis, int nanos). The current thread calls join(),
		 * via another thread's thread object reference when it wants to wait for that other thread to terminate. 
		 * In contrast, the current thread calls join(long millis) or join(long millis, int nanos)
		 * when it wants to either wait for that other thread to terminate 
		 * or wait until a combination of millis millseconds and nanos nanoseconds passes.
		 * Starting thread waits for the thread that associates with the ThreadExtendingThread object, referenced by mythread, to terminate. The starting thread then prints pi's value.
		 * Do not attempt to join the current thread to itself because the current thread will wait forever.)
		 * */
			
			/*mythread.join ();
	      }
	      catch (InterruptedException e)
	      {
	    	  
	      }
	      
		  System.out.println ("pi = " + mythread.pi);
	}*/
	
	/* 4th Main Method to show activeCount method and enumerate method 
	 * Do not depend on activeCount()'s return value when iterating over an array. 
	 * If you do, your program runs the risk of throwing NullPointerException objects. 
	 * Why? Between the calls to activeCount() and enumerate(Thread [] thdarray), 
	 * one or more threads might possibly terminate. 
	 * As a result, enumerate(Thread [] thdarray) would copy fewer thread references into its array. 
	 * Therefore, think of activeCount()'s return value as a maximum value for array-sizing purposes only. 
	 * Also, think of enumerate(Thread [] thdarray)'s return value as representing the number of active threads at the time of a program's call to that method.
	 * */
	
	/*public static void main(String[] args){
		ThreadExtendingThread mythread = new ThreadExtendingThread();
		mythread.start();
		ThreadExtendingThread mythread1 = new ThreadExtendingThread();
		mythread1.start();
		Thread [] threads = new Thread [Thread.activeCount ()];
	    int n = Thread.enumerate (threads);
	    for (int i = 0; i < n; i++)
	           System.out.println (threads [i].toString ());
	}*/
	
	
	/* 5th Main Method to show activeCount method and enumerate method 
	 * A user thread performs important work for the program's user, work that must finish before the application terminates. 
	 * In contrast, a daemon thread performs housekeeping (such as garbage collection) and other background tasks 
	 * that probably do not contribute to the application's main work but are necessary for the application to continue its main work. 
	 * * * */
	
	/*public static void main(String[] args){
		ThreadExtendingThread mythread = new ThreadExtendingThread();
		mythread.start();
		ThreadExtendingThread mythread1 = new ThreadExtendingThread();
		mythread1.start();
		Thread [] threads = new Thread [Thread.activeCount ()];
	    int n = Thread.enumerate (threads);
	    for (int i = 0; i < n; i++)
	           System.out.println (threads [i].toString ());
	}*/
	
}