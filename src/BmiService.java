public class BmiService {
    public double calculate(double weight, double heightM) {
        double height = heightM / 100;
        return (weight / (height * height));
    }
}
