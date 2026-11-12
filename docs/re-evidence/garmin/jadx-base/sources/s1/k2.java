package s1;

import s1.r;

/* JADX INFO: loaded from: classes.dex */
public interface k2<V extends r> extends l2<V> {
    int b();

    @Override // s1.f2
    default long c(V v14, V v15, V v16) {
        return ((long) (b() + g())) * 1000000;
    }

    int g();
}
