package com.esprit;

public interface SmsModule {
boolean isReady();
	
	void send(String mg,String number);
}
