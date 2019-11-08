import service.CalculationService;

public class Main {
    public static void main(String[] args) {
        CalculationService calculate = new CalculationService();
        int result =(int) calculate.distanceCalculation(0, 10);
        System.out.println(result);
    }
}

