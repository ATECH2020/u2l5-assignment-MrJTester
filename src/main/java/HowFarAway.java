import java.util.Scanner;
public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the latitude of the starting location: ");
        double firstLat = scanner.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        double firstLong = scanner.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        double secondLat = scanner.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        double secondLong = scanner.nextDouble();
        GeoLocation firstLoc = new GeoLocation(firstLat,firstLong);
        GeoLocation secondLoc = new GeoLocation(secondLat,secondLong);

        double distance = firstLoc.distanceFrom(secondLoc);

        System.out.print("The distance is " + distance + " miles.");
    }
}