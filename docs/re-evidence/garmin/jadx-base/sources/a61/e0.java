package a61;

import c2.t2;
import com.garmin.android.apps.connectmobile.R;
import l72.x0;
import lc.u0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.b f1589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o71.e f1590c;

    public /* synthetic */ e0(o71.e eVar, com.garmin.android.apps.connectmobile.performance.b bVar) {
        this.f1588a = 0;
        this.f1590c = eVar;
        this.f1589b = bVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String strQ;
        String string;
        int i14 = this.f1588a;
        o71.e eVar = this.f1590c;
        com.garmin.android.apps.connectmobile.performance.b bVar = this.f1589b;
        switch (i14) {
            case 0:
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.b.a aVar = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    Double dH = eVar.h();
                    if (dH == null || p005kotlin.jvm.internal.s.c(dH, 0.0d)) {
                        mVar.C(-581674606);
                        mVar.f();
                        str = null;
                    } else {
                        mVar.C(-18764916);
                        String strQ2 = gl1.y.Q(mVar, com.garmin.android.apps.connectmobile.performance.b.i());
                        mVar.f();
                        str = strQ2;
                    }
                    Double dC = eVar.c();
                    if (dC == null || p005kotlin.jvm.internal.s.c(dC, 0.0d)) {
                        mVar.C(-581515886);
                        mVar.f();
                        strQ = null;
                    } else {
                        mVar.C(-18759796);
                        strQ = gl1.y.Q(mVar, com.garmin.android.apps.connectmobile.performance.b.i());
                        mVar.f();
                    }
                    int i15 = com.garmin.android.apps.connectmobile.performance.b.C0732b.f39872a[bVar.f39857d.ordinal()];
                    if (i15 == 1 || i15 == 2 || i15 == 3) {
                        string = bVar.g().getString(R.string.lbl_daily_volume);
                    } else if (i15 == 4) {
                        string = bVar.g().getString(R.string.lbl_avg_weekly_volume);
                    } else {
                        if (i15 != 5) {
                            u0.r();
                            return null;
                        }
                        string = bVar.g().getString(R.string.lbl_avg_monthly_volume);
                    }
                    string.getClass();
                    x0 x0Var = x0.f111346a;
                    String strE = ss.f.e(bVar.g(), eVar.h(), false, false);
                    String strQ3 = gl1.y.Q(mVar, R.string.strength_training_total_volume_label);
                    int i16 = (iIntValue & 14) | (x0.f111348c << 24);
                    x0Var.a(i16, 116, null, t2Var, null, null, strE, strQ3, str, null, mVar);
                    x0Var.a(i16, 116, null, t2Var, null, null, ss.f.e(bVar.g(), eVar.c(), false, false), string, strQ, null, mVar);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                t2 t2Var2 = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.b.a aVar2 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                t2Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var2 = x0.f111346a;
                    String strC = bVar.c(eVar.f());
                    strC.getClass();
                    String strQ4 = gl1.y.Q(mVar2, R.string.strength_training_total_reps_label);
                    int i17 = iIntValue2 & 14;
                    int i18 = x0.f111348c;
                    x0Var2.a((i18 << 24) | i17, 124, null, t2Var2, null, null, strC, strQ4, null, null, mVar2);
                    x0Var2.h(t2Var2, mVar2, (i18 << 3) | i17);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                t2 t2Var3 = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.performance.b.a aVar3 = com.garmin.android.apps.connectmobile.performance.b.f39852t;
                t2Var3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(t2Var3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i19 = iIntValue3;
                    x0 x0Var3 = x0.f111346a;
                    String strD = bVar.d(eVar.g());
                    strD.getClass();
                    String strQ5 = gl1.y.Q(mVar3, R.string.strength_training_total_sets_label);
                    int i24 = i19 & 14;
                    int i25 = x0.f111348c;
                    x0Var3.a(i24 | (i25 << 24), 124, null, t2Var3, null, null, strD, strQ5, null, null, mVar3);
                    x0Var3.h(t2Var3, mVar3, (i25 << 3) | i24);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e0(com.garmin.android.apps.connectmobile.performance.b bVar, o71.e eVar, int i14) {
        this.f1588a = i14;
        this.f1589b = bVar;
        this.f1590c = eVar;
    }
}
