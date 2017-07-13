package com.sancam.java.examples.javanewthings.thread;

public class ThreadImplementsRunnable implements Runnable {
	public void run() {
		System.out.println("Thread Implements Runnable");
	}
	
	Thread t;
	public void start ()
	   {
	      if (t == null)
	      {
	         t = new Thread (this);
	         t.start ();
	      }
	   }

	   public void stop ()
	   {
	      if (t != null)
	         t = null;
	   }
}
