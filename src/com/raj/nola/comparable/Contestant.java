package com.raj.nola.comparable;

public class Contestant implements Comparable<Contestant>{
	
	private String contestantName;
	
	private int age;
	
	private int maxRep;
	
	private int maxWeight;

	
	
	
	public Contestant(String contestantName, int age, int maxRep, int maxWeight) {
		super();
		this.contestantName = contestantName;
		this.age = age;
		this.maxRep = maxRep;
		this.maxWeight = maxWeight;
	}




	public String getContestantName() {
		return contestantName;
	}




	public void setContestantName(String contestantName) {
		this.contestantName = contestantName;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int getMaxRep() {
		return maxRep;
	}




	public void setMaxRep(int maxRep) {
		this.maxRep = maxRep;
	}




	public int getMaxWeight() {
		return maxWeight;
	}




	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}


	


	@Override
	public String toString() {
		return "Contestant [contestantName=" + contestantName + ", age=" + age + ", maxRep=" + maxRep + ", maxWeight="
				+ maxWeight + "]";
	}




	@Override
	public int compareTo(Contestant anotherContestant) {
		// TODO Auto-generated method stub
		
		
		return this.getMaxWeight()-anotherContestant.getMaxWeight();
		
	}
	
	

}
