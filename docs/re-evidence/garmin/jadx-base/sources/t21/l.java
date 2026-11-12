package t21;

import android.content.DialogInterface;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectDetailActivity;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.TaggingPrivacyActivity;
import com.garmin.feature.garminpay.ui.userwallet.UserWalletActivity;
import i3.i7;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f161921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f161922c;

    public /* synthetic */ l(int i14, Object obj, Object obj2) {
        this.f161920a = i14;
        this.f161921b = obj;
        this.f161922c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x045f  */
    /* JADX WARN: Code duplicated, block: B:136:0x048d  */
    /* JADX WARN: Code duplicated, block: B:143:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x0501  */
    /* JADX WARN: Code duplicated, block: B:155:0x0527  */
    /* JADX WARN: Code duplicated, block: B:160:0x054e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0080  */
    /* JADX WARN: Code duplicated, block: B:187:0x0654  */
    /* JADX WARN: Code duplicated, block: B:202:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:207:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:212:0x0719  */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:230:0x079f  */
    /* JADX WARN: Code duplicated, block: B:259:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar;
        p3.m mVar2;
        int i14 = this.f161920a;
        String strU = null;
        p3.m.a aVar = p3.m.f135153a;
        final int i15 = 3;
        final int i16 = 0;
        final int i17 = 2;
        final int i18 = 1;
        Object obj3 = this.f161922c;
        Object obj4 = this.f161921b;
        switch (i14) {
            case 0:
                c2.a0 a0Var = (c2.a0) obj4;
                u21.l0 l0Var = (u21.l0) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean z14 = !l0Var.f168037j;
                    g.f161870a.getClass();
                    r1.c0.c(a0Var, z14, null, null, null, null, g.f161871b, mVar3, 1572864, 30);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 1:
                u21.g gVar = (u21.g) obj4;
                p1 p1Var = (p1) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    u21.d0 d0Var = gVar.f167966f;
                    if (d0Var instanceof u21.d0.b) {
                        mVar4.C(-1500037309);
                        strU = Marker.ANY_MARKER + gl1.d.T(((u21.d0.b) d0Var).f167927a, mVar4, 0);
                        mVar4.f();
                    } else if (d0Var instanceof u21.d0.a) {
                        mVar4.C(-1500034115);
                        strU = gl1.d.T(((u21.d0.a) d0Var).f167927a, mVar4, 0);
                        mVar4.f();
                    } else if (d0Var instanceof u21.d0.c) {
                        mVar4.C(-1500031059);
                        u21.d0.c cVar = (u21.d0.c) d0Var;
                        strU = gl1.d.U(cVar.f167927a, new Object[]{cVar.f167930b}, mVar4);
                        mVar4.f();
                    } else {
                        if (d0Var != null) {
                            throw n23.j.m(mVar4, -1500040261);
                        }
                        mVar4.C(743764228);
                        mVar4.f();
                    }
                    String str = strU;
                    if (str == null || ((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar4.C(744432713);
                        mVar4.f();
                    } else {
                        mVar4.C(743908162);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        h4.r rVarA = c2.l.A(c2.l.C(rVarF, 0.0f, eVar.f97917b, 0.0f, eVar.f97918c, 5), eVar.f97920e, 0.0f, 2);
                        d6.h.f57752b.getClass();
                        int i19 = d6.h.f57757g;
                        d92.b.f58624b.getClass();
                        mh.c(str, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i19), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar4), mVar4, 0, 0, 130044);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 2:
                u21.m mVar5 = (u21.m) obj4;
                Object obj5 = (e23.p) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarB = a2.b(c2.l.D(x2.f(aVar2, 1.0f)), a2.a(mVar6), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode = Long.hashCode(mVar6.getU());
                    i2 i2VarX = mVar6.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar3);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar6);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar6);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarF2 = x2.f(aVar2, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.Je);
                    d92.b.f58624b.getClass();
                    mh.c(strW, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar6), mVar6, 0, 0, 131068);
                    mVar6.C(1217950091);
                    for (s21.i iVar : mVar5.f168038a) {
                        l22.a aVarS = w2.a0.s(mVar6);
                        iVar.getClass();
                        b11.c.a aVar4 = b11.c.f14245d;
                        String str2 = iVar.f156126b;
                        boolean z15 = iVar.f156127c;
                        aVar4.getClass();
                        String strB = b11.c.a.b(str2, aVarS, z15);
                        boolean z16 = iVar.f156128d;
                        boolean zB = mVar6.B(obj5) | mVar6.B(iVar);
                        Object objQ = mVar6.q();
                        if (zB) {
                            objQ = new sy.i(i18, obj5, iVar);
                            mVar6.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new sy.i(i18, obj5, iVar);
                                mVar6.K(objQ);
                            }
                        }
                        i0.b(null, z16, strB, (e23.l) objQ, mVar6, 0);
                    }
                    mVar6.f();
                    mVar6.y();
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 3:
                String str3 = (String) obj4;
                NutritionActivity.f fVar = (NutritionActivity.f) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    boolean zB2 = mVar7.B(fVar);
                    Object objQ2 = mVar7.q();
                    if (zB2) {
                        objQ2 = new sg0.w0(fVar, 10);
                        mVar7.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new sg0.w0(fVar, 10);
                            mVar7.K(objQ2);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ2, null, str3, mVar7, null);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                x0.a((s21.w) obj4, (v21.e) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                t42.f.a((e23.a) obj4, (mc) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 6:
                h82.r rVar = (h82.r) obj4;
                final t61.e eVar2 = (t61.e) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i24 = t61.e.f162741f;
                if (mVar8.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    boolean zR = mVar8.r(eVar2);
                    Object objQ3 = mVar8.q();
                    if (zR) {
                        objQ3 = new e23.a() { // from class: t61.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i25 = i16;
                                e eVar3 = eVar2;
                                switch (i25) {
                                    case 0:
                                        int i26 = e.f162741f;
                                        eVar3.e("WHAT_IS_HRV_STRESS_ACTION");
                                        break;
                                    case 1:
                                        int i27 = e.f162741f;
                                        eVar3.e("READINGS_ACTION");
                                        break;
                                    default:
                                        int i28 = e.f162741f;
                                        eVar3.e("MEASUREMENT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: t61.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i16;
                                    e eVar3 = eVar2;
                                    switch (i25) {
                                        case 0:
                                            int i26 = e.f162741f;
                                            eVar3.e("WHAT_IS_HRV_STRESS_ACTION");
                                            break;
                                        case 1:
                                            int i27 = e.f162741f;
                                            eVar3.e("READINGS_ACTION");
                                            break;
                                        default:
                                            int i28 = e.f162741f;
                                            eVar3.e("MEASUREMENT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ3);
                        }
                    }
                    rVar.B(R.string.gcm_help_hrv_stress_section1, null, false, (e23.a) objQ3, mVar8, 0, 6);
                    boolean zR2 = mVar8.r(eVar2);
                    Object objQ4 = mVar8.q();
                    if (zR2) {
                        objQ4 = new e23.a() { // from class: t61.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i25 = i18;
                                e eVar3 = eVar2;
                                switch (i25) {
                                    case 0:
                                        int i26 = e.f162741f;
                                        eVar3.e("WHAT_IS_HRV_STRESS_ACTION");
                                        break;
                                    case 1:
                                        int i27 = e.f162741f;
                                        eVar3.e("READINGS_ACTION");
                                        break;
                                    default:
                                        int i28 = e.f162741f;
                                        eVar3.e("MEASUREMENT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new e23.a() { // from class: t61.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i18;
                                    e eVar3 = eVar2;
                                    switch (i25) {
                                        case 0:
                                            int i26 = e.f162741f;
                                            eVar3.e("WHAT_IS_HRV_STRESS_ACTION");
                                            break;
                                        case 1:
                                            int i27 = e.f162741f;
                                            eVar3.e("READINGS_ACTION");
                                            break;
                                        default:
                                            int i28 = e.f162741f;
                                            eVar3.e("MEASUREMENT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ4);
                        }
                    }
                    rVar.B(R.string.lbl_about_your_readings, null, false, (e23.a) objQ4, mVar8, 0, 6);
                    boolean zR3 = mVar8.r(eVar2);
                    Object objQ5 = mVar8.q();
                    if (zR3) {
                        objQ5 = new e23.a() { // from class: t61.c
                            @Override // e23.a
                            public final Object invoke() {
                                int i25 = i17;
                                e eVar3 = eVar2;
                                switch (i25) {
                                    case 0:
                                        int i26 = e.f162741f;
                                        eVar3.e("WHAT_IS_HRV_STRESS_ACTION");
                                        break;
                                    case 1:
                                        int i27 = e.f162741f;
                                        eVar3.e("READINGS_ACTION");
                                        break;
                                    default:
                                        int i28 = e.f162741f;
                                        eVar3.e("MEASUREMENT_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new e23.a() { // from class: t61.c
                                @Override // e23.a
                                public final Object invoke() {
                                    int i25 = i17;
                                    e eVar3 = eVar2;
                                    switch (i25) {
                                        case 0:
                                            int i26 = e.f162741f;
                                            eVar3.e("WHAT_IS_HRV_STRESS_ACTION");
                                            break;
                                        case 1:
                                            int i27 = e.f162741f;
                                            eVar3.e("READINGS_ACTION");
                                            break;
                                        default:
                                            int i28 = e.f162741f;
                                            eVar3.e("MEASUREMENT_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ5);
                        }
                    }
                    rVar.B(R.string.lbl_how_to_get_measurement, null, false, (e23.a) objQ5, mVar8, 0, 6);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 7:
                TrainingEffectDetailActivity trainingEffectDetailActivity = (TrainingEffectDetailActivity) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                TrainingEffectDetailActivity.a aVar5 = TrainingEffectDetailActivity.f40000v;
                if (mVar9.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    g.h hVar = new g.h();
                    boolean zR4 = mVar9.r(trainingEffectDetailActivity);
                    Object objQ6 = mVar9.q();
                    if (zR4) {
                        objQ6 = new s70.b0(trainingEffectDetailActivity, 18);
                        mVar9.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new s70.b0(trainingEffectDetailActivity, 18);
                            mVar9.K(objQ6);
                        }
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(-1938074358, new rx1.u(arrayList, 23, trainingEffectDetailActivity, c.w.c(hVar, (e23.l) objQ6, mVar9, 0)), mVar9), mVar9, 196608, 31);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 8:
                i02.f fVar2 = (i02.f) obj;
                i02.f fVar3 = (i02.f) obj2;
                fVar2.getClass();
                fVar3.getClass();
                w4.b.f181904b.getClass();
                w4.b.a.a();
                ((w4.a) obj4).a(0);
                return Integer.valueOf(((t70.x0) obj3).A4(fVar2, fVar3));
            case 9:
                ((Integer) obj2).getClass();
                tg1.f.a((h4.r) obj4, (sg1.b) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                tl.e.b((yl.c) obj4, (h4.r) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                tl.g.a((yl.e) obj4, (h4.r) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                int i25 = com.garmin.android.apps.connectmobile.activities.health.presentation.c.f29045e;
                ((com.garmin.android.apps.connectmobile.activities.health.presentation.c) obj4).a((lc.m0) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                int i26 = tn.m.f165476e;
                ((tn.m) obj4).a((lc.m0) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                h82.r rVar2 = (h82.r) obj4;
                final tn.r rVar3 = (tn.r) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i27 = tn.r.f165491f;
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    boolean zR5 = mVar10.r(rVar3);
                    Object objQ7 = mVar10.q();
                    if (zR5) {
                        objQ7 = new e23.a() { // from class: tn.q
                            @Override // e23.a
                            public final Object invoke() {
                                int i28 = i16;
                                r rVar4 = rVar3;
                                switch (i28) {
                                    case 0:
                                        int i29 = r.f165491f;
                                        rVar4.e("HEART_RATE");
                                        break;
                                    case 1:
                                        int i30 = r.f165491f;
                                        rVar4.e("HEART_RATE_VARIABILITY");
                                        break;
                                    case 2:
                                        int i34 = r.f165491f;
                                        rVar4.e("PULSE_OX");
                                        break;
                                    case 3:
                                        int i35 = r.f165491f;
                                        rVar4.e("RESPIRATION");
                                        break;
                                    case 4:
                                        int i36 = r.f165491f;
                                        rVar4.e("STRESS");
                                        break;
                                    default:
                                        int i37 = r.f165491f;
                                        rVar4.e("DOWNLOADABLE_REPORTS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar10.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new e23.a() { // from class: tn.q
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i16;
                                    r rVar4 = rVar3;
                                    switch (i28) {
                                        case 0:
                                            int i29 = r.f165491f;
                                            rVar4.e("HEART_RATE");
                                            break;
                                        case 1:
                                            int i30 = r.f165491f;
                                            rVar4.e("HEART_RATE_VARIABILITY");
                                            break;
                                        case 2:
                                            int i34 = r.f165491f;
                                            rVar4.e("PULSE_OX");
                                            break;
                                        case 3:
                                            int i35 = r.f165491f;
                                            rVar4.e("RESPIRATION");
                                            break;
                                        case 4:
                                            int i36 = r.f165491f;
                                            rVar4.e("STRESS");
                                            break;
                                        default:
                                            int i37 = r.f165491f;
                                            rVar4.e("DOWNLOADABLE_REPORTS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar10.K(objQ7);
                        }
                    }
                    rVar2.B(R.string.activity_details_heart_rate, null, false, (e23.a) objQ7, mVar10, 0, 6);
                    boolean zR6 = mVar10.r(rVar3);
                    Object objQ8 = mVar10.q();
                    if (zR6) {
                        objQ8 = new e23.a() { // from class: tn.q
                            @Override // e23.a
                            public final Object invoke() {
                                int i28 = i18;
                                r rVar4 = rVar3;
                                switch (i28) {
                                    case 0:
                                        int i29 = r.f165491f;
                                        rVar4.e("HEART_RATE");
                                        break;
                                    case 1:
                                        int i30 = r.f165491f;
                                        rVar4.e("HEART_RATE_VARIABILITY");
                                        break;
                                    case 2:
                                        int i34 = r.f165491f;
                                        rVar4.e("PULSE_OX");
                                        break;
                                    case 3:
                                        int i35 = r.f165491f;
                                        rVar4.e("RESPIRATION");
                                        break;
                                    case 4:
                                        int i36 = r.f165491f;
                                        rVar4.e("STRESS");
                                        break;
                                    default:
                                        int i37 = r.f165491f;
                                        rVar4.e("DOWNLOADABLE_REPORTS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar10.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new e23.a() { // from class: tn.q
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i18;
                                    r rVar4 = rVar3;
                                    switch (i28) {
                                        case 0:
                                            int i29 = r.f165491f;
                                            rVar4.e("HEART_RATE");
                                            break;
                                        case 1:
                                            int i30 = r.f165491f;
                                            rVar4.e("HEART_RATE_VARIABILITY");
                                            break;
                                        case 2:
                                            int i34 = r.f165491f;
                                            rVar4.e("PULSE_OX");
                                            break;
                                        case 3:
                                            int i35 = r.f165491f;
                                            rVar4.e("RESPIRATION");
                                            break;
                                        case 4:
                                            int i36 = r.f165491f;
                                            rVar4.e("STRESS");
                                            break;
                                        default:
                                            int i37 = r.f165491f;
                                            rVar4.e("DOWNLOADABLE_REPORTS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar10.K(objQ8);
                        }
                    }
                    rVar2.B(R.string.lbl_heart_rate_variability, null, false, (e23.a) objQ8, mVar10, 0, 6);
                    if (oc.b.y()) {
                        mVar10.C(-1889984599);
                        boolean zR7 = mVar10.r(rVar3);
                        Object objQ9 = mVar10.q();
                        if (zR7) {
                            objQ9 = new e23.a() { // from class: tn.q
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i17;
                                    r rVar4 = rVar3;
                                    switch (i28) {
                                        case 0:
                                            int i29 = r.f165491f;
                                            rVar4.e("HEART_RATE");
                                            break;
                                        case 1:
                                            int i30 = r.f165491f;
                                            rVar4.e("HEART_RATE_VARIABILITY");
                                            break;
                                        case 2:
                                            int i34 = r.f165491f;
                                            rVar4.e("PULSE_OX");
                                            break;
                                        case 3:
                                            int i35 = r.f165491f;
                                            rVar4.e("RESPIRATION");
                                            break;
                                        case 4:
                                            int i36 = r.f165491f;
                                            rVar4.e("STRESS");
                                            break;
                                        default:
                                            int i37 = r.f165491f;
                                            rVar4.e("DOWNLOADABLE_REPORTS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar10.K(objQ9);
                        } else {
                            aVar.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new e23.a() { // from class: tn.q
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i28 = i17;
                                        r rVar4 = rVar3;
                                        switch (i28) {
                                            case 0:
                                                int i29 = r.f165491f;
                                                rVar4.e("HEART_RATE");
                                                break;
                                            case 1:
                                                int i30 = r.f165491f;
                                                rVar4.e("HEART_RATE_VARIABILITY");
                                                break;
                                            case 2:
                                                int i34 = r.f165491f;
                                                rVar4.e("PULSE_OX");
                                                break;
                                            case 3:
                                                int i35 = r.f165491f;
                                                rVar4.e("RESPIRATION");
                                                break;
                                            case 4:
                                                int i36 = r.f165491f;
                                                rVar4.e("STRESS");
                                                break;
                                            default:
                                                int i37 = r.f165491f;
                                                rVar4.e("DOWNLOADABLE_REPORTS");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar10.K(objQ9);
                            }
                        }
                        rVar2.B(R.string.device_settings_pulse_ox, null, false, (e23.a) objQ9, mVar10, 0, 6);
                        mVar = mVar10;
                        mVar.f();
                    } else {
                        mVar = mVar10;
                        mVar.C(-1889865435);
                        mVar.f();
                    }
                    boolean zR8 = mVar.r(rVar3);
                    Object objQ10 = mVar.q();
                    if (zR8) {
                        objQ10 = new e23.a() { // from class: tn.q
                            @Override // e23.a
                            public final Object invoke() {
                                int i28 = i15;
                                r rVar4 = rVar3;
                                switch (i28) {
                                    case 0:
                                        int i29 = r.f165491f;
                                        rVar4.e("HEART_RATE");
                                        break;
                                    case 1:
                                        int i30 = r.f165491f;
                                        rVar4.e("HEART_RATE_VARIABILITY");
                                        break;
                                    case 2:
                                        int i34 = r.f165491f;
                                        rVar4.e("PULSE_OX");
                                        break;
                                    case 3:
                                        int i35 = r.f165491f;
                                        rVar4.e("RESPIRATION");
                                        break;
                                    case 4:
                                        int i36 = r.f165491f;
                                        rVar4.e("STRESS");
                                        break;
                                    default:
                                        int i37 = r.f165491f;
                                        rVar4.e("DOWNLOADABLE_REPORTS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new e23.a() { // from class: tn.q
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i15;
                                    r rVar4 = rVar3;
                                    switch (i28) {
                                        case 0:
                                            int i29 = r.f165491f;
                                            rVar4.e("HEART_RATE");
                                            break;
                                        case 1:
                                            int i30 = r.f165491f;
                                            rVar4.e("HEART_RATE_VARIABILITY");
                                            break;
                                        case 2:
                                            int i34 = r.f165491f;
                                            rVar4.e("PULSE_OX");
                                            break;
                                        case 3:
                                            int i35 = r.f165491f;
                                            rVar4.e("RESPIRATION");
                                            break;
                                        case 4:
                                            int i36 = r.f165491f;
                                            rVar4.e("STRESS");
                                            break;
                                        default:
                                            int i37 = r.f165491f;
                                            rVar4.e("DOWNLOADABLE_REPORTS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ10);
                        }
                    }
                    rVar2.B(R.string.activities_respiration_title, null, false, (e23.a) objQ10, mVar, 0, 6);
                    boolean zR9 = mVar.r(rVar3);
                    Object objQ11 = mVar.q();
                    if (zR9) {
                        final int i28 = 4;
                        objQ11 = new e23.a() { // from class: tn.q
                            @Override // e23.a
                            public final Object invoke() {
                                int i29 = i28;
                                r rVar4 = rVar3;
                                switch (i29) {
                                    case 0:
                                        int i210 = r.f165491f;
                                        rVar4.e("HEART_RATE");
                                        break;
                                    case 1:
                                        int i30 = r.f165491f;
                                        rVar4.e("HEART_RATE_VARIABILITY");
                                        break;
                                    case 2:
                                        int i34 = r.f165491f;
                                        rVar4.e("PULSE_OX");
                                        break;
                                    case 3:
                                        int i35 = r.f165491f;
                                        rVar4.e("RESPIRATION");
                                        break;
                                    case 4:
                                        int i36 = r.f165491f;
                                        rVar4.e("STRESS");
                                        break;
                                    default:
                                        int i37 = r.f165491f;
                                        rVar4.e("DOWNLOADABLE_REPORTS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            final int i29 = 4;
                            objQ11 = new e23.a() { // from class: tn.q
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i29;
                                    r rVar4 = rVar3;
                                    switch (i210) {
                                        case 0:
                                            int i211 = r.f165491f;
                                            rVar4.e("HEART_RATE");
                                            break;
                                        case 1:
                                            int i30 = r.f165491f;
                                            rVar4.e("HEART_RATE_VARIABILITY");
                                            break;
                                        case 2:
                                            int i34 = r.f165491f;
                                            rVar4.e("PULSE_OX");
                                            break;
                                        case 3:
                                            int i35 = r.f165491f;
                                            rVar4.e("RESPIRATION");
                                            break;
                                        case 4:
                                            int i36 = r.f165491f;
                                            rVar4.e("STRESS");
                                            break;
                                        default:
                                            int i37 = r.f165491f;
                                            rVar4.e("DOWNLOADABLE_REPORTS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ11);
                        }
                    }
                    rVar2.B(R.string.title_stress, null, false, (e23.a) objQ11, mVar, 0, 6);
                    boolean zR10 = mVar.r(rVar3);
                    Object objQ12 = mVar.q();
                    if (zR10) {
                        final int i30 = 5;
                        objQ12 = new e23.a() { // from class: tn.q
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i30;
                                r rVar4 = rVar3;
                                switch (i210) {
                                    case 0:
                                        int i211 = r.f165491f;
                                        rVar4.e("HEART_RATE");
                                        break;
                                    case 1:
                                        int i34 = r.f165491f;
                                        rVar4.e("HEART_RATE_VARIABILITY");
                                        break;
                                    case 2:
                                        int i35 = r.f165491f;
                                        rVar4.e("PULSE_OX");
                                        break;
                                    case 3:
                                        int i36 = r.f165491f;
                                        rVar4.e("RESPIRATION");
                                        break;
                                    case 4:
                                        int i37 = r.f165491f;
                                        rVar4.e("STRESS");
                                        break;
                                    default:
                                        int i38 = r.f165491f;
                                        rVar4.e("DOWNLOADABLE_REPORTS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            final int i34 = 5;
                            objQ12 = new e23.a() { // from class: tn.q
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i34;
                                    r rVar4 = rVar3;
                                    switch (i210) {
                                        case 0:
                                            int i211 = r.f165491f;
                                            rVar4.e("HEART_RATE");
                                            break;
                                        case 1:
                                            int i35 = r.f165491f;
                                            rVar4.e("HEART_RATE_VARIABILITY");
                                            break;
                                        case 2:
                                            int i36 = r.f165491f;
                                            rVar4.e("PULSE_OX");
                                            break;
                                        case 3:
                                            int i37 = r.f165491f;
                                            rVar4.e("RESPIRATION");
                                            break;
                                        case 4:
                                            int i38 = r.f165491f;
                                            rVar4.e("STRESS");
                                            break;
                                        default:
                                            int i39 = r.f165491f;
                                            rVar4.e("DOWNLOADABLE_REPORTS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ12);
                        }
                    }
                    rVar2.B(R.string.lbl_downloadable_reports, null, false, (e23.a) objQ12, mVar, 0, 6);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i35 = tn.u.f165495e;
                ((tn.u) obj4).a((lc.m0) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 16:
                UserWalletActivity userWalletActivity = (UserWalletActivity) obj4;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                UserWalletActivity.a aVar6 = UserWalletActivity.f52217q;
                dialogInterface.getClass();
                androidx.lifecycle.i0 i0VarW = o53.f0.w(userWalletActivity);
                x53.c cVar2 = o53.s0.f129406a;
                ge1.b.T(i0VarW, u53.o.f168762a, null, new tr2.v(dialogInterface, userWalletActivity, (vr2.q) obj3, null), 2);
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                tw.f.a((List) obj4, (kw.m) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar7 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.k) obj4).z6((AddTIEventViewModel) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.k.a aVar8 = com.garmin.android.apps.connectmobile.traininginitiative.ui.k.f46110c;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.k) obj4).y6((ny1.e) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.p.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.p.f46166c;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.p) obj4).u6((AddTIEventViewModel) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.r.a aVar10 = com.garmin.android.apps.connectmobile.traininginitiative.ui.r.f46219c;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.r) obj4).u6((AddTIEventViewModel) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                gg0.f fVar4 = (gg0.f) obj4;
                gg0.f fVar5 = (gg0.f) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.r.a aVar11 = com.garmin.android.apps.connectmobile.traininginitiative.ui.r.f46219c;
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (fVar4 == fVar5) {
                        mVar11.C(826871299);
                        h4.r.a aVar12 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarQ = x2.q(aVar12, j92.b.f97901d.f97904c);
                        s62.a.f157643a.getClass();
                        i7.b(v62.e1.a(t62.b.f162798a), null, rVarQ, androidx.room.a0.c(mVar11), mVar11, 48, 0);
                        mVar11.f();
                    } else {
                        mVar11.C(827188274);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 23:
                List list = (List) obj4;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u uVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.u) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.u.a aVar13 = com.garmin.android.apps.connectmobile.traininginitiative.ui.u.A;
                if (mVar12.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    e2.i0 i0VarA = e2.k0.a(0, 0, 3, mVar12);
                    Object objQ13 = mVar12.q();
                    aVar.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = p3.p0.n(list);
                        mVar12.K(objQ13);
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(1137001657, new sk0.k1((p1) objQ13, (Object) i0VarA, (Object) uVar, (Object) list, 13), mVar12), mVar12, 196608, 31);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 24:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.v) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar14 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                if (mVar13.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    vVar.E6(arrayList2, vVar.F6().E2, vVar.F6().D2, vVar.F6().G2, vVar.F6().H2, mVar13, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 25:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var2 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a0) obj4;
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar15 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                AddTIEventViewModel addTIEventViewModelF6 = a0Var2.F6();
                androidx.fragment.app.m mVarRequireActivity = a0Var2.requireActivity();
                mVarRequireActivity.getClass();
                addTIEventViewModelF6.t6(mVarRequireActivity, (am.x0) obj3);
                ((androidx.lifecycle.y0) a0Var2.F6().N1.getValue()).m(null);
                return Unit.INSTANCE;
            case 26:
                String str4 = (String) obj4;
                rz1.h hVar2 = (rz1.h) obj3;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    h4.r rVarD = x2.d(aVar16, 1.0f);
                    boolean zB3 = mVar14.B(str4);
                    Object objQ14 = mVar14.q();
                    if (zB3) {
                        objQ14 = new s70.r0(str4, 27);
                        mVar14.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new s70.r0(str4, 27);
                            mVar14.K(objQ14);
                        }
                    }
                    h4.r rVarC2 = p5.v.c((e23.l) objQ14, rVarD, false);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar14, 0);
                    int iHashCode2 = Long.hashCode(mVar14.getU());
                    i2 i2VarX2 = mVar14.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar14);
                    h5.g.V.getClass();
                    h5.e0.a aVar17 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar17);
                    } else {
                        mVar14.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar14);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar14);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar14.getT() || !p005kotlin.jvm.internal.s.g(mVar14.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar14, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar14);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    tz1.b.a(x2.f(aVar16, 1.0f), hVar2 != null ? p005kotlin.jvm.internal.s.g(hVar2.f155234e, Boolean.TRUE) : false ? hVar2.f155231b : null, hVar2 != null ? hVar2.f155232c : null, false, mVar14, 6, 8);
                    oz1.s sVar = hVar2 != null ? hVar2.f155233d : null;
                    if (sVar == null) {
                        mVar14.C(709288491);
                        mVar14.f();
                        mVar2 = mVar14;
                    } else {
                        mVar14.C(709288492);
                        String strQ = gl1.y.Q(mVar14, sVar.f134618c);
                        h4.r rVarB2 = b0Var2.b(x2.f(aVar16, 1.0f), h4.d.a.f81537o);
                        d6.h.f57752b.getClass();
                        d6.h hVarA = d6.h.a(d6.h.f57755e);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mVar2 = mVar14;
                        mh.c(strQ, rVarB2, 0L, null, 0L, null, 0L, hVarA, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar14), mVar2, 0, 0, 130044);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 27:
                TaggingPrivacyActivity taggingPrivacyActivity = (TaggingPrivacyActivity) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar15 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                TaggingPrivacyActivity.a aVar18 = TaggingPrivacyActivity.f47117a;
                if (mVar15.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.userprofile.model.o oVar = (com.garmin.android.apps.connectmobile.userprofile.model.o) p1Var2.getF182175a();
                    boolean zR11 = mVar15.r(taggingPrivacyActivity);
                    Object objQ15 = mVar15.q();
                    if (zR11) {
                        objQ15 = new sk0.n(taggingPrivacyActivity, p1Var2, 16);
                        mVar15.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new sk0.n(taggingPrivacyActivity, p1Var2, 16);
                            mVar15.K(objQ15);
                        }
                    }
                    e23.l<? super Boolean, Unit> lVar = (e23.l) objQ15;
                    boolean zR12 = mVar15.r(taggingPrivacyActivity);
                    Object objQ16 = mVar15.q();
                    if (zR12) {
                        objQ16 = new sk0.n(taggingPrivacyActivity, p1Var2, 17);
                        mVar15.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new sk0.n(taggingPrivacyActivity, p1Var2, 17);
                            mVar15.K(objQ16);
                        }
                    }
                    taggingPrivacyActivity.da(oVar, lVar, (e23.l) objQ16, mVar15, com.garmin.android.apps.connectmobile.d.$stable << 9);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                u50.g.a((x50.f) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                u91.b.b((h4.r) obj4, (aa1.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, int i14, int i15) {
        this.f161920a = i15;
        this.f161921b = obj;
        this.f161922c = obj2;
    }
}
