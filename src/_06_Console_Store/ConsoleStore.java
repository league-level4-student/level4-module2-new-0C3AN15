package _06_Console_Store;

import java.util.Scanner;

import _02_Generics_Store.Candy;
import _02_Generics_Store.Cart;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Toy;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int money = 1000050;
    	int total = 0;
    	String action = "";
    	boolean paid = false;
    	Cart cart = new Cart();
    	
    	System.out.println("actions: add (item), remove (item), view items or check out");
    	System.out.println("product: candy ($50), cereal ($1,000,000), toy ($1), clothing (2$)");
    	System.out.println("money = $" + money);
    	System.out.println("name:");
    	String name = scan.nextLine();
    	
    	do {
            
            System.out.println("action:");
            action = scan.nextLine();
            
            Candy candy = new Candy();
            Cereal cereal = new Cereal();
            Toy toy = new Toy();
            Clothing clothing = new Clothing();
            
            if(action.equals("add candy")) {
            	cart.add(candy);
            	total += 50;
            }
            if(action.equals("add cereal")) {
            	cart.add(cereal);
            	total += 1000000;
            }
            if(action.equals("add toy")) {
            	cart.add(toy);
            	total += 1;
            }
            if(action.equals("add clothing")) {
            	cart.add(clothing);
            	total += 2;
            }
            
            if(action.equals("remove candy")) {
            	cart.remove(candy);
            	total -= 50;
            }
            
            if(action.equals("view items")) {
            	cart.showCart();
            }
            if(action.equals("check out")) {
            	if(total > money) {
            		paid = true;
            	}
            	else {
            		System.out.println("broke");
            		
            	}
            }
            
            } while (paid == false);
            
    	money -= total;
    	cart.showCart();
    	System.out.println("receipt: ");
    	
            scan.close();
    	
    }

}
