package com.springinaction.springidol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UITestClass {
	@Test
	public void magicianShouldReadVolunteersMind() {
		Thinker volunteer = new Volunteer();
		MindReader magician = new Magician();
	volunteer.thinkOfSomething("Queen of Hearts");
	assertEquals("Queen of Hearts", magician.getThoughts());
	}
}
