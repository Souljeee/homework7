public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Ракета", 15,false);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 5,false);
        cats[1] = new Cat("Мурзик", 7,false);
        cats[2] = new Cat("Пушистик", 4,false);
        cats[3] = new Cat("Полосатик", 10,false);
        cats[4] = new Cat("Хвостик", 12,false);
        Plate plate = new Plate(35);
        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].eatInfo();
            plate.info();
        }
        plate.addFood(20);
        plate.info();
    }
}
