package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

@Controller
public class CarsController {
    private final CarsService cars;

    @Autowired
    public CarsController(CarsService cars) {
        this.cars = cars;
    }

    @GetMapping(value = "/cars")
    public String limitedList(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("list", cars.getLimitList(count));
        return "cars";
    }

}
