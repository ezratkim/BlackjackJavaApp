/** Class that creates an object Deck that contains 52 objects Card.
  * Able to know which cards have been drawn, and can shuffle all the cards back into the Deck
  *
  * @author Ezra Kim
  */
  public class Deck
  {
      ////instance var////
      private Card[] deck;
      private int cardsDrawn;
    
      ////constructor////
      /** Constructor that creates an ordered deck
        */
      public Deck()
      {
          deck = new Card[52];
          int index = 0;
          for(int suit = 0; suit <= 3; suit++)
          {
              for(int value = 0; value <= 12; value++)
              {
                  deck[index] = new Card(suit,value);
                  index++;
              }
          }
          cardsDrawn = 0;
      }

      ////methods////
      /** Method that shuffles all cards, including drawn cards,
        * into the deck in random order
        */
      public void shuffle()
      {
          for(int i = 51; i > 0; i--)
          {
              int random = (int)(Math.random()*(i+1));
              Card temp = deck[i];
              deck[i] = deck[random];
              deck[random] = temp;
          }
          cardsDrawn = 0;
      }

      /** Method that draws the first card on the deck. Shuffles the cards
        * if there is no more cards to be drawn
        */
      public Card dealCard()
      {
          if(cardsDrawn == 52)
          {
              shuffle();
          }
          cardsDrawn++;
          return deck[cardsDrawn - 1];
      }
      
      public static void main(String[] args)
      {
        
      }
  }