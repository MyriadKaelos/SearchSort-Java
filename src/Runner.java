import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.dealHand(7);
        deck.selectionSortHand();
        System.out.println(deck.binarySearchHand(deck.hand,5));
        deck.listHand();
    }
}
