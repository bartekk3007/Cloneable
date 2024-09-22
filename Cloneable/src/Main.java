public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Person p1 = new Person("Andrzej", "Kowalski", 30);
        Person p2 = new Person("Bartek", "Kołakowski", 40);
        Pair pair1 = new Pair(p1, p2);
        Pair pair2 = pair1.clone();
        System.out.println(pair1);
        System.out.println(pair2);
        pair2.getFirst().setSurname("Szczęsny");
        System.out.println(pair1);
        System.out.println(pair2);
    }
}