package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class t94 {
    public static <T extends Comparable<? super T>> int a(T t, T t2) {
        return b(t, t2, false);
    }

    public static <T extends Comparable<? super T>> int b(T t, T t2, boolean z) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return z ? 1 : -1;
        }
        if (t2 == null) {
            return z ? -1 : 1;
        }
        return t.compareTo(t2);
    }

    public static <T> int c(T t, T t2, boolean z) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return z ? 1 : -1;
        }
        if (t2 == null) {
            return z ? -1 : 1;
        }
        if ((t instanceof Comparable) && (t2 instanceof Comparable)) {
            return ((Comparable) t).compareTo(t2);
        }
        if (t.equals(t2)) {
            return 0;
        }
        int iCompare = Integer.compare(t.hashCode(), t2.hashCode());
        return iCompare == 0 ? a(t.toString(), t2.toString()) : iCompare;
    }
}
