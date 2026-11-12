package fb1;

import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o f70259b;

    public /* synthetic */ k0(com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar, int i14) {
        this.f70258a = i14;
        this.f70259b = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f70258a;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o oVar = this.f70259b;
        switch (i14) {
            case 0:
                fw.m mVar = (fw.m) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                if (mVar != null) {
                    oVar.w6((db1.s) mVar.f73770c);
                }
                break;
            default:
                cx0.a aVar2 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.a aVar3 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.o.E;
                g22.e.f(oVar);
                if (aVar2 != null) {
                    if (aVar2.f56599a != 0) {
                        oVar.C6();
                        oVar.v6().D4(oVar.u6(), oVar.f40771y);
                    } else if (!aVar2.f56602d) {
                        Integer num = aVar2.f56601c;
                        if (num != null && num.intValue() == 412) {
                            oVar.v6().D4(oVar.u6(), oVar.f40771y);
                            DataStorageConsentActivity.a aVar4 = DataStorageConsentActivity.f32194t;
                            androidx.fragment.app.m mVarRequireActivity = oVar.requireActivity();
                            mVarRequireActivity.getClass();
                            DataStorageConsentActivity.a.c(aVar4, mVarRequireActivity);
                        }
                        aVar2.f56602d = true;
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
