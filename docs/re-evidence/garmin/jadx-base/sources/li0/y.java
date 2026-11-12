package li0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.logging.presentation.LifestyleLoggingActivity;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.FollowerRequestsPrivacyActivity;
import com.garmin.android.apps.connectmobile.vo2.reports.presentation.activity.VO2MaxReportsActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import i3.mh;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import s5.x0;
import t21.w0;
import u1.d2;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f112885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f112886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f112887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f112888e;

    public /* synthetic */ y(e23.l lVar, String str, p1 p1Var, boolean z14) {
        this.f112884a = 11;
        this.f112885b = str;
        this.f112886c = z14;
        this.f112887d = lVar;
        this.f112888e = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:170:0x068b  */
    /* JADX WARN: Code duplicated, block: B:17:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:97:0x03bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v93, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String str;
        e23.l lVar;
        int i14 = this.f112884a;
        boolean z14 = this.f112886c;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f112885b;
        Object obj4 = this.f112887d;
        Object obj5 = this.f112888e;
        switch (i14) {
            case 0:
                e23.p pVar = (e23.p) obj4;
                String str2 = (String) obj3;
                u4.d dVar = (u4.d) obj5;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (pVar == null) {
                        mVar.C(-824886417);
                    } else {
                        mVar.C(1358864082);
                        pVar.invoke(mVar, 0);
                    }
                    mVar.f();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97933j, zl.a.a(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    mh.c(str2, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar, 0, 0, 130046);
                    if (dVar == null) {
                        mVar.C(-824732719);
                    } else {
                        mVar.C(1358869040);
                        z.q(dVar, d92.b.a(mVar).f().b(), this.f112886c, mVar, 0);
                    }
                    mVar.f();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                lm0.n.a((String) obj3, this.f112886c, (e23.a) obj4, (e23.l) obj5, (p3.m) obj, p3.p0.t(385));
                return Unit.INSTANCE;
            case 2:
                kw0.f fVar = (kw0.f) obj4;
                pv0.r rVar = (pv0.r) obj3;
                p1 p1Var = (p1) obj5;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (z14 || !gl1.d.E(fVar)) {
                        mVar2.C(1802928778);
                        mVar2.f();
                    } else {
                        mVar2.C(1802738500);
                        zv0.d dVar2 = zv0.d.f207169a;
                        l22.a aVarS = w2.a0.s(mVar2);
                        dVar2.getClass();
                        mw0.g.b(p1Var, zv0.d.a(rVar, aVarS), mVar2, 6);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                zc.d dVar3 = (zc.d) obj4;
                m52.k kVar = (m52.k) obj3;
                e23.l lVar2 = (e23.l) obj5;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (dVar3.d().f196385a instanceof z0.a) {
                        mVar3.C(-1921145604);
                        boolean zR = mVar3.r(dVar3);
                        Object objQ = mVar3.q();
                        if (zR) {
                            objQ = new et1.s0(dVar3, 4);
                            mVar3.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new et1.s0(dVar3, 4);
                                mVar3.K(objQ);
                            }
                        }
                        n62.b.c(0, (e23.a) objQ, null, mVar3);
                        mVar3.f();
                    } else if (dVar3.b() == 0 && (dVar3.d().f196385a instanceof z0.c)) {
                        mVar3.C(-1921140951);
                        n62.b.b(null, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(574234014);
                        n62.b.a(gl1.y.Q(mVar3, kVar.d(z14)), dVar3, lVar2, mVar3, 64);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ng2.f.b((String) obj3, (String) obj4, this.f112886c, (Integer) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                WeightReportsActivity weightReportsActivity = (WeightReportsActivity) obj5;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i15 = WeightReportsActivity.f47991a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    lc.m0 m0VarI = gl1.y.I(new lc.v0[0], mVar4);
                    boolean z15 = this.f112886c;
                    String str3 = z15 ? "EDIT_WEIGHT_GOAL_ROUTE" : com.garmin.android.apps.connectmobile.weighttracker.presentation.a.b.f48006b.f48004a;
                    ?? r14 = this.f112887d;
                    boolean zR2 = mVar4.r(r14);
                    ?? r15 = this.f112885b;
                    boolean zR3 = zR2 | mVar4.r(r15) | mVar4.r(m0VarI) | mVar4.r(weightReportsActivity) | mVar4.h(z15);
                    Object objQ2 = mVar4.q();
                    if (zR3) {
                        cq.m mVar5 = new cq.m(m0VarI, weightReportsActivity, (o13.l) r14, (o13.l) r15, z15);
                        mVar4.K(mVar5);
                        objQ2 = mVar5;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            cq.m mVar6 = new cq.m(m0VarI, weightReportsActivity, (o13.l) r14, (o13.l) r15, z15);
                            mVar4.K(mVar6);
                            objQ2 = mVar6;
                        }
                    }
                    nc.y.b(m0VarI, str3, null, null, null, null, null, null, (e23.l) objQ2, mVar4, 0, 1020);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                r02.l.a((h4.r) obj4, (r02.m) obj3, this.f112886c, (z3.e) obj5, (p3.m) obj, p3.p0.t(3073));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                r40.j.a((h4.r) obj4, (List) obj3, this.f112886c, (qw0.y) obj5, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                s70.c0.e((String) obj3, this.f112886c, (jc0.c) obj4, (e23.a) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                t21.i0.b((h4.r) obj4, this.f112886c, (String) obj3, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                w0.a(this.f112886c, (s21.u) obj4, (e23.l) obj3, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 11:
                String str4 = (String) obj3;
                e23.l lVar3 = (e23.l) obj4;
                p1 p1Var2 = (p1) obj5;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    b82.t0 t0Var = b82.t0.f16792a;
                    String strQ = gl1.y.Q(mVar7, R.string.lbl_distance);
                    x5.v.f188954b.getClass();
                    int i16 = x5.v.f188957e;
                    Object objQ3 = mVar7.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new sk0.n(p1Var2, 12);
                        mVar7.K(objQ3);
                    }
                    t0Var.i(null, strQ, str4, null, this.f112886c, lVar3, (e23.l) objQ3, i16, 0, null, mVar7, 14158848, 769);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                FollowerRequestsPrivacyActivity.a aVar3 = FollowerRequestsPrivacyActivity.f47109c;
                ((FollowerRequestsPrivacyActivity) obj4).da(p3.p0.t(385), (e23.l) obj5, (String) obj3, (p3.m) obj, this.f112886c);
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                u70.g.d((h4.r) obj4, (u70.a) obj3, this.f112886c, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                og2.k.j(this.f112886c, (d92.a) obj4, (d92.a) obj3, (z3.e) obj5, (p3.m) obj, p3.p0.t(3073));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                up1.a.a((xp1.b) obj4, this.f112886c, (e23.l) obj3, (e23.a) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                v50.b.c((x50.a) obj4, this.f112886c, (gg1.o0) obj3, (h4.r) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                vd0.p.a(p3.p0.t(3073), (ActivityListItemDTO) obj4, (e23.a) obj3, (h4.r) obj5, (p3.m) obj, this.f112886c);
                return Unit.INSTANCE;
            case 18:
                b63.o oVar = (b63.o) obj4;
                o82.g gVar = (o82.g) obj3;
                LifestyleLoggingActivity lifestyleLoggingActivity = (LifestyleLoggingActivity) obj5;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i17 = LifestyleLoggingActivity.f38686e;
                if (mVar8.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    boolean z16 = !lifestyleLoggingActivity.ha();
                    boolean zR4 = mVar8.r(lifestyleLoggingActivity);
                    Object objQ4 = mVar8.q();
                    if (zR4) {
                        objQ4 = new vc0.v(lifestyleLoggingActivity, 14);
                        mVar8.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new vc0.v(lifestyleLoggingActivity, 14);
                            mVar8.K(objQ4);
                        }
                    }
                    og.a.f(oVar, gVar, z16, this.f112886c, (e23.a) objQ4, mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                vy0.k.a(this.f112886c, (ty0.b) obj4, (vy0.t) obj3, (e23.a) obj5, (p3.m) obj, p3.p0.t(49));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                vy0.l.a(this.f112886c, (ty0.b) obj4, (vy0.u) obj3, (e23.a) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                vy0.f0.c((c2.a0) obj4, (List) obj3, this.f112886c, (e23.l) obj5, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 22:
                w12.a aVar4 = (w12.a) obj4;
                e23.l lVar4 = (e23.l) obj3;
                p1 p1Var3 = (p1) obj5;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    if (!z14) {
                        PrivacyType privacyType = aVar4.f181252c;
                        List<PrivacyType> list = aVar4.f181253d;
                        if (privacyType != null) {
                            h4.r.a aVar5 = h4.r.S;
                            h4.r rVarD = x2.d(aVar5, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar2 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            c2.z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar9, 0);
                            int iHashCode = Long.hashCode(mVar9.getU());
                            i2 i2VarX = mVar9.x();
                            h4.r rVarC = h4.k.c(rVarD, mVar9);
                            h5.g.V.getClass();
                            h5.e0.a aVar6 = h5.g.a.f81805b;
                            if (mVar9.F() == null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar9.z();
                            if (mVar9.getT()) {
                                mVar9.M(aVar6);
                            } else {
                                mVar9.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar9);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar9);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar9.getT() || !p005kotlin.jvm.internal.s.g(mVar9.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar9, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar9);
                            c2.b0 b0Var = c2.b0.f22601a;
                            Integer num = aVar4.f181250a;
                            if (num == null) {
                                mVar9.C(1647722535);
                                mVar9.f();
                            } else {
                                mVar9.C(1647722536);
                                String strQ2 = gl1.y.Q(mVar9, num.intValue());
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                x0 x0VarF = d92.c.f(j92.f.f97933j, mVar9);
                                d92.b.f58625c.getClass();
                                mh.c(strQ2, c2.l.y(aVar5, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar9, 0, 0, 131068);
                                mVar9.f();
                            }
                            mVar9.C(-1886497924);
                            for (PrivacyType privacyType2 : list) {
                                String strQ3 = gl1.y.Q(mVar9, privacyType2.getF28797a());
                                Integer num2 = (Integer) p13.h0.e0(list.indexOf(privacyType2), aVar4.f181254e);
                                if (num2 == null) {
                                    mVar9.C(823853795);
                                    mVar9.f();
                                    str = null;
                                } else {
                                    mVar9.C(823853796);
                                    String strQ4 = gl1.y.Q(mVar9, num2.intValue());
                                    mVar9.f();
                                    str = strQ4;
                                }
                                z3.e eVarC = z3.f.c(-1080889596, new rw0.g(privacyType2 == ((PrivacyType) p1Var3.getF182175a()), 13), mVar9);
                                boolean zK = mVar9.k(privacyType2.ordinal()) | mVar9.B(lVar4) | mVar9.r(aVar4);
                                Object objQ5 = mVar9.q();
                                if (zK) {
                                    lVar = lVar4;
                                    ug2.k kVar3 = new ug2.k(privacyType2, lVar, aVar4, p1Var3, 8);
                                    mVar9.K(kVar3);
                                    objQ5 = kVar3;
                                } else {
                                    aVar.getClass();
                                    if (objQ5 == p3.m.a.f135155b) {
                                        lVar = lVar4;
                                        ug2.k kVar4 = new ug2.k(privacyType2, lVar, aVar4, p1Var3, 8);
                                        mVar9.K(kVar4);
                                        objQ5 = kVar4;
                                    } else {
                                        lVar = lVar4;
                                    }
                                }
                                x12.a.a(null, strQ3, null, str, eVarC, (e23.a) objQ5, mVar9, 24576, 5);
                                lVar4 = lVar;
                            }
                            mVar9.f();
                            mVar9.y();
                            x1 x1Var8 = p3.n.f135158a;
                        }
                    }
                    return Unit.INSTANCE;
                }
                mVar9.e();
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                w12.b.b(this.f112886c, (w12.a) obj4, (e23.a) obj3, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                w51.v.d(p3.p0.t(3073), (e23.a) obj3, (h4.r) obj4, (p3.m) obj, (z3.e) obj5, this.f112886c);
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                wi2.b.d(this.f112886c, (String) obj3, (d2) obj4, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                wv0.i.i((String) obj3, this.f112886c, (e23.a) obj4, (z3.e) obj5, (p3.m) obj, p3.p0.t(3073));
                return Unit.INSTANCE;
            case 27:
                VO2MaxReportsActivity vO2MaxReportsActivity = (VO2MaxReportsActivity) obj4;
                ?? r16 = vO2MaxReportsActivity.f47877a;
                q71.e eVar = (q71.e) obj3;
                c42.b bVar2 = (c42.b) obj5;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                VO2MaxReportsActivity.a aVar7 = VO2MaxReportsActivity.f47876b;
                if (mVar10.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(((w32.l) r16.getValue()).f181887a, mVar10);
                    p1 p1VarC2 = s9.c.c(((w32.l) r16.getValue()).f181888b, mVar10);
                    boolean zBooleanValue = ((Boolean) p1VarC.getF182175a()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) p1VarC2.getF182175a()).booleanValue();
                    boolean zR5 = mVar10.r(vO2MaxReportsActivity);
                    Object objQ6 = mVar10.q();
                    if (zR5) {
                        objQ6 = new wd.c(vO2MaxReportsActivity, 18);
                        mVar10.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new wd.c(vO2MaxReportsActivity, 18);
                            mVar10.K(objQ6);
                        }
                    }
                    w32.b.a(eVar, bVar2, this.f112886c, zBooleanValue, zBooleanValue2, (e23.a) objQ6, mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                x72.n.d((h4.r) obj4, (x72.f) obj3, this.f112886c, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                x72.n.a((h4.r) obj4, (x72.b) obj3, this.f112886c, (e23.l) obj5, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, boolean z14, int i14) {
        this.f112884a = i14;
        this.f112887d = obj;
        this.f112885b = obj2;
        this.f112888e = obj3;
        this.f112886c = z14;
    }

    public /* synthetic */ y(Object obj, Object obj2, boolean z14, o13.h hVar, int i14, int i15) {
        this.f112884a = i15;
        this.f112887d = obj;
        this.f112885b = obj2;
        this.f112886c = z14;
        this.f112888e = hVar;
    }

    public /* synthetic */ y(Object obj, boolean z14, Object obj2, Object obj3, int i14, int i15) {
        this.f112884a = i15;
        this.f112887d = obj;
        this.f112886c = z14;
        this.f112885b = obj2;
        this.f112888e = obj3;
    }

    public /* synthetic */ y(String str, String str2, boolean z14, Integer num, int i14) {
        this.f112884a = 4;
        this.f112885b = str;
        this.f112887d = str2;
        this.f112886c = z14;
        this.f112888e = num;
    }

    public /* synthetic */ y(String str, boolean z14, Object obj, o13.h hVar, int i14, int i15) {
        this.f112884a = i15;
        this.f112885b = str;
        this.f112886c = z14;
        this.f112887d = obj;
        this.f112888e = hVar;
    }

    public /* synthetic */ y(zc.d dVar, m52.k kVar, boolean z14, e23.l lVar) {
        this.f112884a = 3;
        this.f112887d = dVar;
        this.f112885b = kVar;
        this.f112886c = z14;
        this.f112888e = lVar;
    }

    public /* synthetic */ y(boolean z14, Object obj, Object obj2, Object obj3, int i14) {
        this.f112884a = i14;
        this.f112886c = z14;
        this.f112887d = obj;
        this.f112885b = obj2;
        this.f112888e = obj3;
    }

    public /* synthetic */ y(boolean z14, Object obj, Object obj2, o13.h hVar, int i14, int i15) {
        this.f112884a = i15;
        this.f112886c = z14;
        this.f112887d = obj;
        this.f112885b = obj2;
        this.f112888e = hVar;
    }

    public /* synthetic */ y(boolean z14, String str, d2 d2Var, e23.l lVar, int i14) {
        this.f112884a = 25;
        this.f112886c = z14;
        this.f112885b = str;
        this.f112887d = d2Var;
        this.f112888e = lVar;
    }
}
