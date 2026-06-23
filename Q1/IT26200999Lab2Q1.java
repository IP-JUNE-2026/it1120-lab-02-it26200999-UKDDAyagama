public class IT26200999Lab2Q1 {
    public static void main(String[] args) {
        double perimeter = 100;

        // Width = 3/4 of Length
        double length = (2 * perimeter) / 7;
        double width = (3.0 / 4.0) * length;

        System.out.printf("Length of the fence = %.2f%n", length);
        System.out.printf("Width of the fence = %.2f%n", width);
    }
}