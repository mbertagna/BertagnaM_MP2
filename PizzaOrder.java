// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP2: More CLasses

/** PizzaOrder.java
* This is a simple PizzaOrder class
* @author Michael Bertagna
* @author Student ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP2: More Classes
* @version 1.0
*/

/** The PizzaOrder class is used to represent the simple concept of a
* pizza order and is used in conjunction with the Pizza class.
* The PizzaOrder class consists of basic methods for pizza order creation.
* but does not the ability to order anything other then a pizza.
*/

public class PizzaOrder{
  /**The represntation of the order. */
  private Pizza[] m_order;
  /**The number of pizzas to be added to the order. */
  private int m_numPizzas;
  /**The number of pizzas in the order so far. */
  private int m_pizzaNum = 0;

  /**The default constuctor - sets the order to 1 small, one-cheese-topping pizza. */
  public PizzaOrder(){
    m_numPizzas=1;
    m_pizzaNum=1;
    m_order = new Pizza[m_numPizzas];
    m_order[0] = new Pizza("small",1,0,0);
  }

  /**The overloaded constructor - creates an empty pizza order of given number of pizzas.
	 * @param numPizzas int representing number of pizzas to be added to order
	 */
  public PizzaOrder(int numPizzas){
    m_numPizzas=numPizzas;
    m_order = new Pizza[m_numPizzas];
  }

  /**Adds a specified pizza to the order; returns 1 if successful and -1 if unsuccessfull
  *@param pizza Pizza representing specified pizza to be added
  *@return An int representing successful (1) or unsuccessful (-1) addition of the pizza to the order
  */
  public int addPizza(Pizza pizza){
    if (m_numPizzas==m_pizzaNum){
      return -1;
    }
    else{
      m_order[m_pizzaNum]=pizza;
      m_pizzaNum+=1;
      return 1;
    }
  }

  /** Returns the total cost of the pizza order.
  * @return A double representing the total cost of the pizza order.
  */
  public double calcTotal(){
    double totalCost=0;
    for (int i=0 ; i < m_pizzaNum ; ++i){
      totalCost += m_order[i].calcCost();
    }
    return totalCost;
  }

  /** Returns a pretty-printed string representation of the pizza order.
  * @return A string representation of the pizza order object.
  */
  public String toString(){
    String allPizzas="";
    for (int i=0 ; i < m_pizzaNum ; ++i){
      allPizzas = allPizzas + "\n" + (i+1) + ": " + m_order[i].toString();
    }
    return ("Number of Pizzas: "+m_pizzaNum+", "+allPizzas+", \nTotal Cost: "+calcTotal());
  }

}
