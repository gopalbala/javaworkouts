package collectionworkouts;

import java.util.Iterator;

/**
 * Created by gbalasubramanian on 18/07/18.
 */
public class MyCollection<T> implements Iterable<T> {


    @Override
    public Iterator<T> iterator() {
        MyIterator<String> myIterator = new MyIterator<>();

        String[] str = {"abc", "bca", "cab"};
        myIterator.setMyArray(str);
        return (Iterator<T>) myIterator;
    }

    public static void main(String[] args) {
        MyCollection<String> strings = new MyCollection<>();
        strings.forEach(s-> System.out.println(s));
    }
}
