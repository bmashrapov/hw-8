public class Main {
    public static void main(String[] args) {
        //ex 1.1
        int [] b = new int[3];
        b [0] = 1;
        b [1]=2;
        b[2]=3;
        for (int i = 0; i <= b.length-1; i++) {
            if (i != b.length-1) {
                System.out.print(b[i] + ", ");
            } else
                System.out.print(b[i]);// ex.2.1
        }
        System.out.println();
        //ex 1.2
        double [] a = {1.57, 7.6554, 9.986};
        for (int i = 0; i <= a.length-1; i++) {
            if (i != a.length-1) {
                System.out.print(a[i] + ", ");
            } else System.out.print(a[i]);
        }// ex 2.2
        System.out.println();
        //ex 1.3
        int [] roadLenght = {150, 300, 450};
        for (int i = 0; i <= roadLenght.length-1; i++) {
            if (i != roadLenght.length-1) {
                System.out.print(roadLenght[i] + ", ");
            } else
                System.out.print(roadLenght[i]);// ex.2.1
        }
        System.out.println();
        for (int i = b.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(b[i] + ", ");
            } else
                System.out.print(b[i]);
        } // ex.3.1
        System.out.println();
        for (int i = a.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(a[i] + ", ");
            } else System.out.print(a[i]);
        } // ex 3.2
        System.out.println();
        for (int i = roadLenght.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(roadLenght[i] + ", ");
            } else
                System.out.print(roadLenght[i]);
        }// ex 3.3
        System.out.println();
        //ex 4
        for (int i = 0; i < 3; i++) {
            if (b[i] % 2 != 0) {
                b[i] += 1;}
            if (i != b.length-1) {
                System.out.print(b[i] + ", ");
            } else
                System.out.print(b[i]);
        }

    }
}