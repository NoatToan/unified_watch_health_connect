package hg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.activityoptions.WellnessAlertsActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class o implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WellnessAlertsActivity f83719a;

    public o(WellnessAlertsActivity wellnessAlertsActivity) {
        this.f83719a = wellnessAlertsActivity;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving activity options to GC ["), "].", a2Var, "WellnessAlertsActivity");
        lj0.b bVar2 = lj0.b.f112951e;
        WellnessAlertsActivity wellnessAlertsActivity = this.f83719a;
        if (bVar != bVar2) {
            Toast.makeText(wellnessAlertsActivity, R.string.txt_error_occurred, 0).show();
        }
        wellnessAlertsActivity.hideProgressOverlay();
        wellnessAlertsActivity.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        WellnessAlertsActivity wellnessAlertsActivity = this.f83719a;
        long j8 = wellnessAlertsActivity.f41702f;
        if (j8 >= 0 && bVar.a(j8)) {
            bVar.n(wellnessAlertsActivity, wellnessAlertsActivity.f41702f, "WellnessAlertsActivity");
        }
        Toast.makeText(wellnessAlertsActivity, wellnessAlertsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
        wellnessAlertsActivity.hideProgressOverlay();
        wellnessAlertsActivity.finish();
    }
}
