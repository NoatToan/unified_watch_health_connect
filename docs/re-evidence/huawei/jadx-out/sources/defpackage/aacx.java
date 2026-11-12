package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class aacx {
    public static <T> List<T> e(List<T> list) {
        return b(list, false);
    }

    public static <T> List<T> b(List<T> list, boolean z) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add(list.get(0));
        if (list.size() > 1) {
            for (int i = 1; i < list.size(); i++) {
                T t = list.get(i);
                int iIndexOf = arrayList.indexOf(t);
                if (iIndexOf < 0) {
                    arrayList.add(t);
                } else if (!z) {
                    throw new IllegalArgumentException("Item " + t + "[" + i + "] is already contained at index [" + iIndexOf + "]!");
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static <T> List<T> c(List<T> list, T t) {
        if (list == null) {
            throw new NullPointerException("List must not be null!");
        }
        if (t != null && !list.contains(t)) {
            list.add(t);
        }
        return list;
    }

    public static <T> List<T> d(List<T> list, List<T> list2) {
        if (list == null) {
            throw new NullPointerException("List must not be null!");
        }
        if (list2 != null && !list2.isEmpty()) {
            for (T t : list2) {
                if (t != null && !list.contains(t)) {
                    list.add(t);
                }
            }
        }
        return list;
    }
}
