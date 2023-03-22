package Wearable;

public class Test {
    public static void main(String[] args) {
        CottonShirt cts = new CottonShirt();
        System.out.println(cts.HowToWash());
        System.out.println(cts.HowToWear());
        Scarf sc = new Scarf();
        System.out.println(sc.HowToWash());
        System.out.println(sc.HowToWear());
        Jeans jj = new Jeans();
        System.out.println(jj.HowToWash());
        System.out.println(jj.HowToWear());
    }
}
