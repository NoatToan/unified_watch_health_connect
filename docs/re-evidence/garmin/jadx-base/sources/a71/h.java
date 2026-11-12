package a71;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.trainingload.e f1773b;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.performance.trainingload.e eVar, int i14) {
        this.f1772a = i14;
        this.f1773b = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1772a;
        com.garmin.android.apps.connectmobile.performance.trainingload.e eVar = this.f1773b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.trainingload.e.a aVar = com.garmin.android.apps.connectmobile.performance.trainingload.e.f40217t;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-102716459, new h(eVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.trainingload.e.a aVar2 = com.garmin.android.apps.connectmobile.performance.trainingload.e.f40217t;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String string = eVar.getString(R.string.msg_no_data_available);
                    String string2 = eVar.getString(R.string.ts_acute_load_feedback_none);
                    string2.getClass();
                    b82.n.c(null, string, string2, null, null, mVar2, 0, 25);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
