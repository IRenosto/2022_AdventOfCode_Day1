package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Elves;

public class Program {

	public static void main(String[] args){
		
		//Challenge: https://adventofcode.com/2022/day/1

		File file = new File("input.txt");
		String lineValue;
		int elveNum = 1;
		int calories = 0;
		List<Elves> list = new ArrayList<>();

		try {
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				lineValue = sc.nextLine();
				if (!lineValue.isEmpty()) {
					calories += Integer.parseInt(lineValue);
				} else {
					list.add(new Elves(elveNum, calories));
					elveNum++;
					calories = 0;
				}
			}
			Collections.sort(list);

			sc.close();

			int top3 = 0;

			for (int i = 0; i < 3; i++) {
				System.out.println(list.get(i));
				top3 += list.get(i).getCallories();
			}

			System.out.println();
			System.out.println("Carrying most calories: " + list.get(0));
			System.out.println();
			System.out.println("Calories carried by top 3: " + top3 + " callories.");

		} catch (IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}

	}

}
