public class main {
    public static void main(String[] args) {

        Plate plate = new Plate(50);
        plate.info();


        Cat[] cats = new Cat[] {
                new Cat("Vasya", 10),
                new Cat("Murzic", 15),
                new Cat("Barsik", 5),
                new Cat("Boris", 25),
                new Cat("Murka", 20)
        };
        for(Cat cat: cats){
            cat.eat(plate);
        }
        System.out.println();
        for(Cat cat: cats){
            System.out.println("cat " + cat.getName() + " satiety is: " + cat.getSatiety());
        }
        System.out.println();
        plate.info();
        plate.addFood(30);
        plate.info();
    }

}
