package cv1;

import c2.b0;
import c2.q;
import c2.t;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import e23.r;
import f5.z0;
import h2.c0;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.x1;
import p5.v;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55888a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f55889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c f55890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f55892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f55893f;

    public /* synthetic */ g(float f14, e23.l lVar, i53.c cVar, i53.c cVar2, n1 n1Var) {
        this.f55889b = f14;
        this.f55891d = lVar;
        this.f55890c = cVar;
        this.f55892e = cVar2;
        this.f55893f = n1Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String strValueOf;
        x0 x0VarF;
        int i14 = this.f55888a;
        Object obj5 = this.f55893f;
        Object obj6 = this.f55892e;
        i53.c cVar = this.f55890c;
        Object obj7 = this.f55891d;
        float f14 = this.f55889b;
        switch (i14) {
            case 0:
                ArrayList arrayList = (ArrayList) obj7;
                p pVar = (p) obj6;
                t tVar = (t) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var = p3.n.f135158a;
                if (f14 <= 1.5f) {
                    mVar.C(698537029);
                    if (iIntValue < arrayList.size()) {
                        mVar.C(698590287);
                        k.d(i53.a.e((Iterable) arrayList.get(iIntValue)), pVar, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(698749813);
                        mVar.f();
                    }
                    mVar.f();
                } else {
                    mVar.C(698783479);
                    h4.r.a aVar = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC = tVar.c(aVar, h4.d.a.f81528f);
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    u uVar = u.f22885a;
                    if (iIntValue < cVar.size()) {
                        mVar.C(724767797);
                        k.c((av1.g) cVar.get(iIntValue), pVar, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(724911947);
                        mVar.f();
                    }
                    mVar.y();
                    mVar.f();
                }
                return Unit.INSTANCE;
            default:
                e23.l lVar = (e23.l) obj7;
                i53.c cVar2 = (i53.c) obj6;
                n1 n1Var = (n1) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                p3.m mVar2 = (p3.m) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((e2.d) obj).getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= mVar2.k(iIntValue2) ? 32 : 16;
                }
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarZ = x2.z(x2.b(aVar3, 0.0f, f14, 1), null, 3);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar3 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(cVar3, h4.d.a.f81536n, mVar2, 6);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(rVarZ, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar2);
                    b0 b0Var = b0.f22601a;
                    if (lVar == null || (strValueOf = (String) lVar.invoke(cVar.get(iIntValue2))) == null) {
                        strValueOf = String.valueOf(cVar.get(iIntValue2));
                    }
                    boolean zB = mVar2.B(cVar2) | ((iIntValue3 & 112) == 32) | mVar2.B(strValueOf);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new ct2.e(cVar2, iIntValue2, strValueOf, 6);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ct2.e(cVar2, iIntValue2, strValueOf, 6);
                            mVar2.K(objQ);
                        }
                    }
                    h4.r rVarC4 = v.c((e23.l) objQ, aVar3, false);
                    if (iIntValue2 == n1Var.getIntValue()) {
                        mVar2.C(-2121712916);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF = d92.c.b(j92.f.f97932i, mVar2);
                    } else {
                        mVar2.C(-2121711794);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF = d92.c.f(j92.f.f97932i, mVar2);
                    }
                    mVar2.f();
                    mh.c(strValueOf, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ g(float f14, ArrayList arrayList, p pVar, t tVar, i53.c cVar) {
        this.f55889b = f14;
        this.f55891d = arrayList;
        this.f55892e = pVar;
        this.f55893f = tVar;
        this.f55890c = cVar;
    }
}
