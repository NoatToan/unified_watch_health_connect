package ty1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.v f167159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f167160c;

    public /* synthetic */ k1(com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar, boolean z14, int i14) {
        this.f167158a = 2;
        this.f167159b = vVar;
        this.f167160c = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167158a;
        boolean z14 = this.f167160c;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar = this.f167159b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    vVar.A6(z14, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    vVar.A6(z14, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                vVar.A6(z14, mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ k1(com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar, boolean z14, int i14, byte b14) {
        this.f167158a = i14;
        this.f167159b = vVar;
        this.f167160c = z14;
    }
}
