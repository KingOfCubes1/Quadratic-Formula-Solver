import java.util.Scanner;  
public class Main{  
	public static void main(String[] Strings) {  
		Scanner input = new Scanner(System.in);  
		System.out.println("ax^2+bx+c");
		System.out.println("");
		System.out.print("Enter the value of a: ");  
		double a = input.nextDouble();  
		System.out.print("Enter the value of b: ");  
		double b = input.nextDouble();  
		System.out.print("Enter the value of c: ");  
		double c = input.nextDouble();  
		double d= b * b - 4.0 * a * c;  
		if (d> 0.0) {  
			double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
			System.out.println("The x-intercepts are " + r1 + " and " + r2);  
		}   
		else if (d == 0.0) {  
			double r1 = -b / (2.0 * a);  
			System.out.println("The x-intercept is " + r1);  
		}   
		else {  
			System.out.println("There are no x-intercepts");  
		}  
		double vertexX = (-b / (2 * a));
		double vertexY = (((4 * a * c) - (b * b)) / (4 * a));
		System.out.println("Vertex: (" + vertexX + ", " + vertexY + ")");
	}  
}