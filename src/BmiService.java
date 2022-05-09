public class BmiService {
    public int calculate(int weight, int hight) {
        int bodyWeight = weight;
        int bodyHight = hight;
        int index = weight * 10_000 / (hight * hight);
        return index;


    }
}
