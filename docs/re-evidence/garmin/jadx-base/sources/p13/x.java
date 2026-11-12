package p13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class x extends w {
    public static <T> ArrayList<T> d(T... tArr) {
        tArr.getClass();
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new j(tArr, true));
    }

    public static int e(e23.l lVar, List list, int i14) {
        list.getClass();
        lVar.getClass();
        o(list.size(), i14);
        int i15 = i14 - 1;
        int i16 = 0;
        while (i16 <= i15) {
            int i17 = (i16 + i15) >>> 1;
            int iIntValue = ((Number) lVar.invoke(list.get(i17))).intValue();
            if (iIntValue < 0) {
                i16 = i17 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i17;
                }
                i15 = i17 - 1;
            }
        }
        return -(i16 + 1);
    }

    public static int g(List list, Comparable comparable) {
        int size = list.size();
        list.getClass();
        o(list.size(), size);
        int i14 = size - 1;
        int i15 = 0;
        while (i15 <= i14) {
            int i16 = (i15 + i14) >>> 1;
            int iB = r13.a.b((Comparable) list.get(i16), comparable);
            if (iB < 0) {
                i15 = i16 + 1;
            } else {
                if (iB <= 0) {
                    return i16;
                }
                i14 = i16 - 1;
            }
        }
        return -(i15 + 1);
    }

    public static j0 h() {
        return j0.f134944a;
    }

    public static j23.l i(Collection<?> collection) {
        collection.getClass();
        return new j23.l(0, collection.size() - 1);
    }

    public static <T> int j(List<? extends T> list) {
        list.getClass();
        return list.size() - 1;
    }

    public static <T> List<T> k(T... tArr) {
        tArr.getClass();
        if (tArr.length <= 0) {
            return j0.f134944a;
        }
        List<T> listAsList = Arrays.asList(tArr);
        listAsList.getClass();
        return listAsList;
    }

    public static <T> List<T> l(T t7) {
        return t7 != null ? w.c(t7) : j0.f134944a;
    }

    public static ArrayList m(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j(objArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> n(List<? extends T> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : w.c(list.get(0));
        }
        return j0.f134944a;
    }

    public static final void o(int i14, int i15) {
        if (i15 < 0) {
            vb.h.s(v.e0.f(i15, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i15 <= i14) {
                return;
            }
            org.apache.commons.lang3.e.v(am.j.g(i15, i14, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static void p() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void q() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
