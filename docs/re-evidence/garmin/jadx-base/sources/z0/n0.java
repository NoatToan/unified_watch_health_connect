package z0;

import androidx.camera.core.impl.x2;
import androidx.camera.core.impl.y0;
import androidx.camera.core.impl.z1;
import b0.g1;

/* JADX INFO: loaded from: classes.dex */
public interface n0 {

    public enum a {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    void a(g1 g1Var);

    default void b(g1 g1Var, x2 x2Var, boolean z14) {
        a(g1Var);
    }

    default f0 c(b0.r rVar, int i14) {
        return f0.f200624a;
    }

    default void d(a aVar) {
    }

    default z1<q> e() {
        return y0.a(null);
    }

    default z1<e0> f() {
        return e0.f200614c;
    }

    default z1<Boolean> g() {
        return y0.a(Boolean.FALSE);
    }
}
