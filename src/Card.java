public class Card {
    int number;
    String name;
    public Card(int x) {
        this.number = x;
        if (x == 1) {
            this.name = "Ace";
        } else if (x == 2) {
            this.name = "Two";
        } else if (x == 3) {
            this.name = "Three";
        } else if (x == 4) {
            this.name = "Four";
        } else if (x == 5) {
            this.name = "Five";
        } else if (x == 6) {
            this.name = "Six";
        } else if (x == 7) {
            this.name = "Seven";
        } else if (x == 8) {
            this.name = "Eight";
        } else if (x == 9) {
            this.name = "Nine";
        } else if (x == 10) {
            this.name = "Ten";
        } else if (x == 11) {
            this.name = "Jack";
        } else if (x == 12) {
            this.name = "Queen";
        } else {
            this.name = "King";
        }
    }
}
