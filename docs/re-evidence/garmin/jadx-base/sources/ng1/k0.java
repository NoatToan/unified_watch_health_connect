package ng1;

import android.os.Bundle;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k0 extends p implements Observer {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f125956m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f125957n = false;

    public static void ga(k0 k0Var, ArrayList arrayList, DeviceSettingsDTO deviceSettingsDTO, k0 k0Var2) {
        if (deviceSettingsDTO == null || arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fb2.e eVar = (fb2.e) it.next();
            boolean zG = eVar.g(k0Var, deviceSettingsDTO);
            eVar.addObserver(k0Var2);
            eVar.m(zG);
        }
    }

    public static void ia(List<fb2.e> list, DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO == null || list == null) {
            return;
        }
        for (fb2.e eVar : list) {
            eVar.m(eVar.k(deviceSettingsDTO));
        }
    }

    public void ea() {
        this.f125956m.clear();
    }

    public void fa() {
        for (fb2.e eVar : this.f125956m) {
            i2.k(a2.SETTINGS, "DynamicDeviceSettings", "Initializing: " + eVar.toString());
            eVar.m(eVar.g(this, new Object()));
            eVar.addObserver(this);
            eVar.l(true);
        }
    }

    public void ha() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        linearLayout.addView(fb2.g.a(this));
        Iterator it = this.f125956m.iterator();
        while (it.hasNext()) {
            linearLayout.addView(((fb2.e) it.next()).a());
        }
        linearLayout.addView(fb2.g.a(this));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public void onBackPressed() {
        if (ca()) {
            super.onBackPressed();
        } else {
            da();
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_dynamic_content);
        initActionBar(true, getString(R.string.lbl_settings));
        this.f125957n = getIntent().getBooleanExtra("GCM_low_hr_alert_capable", false);
        ea();
        fa();
        ha();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f125956m;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fb2.e) it.next()).n();
            }
        }
        arrayList.clear();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }
}
