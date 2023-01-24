package it.develhope.otheroperators;

public class Start {
    public static void main(String[] args) {

        int a = 15;

        System.out.println(a);

        System.out.println(a += 5);;

        System.out.println(a -= 4);;

        int b = a;

        System.out.println(b);

        System.out.println(++b);

        if (b % 2 != 0) {

            System.out.println("b is an odd number");

        } else {

            System.out.println("b is an even number");
        }
        if (b * (b + 1) % 3 == 0) {

            System.out.println("The number is a multiple of 3");

        } else {
            System.out.println("The number isn't a multiple of 3");

        }
    }
}

