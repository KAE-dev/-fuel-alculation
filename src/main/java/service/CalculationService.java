package service;

public class CalculationService {
    public double distanceCalculation(double fuelPerHundredKilometers, double fuelVolume){
        if (fuelPerHundredKilometers <=0){
            return 0;
        }
        double calculate = fuelVolume * (100 / fuelPerHundredKilometers);
            return calculate;
    }
}
