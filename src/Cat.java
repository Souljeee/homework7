public class Cat {
    private String name;
    private int appetite;
    private  boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }


    public void eat(Plate plate){
        plate.decreaseFood(appetite);
        if(plate.getFood() > appetite){
            satiety = true;
        }
    }


    public void eatInfo(){
        if(satiety){
            System.out.println(name + " сытый!");
        }else{
            System.out.println(name + " не сытый!");
        }
    }
}
