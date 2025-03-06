public class FindMaximum {
    public static void main(String[] args) {
        int length = args.length;
        if (length != 2) {
            System.out.println("Give only two arguments");
        }
        else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            boolean condition = num1>num2;

            int greatest = condition ? num1 : num2;
            System.out.println(greatest);
    }
}
}

