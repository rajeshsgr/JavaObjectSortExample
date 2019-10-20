package com.raj.nola.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortContestants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Contestant> contestantsList = new ArrayList<>();

		Contestant obja = new Contestant("Andreas", 24, 10, 300);
		Contestant objb = new Contestant("Mike", 36, 8, 325);
		Contestant objc = new Contestant("Galvin", 30, 10, 200);
		Contestant objd = new Contestant("Terry", 28, 8, 275);
		Contestant obje = new Contestant("Carlos", 32, 10, 350);

		contestantsList.add(obja);
		contestantsList.add(objb);
		contestantsList.add(objc);
		contestantsList.add(objd);
		contestantsList.add(obje);

		System.out.println("Contestants (Before Sorting) : " + contestantsList);

		Collections.sort(contestantsList);

		System.out.println("Contestants (After Sorting Ascending) : " + contestantsList);

		Collections.sort(contestantsList, Collections.reverseOrder());

		System.out.println("Contestants (After Sorting Descending) : " + contestantsList);

	}

}
