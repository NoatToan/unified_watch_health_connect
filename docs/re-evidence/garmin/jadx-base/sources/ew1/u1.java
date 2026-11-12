package ew1;

import com.garmin.android.apps.connectmobile.R;
import i3.d6;
import i3.ef;
import i3.fe;
import i3.ff;
import i3.hf;
import i3.i7;
import p005kotlin.Unit;
import p3.b4;
import v62.e4;
import v62.i8;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f66785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f66786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f66787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f66788f;

    public /* synthetic */ u1(int i14, e23.a aVar, e23.a aVar2, String str, boolean z14, boolean z15) {
        this.f66783a = 11;
        this.f66785c = z14;
        this.f66787e = aVar;
        this.f66784b = str;
        this.f66786d = z15;
        this.f66788f = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0474  */
    /* JADX WARN: Code duplicated, block: B:119:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:19:0x00de  */
    /* JADX WARN: Code duplicated, block: B:36:0x0193  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar;
        int i14 = this.f66783a;
        int i15 = 12;
        boolean z14 = this.f66786d;
        boolean z15 = this.f66785c;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f66788f;
        Object obj4 = this.f66784b;
        Object obj5 = this.f66787e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                w1.a aVar2 = w1.f66814e;
                ((w1) obj5).w6((aw1.h) obj4, this.f66785c, this.f66786d, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                a2.a aVar3 = a2.f66311e;
                ((a2) obj5).w6((aw1.h) obj4, this.f66785c, this.f66786d, (e23.p) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                x2.a aVar4 = x2.f66834d;
                ((x2) obj5).w6((aw1.h) obj4, this.f66785c, this.f66786d, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.devices.targetedselection.l.a aVar5 = (com.garmin.android.apps.connectmobile.devices.targetedselection.l.a) obj5;
                e23.a aVar6 = (e23.a) obj4;
                e23.a<Unit> aVar7 = (e23.a) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.r.a aVar8 = h4.r.S;
                    c2.s2 s2VarA = c2.q2.a(iVarI, bVar, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar8, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar9);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.u2 u2Var = c2.u2.f22900a;
                    bz.d dVar = aVar5.f34621j;
                    if ((dVar != null ? dVar.getF22267f() : null) != null) {
                        mVar2.C(-1441341017);
                        j92.c cVar = j92.b.f97901d;
                        h4.r rVarD = u1.w.d(c2.x2.u(c2.x2.h(aVar8, cVar.f97905d), cVar.f97905d), false, null, null, aVar6, 15);
                        s62.a.f157643a.getClass();
                        i7.a(u4.p.b(e4.a(t62.b.f162798a), mVar2), gl1.y.Q(mVar2, R.string.lbl_help), rVarD, sn.a.b(mVar2), mVar2, 8, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-1440874374);
                        mVar2.f();
                    }
                    if (z15) {
                        mVar2.C(-1440786644);
                        l72.f0.a.f111000a.j(gl1.y.Q(mVar2, R.string.do_workout), null, aVar5.f34619h, aVar7, mVar2, 0, 2);
                        mVar2.f();
                    } else {
                        mVar2.C(-1440570822);
                        mVar2.f();
                    }
                    if (z14) {
                        mVar2.C(-1440501940);
                        h4.r rVarQ = c2.x2.q(aVar8, j92.b.f97901d.f97905d);
                        s62.a.f157643a.getClass();
                        u4.o oVarB = u4.p.b(f72.t.a(t62.c.f162799a), mVar2);
                        gl.c.f77766a.getClass();
                        i7.a(oVarB, "", rVarQ, gl.c.a(mVar2).r(), mVar2, 56, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-1440193862);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                fn1.u.a((km1.r) obj5, this.f66785c, (e23.a) obj4, this.f66786d, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                hb0.b.a(this.f66785c, this.f66786d, (e23.l) obj3, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 6:
                String str = (String) obj5;
                e23.l lVar = (e23.l) obj3;
                hk1.i.a aVar10 = (hk1.i.a) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    boolean zB = mVar3.B(str);
                    Object objQ = mVar3.q();
                    if (zB) {
                        objQ = new i11.g(str, 21);
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new i11.g(str, 21);
                            mVar3.K(objQ);
                        }
                    }
                    h4.r rVarC2 = p5.v.c((e23.l) objQ, aVar11, false);
                    ef efVarA = d92.c.a(ff.f88115a, mVar3);
                    boolean zB2 = mVar3.B(lVar) | mVar3.r(aVar10);
                    Object objQ2 = mVar3.q();
                    if (zB2) {
                        objQ2 = new hy.h(20, lVar, aVar10);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new hy.h(20, lVar, aVar10);
                            mVar3.K(objQ2);
                        }
                    }
                    hf.a(this.f66785c, (e23.l) objQ2, rVarC2, this.f66786d, efVarA, mVar3, 0, 72);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.p1 p1Var = (p3.p1) obj5;
                w4.a aVar12 = (w4.a) obj4;
                e23.a aVar13 = (e23.a) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97919d;
                    jVar2.getClass();
                    c2.j.i iVarI2 = c2.j.i(f15);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar3 = h4.d.a.f81534l;
                    h4.r.a aVar14 = h4.r.S;
                    c2.s2 s2VarA2 = c2.q2.a(iVarI2, bVar3, mVar4, 48);
                    int iHashCode2 = Long.hashCode(mVar4.getU());
                    p3.i2 i2VarX2 = mVar4.x();
                    h4.r rVarC3 = h4.k.c(aVar14, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar15);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar4);
                    c2.u2 u2Var2 = c2.u2.f22900a;
                    if (z15) {
                        mVar4.C(-1419569888);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = i8.a(t62.b.f162798a);
                        String strQ = gl1.y.Q(mVar4, R.string.lbl_favorites);
                        h4.r rVarQ2 = c2.x2.q(aVar14, j92.b.f97901d.f97904c);
                        gl.c.f77766a.getClass();
                        i7.b(dVarA, strQ, rVarQ2, gl.c.a(mVar4).r(), mVar4, 0, 0);
                        mVar = mVar4;
                        mVar.f();
                    } else {
                        mVar = mVar4;
                        mVar.C(-1419232577);
                        mVar.f();
                    }
                    if (z14) {
                        mVar.C(-1419159913);
                        String strQ2 = gl1.y.Q(mVar, R.string.calories_edit_button);
                        float f16 = j92.b.f97901d.f97905d;
                        h4.r rVarT = c2.x2.t(aVar14, f16, f16, 0.0f, 12);
                        Object objQ3 = mVar.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ3 == c2565a) {
                            objQ3 = tn.k.c(mVar);
                        }
                        a2.j jVar3 = (a2.j) objQ3;
                        boolean zB3 = mVar.B(p1Var) | mVar.r(aVar12) | mVar.B(aVar13);
                        Object objQ4 = mVar.q();
                        if (zB3 || objQ4 == c2565a) {
                            objQ4 = new d6(aVar12, 18, aVar13, p1Var);
                            mVar.K(objQ4);
                        }
                        h4.r rVarB = u1.w.b(rVarT, jVar3, null, false, null, null, (e23.a) objQ4, 28);
                        boolean zB4 = mVar.B(strQ2);
                        Object objQ5 = mVar.q();
                        if (zB4 || objQ5 == c2565a) {
                            objQ5 = new i11.g(strQ2, 26);
                            mVar.K(objQ5);
                        }
                        h4.r rVarC4 = p5.v.c((e23.l) objQ5, rVarB, false);
                        boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                        boolean zB5 = mVar.B(p1Var);
                        Object objQ6 = mVar.q();
                        if (zB5 || objQ6 == c2565a) {
                            objQ6 = new i11.i(p1Var, 26);
                            mVar.K(objQ6);
                        }
                        j21.j.c(0, (e23.a) objQ6, rVarC4, mVar, zBooleanValue);
                        mVar.f();
                    } else {
                        mVar.C(-1417983649);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                e23.l lVar2 = (e23.l) obj3;
                p3.p1 p1Var2 = (p3.p1) obj5;
                p3.p1 p1Var3 = (p3.p1) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar5.C(-1984107736);
                        s62.a.f157643a.getClass();
                        u4.d dVarA2 = v62.n1.a(t62.b.f162798a);
                        h4.r.a aVar16 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarM = c2.x2.m(aVar16, j92.b.f97901d.f97904c);
                        boolean zB6 = mVar5.B(lVar2);
                        Object objQ7 = mVar5.q();
                        if (zB6) {
                            objQ7 = new v1(lVar2, p1Var3, i15);
                            mVar5.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new v1(lVar2, p1Var3, i15);
                                mVar5.K(objQ7);
                            }
                        }
                        i7.b(dVarA2, null, u1.w.d(rVarM, false, null, null, (e23.a) objQ7, 15), sn.a.b(mVar5), mVar5, 48, 0);
                        mVar5.f();
                    } else if (z15 || z14) {
                        mVar5.C(-1983536685);
                        h4.r.a aVar17 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.c cVar2 = j92.b.f97901d;
                        h4.r rVarM2 = c2.x2.m(aVar17, cVar2.f97904c);
                        h4.d.f81522a.getClass();
                        f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode3 = Long.hashCode(mVar5.getU());
                        p3.i2 i2VarX3 = mVar5.x();
                        h4.r rVarC5 = h4.k.c(rVarM2, mVar5);
                        h5.g.V.getClass();
                        h5.e0.a aVar18 = h5.g.a.f81805b;
                        if (mVar5.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar5.z();
                        if (mVar5.getT()) {
                            mVar5.M(aVar18);
                        } else {
                            mVar5.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar5);
                        b4.c(h5.g.a.f81809f, i2VarX3, mVar5);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar5, iHashCode3, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC5, mVar5);
                        i7.a(n5.c.a(R.drawable.ic_exclamation, mVar5, 0), null, u1.n.e(l4.k.b(c2.u.f22885a.c(c2.x2.m(aVar17, cVar2.f97903b), h4.d.a.f81528f), k2.i.f102406a), d92.b.a(mVar5).f().f(), o4.m1.f128891a), d92.b.a(mVar5).f().f63508c, mVar5, 48, 0);
                        mVar5.y();
                        mVar5.f();
                    } else {
                        mVar5.C(-1982810169);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                fe feVar = (fe) obj5;
                e23.a aVar19 = (e23.a) obj4;
                e23.a aVar20 = (e23.a) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar6, R.string.msg_connected_to_kommot);
                    String strQ4 = gl1.y.Q(mVar6, R.string.msg_not_connected_to_kommot);
                    boolean z16 = this.f66785c;
                    Boolean boolValueOf = Boolean.valueOf(z16);
                    boolean zH = mVar6.h(z16);
                    boolean z17 = this.f66786d;
                    boolean zH2 = zH | mVar6.h(z17) | mVar6.B(strQ3) | mVar6.B(strQ4);
                    Object objQ8 = mVar6.q();
                    if (zH2) {
                        q31.e.a aVar21 = new q31.e.a(z16, z17, feVar, strQ3, strQ4, null);
                        mVar6.K(aVar21);
                        objQ8 = aVar21;
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            q31.e.a aVar22 = new q31.e.a(z16, z17, feVar, strQ3, strQ4, null);
                            mVar6.K(aVar22);
                            objQ8 = aVar22;
                        }
                    }
                    p3.l0.e((e23.p) objQ8, boolValueOf, mVar6);
                    z02.d.a(false, z3.f.c(-1811966885, new p40.r(aVar19, 9), mVar6), z3.f.c(-1689062948, new p21.b(feVar, 6), mVar6), null, null, z3.f.c(-1320351137, new a42.e(z17, aVar20, 15), mVar6), mVar6, 197040, 25);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                og.a.f((b63.o) obj5, (o82.g) obj4, this.f66785c, this.f66786d, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                w52.r0.c(p3.p0.t(1), (e23.a) obj5, (e23.a) obj3, (String) obj4, (p3.m) obj, this.f66785c, this.f66786d);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                xg2.k.a((String) obj5, (e23.a) obj4, (xg2.a) obj3, this.f66785c, this.f66786d, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ u1(com.garmin.android.apps.connectmobile.devices.targetedselection.l.a aVar, e23.a aVar2, boolean z14, e23.a aVar3, boolean z15) {
        this.f66783a = 3;
        this.f66787e = aVar;
        this.f66784b = aVar2;
        this.f66785c = z14;
        this.f66788f = aVar3;
        this.f66786d = z15;
    }

    public /* synthetic */ u1(e23.l lVar, boolean z14, boolean z15, p3.p1 p1Var, p3.p1 p1Var2) {
        this.f66783a = 8;
        this.f66788f = lVar;
        this.f66785c = z14;
        this.f66786d = z15;
        this.f66787e = p1Var;
        this.f66784b = p1Var2;
    }

    public /* synthetic */ u1(Object obj, Object obj2, boolean z14, boolean z15, o13.h hVar, int i14, int i15) {
        this.f66783a = i15;
        this.f66787e = obj;
        this.f66784b = obj2;
        this.f66785c = z14;
        this.f66786d = z15;
        this.f66788f = hVar;
    }

    public /* synthetic */ u1(String str, e23.a aVar, xg2.a aVar2, boolean z14, boolean z15, int i14) {
        this.f66783a = 12;
        this.f66787e = str;
        this.f66784b = aVar;
        this.f66788f = aVar2;
        this.f66785c = z14;
        this.f66786d = z15;
    }

    public /* synthetic */ u1(String str, boolean z14, e23.l lVar, hk1.i.a aVar, boolean z15) {
        this.f66783a = 6;
        this.f66787e = str;
        this.f66785c = z14;
        this.f66788f = lVar;
        this.f66784b = aVar;
        this.f66786d = z15;
    }

    public /* synthetic */ u1(km1.r rVar, boolean z14, e23.a aVar, boolean z15, e23.a aVar2, int i14) {
        this.f66783a = 4;
        this.f66787e = rVar;
        this.f66785c = z14;
        this.f66784b = aVar;
        this.f66786d = z15;
        this.f66788f = aVar2;
    }

    public /* synthetic */ u1(boolean z14, boolean z15, e23.l lVar, e23.a aVar, e23.a aVar2, int i14) {
        this.f66783a = 5;
        this.f66785c = z14;
        this.f66786d = z15;
        this.f66788f = lVar;
        this.f66787e = aVar;
        this.f66784b = aVar2;
    }

    public /* synthetic */ u1(boolean z14, boolean z15, Object obj, Object obj2, e23.a aVar, int i14) {
        this.f66783a = i14;
        this.f66785c = z14;
        this.f66786d = z15;
        this.f66787e = obj;
        this.f66784b = obj2;
        this.f66788f = aVar;
    }
}
