public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] weight1 = new int[3];
        weight1[0] = 1;
        weight1[1] = 2;
        weight1[2] = 3;

        double[] weight2 = {1.57, 8.654, 9.986};
        int[] weight3 = {12, 25, 15};

        //Задача2
        for (int i = 0; i < weight1.length; i++) {
            System.out.print(weight1[i]);
            if (i != weight1.length - 1)
                System.out.print(",");
        }

        System.out.print("\n");
        for (int i = 0; i < weight2.length; i++) {
            System.out.print(weight2[i]);
            if (i != weight2.length - 1)
                System.out.print(",");
        }

        System.out.print("\n");
        for (int i = 0; i < weight3.length; i++) {
            System.out.print(weight3[i]);
            if (i != weight3.length - 1)
                System.out.print(",");
        }

        ///Задача3
        for (int i = weight1.length - 1; i >= 0; i--) {
            System.out.print(weight1[i]);
            if (i != 0){
                System.out.print(",");}
        }
        System.out.print("\n");
        for (int i = weight2.length-1;i>=0;i--) {
            System.out.print(weight2[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.print("\n");
        for (int i = weight3.length-1;i>=0;i--) {
            System.out.print(weight3[i]);
            if (i != 0)
                System.out.print(",");}
        //Задача 4
        System.out.print("\n");
        for (int i =0;i < weight1.length;i++){
            if (weight1[i]% 2 == 1){
                weight1[i]++;
            }
            System.out.print(weight1[i]);
            if (i != weight1.length - 1)
                System.out.print(",");
        }
    }}