import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class AlgEx {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        FileWriter writer = new FileWriter("output.txt");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        if(isBinaryHeap(arr, size)){
            writer.write("Yes");
        } else {
            writer.write("No");
        }
        scanner.close();
        writer.close();
    }

    private static boolean isBinaryHeap(int[] arr, int size){
        for(int i = 0; 2 * i + 1 < size || 2 * i + 2< size; i++){
            if(2 * i + 1 < size && arr[i] > arr[2 * i + 1]){
                return false;
            }
            if(2 * i + 2 < size && arr[i] > arr[2 * i + 2]){
                return false;
            }
        }
        return true;
    }
}
