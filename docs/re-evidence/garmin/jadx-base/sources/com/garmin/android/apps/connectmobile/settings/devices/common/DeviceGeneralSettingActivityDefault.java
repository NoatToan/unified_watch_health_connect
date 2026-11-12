package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.b6;
import ch1.c1;
import ch1.g1;
import ch1.g3;
import ch1.k2;
import ch1.l6;
import ch1.s2;
import ch1.s4;
import ch1.v;
import ch1.w;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fb2.g;
import fb2.r;
import java.util.ArrayList;
import java.util.Iterator;
import ng1.k0;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceGeneralSettingActivityDefault extends k0 {
    @Override // ng1.k0
    public void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        v vVar = new v(this, this.f125976b);
        vVar.f27482k = false;
        boolean booleanExtra = getIntent().getExtras() != null ? getIntent().getBooleanExtra("MilitaryTimeFormatSupported", false) : false;
        arrayList.add(new l6(this));
        arrayList.add(new w(this));
        arrayList.add(new g1(this));
        arrayList.add(vVar);
        arrayList.add(new g3(this));
        arrayList.add(new s4(this, booleanExtra));
        arrayList.add(new c1(this));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        i2.k(a2.SETTINGS, "DeviceGeneralSettingActivityDefault", "finish()");
        ArrayList arrayList = this.f125956m;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        super.finish();
    }

    @Override // ng1.k0
    public void ha() {
        if (this.f125985k != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
            ArrayList<fb2.e> arrayList = this.f125956m;
            for (fb2.e eVar : arrayList) {
                if (eVar.h(this.f125985k) && !(eVar instanceof r)) {
                    linearLayout.addView(g.a(this));
                }
                linearLayout.addView(eVar.a());
                if (eVar instanceof w) {
                    linearLayout.addView(g.c(this, getString(R.string.device_settings_backlight_gesture_help)));
                }
                if (eVar instanceof v) {
                    linearLayout.addView(g.c(this, getString(R.string.description_auto_upload_on_off)));
                }
                if (eVar instanceof b6) {
                    linearLayout.addView(g.c(this, getString(R.string.weather_setting_description)));
                }
            }
            linearLayout.addView(g.a(this));
            for (fb2.e eVar2 : arrayList) {
                boolean zG = eVar2.g(this, this.f125985k);
                eVar2.addObserver(this);
                eVar2.m(zG);
                if (eVar2 instanceof v) {
                    eVar2.l(false);
                }
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, getString(R.string.lbl_general));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        k0.ia(this.f125956m, this.f125985k);
    }
}
