package r13;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
public class b extends a {
    public static int c(int i14, int... iArr) {
        for (int i15 : iArr) {
            i14 = Math.max(i14, i15);
        }
        return i14;
    }

    public static <T extends Comparable<? super T>> T d(T t7, T t14) {
        t7.getClass();
        t14.getClass();
        return t7.compareTo(t14) >= 0 ? t7 : t14;
    }

    public static <T extends Comparable<? super T>> T e(T t7, T t14) {
        t7.getClass();
        t14.getClass();
        return t7.compareTo(t14) <= 0 ? t7 : t14;
    }
}
