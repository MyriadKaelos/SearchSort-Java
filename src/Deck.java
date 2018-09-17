import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Deck {
    Card[] allCards;
    Card[] hand;
    public Deck() {
        allCards = new Card[13];
        for(int i = 0; i < 13; i++) {
            allCards[i] = new Card(i+1);
        }
        Collections.shuffle(Arrays.asList(allCards));
    }

    public void dealHand(int y) {
        hand = new Card[y];
        for(int i = 0; i < y; i ++) {
            hand[i] = allCards[(int) Math.floor(new Random().nextDouble() * allCards.length)];
        }
    }

    public void listHand() {
        for(int i = 0; i < hand.length; i++) {
            System.out.println(hand[i].name);
        }
    }

    public void listDeck() {
        for(int i = 0; i < allCards.length; i++) {
            System.out.println(allCards[i].name);
        }
    }

    public void swap(int x, int y) {
        Card z = hand[x];
        hand[x] = hand[y];
        hand[y] = z;
    }

    public void bubbleSortHand() {
        for(int i = 0; i < hand.length-1; i ++) {
            for(int o = 0; o < hand.length-1; o++) {
                if(hand[o].number > hand[o+1].number) {
                    swap(o,o+1);
                }
            }
        }
    }

    public void selectionSortHand() {
        for(int i = 0; i < hand.length; i++) {
            for(int o = i; o < hand.length; o++) {
                if(hand[o].number < hand[i].number) {
                    swap(i,o);
                }
            }
        }
    }

    public Card[] mergeSortHand(Card[] a) {
        if(a.length > 1) {
            Card[] b = mergeSortHand(Arrays.copyOfRange(a,0,(int) Math.floor(a.length/2)));
            Card[] c = mergeSortHand(Arrays.copyOfRange(a,(int) Math.floor(a.length/2),a.length));
            int x = 0;
            int y = 0;
            for(int i = 0; i < a.length; i ++) {
                if(!(x > b.length - 1 || y > c.length - 1)) {
                    if (b[x].number > c[y].number) {
                        a[i] = c[y];
                        y++;
                    } else {
                        a[i] = b[x];
                        x++;
                    }
                } else {
                    if(x > b.length-1) {
                        a[i] = c[y];
                        y++;
                    } else {
                        a[i] = b[x];
                        x++;
                    }
                }
            }
        }
        return a;
    }

    public int binarySearchHand(Card[] a, int b) {
        if(a.length != 1) {
            if (b < a[(int) a.length / 2].number) {
                return binarySearchHand(Arrays.copyOfRange(a, 0, (int) a.length / 2), b);
            } else if (b > a[(int) a.length / 2].number) {
                return binarySearchHand(Arrays.copyOfRange(a, (int) a.length / 2, a.length), b) + (int) a.length / 2;
            }
        }
        return 1;
    }
}
