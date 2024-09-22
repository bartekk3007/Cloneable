public class Pair implements Cloneable
{
    private Person first;
    private Person second;

    public Pair(Person first, Person second)
    {
        this.first = first;
        this.second = second;
    }
    public Pair clone() throws CloneNotSupportedException
    {
        return new Pair((Person)this.first.clone(), (Person)this.second.clone());
    }

    @Override
    public String toString()
    {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public Person getFirst()
    {
        return first;
    }

    public Person getSecond()
    {
        return second;
    }

    public void setFirst(Person first)
    {
        this.first = first;
    }

    public void setSecond(Person second)
    {
        this.second = second;
    }
}