package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import ch1.d0;
import ch1.f3;
import ch1.k1;
import ch1.r4;
import ch1.v2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.cannedtextreply.CannedTextReplyActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import n23.j;
import ng1.y0;

/* JADX INFO: loaded from: classes10.dex */
public class VivoActive3NotificationsAndAlertsActivity extends y0 implements Observer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f42192d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f42193e;

    @Override // ng1.y0, android.app.Activity
    public final void finish() {
        ArrayList arrayList = this.f42192d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "VivoActive3NotificationsAndAlertsActivity");
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f42192d) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                    if (eVar instanceof v2) {
                        ca(eVar);
                        this.f42193e.setVisibility(eVar.j() ? 0 : 8);
                    }
                }
                this.f126026a = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.y0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_notifications_and_alerts_vivoactive3);
        initActionBar(true, getString(R.string.notifications_and_alerts));
        this.f42193e = (TextView) findViewById(R.id.device_settings_move_alert_bottom_hint);
        ArrayList<fb2.e> arrayList = this.f42192d;
        arrayList.clear();
        arrayList.add(new ch1.y0(this));
        arrayList.add(new f3(this));
        arrayList.add(new r4(this));
        arrayList.add(new d0(this));
        arrayList.add(new k1(this));
        arrayList.add(new v2(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f126026a);
            eVar.addObserver(this);
            eVar.m(zG);
            if (eVar instanceof v2) {
                ca(eVar);
                this.f42193e.setVisibility(eVar.j() ? 0 : 8);
            }
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42192d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.y0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "VivoActive3NotificationsAndAlertsActivity", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof f3) {
                DeviceSettingsDTO deviceSettingsDTO = this.f126026a;
                Intent intent = new Intent(this, (Class<?>) VivoActive3PhoneNotifications.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent, 10);
                return;
            }
            if (observable instanceof r4) {
                String string = getString(R.string.device_settings_canned_text_response);
                long j8 = this.f126026a.f33860a;
                String str = this.f126028c;
                CannedTextReplyActivity.f31264o.getClass();
                CannedTextReplyActivity.a.a(this, string, j8, str, null, 0);
                return;
            }
            if (observable instanceof d0) {
                String string2 = getString(R.string.device_settings_incoming_call_response);
                long j14 = this.f126026a.f33860a;
                String str2 = this.f126028c;
                CannedTextReplyActivity.f31264o.getClass();
                CannedTextReplyActivity.a.a(this, string2, j14, str2, null, 1);
            }
        }
    }
}
