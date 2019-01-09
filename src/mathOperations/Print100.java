package mathOperations;

public class Print100 {
    public static void main(String[] args) {
        int count1 = 1;
//        System.out.printf("count from 0 to 100", +count1);
//        while(count1==0){
//            System.out.println(count1++);
            do {
                System.out.println(count1);
                count1++;
            } while (count1 <=100);
                System.out.print( "100 is been printed" );
        }
    }
