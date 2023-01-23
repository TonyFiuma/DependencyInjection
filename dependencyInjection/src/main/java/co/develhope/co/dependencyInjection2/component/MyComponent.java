package co.develhope.co.dependencyInjection2.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent{
    private final String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor has been called!");
        this.myComponentName = "Antonio Fiumanò";
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }
}
