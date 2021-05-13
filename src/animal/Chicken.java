package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "animal.Chicken : cúc cu ";
    }
    public String howToEat(){
        return "could be fried";
    }
}
