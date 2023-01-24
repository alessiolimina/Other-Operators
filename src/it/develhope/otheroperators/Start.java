package it.develhope.otheroperators;

public class Start {
    public static void main(String[] args) {

        System.out.println("------Starting operations----------");

        int a = 15;

        System.out.println("The A value is " + a);
        System.out.println("The new A value is " + (a += 5));
        System.out.println("The new A value is " + (a -= 4));

        System.out.println("-------------------------------------");

        int b = a;

        System.out.println("The B value is " + b);
        System.out.println("The new B value is " + ++b);

        if (b % 2 != 0) {
            System.out.println("B is an odd number");
        } else {
            System.out.println("B is an even number");
        }

        if ((b * (b + 1)) % 3 == 0) {
            System.out.println("The number is a multiple of 3");
        } else {
            System.out.println("The number isn't a multiple of 3");
        }
        System.out.println("----------------------------------------");
    }
}

