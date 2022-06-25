package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarsDAO {
    List<Car> getLimitList(int count);
}
