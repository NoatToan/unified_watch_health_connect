package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import defpackage.mcp;
import defpackage.r4d;
import defpackage.zj3;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o implements r<androidx.camera.core.o>, k, mcp {
    public static final Config.a<r4d> A = Config.a.a("camerax.core.preview.imageInfoProcessor", r4d.class);
    public static final Config.a<zj3> B = Config.a.a("camerax.core.preview.captureProcessor", zj3.class);
    public static final Config.a<Boolean> C = Config.a.a("camerax.core.preview.isRgba8888SurfaceRequired", Boolean.class);
    public final n z;

    public o(n nVar) {
        this.z = nVar;
    }

    public zj3 K(zj3 zj3Var) {
        return (zj3) d(B, zj3Var);
    }

    public r4d L(r4d r4dVar) {
        return (r4d) d(A, r4dVar);
    }

    public boolean M(boolean z) {
        return ((Boolean) d(C, Boolean.valueOf(z))).booleanValue();
    }

    @Override // androidx.camera.core.impl.p
    public Config e() {
        return this.z;
    }

    @Override // androidx.camera.core.impl.j
    public int m() {
        return ((Integer) a(j.f1737k)).intValue();
    }
}
