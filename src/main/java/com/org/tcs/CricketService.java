package com.org.tcs;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CricketService {
    public void createCricket(Cricket cricket);
    public List<Cricket> getAll();
    public void updateCricket(Cricket cricket);
    public String deleteById( Integer id);

}
