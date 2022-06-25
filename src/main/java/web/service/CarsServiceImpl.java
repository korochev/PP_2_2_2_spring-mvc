package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarsDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarsServiceImpl implements CarsService{
    private final CarsDAO carsList;

    @Autowired
    public CarsServiceImpl(CarsDAO carsList) {
        this.carsList = carsList;
    }

    @Override
    public List<Car> getLimitList(int count) {
        return carsList.getLimitList(count);
    }
}
