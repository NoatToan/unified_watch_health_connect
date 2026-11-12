package q43;

import java.util.List;
import p13.j0;
import p43.f2;
import p43.k1;
import p43.m1;
import p43.t1;
import p43.v0;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends v0 implements t43.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t43.b f142790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f142791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f2 f142792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f142793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f142794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f142795g;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(t43.b bVar, m mVar, f2 f2Var, k1 k1Var, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 8) != 0) {
            k1.f135863b.getClass();
            k1Var = k1.f135864c;
        }
        this(bVar, mVar, f2Var, k1Var, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? false : z15);
    }

    @Override // p43.n0
    public final List<t1> D0() {
        return j0.f134944a;
    }

    @Override // p43.n0
    public final k1 E0() {
        return this.f142793e;
    }

    @Override // p43.n0
    public final m1 F0() {
        return this.f142791c;
    }

    @Override // p43.n0
    public final boolean G0() {
        return this.f142794f;
    }

    @Override // p43.v0, p43.f2
    public final f2 J0(boolean z14) {
        return new h(this.f142790b, this.f142791c, this.f142792d, this.f142793e, z14, false, 32, null);
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: M0 */
    public final v0 J0(boolean z14) {
        return new h(this.f142790b, this.f142791c, this.f142792d, this.f142793e, z14, false, 32, null);
    }

    @Override // p43.v0
    /* JADX INFO: renamed from: N0 */
    public final v0 L0(k1 k1Var) {
        k1Var.getClass();
        return new h(this.f142790b, this.f142791c, this.f142792d, k1Var, this.f142794f, this.f142795g);
    }

    @Override // p43.f2
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final h H0(f fVar) {
        fVar.getClass();
        m mVar = this.f142791c;
        mVar.getClass();
        fVar.getClass();
        t1 t1VarC = mVar.f142801a.c(fVar);
        l lVar = mVar.f142802b != null ? new l(mVar, fVar) : null;
        m mVar2 = mVar.f142803c;
        if (mVar2 == null) {
            mVar2 = mVar;
        }
        m mVar3 = new m(t1VarC, lVar, mVar2, mVar.f142804d);
        f2 f2Var = this.f142792d;
        return new h(this.f142790b, mVar3, f2Var != null ? fVar.f(f2Var).I0() : null, this.f142793e, this.f142794f, false, 32, null);
    }

    @Override // p43.n0
    public final i43.l i() {
        return r43.l.a(r43.h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public h(t43.b bVar, m mVar, f2 f2Var, k1 k1Var, boolean z14, boolean z15) {
        bVar.getClass();
        mVar.getClass();
        k1Var.getClass();
        this.f142790b = bVar;
        this.f142791c = mVar;
        this.f142792d = f2Var;
        this.f142793e = k1Var;
        this.f142794f = z14;
        this.f142795g = z15;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(t43.b bVar, f2 f2Var, t1 t1Var, d1 d1Var) {
        this(bVar, new m(t1Var, null, null, d1Var, 6, null), f2Var, null, false, false, 56, null);
        bVar.getClass();
        t1Var.getClass();
        d1Var.getClass();
    }
}
