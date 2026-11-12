package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import ch1.f5;
import ch1.t5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class VivoActive3BacklightDisplayActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42185a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsDTO f42186b;

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42186b);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        StringBuilder sbJ = e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data=");
        sbJ.append(intent);
        i2.l("AutoOnDisplayActivity", sbJ.toString());
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f42185a) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
                this.f42186b = deviceSettingsDTO;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42186b = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
            String string = (String) extras.get("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(string)) {
                string = getString(R.string.device_setting_display_options);
            }
            initActionBar(true, string);
        }
        if (this.f42186b == null) {
            finish();
            return;
        }
        ArrayList<fb2.e> arrayList = this.f42185a;
        arrayList.clear();
        arrayList.add(new f5(this));
        arrayList.add(new t5(this, true));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : arrayList) {
            if (eVar instanceof t5) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(eVar.a());
            } else {
                linearLayout.addView(eVar.a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
        for (fb2.e eVar2 : arrayList) {
            boolean zG = eVar2.g(this, this.f42186b);
            eVar2.addObserver(this);
            eVar2.m(zG);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42185a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
    }
}
