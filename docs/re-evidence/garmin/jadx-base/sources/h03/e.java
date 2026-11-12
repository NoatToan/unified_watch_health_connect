package h03;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    public enum a {
        FIRST,
        LAST
    }

    private e() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001b  */
    public static <T extends Comparable<T>> int a(T t7, T t14, a aVar) {
        int i14;
        if (t7 != null && t14 != null) {
            return t7.compareTo(t14);
        }
        if (t7 == null && t14 == null) {
            i14 = 0;
        } else if (t7 == null && t14 != null) {
            i14 = -1;
        } else if (t7 == null || t14 != null) {
            i14 = 0;
        } else {
            i14 = 1;
        }
        return a.LAST == aVar ? i14 * (-1) : i14;
    }

    public static int b(int i14, Object obj) {
        if (obj == null) {
            return i14 * 37;
        }
        if (!obj.getClass().isArray()) {
            return (i14 * 37) + obj.hashCode();
        }
        int length = Array.getLength(obj);
        for (int i15 = 0; i15 < length; i15++) {
            i14 = b(i14, Array.get(obj, i15));
        }
        return i14;
    }
}
