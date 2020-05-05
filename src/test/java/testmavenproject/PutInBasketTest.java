package testmavenproject;

import org.testng.annotations.Test;

public class PutInBasketTest {

    @Test
    public void openItemInMarketplace(){
        System.out.println("Step 1: Item is opened");
    }

    @Test
    public void addToBasket(){
        System.out.println("Step 2: Item successfully put into basket");
    }
}
