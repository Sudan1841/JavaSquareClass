//package Square;

public class square {

    public static void main(String[] args) {
        // Define the size of the square
        int size = 20;

        // Create an array to store each line of the square
        String[] square = new String[size];

        // Generate each line of the square
        for (int i = 0; i < size; i++) {
            // Initialize a StringBuilder for the current line
            StringBuilder line = new StringBuilder();

            // If it's the first or last line, fill it with asterisks
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    line.append("*");
                }
            } else {
                // For middle lines, add an asterisk, then spaces, then an asterisk
                line.append("*");
                for (int j = 1; j < size - 1; j++) {
                    line.append(" ");
                }
                line.append("*");
            }

            // Add the line to the array
            square[i] = line.toString();
        }

        // Print each line of the square
        for (String line : square) {
            System.out.println(line);
        }
    }
}
