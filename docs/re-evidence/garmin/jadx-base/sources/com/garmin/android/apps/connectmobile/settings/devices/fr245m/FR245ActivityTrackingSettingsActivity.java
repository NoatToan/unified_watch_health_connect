package com.garmin.android.apps.connectmobile.settings.devices.fr245m;

import am.j;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import c22.t3;
import ch1.b2;
import ch1.i0;
import ch1.i3;
import ch1.p4;
import ch1.u2;
import ch1.w2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTracking;
import com.garmin.android.apps.connectmobile.settings.devices.IntensityMinutesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import en0.n;
import fb2.e;
import java.util.ArrayList;
import java.util.Observable;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr245m/FR245ActivityTrackingSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/fr645/FR645ActivityTrackingSettingActivity;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FR245ActivityTrackingSettingsActivity extends FR645ActivityTrackingSettingActivity {
    public static final /* synthetic */ int H0 = 0;
    public UserSettingsDTO X;
    public JSONObject Y;
    public final b Z = new b();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final c f42968k0 = new c();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/fr245m/FR245ActivityTrackingSettingsActivity$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<UserSettingsDTO> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            int i14 = FR245ActivityTrackingSettingsActivity.H0;
            FR245ActivityTrackingSettingsActivity fR245ActivityTrackingSettingsActivity = FR245ActivityTrackingSettingsActivity.this;
            fR245ActivityTrackingSettingsActivity.C.remove(Long.valueOf(j8));
            fR245ActivityTrackingSettingsActivity.hideProgressOverlay();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).U(fR245ActivityTrackingSettingsActivity.f125976b);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, UserSettingsDTO userSettingsDTO) {
            UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
            eVar.getClass();
            userSettingsDTO2.getClass();
            FR245ActivityTrackingSettingsActivity fR245ActivityTrackingSettingsActivity = FR245ActivityTrackingSettingsActivity.this;
            fR245ActivityTrackingSettingsActivity.X = userSettingsDTO2;
            fR245ActivityTrackingSettingsActivity.Y = userSettingsDTO2.t1();
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/fr245m/FR245ActivityTrackingSettingsActivity$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            FR245ActivityTrackingSettingsActivity fR245ActivityTrackingSettingsActivity = FR245ActivityTrackingSettingsActivity.this;
            if (cVar == cVar2) {
                int i14 = FR245ActivityTrackingSettingsActivity.H0;
                fR245ActivityTrackingSettingsActivity.P.x4(fR245ActivityTrackingSettingsActivity.f42996v, "FR645ActivityTrackingSettingActivity");
                ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).n(fR245ActivityTrackingSettingsActivity, fR245ActivityTrackingSettingsActivity.f125976b, "FR245ActivityTrackingSettingsActivity");
                Toast.makeText(fR245ActivityTrackingSettingsActivity, fR245ActivityTrackingSettingsActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
            } else {
                a2 a2Var = a2.SETTINGS;
                String strM = j.m("Error saving user settings to GC [", cVar.name(), "].");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "FR245ActivityTrackingSettingsActivity", strM);
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                    Toast.makeText(fR245ActivityTrackingSettingsActivity, R.string.txt_error_occurred, 0).show();
                }
            }
            fR245ActivityTrackingSettingsActivity.hideProgressOverlay();
            FR245ActivityTrackingSettingsActivity.super.onBackPressed();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity
    public final void ka() {
        this.E = new w2(this);
        this.F = new u2(this);
        ArrayList<e> arrayList = this.f42998x;
        arrayList.clear();
        arrayList.add(new i3(this));
        arrayList.add(new ch1.a(this));
        arrayList.add(this.F);
        arrayList.add(this.E);
        arrayList.add(new p4(this, new n(this, 26)));
        arrayList.add(new b2(this));
        arrayList.add(new i0(this));
        if (this.f125985k != null) {
            for (e eVar : arrayList) {
                DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                deviceSettingsDTO.getClass();
                boolean zG = eVar.g(this, deviceSettingsDTO);
                eVar.addObserver(this);
                eVar.m(zG);
            }
            w2 w2Var = this.E;
            w2Var.getClass();
            DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
            deviceSettingsDTO2.getClass();
            w2Var.l(deviceSettingsDTO2.e1());
            u2 u2Var = this.F;
            u2Var.getClass();
            DeviceSettingsDTO deviceSettingsDTO3 = this.f125985k;
            deviceSettingsDTO3.getClass();
            u2Var.l(deviceSettingsDTO3.e1());
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Parcelable parcelable;
        super.onActivityResult(i14, i15, intent);
        if (intent != null && i14 == 20 && i15 == -1) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("GCM_user_settings", UserSettingsDTO.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("GCM_user_settings");
                if (!(parcelableExtra instanceof UserSettingsDTO)) {
                    parcelableExtra = null;
                }
                parcelable = (UserSettingsDTO) parcelableExtra;
            }
            this.X = (UserSettingsDTO) parcelable;
            this.f42997w.g(intent.getIntExtra("INTENSITY_MINUTES_GOAL", 150));
            na(this.f42997w);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity, ng1.j, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        UserSettingsDTO userSettingsDTO = this.X;
        JSONObject jSONObjectB = userSettingsDTO != null ? t3.b(userSettingsDTO.t1(), this.Y) : null;
        if (jSONObjectB == null) {
            super.onBackPressed();
            return;
        }
        UserSettingsDTO userSettingsDTO2 = this.X;
        if (userSettingsDTO2 != null) {
            showProgressOverlay();
            this.C.add(Long.valueOf(((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).a(userSettingsDTO2, jSONObjectB, this.f42968k0)));
        }
        ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).n(this, this.f125976b, "FR245ActivityTrackingSettingsActivity");
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        getIntent().putExtra("GCM_deviceEnumValue", u0.P0);
        getIntent().putExtra("GCM_deviceSettingsTitle", getResources().getString(R.string.activity_tracking_title));
        super.onCreate(bundle);
        showProgressOverlay();
        this.C.add(Long.valueOf(((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).i(this.Z)));
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        DeviceSettingsDTO deviceSettingsDTO;
        nr0.a aVar;
        DeviceSettingsDTO deviceSettingsDTO2;
        a2 a2Var = a2.SETTINGS;
        String strJ = hb.a.j("update(): observable=", observable, ", data=", obj);
        i2.f36769a.getClass();
        i2.a.n(a2Var, "FR245ActivityTrackingSettingsActivity", strJ);
        if (obj != null) {
            if ((observable instanceof ch1.a) && (deviceSettingsDTO2 = this.f125985k) != null) {
                u2 u2Var = this.F;
                if (u2Var != null) {
                    u2Var.z(deviceSettingsDTO2);
                }
                w2 w2Var = this.E;
                if (w2Var != null) {
                    DeviceSettingsDTO deviceSettingsDTO3 = this.f125985k;
                    deviceSettingsDTO3.getClass();
                    w2Var.z(deviceSettingsDTO3);
                }
            }
            if (observable instanceof ch1.b) {
                DeviceSettingsActivityTracking.ca(this, this.f125985k, (String) obj, this.f125976b);
            }
            if (observable instanceof i0) {
                ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).m(this, this.f42995t, 15);
            }
            if (observable instanceof i3) {
                ActivityTrackingPulseOXSetting.a aVar2 = ActivityTrackingPulseOXSetting.f41786l;
                DeviceSettingsDTO deviceSettingsDTO4 = this.f125985k;
                String str = this.f125949q;
                String str2 = this.f125978d;
                aVar2.getClass();
                ActivityTrackingPulseOXSetting.a.a(this, deviceSettingsDTO4, str, str2);
            }
            if (!(observable instanceof b2) || (deviceSettingsDTO = this.f125985k) == null || (aVar = deviceSettingsDTO.f33879j1) == null) {
                return;
            }
            IntensityMinutesConfigActivity.da(this, this.X, aVar.b());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/fr245m/FR245ActivityTrackingSettingsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INTENSITY_MINUTES_CONFIG_REQUEST_CODE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
