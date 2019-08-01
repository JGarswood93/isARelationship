public class Animal {

}
class Mammal extends Animal {

}
class Reptile extends Animal {

}

class Dog extends Mammal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        Reptile r = new Reptile();

        System.out.println(a instanceof  Animal);
        System.out.println(m instanceof Mammal);
        System.out.println(d instanceof Dog);
        System.out.println(r instanceof Reptile);
    }
}