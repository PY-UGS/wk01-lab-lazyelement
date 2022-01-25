public class Main {
    public static void main(String[] args) {
        // 2(a) Example 1:
        System.out.println("Hello I am Nadiah :)! \n");

        // 2(b) Example 3:
        String modules = "CSC1009";
        switch (modules) {
            case "CSC1006":
                System.out.println("Mathematics 2");
                break;
            case "CSC1007":
                System.out.println("Operating System");
                break;
            case "CSC1008":
                System.out.println("Data Structure and Algortihms");
                break;
            case "CSC1009":
                System.out.println("Object Oriented Programming");
                break;
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            default:
                System.out.println("Unknown Module");
                break;
        }
        // System.out.println("After Switch \n");

        // 2(c) Example 4:
        for (int x = 120; x > 65; x--) {
            // System.out.println("\n");
            if (x % 2 != 0) {
                System.out.println("Value of x: " + x);
            }

        }
    }
}
