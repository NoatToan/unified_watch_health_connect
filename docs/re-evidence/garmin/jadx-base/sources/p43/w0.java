package p43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f135933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<t1> f135934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f135935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i43.l f135936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<q43.f, v0> f135937f;

    /* JADX WARN: Multi-variable type inference failed */
    public w0(m1 m1Var, List<? extends t1> list, boolean z14, i43.l lVar, e23.l<? super q43.f, ? extends v0> lVar2) {
        m1Var.getClass();
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        this.f135933b = m1Var;
        this.f135934c = list;
        this.f135935d = z14;
        this.f135936e = lVar;
        this.f135937f = lVar2;
        if (!(lVar instanceof r43.g) || (lVar instanceof r43.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + lVar + '\n' + m1Var);
    }

    @Override // p43.n0
    public final List<t1> D0() {
        return this.f135934c;
    }

    @Override // p43.n0
    public final k1 E0() {
        k1.f135863b.getClass();
        return k1.f135864c;
    }

    @Override // p43.n0
    public final m1 F0() {
        return this.f135933b;
    }

    @Override // p43.n0
    public final boolean G0() {
        return this.f135935d;
    }

    @Override // p43.n0
    public final n0 H0(q43.f fVar) {
        fVar.getClass();
        v0 v0VarInvoke = this.f135937f.invoke(fVar);
        return v0VarInvoke == null ? this : v0VarInvoke;
    }

    @Override // p43.f2
    /* JADX INFO: renamed from: K0 */
    public final f2 H0(q43.f fVar) {
        fVar.getClass();
        v0 v0VarInvoke = this.f135937f.invoke(fVar);
        return v0VarInvoke == null ? this : v0VarInvoke;
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: M0 */
    public final v0 J0(boolean z14) {
        if (z14 == this.f135935d) {
            return this;
        }
        return z14 ? new u0(this) : new t0(this);
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final v0 L0(k1 k1Var) {
        k1Var.getClass();
        return k1Var.isEmpty() ? this : new x0(this, k1Var);
    }

    @Override // p43.n0
    public final i43.l i() {
        return this.f135936e;
    }
}
