package ng1;

import android.widget.RadioButton;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.devices.TruSwingSpeedSetup;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class z0 implements lj0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TruSwingSpeedSetup f126030a;

    public z0(TruSwingSpeedSetup truSwingSpeedSetup) {
        this.f126030a = truSwingSpeedSetup;
    }

    @Override // lj0.k
    public final void a(lj0.b bVar) {
        TruSwingSpeedSetup truSwingSpeedSetup = this.f126030a;
        truSwingSpeedSetup.hideProgressOverlay();
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching swing speed from GC ["), "].", a2Var, "TruSwingSpeedSetup");
        if (bVar != lj0.b.f112951e) {
            Toast.makeText(truSwingSpeedSetup, R.string.txt_error_occurred, 0).show();
        }
        truSwingSpeedSetup.finish();
    }

    @Override // lj0.k
    public final void b(lj0.e.a aVar) {
        rl0.a aVar2;
        RadioButton radioButton;
        cl0.d dVarL = null;
        try {
            JSONObject jSONObject = new JSONObject((String) aVar.f112977a);
            rl0.a.f153399c.getClass();
            aVar2 = new rl0.a((p005kotlin.jvm.internal.j) null);
            aVar2.k(jSONObject);
        } catch (JSONException e4) {
            lc.u0.v(e4, new StringBuilder("fetchSwingSpeed.onResultsSucceeded: "), a2.SETTINGS, "TruSwingSpeedSetup");
            aVar2 = null;
        }
        if (aVar2 == null) {
            a(lj0.b.f112954h);
            return;
        }
        int i14 = TruSwingSpeedSetup.f42180d;
        TruSwingSpeedSetup truSwingSpeedSetup = this.f126030a;
        truSwingSpeedSetup.getClass();
        String value = aVar2.getValue();
        cl0.d.f27928c.getClass();
        if (value != null) {
            w13.c cVar = cl0.d.f27933h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                cl0.d dVar = (cl0.d) bVarN.next();
                if (p005kotlin.jvm.internal.s.g(dVar.f27934a, value)) {
                    dVarL = dVar;
                    break;
                }
            }
        }
        if (dVarL == null) {
            dVarL = GCMSettingManager.l();
        }
        int i15 = TruSwingSpeedSetup.a.f42184a[dVarL.ordinal()];
        if (i15 == 1) {
            RadioButton radioButton2 = (RadioButton) truSwingSpeedSetup.findViewById(R.id.device_settings_truswing_miles_per_hour);
            if (radioButton2 != null) {
                radioButton2.setChecked(true);
            }
        } else if (i15 == 2) {
            RadioButton radioButton3 = (RadioButton) truSwingSpeedSetup.findViewById(R.id.device_settings_truswing_kilometers_per_hour);
            if (radioButton3 != null) {
                radioButton3.setChecked(true);
            }
        } else if (i15 == 3 && (radioButton = (RadioButton) truSwingSpeedSetup.findViewById(R.id.device_settings_truswing_meters_per_sec)) != null) {
            radioButton.setChecked(true);
        }
        truSwingSpeedSetup.hideProgressOverlay();
    }
}
