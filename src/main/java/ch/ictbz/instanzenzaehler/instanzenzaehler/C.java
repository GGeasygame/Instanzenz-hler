package ch.ictbz.instanzenzaehler.instanzenzaehler;

public class C {
    private static int counter = 0;

    public C() throws Exception {
        if (counter == 10) {
            throw new Exception("Can only create a maximum of 10 instances");
        }
        counter++;
    }

    public static void resetCount() {
        counter = 0;
    }
    public static int getCount() {
        return counter;
    }

}
