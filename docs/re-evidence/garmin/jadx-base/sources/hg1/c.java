package hg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.activityoptions.GCMBaseRunOptionsSettingsSetup;

/* JADX INFO: loaded from: classes10.dex */
public class c implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GCMBaseRunOptionsSettingsSetup f83675a;

    public c(GCMBaseRunOptionsSettingsSetup gCMBaseRunOptionsSettingsSetup) {
        this.f83675a = gCMBaseRunOptionsSettingsSetup;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "GCMBaseRunOptionsSettingsSetup");
        lj0.b bVar2 = lj0.b.f112951e;
        GCMBaseRunOptionsSettingsSetup gCMBaseRunOptionsSettingsSetup = this.f83675a;
        if (bVar != bVar2) {
            Toast.makeText(gCMBaseRunOptionsSettingsSetup, R.string.txt_error_occurred, 0).show();
        }
        gCMBaseRunOptionsSettingsSetup.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        GCMBaseRunOptionsSettingsSetup gCMBaseRunOptionsSettingsSetup = this.f83675a;
        gCMBaseRunOptionsSettingsSetup.f41652c = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (obj == null) {
            a(lj0.b.f112956j);
            return;
        }
        gCMBaseRunOptionsSettingsSetup.hideProgressOverlay();
        if (gCMBaseRunOptionsSettingsSetup.f41652c.f34132b.containsKey("sportType")) {
            com.garmin.android.apps.connectmobile.devices.model.f fVar = gCMBaseRunOptionsSettingsSetup.f41652c;
            if ((fVar.f34132b.containsKey("sportType") ? (Integer) fVar.f34132b.get("sportType") : null).equals(0)) {
                gCMBaseRunOptionsSettingsSetup.f41652c.A1(null, "sportType");
                gCMBaseRunOptionsSettingsSetup.f41652c.A1(null, "subSportType");
                gCMBaseRunOptionsSettingsSetup.f41652c.y1("sport", "Running");
                gCMBaseRunOptionsSettingsSetup.f41652c.A1(null, "subSport");
            }
        }
        gCMBaseRunOptionsSettingsSetup.ca();
    }
}
