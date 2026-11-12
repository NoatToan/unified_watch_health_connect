package wb1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.fb;
import b21.l4;
import c2.b0;
import c2.t0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity.d;
import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyReportsActivity;
import e2.i0;
import e2.k0;
import e23.p;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import j02.h0;
import java.text.Collator;
import java.util.Iterator;
import java.util.List;
import l72.f0;
import l72.p2;
import lc.m0;
import lc.v0;
import lc.w;
import o4.d0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p3.x3;
import s5.x0;
import s70.q1;
import u1.a2;
import vc0.v;
import wn0.q;
import wv0.u;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f183887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f183888c;

    public /* synthetic */ i(yl.d dVar, r rVar) {
        this.f183886a = 5;
        this.f183888c = dVar;
        this.f183887b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005d  */
    private final Object a(Object obj, Object obj2) {
        xi1.d dVar = (xi1.d) this.f183887b;
        x3 x3Var = (x3) this.f183888c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(mVar, R.string.lbl_device_image);
            String strQ2 = y.Q(mVar, R.string.msg_newsfeed_display_activity_metric_image);
            z3.e eVarC = z3.f.c(-2002170718, new dv0.l(x3Var, 7), mVar);
            boolean zR = mVar.r(dVar) | mVar.B(x3Var);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new wz1.c(24, dVar, x3Var);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wz1.c(24, dVar, x3Var);
                    mVar.K(objQ);
                }
            }
            p2Var.h(strQ, strQ2, null, null, null, false, false, null, eVarC, null, (e23.a) objQ, mVar, 100663296, 0, 764);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    private final Object b(Object obj, Object obj2) {
        h82.r rVar = (h82.r) this.f183887b;
        final xk1.f fVar = (xk1.f) this.f183888c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = xk1.f.f191223j;
        final int i15 = 0;
        final int i16 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean zR = mVar.r(fVar);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new e23.a() { // from class: xk1.b
                    @Override // e23.a
                    public final Object invoke() {
                        int i17 = i15;
                        f fVar2 = fVar;
                        switch (i17) {
                            case 0:
                                int i18 = f.f191223j;
                                fVar2.e("ON_DEVICE_ACTION");
                                break;
                            default:
                                int i19 = f.f191223j;
                                fVar2.e("TRAINING_WITH_HR_ZONES");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.a() { // from class: xk1.b
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i15;
                            f fVar2 = fVar;
                            switch (i17) {
                                case 0:
                                    int i18 = f.f191223j;
                                    fVar2.e("ON_DEVICE_ACTION");
                                    break;
                                default:
                                    int i19 = f.f191223j;
                                    fVar2.e("TRAINING_WITH_HR_ZONES");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ);
                }
            }
            rVar.B(R.string.hr_zones_help_zones_on_device, null, false, (e23.a) objQ, mVar, 0, 6);
            boolean zR2 = mVar.r(fVar);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new e23.a() { // from class: xk1.b
                    @Override // e23.a
                    public final Object invoke() {
                        int i17 = i16;
                        f fVar2 = fVar;
                        switch (i17) {
                            case 0:
                                int i18 = f.f191223j;
                                fVar2.e("ON_DEVICE_ACTION");
                                break;
                            default:
                                int i19 = f.f191223j;
                                fVar2.e("TRAINING_WITH_HR_ZONES");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e23.a() { // from class: xk1.b
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i16;
                            f fVar2 = fVar;
                            switch (i17) {
                                case 0:
                                    int i18 = f.f191223j;
                                    fVar2.e("ON_DEVICE_ACTION");
                                    break;
                                default:
                                    int i19 = f.f191223j;
                                    fVar2.e("TRAINING_WITH_HR_ZONES");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ2);
                }
            }
            rVar.B(R.string.hr_zones_help_training_hr_zones, null, false, (e23.a) objQ2, mVar, 0, 6);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:113:0x0307  */
    /* JADX WARN: Code duplicated, block: B:118:0x0331  */
    /* JADX WARN: Code duplicated, block: B:144:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0578  */
    /* JADX WARN: Code duplicated, block: B:196:0x0657  */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:201:0x0695  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:255:0x0886  */
    /* JADX WARN: Code duplicated, block: B:260:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:265:0x08df  */
    /* JADX WARN: Code duplicated, block: B:284:0x0965  */
    /* JADX WARN: Code duplicated, block: B:289:0x0995  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:309:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:351:0x0b22  */
    /* JADX WARN: Code duplicated, block: B:377:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0169  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        d0 d0VarA;
        d0 d0VarA2;
        int i14 = this.f183886a;
        String strQ = "--";
        p3.m.a aVar = p3.m.f135153a;
        final int i15 = 3;
        final int i16 = 2;
        boolean z14 = false;
        Object obj6 = this.f183888c;
        Object obj7 = this.f183887b;
        final int iCompare = 1;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                j.b((r) obj7, (lc.y) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                PromotionsDevMenuActivity promotionsDevMenuActivity = (PromotionsDevMenuActivity) obj7;
                m0 m0Var = (m0) obj6;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = PromotionsDevMenuActivity.f41027b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    int i18 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    boolean zR = mVar.r(promotionsDevMenuActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new v(promotionsDevMenuActivity, 29);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new v(promotionsDevMenuActivity, 29);
                            mVar.K(objQ);
                        }
                    }
                    z02.f.a(196608, 14, null, (e23.a) objQ, z3.f.c(1580050059, new ug2.v(m0Var, 4), mVar), null, mVar, dVarA);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                m0 m0Var2 = (m0) obj7;
                lc.v vVar = (lc.v) obj6;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i19 = PromotionsDevMenuActivity.f41027b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    c.b(null, m0Var2, (a) w.a(vVar, s0.f105811a.b(a.class)), mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                RunningEconomyReportsActivity runningEconomyReportsActivity = (RunningEconomyReportsActivity) obj7;
                Boolean bool = (Boolean) obj6;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                RunningEconomyReportsActivity.a aVar2 = RunningEconomyReportsActivity.f41149c;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar3);
                    String str = com.garmin.android.apps.connectmobile.running_economy.presentation.a.c.f41159b.f41156a;
                    boolean zR2 = mVar3.r(runningEconomyReportsActivity) | mVar3.r(m0VarI) | mVar3.B(bool);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        obj3 = objQ2;
                        tn2.s0 s0Var = new tn2.s0(runningEconomyReportsActivity, 28, m0VarI, bool);
                        mVar3.K(s0Var);
                        obj3 = s0Var;
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            obj3 = objQ2;
                            tn2.s0 s0Var2 = new tn2.s0(runningEconomyReportsActivity, 28, m0VarI, bool);
                            mVar3.K(s0Var2);
                            obj3 = s0Var2;
                        }
                    }
                    obj3 = objQ2;
                    nc.y.b(m0VarI, str, null, null, null, null, null, null, (e23.l) obj3, mVar3, 0, 1020);
                    if (runningEconomyReportsActivity.f41151b) {
                        lc.y.k(com.garmin.android.apps.connectmobile.running_economy.presentation.a.b.f41158b.f41156a, m0VarI);
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                wi2.b.a((ti2.b.a) obj7, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                yl.d dVar = (yl.d) obj6;
                r rVar = (r) obj7;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    tl.e.b(dVar != null ? dVar.f197641c : null, rVar, mVar4, 0);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                wl.d.a((yl.f) obj7, (e23.l) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                wn0.g.b((nk0.l) obj7, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                wn0.g.k((in0.j) obj7, (nk0.l) obj6, (p3.m) obj, p0.t(9));
                return Unit.INSTANCE;
            case 9:
                q qVar = (q) obj7;
                nk0.l lVar = (nk0.l) obj6;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    if (qVar instanceof q.b) {
                        mVar5.C(-2046694299);
                        wn0.g.m(mVar5, 0);
                        mVar5.f();
                    } else if (qVar instanceof q.a) {
                        mVar5.C(-2046691837);
                        boolean zB = mVar5.B(qVar);
                        Object objQ3 = mVar5.q();
                        if (zB) {
                            objQ3 = new wd.c(qVar, 8);
                            mVar5.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new wd.c(qVar, 8);
                                mVar5.K(objQ3);
                            }
                        }
                        wn0.g.l((e23.a) objQ3, mVar5, 0);
                        mVar5.f();
                    } else {
                        if (!(qVar instanceof q.c)) {
                            throw n23.j.m(mVar5, -2046696201);
                        }
                        mVar5.C(-2046688345);
                        wn0.g.k(((q.c) qVar).f186173b, lVar, mVar5, 8);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                wq0.l lVar2 = (wq0.l) obj7;
                List list = (List) obj6;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    i0 i0VarA = k0.a(0, 0, 3, mVar6);
                    boolean zR3 = mVar6.r(lVar2);
                    Object objQ4 = mVar6.q();
                    if (zR3) {
                        objQ4 = new wq0.f(lVar2, null);
                        mVar6.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new wq0.f(lVar2, null);
                            mVar6.K(objQ4);
                        }
                    }
                    h0 h0VarB = j02.d0.b(i0VarA, (e23.r) objQ4, mVar6);
                    r rVarD = x2.d(r.S, 1.0f);
                    boolean zR4 = mVar6.r(list) | mVar6.B(h0VarB) | mVar6.r(lVar2);
                    Object objQ5 = mVar6.q();
                    if (zR4) {
                        objQ5 = new wn2.f(list, iCompare, h0VarB, lVar2);
                        mVar6.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new wn2.f(list, iCompare, h0VarB, lVar2);
                            mVar6.K(objQ5);
                        }
                    }
                    e2.c.b(rVarD, i0VarA, null, null, null, null, false, null, (e23.l) objQ5, mVar6, 6, 508);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                wv0.i.c((i53.c) obj7, (z3.e) obj6, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                u.b((l0) obj7, (e23.l) obj6, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 13:
                h82.r rVar2 = (h82.r) obj7;
                final ww.f fVar = (ww.f) obj6;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ww.f.a aVar3 = ww.f.f187506i;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    boolean zR5 = mVar7.r(fVar);
                    Object objQ6 = mVar7.q();
                    if (zR5) {
                        final int i24 = z14 ? 1 : 0;
                        objQ6 = new e23.a() { // from class: ww.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i25 = i24;
                                f fVar2 = fVar;
                                switch (i25) {
                                    case 0:
                                        f.a aVar4 = f.f187506i;
                                        fVar2.e("ABOUT_ACTION");
                                        break;
                                    case 1:
                                        f.a aVar5 = f.f187506i;
                                        fVar2.e("MEASURING_ACTION");
                                        break;
                                    default:
                                        f.a aVar6 = f.f187506i;
                                        fVar2.e("USAGE_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar7.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            final int i25 = z14 ? 1 : 0;
                            objQ6 = new e23.a() { // from class: ww.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i26 = i25;
                                    f fVar2 = fVar;
                                    switch (i26) {
                                        case 0:
                                            f.a aVar4 = f.f187506i;
                                            fVar2.e("ABOUT_ACTION");
                                            break;
                                        case 1:
                                            f.a aVar5 = f.f187506i;
                                            fVar2.e("MEASURING_ACTION");
                                            break;
                                        default:
                                            f.a aVar6 = f.f187506i;
                                            fVar2.e("USAGE_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar7.K(objQ6);
                        }
                    }
                    rVar2.B(R.string.lbl_about_your_reading, null, false, (e23.a) objQ6, mVar7, 0, 6);
                    boolean zR6 = mVar7.r(fVar);
                    Object objQ7 = mVar7.q();
                    if (zR6) {
                        objQ7 = new e23.a() { // from class: ww.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i26 = iCompare;
                                f fVar2 = fVar;
                                switch (i26) {
                                    case 0:
                                        f.a aVar4 = f.f187506i;
                                        fVar2.e("ABOUT_ACTION");
                                        break;
                                    case 1:
                                        f.a aVar5 = f.f187506i;
                                        fVar2.e("MEASURING_ACTION");
                                        break;
                                    default:
                                        f.a aVar6 = f.f187506i;
                                        fVar2.e("USAGE_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar7.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new e23.a() { // from class: ww.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i26 = iCompare;
                                    f fVar2 = fVar;
                                    switch (i26) {
                                        case 0:
                                            f.a aVar4 = f.f187506i;
                                            fVar2.e("ABOUT_ACTION");
                                            break;
                                        case 1:
                                            f.a aVar5 = f.f187506i;
                                            fVar2.e("MEASURING_ACTION");
                                            break;
                                        default:
                                            f.a aVar6 = f.f187506i;
                                            fVar2.e("USAGE_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar7.K(objQ7);
                        }
                    }
                    rVar2.B(R.string.lbl_blood_pressure_help_measuring, null, false, (e23.a) objQ7, mVar7, 0, 6);
                    boolean zR7 = mVar7.r(fVar);
                    Object objQ8 = mVar7.q();
                    if (zR7) {
                        objQ8 = new e23.a() { // from class: ww.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i26 = i16;
                                f fVar2 = fVar;
                                switch (i26) {
                                    case 0:
                                        f.a aVar4 = f.f187506i;
                                        fVar2.e("ABOUT_ACTION");
                                        break;
                                    case 1:
                                        f.a aVar5 = f.f187506i;
                                        fVar2.e("MEASURING_ACTION");
                                        break;
                                    default:
                                        f.a aVar6 = f.f187506i;
                                        fVar2.e("USAGE_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar7.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new e23.a() { // from class: ww.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i26 = i16;
                                    f fVar2 = fVar;
                                    switch (i26) {
                                        case 0:
                                            f.a aVar4 = f.f187506i;
                                            fVar2.e("ABOUT_ACTION");
                                            break;
                                        case 1:
                                            f.a aVar5 = f.f187506i;
                                            fVar2.e("MEASURING_ACTION");
                                            break;
                                        default:
                                            f.a aVar6 = f.f187506i;
                                            fVar2.e("USAGE_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar7.K(objQ8);
                        }
                    }
                    rVar2.B(R.string.lbl_how_to_use_reading, null, false, (e23.a) objQ8, mVar7, 0, 6);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 14:
                Collator collator = (Collator) obj7;
                Context context = (Context) obj6;
                ww0.i iVar = (ww0.i) obj;
                ww0.i iVar2 = (ww0.i) obj2;
                ww0.i iVar3 = ww0.i.NONE;
                if (iVar != iVar3) {
                    iCompare = iVar2 == iVar3 ? -1 : collator.compare(iVar.a(context), iVar2.a(context));
                }
                return Integer.valueOf(iCompare);
            case 15:
                dy1.p pVar = (dy1.p) obj7;
                e23.l lVar3 = (e23.l) obj6;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    r.a aVar4 = r.S;
                    r rVarB = a2.b(x2.d(aVar4, 1.0f), a2.a(mVar8), true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarY = c2.l.y(rVarB, eVar.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar5 = h4.d.a.f81537o;
                    c2.j jVar = c2.j.f22691a;
                    float f14 = eVar.f97918c;
                    jVar.getClass();
                    z zVarA = c2.y.a(c2.j.i(f14), aVar5, mVar8, 48);
                    int iHashCode = Long.hashCode(mVar8.getU());
                    i2 i2VarX = mVar8.x();
                    r rVarC = h4.k.c(rVarY, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar6);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar8);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar8, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar8);
                    b0 b0Var = b0.f22601a;
                    r rVarC2 = c2.l.C(c2.l.A(aVar4, eVar.f97921f, 0.0f, 2), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    String strQ2 = y.Q(mVar8, R.string.lbl_stp_select_plan_message);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar8);
                    d6.h.f57752b.getClass();
                    int i26 = d6.h.f57755e;
                    mh.c(strQ2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i26), 0L, 0, false, 0, 0, null, x0VarB, mVar8, 0, 0, 130044);
                    mh.c(y.Q(mVar8, pVar.f61595a == mx1.d.GET_FIT ? R.string.lbl_stp_get_fit_select_plan_additional_message : R.string.lbl_stp_select_plan_additional_message), c2.l.C(c2.l.A(aVar4, eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), 0L, null, 0L, null, 0L, d6.h.a(i26), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar8), mVar8, 0, 0, 130044);
                    mVar8.C(1670479937);
                    Iterator<mx1.f> it = pVar.f61597c.iterator();
                    while (it.hasNext()) {
                        qx1.o.a(it.next(), lVar3, mVar8, 0);
                    }
                    mVar8.f();
                    mVar8.y();
                    x1 x1Var9 = p3.n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 16:
                x3 x3Var = (x3) obj7;
                NutritionActivity nutritionActivity = (NutritionActivity) obj6;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                NutritionActivity.a aVar7 = NutritionActivity.f39581f;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    fb fbVar = ((x01.j) x3Var.getF182175a()).f188283b;
                    l4 l4Var = ((x01.j) x3Var.getF182175a()).f188284c;
                    boolean zB2 = mVar9.B(x3Var) | mVar9.r(nutritionActivity);
                    Object objQ9 = mVar9.q();
                    if (zB2) {
                        obj4 = objQ9;
                        NutritionActivity.d dVar2 = nutritionActivity.new d(x3Var, null);
                        mVar9.K(dVar2);
                        obj4 = dVar2;
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            obj4 = objQ9;
                            NutritionActivity.d dVar3 = nutritionActivity.new d(x3Var, null);
                            mVar9.K(dVar3);
                            obj4 = dVar3;
                        }
                    }
                    obj4 = objQ9;
                    p3.l0.f(fbVar, l4Var, (p) obj4, mVar9);
                    Context context2 = (Context) mVar9.A(AndroidCompositionLocals_androidKt.f6042b);
                    Boolean boolValueOf = Boolean.valueOf(((x01.j) x3Var.getF182175a()).f188285d);
                    boolean zB3 = mVar9.B(x3Var) | mVar9.r(context2) | mVar9.r(nutritionActivity);
                    Object objQ10 = mVar9.q();
                    if (zB3) {
                        obj5 = objQ10;
                        NutritionActivity.e eVar2 = new NutritionActivity.e(context2, nutritionActivity, x3Var, null);
                        mVar9.K(eVar2);
                        obj5 = eVar2;
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            obj5 = objQ10;
                            NutritionActivity.e eVar3 = new NutritionActivity.e(context2, nutritionActivity, x3Var, null);
                            mVar9.K(eVar3);
                            obj5 = eVar3;
                        }
                    }
                    obj5 = objQ10;
                    p3.l0.e((p) obj5, boolValueOf, mVar9);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ((x1.i) obj7).a((x1.e) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                List list2 = (List) obj7;
                CreateCustomCourseActivity createCustomCourseActivity = (CreateCustomCourseActivity) obj6;
                int iIntValue10 = ((Integer) obj).intValue();
                int iIntValue11 = ((Integer) obj2).intValue();
                ClimbDTO climbDTO = (ClimbDTO) p13.h0.e0(iIntValue10, list2);
                if (climbDTO != null) {
                    CreateCustomCourseActivity.a aVar8 = CreateCustomCourseActivity.f33013f;
                    x40.l0 l0VarFa = createCustomCourseActivity.fa();
                    l0VarFa.getClass();
                    l0VarFa.D4(new a50.e.a0(climbDTO));
                }
                ClimbDTO climbDTO2 = (ClimbDTO) p13.h0.e0(iIntValue11, list2);
                if (climbDTO2 != null) {
                    CreateCustomCourseActivity.a aVar9 = CreateCustomCourseActivity.f33013f;
                    x40.l0 l0VarFa2 = createCustomCourseActivity.fa();
                    l0VarFa2.getClass();
                    l0VarFa2.D4(new a50.e.r(climbDTO2));
                }
                return Unit.INSTANCE;
            case 19:
                String str2 = (String) obj7;
                j70.r rVar3 = (j70.r) obj6;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f15 = eVar4.f97920e;
                    jVar2.getClass();
                    c2.j.i iVarI = c2.j.i(f15);
                    c2.j.i iVarI2 = c2.j.i(eVar4.f97917b);
                    g6.f.a aVar10 = g6.f.f75994b;
                    r rVarA = c2.l.A(r.S, 0.0f, 10, 1);
                    boolean zB4 = mVar10.B(str2);
                    Object objQ11 = mVar10.q();
                    if (zB4) {
                        objQ11 = new u91.c(str2, 23);
                        mVar10.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new u91.c(str2, 23);
                            mVar10.K(objQ11);
                        }
                    }
                    t0.a(p5.v.c((e23.l) objQ11, rVarA, false), iVarI, iVarI2, null, 0, 0, z3.f.c(1898594794, new q1(rVar3, iCompare), mVar10), mVar10, 1572864, 56);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                x72.n.e((x72.e) obj7, (e23.l) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                aa1.b bVar2 = (aa1.b) obj7;
                e23.a aVar11 = (e23.a) obj6;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    z02.f.c(0, 54, null, aVar11, null, bVar2.f2230a, mVar11, null);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 22:
                aa1.b bVar3 = (aa1.b) obj7;
                e23.l lVar4 = (e23.l) obj6;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    r.a aVar12 = r.S;
                    r rVarE = u1.n.e(a2.b(x2.d(aVar12, 1.0f), a2.a(mVar12), true), vb.h.e(d92.b.f58623a, mVar12), m1.f128891a);
                    c2.j jVar3 = c2.j.f22691a;
                    d92.b.f58625c.getClass();
                    float f16 = j92.b.f97899b.f97920e;
                    jVar3.getClass();
                    c2.j.i iVarI3 = c2.j.i(f16);
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(iVarI3, h4.d.a.f81536n, mVar12, 0);
                    int iHashCode2 = Long.hashCode(mVar12.getU());
                    i2 i2VarX2 = mVar12.x();
                    r rVarC3 = h4.k.c(rVarE, mVar12);
                    h5.g.V.getClass();
                    e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar13);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar12);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar12.getT() || !s.g(mVar12.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar12, iHashCode2, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar12);
                    b0 b0Var2 = b0.f22601a;
                    r rVarC4 = c2.l.C(aVar12, 0.0f, j92.b.f97901d.f97907f, 0.0f, 0.0f, 13);
                    h4.g.a aVar14 = h4.d.a.f81537o;
                    x91.l.b(b0Var2.b(rVarC4, aVar14), mVar12, 0);
                    String str3 = bVar3.f2231b;
                    d92.b.f58624b.getClass();
                    x0 x0VarE = d92.c.e(d92.c.b(j92.f.f97931h, mVar12));
                    r rVarA2 = c2.l.A(b0Var2.b(x2.f(aVar12, 1.0f), aVar14), f16, 0.0f, 2);
                    d6.h.f57752b.getClass();
                    int i27 = d6.h.f57755e;
                    mh.c(str3, rVarA2, 0L, null, 0L, null, 0L, d6.h.a(i27), 0L, 0, false, 0, 0, null, x0VarE, mVar12, 0, 0, 130044);
                    mh.c(y.Q(mVar12, R.string.personal_records_empty_description), c2.l.A(b0Var2.b(x2.f(aVar12, 1.0f), aVar14), f16, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i27), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar12), mVar12, 0, 0, 130044);
                    f0 f0Var = f0.f110999a;
                    String strQ3 = y.Q(mVar12, R.string.personal_records_add_record_action);
                    r rVarB2 = b0Var2.b(aVar12, aVar14);
                    boolean zR8 = mVar12.r(bVar3) | mVar12.B(lVar4);
                    Object objQ12 = mVar12.q();
                    if (zR8) {
                        objQ12 = new wz1.c(11, bVar3, lVar4);
                        mVar12.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new wz1.c(11, bVar3, lVar4);
                            mVar12.K(objQ12);
                        }
                    }
                    f0Var.d(0, 9, (e23.a) objQ12, rVarB2, strQ3, mVar12, null, false);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 23:
                h82.r rVar4 = (h82.r) obj7;
                final xa1.b0 b0Var3 = (xa1.b0) obj6;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int i28 = xa1.b0.f189732f;
                if (mVar13.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    boolean zR9 = mVar13.r(b0Var3);
                    Object objQ13 = mVar13.q();
                    if (zR9) {
                        final int i29 = z14 ? 1 : 0;
                        objQ13 = new e23.a() { // from class: xa1.a0
                            @Override // e23.a
                            public final Object invoke() {
                                int i30 = i29;
                                b0 b0Var4 = b0Var3;
                                switch (i30) {
                                    case 0:
                                        int i34 = b0.f189732f;
                                        b0Var4.e("ABOUT_POWER_GUIDE_ACTION");
                                        break;
                                    case 1:
                                        int i35 = b0.f189732f;
                                        b0Var4.e("ABOUT_EFFORT_LEVEL_ACTION");
                                        break;
                                    default:
                                        int i36 = b0.f189732f;
                                        b0Var4.e("ABOUT_RIDING_POSITION_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar13.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            final int i210 = z14 ? 1 : 0;
                            objQ13 = new e23.a() { // from class: xa1.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i30 = i210;
                                    b0 b0Var4 = b0Var3;
                                    switch (i30) {
                                        case 0:
                                            int i34 = b0.f189732f;
                                            b0Var4.e("ABOUT_POWER_GUIDE_ACTION");
                                            break;
                                        case 1:
                                            int i35 = b0.f189732f;
                                            b0Var4.e("ABOUT_EFFORT_LEVEL_ACTION");
                                            break;
                                        default:
                                            int i36 = b0.f189732f;
                                            b0Var4.e("ABOUT_RIDING_POSITION_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar13.K(objQ13);
                        }
                    }
                    rVar4.B(R.string.about_power_guide_help_title, null, false, (e23.a) objQ13, mVar13, 0, 6);
                    boolean zR10 = mVar13.r(b0Var3);
                    Object objQ14 = mVar13.q();
                    if (zR10) {
                        objQ14 = new e23.a() { // from class: xa1.a0
                            @Override // e23.a
                            public final Object invoke() {
                                int i30 = iCompare;
                                b0 b0Var4 = b0Var3;
                                switch (i30) {
                                    case 0:
                                        int i34 = b0.f189732f;
                                        b0Var4.e("ABOUT_POWER_GUIDE_ACTION");
                                        break;
                                    case 1:
                                        int i35 = b0.f189732f;
                                        b0Var4.e("ABOUT_EFFORT_LEVEL_ACTION");
                                        break;
                                    default:
                                        int i36 = b0.f189732f;
                                        b0Var4.e("ABOUT_RIDING_POSITION_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar13.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new e23.a() { // from class: xa1.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i30 = iCompare;
                                    b0 b0Var4 = b0Var3;
                                    switch (i30) {
                                        case 0:
                                            int i34 = b0.f189732f;
                                            b0Var4.e("ABOUT_POWER_GUIDE_ACTION");
                                            break;
                                        case 1:
                                            int i35 = b0.f189732f;
                                            b0Var4.e("ABOUT_EFFORT_LEVEL_ACTION");
                                            break;
                                        default:
                                            int i36 = b0.f189732f;
                                            b0Var4.e("ABOUT_RIDING_POSITION_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar13.K(objQ14);
                        }
                    }
                    rVar4.B(R.string.power_guide_effort_level_title, null, false, (e23.a) objQ14, mVar13, 0, 6);
                    boolean zR11 = mVar13.r(b0Var3);
                    Object objQ15 = mVar13.q();
                    if (zR11) {
                        objQ15 = new e23.a() { // from class: xa1.a0
                            @Override // e23.a
                            public final Object invoke() {
                                int i30 = i16;
                                b0 b0Var4 = b0Var3;
                                switch (i30) {
                                    case 0:
                                        int i34 = b0.f189732f;
                                        b0Var4.e("ABOUT_POWER_GUIDE_ACTION");
                                        break;
                                    case 1:
                                        int i35 = b0.f189732f;
                                        b0Var4.e("ABOUT_EFFORT_LEVEL_ACTION");
                                        break;
                                    default:
                                        int i36 = b0.f189732f;
                                        b0Var4.e("ABOUT_RIDING_POSITION_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar13.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new e23.a() { // from class: xa1.a0
                                @Override // e23.a
                                public final Object invoke() {
                                    int i30 = i16;
                                    b0 b0Var4 = b0Var3;
                                    switch (i30) {
                                        case 0:
                                            int i34 = b0.f189732f;
                                            b0Var4.e("ABOUT_POWER_GUIDE_ACTION");
                                            break;
                                        case 1:
                                            int i35 = b0.f189732f;
                                            b0Var4.e("ABOUT_EFFORT_LEVEL_ACTION");
                                            break;
                                        default:
                                            int i36 = b0.f189732f;
                                            b0Var4.e("ABOUT_RIDING_POSITION_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar13.K(objQ15);
                        }
                    }
                    rVar4.B(R.string.lbl_riding_position, null, false, (e23.a) objQ15, mVar13, 0, 6);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 24:
                ve1.b bVar5 = (ve1.b) obj7;
                Integer num = (Integer) obj6;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    String str4 = bVar5.f177672c;
                    if (str4 == null) {
                        mVar14.C(1313852396);
                        mVar14.f();
                        d0VarA = null;
                    } else {
                        mVar14.C(1313852397);
                        long jA = af1.f.a(af1.e.valueOf(str4), mVar14);
                        mVar14.f();
                        d0VarA = d0.a(jA);
                    }
                    if (d0VarA == null) {
                        mVar14.C(1313934019);
                        mVar14.f();
                    } else {
                        mVar14.C(1313934020);
                        long j8 = d0VarA.f128833a;
                        String strValueOf = String.valueOf(bVar5.f177671b.intValue());
                        if (num == null) {
                            mVar14.C(-2045154290);
                        } else {
                            mVar14.C(-2045079735);
                            strQ = y.Q(mVar14, num.intValue());
                        }
                        mVar14.f();
                        xe1.j.b(0, j8, strValueOf, strQ, mVar14);
                        mVar14.f();
                    }
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 25:
                qe1.k kVar = (qe1.k) obj7;
                Integer num2 = (Integer) obj6;
                p3.m mVar15 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    String str5 = kVar.f144561d;
                    if (str5 == null) {
                        mVar15.C(502663496);
                        mVar15.f();
                        d0VarA2 = null;
                    } else {
                        mVar15.C(502663497);
                        long jA2 = af1.f.a(af1.e.valueOf(str5), mVar15);
                        mVar15.f();
                        d0VarA2 = d0.a(jA2);
                    }
                    if (d0VarA2 == null) {
                        mVar15.C(502744468);
                        mVar15.f();
                    } else {
                        mVar15.C(502744469);
                        long j14 = d0VarA2.f128833a;
                        String strValueOf2 = String.valueOf(kVar.f144560c);
                        if (num2 == null) {
                            mVar15.C(520565670);
                        } else {
                            mVar15.C(520640225);
                            strQ = y.Q(mVar15, num2.intValue());
                        }
                        mVar15.f();
                        xe1.j.b(0, j14, strValueOf2, strQ, mVar15);
                        mVar15.f();
                    }
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 26:
                h82.r rVar5 = (h82.r) obj7;
                final xh1.h hVar = (xh1.h) obj6;
                p3.m mVar16 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                int i30 = xh1.h.f191064f;
                if (mVar16.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    boolean zR12 = mVar16.r(hVar);
                    Object objQ16 = mVar16.q();
                    if (zR12) {
                        objQ16 = new e23.a() { // from class: xh1.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i34 = iCompare;
                                h hVar2 = hVar;
                                switch (i34) {
                                    case 0:
                                        int i35 = h.f191064f;
                                        hVar2.e("DETERMINING_ACTION");
                                        break;
                                    default:
                                        int i36 = h.f191064f;
                                        hVar2.e("READINGS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar16.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new e23.a() { // from class: xh1.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i34 = iCompare;
                                    h hVar2 = hVar;
                                    switch (i34) {
                                        case 0:
                                            int i35 = h.f191064f;
                                            hVar2.e("DETERMINING_ACTION");
                                            break;
                                        default:
                                            int i36 = h.f191064f;
                                            hVar2.e("READINGS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar16.K(objQ16);
                        }
                    }
                    rVar5.B(R.string.lbl_what_is_css, null, false, (e23.a) objQ16, mVar16, 0, 6);
                    boolean zR13 = mVar16.r(hVar);
                    Object objQ17 = mVar16.q();
                    if (zR13) {
                        final int i34 = z14 ? 1 : 0;
                        objQ17 = new e23.a() { // from class: xh1.f
                            @Override // e23.a
                            public final Object invoke() {
                                int i35 = i34;
                                h hVar2 = hVar;
                                switch (i35) {
                                    case 0:
                                        int i36 = h.f191064f;
                                        hVar2.e("DETERMINING_ACTION");
                                        break;
                                    default:
                                        int i37 = h.f191064f;
                                        hVar2.e("READINGS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar16.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            final int i35 = z14 ? 1 : 0;
                            objQ17 = new e23.a() { // from class: xh1.f
                                @Override // e23.a
                                public final Object invoke() {
                                    int i36 = i35;
                                    h hVar2 = hVar;
                                    switch (i36) {
                                        case 0:
                                            int i37 = h.f191064f;
                                            hVar2.e("DETERMINING_ACTION");
                                            break;
                                        default:
                                            int i38 = h.f191064f;
                                            hVar2.e("READINGS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar16.K(objQ17);
                        }
                    }
                    rVar5.B(R.string.lbl_determine_css, null, false, (e23.a) objQ17, mVar16, 0, 6);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 27:
                return a(obj, obj2);
            case 28:
                return b(obj, obj2);
            default:
                h82.r rVar6 = (h82.r) obj7;
                final xk1.n nVar = (xk1.n) obj6;
                p3.m mVar17 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                int i36 = xk1.n.f191265j;
                if (mVar17.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    boolean zR14 = mVar17.r(nVar);
                    Object objQ18 = mVar17.q();
                    if (zR14) {
                        final int i37 = z14 ? 1 : 0;
                        objQ18 = new e23.a() { // from class: xk1.m
                            @Override // e23.a
                            public final Object invoke() {
                                int i38 = i37;
                                n nVar2 = nVar;
                                switch (i38) {
                                    case 0:
                                        int i39 = n.f191265j;
                                        nVar2.e("RUNNING_ACTION");
                                        break;
                                    case 1:
                                        int i44 = n.f191265j;
                                        nVar2.e("CYCLING_ACTION");
                                        break;
                                    case 2:
                                        int i45 = n.f191265j;
                                        nVar2.e("ROWING_ACTION");
                                        break;
                                    default:
                                        int i46 = n.f191265j;
                                        nVar2.e("WINTER_SPORTS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar17.K(objQ18);
                    } else {
                        aVar.getClass();
                        if (objQ18 == p3.m.a.f135155b) {
                            final int i38 = z14 ? 1 : 0;
                            objQ18 = new e23.a() { // from class: xk1.m
                                @Override // e23.a
                                public final Object invoke() {
                                    int i39 = i38;
                                    n nVar2 = nVar;
                                    switch (i39) {
                                        case 0:
                                            int i310 = n.f191265j;
                                            nVar2.e("RUNNING_ACTION");
                                            break;
                                        case 1:
                                            int i44 = n.f191265j;
                                            nVar2.e("CYCLING_ACTION");
                                            break;
                                        case 2:
                                            int i45 = n.f191265j;
                                            nVar2.e("ROWING_ACTION");
                                            break;
                                        default:
                                            int i46 = n.f191265j;
                                            nVar2.e("WINTER_SPORTS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar17.K(objQ18);
                        }
                    }
                    rVar6.B(R.string.lbl_running_power_zone_help_title1, null, false, (e23.a) objQ18, mVar17, 0, 6);
                    boolean zR15 = mVar17.r(nVar);
                    Object objQ19 = mVar17.q();
                    if (zR15) {
                        objQ19 = new e23.a() { // from class: xk1.m
                            @Override // e23.a
                            public final Object invoke() {
                                int i39 = iCompare;
                                n nVar2 = nVar;
                                switch (i39) {
                                    case 0:
                                        int i310 = n.f191265j;
                                        nVar2.e("RUNNING_ACTION");
                                        break;
                                    case 1:
                                        int i44 = n.f191265j;
                                        nVar2.e("CYCLING_ACTION");
                                        break;
                                    case 2:
                                        int i45 = n.f191265j;
                                        nVar2.e("ROWING_ACTION");
                                        break;
                                    default:
                                        int i46 = n.f191265j;
                                        nVar2.e("WINTER_SPORTS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar17.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            objQ19 = new e23.a() { // from class: xk1.m
                                @Override // e23.a
                                public final Object invoke() {
                                    int i39 = iCompare;
                                    n nVar2 = nVar;
                                    switch (i39) {
                                        case 0:
                                            int i310 = n.f191265j;
                                            nVar2.e("RUNNING_ACTION");
                                            break;
                                        case 1:
                                            int i44 = n.f191265j;
                                            nVar2.e("CYCLING_ACTION");
                                            break;
                                        case 2:
                                            int i45 = n.f191265j;
                                            nVar2.e("ROWING_ACTION");
                                            break;
                                        default:
                                            int i46 = n.f191265j;
                                            nVar2.e("WINTER_SPORTS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar17.K(objQ19);
                        }
                    }
                    rVar6.B(R.string.lbl_cycling_power_zones, null, false, (e23.a) objQ19, mVar17, 0, 6);
                    String strQ4 = y.Q(mVar17, R.string.lbl_rowing_power_zones);
                    boolean zR16 = mVar17.r(nVar);
                    Object objQ20 = mVar17.q();
                    if (zR16) {
                        objQ20 = new e23.a() { // from class: xk1.m
                            @Override // e23.a
                            public final Object invoke() {
                                int i39 = i16;
                                n nVar2 = nVar;
                                switch (i39) {
                                    case 0:
                                        int i310 = n.f191265j;
                                        nVar2.e("RUNNING_ACTION");
                                        break;
                                    case 1:
                                        int i44 = n.f191265j;
                                        nVar2.e("CYCLING_ACTION");
                                        break;
                                    case 2:
                                        int i45 = n.f191265j;
                                        nVar2.e("ROWING_ACTION");
                                        break;
                                    default:
                                        int i46 = n.f191265j;
                                        nVar2.e("WINTER_SPORTS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar17.K(objQ20);
                    } else {
                        aVar.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            objQ20 = new e23.a() { // from class: xk1.m
                                @Override // e23.a
                                public final Object invoke() {
                                    int i39 = i16;
                                    n nVar2 = nVar;
                                    switch (i39) {
                                        case 0:
                                            int i310 = n.f191265j;
                                            nVar2.e("RUNNING_ACTION");
                                            break;
                                        case 1:
                                            int i44 = n.f191265j;
                                            nVar2.e("CYCLING_ACTION");
                                            break;
                                        case 2:
                                            int i45 = n.f191265j;
                                            nVar2.e("ROWING_ACTION");
                                            break;
                                        default:
                                            int i46 = n.f191265j;
                                            nVar2.e("WINTER_SPORTS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar17.K(objQ20);
                        }
                    }
                    rVar6.C(strQ4, null, false, (e23.a) objQ20, mVar17, 0, 6);
                    boolean zR17 = mVar17.r(nVar);
                    Object objQ21 = mVar17.q();
                    if (zR17) {
                        objQ21 = new e23.a() { // from class: xk1.m
                            @Override // e23.a
                            public final Object invoke() {
                                int i39 = i15;
                                n nVar2 = nVar;
                                switch (i39) {
                                    case 0:
                                        int i310 = n.f191265j;
                                        nVar2.e("RUNNING_ACTION");
                                        break;
                                    case 1:
                                        int i44 = n.f191265j;
                                        nVar2.e("CYCLING_ACTION");
                                        break;
                                    case 2:
                                        int i45 = n.f191265j;
                                        nVar2.e("ROWING_ACTION");
                                        break;
                                    default:
                                        int i46 = n.f191265j;
                                        nVar2.e("WINTER_SPORTS_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar17.K(objQ21);
                    } else {
                        aVar.getClass();
                        if (objQ21 == p3.m.a.f135155b) {
                            objQ21 = new e23.a() { // from class: xk1.m
                                @Override // e23.a
                                public final Object invoke() {
                                    int i39 = i15;
                                    n nVar2 = nVar;
                                    switch (i39) {
                                        case 0:
                                            int i310 = n.f191265j;
                                            nVar2.e("RUNNING_ACTION");
                                            break;
                                        case 1:
                                            int i44 = n.f191265j;
                                            nVar2.e("CYCLING_ACTION");
                                            break;
                                        case 2:
                                            int i45 = n.f191265j;
                                            nVar2.e("ROWING_ACTION");
                                            break;
                                        default:
                                            int i46 = n.f191265j;
                                            nVar2.e("WINTER_SPORTS_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar17.K(objQ21);
                        }
                    }
                    rVar6.B(R.string.lbl_skiing_power_zone_help_title1, null, false, (e23.a) objQ21, mVar17, 0, 6);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i14, int i15) {
        this.f183886a = i15;
        this.f183887b = obj;
        this.f183888c = obj2;
    }

    public /* synthetic */ i(int i14, Object obj, Object obj2) {
        this.f183886a = i14;
        this.f183887b = obj;
        this.f183888c = obj2;
    }
}
