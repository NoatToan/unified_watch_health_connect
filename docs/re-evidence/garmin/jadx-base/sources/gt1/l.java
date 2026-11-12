package gt1;

import androidx.lifecycle.n0;
import b5.a0;
import b82.t0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.g0;
import gl1.y;
import h5.e0;
import i3.mh;
import i3.p7;
import i3.v5;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.y3;
import p3.z1;
import ya0.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f78981b;

    public /* synthetic */ l(e23.l lVar, int i14) {
        this.f78980a = i14;
        this.f78981b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0485  */
    /* JADX WARN: Code duplicated, block: B:20:0x008b  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0039  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f78980a;
        int i15 = 4;
        int i16 = 5;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        p3.m.a aVar = p3.m.f135153a;
        e23.l lVar = this.f78981b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = y.Q(mVar, R.string.trail_review_add_a_review_action);
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new k(lVar, objArr == true ? 1 : 0);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new k(lVar, objArr == true ? 1 : 0);
                            mVar.K(objQ);
                        }
                    }
                    h.a(null, strQ, R.drawable.star_outlined, false, false, false, (e23.a) objQ, mVar, 0, 57);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar2, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    c2.l.f(x2.f(x2.h(aVar2, eVar.f97920e), 1.0f), mVar2);
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n("");
                        mVar2.K(objQ2);
                    }
                    p1 p1Var = (p1) objQ2;
                    t0 t0Var = t0.f16792a;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    String str = (String) p1Var.getF182175a();
                    String strQ2 = y.Q(mVar2, R.string.lbl_search);
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar2);
                    boolean zB2 = mVar2.B(lVar);
                    Object objQ3 = mVar2.q();
                    if (zB2 || objQ3 == c2565a) {
                        objQ3 = new bt1.k(lVar, p1Var, 8);
                        mVar2.K(objQ3);
                    }
                    t0Var.g(rVarF, str, strQ2, null, null, jC, (e23.p) objQ3, mVar2, 6, 24);
                    c2.l.f(x2.f(x2.h(aVar2, eVar.f97920e), 1.0f), mVar2);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                t2 t2Var = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r rVarA = t2Var.a(h4.r.S, 1.0f, true);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97918c;
                    jVar.getClass();
                    s2 s2VarA = q2.a(c2.j.i(f14), bVar2, mVar3, 48);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC2 = h4.k.c(rVarA, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar4);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                    u2 u2Var = u2.f22900a;
                    String strQ3 = y.Q(mVar3, R.string.trail_content_report_content);
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97930g, mVar3)), mVar3, 0, 0, 131070);
                    y3 y3Var = p7.f89282d;
                    g6.f.f75994b.getClass();
                    p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(813487420, new b71.n(lVar, 9, objArr2 == true ? 1 : 0), mVar3), mVar3, 56);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                h4.r rVar = (h4.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                v.h.y(-1870014406, rVar, (Integer) obj3, mVar4);
                x1 x1Var4 = p3.n.f135158a;
                boolean zB3 = mVar4.B(lVar);
                Object objQ4 = mVar4.q();
                if (zB3) {
                    objQ4 = new k(lVar, 15);
                    mVar4.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new k(lVar, 15);
                        mVar4.K(objQ4);
                    }
                }
                h4.r rVarD = u1.w.d(rVar, false, null, null, (e23.a) objQ4, 15);
                mVar4.f();
                return rVarD;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    boolean zB4 = mVar5.B(lVar);
                    Object objQ5 = mVar5.q();
                    if (zB4) {
                        objQ5 = new ub0.h(lVar, 10);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new ub0.h(lVar, 10);
                            mVar5.K(objQ5);
                        }
                    }
                    e23.a aVar5 = (e23.a) objQ5;
                    boolean zB5 = mVar5.B(lVar);
                    Object objQ6 = mVar5.q();
                    if (zB5) {
                        objQ6 = new ub0.h(lVar, 11);
                        mVar5.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new ub0.h(lVar, 11);
                            mVar5.K(objQ6);
                        }
                    }
                    v50.k.a(aVar5, (e23.a) objQ6, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                v.h.y(1034212048, (h4.r) obj, (Integer) obj3, mVar6);
                x1 x1Var6 = p3.n.f135158a;
                p1 p1VarC = s9.c.c(((n0) mVar6.A(s9.j.f158018a)).getF158016a().c(), mVar6);
                Object objQ7 = mVar6.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                if (objQ7 == c2565a2) {
                    objQ7 = new z1(Float.NaN);
                    mVar6.K(objQ7);
                }
                m1 m1Var = (m1) objQ7;
                h4.r.a aVar6 = h4.r.S;
                boolean zB6 = mVar6.B(p1VarC) | mVar6.B(lVar);
                Object objQ8 = mVar6.q();
                if (zB6 || objQ8 == c2565a2) {
                    objQ8 = new wn2.f(lVar, i16, p1VarC, m1Var);
                    mVar6.K(objQ8);
                }
                h4.r rVarF2 = g0.f(aVar6, (e23.l) objQ8);
                mVar6.f();
                return rVarF2;
            case 6:
                lVar.invoke(n4.c.a(((a0) obj2).f15750c));
                return Unit.INSTANCE;
            case 7:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    yg2.e.f196969a.getClass();
                    z3.e eVar2 = yg2.e.f196972d;
                    boolean zB7 = mVar7.B(lVar);
                    Object objQ9 = mVar7.q();
                    if (zB7) {
                        objQ9 = new f0(lVar, 3);
                        mVar7.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new f0(lVar, 3);
                            mVar7.K(objQ9);
                        }
                    }
                    i3.u.b(eVar2, (e23.a) objQ9, null, null, null, false, null, null, mVar7, 6, 508);
                    v5.a(0.0f, 0, 7, 0L, null, mVar7);
                    z3.e eVar3 = yg2.e.f196973e;
                    boolean zB8 = mVar7.B(lVar);
                    Object objQ10 = mVar7.q();
                    if (zB8) {
                        objQ10 = new f0(lVar, i15);
                        mVar7.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new f0(lVar, i15);
                            mVar7.K(objQ10);
                        }
                    }
                    i3.u.b(eVar3, (e23.a) objQ10, null, null, null, false, null, null, mVar7, 6, 508);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            default:
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                v.h.y(1669715528, rVar2, (Integer) obj3, mVar8);
                x1 x1Var8 = p3.n.f135158a;
                boolean zB9 = mVar8.B(lVar);
                Object objQ11 = mVar8.q();
                if (zB9) {
                    objQ11 = new f0(lVar, i16);
                    mVar8.K(objQ11);
                } else {
                    aVar.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new f0(lVar, i16);
                        mVar8.K(objQ11);
                    }
                }
                h4.r rVarD2 = u1.w.d(rVar2, false, null, null, (e23.a) objQ11, 15);
                mVar8.f();
                return rVarD2;
        }
    }
}
