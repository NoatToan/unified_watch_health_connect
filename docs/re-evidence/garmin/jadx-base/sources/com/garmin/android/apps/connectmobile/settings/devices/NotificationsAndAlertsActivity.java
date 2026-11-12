package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import ch1.c0;
import ch1.d3;
import ch1.v2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;
import ng1.j;
import ng1.y0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class NotificationsAndAlertsActivity extends y0 implements Observer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f42161d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f42162e;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42163a;

        static {
            int[] iArr = new int[u0.values().length];
            f42163a = iArr;
            try {
                iArr[u0.T1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42163a[u0.S1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42163a[u0.V1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42163a[u0.J1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42163a[u0.Y1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42163a[u0.Z1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42163a[u0.f203711d2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42163a[u0.f203693a2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static void da(j jVar, DeviceSettingsDTO deviceSettingsDTO, u0 u0Var) {
        Intent intent = new Intent(jVar, (Class<?>) NotificationsAndAlertsActivity.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceEnumValue", u0Var);
        jVar.startActivityForResult(intent, 10);
    }

    @Override // ng1.y0, android.app.Activity
    public final void finish() {
        ArrayList arrayList = this.f42161d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "NotificationsAndAlertsActivity");
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f42161d) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
                this.f126026a = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.y0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_notifications_and_alerts);
        initActionBar(true, getString(R.string.notifications_and_alerts));
        this.f42162e = (TextView) findViewById(R.id.device_settings_move_alert_bottom_hint);
        ArrayList<fb2.e> arrayList = this.f42161d;
        arrayList.clear();
        arrayList.add(new ch1.y0(this));
        arrayList.add(new d3(this));
        arrayList.add(new c0(this));
        arrayList.add(new v2(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f126026a);
            eVar.addObserver(this);
            eVar.m(zG);
            if (eVar instanceof v2) {
                switch (a.f42163a[this.f126027b.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ca(eVar);
                        break;
                }
                this.f42162e.setVisibility(eVar.j() ? 0 : 8);
            }
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42161d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }
}
