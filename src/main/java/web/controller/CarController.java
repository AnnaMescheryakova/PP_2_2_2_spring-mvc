package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;


import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required = false) Integer count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes ML500", "V8", "black"));
        cars.add(new Car("Mercedes G500", "V8", "brown"));
        cars.add(new Car("Infinity FX35", "V6", "white"));
        cars.add(new Car("RangeRover Sport", "V8", "black"));
        cars.add(new Car("Mercedes GL500", "V8", "black"));
        model.addAttribute("cars", carService.getCar(cars, count));
        return "cars";
    }
}
