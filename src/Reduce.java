public class Reduce {
    public static void main(String[] args) {
        System.out.println(countReduce(100));
    }

    private static int reduceNum(int num) {
        if (num % 2 == 0) {
            return num / 2;
        } else {
            return num - 1;
        }
    }

    private static int countReduce(int num) {
        int count = 0;
        while (num > 0) {
            num = reduceNum(num);
            count += 1;
        }
        return count;
    }
}
