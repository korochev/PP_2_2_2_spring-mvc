package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDAOImpl implements CarsDAO {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("Ford", "RED", 1000));
        list.add(new Car("Ferrari", "YELLOW", 700));
        list.add(new Car("Aston Martin", "BLACK", 500));
        list.add(new Car("Fiat", "GREEN", 100));
        list.add(new Car("BMW", "BLUE", 100));
    }

    @Override
    public List<Car> getLimitList(int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
