package org.example.test_spring.repository;


import org.example.test_spring.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    List<Car> carList = new ArrayList<Car>();
    public CarRepository(){
        Car car = new Car(1,"sh","xe may",888,"12/12/2023");
        Car car2 = new Car(2,"sh","xe may",999,"14/12/2023");
        Car car3 = new Car(3,"sh","xe may",777,"15/12/2023");
        Car car4 = new Car(4,"sh","xe may",888,"16/12/2023");

        carList.add(car);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
    }
    public List<Car> getCarList() {
        return carList;
    }

    public void createCar(Car car) {
        carList.add(car);
    }

    public Car getCarById(int id) {
        for (Car car: carList) {
            if (car.getId() == id) {
                return car;
            }
        }

        return null;
    }

    public void updateCar(Car car) {
        Car carEdit = getCarById(car.getId());
        carEdit.setName(car.getName());
        carEdit.setDetail(car.getDetail());
        carEdit.setPrice(car.getPrice());
    }
    public void deleteCar(int id){
        Car carDelete = getCarById(id);

        carList.remove(carDelete);

    }

    public List<Car> searchByName(String name) {

        List<Car> result = new ArrayList<>();
        for (Car car :carList) {
            if (car.getName().equals(name)) {
                result.add(car);
            }
        }

        return result;
    }
}
