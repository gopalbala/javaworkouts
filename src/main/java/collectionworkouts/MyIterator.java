package collectionworkouts;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;

/**
 * Created by gbalasubramanian on 18/07/18.
 */
@Getter
@Setter
public class MyIterator<T> implements Iterator<T> {

    private T[] myArray;
    private int current = 0;

    @Override
    public boolean hasNext() {
        return current < myArray.length && myArray[current] != null;
    }

    @Override
    public T next() {
        return (T) myArray[current++];
    }
}
