public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.65;
        int m = 53;
        int bml = service.calculate(h, m);
        System.out.println("Индекс массы тела = " + bml);
    }
}