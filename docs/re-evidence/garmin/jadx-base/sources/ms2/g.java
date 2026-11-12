package ms2;

import android.content.Intent;
import vr2.q;

/* JADX INFO: loaded from: classes11.dex */
public interface g {
    is2.b a();

    default boolean b(String str, String str2) {
        str.getClass();
        str2.getClass();
        return false;
    }

    d c(hs2.d dVar, hs2.a aVar);

    Intent d(f fVar, long j8);

    q03.b destroy();

    Intent e(qs2.d dVar);

    default boolean f(String str) {
        str.getClass();
        return false;
    }

    default void g(long j8) {
    }

    default boolean h(hs2.a aVar) {
        aVar.getClass();
        return true;
    }

    default boolean i(fs2.a aVar) {
        return false;
    }

    q03.b initialize();

    default ns2.c j(f fVar, long j8) {
        return ns2.c.b.f127826a;
    }

    Intent k(String str, q qVar);

    default void l() {
    }

    default boolean m(fs2.a aVar) {
        return false;
    }

    default q03.b n() {
        z03.f fVar = z03.f.f200765a;
        fVar.getClass();
        return fVar;
    }

    default void o() {
    }
}
