public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("plate: "+ food);
    }

    public int getFood() {
        return food;
    }


    public void decreaseFood(int n) {
        if(n > food){
            System.out.println("В тарелке недостаточно еды!");
        }else{
            food = food - n;
        }
    }


    public void addFood(int n){
        food+=n;
    }
}
