package pizza;

import pizza.additions.AdditionsFactory;

public class VegetarianPizza extends Pizza{

    AdditionsFactory additionsFactory;

    public VegetarianPizza(AdditionsFactory additionsFactory) {
        this.additionsFactory = additionsFactory;
    }

    void prepare() {
        System.out.println("Preapring: " + name);
        base = additionsFactory.createBase();
        sauce = additionsFactory.createSauce();
        cheese = additionsFactory.createCheese();
        vegetables = additionsFactory.createVegetables();
    }
}
