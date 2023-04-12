// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP2: More CLasses

/** PizzaDriver.java
* This is a simple PizzaDriver class
* @author Michael Bertagna
* @author Student ID: 2353491
* @author bertagna@chapman.edu
* CPSC 231-01 - Prof. Stevens
* Assignment MP2: More Classes
* @version 1.0
*/

/** The PizzaDriver class is used to drive the PizzaOrder and Pizza methods
* and contains only the main method.
*/

public class PizzaDriver{
  /** The main method. Exercises the PizzaOrder class and Pizza class functionality.
  * @param args The command line arguments (not used)
  */
  public static void main(String[] args) {
    Pizza pizza1 = new Pizza("small",1,0,1);
    Pizza pizza2 = new Pizza("large",2,2,0);
    Pizza pizza3 = new Pizza(pizza2);
    Pizza pizza4 = new Pizza(pizza1);
    PizzaOrder order = new PizzaOrder(3);
    System.out.println(order.addPizza(pizza1));
    System.out.println(order.addPizza(pizza2));
    System.out.println(order.addPizza(pizza3));
    System.out.println(order.addPizza(pizza4));
    System.out.println(pizza1.equals(pizza3));
    System.out.println(order);
  }
}
