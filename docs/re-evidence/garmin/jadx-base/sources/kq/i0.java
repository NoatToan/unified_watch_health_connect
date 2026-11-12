package kq;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import l72.v1;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f106086b;

    public /* synthetic */ i0(j0 j0Var, int i14) {
        this.f106085a = i14;
        this.f106086b = j0Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f106085a;
        j0 j0Var = this.f106086b;
        final int i15 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i16 = j0.f106090g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    j0Var.g(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                final h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i17 = j0.f106090g;
                rVar.getClass();
                final int i18 = 2;
                final int i19 = 4;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    Object objQ = mVar2.q();
                    p3.m.f135153a.getClass();
                    Object obj4 = p3.m.a.f135155b;
                    if (objQ == obj4) {
                        objQ = new kn1.m(4);
                        mVar2.K(objQ);
                    }
                    p002j6.c.b((e23.l) objQ, rVarF, null, mVar2, 54, 4);
                    int i24 = (iIntValue2 << 6) & 896;
                    rVar.l(R.string.activity_details_power_phase_detailed, i24, 2, null, mVar2);
                    com.garmin.android.apps.connectmobile.activities.newmodel.o.c cVar = j0Var.f106091f;
                    if (cVar == null) {
                        mVar2.C(998057431);
                        mVar2.f();
                    } else {
                        mVar2.C(998057432);
                        String strH = j0.h(cVar.f29605a);
                        String strH2 = j0.h(cVar.f29606b);
                        String strH3 = j0.h(cVar.f29607c);
                        final s5.c cVarC = v1.c(gl1.y.P(R.string.activity_details_left_power_phase_stats, new Object[]{strH, strH2, strH3}, mVar2), new String[]{strH, strH2, strH3}, mVar2);
                        final int i25 = 3;
                        int i26 = ((iIntValue2 << 3) & 112) | 6;
                        rVar.j(z3.f.c(1146565629, new e23.p() { // from class: kq.h0
                            @Override // e23.p
                            public final Object invoke(Object obj5, Object obj6) {
                                int i27 = i18;
                                s5.c cVar2 = cVarC;
                                h82.r rVar2 = rVar;
                                p3.m mVar3 = (p3.m) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                switch (i27) {
                                    case 0:
                                        int i28 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        int i29 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_left_right_balance_help, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 2:
                                        int i30 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 3:
                                        int i34 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    default:
                                        int i35 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var7 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, i26);
                        String strH4 = j0.h(cVar.f29611g);
                        String strH5 = j0.h(cVar.f29612h);
                        String strH6 = j0.h(cVar.f29613i);
                        final s5.c cVarC2 = v1.c(gl1.y.P(R.string.activity_details_right_power_phase_stats, new Object[]{strH4, strH5, strH6}, mVar2), new String[]{strH4, strH5, strH6}, mVar2);
                        rVar.j(z3.f.c(-1553244364, new e23.p() { // from class: kq.h0
                            @Override // e23.p
                            public final Object invoke(Object obj5, Object obj6) {
                                int i27 = i25;
                                s5.c cVar2 = cVarC2;
                                h82.r rVar2 = rVar;
                                p3.m mVar3 = (p3.m) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                switch (i27) {
                                    case 0:
                                        int i28 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        int i29 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_left_right_balance_help, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 2:
                                        int i30 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 3:
                                        int i34 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    default:
                                        int i35 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var7 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, i26);
                        g6.f.a aVar2 = g6.f.f75994b;
                        c2.l.f(c2.l.C(aVar, 0.0f, 24, 0.0f, 0.0f, 13), mVar2);
                        h4.r rVarF2 = x2.f(aVar, 1.0f);
                        Object objQ2 = mVar2.q();
                        if (objQ2 == obj4) {
                            objQ2 = new kn1.m(5);
                            mVar2.K(objQ2);
                        }
                        p002j6.c.b((e23.l) objQ2, rVarF2, null, mVar2, 54, 4);
                        rVar.l(R.string.activity_details_peak_power_phase_detail, i24, 2, null, mVar2);
                        String strH7 = j0.h(cVar.f29609e);
                        String strH8 = j0.h(cVar.f29610f);
                        String strH9 = j0.h(cVar.f29608d);
                        final s5.c cVarC3 = v1.c(gl1.y.P(R.string.activity_details_left_peak_power_phase_stats, new Object[]{strH7, strH8, strH9}, mVar2), new String[]{strH7, strH8, strH9}, mVar2);
                        rVar.j(z3.f.c(607312181, new e23.p() { // from class: kq.h0
                            @Override // e23.p
                            public final Object invoke(Object obj5, Object obj6) {
                                int i27 = i19;
                                s5.c cVar2 = cVarC3;
                                h82.r rVar2 = rVar;
                                p3.m mVar3 = (p3.m) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                switch (i27) {
                                    case 0:
                                        int i28 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        int i29 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_left_right_balance_help, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 2:
                                        int i30 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 3:
                                        int i34 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    default:
                                        int i35 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var7 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, i26);
                        String strH10 = j0.h(cVar.f29615k);
                        String strH11 = j0.h(cVar.f29616l);
                        String strH12 = j0.h(cVar.f29614j);
                        final s5.c cVarC4 = v1.c(gl1.y.P(R.string.activity_details_right_peak_power_phase_stats, new Object[]{strH10, strH11, strH12}, mVar2), new String[]{strH10, strH11, strH12}, mVar2);
                        rVar.j(z3.f.c(-1527098570, new e23.p() { // from class: kq.h0
                            @Override // e23.p
                            public final Object invoke(Object obj5, Object obj6) {
                                int i27 = i15;
                                s5.c cVar2 = cVarC4;
                                h82.r rVar2 = rVar;
                                p3.m mVar3 = (p3.m) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                switch (i27) {
                                    case 0:
                                        int i28 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        int i29 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_left_right_balance_help, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 2:
                                        int i30 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 3:
                                        int i34 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    default:
                                        int i35 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var7 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, i26);
                        String strH13 = j0.h(cVar.f29617m);
                        String strH14 = j0.h(cVar.f29618n);
                        final s5.c cVarC5 = v1.c(gl1.y.P(R.string.activity_details_left_right_balance_details, new Object[]{strH13, strH14}, mVar2), new String[]{strH13, strH14}, mVar2);
                        final int i27 = 1;
                        rVar.j(z3.f.c(633457975, new e23.p() { // from class: kq.h0
                            @Override // e23.p
                            public final Object invoke(Object obj5, Object obj6) {
                                int i28 = i27;
                                s5.c cVar2 = cVarC5;
                                h82.r rVar2 = rVar;
                                p3.m mVar3 = (p3.m) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                switch (i28) {
                                    case 0:
                                        int i29 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var3 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 1:
                                        int i210 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var4 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_left_right_balance_help, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 2:
                                        int i30 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var5 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    case 3:
                                        int i34 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var6 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_power_phase_right_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                    default:
                                        int i35 = j0.f106090g;
                                        if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            x1 x1Var7 = p3.n.f135158a;
                                            rVar2.t(R.string.activity_details_peak_power_phase_left_pedal, mVar3, 0);
                                            rVar2.r(cVar2, mVar3, 0);
                                        } else {
                                            mVar3.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, i26);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
