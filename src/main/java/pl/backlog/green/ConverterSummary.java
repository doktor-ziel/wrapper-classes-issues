package pl.backlog.green;

public class ConverterSummary {
    public static void main(String[] args) {
        for (int i = -200; i <= 200; i++) {
            int pI1 = i;
            Integer wI1 = pI1;
            int pI2 = wI1;
            Integer wI2 = pI2;
            System.out.println(i + " => " + (wI1 == wI2));
        }
    }
}
