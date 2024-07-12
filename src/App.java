import iphone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone1 = new Iphone();
        System.out.println("Music");
        iphone1.selectMusic("Sinto sua falta");
        iphone1.pause();
        System.out.println("\nTelefon");
        iphone1.call("98442-7332");
        iphone1.answer();
        System.out.println("\nInternet");
        iphone1.addPage();
        iphone1.displayPage("site.com");
        iphone1.updatePage();
    }
}
