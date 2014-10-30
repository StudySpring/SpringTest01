package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		//
		//Juggler myJuggler = new Juggler(12);
		//myJuggler.perform();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/springidol.xml");
				/*Performer performer = (Performer) ctx.getBean("duke");
				performer.perform();
				Performer poeticDuke = (Performer) ctx.getBean("poeticDuke");
				poeticDuke.perform();
				Performer kenyPerformer = (Performer) ctx.getBean("kenny");
				kenyPerformer.perform();
				Performer keny2Performer = (Performer) ctx.getBean("kenny2");
				keny2Performer.perform();
				System.out.println("hank");
				Performer hankPerformer = (Performer) ctx.getBean("hank");
				hankPerformer.perform();
				System.out.println("carl");
				Performer carlPerformer = (Performer) ctx.getBean("carl");
				carlPerformer.perform();*/
				Thinker thinker = new Volunteer();
				thinker.thinkOfSomething("hi-hi");
		//Poem sonnet29 = new Sonnet29();
		//Performer duke = new PoeticJuggler(15, sonnet29);
	}
}
