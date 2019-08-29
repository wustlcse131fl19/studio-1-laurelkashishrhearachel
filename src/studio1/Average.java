package studio1;

import support.cse131.ArgsProcessor;
public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double n1 = ap.nextDouble("First integer for average");
        double n2 = ap.nextDouble("Second integer for average");
        System.out.println(("the average is " + (n1 + n2) / 2));
    }
}