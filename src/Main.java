public class Main {

    // int [] name = new int[размер массива];
    //   0      1      2
    // [   ], [   ], [   ]
    // name[порядковый номер] = 10
    //int [] name = {1, 2, 3}
    // for (обьявление указателя; условие; инкримент)
    //for (int i: intArray)
    public static void main(String[] args) {
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        double[] doubleArray = {1.57, 7.654, 9.986};
        byte[] byteArray = {1, 2, 3};

////task2


        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }

        }

        System.out.println();
        for (int j = 0; j < doubleArray.length; j++) {
            if (j == doubleArray.length - 1) {
                System.out.print(doubleArray[j]);
            } else {
                System.out.print(doubleArray[j] + ", ");

            }

        }
        System.out.println();
        for (int a = 0; a < byteArray.length; a++) {
            if (a == byteArray.length - 1) {
                System.out.print(byteArray[a]);
            } else {
                System.out.print(byteArray[a] + ", ");
            }
        }
        System.out.println();
        /////task3
        for (int i = intArray.length-1; i >= 0; i--) {
            if (i != intArray.length-1 ) {
                System.out.print(", " +intArray[i]);

            } else {

                System.out.print(intArray[i]);
            }

        }

        System.out.println();
        for (int j = doubleArray.length -1; j >=0; j--) {
            if (j != doubleArray.length-1 ) {
                System.out.print(", "+ doubleArray[j]);

            } else {

                System.out.print(doubleArray[j]);

            }

        }
        System.out.println();
        for (int a = byteArray.length-1; a >=0; a--) {
            if (a != byteArray.length - 1) {
                System.out.print(", " +byteArray[a]);

            } else {
                System.out.print(byteArray[a]);
            }

        }
        System.out.println();
        ////task4
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]% 2 !=0){
                intArray[i] =intArray[i] +1;
            }

            if (i == intArray.length - 1) {
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }

        }

    }
}


