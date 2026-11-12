package ty1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.d f167215b;

    public /* synthetic */ q(com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar, int i14) {
        this.f167214a = i14;
        this.f167215b = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167214a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar = this.f167215b;
        switch (i14) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                jy1.b bVar = dVar.f45890b;
                androidx.fragment.app.m mVarRequireActivity = dVar.requireActivity();
                mVarRequireActivity.getClass();
                bVar.w(mVarRequireActivity, jLongValue, String.valueOf(jLongValue2));
                break;
            case 1:
                long jLongValue3 = ((Long) obj).longValue();
                long jLongValue4 = ((Long) obj2).longValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                jy1.b bVar2 = dVar.f45890b;
                androidx.fragment.app.m mVarRequireActivity2 = dVar.requireActivity();
                mVarRequireActivity2.getClass();
                bVar2.w(mVarRequireActivity2, jLongValue3, String.valueOf(jLongValue4));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                dVar.A6((p3.m) obj, p3.p0.t(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                dVar.v6((p3.m) obj, p3.p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.d.f45888e;
                dVar.y6((p3.m) obj, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q(com.garmin.android.apps.connectmobile.traininginitiative.ui.d dVar, int i14, int i15) {
        this.f167214a = i15;
        this.f167215b = dVar;
    }
}
