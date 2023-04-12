// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP2: More CLasses

/** Pizza.java
* This is a simple Pizza class
* @author Michael Bertagna
* @author Student ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP2: More Classes
* @version 1.0
*/

/** The Pizza class is used to represent the simple concept of a
* customizable pizza pie.
* The Pizza class consists of basic methods for pizza creation
* but does not include detailed topping options.
*/

public class Pizza{
  /**The size of the pizza. */
  private String m_pizzaSize;
  /**The number of cheese toppings on the pizza. */
  private int m_numCheeseToppings;
  /**The number of pepperoni toppings on the pizza. */
  private int m_numPepperoniToppings;
  /**The number of veggie toppings on the pizza. */
  private int m_numVeggieToppings;

  /**The default constuctor - sets the size to small, number of cheese toppings
   * to 1, and the number of pepperoni and veggie toppings to 0. */
  public Pizza(){
    m_pizzaSize="small";
    m_numCheeseToppings=1;
    m_numPepperoniToppings=0;
    m_numVeggieToppings=0;
  }

  /**The overloaded constructor - creates a pizza of given size
   * and the number of each respective topping: cheese, pepperoni, and veggie.
	 * @param pizzaSize String representing size
   * @param numCheeseToppings int representing number of cheese toppings
   * @param numPepperoniToppings int representing number of pepperoni toppings
   * @param numVeggieToppings int representing number of veggie toppings
	 */
  public Pizza(String pizzaSize, int numCheeseToppings, int numPepperoniToppings, int numVeggieToppings){
    m_pizzaSize=pizzaSize;
    m_numCheeseToppings=numCheeseToppings;
    m_numPepperoniToppings=numPepperoniToppings;
    m_numVeggieToppings=numVeggieToppings;
  }


  /**The copy constuctor - creates a deep copy of a pizza.
   * @param anotherPizza Pizza representing the pizza to be copied
   */
  public Pizza(Pizza anotherPizza){
    m_pizzaSize=anotherPizza.m_pizzaSize;
    m_numCheeseToppings=anotherPizza.m_numCheeseToppings;
    m_numPepperoniToppings=anotherPizza.m_numPepperoniToppings;
    m_numVeggieToppings=anotherPizza.m_numVeggieToppings;
  }

  /** Returns the pizza size.
  * @return A String representing the pizza size
  */
  public String getPizzaSize(){
    return m_pizzaSize;
  }

  /** Sets the pizza size.
  * @param pizzaSize String representing the size (small, medium, or large) of the pizza
  */
  public void setPizzaSize(String pizzaSize){
    m_pizzaSize=pizzaSize;
  }

  /** Returns the number of cheese toppings.
  * @return An int representing the number of cheese toppings
  */
  public int getNumCheeseToppings(){
    return m_numCheeseToppings;
  }

  /** Sets the number of cheese toppings.
  * @param numCheeseToppings int representing the number of cheese toppings
  */
  public void setNumCheeseToppings(int numCheeseToppings){
    m_numCheeseToppings=numCheeseToppings;
  }

  /** Returns the number of pepperoni toppings.
  * @return An int representing the number of pepperoni toppings
  */
  public int getNumPepperoniToppings(){
    return m_numPepperoniToppings;
  }

  /** Sets the number of pepperoni toppings.
  * @param numPepperoniToppings int representing number of pepperoni toppings
  */
  public void setNumPepperoniToppings(int numPepperoniToppings){
    m_numPepperoniToppings=numPepperoniToppings;
  }

  /** Returns the number of veggie toppings.
  * @return An int representing the number of veggie toppings
  */
  public int getNumVeggieToppings(){
    return m_numVeggieToppings;
  }

  /** Sets the number of veggie toppings.
  * @param numVeggieToppings int representing number of veggie toppings
  */
  public void setNumVeggieToppings(int numVeggieToppings){
    m_numVeggieToppings=numVeggieToppings;
  }

  /** Returns the cost of the pizza.
  * @return A double representing the cost of the pizza.
  */
  public double calcCost(){
    switch(m_pizzaSize){
      case "small":
        return ((double) 10+2*(m_numCheeseToppings+m_numPepperoniToppings+m_numVeggieToppings));
      case "medium":
        return ((double) 12+2*(m_numCheeseToppings+m_numPepperoniToppings+m_numVeggieToppings));
      case "large":
        return ((double) 14+2*(m_numCheeseToppings+m_numPepperoniToppings+m_numVeggieToppings));
      default:
        return (0);
    }
  }

  /** Returns a pretty-printed string representation of the pizza.
  * @return A string representation of the pizza object.
  */
  public String toString(){
    return ("Pizza Size: "+m_pizzaSize+", Number of Cheese Toppings: "+m_numCheeseToppings
    +",\nNumber of Pepperoni Toppings: "+m_numPepperoniToppings+", Number of Veggie Toppings: "
    +m_numVeggieToppings+", \nPizza Cost: "+calcCost());
  }

  /** Returns a boolean representing the equality of two pizzas.
  * @param anotherPizza  Pizza representing the pizza to be compared to
  * @return A boolean representation of equality
  */
  public boolean equals(Pizza anotherPizza){
    return (m_pizzaSize.equals(anotherPizza.m_pizzaSize) && m_numCheeseToppings==anotherPizza.m_numCheeseToppings
    && m_numPepperoniToppings==anotherPizza.m_numPepperoniToppings && m_numVeggieToppings==anotherPizza.m_numVeggieToppings);
  }

}
