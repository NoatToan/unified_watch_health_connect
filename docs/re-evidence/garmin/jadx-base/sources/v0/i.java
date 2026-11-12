package v0;

import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.w2;
import androidx.camera.core.impl.y;

/* JADX INFO: loaded from: classes.dex */
public class i implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f174189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f174190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f174191c;

    private i(c0 c0Var, w2 w2Var, long j8) {
        this.f174189a = c0Var;
        this.f174190b = w2Var;
        this.f174191c = j8;
    }

    @Override // androidx.camera.core.impl.c0
    public final w2 a() {
        return this.f174190b;
    }

    @Override // androidx.camera.core.impl.c0
    public final b0 b() {
        c0 c0Var = this.f174189a;
        return c0Var != null ? c0Var.b() : b0.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.c0
    public final y d() {
        c0 c0Var = this.f174189a;
        return c0Var != null ? c0Var.d() : y.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.c0
    public final a0 e() {
        c0 c0Var = this.f174189a;
        return c0Var != null ? c0Var.e() : a0.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.c0
    public final w f() {
        c0 c0Var = this.f174189a;
        return c0Var != null ? c0Var.f() : w.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.c0
    public final long getTimestamp() {
        c0 c0Var = this.f174189a;
        if (c0Var != null) {
            return c0Var.getTimestamp();
        }
        long j8 = this.f174191c;
        if (j8 != -1) {
            return j8;
        }
        vb.h.z("No timestamp is available.");
        return 0L;
    }

    public i(w2 w2Var, long j8) {
        this(null, w2Var, j8);
    }

    public i(w2 w2Var, c0 c0Var) {
        this(c0Var, w2Var, -1L);
    }
}
