package algorithems;


public class numbers {

    public static void reverse(String str) {
        String tmp = "";
        int i = str.length() - 1;

        while (i >= 0) {
            tmp += str.charAt(i);
            i--;
        }

        System.out.println(tmp);
    }

    public static void main(String[] args) {
        reverse("meow");
    }
}
