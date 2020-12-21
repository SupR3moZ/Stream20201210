package lesson02.online.homework;

public class LetsGo {

    public static void main(String[] args) {
        int[] firstArray = new int[10];
        firstArray[0] = 1;
        firstArray[1] = 1;
        firstArray[2] = 0;
        firstArray[3] = 0;
        firstArray[4] = 1;
        firstArray[5] = 0;
        firstArray[6] = 1;
        firstArray[7] = 1;
        firstArray[8] = 0;
        firstArray[9] = 0;
        int[] secondArray = new int[8];
        int[] anotherArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        replace(firstArray);
        System.out.println();
        System.out.println("А вот реализация через c = (a > b) ? a : b; у меня не получилась ;(");
        readArray(secondArray);
        System.out.println();
        fill(secondArray);
        System.out.println();
        readArray(anotherArray);
        System.out.println();
        anotherFill((anotherArray));
        System.out.println();


    }

    public static void replace(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0) {
                inputArray[i] = 0;
            } else {
                inputArray[i] = 1;
            }
            System.out.print(inputArray[i] + " ");
        }
    }

    public static void readArray(int[] inputArray1) {
        for (int i = 0; i < inputArray1.length; i++) {
            System.out.print(inputArray1[i] + " ");
        }
    }

    public static void fill(int[] inputArray2) {
        int[] numberToFill = {1, 4, 7, 10, 13, 16, 19, 22};
        for (int o : numberToFill) {
            System.out.print(o + " ");
        }
    }

    public static void anotherFill(int[] inputArray3) {
        for (int ii = 0; ii < inputArray3.length; ii++) {
            if (inputArray3[ii] < 6) {
                inputArray3[ii] *= 2;
            } else {
                inputArray3[ii] = inputArray3[ii];
            }
        }
        for (int iii = 0; iii < inputArray3.length; iii++) {
            System.out.print(inputArray3[iii] + " ");
        }
    }
}




//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
//        принимающий на вход массив и умножающий числа меньше 6 на 2;




//c = (a > b) ? a : b;
//1 Задать целочисленный массив, состоящий из элементов 0 и 1.
//Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в
//принятом массиве 0 на 1, 1 на 0;