import java.time.LocalDate;

public class UserTest
{
    public static void main(String[] args) {
        //User user = new User("Rafael", "2008-01-02");
        
        Book book1 = new Book("A vida", "Manuel Carvalho", 270);
        AudioBook audioBook1 = new AudioBook("Um pedço de mim", "Filosofo", 30000);
        
        System.out.println(audioBook1.toString());
        
        /*
        System.out.printf("%s was born back in %s and he is now %d years old.", 
        user.getName(), user.getBirthDay().toString(), user.age());
        
        System.out.printf("%s has borrow these books: %s \n", 
        user.getName(), user.borrowedBooks());
        
        User youngerUser = new User();
        
        youngerUser.name = "Gabriel Antunes";
        youngerUser.birthDay = LocalDate.parse("2013-03-14");
        
        System.out.printf("%s was born back in %s and he is now %d years old.", 
        youngerUser.name, youngerUser.birthDay.toString(), youngerUser.age());
        
        User olderUser = new User();
        
        olderUser.name = "Rafael";
        olderUser.birthDay = LocalDate.parse("2008-01-02");
        
        System.out.printf("%s was born back in %s and he is now %d years old.", 
        olderUser.name, olderUser.birthDay.toString(), olderUser.age());*/
    }
}