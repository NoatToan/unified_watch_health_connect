package hn2;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.appbar.AppBarLayout;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f84545b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f84544a = i14;
        this.f84545b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f84544a;
        c cVar = this.f84545b;
        switch (i14) {
            case 0:
                Logger logger = c.f84546f;
                return (AppBarLayout) cVar.findViewById(R.id.app_bar_layout);
            case 1:
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar2 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                cVar2.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(cVar, aVar, null);
                return Unit.INSTANCE;
            case 2:
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                cVar.setResult(12);
                cVar.finish();
                return Unit.INSTANCE;
            case 3:
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar4 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                cVar.setResult(0);
                cVar.finish();
                return Unit.INSTANCE;
            default:
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar2 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.APPROVED;
                cVar5.getClass();
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(cVar, aVar2, null);
                return Unit.INSTANCE;
        }
    }
}
