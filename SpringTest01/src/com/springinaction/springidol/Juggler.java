package com.springinaction.springidol;

public class Juggler implements Performer{
	private int beanBags = 3;
	
	public Juggler(){};
	
	public Juggler (int beanBags) {
		//
		this.beanBags=beanBags;
	}
	
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}
	//

}
