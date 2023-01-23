package co.develhope.co.dependencyInjection2.controller;

import co.develhope.co.dependencyInjection2.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController{

    private MyService myService;

    public MyController(MyService myService){
        System.out.println("MyController constructor has been called!");
        this.myService = myService;
    }
    @GetMapping("/")
    public String helloMessage(){
        System.out.println("MyController.getName has been called!");
        return "Welcome to the show!";
    }
    @GetMapping("/getName")
    public String getName(){
        System.out.println("myController.getName has been called");
        return myService.getName();
    }
}
