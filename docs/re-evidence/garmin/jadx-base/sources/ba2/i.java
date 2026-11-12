package ba2;

import c2.b0;
import c2.c1;
import c2.h2;
import c2.l;
import c2.t;
import c2.t2;
import c2.u;
import c2.y;
import c2.z;
import e23.p;
import e23.q;
import f5.z0;
import h4.r;
import i3.ve;
import l72.s;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import r1.e0;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17085b;

    public /* synthetic */ i(p pVar, int i14) {
        this.f17084a = i14;
        this.f17085b = pVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f17084a;
        int i15 = 18;
        p pVar = this.f17085b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    pVar.invoke(mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                h2 h2Var = (h2) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                h2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(h2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarJ = l.j(l.x(r.S, h2Var), h2Var);
                    d0.f128823b.getClass();
                    ve.a(rVarJ, null, d0.f128831j, 0L, 0.0f, 0.0f, null, z3.f.c(-1909578606, new a3.d(pVar, 10), mVar2), mVar2, 12583296, 122);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    pVar.invoke(mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    pVar.invoke(mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj3).intValue();
                s sVar = s.f111232a;
                ((e0) obj).getClass();
                x1 x1Var5 = n.f135158a;
                pVar.invoke((m) obj2, 0);
                return Unit.INSTANCE;
            case 5:
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    pVar.invoke(mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                h2 h2Var2 = (h2) obj;
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                h2Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(h2Var2) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var7 = n.f135158a;
                    r rVarE = u1.n.e(l.j(l.x(r.S, h2Var2), h2Var2), k.a(d92.b.f58623a, mVar6), m1.f128891a);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar6.getU());
                    i2 i2VarX = mVar6.x();
                    r rVarC = h4.k.c(rVarE, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar6);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar6);
                    u uVar = u.f22885a;
                    v.h.B(pVar, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                t tVar = (t) obj;
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(tVar) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    if (pVar != null) {
                        mVar7.C(1079404280);
                        r.a aVar2 = r.S;
                        h4.d.f81522a.getClass();
                        r rVarC2 = tVar.c(aVar2, h4.d.a.f81528f);
                        c2.j.f22691a.getClass();
                        z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar7, 0);
                        int iHashCode2 = Long.hashCode(mVar7.getU());
                        i2 i2VarX2 = mVar7.x();
                        r rVarC3 = h4.k.c(rVarC2, mVar7);
                        h5.g.V.getClass();
                        h5.e0.a aVar3 = h5.g.a.f81805b;
                        if (mVar7.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar3);
                        } else {
                            mVar7.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar7);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar7);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar7, iHashCode2, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, mVar7);
                        b0 b0Var = b0.f22601a;
                        pVar.invoke(mVar7, 0);
                        mVar7.y();
                        mVar7.f();
                    } else {
                        mVar7.C(1079516717);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            default:
                h2 h2Var3 = (h2) obj;
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                h2Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(h2Var3) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var9 = n.f135158a;
                    ve.a(l.j(l.x(r.S, h2Var3), h2Var3), null, k.a(d92.b.f58623a, mVar8), 0L, 0.0f, 0.0f, null, z3.f.c(22585426, new uj1.y(pVar, i15), mVar8), mVar8, 12582912, 122);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
        }
    }
}
