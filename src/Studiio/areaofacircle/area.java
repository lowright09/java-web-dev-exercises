package Studiio.areaofacircle;
import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        int radius = input.nextInt();
        System.out.println("The area of a circle of radius" + radius+ "is:" );
    }
}
