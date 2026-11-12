package ng1;

import com.garmin.android.apps.connectmobile.a2;

/* JADX INFO: loaded from: classes10.dex */
public class n implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.a f125972a;

    public n(com.garmin.android.apps.connectmobile.settings.devices.a aVar) {
        this.f125972a = aVar;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
        boolean zA = bVar.a();
        int i14 = com.garmin.android.apps.connectmobile.settings.devices.a.Z0;
        com.garmin.android.apps.connectmobile.settings.devices.a aVar = this.f125972a;
        aVar.displayFailedMessage(zA);
        aVar.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        com.garmin.android.apps.connectmobile.settings.devices.a aVar2 = this.f125972a;
        aVar2.f42510z = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (obj == null) {
            a(lj0.b.f112956j);
        } else {
            aVar2.na();
        }
    }
}
