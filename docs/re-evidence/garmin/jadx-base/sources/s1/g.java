package s1;

import s1.r;

/* JADX INFO: loaded from: classes.dex */
public interface g<T, V extends r> {
    boolean a();

    long b();

    default boolean c(long j8) {
        return j8 >= b();
    }

    c2<T, V> d();

    T e(long j8);

    V f(long j8);

    T getTargetValue();
}
