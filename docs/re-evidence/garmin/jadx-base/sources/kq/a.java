package kq;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f106042b;

    public /* synthetic */ a(b bVar, int i14) {
        this.f106041a = i14;
        this.f106042b = bVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f106041a;
        b bVar = this.f106042b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = b.f106046f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    bVar.g(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = b.f106046f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    bVar.g(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = b.f106046f;
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
                    rVar.o(R.string.activities_avg_heart_rate_help_description, i19, 2, null, mVar3);
                    rVar.t(R.string.max_heart_rate, mVar3, i18);
                    rVar.o(R.string.activities_max_heart_rate_help_description, i19, 2, null, mVar3);
                    if (p005kotlin.jvm.internal.s.g(bVar.f82432c, "INCLUDING_RECOVERY_HR")) {
                        mVar3.C(-414950787);
                        rVar.t(R.string.activity_details_recovery_heart_rate, mVar3, i18);
                        rVar.o(R.string.activities_recovery_heart_rate_help_description, i19, 2, null, mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(-414771080);
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
