package dk0;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import e23.r;
import h2.c0;
import h5.e0;
import i3.mh;
import l30.i0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f60197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f60199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f60200e;

    public /* synthetic */ j(Object obj, long j8, Object obj2, Object obj3, int i14) {
        this.f60196a = i14;
        this.f60198c = obj;
        this.f60197b = j8;
        this.f60199d = obj2;
        this.f60200e = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f60196a;
        Object obj5 = this.f60200e;
        Object obj6 = this.f60199d;
        long j8 = this.f60197b;
        Object obj7 = this.f60198c;
        switch (i14) {
            case 0:
                i53.c cVar = (i53.c) obj7;
                i53.c cVar2 = (i53.c) obj6;
                f fVar = (f) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                p3.m mVar = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((c0) obj).getClass();
                x1 x1Var = p3.n.f135158a;
                h4.r rVarF = x2.f(a2.b(h4.r.S, a2.a(mVar), true), 1.0f);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                h4.r rVarC = h4.k.c(rVarF, mVar);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar);
                } else {
                    mVar.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar);
                b4.c(h5.g.a.f81809f, i2VarX, mVar);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar);
                b0 b0Var = b0.f22601a;
                if (iIntValue < cVar.size()) {
                    mVar.C(-60486311);
                    ek0.b.a((g) cVar.get(iIntValue), j8, mVar, 0);
                    mVar.f();
                } else {
                    mVar.C(-60360699);
                    ek0.a.a(cVar2, fVar, mVar, 0);
                    mVar.f();
                }
                mVar.y();
                return Unit.INSTANCE;
            default:
                w4.a aVar2 = (w4.a) obj7;
                e23.a aVar3 = (e23.a) obj6;
                p1 p1Var = (p1) obj5;
                zf2.b bVar2 = (zf2.b) obj2;
                p3.m mVar2 = (p3.m) obj3;
                ((Integer) obj4).getClass();
                ((r1.l) obj).getClass();
                bVar2.getClass();
                x1 x1Var2 = p3.n.f135158a;
                h4.r.a aVar4 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarY = c2.l.y(aVar4, eVar.f97920e);
                h4.d.f81522a.getClass();
                h4.g.a aVar5 = h4.d.a.f81537o;
                c2.j.f22691a.getClass();
                z zVarA2 = y.a(c2.j.f22696f, aVar5, mVar2, 54);
                int iHashCode2 = Long.hashCode(mVar2.getU());
                i2 i2VarX2 = mVar2.x();
                h4.r rVarC2 = h4.k.c(rVarY, mVar2);
                h5.g.V.getClass();
                e0.a aVar6 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar6);
                } else {
                    mVar2.c();
                }
                b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                b0 b0Var2 = b0.f22601a;
                zf2.b bVar4 = zf2.b.SAVING_ACTIVITY_DIALOG;
                p3.m.a aVar7 = p3.m.f135153a;
                if (bVar2 == bVar4) {
                    mVar2.C(613797586);
                    boolean zR = mVar2.r(aVar2);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new i0(26, aVar2, p1Var);
                        mVar2.K(objQ);
                    } else {
                        aVar7.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new i0(26, aVar2, p1Var);
                            mVar2.K(objQ);
                        }
                    }
                    mg2.e.a((e23.a) objQ, j8, mVar2, 0);
                    mVar2.f();
                } else {
                    mVar2.C(614215218);
                    boolean zB = mVar2.B(aVar3);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new ll0.a(aVar3, 15);
                        mVar2.K(objQ2);
                    } else {
                        aVar7.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ll0.a(aVar3, 15);
                            mVar2.K(objQ2);
                        }
                    }
                    mg2.b.a((e23.a) objQ2, mVar2, 0);
                    mVar2.f();
                }
                String strQ = gl1.y.Q(mVar2, bVar2.f204573a);
                h4.r rVarC3 = c2.l.C(aVar4, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97930g, mVar2);
                d6.h.f57752b.getClass();
                int i15 = d6.h.f57755e;
                mh.c(strQ, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                mh.c(gl1.y.Q(mVar2, bVar2.f204574b), c2.l.C(aVar4, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 130044);
                mVar2.y();
                return Unit.INSTANCE;
        }
    }
}
