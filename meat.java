public class meat {
    public void display() {
        System.out.println("This is the meat class");
    }
    
    class Beef extends meat {
        public void display() {
            System.out.println("This is the beef class");
        }
    }

    public static void main(String[] args) {
        Beef beef = new Beef();
        beef.display();
    }
}
