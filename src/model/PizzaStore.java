package model;

import java.util.ArrayList;

import com.example.cs414_group_l_a5.PizzaSystem;

public class PizzaStore {

//	private ArrayList<Special> specials;
	private PizzaSystem parentSystem;
	private Menu menu;
	
	
	public PizzaStore(PizzaSystem system){
		
//		specials = new ArrayList<Special>();
		parentSystem = system;
		menu = new Menu();
		menu.loadMenuFromFile();
	}
	
	public Menu getMenu(){
		return this.menu;
	}
	

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

//	public boolean checkSpecialsForPizzaSize(PizzaSize size) {
//		boolean temp = false;
//		for (Special spec : specials){
//			if (spec.hasPizzaSize()){
//				if (spec.getSize() == size){
//					temp = true;
//				}
//			}
//		}
//		return temp;
//	}
//	
//	public boolean checkSpecialsForItem(MenuItem item) {
//		boolean temp = false;
//		for (Special spec : specials){
//			if (spec.hasItem()){
//				if (spec.getItem() == item){
//					temp = true;
//				}
//			}
//		}
//		return temp;
//	}
//
//	public Special findSpecialBySize(PizzaSize size) {
//		Special temp = new Special("NOT EVER USED");
//		for (Special spec : this.getSpecials()){
//			if (spec.hasPizzaSize()){
//				if (spec.getSize() == size){
//					temp = spec;
//				}
//			}
//		}
//		return temp;
//	}
//
//	public Special findSpecialByItem(MenuItem item) {
//		Special temp = new Special("NOT EVER USED");
//		for (Special spec : this.getSpecials()){
//			if (spec.hasItem()){
//				if (spec.getItem() == item){
//					temp = spec;
//				}
//			}
//		}
//		return temp;
//	}

}
