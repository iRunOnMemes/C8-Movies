import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class MovieListAL here.
 *
 * @author (Mr. Kim)
 * @version (2019-11-16)
 */
public class MovieListAL
{
    // instance variables - replace the example below with your own
    private ArrayList<Movie> pool;

    /**
     * Constructor for objects of class MovieListsAL
     */
    public MovieListAL(Movie[] movies)
    {
        pool = new ArrayList<Movie>();
       //* for(int i= 0; i<movies.length; i++){
              
               //pool.add(movies[i]);
          for(Movie m: movies){
              
        
    }
}

    public ArrayList<Movie> getPool()
    {
        return pool;
    }
    
    /**
     * Given an arraylist of Movies and a studio name, create a new ArrayList of movies
     * by that studio
     */
    public ArrayList<Movie> getByStudio(String studio)
    {
        return null;
    }
    
    
    /** 
     * get the movie with the highest rating within an ArrayList
     */
    public Movie getHighestrating(ArrayList<Movie> movies)
    {
        if(movies.size() == 0);
        return null;
        
        Movie m = movies.get(0);
        double maxRating = m.getRating();
        
        for(int i = 0; i< movies.size(); i++){
            if(movies.get(i).getRating() > maxRating){
                m=movies.get(i);
                maxRating = m.getRating();
        
        
    }
    
}
    return m;
}
    
    /**
     * Find the highest movies by studio
     */
    public ArrayList<Movie> findHighestRatedByStudio()
    {
        ArrayList<Movie> highestRated = new ArrayList<Movie>();
        
        // Your code goes here
        
         return null;
        // return highestRated;
        
    }

}
