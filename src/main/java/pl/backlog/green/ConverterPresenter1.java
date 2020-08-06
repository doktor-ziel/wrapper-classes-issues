package pl.backlog.green;

public class ConverterPresenter1 {
    public static void main(String[] args) {
        int pI1 = 123;
        Integer wI1 = pI1;
        int pI2 = wI1;
        Integer wI2 = pI2;
        System.out.println(pI1 == pI2);
        System.out.println(wI1 == wI2);
    }
}
