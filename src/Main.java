public class Main {
    public static void main(String[] args) {

       //Part 1.1
       int[] array1 = new int[10];
       array1[0] = 2;
       array1[1] = 4;
       array1[2] = 6;
       array1[3] = 8;
       array1[4] = 10;
       array1[5] = 12;
       array1[6] = 14;
       array1[7] = 16;
       array1[8] = 18;
       array1[9] = 20;

        System.out.println(array1[5]);

       //Part 1.2
        int size = 5;
        int[] array2 = new int[size];
        array2[0] = 10;
        array2[1] = 12;
        array2[2] = 13;
        array2[3] = 16;
        array2[4] = 18;
        System.out.println(array2[3]);


       //Part 1.3
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10 };
        System.out.println(arr[6]);

        //Part 1.4
        String[] backpack = new String[3];
        backpack[0] = "Laptop";
        backpack[1] = "Phone";
        backpack[2] = "Cat";
        System.out.println(backpack[2]);

        //Part 1.5 + part 3.1
        for (int i = 0; i < array1.length; i++) {
            System.out.print( array1[i] + ", ");
        }


        //Part 2.1
        int[] a = new int[5];
        a[0] = 41;
        a[1] = 42;
        a[2] = 43;
        a[3] = 44;
        a[4] = 45;
        System.out.println("\n" + a[4]);

        //Part 3.2
        for(int values : array2){
            System.out.println(values);
        }

        //Part 3.3
        int[] numbers = {2, 4, 6, 8, 10};
        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
    }
}