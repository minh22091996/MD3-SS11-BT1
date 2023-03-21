import java.util.Arrays;
import java.util.Stack;
public class MyStack {
    public static void main(String[] args) {

        // đảo ngược phần tử trong mảng số ngyên sử dụng Stack
        Stack<Integer> stack = new Stack<Integer>();

        int[] array = {1, 2, 3, 4, 5,6,7,8};

        System.out.println("mảng ban đầu la : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(stack.push(array[i]));
        }
        System.out.println("");
        System.out.println("sau khi đảo ngược la :  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] = stack.pop());
        }

        /// đảo ngược chuỗi sử dụng Stack

//        Stack<String> stack = new Stack<>();
//        String chuoi = "mot,hai,ba,bon,nam";
//        String[] array = chuoi.split(",");
//        System.out.println("Kết quả: " + Arrays.toString(array));
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(stack.push(array[i]));
//        }
//        System.out.println("");
//        System.out.println("sauu khi đảo ngược la  : ");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] = stack.pop());
//        }
    }
}
