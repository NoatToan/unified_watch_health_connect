package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends f0 implements e2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f135852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f135853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(f0 f0Var, n0 n0Var) {
        super(f0Var.f135829b, f0Var.f135830c);
        f0Var.getClass();
        n0Var.getClass();
        this.f135852d = f0Var;
        this.f135853e = n0Var;
    }

    @Override // p43.n0
    public final n0 H0(q43.f fVar) {
        fVar.getClass();
        return new h0((f0) fVar.f(this.f135852d), fVar.f(this.f135853e));
    }

    @Override // p43.f2
    public final f2 J0(boolean z14) {
        return og.a.e0(this.f135852d.J0(z14), this.f135853e.I0().J0(z14));
    }

    @Override // p43.f2
    /* JADX INFO: renamed from: K0 */
    public final f2 H0(q43.f fVar) {
        fVar.getClass();
        return new h0((f0) fVar.f(this.f135852d), fVar.f(this.f135853e));
    }

    @Override // p43.f2
    public final f2 L0(k1 k1Var) {
        k1Var.getClass();
        return og.a.e0(this.f135852d.L0(k1Var), this.f135853e);
    }

    @Override // p43.f0
    public final v0 M0() {
        return this.f135852d.M0();
    }

    @Override // p43.e2
    public final n0 N() {
        return this.f135853e;
    }

    @Override // p43.f0
    public final String N0(a43.w wVar, a43.w wVar2) {
        a43.c0 c0Var = wVar2.f1180e;
        return ((Boolean) c0Var.f1121m.getValue(c0Var, a43.c0.Y[11])).booleanValue() ? wVar.W(this.f135853e) : this.f135852d.N0(wVar, wVar2);
    }

    @Override // p43.e2
    public final f2 getOrigin() {
        return this.f135852d;
    }

    @Override // p43.f0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f135853e + ")] " + this.f135852d;
    }
}
