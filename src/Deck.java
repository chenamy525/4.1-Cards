import java.util.ArrayList;

public class Deck {
	
	ArrayList<Cards> unDealt;
	ArrayList<Cards> Dealt;
	
	public Deck (String[] rank, String[] suit, int[] value) {
		this.Dealt = new ArrayList<Cards>();
		this.unDealt = new ArrayList <Cards>();
		
		for (int i = 0; i< rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				unDealt.add(new Cards(rank[i], suit[j], value[i]));
			}
		}
	}
	
	public boolean isEmpty() {
		if (unDealt.size() == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return unDealt.size();
	}
	
	
	public Cards deal() {
		if (isEmpty()==false) {
		//	Cards card = new Cards(_____);
			
		}
	}
	
	public void shuffle() {
		
		
	}
	
	

}
