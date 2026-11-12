package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import ch1.d0;
import ch1.f3;
import ch1.r4;
import ch1.u4;
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
import ng1.y0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/Forerunner935NotificationsAndAlertsActivity;", "Lng1/y0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Forerunner935NotificationsAndAlertsActivity extends y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f42123f = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f42124d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f42125e;

    @Override // ng1.y0, android.app.Activity
    public final void finish() {
        ArrayList arrayList = this.f42124d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        DeviceSettingsDTO deviceSettingsDTO;
        a2 a2Var = a2.SETTINGS;
        StringBuilder sbJ = e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data=");
        sbJ.append(intent);
        String string = sbJ.toString();
        i2.f36769a.getClass();
        i2.a.b(a2Var, "F935NotifAlertsActivity", string);
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            if (intent == null || intent.getExtras() == null) {
                deviceSettingsDTO = null;
            } else {
                Bundle extras = intent.getExtras();
                extras.getClass();
                Object obj = extras.get("GCM_deviceSettings");
                obj.getClass();
                deviceSettingsDTO = (DeviceSettingsDTO) obj;
            }
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f42124d) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                    if (eVar instanceof v2) {
                        ca(eVar);
                        TextView textView = this.f42125e;
                        textView.getClass();
                        textView.setVisibility(((v2) eVar).j() ? 0 : 8);
                    }
                }
                this.f126026a = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.y0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_notifications_and_alerts_forerunner);
        initActionBar(true, getString(R.string.notifications_and_alerts));
        View viewFindViewById = findViewById(R.id.device_settings_move_alert_bottom_hint);
        viewFindViewById.getClass();
        this.f42125e = (TextView) viewFindViewById;
        findViewById(R.id.device_settings_alerts_section).setVisibility(0);
        ArrayList<fb2.e> arrayList = this.f42124d;
        arrayList.clear();
        arrayList.add(new f3(this));
        arrayList.add(new r4(this));
        arrayList.add(new d0(this));
        arrayList.add(new u4(this));
        arrayList.add(new v2(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f126026a);
            eVar.addObserver(this);
            eVar.m(zG);
            if (eVar instanceof v2) {
                ca(eVar);
                TextView textView = this.f42125e;
                if (textView != null) {
                    textView.setVisibility(((v2) eVar).j() ? 0 : 8);
                }
            }
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42124d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.y0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        observable.getClass();
        a2 a2Var = a2.SETTINGS;
        String strJ = hb.a.j("update(): observable=", observable, ", data=", obj);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "F935NotifAlertsActivity", strJ);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            if (observable instanceof f3) {
                DeviceSettingsDTO deviceSettingsDTO = this.f126026a;
                Intent intent = new Intent(this, (Class<?>) Forerunner35PhoneNotificationsDeviceSettings.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", str);
                startActivityForResult(intent, 10);
                return;
            }
            if (observable instanceof r4) {
                CannedTextReplyActivity.a aVar = CannedTextReplyActivity.f31264o;
                String string = getString(R.string.device_settings_canned_text_response);
                long j8 = this.f126026a.f33860a;
                String str2 = this.f126028c;
                aVar.getClass();
                CannedTextReplyActivity.a.a(this, string, j8, str2, null, 0);
                return;
            }
            if (observable instanceof d0) {
                CannedTextReplyActivity.a aVar2 = CannedTextReplyActivity.f31264o;
                String string2 = getString(R.string.device_settings_incoming_call_response);
                long j14 = this.f126026a.f33860a;
                String str3 = this.f126028c;
                aVar2.getClass();
                CannedTextReplyActivity.a.a(this, string2, j14, str3, null, 1);
                return;
            }
            if (observable instanceof u4) {
                DeviceSettingsDTO deviceSettingsDTO2 = this.f126026a;
                Intent intent2 = new Intent(this, (Class<?>) Forerunner935TonesDeviceSettings.class);
                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                intent2.putExtra("GCM_deviceSettingsTitle", str);
                startActivityForResult(intent2, 10);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/Forerunner935NotificationsAndAlertsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
