package Assignedp;

public class ImplicitExplicit {

	public static void main(String[] args) {
        
        int intValue = 5;
        double doubleValue = intValue;
        System.out.println("Implicit Casting (Widening):");
        System.out.println("int value: " + intValue);
        System.out.println("double value after implicit casting: " + doubleValue);
        System.out.println();

        double anotherDoubleValue = 13.3;
        int anotherIntValue = (int) anotherDoubleValue; 
        System.out.println("Explicit Casting (Narrowing):");
        System.out.println("double value: " + anotherDoubleValue);
        System.out.println("int value after explicit casting: "+ anotherIntValue); 
        }
}