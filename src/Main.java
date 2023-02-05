public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(52, 160);
        System.out.println(String.format("%(.2f", bmi));
    }
}