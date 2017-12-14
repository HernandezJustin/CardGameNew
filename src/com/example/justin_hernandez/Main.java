package com.example.justin_hernandez;


import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;


public class Main {

    private static Deck d = new Deck();
    public static void main(String[] args) {
	    d.createDeck();
        Iterator<Deck.Card> cardIterator = d.getCards().iterator();
        while (cardIterator.hasNext()){
            System.out.println(cardIterator.next().toString());
        }
        shuffle(d.getCards());
        System.out.println("=====================================");
        cardIterator = d.getCards().iterator();
        while (cardIterator.hasNext()){
            System.out.println(cardIterator.next().toString());
        }
        System.out.println(drawCard());
    }

    public static void shuffle(Stack<Deck.Card> cards){
        Collections.shuffle(cards);
    }

    public static String drawCard(){
       return "You drew a(n) " + d.getCards().pop().toString();
    }
}
