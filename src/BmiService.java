public class BmiService {
    public int calculate(double h, int m) {
        double bmiInd = (int) (m / h * h);
        return (int) bmiInd;
    }
}
