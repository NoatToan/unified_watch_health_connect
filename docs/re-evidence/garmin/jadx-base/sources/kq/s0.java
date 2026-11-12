package kq;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f106128b;

    public /* synthetic */ s0(t0 t0Var, int i14) {
        this.f106127a = i14;
        this.f106128b = t0Var;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f106127a;
        t0 t0Var = this.f106128b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = t0.f106131f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    t0Var.g(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = t0.f106131f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    t0Var.g(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = t0.f106131f;
                rVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i18 = (iIntValue3 << 3) & 112;
                    rVar.D(R.string.lbl_activity_heart_rate, mVar3, i18);
                    int i19 = (iIntValue3 << 6) & 896;
                    rVar.l(R.string.activities_heart_rate_help_description, i19, 2, null, mVar3);
                    rVar.t(R.string.lbl_average_heart_rate, mVar3, i18);
                    rVar.o(R.string.activities_avg_heart_rate_help_description2, i19, 2, null, mVar3);
                    rVar.t(R.string.max_heart_rate, mVar3, i18);
                    rVar.o(R.string.activities_max_heart_rate_help_description2, i19, 2, null, mVar3);
                    if (p005kotlin.jvm.internal.s.g(t0Var.f82432c, "INCLUDING_RECOVERY_HR")) {
                        mVar3.C(896628285);
                        rVar.t(R.string.activity_details_recovery_heart_rate, mVar3, i18);
                        rVar.o(R.string.activities_recovery_heart_rate_help_description, i19, 2, null, mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(896807992);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
