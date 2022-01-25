public class Main {
    public static void main(String[] args) {
        System.out.println("Hello my name is Nadiah");
        String module = "CSC1009";
        switch (module) {
            case "CSC1010":
                System.out.println("Computer Networks");
                break;
            case "CSC1008":
                System.out.println("Data Structures and Algorithms");
                break;
            case "CSC1007":
                System.out.println("Opearing Systems");
                break;
            case "CSC1009":
                System.out.println("Object-Oriented Programming");
                break;
            default:
                System.out.println("Unknown module");
                break;
        }
        System.out.println("After switch");
        for (int e = 120; e < 60; e--) {
            System.out.println(" Value of e : " + e);
            System.out.println("\n");
        }
    }
}
