package poker;

/**
 * @author Tewodros Kasahun
 */
public class PokerHandEvaluator {
	/**
	 * This method check to see if there is at least one pair
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasPair(Card[] cards) {
		boolean a = false;
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards.length; j++) {
				if (i != j && cards[i].getValue() == cards[j].getValue()) {
					a = true;
				}
			}
		}
		return a;
	}

	/**
	 * Containing cards that are each of different suits
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasRainbow(Card[] cards) {
		for (int i = 0; i < 4; i++) {
			if (cards[i].getSuit() == cards[i + 1].getSuit())
				return false;
		}
		return true;
	}

	/**
	 * This method check to see if there are two pairs of distinct values
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasTwoPair(Card[] cards) {
		int value = 0;
		for (int i = 1; i < 5; i++) {

			if (cards[i - 1].getValue() == cards[i].getValue()) {
				value++;
			}
		}
		if (value == 4) {
			return true;
		}
		return false;
	}

	/**
	 * This method checks to see if you have "Three of a Kind"
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasThreeOfAKind(Card[] cards) {
		int value = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i != j && cards[i].getValue() == cards[j].getValue()) {
					value++;
				}
			}
		}
		if (value == 6 || value == 8) {
			return true;
		}
		return false;

	}

	/**
	 * This method checks to see if you have five consecutive cards
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasStraight(Card[] cards) {
		boolean answer = false;
		for (int first = 0; first < 5; ++first) {
			for (int second = 0; second < 5; second++) {
				for (int third = 0; third < 5; third++) {
					for (int four = 0; four < 5; four++) {
						for (int five = 0; five < 5; five++) {
							if (first != second && first != third && first != four && first != five && second != third
									&& second != four && second != five && third != four && third != five
									&& four != five) {
								if (cards[second].getValue() == cards[first].getValue() + 1
										&& cards[third].getValue() == cards[second].getValue() + 1
										&& cards[four].getValue() == cards[third].getValue() + 1
										&& cards[five].getValue() == cards[four].getValue() + 1) {
									answer = true;
								}
								if (cards[first].getValue() == 6 && cards[second].getValue() == 7
										&& cards[third].getValue() == 8 && cards[four].getValue() == 9
										&& cards[five].getValue() == 1) {
									answer = true;
								}
							}
						}
					}

				}
			}

		}
		return answer;
	}

	/**
	 * This method checks to see if there are five cards of the same suit
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasFlush(Card[] cards) {

		for (int i = 0; i < 4; i++) {
			if (cards[i].getSuit() != cards[i + 1].getSuit())
				return false;
		}
		return true;
	}

	/**
	 * This method checks to see if pair of cards share the same value, and the
	 * other three cards share a second value.
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasFullHouse(Card[] cards) {
		int value = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < cards.length; j++)

				if (i != j && cards[i].getValue() == cards[j].getValue()) {
					value++;
				}

		}
		if (value == 8) {
			return true;
		}
		return false;
	}

	/**
	 * This method check if you have four cards with the same value
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasFourOfAKind(Card[] cards) {
		int value = 1;
		boolean a = false;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (1 != j && cards[i].getValue() == cards[j].getValue()) {
					value++;
				}
				if (value == 4) {
					a = true;
				}
			}
		}
		return a;
	}

	/**
	 * This method checks to if a player has straight rainbow
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasStraightRainbow(Card[] cards) {
		if (hasStraight(cards) && hasRainbow(cards)) {
			return true;
		}
		return false;
	}

	/**
	 * This method checks to if a player has straight flush
	 */
	public static boolean hasStraightFlush(Card[] cards) {
		if (hasStraight(cards) && hasFlush(cards)) {

			return true;
		}
		return false;
	}

	/**
	 * This method checks to if a player has five of kind
	 * 
	 * @param cards
	 * @return
	 */
	public static boolean hasFiveOfAKind(Card[] cards) {
		int value = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i != j && cards[i].getValue() == cards[j].getValue()) {
					value++;
				}
			}
		}
		if (hasRainbow(cards) && value == 20) {
			return true;
		}
		return false;
	}

}
