package zz2;

import a03.j0;
import c2.x2;
import f5.k0;
import h5.e0;
import kotlin.k2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.g3;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class u implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a03.p f207710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f207711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f207712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f207713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f207714e;

    /* JADX WARN: Multi-variable type inference failed */
    public u(a03.p pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, e23.a<Unit> aVar, o53.b0 b0Var) {
        this.f207710a = pVar;
        this.f207711b = pVar2;
        this.f207712c = qVar;
        this.f207713d = aVar;
        this.f207714e = b0Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        h4.r rVarF;
        p3.m mVar2 = mVar;
        if ((num.intValue() & 11) == 2 && mVar2.b()) {
            mVar2.e();
        } else {
            a03.p pVar = this.f207710a;
            if (pVar.f156g) {
                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                rVarF2.getClass();
                rVarF = h4.k.a(rVarF2, k2.f91249a, new j0(pVar));
            } else {
                rVarF = x2.f(h4.r.S, 1.0f);
            }
            mVar2.L(-483455358);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            mVar2.L(-1323940314);
            x1 x1Var = p3.n.f135158a;
            int iP = mVar2.P();
            i2 i2VarX = mVar2.x();
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            z3.e eVarC = k0.c(rVarF);
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar);
            } else {
                mVar2.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            eVarC.invoke(g3.a(mVar2), mVar2, 0);
            mVar2.L(2058660585);
            c2.b0 b0Var = c2.b0.f22601a;
            mVar2.L(-440658510);
            e23.p<p3.m, Integer, Unit> pVar2 = this.f207711b;
            if (pVar2 != null) {
                h4.r rVarC = p5.v.c(new f(pVar, this.f207713d, this.f207714e), b0Var.b(h4.r.S, h4.d.a.f81537o), true);
                mVar2.L(733328855);
                c2.s sVarE = c2.q.e(h4.d.a.f81524b, mVar2, 0);
                mVar2.L(-1323940314);
                int iP2 = mVar2.P();
                i2 i2VarX2 = mVar2.x();
                z3.e eVarC2 = k0.c(rVarC);
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar);
                } else {
                    mVar2.c();
                }
                b4.c(eVar, sVarE, mVar2);
                b4.c(c1623g, i2VarX2, mVar2);
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP2))) {
                    v.h.z(iP2, mVar2, iP2, bVar);
                }
                eVarC2.invoke(g3.a(mVar2), mVar2, 0);
                mVar2.L(2058660585);
                c2.u uVar = c2.u.f22885a;
                pVar2.invoke(mVar2, 0);
                mVar2.R();
                mVar2.y();
                mVar2.R();
                mVar2.R();
            }
            mVar2.R();
            this.f207712c.invoke(b0Var, mVar2, 6);
            mVar2.R();
            mVar2.y();
            mVar2.R();
            mVar2.R();
        }
        return Unit.INSTANCE;
    }
}
