public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
    }


    // Задание 1

    private static void task1() {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        float[] f = {1.57f, 7.654f, 9.986f};
        int[] i = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
    }

    //Задание 2
    private static void task2() {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        float[] fractional = {1.57f, 7.654f, 9.986f};
        int[] arbitrary = {90, 91, 93};
        System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2]);
        System.out.println(fractional[0] + ", " + fractional[1] + ", " + fractional[2]);
        System.out.println(arbitrary[0] + ", " + arbitrary[1] + ", " + arbitrary[2]);
    }


    //Задание 3

    private static void task3() {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        float[] fractional = {1.57f, 7.654f, 9.986f};
        int[] arbitrary = {90, 91, 93};
        System.out.println(weight[2] + ", " + weight[1] + ", " + weight[0]);
        System.out.println(fractional[2] + ", " + fractional[1] + ", " + fractional[0]);
        System.out.println(arbitrary[2] + ", " + arbitrary[1] + ", " + arbitrary[0]);
    }


    //Задание 4
    private static void task4() {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i]++;
            }
            System.out.println(weight[i]);
        }
    }
}

