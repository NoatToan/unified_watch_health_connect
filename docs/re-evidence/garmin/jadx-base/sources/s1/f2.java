package s1;

import s1.r;

/* JADX INFO: loaded from: classes.dex */
public interface f2<V extends r> {
    boolean a();

    long c(V v14, V v15, V v16);

    V d(long j8, V v14, V v15, V v16);

    default V e(V v14, V v15, V v16) {
        return (V) d(c(v14, v15, v16), v14, v15, v16);
    }

    V f(long j8, V v14, V v15, V v16);
}
