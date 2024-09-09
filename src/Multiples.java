public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiplesUnder(1000));
    }

    private static int multiplesUnder(int limit) {
        int count = 0;
        for(int i = 1; i < limit; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                count += 1;
            }
        }
        return count;
    }
}
