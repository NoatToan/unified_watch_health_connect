package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.devices.TruSwingSpeedSetup;

/* JADX INFO: loaded from: classes10.dex */
public class a1 implements lj0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TruSwingSpeedSetup f125908a;

    public a1(TruSwingSpeedSetup truSwingSpeedSetup) {
        this.f125908a = truSwingSpeedSetup;
    }

    @Override // lj0.k
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving swing speed to GC ["), "].", a2Var, "TruSwingSpeedSetup");
        lj0.b bVar2 = lj0.b.f112951e;
        TruSwingSpeedSetup truSwingSpeedSetup = this.f125908a;
        if (bVar != bVar2) {
            Toast.makeText(truSwingSpeedSetup, R.string.txt_error_occurred, 0).show();
        }
        truSwingSpeedSetup.finish();
    }

    @Override // lj0.k
    public final void b(lj0.e.a aVar) {
        TruSwingSpeedSetup truSwingSpeedSetup = this.f125908a;
        cl0.d dVar = truSwingSpeedSetup.f42181a;
        if (dVar != null) {
            GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_user_golf_swing_speed_unit), dVar.name()).apply();
        }
        truSwingSpeedSetup.finish();
    }
}
