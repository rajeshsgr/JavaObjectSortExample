package com.raj.nola.comparable;

import java.util.ArrayList;
import java.util.List;

public class LambdaSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Contestant> contestantsList = new ArrayList<>();

		Contestant obja = new Contestant("Andreas", 24, 14, 300);
		Contestant objb = new Contestant("Mike", 36, 8, 325);
		Contestant objc = new Contestant("Galvin", 30, 12, 200);
		Contestant objd = new Contestant("Terry", 28, 15, 275);
		Contestant obje = new Contestant("Carlos", 32, 10, 350);

		contestantsList.add(obja);
		contestantsList.add(objb);
		contestantsList.add(objc);
		contestantsList.add(objd);
		contestantsList.add(obje);
		
		contestantsList.forEach((s)->System.out.println(s));
		
	    System.out.println("Sort Contestants by Max Rep:"); 
	      
	    contestantsList.sort((Contestant c1, Contestant c2)->c1.getMaxRep()-c2.getMaxRep());  

		contestantsList.forEach((s)->System.out.println(s));
		
		System.out.println("Sort Contestants by Max Weight Ascending:"); 
		
	    contestantsList.sort((Contestant c1, Contestant c2)->c1.getMaxWeight()-c2.getMaxWeight());  

		contestantsList.forEach((s)->System.out.println(s));
		
		
		System.out.println("Sort Contestants by Max Weight Descending:"); 
		
	    contestantsList.sort((Contestant c1, Contestant c2)->c2.getMaxWeight()-c1.getMaxWeight());  

		contestantsList.forEach((s)->System.out.println(s));

		
	}

}
