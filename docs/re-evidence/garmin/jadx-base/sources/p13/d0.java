package p13;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class d0 extends c0 {
    public static final <T> boolean A(List<T> list, e23.l<? super T, Boolean> lVar, boolean z14) {
        int i14;
        if (!(list instanceof RandomAccess)) {
            list.getClass();
            if (!(list instanceof f23.a) || (list instanceof f23.b)) {
                return z(list, lVar, z14);
            }
            p005kotlin.jvm.internal.y0.i(list, "kotlin.collections.MutableIterable");
            throw null;
        }
        int iJ = x.j(list);
        if (iJ >= 0) {
            int i15 = 0;
            i14 = 0;
            while (true) {
                T t7 = list.get(i15);
                if (lVar.invoke(t7).booleanValue() != z14) {
                    if (i14 != i15) {
                        list.set(i14, t7);
                    }
                    i14++;
                }
                if (i15 == iJ) {
                    break;
                }
                i15++;
            }
        } else {
            i14 = 0;
        }
        if (i14 >= list.size()) {
            return false;
        }
        int size = list.size() - 1;
        if (i14 <= size) {
            while (true) {
                list.remove(size);
                if (size == i14) {
                    break;
                }
                size--;
            }
        }
        return true;
    }

    public static void B(e23.l lVar, List list) {
        list.getClass();
        lVar.getClass();
        A(list, lVar, true);
    }

    public static void C(Iterable iterable, e23.l lVar) {
        iterable.getClass();
        z(iterable, lVar, true);
    }

    public static <T> T D(List<T> list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        n23.j.s("List is empty.");
        return null;
    }

    public static <T> T E(List<T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T F(List<T> list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        n23.j.s("List is empty.");
        return null;
    }

    public static <T> T G(List<T> list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public static void v(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void w(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        collection.addAll(listAsList);
    }

    public static <T> boolean x(Collection<? super T> collection, c53.j<? extends T> jVar) {
        collection.getClass();
        jVar.getClass();
        Iterator<? extends T> it = jVar.iterator();
        boolean z14 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z14 = true;
            }
        }
        return z14;
    }

    public static final <T> Collection<T> y(Iterable<? extends T> iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? (Collection) iterable : h0.b1(iterable);
    }

    public static final <T> boolean z(Iterable<? extends T> iterable, e23.l<? super T, Boolean> lVar, boolean z14) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z15 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z14) {
                it.remove();
                z15 = true;
            }
        }
        return z15;
    }
}
