package ng1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup;

/* JADX INFO: loaded from: classes10.dex */
public class a implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityTrackerSetup f125906a;

    public a(ActivityTrackerSetup activityTrackerSetup) {
        this.f125906a = activityTrackerSetup;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device registration status from GC ["), "].", a2Var, "ActivityTrackerSetup");
        boolean zA = bVar.a();
        int i14 = ActivityTrackerSetup.f41772n;
        ActivityTrackerSetup activityTrackerSetup = this.f125906a;
        activityTrackerSetup.displayFailedMessage(zA);
        activityTrackerSetup.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        ActivityTrackerSetup activityTrackerSetup = this.f125906a;
        activityTrackerSetup.f41784l = (com.garmin.android.apps.connectmobile.devices.model.n) obj;
        if (obj == null) {
            a(lj0.b.f112956j);
        }
        activityTrackerSetup.f41778f.incrementAndGet();
        activityTrackerSetup.ea();
    }
}
