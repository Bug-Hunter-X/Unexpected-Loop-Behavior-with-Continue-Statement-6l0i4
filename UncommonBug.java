public class UncommonBug {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
            if (i == 3) {
                continue;
            }
        }
    }
}