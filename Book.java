/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }

    /** Sets the book's referance number */
        public void setRefNumber(String ref)
    {
        if (ref.length() >= 3) 
        {
            refNumber = ref;
        }
        else 
        {
            System.out.println ("Error, referance must be at least 3 characters long");
        }
    }
    
    /** The book counts as being borrowed one more time each cycle */
    public void borrow()
    {
        borrowed++;
    }
    
    /**Return's author, title and pages */
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPages()
    {
        return pages;
    }
    
    /** Get's the book's referance number */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /** Gets the amount of times the book was borrowed */
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean iscourseText()
    {
        return courseText;
    }
    /** Print's the author, title */
    public void printAuthor()
    {
        System.out.println("The author is: " + author);
    }
    public void printTitle()
    {
        System.out.println("The title is: " + title);
    }
    /** Print's the book's Details */
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        
        String refNumberString;
        if(refNumber.length() > 0 ) 
        {
            refNumberString = refNumber;
        }
        else 
        {
            refNumberString = "zzz";
        }
        System.out.println("Referance Number: " +  refNumberString);
        System.out.println("This book as been borrowed " + borrowed + "times.");
    }
}
