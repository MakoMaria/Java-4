import java.util.Arrays;
import java.util.Scanner;
 
public class lab4 {    
    public static void main (String [] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = in.nextInt();
        System.out.println("Введите элементы массива: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        } 
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Введите значение удаляемого элемента: ");
        int x = in.nextInt();
        for (int i = 0; i < n; i++){
            if (x == arr[i]){
                for (int j = i; j < n; j++){        
                    if (arr[j] == x)
                        break;
                            }
                for (int j = i; j < n; j++){
                    arr[j] = arr[j+1];
                    n--;
                
                System.out.println("Массив после удаления элемента: ");
                for (j = 0; j < n; j++)         
                System.out.print(arr[j] + " ");
                }
            }
        } 
        
    }
}
