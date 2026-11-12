package bt1;

import a11.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e2.i0;
import e2.k0;
import ew1.f1;
import ew1.v1;
import ew1.w1;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.i7;
import i3.mh;
import i3.q1;
import i3.r1;
import i3.s1;
import java.util.List;
import l72.f0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import s70.j1;
import u1.a2;
import u1.w;
import v62.n1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f21115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f21116c;

    public /* synthetic */ k(e23.l lVar, p1 p1Var, int i14) {
        this.f21114a = i14;
        this.f21115b = lVar;
        this.f21116c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:125:0x042c  */
    /* JADX WARN: Code duplicated, block: B:143:0x049e  */
    /* JADX WARN: Code duplicated, block: B:159:0x050d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0585  */
    /* JADX WARN: Code duplicated, block: B:189:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:209:0x064c  */
    /* JADX WARN: Code duplicated, block: B:231:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:251:0x072c  */
    /* JADX WARN: Code duplicated, block: B:267:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0211  */
    /* JADX WARN: Code duplicated, block: B:83:0x033b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f21114a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 2;
        p1 p1Var = this.f21116c;
        e23.l lVar = this.f21115b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    r1 r1Var = r1.f89474a;
                    d92.b.f58623a.getClass();
                    long jA = d92.b.a(mVar).f().a();
                    r1Var.getClass();
                    q1 q1VarA = r1.a(jA, 0L, mVar, 62);
                    boolean zB = mVar.B(p1Var) | mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new b0(p1Var, lVar, i15);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b0(p1Var, lVar, i15);
                            mVar.K(objQ);
                        }
                    }
                    s1.a(zBooleanValue, (e23.l) objQ, null, false, q1VarA, mVar, 0, 44);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    f0 f0Var = f0.f110999a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    String strQ = y.Q(mVar2, R.string.lbl_next);
                    boolean z14 = ((hv1.a) p1Var.getF182175a()) != null;
                    boolean zB2 = mVar2.B(lVar);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new a51.k(p1Var, lVar, 5);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a51.k(p1Var, lVar, 5);
                            mVar2.K(objQ2);
                        }
                    }
                    f0Var.d(384, 1, (e23.a) objQ2, rVarF, strQ, mVar2, null, z14);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    f0 f0Var2 = f0.f110999a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    String strQ2 = y.Q(mVar3, R.string.lbl_next);
                    boolean z15 = (((hv1.e) p1Var.getF182175a()) == null || ((hv1.e) p1Var.getF182175a()) == hv1.e.FLAT) ? false : true;
                    boolean zB3 = mVar3.B(lVar);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        objQ3 = new a51.k(p1Var, lVar, 8);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new a51.k(p1Var, lVar, 8);
                            mVar3.K(objQ3);
                        }
                    }
                    f0Var2.d(384, 1, (e23.a) objQ3, rVarF2, strQ2, mVar3, null, z15);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    f0 f0Var3 = f0.f110999a;
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    String strQ3 = y.Q(mVar4, R.string.lbl_next);
                    boolean z16 = ((tw1.k) p1Var.getF182175a()) != null;
                    boolean zB4 = mVar4.B(lVar);
                    Object objQ4 = mVar4.q();
                    if (zB4) {
                        objQ4 = new a51.k(lVar, p1Var, 11);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new a51.k(lVar, p1Var, 11);
                            mVar4.K(objQ4);
                        }
                    }
                    f0Var3.d(384, 1, (e23.a) objQ4, rVarF3, strQ3, mVar4, null, z16);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    f0 f0Var4 = f0.f110999a;
                    h4.r rVarF4 = x2.f(h4.r.S, 1.0f);
                    String strQ4 = y.Q(mVar5, R.string.lbl_next);
                    boolean zB5 = mVar5.B(lVar);
                    Object objQ5 = mVar5.q();
                    if (zB5) {
                        objQ5 = new a51.k(lVar, p1Var, 12);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new a51.k(lVar, p1Var, 12);
                            mVar5.K(objQ5);
                        }
                    }
                    f0Var4.d(384, 9, (e23.a) objQ5, rVarF4, strQ4, mVar5, null, false);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r rVarF5 = x2.f(h4.r.S, 1.0f);
                    i53.c cVar = (i53.c) p1Var.getF182175a();
                    cVar.getClass();
                    f82.a aVar2 = new f82.a();
                    i0 i0VarA = k0.a(0, 0, 3, mVar6);
                    boolean zB6 = mVar6.B(lVar);
                    Object objQ6 = mVar6.q();
                    if (zB6) {
                        objQ6 = new b71.n(lVar, 4, (byte) 0);
                        mVar6.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new b71.n(lVar, 4, (byte) 0);
                            mVar6.K(objQ6);
                        }
                    }
                    e82.a.b(cVar, aVar2, i0VarA, rVarF5, null, (e23.p) objQ6, mVar6, 3072, 16);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                f1.a aVar3 = f1.f66451c;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = n1.a(t62.b.f162798a);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarM = x2.m(aVar4, j92.b.f97901d.f97904c);
                    boolean zB7 = mVar7.B(lVar);
                    Object objQ7 = mVar7.q();
                    if (zB7) {
                        objQ7 = new a51.k(lVar, p1Var, 29);
                        mVar7.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new a51.k(lVar, p1Var, 29);
                            mVar7.K(objQ7);
                        }
                    }
                    i7.b(dVarA, null, w.d(rVarM, false, null, null, (e23.a) objQ7, 15), sn.a.b(mVar7), mVar7, 48, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                w1.a aVar5 = w1.f66814e;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    f0 f0Var5 = f0.f110999a;
                    h4.r rVarF6 = x2.f(h4.r.S, 1.0f);
                    String strQ5 = y.Q(mVar8, R.string.lbl_next);
                    boolean zB8 = mVar8.B(lVar);
                    Object objQ8 = mVar8.q();
                    if (zB8) {
                        objQ8 = new v1(lVar, p1Var, 0);
                        mVar8.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new v1(lVar, p1Var, 0);
                            mVar8.K(objQ8);
                        }
                    }
                    f0Var5.d(384, 9, (e23.a) objQ8, rVarF6, strQ5, mVar8, null, false);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                String str = (String) obj;
                ((Boolean) obj2).getClass();
                str.getClass();
                p1Var.setValue(str);
                lVar.invoke(str);
                return Unit.INSTANCE;
            case 9:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    l72.w wVar = l72.w.f111301a;
                    String strQ6 = y.Q(mVar9, R.string.lbl_save);
                    boolean zB9 = mVar9.B(lVar);
                    Object objQ9 = mVar9.q();
                    if (zB9) {
                        objQ9 = new v1(lVar, p1Var, 16);
                        mVar9.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new v1(lVar, p1Var, 16);
                            mVar9.K(objQ9);
                        }
                    }
                    wVar.j(0, (e23.a) objQ9, strQ6, mVar9);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 10:
                int iIntValue10 = ((Integer) obj).intValue();
                int iIntValue11 = ((Integer) obj2).intValue();
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(new b63.v(iIntValue10, iIntValue11, 0, 0));
                return Unit.INSTANCE;
            case 11:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    f0 f0Var6 = f0.f110999a;
                    h4.r rVarF7 = x2.f(h4.r.S, 1.0f);
                    String strQ7 = y.Q(mVar10, R.string.atp_create_plan);
                    boolean zB10 = mVar10.B(lVar);
                    Object objQ10 = mVar10.q();
                    if (zB10) {
                        objQ10 = new v1(lVar, p1Var, 20);
                        mVar10.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new v1(lVar, p1Var, 20);
                            mVar10.K(objQ10);
                        }
                    }
                    f0Var6.d(384, 9, (e23.a) objQ10, rVarF7, strQ7, mVar10, null, false);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarD = c2.l.D(x2.d(aVar6, 1.0f));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar7 = h4.d.a.f81536n;
                    z zVarA = c2.y.a(kVar, aVar7, mVar11, 0);
                    int iHashCode = Long.hashCode(mVar11.getU());
                    i2 i2VarX = mVar11.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar11);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar8);
                    } else {
                        mVar11.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar11);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar11);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar11, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar11);
                    h4.r rVarB = a2.b(x2.f(c2.b0.f22601a.a(aVar6, 1.0f, true), 1.0f), a2.a(mVar11), true);
                    z zVarA2 = c2.y.a(kVar, aVar7, mVar11, 0);
                    int iHashCode2 = Long.hashCode(mVar11.getU());
                    i2 i2VarX2 = mVar11.x();
                    h4.r rVarC2 = h4.k.c(rVarB, mVar11);
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar8);
                    } else {
                        mVar11.c();
                    }
                    b4.c(eVar, zVarA2, mVar11);
                    b4.c(c1623g, i2VarX2, mVar11);
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar11, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar11);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97920e;
                    c2.l.f(x2.h(aVar6, f14), mVar11);
                    String strQ8 = y.Q(mVar11, R.string.what_type_of_gear_do_you_want_to_add);
                    h4.r rVarZ = c2.l.z(aVar6, f14, eVar2.f97917b);
                    d92.b.f58624b.getClass();
                    mh.c(strQ8, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar11), mVar11, 0, 0, 131068);
                    c2.l.f(x2.h(aVar6, f14), mVar11);
                    mVar11.C(-1824592214);
                    for (c80.u uVar : c80.u.f25612w) {
                        String strL = xy2.b.l(uVar, mVar11);
                        u4.d dVar = uVar.f25613a;
                        boolean z17 = ((c80.u) p1Var.getF182175a()) == uVar;
                        boolean zB11 = mVar11.B(p1Var) | mVar11.k(uVar.ordinal());
                        Object objQ11 = mVar11.q();
                        if (zB11) {
                            objQ11 = new j1(12, uVar, p1Var);
                            mVar11.K(objQ11);
                        } else {
                            aVar.getClass();
                            if (objQ11 == p3.m.a.f135155b) {
                                objQ11 = new j1(12, uVar, p1Var);
                                mVar11.K(objQ11);
                            }
                        }
                        sk0.s1.a(0, (e23.a) objQ11, strL, mVar11, dVar, z17);
                    }
                    mVar11.f();
                    mVar11.y();
                    h4.r.a aVar9 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.f(aVar9, 1.0f), fb1.c.z(d92.b.f58623a, mVar11), m1.f128891a);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    x1 x1Var12 = p3.n.f135158a;
                    int iHashCode3 = Long.hashCode(mVar11.getU());
                    i2 i2VarX3 = mVar11.x();
                    h4.r rVarC3 = h4.k.c(rVarE, mVar11);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar10);
                    } else {
                        mVar11.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, z0VarD, mVar11);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX3, mVar11);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar11, iHashCode3, bVar2);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC3, mVar11);
                    c2.u uVar2 = c2.u.f22885a;
                    h4.r rVarF8 = x2.f(aVar9, 1.0f);
                    c2.j.f22691a.getClass();
                    z zVarA3 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar11, 0);
                    int iHashCode4 = Long.hashCode(mVar11.getU());
                    i2 i2VarX4 = mVar11.x();
                    h4.r rVarC4 = h4.k.c(rVarF8, mVar11);
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar10);
                    } else {
                        mVar11.c();
                    }
                    b4.c(eVar3, zVarA3, mVar11);
                    b4.c(c1623g2, i2VarX4, mVar11);
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar11, iHashCode4, bVar2);
                    }
                    b4.c(fVar2, rVarC4, mVar11);
                    c2.b0 b0Var = c2.b0.f22601a;
                    f0 f0Var7 = f0.f110999a;
                    d92.b.f58625c.getClass();
                    h4.r rVarF9 = x2.f(c2.l.y(aVar9, j92.b.f97899b.f97920e), 1.0f);
                    String strQ9 = y.Q(mVar11, R.string.lbl_next);
                    boolean z18 = ((c80.u) p1Var.getF182175a()) != null;
                    boolean zB12 = mVar11.B(p1Var) | mVar11.B(lVar);
                    Object objQ12 = mVar11.q();
                    if (zB12) {
                        objQ12 = new v1(lVar, p1Var, 22);
                        mVar11.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new v1(lVar, p1Var, 22);
                            mVar11.K(objQ12);
                        }
                    }
                    f0Var7.d(0, 1, (e23.a) objQ12, rVarF9, strQ9, mVar11, null, z18);
                    mVar11.y();
                    mVar11.y();
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                List list = (List) obj;
                Integer num = (Integer) obj2;
                num.getClass();
                list.getClass();
                p1Var.setValue(list);
                lVar.invoke(num);
                return Unit.INSTANCE;
            case 14:
                List list2 = (List) obj;
                Integer num2 = (Integer) obj2;
                num2.getClass();
                list2.getClass();
                p1Var.setValue(list2);
                lVar.invoke(num2);
                return Unit.INSTANCE;
            case 15:
                int iIntValue14 = ((Integer) obj).intValue();
                int iIntValue15 = ((Integer) obj2).intValue();
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(new b63.v(iIntValue14, iIntValue15, 0, 0, 12, null));
                return Unit.INSTANCE;
            default:
                Float f15 = (Float) obj2;
                f15.floatValue();
                lVar.getClass();
                p1Var.getClass();
                ((o53.b0) obj).getClass();
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(f15);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k(p1 p1Var, e23.l lVar, int i14) {
        this.f21114a = i14;
        this.f21116c = p1Var;
        this.f21115b = lVar;
    }
}
