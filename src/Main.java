public class Main {
            public static void main(String[] args) {
        BmiService service = new BmiService();

        double index = service.calculate (77, 1.78);
        System.out.println(index);}
}