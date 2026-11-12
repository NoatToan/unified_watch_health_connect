package ef;

import df.r;
import gl1.y;
import o53.z;

/* JADX INFO: loaded from: classes7.dex */
public interface b {
    default z a() {
        return y.o(d());
    }

    default void b(Runnable runnable) {
        d().execute(runnable);
    }

    c.a c();

    r d();
}
