// A simple data class to represent a book
//data class Book(
//    val isbn: String,
//    val title: String,
//    val author: String,
//    var isAvailable: Boolean = true
//)
//
//// A library that stores books and lets you borrow/return them
//class Library {
//
//    private val books = mutableListOf<Book>()   // list to hold all books
//
//    // Add a book to the library
//    fun addBook(book: Book) {
//        books.add(book)
//        println("Added: ${book.title}")
//    }
//
//    // Borrow a book by ISBN. Returns true if successful.
//    fun borrowBook(isbn: String): Boolean {
//        val book = books.find { it.isbn == isbn && it.isAvailable }
//        return if (book != null) {
//            book.isAvailable = false
//            println("Borrowed: ${book.title}")
//            true
//        } else {
//            println("Book not available or not found")
//            false
//        }
//    }
//
//    // Return a borrowed book by ISBN. Returns true if successful.
//    fun returnBook(isbn: String): Boolean {
//        val book = books.find { it.isbn == isbn && !it.isAvailable }
//        return if (book != null) {
//            book.isAvailable = true
//            println("Returned: ${book.title}")
//            true
//        } else {
//            println("Book not found in borrowed list")
//            false
//        }
//    }
//
//    // List all books that are currently available
//    fun listAvailableBooks() {
//        val available = books.filter { it.isAvailable }
//        println("Available books:")
//        if (available.isEmpty()) {
//            println("None")
//        } else {
//            available.forEach { println("${it.title} by ${it.author}") }
//        }
//    }
//}
//fun main() {
//    val library = Library()
//
//    // Add some books
//    library.addBook(Book("111", "Kotlin Basics", "John Doe"))
//    library.addBook(Book("222", "Advanced Kotlin", "Jane Smith"))
//
//    library.listAvailableBooks()
//

//    // Borrow a book
//    library.borrowBook("111")
//    library.listAvailableBooks()
//
//    // Return the book
//    library.returnBook("111")
//    library.listAvailableBooks()
//}
fun main (){
    val a: Any=7
    val b : Any=8
    val c: Any=3.23
    val d: Any=true
    println(when(a){
        is String-> "String of  $(a.length)"
        is Int-> "INt of  $(2*a)"
                is Double-> "Double of  $(a/2)"
                        is Boolean-> "Boolean value hgjgh$a"
                                else-> "String of  $(a.length)"

    })
}
