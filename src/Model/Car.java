package src.Model;
public class Car {
    private int ID;
    private String model;
    private String brand;
    private String color;
    private int year;
    private double price;
    private int available;

    public Car(){}

    public int getId(){
        return ID;
    }
    
    public void setID(int ID){
        this.ID = ID;
    }
    
    

    public String getBRand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int isAvaialble(){
        return available;
    }

    public void setAvailable(int available) {
		this.available = available;
	}
}