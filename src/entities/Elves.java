package entities;

public class Elves implements Comparable<Elves> {
	
	private int elveNum;
	private Integer calories;

	
	public Elves(int elveNum, Integer calories) {
		this.elveNum = elveNum;
		this.calories = calories;
	}


	public int getElveNum() {
		return elveNum;
	}


	public Integer getCallories() {
		return calories;
	}

	@Override
	public int compareTo(Elves other) {
		return -calories.compareTo(other.getCallories());
	}


	@Override
	public String toString() {
		return "Elf num " + getElveNum() + " - " + getCallories() + " callories.";
	}
	
	
	
	
	
	

}
