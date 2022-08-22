import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(isValidLispString(sc.nextLine()));

    }

    public static boolean isValidLispString(String s) {
        Stack<String> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add("(");
            } else if (s.charAt(i) == ')') {
                if (stack.size() == 0) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.size() == 0;
    }
}
