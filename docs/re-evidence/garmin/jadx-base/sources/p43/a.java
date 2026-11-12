package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f135788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f135789c;

    public a(v0 v0Var, v0 v0Var2) {
        v0Var.getClass();
        v0Var2.getClass();
        this.f135788b = v0Var;
        this.f135789c = v0Var2;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final v0 L0(k1 k1Var) {
        k1Var.getClass();
        return new a(this.f135788b.L0(k1Var), this.f135789c);
    }

    @Override // p43.y
    public final v0 O0() {
        return this.f135788b;
    }

    @Override // p43.y
    public final y Q0(v0 v0Var) {
        return new a(v0Var, this.f135789c);
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final a J0(boolean z14) {
        return new a(this.f135788b.J0(z14), this.f135789c.J0(z14));
    }

    @Override // p43.y
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final a H0(q43.f fVar) {
        fVar.getClass();
        return new a((v0) fVar.f(this.f135788b), (v0) fVar.f(this.f135789c));
    }
}
