package p43;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends y implements e2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f135942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f135943c;

    public y0(v0 v0Var, n0 n0Var) {
        v0Var.getClass();
        n0Var.getClass();
        this.f135942b = v0Var;
        this.f135943c = n0Var;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: M0 */
    public final v0 J0(boolean z14) {
        f2 f2VarE0 = og.a.e0(this.f135942b.J0(z14), this.f135943c.I0().J0(z14));
        f2VarE0.getClass();
        return (v0) f2VarE0;
    }

    @Override // p43.e2
    public final n0 N() {
        return this.f135943c;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final v0 L0(k1 k1Var) {
        k1Var.getClass();
        f2 f2VarE0 = og.a.e0(this.f135942b.L0(k1Var), this.f135943c);
        f2VarE0.getClass();
        return (v0) f2VarE0;
    }

    @Override // p43.y
    public final v0 O0() {
        return this.f135942b;
    }

    @Override // p43.y
    public final y Q0(v0 v0Var) {
        return new y0(v0Var, this.f135943c);
    }

    @Override // p43.y
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final y0 H0(q43.f fVar) {
        fVar.getClass();
        return new y0((v0) fVar.f(this.f135942b), fVar.f(this.f135943c));
    }

    @Override // p43.e2
    public final f2 getOrigin() {
        return this.f135942b;
    }

    @Override // p43.v0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f135943c + ")] " + this.f135942b;
    }
}
