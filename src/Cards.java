
public class Cards {

	public static void main(String[] args) {
		

	}
	
	public Deck (String[] rank, String[] suit, int[] value) {
		for (int i = 0; i< rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				unDealt.add(new card(rank[i], suit[j], value[i]));
			}
		}
	}

}
