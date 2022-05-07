package com.org.tcs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CricketRepo extends JpaRepository<Cricket,Integer> {
}
