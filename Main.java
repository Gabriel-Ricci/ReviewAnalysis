import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        Review[] reviews = {
            new Review(4, "Good! Thx"),
            new Review(2, "OK site"),
            new Review(5, "Great!"),
            new Review(3, "Poor! Bad"),
            new Review(1, "")
        };
        
        
        ReviewAnalysis analysis = new ReviewAnalysis(reviews);
        
        
        double avgRating = analysis.getAverageRating();
        System.out.println("Average Rating: " + avgRating);
        
        
        ArrayList<String> comments = analysis.collectComments();
        System.out.println("\nCollected Comments:");
        for (String comment : comments) {
            System.out.println(comment);
        }
    }
}