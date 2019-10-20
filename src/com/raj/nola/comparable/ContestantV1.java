package com.raj.nola.comparable;

public class ContestantV1 {
	
	private String contestantName;
	
	private int age;
	
	private int maxRep;
	
	private int maxWeight;
	

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
		return "ContestantV1 [contestantName=" + contestantName + ", age=" + age + ", maxRep=" + maxRep + ", maxWeight="
				+ maxWeight + "]";
	}
	
	

}
