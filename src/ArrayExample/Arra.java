package ArrayExample;

public class Arra {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {2, 3, 4},{6,7,8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
