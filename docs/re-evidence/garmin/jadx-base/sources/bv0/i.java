package bv0;

import android.content.Context;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import i3.fe;
import i3.mh;
import i3.t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o72.a3;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f21333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f21334g;

    public /* synthetic */ i(e23.a aVar, i53.c cVar, p3.n1 n1Var, e23.l lVar, int i14, Context context) {
        this.f21328a = 5;
        this.f21331d = aVar;
        this.f21330c = cVar;
        this.f21332e = n1Var;
        this.f21333f = lVar;
        this.f21329b = i14;
        this.f21334g = context;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:159:0x0594  */
    /* JADX WARN: Code duplicated, block: B:178:0x062e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x014f  */
    /* JADX WARN: Code duplicated, block: B:39:0x016e  */
    /* JADX WARN: Code duplicated, block: B:61:0x020c  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d9  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14;
        int i15;
        e23.l lVar;
        km0.e eVar;
        int i16 = this.f21328a;
        int i17 = this.f21329b;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = this.f21334g;
        Object obj5 = this.f21333f;
        Object obj6 = this.f21332e;
        Object obj7 = this.f21330c;
        Object obj8 = this.f21331d;
        int i18 = 17;
        int i19 = 1;
        int i24 = 0;
        switch (i16) {
            case 0:
                gv0.d dVar = (gv0.d) obj7;
                e23.a aVar2 = (e23.a) obj8;
                sc.f fVar = (sc.f) obj4;
                e23.a aVar3 = (e23.a) obj6;
                e23.a aVar4 = (e23.a) obj5;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a.f) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    hl.a aVar5 = dVar.f79188f;
                    boolean zR = mVar.r(fVar) | mVar.B(aVar3) | mVar.r(dVar) | mVar.B(aVar4);
                    Object objQ = mVar.q();
                    if (zR) {
                        c cVar = new c(fVar, aVar3, dVar, aVar4, 20);
                        mVar.K(cVar);
                        objQ = cVar;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            c cVar2 = new c(fVar, aVar3, dVar, aVar4, 20);
                            mVar.K(cVar2);
                            objQ = cVar2;
                        }
                    }
                    hl.a.Companion companion = hl.a.INSTANCE;
                    wu0.b.a(this.f21329b, aVar5, aVar2, (e23.a) objQ, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ArrayList arrayList = (ArrayList) obj7;
                e23.l lVar2 = (e23.l) obj8;
                e23.q qVar = (e23.q) obj6;
                p3.p1 p1Var = (p3.p1) obj5;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    int i25 = 0;
                    for (Object obj9 : arrayList) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        z3.e eVarC = z3.f.c(-1579219911, new com.google.maps.android.compose.t(qVar, obj9, i17, 1), mVar2);
                        boolean zB = mVar2.B(lVar2) | mVar2.k(i25);
                        Object objQ2 = mVar2.q();
                        if (zB) {
                            i14 = 0;
                            objQ2 = new da0.r(i25, 0, lVar2, p1Var);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                i14 = 0;
                                objQ2 = new da0.r(i25, 0, lVar2, p1Var);
                                mVar2.K(objQ2);
                            } else {
                                i14 = 0;
                            }
                        }
                        i3.u.b(eVarC, (e23.a) objQ2, null, null, z3.f.c(2027082933, new da0.s(i14, obj4, obj9), mVar2), false, null, null, mVar2, 24582, 492);
                        i25 = i26;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.p1 p1Var2 = (p3.p1) obj5;
                e23.a aVar6 = (e23.a) obj8;
                ou0.b bVar = (ou0.b) obj4;
                gv0.d dVar2 = (gv0.d) obj7;
                e23.a aVar7 = (e23.a) obj6;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    if (((g3) p1Var2.getF182175a()).f35300a == fw.p.SUCCESS) {
                        mVar3.C(-2134272521);
                        h4.r.a aVar8 = h4.r.S;
                        h4.r rVarD = x2.d(aVar8, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        h4.r rVarC = c2.l.C(rVarD, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        h4.g.a aVar9 = h4.d.a.f81536n;
                        c2.z zVarA = c2.y.a(kVar, aVar9, mVar3, 0);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        p3.i2 i2VarX = mVar3.x();
                        h4.r rVarC2 = h4.k.c(rVarC, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar10 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar10);
                        } else {
                            mVar3.c();
                        }
                        h5.g.a.e eVar3 = h5.g.a.f81810g;
                        b4.c(eVar3, zVarA, mVar3);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar3);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                        }
                        h5.g.a.f fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC2, mVar3);
                        h4.r rVarB = u1.a2.b(c2.b0.f22601a.a(x2.f(aVar8, 1.0f), 1.0f, true), u1.a2.a(mVar3), true);
                        c2.z zVarA2 = c2.y.a(kVar, aVar9, mVar3, 0);
                        int iHashCode2 = Long.hashCode(mVar3.getU());
                        p3.i2 i2VarX2 = mVar3.x();
                        h4.r rVarC3 = h4.k.c(rVarB, mVar3);
                        if (mVar3.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar10);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar3, zVarA2, mVar3);
                        b4.c(c1623g, i2VarX2, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                        }
                        b4.c(fVar2, rVarC3, mVar3);
                        String strQ = gl1.y.Q(mVar3, R.string.lbl_share_with_garmin_friends);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(j92.f.f97930g, mVar3);
                        d6.h.f57752b.getClass();
                        int i27 = d6.h.f57755e;
                        h4.r rVarF = x2.f(aVar8, 1.0f);
                        float f14 = eVar2.f97922g;
                        float f15 = eVar2.f97920e;
                        mh.c(strQ, c2.l.C(rVarF, f15, f14, f15, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i27), 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 130044);
                        String strQ2 = gl1.y.Q(mVar3, R.string.msg_group_track_setup_description);
                        s5.x0 x0VarF = d92.c.f(j92.f.f97931h, mVar3);
                        h4.r rVarF2 = x2.f(aVar8, 1.0f);
                        float f16 = eVar2.f97920e;
                        mh.c(strQ2, c2.l.C(rVarF2, f16, f16, f16, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i27), 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 130044);
                        boolean zR2 = mVar3.r(dVar2);
                        Object objQ3 = mVar3.q();
                        if (zR2) {
                            objQ3 = new n(dVar2, 17);
                            mVar3.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new n(dVar2, 17);
                                mVar3.K(objQ3);
                            }
                        }
                        hv0.c.b(bVar, this.f21329b, (e23.l) objQ3, aVar7, mVar3, 0);
                        mVar3.y();
                        l72.f0.f110999a.d(0, 9, aVar6, c2.l.A(x2.f(aVar8, 1.0f), eVar2.f97920e, 0.0f, 2), gl1.y.Q(mVar3, R.string.lbl_next), mVar3, null, false);
                        mVar3.y();
                        mVar3.f();
                    } else {
                        mVar3.C(-2132040118);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                List<o13.p> list = (List) obj7;
                km0.e eVar4 = (km0.e) obj8;
                e23.l lVar3 = (e23.l) obj6;
                p3.p1 p1Var3 = (p3.p1) obj5;
                p3.p1 p1Var4 = (p3.p1) obj4;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    for (o13.p pVar : list) {
                        int iIntValue5 = ((Number) pVar.f128594a).intValue();
                        String str = (String) pVar.f128595b;
                        km0.e.a aVar11 = eVar4 instanceof km0.e.a ? (km0.e.a) eVar4 : null;
                        boolean zG = p005kotlin.jvm.internal.s.g(aVar11 != null ? aVar11.f105318b : null, str);
                        boolean zR3 = mVar4.r(eVar4) | mVar4.k(iIntValue5) | mVar4.B(str) | mVar4.B(lVar3);
                        Object objQ4 = mVar4.q();
                        if (zR3) {
                            i15 = iIntValue5;
                            lVar = lVar3;
                            eVar = eVar4;
                            objQ4 = new t2(eVar, i15, str, lVar, p1Var3, p1Var4);
                            mVar4.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                i15 = iIntValue5;
                                lVar = lVar3;
                                eVar = eVar4;
                                objQ4 = new t2(eVar, i15, str, lVar, p1Var3, p1Var4);
                                mVar4.K(objQ4);
                            } else {
                                i15 = iIntValue5;
                                lVar = lVar3;
                                eVar = eVar4;
                            }
                        }
                        lm0.p.d(i15, this.f21329b, 0, (e23.a) objQ4, mVar4, zG);
                        eVar4 = eVar;
                        lVar3 = lVar;
                    }
                    p3.x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                List list2 = (List) obj7;
                e23.l lVar4 = (e23.l) obj8;
                pa0.b bVar3 = (pa0.b) obj6;
                p3.p1 p1Var5 = (p3.p1) obj5;
                mp.b bVar4 = (mp.b) obj4;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar5.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    for (Object obj10 : list2) {
                        int i28 = i24 + 1;
                        if (i24 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        z3.e eVarC2 = z3.f.c(2093376473, new mg2.o(bVar3, obj10, i17, i18), mVar5);
                        boolean zB2 = mVar5.B(lVar4) | mVar5.k(i24);
                        Object objQ5 = mVar5.q();
                        if (zB2) {
                            objQ5 = new da0.r(i24, i19, lVar4, p1Var5);
                            mVar5.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new da0.r(i24, i19, lVar4, p1Var5);
                                mVar5.K(objQ5);
                            }
                        }
                        i3.u.b(eVarC2, (e23.a) objQ5, null, null, z3.f.c(1404712021, new oo0.f(20, bVar4, obj10), mVar5), false, null, null, mVar5, 24582, 492);
                        i24 = i28;
                        i19 = 1;
                    }
                    p3.x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            default:
                e23.a aVar12 = (e23.a) obj8;
                i53.c cVar3 = (i53.c) obj7;
                p3.n1 n1Var = (p3.n1) obj6;
                e23.l lVar5 = (e23.l) obj5;
                Context context = (Context) obj4;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    h4.r rVarD2 = c2.l.D(aVar13);
                    long jA = p6.b.a(d92.b.f58623a, mVar6);
                    d92.b.f58625c.getClass();
                    float f17 = j92.b.f97899b.f97920e;
                    h4.r rVarE = u1.n.e(rVarD2, jA, k2.i.c(f17, f17, 0.0f, 0.0f, 12));
                    h4.d.f81522a.getClass();
                    h4.g.a aVar14 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA3 = c2.y.a(c2.j.f22694d, aVar14, mVar6, 48);
                    int iHashCode3 = Long.hashCode(mVar6.getU());
                    p3.i2 i2VarX3 = mVar6.x();
                    h4.r rVarC4 = h4.k.c(rVarE, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar15 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar15);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar6, iHashCode3, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar6);
                    c2.b0 b0Var = c2.b0.f22601a;
                    boolean zB3 = mVar6.B(cVar3) | mVar6.B(n1Var) | mVar6.B(lVar5);
                    Object objQ6 = mVar6.q();
                    if (zB3) {
                        objQ6 = new sg0.j(cVar3, 14, n1Var, lVar5);
                        mVar6.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new sg0.j(cVar3, 14, n1Var, lVar5);
                            mVar6.K(objQ6);
                        }
                    }
                    t91.c.a(null, aVar12, (e23.a) objQ6, mVar6, 0);
                    h4.r rVarZ = x2.z(x2.f(aVar13, 1.0f), aVar14, 2);
                    mVar6.C(-145303024);
                    ArrayList arrayList2 = new ArrayList(p13.y.r(cVar3, 10));
                    Iterator<E> it = cVar3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(gl1.y.Q(mVar6, ((q91.b) it.next()).f143549b));
                    }
                    mVar6.f();
                    i53.c cVarE = i53.a.e(arrayList2);
                    boolean zR4 = mVar6.r(context);
                    Object objQ7 = mVar6.q();
                    if (zR4) {
                        objQ7 = new ot.c(context, 13);
                        mVar6.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new ot.c(context, 13);
                            mVar6.K(objQ7);
                        }
                    }
                    e23.l lVar6 = (e23.l) objQ7;
                    boolean zB4 = mVar6.B(n1Var);
                    Object objQ8 = mVar6.q();
                    if (zB4) {
                        objQ8 = new a3(n1Var, 10);
                        mVar6.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new a3(n1Var, 10);
                            mVar6.K(objQ8);
                        }
                    }
                    r82.k.b(rVarZ, cVar3, this.f21329b, lVar6, cVarE, 0.0f, false, false, 0L, null, (e23.l) objQ8, mVar6, 6, 0, 992);
                    mVar6.y();
                    p3.x1 x1Var10 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(gv0.d dVar, int i14, e23.a aVar, sc.f fVar, e23.a aVar2, e23.a aVar3) {
        this.f21328a = 0;
        this.f21330c = dVar;
        this.f21329b = i14;
        this.f21331d = aVar;
        this.f21334g = fVar;
        this.f21332e = aVar2;
        this.f21333f = aVar3;
    }

    public /* synthetic */ i(List list, int i14, km0.e eVar, e23.l lVar, p3.p1 p1Var, p3.p1 p1Var2) {
        this.f21328a = 3;
        this.f21330c = list;
        this.f21329b = i14;
        this.f21331d = eVar;
        this.f21332e = lVar;
        this.f21333f = p1Var;
        this.f21334g = p1Var2;
    }

    public /* synthetic */ i(List list, e23.l lVar, e23.q qVar, int i14, p3.p1 p1Var, Object obj, int i15) {
        this.f21328a = i15;
        this.f21330c = list;
        this.f21331d = lVar;
        this.f21332e = qVar;
        this.f21329b = i14;
        this.f21333f = p1Var;
        this.f21334g = obj;
    }

    public /* synthetic */ i(p3.p1 p1Var, e23.a aVar, ou0.b bVar, int i14, gv0.d dVar, e23.a aVar2) {
        this.f21328a = 2;
        this.f21333f = p1Var;
        this.f21331d = aVar;
        this.f21334g = bVar;
        this.f21329b = i14;
        this.f21330c = dVar;
        this.f21332e = aVar2;
    }
}
