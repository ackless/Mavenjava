package testmavenproject;

import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void openWebSite(){
        System.out.println("Step 1: Web site opened");
    }

    @Test(dependsOnMethods = {"openWebSite"})
    public void makeLogin(){
        System.out.println("Step 2: Successfully logged in");
    }

}
