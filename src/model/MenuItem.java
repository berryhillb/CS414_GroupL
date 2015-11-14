package model;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MenuItem {
	
	private double price;
	private String formattedPrice;
	private String name;
	private String description;
	
	public MenuItem(double price, String name, String desc){
		this.setPrice(price);
		this.setName(name);
		this.setDesc(desc);
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String description) {
		this.description= description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public final double getPrice() {
		return price;
	}

	public final void setPrice(double price) {
		if (price >= 0){
			this.price=price;
		}
	}

	/*
	 * Equals overrides are needed so we can use pre-made containers that use .contains
	 */
	@Override
	public int hashCode(){
		int hash = 7;
		hash = 31 * hash + (description == null ? 0 : this.getDesc().hashCode());
		hash = 31 * hash + (name == null ? 0 : this.getName().hashCode());
		return hash;
	}
	
	@Override
	public boolean equals(Object o){
		if (this == o){
			return true;
		}
		if ((o == null) || (o instanceof MenuItem)){
			return false;
		}
		MenuItem mi = (MenuItem)o;
		return (getName().equalsIgnoreCase(mi.getName()) && (getDesc().equalsIgnoreCase(mi.getDesc())));
	}
	
	@Override
	public String toString(){
		String temp = "";
//		NumberFormat form = NumberFormat.getCurrencyInstance();
		String price = this.getPrice() +"";
		temp += this.getName() + '\n'+price;
		return temp;
	}
}
