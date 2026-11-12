package cf;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public interface d0 {
    void a(String str);

    default void b(String str, Set<String> set) {
        str.getClass();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            d(new c0((String) it.next(), str));
        }
    }

    List<String> c(String str);

    void d(c0 c0Var);
}
