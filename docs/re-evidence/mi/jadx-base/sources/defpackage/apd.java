package defpackage;

import cn.hutool.core.text.StrJoiner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class apd {
    public static boolean a(Iterable<?> iterable) {
        return iterable != null && b(iterable.iterator());
    }

    public static boolean b(Iterator<?> it) {
        return it != null && it.hasNext();
    }

    public static <T> String c(Iterator<T> it, CharSequence charSequence) {
        return StrJoiner.j(charSequence).f(it).toString();
    }

    public static <E> List<E> d(Iterable<E> iterable) {
        if (iterable == null) {
            return null;
        }
        return e(iterable.iterator());
    }

    public static <E> List<E> e(Iterator<E> it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
