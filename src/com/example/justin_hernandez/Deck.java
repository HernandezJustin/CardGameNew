package com.example.justin_hernandez;

import java.util.Stack;

public class Deck {
    private static final int MAX_DECK_SIZE = 52;
    private Stack<Card> cards;

    public Deck() {
        this.cards = new Stack<>();
    }

    public Stack<Card> createDeck(){
        for (Card.Suits suit : Card.Suits.values()){
            //Adding number valued cards to deck
            for (int j = 2; j < 11; j++){
                Card c = new Card(Integer.toString(j), suit);
                cards.add(c);
            }
            //Adding Aces, Kings, Queens and Jacks to deck
            for (Card.JQKA jqka : Card.JQKA.values()){
                Card c = new Card(jqka.toString(), suit);
                cards.add(c);
            }
        }
        System.out.println("The deck contains " + cards.size() + " cards.");
        return cards;
    }

    public static int getMaxDeckSize() {
        return MAX_DECK_SIZE;
    }

    public Stack<Card> getCards() {
        return cards;
    }

    public static class Card {
        private String cardValue;
        private Suits suit;

        public Card(String cardValue, Suits suit) {
            this.cardValue = cardValue;
            this.suit = suit;
        }

        private enum Suits {
            DIAMONDS,
            HEARTS,
            SPADES,
            CLUBS
        }

        private enum JQKA {
            ACE,
            JACK,
            QUEEN,
            KING
        }

        @Override
        public String toString() {
            return this.cardValue + " of " + this.suit;
        }
    }
}
