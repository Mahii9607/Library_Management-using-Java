package com.Library; // Adjusted package name to follow Java conventions

public class LibraryBook {

    String title;
    String author;
    String isbn;
    boolean available;

   
    // Constructor
    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) { // Checking if the book is available
            this.available = false;
            System.out.println("Book " + title + " has been borrowed.");
        } else {
            System.out.println("Book " + title + " is not available for borrowing.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!available) { // Checking if the book is currently borrowed
            this.available = true;
            System.out.println("Book " + title + " has been returned sucessfully..");
        } else {
            System.out.println("Book " + title + " has not been borrowed yet.");
        }
    }
    
    

    // Method to display book details
    public void showBook() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Book Is Available: " + this.available);
        System.out.println();
       
        
    }

    // Main method for testing
    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook("Java", "James", "123");
        System.out.println("First Book📕");
        System.out.println();
        lb1.showBook(); 
        lb1.borrowBook(); 
        lb1.showBook(); 
        lb1.returnBook(); 
        lb1.showBook();
        
        LibraryBook lb2 = new LibraryBook("Python", "xyz", "0111");
        System.out.println("Second Book📔");
        System.out.println();
        lb2.showBook(); 
        lb2.borrowBook(); 
        lb2.showBook(); 
        lb2.returnBook(); 
        lb2.showBook();
    }
}
