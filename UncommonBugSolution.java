public class UncommonBugSolution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}