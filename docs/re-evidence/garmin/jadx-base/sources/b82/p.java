package b82;

import c2.x2;
import java.util.Iterator;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f16722b;

    public /* synthetic */ p(i53.c cVar, int i14) {
        this.f16721a = i14;
        this.f16722b = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16721a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 2;
        i53.c cVar = this.f16722b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = s.f16758a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    int i16 = 0;
                    for (Object obj3 : cVar) {
                        int i17 = i16 + 1;
                        if (i16 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        s.b bVar = (s.b) obj3;
                        s sVar2 = s.f16758a;
                        boolean z14 = i16 == 0;
                        int i18 = b92.a.f16960b;
                        sVar2.c(bVar, z14, mVar, 384);
                        i16 = i17;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2001458696, new p(cVar, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    cr.c0.a(cVar, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                cr.c0.a(cVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                d81.a.c(cVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    i53.c cVar2 = this.f16722b;
                    if (cVar2 != null) {
                        mVar4.C(566169389);
                        it1.b.b(cVar2, x2.d(h4.r.S, 1.0f), false, true, null, mVar4, 3120, 20);
                        mVar4.f();
                    } else {
                        mVar4.C(566357745);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    int i19 = 0;
                    for (Object obj4 : cVar) {
                        int i24 = i19 + 1;
                        if (i19 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        s.b bVar2 = (s.b) obj4;
                        s sVar3 = s.f16758a;
                        boolean z15 = i19 == 0;
                        int i25 = s.b.f16761e;
                        sVar3.c(bVar2, z15, mVar5, 0);
                        i19 = i24;
                    }
                    p3.x1 x1Var7 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                g52.h.a(cVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                g52.h.a(cVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    Iterator<E> it = cVar.iterator();
                    while (it.hasNext()) {
                        j82.e.i((j82.f) it.next(), null, mVar6, 0, 2);
                    }
                    p3.x1 x1Var9 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    k71.c.a(this.f16722b, null, null, mVar7, 48, 4);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                o72.p1.b(cVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 12:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar8, 48);
                    int iHashCode = Long.hashCode(mVar8.getU());
                    i2 i2VarX = mVar8.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar8);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar4);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar8);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar8, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar8);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarX = x2.x(x2.z(aVar2, null, 3), null, 3);
                    o72.a1.f130295a.getClass();
                    z3.e eVar = o72.a1.f130302h;
                    Object objQ = mVar8.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new o72.z0(15);
                        mVar8.K(objQ);
                    }
                    r82.k.c(rVarX, i53.a.a(new r82.p(this.f16722b, 0, null, null, eVar, 0.0f, false, false, null, null, (e23.l) objQ, 1006, null)), mVar8, 6, 0);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar5, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar6, mVar9, 48);
                    int iHashCode2 = Long.hashCode(mVar9.getU());
                    i2 i2VarX2 = mVar9.x();
                    h4.r rVarC2 = h4.k.c(rVarF2, mVar9);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar7);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar9);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar9, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar9);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    h4.r rVarX2 = x2.x(x2.z(aVar5, null, 3), null, 3);
                    i53.f fVarA = i53.a.a("Value");
                    o72.a1.f130295a.getClass();
                    z3.e eVar2 = o72.a1.f130303i;
                    d92.b.f58623a.getClass();
                    o4.d0 d0VarA = o4.d0.a(d92.b.a(mVar9).j().a());
                    h4.g.a aVar8 = h4.d.a.f81536n;
                    Object objQ2 = mVar9.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new o72.z0(16);
                        mVar9.K(objQ2);
                    }
                    r82.p pVar = new r82.p(fVarA, 0, null, null, eVar2, 0.0f, false, false, d0VarA, aVar8, (e23.l) objQ2, 174, null);
                    Object objQ3 = mVar9.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new o72.z0(17);
                        mVar9.K(objQ3);
                    }
                    r82.k.c(rVarX2, i53.a.a(pVar, new r82.p(this.f16722b, 0, null, null, null, 0.0f, false, false, null, null, (e23.l) objQ3, 1022, null)), mVar9, 6, 0);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    sn0.e.a(cVar, mVar10, in0.h.f94445e);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                sn0.e.e(cVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                xq1.f.a(cVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                xq1.f.a(cVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                xv0.a.c(cVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(i53.c cVar, int i14, int i15) {
        this.f16721a = i15;
        this.f16722b = cVar;
    }
}
