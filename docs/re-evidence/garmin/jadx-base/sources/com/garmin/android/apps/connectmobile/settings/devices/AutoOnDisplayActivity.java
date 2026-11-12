package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch1.i1;
import ch1.t5;
import ch1.u5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import n23.j;

/* JADX INFO: loaded from: classes10.dex */
public class AutoOnDisplayActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f41889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41890b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41891c = View.generateViewId();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41892d = false;

    public static void da(com.garmin.android.apps.connectmobile.c cVar, DeviceSettingsDTO deviceSettingsDTO, String str) {
        Intent intent = new Intent(cVar, (Class<?>) AutoOnDisplayActivity.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", str);
        cVar.startActivityForResult(intent, 10);
    }

    public void ca() {
        ArrayList arrayList = this.f41890b;
        arrayList.clear();
        arrayList.add(new u5(this));
        arrayList.add(new t5(this, this.f41892d));
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f41889a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "AutoOnDisplayActivity");
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f41890b) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
                this.f41889a = deviceSettingsDTO;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i14;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        if (getIntent().getExtras() != null) {
            this.f41889a = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            this.f41892d = getIntent().getBooleanExtra("GCM_gesturesValues", false);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_display_options);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f41889a == null) {
            finish();
            return;
        }
        ca();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        ArrayList<fb2.e> arrayList = this.f41890b;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i14 = this.f41891c;
            if (!zHasNext) {
                break;
            }
            fb2.e eVar = (fb2.e) it.next();
            if ((eVar instanceof t5) || (eVar instanceof i1)) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(eVar.a());
                TextView textViewC = fb2.g.c(this, "dummy_text");
                textViewC.setId(i14);
                linearLayout.addView(textViewC);
            } else {
                linearLayout.addView(eVar.a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
        for (fb2.e eVar2 : arrayList) {
            boolean zG = eVar2.g(this, this.f41889a);
            eVar2.addObserver(this);
            eVar2.m(zG);
        }
        ((TextView) findViewById(i14)).setText(R.string.auto_on_display_gesture_footer);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f41890b;
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
