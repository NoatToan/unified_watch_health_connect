package p43;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f135944b;

    public z(v0 v0Var) {
        v0Var.getClass();
        this.f135944b = v0Var;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: M0 */
    public final v0 J0(boolean z14) {
        return z14 == G0() ? this : this.f135944b.J0(z14).L0(E0());
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final v0 L0(k1 k1Var) {
        k1Var.getClass();
        return k1Var != E0() ? new x0(this, k1Var) : this;
    }

    @Override // p43.y
    public final v0 O0() {
        return this.f135944b;
    }
}
