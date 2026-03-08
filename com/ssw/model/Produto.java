package com.ssw.model;

public abstract class Produto
{
    private String name;
    private double price;

    public Produto(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

	@Override
	public String toString(){
		return String.format(name + "\t\t" + price);
	}
}
