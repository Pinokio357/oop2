public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        if(plate.getFood() >= appetite){
            satiety = true;
            plate.setFood(plate.getFood() - appetite);
            System.out.println(name + " ate " + appetite + " food");
        }
        else{
            System.out.println("there is not enough food");
        }

    }

    public int getAppetite() {
        return appetite;
    }
    public boolean getSatiety(){
        return satiety;
    }
    public void setSatiety(boolean satiety){
        this.satiety = satiety;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
}
