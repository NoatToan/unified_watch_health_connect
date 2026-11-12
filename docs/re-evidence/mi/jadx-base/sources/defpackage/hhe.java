package defpackage;

import cn.hutool.core.collection.CollUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class hhe {
    public static <T> List<T> a() {
        return Collections.emptyList();
    }

    public static <T> int[] b(List<T> list, b8f<T> b8fVar) {
        return CollUtil.g(list, b8fVar);
    }

    public static <T> List<T> c(boolean z) {
        return z ? new LinkedList() : new ArrayList();
    }

    public static <T> List<T> d(boolean z, Collection<T> collection) {
        if (collection == null) {
            return c(z);
        }
        return z ? new LinkedList(collection) : new ArrayList(collection);
    }

    public static <T> List<T> e(boolean z, Iterator<T> it) {
        List<T> listC = c(z);
        if (it != null) {
            while (it.hasNext()) {
                listC.add(it.next());
            }
        }
        return listC;
    }

    @SafeVarargs
    public static <T> List<T> f(boolean z, T... tArr) {
        if (qj1.D(tArr)) {
            return c(z);
        }
        List<T> linkedList = z ? new LinkedList<>() : new ArrayList<>(tArr.length);
        Collections.addAll(linkedList, tArr);
        return linkedList;
    }

    public static <T> List<T> g(List<T> list, int i, T t) {
        if (i < list.size()) {
            list.set(i, t);
        } else {
            list.add(t);
        }
        return list;
    }

    public static <T> List<T> h(List<T> list, int i, int i2, int i3) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return new ArrayList(0);
        }
        int size = list.size();
        if (i < 0) {
            i += size;
        }
        if (i2 < 0) {
            i2 += size;
        }
        if (i == size) {
            return new ArrayList(0);
        }
        if (i <= i2) {
            int i4 = i2;
            i2 = i;
            i = i4;
        }
        if (i <= size) {
            size = i;
        } else if (i2 >= size) {
            return new ArrayList(0);
        }
        if (i3 < 1) {
            i3 = 1;
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < size) {
            arrayList.add(list.get(i2));
            i2 += i3;
        }
        return arrayList;
    }

    public static <T> ArrayList<T> i(Collection<T> collection) {
        return (ArrayList) d(false, collection);
    }

    public static <T> ArrayList<T> j(Iterator<T> it) {
        return (ArrayList) e(false, it);
    }

    @SafeVarargs
    public static <T> ArrayList<T> k(T... tArr) {
        return (ArrayList) f(false, tArr);
    }
}
