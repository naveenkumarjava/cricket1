package com.org.tcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CricketController {
    @Autowired
    CricketService cricketService;

    @PostMapping("/create")
    public void createCricket(@RequestBody Cricket cricket){
        cricketService.createCricket(cricket);
    }
    @GetMapping("/getAll")
    public List<Cricket> getAll(){
        List<Cricket> player1  = cricketService.getAll();
        return player1;
    }
@PutMapping("/update")
    public void updateCricket(@RequestBody Cricket cricket){
        cricketService.updateCricket(cricket);
}
@DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer  id){
    cricketService.deleteById(id);
    return "naveen";

}
}
