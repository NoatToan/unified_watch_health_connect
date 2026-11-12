package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class t9 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m9 f89769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f89770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f89771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.f0<o4.d0> f89772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f89774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89775g;

    /* JADX WARN: Multi-variable type inference failed */
    public t9(m9 m9Var, boolean z14, boolean z15, s1.f0<o4.d0> f0Var, e23.p<? super p3.m, ? super Integer, Unit> pVar, boolean z16, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
        this.f89769a = m9Var;
        this.f89770b = z14;
        this.f89771c = z15;
        this.f89772d = f0Var;
        this.f89773e = pVar;
        this.f89774f = z16;
        this.f89775g = pVar2;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        long j8;
        h4.r rVarB;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean z14 = this.f89771c;
            boolean z15 = this.f89770b;
            m9 m9Var = this.f89769a;
            if (z14) {
                j8 = z15 ? m9Var.f88958a : m9Var.f88961d;
            } else {
                j8 = m9Var.f88963f;
            }
            p3.x3 x3VarA = r1.f2.a(j8, this.f89772d, mVar2);
            if (this.f89773e == null || !(this.f89774f || z15)) {
                mVar2.C(-634793532);
                mVar2.f();
                rVarB = h4.r.S;
            } else {
                mVar2.C(-634794445);
                h4.r.a aVar = h4.r.S;
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i11.f(22);
                    mVar2.K(objQ);
                }
                rVarB = p5.v.b(aVar, (e23.l) objQ);
                mVar2.f();
            }
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarB, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            p3.v.a(s2.f89590a.c(o4.d0.a(((o4.d0) x3VarA.getF182175a()).f128833a)), this.f89775g, mVar2, 8);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
