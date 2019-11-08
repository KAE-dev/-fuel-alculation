package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {

    @Test
    void distanceCalculation() {
        CalculationService service = new CalculationService();
        double fuelPerHundredKilometers = 10;
        double fuelVolume = 4;

        int result =(int) service.distanceCalculation(fuelPerHundredKilometers, fuelVolume);

        assertEquals(40, result);

    }
    @Test
    void invalidInput() {
        CalculationService service = new CalculationService();
        double fuelPerHundredKilometers = 0;
        double fuelVolume = 4;

        int result =(int) service.distanceCalculation(fuelPerHundredKilometers, fuelVolume);

        assertEquals(0, result);

    }

}