public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyWeight = 90;
        int bodyHight = 178;
        int index = service.calculate(bodyWeight, bodyHight);
        System.out.println("Индекс массы тела равен " + index);
    }
}
