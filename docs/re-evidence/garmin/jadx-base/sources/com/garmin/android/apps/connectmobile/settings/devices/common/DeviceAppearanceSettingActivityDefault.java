package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.j6;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import fb2.g;
import fb2.r;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import n23.j;
import ng1.k0;
import org.koin.java.KoinJavaComponent;
import vg1.z;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceAppearanceSettingActivityDefault extends k0 implements Observer {
    @Override // ng1.k0
    public void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new j6(this));
    }

    @Override // android.app.Activity
    public final void finish() {
        i2.k(a2.SETTINGS, "DeviceAppearanceSettingActivityDefault", "finish()");
        ArrayList arrayList = this.f125956m;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        super.finish();
    }

    @Override // ng1.k0
    public final void ha() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        ArrayList<fb2.e> arrayList = this.f125956m;
        for (fb2.e eVar : arrayList) {
            if (eVar.h(this.f125985k) && !(eVar instanceof r)) {
                linearLayout.addView(g.a(this));
            }
            linearLayout.addView(eVar.a());
        }
        linearLayout.addView(g.a(this));
        for (fb2.e eVar2 : arrayList) {
            boolean zG = eVar2.g(this, this.f125985k);
            eVar2.addObserver(this);
            eVar2.m(zG);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "DeviceAppearanceSettingActivityDefault");
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f125956m) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, getString(R.string.appearance_title));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO != null) {
            ArrayList<fb2.e> arrayList = this.f125956m;
            if (arrayList.size() > 0) {
                for (fb2.e eVar : arrayList) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
            }
        }
    }

    @Override // ng1.p, java.util.Observer
    public void update(Observable observable, Object obj) {
        z zVarJ;
        i2.k(a2.SETTINGS, "DeviceAppearanceSettingActivityDefault", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj == null || !(observable instanceof j6) || (zVarJ = ((d0) KoinJavaComponent.get(d0.class)).J(this.f125980f)) == null) {
            return;
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        o.c[] cVarArr = DeviceSettingsDisplayOptionsDefault.f42744c;
        Intent intent = new Intent();
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
        intent.setClassName(this, zVarJ.getF178182o());
        startActivityForResult(intent, 10);
    }
}
