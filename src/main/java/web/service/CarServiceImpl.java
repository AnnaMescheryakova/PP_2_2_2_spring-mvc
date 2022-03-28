package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCar(List<Car> cars, Integer count) {
        if ((count == null) || (count > cars.size())) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
