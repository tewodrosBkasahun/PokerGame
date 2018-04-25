package poker;

/**
 *
 * @author Tewodros Kasahun
 */
public class Deck {

	private Card[] cards;

	/**
	 * This contractor will create a deck of cards
	 */
	public Deck() {
		cards = new Card[45];
		int deckLength = cards.length;
		for (int i = 0; i < deckLength; i++) {
			if (i <= 8) {
				cards[i] = new Card(i + 1, 0);
			} else if (i > 8 && i <= 17) {
				cards[i] = new Card((i - 8), 1);
			} else if (i > 17 && i <= 26) {
				cards[i] = new Card((i - 17), 2);
			} else if (i > 26 && i <= 35) {
				cards[i] = new Card((i - 26), 3);
			} else if (i > 35 && i <= 44) {
				cards[i] = new Card((i - 35), 4);
			}
		}
	}

	/**
	 * This contractor will create a deck of cards from another deck of cards
	 * 
	 * @param other
	 */
	public Deck(Deck other) {
		cards = new Card[other.cards.length];
		int lengthOfOther = cards.length;
		for (int i = 0; i < lengthOfOther; i++) {
			cards[i] = other.cards[i];
		}

	}

	/**
	 * This method will return the card at a position in the deck
	 * 
	 * @param position
	 * @return
	 */
	public Card getCardAt(int position) {
		return cards[position];
	}

	/**
	 * This method will return the number of cards in the deck
	 * 
	 * @return
	 */
	public int getNumCards() {
		return cards.length;
	}

	/**
	 * This method deal cards to players
	 * 
	 * @param numCards
	 * @return
	 */
	public Card[] deal(int numCards) {
		Card[] dealit = new Card[numCards];
		for (int i = 0; i < numCards; i++) {
			dealit[i] = cards[i];
		}
		int remaning = cards.length - numCards;
		Card[] remains = new Card[remaning];
		for (int i = 0; i < remaning; i++) {
			remains[i] = cards[i + numCards];
		}
		cards = remains;
		return dealit;
	}

	/**
	 * This method will cut the deck at a specified
	 * 
	 * @param position
	 */
	public void cut(int position) {
		Card[] takeFrontPart = new Card[position];
		for (int i = 0; i < takeFrontPart.length; i++) {
			takeFrontPart[i] = cards[i];
		}
		Card[] takeRemaining = new Card[cards.length - position];
		for (int i = position; i < cards.length; i++) {
			takeRemaining[i - position] = cards[i];
		}
		for (int i = 0; i < takeRemaining.length; i++) {
			cards[i] = takeRemaining[i];
		}
		for (int i = takeRemaining.length; i < cards.length; i++) {
			cards[i] = takeFrontPart[i - takeRemaining.length];
		}

	}

	/**
	 * This method will shuffle the deck
	 */
	public void shuffle() {
		if (cards.length <= 3) {

		} else {
			int DivByTree = cards.length % 3;
			Card[] shuffled = new Card[cards.length];
			if (DivByTree == 0) {
				int sub = cards.length / 3;
				int count1 = 0;
				int count2 = 0;
				int count3 = 0;
				for (int i = 0; i < cards.length; i++) {
					if (i % 3 == 0) {
						shuffled[i] = cards[sub + sub + count1];
						count1++;
					} else if (i % 3 == 1) {
						shuffled[i] = cards[sub + count2];
						count2++;
					} else {
						shuffled[i] = cards[count3];
						count3++;
					}
				}
				cards = shuffled;
			} else if (DivByTree == 2) {
				int sub = (cards.length / 3);
				int subTop = (cards.length / 3) + 1;
				int subBottom = (cards.length / 3) + 1;

				int count1 = 0;
				int count2 = 0;
				int count3 = 0;
				for (int i = 0; i < cards.length; i++) {
					if (i % 3 == 0) {
						shuffled[i] = cards[sub + subBottom + count1];
						count1++;
					} else if (i % 3 == 1) {
						shuffled[i] = cards[sub + count2];
						count2++;
					} else {
						shuffled[i] = cards[count3];
						count3++;
					}

				}
				cards = shuffled;
			} else {
				int sub = (cards.length / 3) - 1;
				int subTop = (cards.length / 3) + 2;
				int subBottom = (cards.length / 3) + 2;

				int count1 = 0;
				int count2 = 1;
				int count3 = 1;
				int count4 = 0;

				for (int i = 0; i < cards.length; i++) {
					if (i % 3 == 0) {
						shuffled[i] = cards[sub + subBottom + count1];
						count1++;
					} else if (i % 3 == 1) {
						shuffled[i] = cards[sub + count2];
						count2++;
					} else {

						if (sub == 1) {
							shuffled[i] = cards[count3];
						}
						shuffled[i] = cards[count4];
						count4++;
					}
				}
				cards = shuffled;
			}

		}
	}
}
