package a61;

import am.x0;
import c2.x2;
import c80.s0;
import com.garmin.android.apps.connectmobile.performance.StrengthStatsActivity;
import java.util.List;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import zd0.g1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mp.b[] f1595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StrengthStatsActivity f1596c;

    public /* synthetic */ g(mp.b[] bVarArr, StrengthStatsActivity strengthStatsActivity, int i14) {
        this.f1594a = i14;
        this.f1595b = bVarArr;
        this.f1596c = strengthStatsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0184  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        List listI0;
        int i14 = this.f1594a;
        StrengthStatsActivity strengthStatsActivity = this.f1596c;
        mp.b[] bVarArr = this.f1595b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                StrengthStatsActivity.a aVar = StrengthStatsActivity.f39815r;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1426123195, new g(bVarArr, strengthStatsActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                StrengthStatsActivity.a aVar2 = StrengthStatsActivity.f39815r;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarF = x2.f(aVar3, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81537o;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    jVar.getClass();
                    c2.z zVarA = c2.y.a(c2.j.i(f14), aVar4, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    g1 g1Var = (g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null);
                    s0 s0Var = s0.ACTIVITY_REPORTS;
                    x0 x0Var = x0.f4309n1;
                    ub1.l lVarU = g1.u(g1Var, s0Var, new ks.b(x0Var), 4);
                    if (lVarU == null) {
                        mVar2.C(-2114467763);
                        mVar2.f();
                    } else {
                        mVar2.C(-2114467762);
                        h4.r rVarE = u1.n.e(x2.f(aVar3, 1.0f), d92.b.a(mVar2).c().b(), m1.f128891a);
                        c2.z zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarE, mVar2);
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar5);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA2, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, mVar2);
                        lVarU.a(c2.l.y(aVar3, eVar.f97920e), mVar2, 0);
                        mVar2.y();
                        mVar2.f();
                    }
                    mp.g gVar = new mp.g(x0.f4316p, x0Var);
                    if (bVarArr == 0 || (listI0 = p13.u.i0(bVarArr)) == null) {
                        listI0 = p13.j0.f134944a;
                    }
                    List list = listI0;
                    boolean zR = mVar2.r(strengthStatsActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new a03.f(strengthStatsActivity, 2);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a03.f(strengthStatsActivity, 2);
                            mVar2.K(objQ);
                        }
                    }
                    pp.d.b(null, gVar, list, (e23.l) objQ, mVar2, 0, 1);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
