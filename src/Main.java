public class Main {
    public static void main(String[] args) {
        //ex 1.1
        int [] b = new int[3];
        b [0] = 1;
        b [1]=2;
        b[2]=3;
        System.out.print(b[0] + ", " + b[1] + ", " + b[2]); // ex.2.1
        System.out.println();
        for (int i = 0; i < 3; i++) {//ex 4
            if (b[i] % 2 != 0) {b[i]+=1;}
            System.out.print(b[i] + " ");
            System.out.println();
        }
        //ex 1.2
        double [] a = {1.57, 7.6554, 9.986};
            System.out.print(a[0] + ", " + a[1] + ", " + a[2]); // ex 2.2
        System.out.println();
        //ex 1.3
        int [] roadLenght = {150, 300, 450};
        System.out.print(roadLenght[0] + ", " + roadLenght[1] + ", " + roadLenght[2]);// ex 2.3
        System.out.println();
        System.out.print(b[2] + ", " + b[1] + ", " + b[0]); // ex.3.1
        System.out.println();
        System.out.print(a[2] + ", " + a[1] + ", " + a[0]); // ex 3.2
        System.out.println();
        System.out.print(roadLenght[2] + ", " + roadLenght[1] + ", " + roadLenght[0]);// ex 3.3
        System.out.println();
        //ex 4

    }
}