
public class Cards {
	

	private String rank;
	private String suit;
	private int pointValue;
	
	
	public String getRank () {
		return rank;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getPointValue() {
		return pointValue;
	}
	
	public boolean equals (Cards otherCard) {
		if (pointValue == otherCard.getPointValue()) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return ""; //ahh
	}
	
	

}
