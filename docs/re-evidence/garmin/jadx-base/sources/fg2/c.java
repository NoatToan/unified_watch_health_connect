package fg2;

import java.util.List;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
public interface c {
    default String a(String str) {
        str.getClass();
        return null;
    }

    Object b(long j8, v13.c cVar);

    default void c(int i14, long j8) {
    }

    Object d(long j8, v13.c cVar);

    Object e(long j8, v13.c cVar);

    default Object f(long j8, t13.d<? super List<? extends ag2.c.a>> dVar) {
        return j0.f134944a;
    }

    default Object g(long j8, t13.d<? super rs2.c> dVar) {
        return null;
    }

    Object h(long j8, v13.c cVar);
}
