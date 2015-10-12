package com.esprit;

import java.util.Arrays;
import java.util.List;

import com.esprit.exceptions.CouldNotStartException;

public class Car {
	SmsModule smsModule;
	private boolean started = false;

	public boolean isStarted() {
		return started;
	}
	public void turnKey(String string) {
		List<String> directions = Arrays.asList("LEFT", "RIGHT");
		if (!directions.contains(string)) {
			if(smsModule.isReady())
			{
				try {
					smsModule.send("", "alarm");
					
				} catch (IllegalArgumentException e) {
System.out.println("enter phone number");				}
		
			}
			throw new CouldNotStartException();
		}
		if (string.equals("RIGHT")) {
			started = true;
			return;
		}
		if (string.equals("LEFT")) {
			started = false;
		}

	}

}
