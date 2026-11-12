package p13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class b1 extends a1 {
    public static <T> HashSet<T> c(T... tArr) {
        HashSet<T> hashSet = new HashSet<>(t0.a(tArr.length));
        u.c0(tArr, hashSet);
        return hashSet;
    }

    public static <T> LinkedHashSet<T> d(T... tArr) {
        LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>(t0.a(tArr.length));
        u.c0(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static <T> Set<T> e(T... tArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(t0.a(tArr.length));
        u.c0(tArr, linkedHashSet);
        return linkedHashSet;
    }
}
