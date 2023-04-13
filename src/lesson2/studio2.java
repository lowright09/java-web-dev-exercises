package lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class studio2 {
    public static void main(String[] args) {
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string to count its characters:");
        String userString = input.nextLine();
        char[] CharArray = userString.toCharArray(2);
        HashMap<Character, Integer> count = new HashMap<>();
        for (char letter : CharArray) {

            if (count.containsKey(letter)) {
                count.put(letter, count.get(letter) + 1);
            } else {
                count.put(letter, 1);
            }
        }
        for (Map.Entry<Character, Integer> counts : count.entrySet()) {
            System.out.println(counts.getKey() + ":" + counts.getValue());
        }
    }
}
