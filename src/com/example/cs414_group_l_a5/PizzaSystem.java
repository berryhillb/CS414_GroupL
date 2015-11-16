package com.example.cs414_group_l_a5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;

public class PizzaSystem {

	private PizzaStore pizzaStore;


	private static PizzaSystem instance;

	private PizzaSystem() {
		pizzaStore = new PizzaStore(this);
		
//		this.getPizzaStore().getMenu().loadMenuFromFile();
	}

	public static PizzaSystem getInstance() {
		if(null == instance) {
			instance = new PizzaSystem();
		}
		return instance;
	}

	public PizzaStore getPizzaStore(){
		return pizzaStore;
	}

//	@Override
//	public String toString(){
//		String temp = "";
//		temp += "The pizza store has " + getPizzaStore().getOrderQueue().getCurrentOrders().size() + " current orders waiting to be made." + '\n';
//		temp += "There are " + getPizzaStore().getOrderQueue().getOrdersBeingMade().size() + " orders being made right now." + '\n';
//		temp += "This store has fulfilled " + getPizzaStore().getOrderQueue().getPastOrders().size() + " orders total in the past." + '\n';
//		temp += "LIST OF ORDERS WAITING TO BE MADE:" + '\n';
//		temp += "----------------------------------" + '\n';
//		if (getPizzaStore().getOrderQueue().getCurrentOrders().isEmpty()){
//			temp += "[NO ORDERS]" + '\n' + '\n';
//		}
//		else {
//			for (Order o : getPizzaStore().getOrderQueue().getCurrentOrders()){
//				temp += o.toString() + '\n';
//			}
//		}
//		temp += "LIST OF ORDERS CURRENTLY BEING MADE:" + '\n';
//		temp += "------------------------------------" + '\n';
//		if (getPizzaStore().getOrderQueue().getOrdersBeingMade().isEmpty()){
//			temp += "[NO ORDERS]" + '\n' + '\n';
//		}
//		else {
//			for (Order o : getPizzaStore().getOrderQueue().getOrdersBeingMade()){
//				temp += o.toString() + '\n';
//			}
//		}
//		return temp;
//	}
//
//	public OrderInterface getOrderInterface() {
//		return orderInterface;
//	}
//
//	public ManagerInterface getManagerInterface() {
//		return managerInterface;
//	}

	/*
	 * Method used for testing purposes only.
	 */
	public void clearSystem() {
		pizzaStore = new PizzaStore(this);
		
	}


	public Pizza makePizza(){
		String size, choice;
		int topps;
		List<PizzaTopping> toppings = new ArrayList<PizzaTopping>();
		Scanner keyboard = new Scanner(System.in);
		PizzaSize pzSize = null;
		System.out.print("Which Size Would You Like?\nSmall  Medium  Large\nChoice: ");
		size = keyboard.next();
		if(size.charAt(0)=='L' || size.charAt(0)=='l'){
			pzSize = new PizzaSize(10,size);
		}else if(size.charAt(0)=='M' || size.charAt(0)=='m'){
			pzSize = new PizzaSize(5,size);
		}else if(size.charAt(0)=='S' || size.charAt(0)=='s'){
			pzSize = new PizzaSize(3.50,size);
		}
		while(true){
			System.out.print("Would You Like To Add A Topping?\nY / N\nChoice: ");
			choice = keyboard.next();
			keyboard.nextLine();
			if(choice.charAt(0)=='Y' || choice.charAt(0)== 'y'){
//				System.out.println(pizzaStore.getMenu().getPizzaToppings());
				List<PizzaTopping> temp = pizzaStore.getMenu().getPizzaToppings();
				for(int i=0; i<temp.size();i++){
					System.out.println(i+"..."+temp.get(i));
				}
				topps = keyboard.nextInt();
				keyboard.nextLine();
				System.out.print("Did you want to add "+temp.get(topps)+" to your pizza?\nY / N\nChoice: ");
				choice = keyboard.next();
				keyboard.nextLine();
				if(choice.charAt(0)=='Y' || choice.charAt(0)== 'y'){
//					PizzaTopping food = pizzaStore.getMenu().getTopping(choice);
//					if(food != null)
					toppings.add(temp.get(topps));

				}
			}else if(choice.charAt(0)=='N' || choice.charAt(0)=='n'){
				break;
			}
		}
		keyboard.close();
		PizzaTopping[] tops = new PizzaTopping[toppings.size()];
		tops = toppings.toArray(tops);
		return new Pizza(tops,pzSize);
	}

//	public boolean placeOrder(){
//		String yeaNea;
//		boolean looper = true;
//		List<Pizza> pizzas = new ArrayList<Pizza>();
//		List<MenuItem> items = new ArrayList<MenuItem>();
//		Scanner keyboard = new Scanner(System.in);
//		do{
//			System.out.println("0...Options\n1...make a pizza\n2...other items\n5...Submit Order\n9...Main menu");
//			int choice = keyboard.nextInt();
//			keyboard.nextLine();
//			switch(choice){
//			case 0:
//				System.out.println("0...Options\n1...make a pizza\n2...other items\n9...Main menu");
//				break;
//			case 1:
//				Pizza pz = makePizza();
//				System.out.println("Added "+pz.toString()+" to your order");
//				pizzas.add(pz);
//				break;
//			case 2:
//	//			System.out.println(pizzaStore.getMenu().getMenuItems());
//				List<MenuItem> temp = pizzaStore.getMenu().getMenuItems();
//				for(int i=0; i<temp.size() ; i++){
//					System.out.print(i+"..."+temp.get(i));
//				}
//				choice = keyboard.nextInt();
//				keyboard.nextLine();
//				System.out.println("You chose: "+temp.get(choice)+"\nOrder? Y / N");
//				yeaNea = keyboard.nextLine();
//				if(yeaNea.charAt(0)=='Y' || yeaNea.charAt(0)=='y'){
//					items.add(temp.get(choice));
//					System.out.println("added "+ temp.get(choice));
//				}
//
//				break;
//			case 9:
//				looper=false;
//				printOptions();
//				//			System.out.print("choice:");
//				keyboard.close();
//				break;
//			}
//		}while(looper);
//		Order order = orderInterface.createNewOrder(items, pizzas);
//		if(order !=null)
//			return true;
//		return false;
//	}

	//	public void orderOptions(){
	//		System.out.println("0...Main menu\n1...place an order\n2...current orders");
	//	}

	public void printOptions(){
		System.out.println("0...help\n1...menu\n2...order\n9...exit");
	}

	public static void main(String[] args){
		int choice, orderchoice;
		Scanner keyboard = new Scanner(System.in);
//		Scanner secondScan = new Scanner(System.in);
		PizzaSystem pizzasystem = new PizzaSystem();
		//		pizzasystem.printOptions();
		

	}
}
