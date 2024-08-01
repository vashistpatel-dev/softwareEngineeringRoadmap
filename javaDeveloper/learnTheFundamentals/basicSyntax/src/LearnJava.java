import java.util.ArrayList;

public class LearnJava {
    public static void main(String[] args) throws Exception {

        // int a = 5;
        // char b = 'i';
        // long c = 400;
        // double d = 3.2;

        String name = "Bean";
        addExclamationPoint(name);

        Animal a = new Animal();

        String dog = a.iAmDog();
        System.out.println(dog);

        a.doStuff();

    }

    public static void addExclamationPoint(String s) {
        System.out.println(s + "!");
    }
}
