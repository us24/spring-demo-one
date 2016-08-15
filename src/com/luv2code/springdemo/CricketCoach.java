package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public CricketCoach (){
		System.out.println("CricketCoach: inside no-args constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout(){
		return "30 minutes in batting practice and 30 minutes of bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
