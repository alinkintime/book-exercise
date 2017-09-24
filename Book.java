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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    /**Return's author and title */
    private String getAuthor()
    {
        return author;
    }
    private String getTitle()
    {
        return title;
    }
    
    /** Print's the author and the title */
    public void printAuthor()
    {
        System.out.println("The author is: " + author);
    }
    public void printTitle()
    {
        System.out.println("The title is: " + title);
    }
}
