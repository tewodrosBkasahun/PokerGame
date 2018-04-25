package poker_testing;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import poker.Card;
import poker.Deck;
import poker.PokerHandEvaluator;

public class StudentTests {

	@Test
	public void testExampleTest_SinglePairTest() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(1,3);
		testHand[3] = new Card(4,1);
		testHand[4] = new Card(5,1);
		
		Card[] testHand2 = new Card[5];
		testHand2[0] = new Card(1,1);
		testHand2[1] = new Card(2,0);
		testHand2[2] = new Card(2,2);
		testHand2[3] = new Card(2,3);
		testHand2[4] = new Card(2,4);
		assertEquals(true ,PokerHandEvaluator.hasPair(testHand));
		assertEquals(true ,PokerHandEvaluator.hasPair(testHand2));
	}
	
	@Test
	public void testExampleTest_ThreeOfaKind() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(2,1);
		testHand[3] = new Card(1,1);
		testHand[4] = new Card(1,1);
		assertEquals(true ,PokerHandEvaluator.hasThreeOfAKind(testHand));
	}
	
	@Test
	public void testExampleTest_hasrainbow() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(2,2);
		testHand[3] = new Card(1,3);
		testHand[4] = new Card(1,4);
		assertEquals(false ,PokerHandEvaluator.hasRainbow(testHand));
		
		Card[] testHand2 = new Card[5];
		testHand2[0] = new Card(1,1);
		testHand2[1] = new Card(2,0);
		testHand2[2] = new Card(2,2);
		testHand2[3] = new Card(1,3);
		testHand2[4] = new Card(1,4);
		assertEquals(true ,PokerHandEvaluator.hasRainbow(testHand2));
		
	}
	@Test
	public void testExampleTest_hastwoPair() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(4,1);
		testHand[1] = new Card(4,2);
		testHand[2] = new Card(2,0);
		testHand[3] = new Card(3,3);
		testHand[4] = new Card(3,4);
		assertEquals(false ,PokerHandEvaluator.hasTwoPair(testHand));
		
		Card[] testHand2 = new Card[5];
		testHand2[0] = new Card(4,1);
		testHand2[1] = new Card(4,2);
		testHand2[2] = new Card(2,0);
		testHand2[3] = new Card(1,3);
		testHand2[4] = new Card(1,4);
		assertEquals(false ,PokerHandEvaluator.hasTwoPair(testHand2));
	}
	@Test
	public void testExampleTest_hasFiveOfAKind() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,0);
		testHand[1] = new Card(1,1);
		testHand[2] = new Card(1,2);
		testHand[3] = new Card(1,3);
		testHand[4] = new Card(1,4);
		assertEquals(true ,PokerHandEvaluator.hasRainbow(testHand));
		
		Card[] testHand2 = new Card[5];
		testHand2[0] = new Card(2,0);
		testHand2[1] = new Card(2,1);
		testHand2[2] = new Card(2,2);
		testHand2[3] = new Card(2,3);
		testHand2[4] = new Card(2,4);
		assertEquals(true ,PokerHandEvaluator.hasRainbow(testHand2));
	}
	@Test
	public void testExampleTest_hasStraight() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(2,4);
		testHand[2] = new Card(3,2);
		testHand[3] = new Card(4,3);
		testHand[4] = new Card(5,0);
		assertEquals(true ,PokerHandEvaluator.hasStraight(testHand));
		
		Card[] testHand2 = new Card[5];
		testHand2[0] = new Card(2,1);
		testHand2[1] = new Card(3,4);
		testHand2[2] = new Card(5,2);
		testHand2[3] = new Card(4,3);
		testHand2[4] = new Card(6,0);
		assertEquals(true ,PokerHandEvaluator.hasStraight(testHand2));
		
		Card[] testHand1 = new Card[5];
		testHand1[0] = new Card(6,0);
		testHand1[1] = new Card(7,1);
		testHand1[2] = new Card(8,2);
		testHand1[3] = new Card(9,3);
		testHand1[4] = new Card(1,4);
		assertEquals(true, PokerHandEvaluator.hasStraight(testHand1));
		
		
	}
	@Test
	public void testExampleTest_hasFourOfAKind() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(2,1);
		testHand[1] = new Card(2,2);
		testHand[2] = new Card(2,0);
		testHand[3] = new Card(2,3);
		testHand[4] = new Card(5,4);
		
		
		Card[] testHand2 = new Card[5];
		testHand2[0] = new Card(7,1);
		testHand2[1] = new Card(7,2);
		testHand2[2] = new Card(7,0);
		testHand2[3] = new Card(2,3);
		testHand2[4] = new Card(7,4);
		
		Card[] testHand3 = new Card[5];
		testHand3[0] = new Card(6,1);
		testHand3[1] = new Card(7,2);
		testHand3[2] = new Card(7,0);
		testHand3[3] = new Card(2,3);
		testHand3[4] = new Card(7,4);
		
		assertEquals(true ,PokerHandEvaluator.hasFourOfAKind(testHand));
		assertEquals(true ,PokerHandEvaluator.hasFourOfAKind(testHand2));
		assertEquals(true ,PokerHandEvaluator.hasFourOfAKind(testHand3));
	}
	@Test
	public void testExampleTest_hasflush() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(8,1);
		testHand[3] = new Card(3,1);
		testHand[4] = new Card(4,1);
		assertFalse(!PokerHandEvaluator.hasFlush(testHand));
	}
	@Test
	public void testExampleTest_hasFullHouse() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,4);
		testHand[1] = new Card(2,3);
		testHand[2] = new Card(2,0);
		testHand[3] = new Card(1,1);
		testHand[4] = new Card(1,2);
		
		Card[] testHand2 = new Card[5];
		testHand2[0] = new Card(3,4);
		testHand2[1] = new Card(3,3);
		testHand2[2] = new Card(7,0);
		testHand2[3] = new Card(7,1);
		testHand2[4] = new Card(7,2);
		
		Card[] testHand3 = new Card[5];
		testHand3[0] = new Card(1,4);
		testHand3[1] = new Card(3,3);
		testHand3[2] = new Card(7,0);
		testHand3[3] = new Card(7,1);
		testHand3[4] = new Card(7,2);
		
		assertEquals(true, PokerHandEvaluator.hasFullHouse(testHand));
		assertEquals(true, PokerHandEvaluator.hasFullHouse(testHand2));
		assertEquals(false, PokerHandEvaluator.hasFullHouse(testHand3));
	}
	//You will add many other tests here for pair and the other hands
	
	
	
	@Test
	public void testExampleTest_hasStraightRainbow() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,0);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(3,2);
		testHand[3] = new Card(4,3);
		testHand[4] = new Card(5,4);
		
		Card[] testHand1 = new Card[5];
		testHand1[0] = new Card(6,0);
		testHand1[1] = new Card(7,1);
		testHand1[2] = new Card(8,2);
		testHand1[3] = new Card(9,3);
		testHand1[4] = new Card(1,4);
		assertEquals(true, PokerHandEvaluator.hasStraightRainbow(testHand1));
		assertEquals(true,PokerHandEvaluator.hasStraightRainbow(testHand));
	}
	
	public void testExampleTest_hasTwoPair() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,0);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(3,2);
		testHand[3] = new Card(4,3);
		testHand[4] = new Card(5,4);
		assertEquals(true,!PokerHandEvaluator.hasTwoPair(testHand));
	}
	
	@Test
	public void testExampleTest_hasStraightFlush() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(3,1);
		testHand[3] = new Card(4,1);
		testHand[4] = new Card(5,1);
		Card[] testHand1 = new Card[5];
		testHand1[0] = new Card(6,1);
		testHand1[1] = new Card(7,1);
		testHand1[2] = new Card(8,1);
		testHand1[3] = new Card(9,1);
		testHand1[4] = new Card(1,1);
		assertEquals(true, PokerHandEvaluator.hasStraightFlush(testHand1));
		assertEquals(true, PokerHandEvaluator.hasStraightFlush(testHand));
		
	}
	
	@Test
	public void testExampleTest_SmallShuffle() {
		Deck testDeck = new Deck();
		
		testDeck.deal(45-8); //get rid off all but 8 cards
		testDeck.shuffle();  //shuffle the remaining cards
		Card[] testCards = testDeck.deal(8); //deal the remaining 8 cards to me
		//This should give me 2, 3,    4, 5, 6,    7, 8, 9 of Stars
		
		
		//Now check the actual cards against what I expect...
		int[] shouldBe = { 7,4,2,8,5,3,9,6 };
		for (int i=0; i<8; i++) {
			assertEquals(shouldBe[i], testCards[i].getValue());
			assertEquals(4, testCards[i].getSuit());
		}
	}

}
