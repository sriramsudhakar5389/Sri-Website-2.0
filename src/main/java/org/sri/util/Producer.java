package org.sri.util;

public class Producer implements Runnable {

	Q q;
	
	public Producer(Q q){
		this.q = q;
		new Thread(this).start();
	}

	public void run() {
		int i =0;
		
		while(true) {
			q.setN(i++);
		}
		
	}
	
}
