package gw0;

import android.content.Context;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e2.i0;
import f5.z0;
import g02.o1;
import h2.j0;
import i3.mh;
import i3.ua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import u1.a2;
import yg2.q0;
import yg2.u0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79562a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f79564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f79565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f79566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f79567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f79568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f79569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f79570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f79571j;

    public /* synthetic */ b(h4.r rVar, String str, String str2, String str3, String str4, e23.a aVar, e23.l lVar, Context context, boolean z14) {
        this.f79565d = rVar;
        this.f79563b = str;
        this.f79566e = str2;
        this.f79567f = str3;
        this.f79569h = str4;
        this.f79570i = aVar;
        this.f79568g = lVar;
        this.f79571j = context;
        this.f79564c = z14;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0260  */
    /* JADX WARN: Code duplicated, block: B:107:0x027f  */
    /* JADX WARN: Code duplicated, block: B:112:0x029e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0402  */
    /* JADX WARN: Code duplicated, block: B:170:0x0554  */
    /* JADX WARN: Code duplicated, block: B:175:0x061c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0241  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z14;
        String strQ;
        z3.e eVar;
        yg2.h0 h0Var;
        u0 u0Var;
        yg2.h0 h0Var2;
        Iterator it;
        int i14 = this.f79562a;
        boolean z15 = this.f79564c;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = this.f79571j;
        Object obj5 = this.f79568g;
        Object obj6 = this.f79570i;
        Object obj7 = this.f79563b;
        Object obj8 = this.f79569h;
        Object obj9 = this.f79567f;
        Object obj10 = this.f79566e;
        Object obj11 = this.f79565d;
        switch (i14) {
            case 0:
                o82.g gVar = (o82.g) obj11;
                b63.t tVar = (b63.t) obj10;
                kw0.f fVar = (kw0.f) obj9;
                e23.l lVar = (e23.l) obj5;
                pv0.r rVar = (pv0.r) obj8;
                String str = (String) obj7;
                u uVar = (u) obj6;
                p1 p1Var = (p1) obj4;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar.C(976270536);
                        h4.r.a aVar2 = h4.r.S;
                        g6.f.a aVar3 = g6.f.f75994b;
                        h4.r rVarH = x2.h(x2.f(aVar2, 1.0f), 350);
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(mVar.getU());
                        i2 i2VarX = mVar.x();
                        h4.r rVarC = h4.k.c(rVarH, mVar);
                        h5.g.V.getClass();
                        h5.e0.a aVar4 = h5.g.a.f81805b;
                        if (mVar.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar4);
                        } else {
                            mVar.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, mVar);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar);
                        h4.r rVarC2 = c2.u.f22885a.c(aVar2, h4.d.a.f81528f);
                        d92.b.f58623a.getClass();
                        ua.a(0.0f, 0.0f, 0, 0, 60, d92.b.a(mVar).f().f63508c, 0L, rVarC2, mVar);
                        mVar.y();
                        mVar.f();
                    } else {
                        mVar.C(976639188);
                        if (gVar == o82.g.f130851d) {
                            mVar.C(976672854);
                            mw0.q.a(tVar.f16212b, fVar.f106949f, lVar, mVar, 0);
                            mVar.f();
                        } else if (fVar.f106948e.isEmpty()) {
                            mVar.C(977012335);
                            mw0.p.b(0, tVar, str, fVar, mVar, rVar, this.f79564c);
                            mVar.f();
                        } else if (gVar == o82.g.f130853f) {
                            mVar.C(977541288);
                            gl1.y.a(1572864, tVar, uVar, str, fVar, mVar, rVar, true);
                            mVar.f();
                        } else {
                            mVar.C(977947326);
                            mw0.n.a(uVar, tVar, fVar, rVar, str, mVar, 0);
                            mVar.f();
                        }
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                String str2 = (String) obj7;
                String str3 = (String) obj11;
                String str4 = (String) obj10;
                String str5 = (String) obj9;
                String str6 = (String) obj5;
                b92.a aVar5 = (b92.a) obj8;
                String str7 = (String) obj6;
                h4.r rVar2 = (h4.r) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.t) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean z16 = this.f79564c;
                    if (str2 == null) {
                        mVar2.C(-879010293);
                        z14 = z16;
                        l72.l.g(str3, str4, str5, str6, aVar5, z14, mVar2, 0);
                        mVar2.f();
                    } else {
                        z14 = z16;
                        mVar2.C(-878886324);
                        mVar2.f();
                    }
                    if (str2 != null) {
                        mVar2.C(-878847512);
                        l72.l.h(str3, str4, str5, str6, str2, str7, rVar2, aVar5, z14, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-878689908);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                mx1.a aVar6 = (mx1.a) obj11;
                e23.a aVar7 = (e23.a) obj10;
                p1 p1Var2 = (p1) obj4;
                e23.l lVar2 = (e23.l) obj5;
                o53.b0 b0Var = (o53.b0) obj9;
                j0 j0Var = (j0) obj8;
                e23.a aVar8 = (e23.a) obj7;
                x3 x3Var = (x3) obj6;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (aVar6 == null) {
                        mVar3.C(1615498737);
                        mVar3.f();
                        strQ = null;
                    } else {
                        mVar3.C(1615498738);
                        strQ = gl1.y.Q(mVar3, aVar6.f121351a);
                        mVar3.f();
                    }
                    if (strQ == null) {
                        strQ = "";
                    }
                    String str8 = strQ;
                    boolean zB = mVar3.B(p1Var2) | mVar3.B(lVar2) | mVar3.B(aVar7);
                    Object objQ = mVar3.q();
                    if (zB) {
                        objQ = new cv0.a(p1Var2, aVar7, lVar2);
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new cv0.a(p1Var2, aVar7, lVar2);
                            mVar3.K(objQ);
                        }
                    }
                    rx1.l.a(0, aVar7, (e23.a) objQ, null, str8, null, mVar3, false);
                    h4.r.a aVar9 = h4.r.S;
                    h4.r rVarB = a2.b(u1.n.e(x2.d(aVar9, 1.0f), vb.h.e(d92.b.f58623a, mVar3), m1.f128891a), a2.a(mVar3), true);
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97920e;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarB, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar10);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    String strQ2 = gl1.y.Q(mVar3, R.string.msg_benchmark_rep_max_calculation);
                    h4.r rVarA = c2.l.A(c2.l.C(x2.f(aVar9, 1.0f), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), f14, 0.0f, 2);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97933j;
                    mh.c(strQ2, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar3), mVar3, 0, 0, 131068);
                    h4.r rVarA2 = c2.l.A(c2.l.C(x2.f(aVar9, 1.0f), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), f14, 0.0f, 2);
                    i53.f fVarA = i53.a.a(gl1.y.Q(mVar3, R.string.lbl_equipment_barbell), gl1.y.Q(mVar3, R.string.lbl_equipment_dumbbell));
                    int iIntValue4 = ((Number) x3Var.getF182175a()).intValue();
                    boolean zR = mVar3.r(b0Var) | mVar3.B(j0Var);
                    Object objQ2 = mVar3.q();
                    if (zR) {
                        objQ2 = new rx1.o(0, j0Var, b0Var);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new rx1.o(0, j0Var, b0Var);
                            mVar3.K(objQ2);
                        }
                    }
                    boolean z17 = this.f79564c;
                    o1.a(rVarA2, z17, fVarA, iIntValue4, (e23.l) objQ2, mVar3, 0);
                    h2.u.a(j0Var, x2.f(aVar9, 1.0f), null, null, 0, 0.0f, null, null, z17, null, null, null, null, z3.f.c(481503867, new a6.c(p1Var2, 17), mVar3), mVar3, 48, 24576, 16124);
                    mh.c(gl1.y.Q(mVar3, R.string.msg_benchmarks_disclaimer), c2.l.C(c2.l.A(x2.f(aVar9, 1.0f), f14, 0.0f, 2), 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar3), mVar3, 0, 0, 131068);
                    String strQ3 = gl1.y.Q(mVar3, R.string.citation_american_academy_of_family_physicians);
                    h4.r rVarC4 = c2.l.C(c2.l.A(x2.f(aVar9, 1.0f), f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                    boolean zB2 = mVar3.B(aVar8);
                    Object objQ3 = mVar3.q();
                    if (zB2) {
                        objQ3 = new rk0.y(aVar8, 10);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new rk0.y(aVar8, 10);
                            mVar3.K(objQ3);
                        }
                    }
                    mh.c(strQ3, u1.w.d(rVarC4, false, null, null, (e23.a) objQ3, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, ds.e0.e(mVar3), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar3, 0, 0, 131068);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                h4.r rVar3 = (h4.r) obj11;
                String str9 = (String) obj7;
                String str10 = (String) obj10;
                String str11 = (String) obj9;
                String str12 = (String) obj8;
                e23.a aVar11 = (e23.a) obj6;
                e23.l lVar3 = (e23.l) obj5;
                Context context = (Context) obj4;
                p3.m mVar4 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var4 = p3.n.f135158a;
                l72.s sVar = l72.s.f111232a;
                Object objQ4 = mVar4.q();
                aVar.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ4 == c2565a) {
                    objQ4 = new vb1.d(2);
                    mVar4.K(objQ4);
                }
                h4.r rVarC5 = p5.v.c((e23.l) objQ4, rVar3, true);
                if (str9 == null) {
                    mVar4.C(-1295636229);
                    mVar4.f();
                    eVar = null;
                } else {
                    mVar4.C(-1295636228);
                    z3.e eVarC = z3.f.c(1150809680, new b82.g0(z15, str9, 9, (byte) 0), mVar4);
                    mVar4.f();
                    eVar = eVarC;
                }
                boolean zB3 = mVar4.B(aVar11);
                Object objQ5 = mVar4.q();
                if (zB3 || objQ5 == c2565a) {
                    objQ5 = new ux1.g(aVar11, 4);
                    mVar4.K(objQ5);
                }
                e23.a aVar12 = (e23.a) objQ5;
                boolean zB4 = mVar4.B(lVar3) | mVar4.r(context);
                Object objQ6 = mVar4.q();
                if (zB4 || objQ6 == c2565a) {
                    objQ6 = new kv0.e(3, context, lVar3);
                    mVar4.K(objQ6);
                }
                sVar.c(rVarC5, null, null, eVar, str10, str11, str12, false, aVar12, (e23.a) objQ6, mVar4, 0, 0, 390);
                return Unit.INSTANCE;
            default:
                yg2.o oVar = (yg2.o) obj11;
                yg2.a aVar13 = (yg2.a) obj10;
                yg2.h0 h0Var3 = (yg2.h0) obj9;
                u0 u0Var2 = (u0) obj8;
                i0 i0Var = (i0) obj7;
                o53.b0 b0Var3 = (o53.b0) obj6;
                e23.l lVar4 = (e23.l) obj5;
                yg2.a aVar14 = (yg2.a) obj4;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    ArrayList arrayListG = fg2.h0.g(oVar.d(), aVar13.getStartStepIndex(), aVar13.getEndStepIndex());
                    ArrayList arrayListH = fg2.h0.h(arrayListG);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj12 : arrayListH) {
                        yg2.h0 h0Var4 = (yg2.h0) obj12;
                        if (h0Var4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != aVar13.getEndStepIndex() || !h0Var4.f197048o) {
                            arrayList.add(obj12);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayListG.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        yg2.h0 h0Var5 = (yg2.h0) next;
                        if (h0Var5.f197048o) {
                            it = it3;
                        } else {
                            int i15 = h0Var5.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                            if (arrayList.isEmpty()) {
                                it = it3;
                                arrayList2.add(next);
                            } else {
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        yg2.h0 h0Var6 = (yg2.h0) it4.next();
                                        Integer numK = fg2.h0.k(h0Var6);
                                        int i16 = h0Var6.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                                        if (numK != null) {
                                            it = it3;
                                            if (new j23.l(numK.intValue(), i16).d(i15)) {
                                            }
                                        } else {
                                            it = it3;
                                        }
                                        it3 = it;
                                    } else {
                                        it = it3;
                                        arrayList2.add(next);
                                    }
                                }
                            }
                        }
                        it3 = it;
                    }
                    List<yg2.h0> listN0 = p13.h0.N0(p13.h0.C0(arrayList2, arrayListH), new q0.i());
                    for (yg2.h0 h0Var7 : listN0) {
                        if (z15 || !h0Var7.f197048o || h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == aVar13.getEndStepIndex()) {
                            h0Var = h0Var3;
                            u0Var = u0Var2;
                            mVar5.C(1857892314);
                            if (h0Var7.f197048o) {
                                mVar5.C(502293577);
                                Iterator it5 = p13.h0.G0(listN0).iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        n23.j.s("Collection contains no element matching the predicate.");
                                        return null;
                                    }
                                    h0Var2 = (yg2.h0) it5.next();
                                } while (h0Var2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String());
                                q0.e(h0Var7, h0Var2, mVar5, 0);
                                mVar5.f();
                            } else {
                                mVar5.C(502570593);
                                long jB = yg2.g0.b(h0Var7.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String(), mVar5);
                                yg2.i0 i0Var2 = h0Var7.f197040g;
                                String str13 = i0Var2 != null ? i0Var2.f197053a : null;
                                nt2.e eVar3 = i0Var2 != null ? i0Var2.f197054b : null;
                                i53.c<nt2.e> cVar = i0Var2 != null ? i0Var2.f197055c : null;
                                String str14 = i0Var2 != null ? i0Var2.f197057e : null;
                                yg2.n status = h0Var7.getStatus();
                                boolean z18 = h0Var7.getStatus() == yg2.n.ACTIVE;
                                int i17 = h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                                int iG0 = p13.h0.g0(h0Var != null ? fg2.h0.f(h0Var, oVar) : null, oVar.b());
                                boolean z19 = (h0Var7.getCategory() == null || h0Var7.getExerciseName() == null) ? false : true;
                                boolean zR2 = mVar5.r(u0Var);
                                Object objQ7 = mVar5.q();
                                if (zR2) {
                                    objQ7 = new q0.e(u0Var);
                                    mVar5.K(objQ7);
                                } else {
                                    aVar.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        objQ7 = new q0.e(u0Var);
                                        mVar5.K(objQ7);
                                    }
                                }
                                e23.l lVar5 = (e23.l) ((k23.g) objQ7);
                                boolean zR3 = mVar5.r(u0Var);
                                Object objQ8 = mVar5.q();
                                if (zR3) {
                                    objQ8 = new q0.f(u0Var);
                                    mVar5.K(objQ8);
                                } else {
                                    aVar.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        objQ8 = new q0.f(u0Var);
                                        mVar5.K(objQ8);
                                    }
                                }
                                e23.l lVar6 = (e23.l) ((k23.g) objQ8);
                                boolean zR4 = mVar5.r(u0Var);
                                Object objQ9 = mVar5.q();
                                if (zR4) {
                                    objQ9 = new q0.g(u0Var);
                                    mVar5.K(objQ9);
                                } else {
                                    aVar.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        objQ9 = new q0.g(u0Var);
                                        mVar5.K(objQ9);
                                    }
                                }
                                e23.l lVar7 = (e23.l) ((k23.g) objQ9);
                                boolean zR5 = mVar5.r(u0Var);
                                Object objQ10 = mVar5.q();
                                if (zR5) {
                                    objQ10 = new q0.h(u0Var);
                                    mVar5.K(objQ10);
                                } else {
                                    aVar.getClass();
                                    if (objQ10 == p3.m.a.f135155b) {
                                        objQ10 = new q0.h(u0Var);
                                        mVar5.K(objQ10);
                                    }
                                }
                                yg2.t.a(jB, str13, eVar3, cVar, str14, status, false, true, z18, i17, i0Var, b0Var3, iG0, lVar4, z19, lVar5, lVar6, lVar7, (e23.l) ((k23.g) objQ10), fg2.h0.a(aVar14, oVar), mVar5, 12582912, 0, 64);
                                mVar5.f();
                            }
                            mVar5.f();
                        } else {
                            mVar5.C(1856792775);
                            Integer num = oVar.f197113d.get(Integer.valueOf(h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()));
                            int iIntValue6 = num != null ? num.intValue() : 1;
                            int i18 = h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
                            Integer numK2 = fg2.h0.k(h0Var7);
                            q0.d(new yg2.a(i18, numK2 != null ? numK2.intValue() : h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String(), h0Var7.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String(), iIntValue6), oVar, h0Var3, u0Var2, i0Var, b0Var3, lVar4, mVar5, 1572864);
                            h0Var = h0Var3;
                            u0Var = u0Var2;
                            mVar5.f();
                        }
                        u0Var2 = u0Var;
                        h0Var3 = h0Var;
                    }
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, b92.a aVar, boolean z14, String str6, h4.r rVar) {
        this.f79563b = str;
        this.f79565d = str2;
        this.f79566e = str3;
        this.f79567f = str4;
        this.f79568g = str5;
        this.f79569h = aVar;
        this.f79564c = z14;
        this.f79570i = str6;
        this.f79571j = rVar;
    }

    public /* synthetic */ b(mx1.a aVar, e23.a aVar2, p1 p1Var, e23.l lVar, boolean z14, o53.b0 b0Var, h2.b bVar, e23.a aVar3, x3 x3Var) {
        this.f79565d = aVar;
        this.f79566e = aVar2;
        this.f79571j = p1Var;
        this.f79568g = lVar;
        this.f79564c = z14;
        this.f79567f = b0Var;
        this.f79569h = bVar;
        this.f79563b = aVar3;
        this.f79570i = x3Var;
    }

    public /* synthetic */ b(o82.g gVar, b63.t tVar, kw0.f fVar, e23.l lVar, pv0.r rVar, String str, boolean z14, u uVar, p1 p1Var) {
        this.f79565d = gVar;
        this.f79566e = tVar;
        this.f79567f = fVar;
        this.f79568g = lVar;
        this.f79569h = rVar;
        this.f79563b = str;
        this.f79564c = z14;
        this.f79570i = uVar;
        this.f79571j = p1Var;
    }

    public /* synthetic */ b(yg2.o oVar, yg2.a aVar, boolean z14, yg2.h0 h0Var, u0 u0Var, i0 i0Var, o53.b0 b0Var, e23.l lVar, yg2.a aVar2) {
        this.f79565d = oVar;
        this.f79566e = aVar;
        this.f79564c = z14;
        this.f79567f = h0Var;
        this.f79569h = u0Var;
        this.f79563b = i0Var;
        this.f79570i = b0Var;
        this.f79568g = lVar;
        this.f79571j = aVar2;
    }
}
