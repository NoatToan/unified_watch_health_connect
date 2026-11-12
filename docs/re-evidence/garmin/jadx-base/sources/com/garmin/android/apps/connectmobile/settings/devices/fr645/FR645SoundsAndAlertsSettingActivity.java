package com.garmin.android.apps.connectmobile.settings.devices.fr645;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import ch1.b5;
import ch1.c0;
import ch1.d0;
import ch1.f3;
import ch1.g2;
import ch1.h2;
import ch1.j;
import ch1.r1;
import ch1.r4;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.cannedtextreply.CannedTextReplyActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsActivityDefault;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4HighHeartRateSettings;
import fb2.e;
import hc0.c;
import i3.e5;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import ng1.k0;
import org.koin.java.KoinJavaComponent;
import sd2.f;

/* JADX INFO: loaded from: classes10.dex */
public class FR645SoundsAndAlertsSettingActivity extends k0 implements Observer {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f43014p = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f43015o;

    @Override // ng1.k0
    public void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new y2(this));
        arrayList.add(new g2(this));
        arrayList.add(new h2(this));
        arrayList.add(new j(this));
        arrayList.add(new b5(this, R.string.device_settings_alert_vibration));
        arrayList.add(new f3(this));
        arrayList.add(new r4(this));
        arrayList.add(new d0(this));
        arrayList.add(new c0(this));
        arrayList.add(new y0(this, R.string.device_settings_do_not_disturb_during_sleep));
    }

    @Override // ng1.k0
    public final void ha() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        if (this.f125985k != null) {
            c cVar = new c(19, this, linearLayout);
            ArrayList arrayList = this.f125956m;
            e22.a.a(arrayList, cVar);
            k0.ga(this, arrayList, this.f125985k, this);
        }
    }

    public boolean ja(e eVar) {
        return (eVar instanceof f3) || (eVar instanceof g2) || (eVar instanceof y2);
    }

    public final String ka() {
        String string = getString(R.string.incomplete_device_default_device_name);
        if (this.f125985k == null) {
            return string;
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f125977c.getDisplayName());
        f fVar = this.f125977c;
        return !zIsEmpty ? fVar.getDisplayName() : fVar.getProductDisplayName();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "FR645SoundsAndAlertsSettingActivity");
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                k0.ia(this.f125956m, deviceSettingsDTO);
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, R.string.sounds_and_alerts_title);
        this.f43015o = getIntent().getBooleanExtra("GCM_low_hr_alert_capable", false);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        k0.ia(this.f125956m, this.f125985k);
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        DeviceSettingsDTO deviceSettingsDTO;
        i2.k(a2.SETTINGS, "FR645SoundsAndAlertsSettingActivity", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof f3) {
                DevicePhoneNotificationsActivityDefault.ca(this, this.f125985k, (String) obj, ((zb0.d0) KoinJavaComponent.get(zb0.d0.class)).J(this.f125980f), this.f125978d);
                return;
            }
            if (observable instanceof y2) {
                long j8 = this.f125976b;
                AlarmsSettingsActivity.f41854n.getClass();
                startActivity(AlarmsSettingsActivity.a.a(this, j8, null, null));
                return;
            }
            if (observable instanceof r4) {
                if (this.f125985k != null) {
                    String string = getString(R.string.device_settings_canned_text_response);
                    long j14 = this.f125985k.f33860a;
                    String strKa = ka();
                    CannedTextReplyActivity.f31264o.getClass();
                    CannedTextReplyActivity.a.a(this, string, j14, strKa, null, 0);
                    return;
                }
                return;
            }
            if (observable instanceof d0) {
                if (this.f125985k != null) {
                    String string2 = getString(R.string.device_settings_incoming_call_response);
                    long j15 = this.f125985k.f33860a;
                    String strKa2 = ka();
                    CannedTextReplyActivity.f31264o.getClass();
                    CannedTextReplyActivity.a.a(this, string2, j15, strKa2, null, 1);
                    return;
                }
                return;
            }
            if (!(observable instanceof r1) || (deviceSettingsDTO = this.f125985k) == null) {
                return;
            }
            boolean z14 = this.f43015o;
            long j16 = this.f125976b;
            String str = this.f125978d;
            VivoSmart4HighHeartRateSettings.f43225d.getClass();
            VivoSmart4HighHeartRateSettings.a.a(this, z14, deviceSettingsDTO, j16, str);
        }
    }
}
