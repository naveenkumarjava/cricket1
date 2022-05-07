package com.org.tcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricketServiceImpl implements CricketService{
@Autowired
CricketRepo cricketRepo;
    @Override
    public void createCricket(Cricket cricket) {
        cricketRepo.save(cricket);
    }

    @Override
    public List<Cricket> getAll() {
        List<Cricket> player  = cricketRepo.findAll();
        return player;
    }

    @Override
    public void updateCricket(Cricket cricket) {
        cricketRepo.save(cricket);


    }

    @Override
    public String deleteById(Integer id) {
        cricketRepo.deleteById(id);
        return null;
    }

}
