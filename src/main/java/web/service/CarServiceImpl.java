package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Mercedes ML500", "V8", "black"));
        cars.add(new Car("Mercedes G500", "V8", "brown"));
        cars.add(new Car("Infinity FX35", "V6", "white"));
        cars.add(new Car("RangeRover Sport", "V8", "black"));
        cars.add(new Car("Mercedes GL500", "V8", "black"));
    }


    @Override
    public List<Car> getCar(Integer count) {
        if ((count == null) || (count > cars.size())) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
