package s70;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import i3.i7;
import i3.mh;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q1 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j70.r f157782b;

    public /* synthetic */ q1(j70.r rVar, int i14) {
        this.f157781a = i14;
        this.f157782b = rVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f157781a;
        j70.r rVar = this.f157782b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    List<j70.t> list = rVar.f97639d;
                    if (list == null) {
                        mVar.C(-1358048160);
                        mVar.f();
                    } else {
                        mVar.C(-1358048159);
                        for (j70.t tVar : list) {
                            h4.d.f81522a.getClass();
                            h4.g.b bVar = h4.d.a.f81534l;
                            c2.j jVar = c2.j.f22691a;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            float f14 = j92.b.f97899b.f97917b;
                            jVar.getClass();
                            c2.j.i iVarI = c2.j.i(f14);
                            h4.r.a aVar = h4.r.S;
                            s2 s2VarA = q2.a(iVarI, bVar, mVar, 48);
                            p3.x1 x1Var2 = p3.n.f135158a;
                            int iHashCode = Long.hashCode(mVar.getU());
                            i2 i2VarX = mVar.x();
                            h4.r rVarC = h4.k.c(aVar, mVar);
                            h5.g.V.getClass();
                            h5.e0.a aVar2 = h5.g.a.f81805b;
                            if (mVar.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar2);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            h5.g.a.b bVar2 = h5.g.a.f81813j;
                            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            u2 u2Var = u2.f22900a;
                            i7.b(tVar.f97656b, null, x2.q(aVar, j92.b.f97901d.f97904c), lc.u0.f(mVar), mVar, 48, 0);
                            String strQ = gl1.y.Q(mVar, tVar.f97655a);
                            d92.b.f58624b.getClass();
                            p3.m mVar2 = mVar;
                            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar2, 0, 0, 131070);
                            mVar = mVar2;
                            mVar.y();
                        }
                        mVar.f();
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    List<j70.t> list2 = rVar.f97639d;
                    if (list2 == null) {
                        mVar3.C(613258145);
                        mVar3.f();
                    } else {
                        mVar3.C(613258146);
                        for (j70.t tVar2 : list2) {
                            h4.d.f81522a.getClass();
                            h4.g.b bVar3 = h4.d.a.f81534l;
                            c2.j jVar2 = c2.j.f22691a;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            float f15 = j92.b.f97899b.f97917b;
                            jVar2.getClass();
                            c2.j.i iVarI2 = c2.j.i(f15);
                            h4.r.a aVar3 = h4.r.S;
                            s2 s2VarA2 = q2.a(iVarI2, bVar3, mVar3, 48);
                            p3.x1 x1Var5 = p3.n.f135158a;
                            int iHashCode2 = Long.hashCode(mVar3.getU());
                            i2 i2VarX2 = mVar3.x();
                            h4.r rVarC2 = h4.k.c(aVar3, mVar3);
                            h5.g.V.getClass();
                            h5.e0.a aVar4 = h5.g.a.f81805b;
                            if (mVar3.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar4);
                            } else {
                                mVar3.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA2, mVar3);
                            b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                            h5.g.a.b bVar4 = h5.g.a.f81813j;
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar3, iHashCode2, bVar4);
                            }
                            b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                            u2 u2Var2 = u2.f22900a;
                            i7.b(tVar2.f97656b, null, x2.q(aVar3, j92.b.f97901d.f97904c), lc.u0.f(mVar3), mVar3, 48, 0);
                            String strQ2 = gl1.y.Q(mVar3, tVar2.f97655a);
                            d92.b.f58624b.getClass();
                            p3.m mVar4 = mVar3;
                            mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar3), mVar4, 0, 0, 131070);
                            mVar3 = mVar4;
                            mVar3.y();
                        }
                        mVar3.f();
                    }
                    p3.x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
