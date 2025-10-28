public class UserTest2
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args) {
        /*User user = new User("Rafael Lourenço", "2008-01-02");*/
        
        Book pokemon = new Book("Arnaldo nas alturas", "José Silva", 270);
        AudioBook onepiece = new AudioBook("As coisas da bida", "Yuwan", 30000);
        Ebook naruto = new Ebook ("Roda Regina", "Desconhecido", 280, "PDF");
        
        System.out.println(onepiece.toString());
    }
}