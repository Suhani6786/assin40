public class ReverseString {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }

        String input = args[0];  // Read input from command-line arguments
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println(reversed);
    }
}
