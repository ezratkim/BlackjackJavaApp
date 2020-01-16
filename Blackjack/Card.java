/** Class that creates an object Card that represents one of
  * 52 cards.
  * 
  * @author Ezra Kim
  */

public class Card
{
  ////instance var////
  private int suit;
  private int value;
  
  ////constructor////
  /** Constructs a card with a suit and value
    * @param newSuit suit of the card
    * @param newValue value of the card
    */
  public Card(int newSuit, int newValue)
  {
    suit = newSuit;
    value = newValue;
  }
  
  ////methods////
  /** Method to get the suit
    * @return suit
    */
  public int getSuit(){return suit;}
  
  /** Method to get the value
    * @return value
    */
  public int getValue(){
    if(value > 9){
      value = 10;
      return value;
    }else{
    return value + 1;
    }
  }
  
  /** Method to return a String representation of the suit
    * @return suit
    */
  public String getSuitString()
  {
    String[] suitName = {"Spades", "Hearts", "Diamonds", "Clubs"};
    return suitName[suit];
    
  }
  
  /** Method to return a String representation of the suit
    * @return value
    */
  public String getValueString()
  {
    String[] valueName = {"Ace", "2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King"};
    return valueName[value];
  }
  
  /** Method to return String representation of the card
    * @return getValueString() + " of " + getSuitString()
    */
  public String toString(){return getValueString() + " of " + getSuitString();}
  
  public static void main(String[] args) {
    
  }
}