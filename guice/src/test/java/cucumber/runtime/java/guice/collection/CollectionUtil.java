package cucumber.runtime.java.guice.collection;

import java.util.List;

public class CollectionUtil {

    /**
     * Removes all elements in the supplied list except the first element.
     * @param list the list to be modified
     * @throws java.lang.NullPointerException if the list is null
     * @throws java.lang.IllegalArgumentException if the list is empty
     */
    public static <E> void removeAllExceptFirstElement(List<E> list) {
        if (list == null) {
            throw new NullPointerException("List must not be null.");
        }
        if (list.size() < 1) {
            throw new IllegalArgumentException("List must contain at least one element.");
        }
        while (list.size() > 1) {
            list.remove(list.size() - 1);
        }
    }
}
