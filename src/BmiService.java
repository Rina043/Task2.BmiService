public class BmiService {
    public double calculate;

    public double calculate (double height, double weight){
        double index = weight / Math.pow(1.78,2);

        return index;
    }
}

