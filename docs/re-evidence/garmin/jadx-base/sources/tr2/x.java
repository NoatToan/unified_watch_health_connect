package tr2;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class x implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.ui.userwallet.e f166186b;

    public /* synthetic */ x(com.garmin.feature.garminpay.ui.userwallet.e eVar, int i14) {
        this.f166185a = i14;
        this.f166186b = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f166185a;
        com.garmin.feature.garminpay.ui.userwallet.e eVar = this.f166186b;
        switch (i14) {
            case 0:
                com.garmin.feature.garminpay.ui.userwallet.e.a aVar = com.garmin.feature.garminpay.ui.userwallet.e.f52303k;
                return eVar;
            default:
                com.garmin.feature.garminpay.ui.userwallet.e.a aVar2 = com.garmin.feature.garminpay.ui.userwallet.e.f52303k;
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                Context contextRequireContext = eVar.requireContext();
                contextRequireContext.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.APPROVED;
                cVar.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(contextRequireContext, aVar3, null);
                return Unit.INSTANCE;
        }
    }
}
