import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    /*this method implements the Comparator with Student class
    * and the compare method must be overridden
    * which in this case compares the getName from both objects
    *  and orders them alphabetically*/
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
