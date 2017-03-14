
/**
 *
 * adding books to your book shelf .
 * 
 * @Darius Little 
 * @10/23/1015)
 */
import java.util.Scanner;
public class Bookshelf
{
    public static void main(String[] args){
     Book a=new Book();
     System.out.println(a.toString());
    
     System.out.println();
     Scanner scan=new Scanner(System.in);
     System.out.println("Adding Books to the BookShelf");
     
     System.out.println(" Title :");
     String title;
     title=scan.nextLine();
     
     System.out.println(" Author :");
     String author;
     author=scan.nextLine();
     
     System.out.println(" Publisher :");
     String publisher;
     publisher=scan.nextLine();
    
     System.out.println(" Copyright Date :");
     String copyrightDate;
     copyrightDate=scan.nextLine();
    
     
     Book b=new Book(title, author, publisher, copyrightDate);
     System.out.println(b.toString());
     
    }
}
