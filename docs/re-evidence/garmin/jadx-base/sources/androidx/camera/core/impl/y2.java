package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final class y2 implements b0.x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.x0 f5866c;

    public y2(long j8, b0.x0 x0Var) {
        k7.h.b(j8 >= 0, "Timeout must be non-negative.");
        this.f5865b = j8;
        this.f5866c = x0Var;
    }

    @Override // b0.x0
    public final long b() {
        return this.f5865b;
    }

    @Override // b0.x0
    public final b0.x0.c c(p0 p0Var) {
        b0.x0.c cVarC = this.f5866c.c(p0Var);
        long j8 = this.f5865b;
        return (j8 <= 0 || p0Var.f5681b < j8 - cVarC.f14118a) ? cVarC : b0.x0.c.f14115d;
    }
}
