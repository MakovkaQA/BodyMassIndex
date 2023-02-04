public class BmiService {
    public double calculate(double weight, double height) {
        double heightKG = height / 100;
        return (weight / (heightKG * heightKG));
    }
}
