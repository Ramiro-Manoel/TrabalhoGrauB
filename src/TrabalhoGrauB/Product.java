package TrabalhoGrauB;

public abstract class Product {

//Attribute declaration
	
private String name;
private double price;
private String description;
private int quantity;
private String brand;
private int identifier;

//Empty Constructor

public Product() {
	super();
	
}

//Constructor

public Product(String name, double price, String description, int quantity, String brand, int identifier) {
	super();
	this.name = name;
	this.price = price;
	this.description = description;
	this.quantity = quantity;
	this.brand = brand;
	this.identifier = identifier;
}

//Getters&Setters

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getIdentifier() {
	return identifier;
}

public void setIdentifier(int identifier) {
	this.identifier = identifier;
}

//toString

@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", description=" + description + ", quantity=" + quantity
			+ ", brand=" + brand + ", identifier=" + identifier + "]";
}

//Methods

// shows the more basic info of a product (name and price)
public String showProduct () {
	return "Name: " + this.getName() + " Price: R$" + this.getPrice();
};

// abstract class for the children class
public abstract String Details();


}
