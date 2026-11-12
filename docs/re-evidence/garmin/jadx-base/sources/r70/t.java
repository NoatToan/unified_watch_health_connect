package r70;

import androidx.lifecycle.v1;
import c22.i2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import n70.c6;
import n70.d7;
import n70.m7;
import n70.p1;
import n70.x5;
import n70.z2;
import org.joda.time.DateTime;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class t implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.presentation.d f151097b;

    public /* synthetic */ t(com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar, int i14) {
        this.f151096a = i14;
        this.f151097b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    @Override // e23.a
    public final Object invoke() {
        p1.a aVar;
        sd2.f fVar;
        int i14 = this.f151096a;
        com.garmin.android.apps.connectmobile.dashboard.presentation.d dVar = this.f151097b;
        switch (i14) {
            case 0:
                o70.s sVar = o70.s.PULL_TO_REFRESH;
                int i15 = com.garmin.android.apps.connectmobile.dashboard.presentation.d.P;
                dVar.z4(sVar, false);
                return Unit.INSTANCE;
            case 1:
                int i16 = com.garmin.android.apps.connectmobile.dashboard.presentation.d.P;
                return (z2) KoinJavaComponent.get$default(z2.class, null, new t(dVar, 3), 2, null);
            case 2:
                d7 d7Var = dVar.f33549f;
                if (!d7Var.f124153c) {
                    d7Var.f124153c = true;
                    i2 i2Var = d7Var.f124151a;
                    DateTime dateTimeNow = DateTime.now();
                    dateTimeNow.getClass();
                    i2Var.c(dateTimeNow);
                    a2 a2Var = a2.DASHBOARD;
                    String str = "startLoading - " + DateTime.now();
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "LogAnalyticsUseCase", str);
                }
                return Unit.INSTANCE;
            case 3:
                int i17 = com.garmin.android.apps.connectmobile.dashboard.presentation.d.P;
                return ParametersHolderKt.parametersOf(v1.a(dVar));
            case 4:
                ((ic0.a) ((z2) dVar.f33554k.getValue()).f124810i.getValue()).b();
                return Unit.INSTANCE;
            case 5:
                int i18 = com.garmin.android.apps.connectmobile.dashboard.presentation.d.P;
                dVar.y4("DeviceMenuOpen", null);
                return Unit.INSTANCE;
            case 6:
                int i19 = com.garmin.android.apps.connectmobile.dashboard.presentation.d.P;
                dVar.y4("QuickActionOpen", null);
                return Unit.INSTANCE;
            default:
                o70.a0 a0Var = (o70.a0) dVar.f33560q.f150540a.getValue();
                if (a0Var != null && (aVar = a0Var.f129912a) != null && (fVar = aVar.f124475b.f34316a) != null) {
                    c6 c6Var = dVar.f33545b;
                    c6Var.getClass();
                    x5 x5Var = c6Var.f124114c;
                    p2 p2Var = x5Var.f124751h;
                    p2Var.k(null, Boolean.TRUE);
                    m7 m7Var = x5Var.f124747d;
                    mh1.x xVar = new mh1.x(x5Var, 21);
                    l80.b bVar = m7Var.f124417b;
                    if (!hb2.i.a(m7Var.f124416a)) {
                        p2Var.k(null, Boolean.FALSE);
                    } else if (km2.a.e(new int[]{SupportedCapability.HOST_INITIATED_SYNC_REQUESTS.ordinal(), SupportedCapability.SYNC_2.ordinal()}, fVar.getUnitID()) && bVar.e(fVar) && !bVar.h(fVar.getUnitID())) {
                        yr1.d.d(fVar, "TriggerSyncNowUseCase", xVar);
                    } else {
                        p2Var.k(null, Boolean.FALSE);
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
