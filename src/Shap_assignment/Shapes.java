package Shap_assignment;
import java.util.Scanner;


class Shape{
	
	int length;
	int breadth;
	int height;
	
	private void calculateArea() {
		
		
		
	}
	
}


class Rectangle extends Shape{
	
	public Rectangle(int length,int breadth,int height) {
		
		this.length = length;
		this.breadth = breadth;	
		this.height = height;		
	}
	
	public double calculateArea() {
		
		return length*breadth;
	}
	
	
	
	
}


class Triangle extends Shape{
	
	public Triangle(int base,int height,int length) {
		
		
		this.breadth = base;
		this.height = height;
		this.length = length;
		
		
		
		
	}
	
	public double calculateArea() {
		
		return (breadth*height)/2;
	}
	
	
}


class Square extends Shape{
	
	public Square(int length,int breadth, int height) {
		
		this.length = length;		
		this.breadth = breadth;		
		this.height = height;		
		
	}
	
	public double calculateArea() {
		
		return length*length;
	}
	
	
}


class calculateArea extends Shape{
	
	String shape;
	
	public calculateArea(String shape,int length,int breadth,int height ) {
		this.shape = shape;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		Rectangle r = new Rectangle(this.length,this.breadth,this.height);
		Triangle t = new Triangle(this.breadth,this.height,this.length);
		Square s = new Square(this.length,this.breadth,this.height);
		
		
		String rec = "Rectangle";
		String tri = "Triangle";
		String sq = "Square";
		
		
		if(shape.equals(rec)) {
			System.out.println(" area of "+this.shape+" is = "+r.calculateArea());
		}
		
		else if(shape.equals(tri)) {
			
			System.out.println("area of "+this.shape+" is = "+t.calculateArea());		
			
		}
		else if (shape.equals(sq)){
			
			if(this.length == this.breadth & this.breadth == this.height) {
			System.out.println("area of "+this.shape+" is = "+s.calculateArea());		
			}
			else {
				System.out.println("give the correct dimentions");
			}
		}
		
		else {
			System.out.println("no shape found");
		}
		
	}
}



public class Shapes {

	public static void main(String[] args) {

		
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the shape: either Rectangle/Triangle/Square (Case sensitive)");
			String shape = sc.next();
			
			System.out.println("Enter the lenght:");
			int lenght = sc.nextInt();
			
			System.out.println("Enter the breadth:");
			int breadth = sc.nextInt();
			
			System.out.println("Enter the height:");
			int height = sc.nextInt();
			

	
			
			
			
			
			
		
			calculateArea ca = new calculateArea(shape,lenght,breadth,height);
			
		
	}

}
