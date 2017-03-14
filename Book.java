
/**
 * class Flight to set the airline requirements .
 * 
 * @Darius Little 
 * @10/24/1015
 */
import java.util.Scanner;
public class Book
{
   private String title;
   private String author;
   private String publisher;
   private String copyrightDate;
   public Book(){
    setTitle("Outliers");
    setAuthor(" Malcolm Gladwell");
    setPublisher("Back Bay Books");
    setCopyrightDate("11/28/2008");
    } 
   public Book(String newTitle, String newAuthor,String newPublisher ,String newCopyrightDate){
       setTitle(newTitle);
        setAuthor(newAuthor);
        setPublisher(newPublisher);
        setCopyrightDate(newCopyrightDate);
    } 
   public void setTitle(String newTitle){
       title = newTitle;
    }
    
     public void setAuthor(String newAuthor){
       author = newAuthor;
    }
    public void setPublisher(String newPublisher){
        publisher= newPublisher;
    }
   public void setCopyrightDate(String newCopyrightDate){
      copyrightDate = newCopyrightDate;
    } 
   public String getTitle(){
        return title;
    }
    public String getAuthor (){
        return author;
    }
    public String getPublisher(){
        return publisher;   
    }
    public String getCopyrightDate(){
        return copyrightDate;   
    }
   
    
   public String toString(){
	return "\nTitle: " + title+"\nAuthor: "+author+"\nPublisher :" 
	+publisher+"\nCopyRight Date :"+copyrightDate ; 

} 
}
