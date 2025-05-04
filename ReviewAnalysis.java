import java.util.ArrayList;
public class ReviewAnalysis {
    
    private Review[] allReviews;
    
    
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }
    
    
    public double getAverageRating() {
        
        int sum = 0;
        
        for (Review review : allReviews) {
            sum += review.getRating();
        }
        
        return (double) sum / allReviews.length;
    }
    
    
    public ArrayList<String> collectComments() {
        
        ArrayList<String> result = new ArrayList<String>();
        
        for (int i = 0; i < allReviews.length; i++) {
            String comment = allReviews[i].getComment();
            
            
            if (comment.contains("!")) {
                String formattedComment = i + "-" + comment;
                
                
                char lastChar = comment.length() > 0 ? comment.charAt(comment.length() - 1) : ' ';
                if (lastChar != '.' && lastChar != '!') {
                    formattedComment += ".";
                }
                
                result.add(formattedComment);
            }
        }
        
        return result;
    }
}