package algorithems;

public class mostduped {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 5, 3, 1, 2, 3, 5};

        int[] count = new int[6];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int maxNumber = 1;

        for (int i = 2; i <= 5; i++) {
            if (count[i] > count[maxNumber]) {
                maxNumber = i;
            }
        }

        System.out.println("The most duplicated number is: " + maxNumber);
        System.out.println("It appears " + count[maxNumber] + " times.");
    }
}