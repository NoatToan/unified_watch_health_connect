package v0;

import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.w1;
import c22.t;
import java.util.UUID;
import m0.m;

/* JADX INFO: loaded from: classes.dex */
public class e implements b3.b<d, f, e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f174171a;

    public e(w1 w1Var) {
        this.f174171a = w1Var;
        androidx.camera.core.impl.h hVar = m.L;
        Class cls = (Class) w1Var.f(hVar, null);
        if (cls != null && !cls.equals(d.class)) {
            t.i("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        w1Var.X(b3.E, c3.b.STREAM_SHARING);
        w1Var.X(hVar, d.class);
        androidx.camera.core.impl.h hVar2 = m.K;
        if (w1Var.f(hVar2, null) == null) {
            w1Var.X(hVar2, d.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    @Override // androidx.camera.core.impl.b3.b
    public final b3 b() {
        return new f(a2.T(this.f174171a));
    }

    @Override // b0.c0
    public final v1 d() {
        return this.f174171a;
    }

    public e() {
        this(w1.U());
    }
}
