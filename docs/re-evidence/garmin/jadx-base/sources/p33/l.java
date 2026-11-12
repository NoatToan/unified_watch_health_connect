package p33;

import p43.d2;
import p43.f2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends p43.y implements p43.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p43.v0 f135471b;

    public l(p43.v0 v0Var) {
        v0Var.getClass();
        this.f135471b = v0Var;
    }

    @Override // p43.y, p43.n0
    public final boolean G0() {
        return false;
    }

    @Override // p43.v0, p43.f2
    public final f2 L0(p43.k1 k1Var) {
        k1Var.getClass();
        return new l(this.f135471b.L0(k1Var));
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: M0 */
    public final p43.v0 J0(boolean z14) {
        return z14 ? this.f135471b.J0(true) : this;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final p43.v0 L0(p43.k1 k1Var) {
        k1Var.getClass();
        return new l(this.f135471b.L0(k1Var));
    }

    @Override // p43.y
    public final p43.v0 O0() {
        return this.f135471b;
    }

    @Override // p43.y
    public final p43.y Q0(p43.v0 v0Var) {
        return new l(v0Var);
    }

    @Override // p43.u
    public final boolean T() {
        return true;
    }

    @Override // p43.u
    public final f2 y(p43.n0 n0Var) {
        n0Var.getClass();
        f2 f2VarI0 = n0Var.I0();
        if (!d2.h(f2VarI0) && !d2.g(f2VarI0)) {
            return f2VarI0;
        }
        if (f2VarI0 instanceof p43.v0) {
            p43.v0 v0Var = (p43.v0) f2VarI0;
            p43.v0 v0VarJ0 = v0Var.J0(false);
            return !d2.h(v0Var) ? v0VarJ0 : new l(v0VarJ0);
        }
        if (!(f2VarI0 instanceof p43.f0)) {
            lc.u0.r();
            return null;
        }
        p43.f0 f0Var = (p43.f0) f2VarI0;
        p43.v0 v0Var2 = f0Var.f135829b;
        p43.v0 v0VarJ1 = v0Var2.J0(false);
        if (d2.h(v0Var2)) {
            v0VarJ1 = new l(v0VarJ1);
        }
        p43.v0 v0Var3 = f0Var.f135830c;
        p43.v0 v0VarJ2 = v0Var3.J0(false);
        if (d2.h(v0Var3)) {
            v0VarJ2 = new l(v0VarJ2);
        }
        return og.a.e0(p43.q0.b(v0VarJ1, v0VarJ2), og.a.C(f2VarI0));
    }
}
