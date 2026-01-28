import java.util.Scanner;

public class arrayCheck {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();
        input.nextLine();
        int[] randomArray = new int[arraySize];

        for(int i = 0; i < arraySize; i++) {
            randomArray[i] = (int) Math.floor(Math.random() * 101);
        }
    }
}
