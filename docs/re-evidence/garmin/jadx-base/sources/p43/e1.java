package p43;

import ch.qos.logback.classic.spi.CallerData;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1 f135823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i43.l f135824f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(q43.p pVar, boolean z14, m1 m1Var) {
        super(pVar, z14);
        pVar.getClass();
        m1Var.getClass();
        this.f135823e = m1Var;
        this.f135824f = pVar.e().e().i();
    }

    @Override // p43.n0
    public final m1 F0() {
        return this.f135823e;
    }

    @Override // p43.e
    public final e1 O0(boolean z14) {
        return new e1(this.f135819b, z14, this.f135823e);
    }

    @Override // p43.e, p43.n0
    public final i43.l i() {
        return this.f135824f;
    }

    @Override // p43.v0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Stub (BI): ");
        sb3.append(this.f135819b);
        sb3.append(this.f135820c ? CallerData.NA : "");
        return sb3.toString();
    }
}
