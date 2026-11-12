package hg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.activityoptions.GCMRunOptionsSettings;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class e implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GCMRunOptionsSettings f83678a;

    public e(GCMRunOptionsSettings gCMRunOptionsSettings) {
        this.f83678a = gCMRunOptionsSettings;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving device settings to GC ["), "].", a2Var, "GCMRunOptionsSettings");
        lj0.b bVar2 = lj0.b.f112951e;
        GCMRunOptionsSettings gCMRunOptionsSettings = this.f83678a;
        if (bVar != bVar2) {
            Toast.makeText(gCMRunOptionsSettings, R.string.txt_error_occurred, 0).show();
        }
        gCMRunOptionsSettings.hideProgressOverlay();
        gCMRunOptionsSettings.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        GCMRunOptionsSettings gCMRunOptionsSettings = this.f83678a;
        long j8 = gCMRunOptionsSettings.f41665a;
        if (j8 >= 0 && bVar.a(j8)) {
            bVar.n(gCMRunOptionsSettings, gCMRunOptionsSettings.f41665a, "GCMRunOptionsSettings");
        }
        Toast.makeText(gCMRunOptionsSettings, gCMRunOptionsSettings.getText(R.string.msg_settings_saved_successfully), 0).show();
        gCMRunOptionsSettings.hideProgressOverlay();
        gCMRunOptionsSettings.finish();
    }
}
