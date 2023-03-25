package com.driver.services;

import com.driver.model.ParkingLot;
import com.driver.model.Spot;

import java.util.List;

public interface ParkingLotService {
    
    void deleteSpot(int spotId);

    List<Spot> findAllSpotsOfAParkingLot(int parkingLotId);

    Spot updateSpot(int parkingLotId, int spotId, int pricePerHour);

    void deleteParkingLot(int parkingLotId);

    ParkingLot addParkingLot(String name, String address);

    Spot addSpot(int parkingLotId, Integer numberOfWheels, Integer pricePerHour);
}
