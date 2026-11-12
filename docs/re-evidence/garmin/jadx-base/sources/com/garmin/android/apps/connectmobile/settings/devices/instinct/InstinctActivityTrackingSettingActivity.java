package com.garmin.android.apps.connectmobile.settings.devices.instinct;

import am.j;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Toast;
import c22.n0;
import c22.t3;
import ch1.b2;
import ch1.f1;
import ch1.i0;
import ch1.i3;
import ch1.p4;
import ch1.u2;
import ch1.w2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.IntensityMinutesConfigActivity;
import com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity;
import com.garmin.android.apps.connectmobile.settings.devices.instinct.InstinctActivityTrackingSettingActivity;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import fb2.e;
import java.util.ArrayList;
import java.util.Observable;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/instinct/InstinctActivityTrackingSettingActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/fr645/FR645ActivityTrackingSettingActivity;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InstinctActivityTrackingSettingActivity extends FR645ActivityTrackingSettingActivity {
    public static final /* synthetic */ int H0 = 0;
    public UserSettingsDTO X;
    public JSONObject Y;
    public final c Z = new c();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final b f43122k0 = new b();

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/instinct/InstinctActivityTrackingSettingActivity$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<UserSettingsDTO> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            int i14 = InstinctActivityTrackingSettingActivity.H0;
            InstinctActivityTrackingSettingActivity instinctActivityTrackingSettingActivity = InstinctActivityTrackingSettingActivity.this;
            instinctActivityTrackingSettingActivity.C.remove(Long.valueOf(j8));
            instinctActivityTrackingSettingActivity.hideProgressOverlay();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                ((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).U(instinctActivityTrackingSettingActivity.f125976b);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, UserSettingsDTO userSettingsDTO) {
            UserSettingsDTO userSettingsDTO2 = userSettingsDTO;
            eVar.getClass();
            userSettingsDTO2.getClass();
            InstinctActivityTrackingSettingActivity instinctActivityTrackingSettingActivity = InstinctActivityTrackingSettingActivity.this;
            instinctActivityTrackingSettingActivity.X = userSettingsDTO2;
            instinctActivityTrackingSettingActivity.Y = userSettingsDTO2.t1();
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/instinct/InstinctActivityTrackingSettingActivity$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            InstinctActivityTrackingSettingActivity instinctActivityTrackingSettingActivity = InstinctActivityTrackingSettingActivity.this;
            if (cVar == cVar2) {
                int i14 = InstinctActivityTrackingSettingActivity.H0;
                instinctActivityTrackingSettingActivity.P.x4(instinctActivityTrackingSettingActivity.f42996v, "FR645ActivityTrackingSettingActivity");
                ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).n(instinctActivityTrackingSettingActivity, instinctActivityTrackingSettingActivity.f125976b, "InstinctActivityTrackingSettingActivity");
                Toast.makeText(instinctActivityTrackingSettingActivity, instinctActivityTrackingSettingActivity.getText(R.string.msg_settings_saved_successfully), 0).show();
            } else {
                a2 a2Var = a2.SETTINGS;
                String strM = j.m("Error saving user settings to GC [", cVar.name(), "].");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "InstinctActivityTrackingSettingActivity", strM);
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                    Toast.makeText(instinctActivityTrackingSettingActivity, R.string.txt_error_occurred, 0).show();
                }
            }
            instinctActivityTrackingSettingActivity.hideProgressOverlay();
            InstinctActivityTrackingSettingActivity.super.onBackPressed();
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

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity, ng1.j
    public final int ea() {
        return R.layout.gcm_fr645_device_activity_tracking_settings_default;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity
    public final void ka() {
        this.E = new w2(this);
        this.F = new u2(this);
        this.I = new i3(this);
        ArrayList<e> arrayList = this.f42998x;
        arrayList.clear();
        arrayList.add(this.I);
        arrayList.add(new ch1.a(this));
        arrayList.add(this.F);
        arrayList.add(this.E);
        final int i14 = 0;
        arrayList.add(new p4(this, new xg1.j(this) { // from class: sh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstinctActivityTrackingSettingActivity f159306b;

            {
                this.f159306b = this;
            }

            @Override // xg1.j
            public final void a(nr0.a aVar) {
                int i15 = i14;
                InstinctActivityTrackingSettingActivity instinctActivityTrackingSettingActivity = this.f159306b;
                switch (i15) {
                    case 0:
                        int i16 = InstinctActivityTrackingSettingActivity.H0;
                        aVar.getClass();
                        instinctActivityTrackingSettingActivity.oa(aVar);
                        break;
                    default:
                        int i17 = InstinctActivityTrackingSettingActivity.H0;
                        aVar.getClass();
                        instinctActivityTrackingSettingActivity.ma(aVar);
                        break;
                }
            }
        }));
        arrayList.add(new b2(this));
        final int i15 = 1;
        arrayList.add(new f1(this, new xg1.j(this) { // from class: sh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstinctActivityTrackingSettingActivity f159306b;

            {
                this.f159306b = this;
            }

            @Override // xg1.j
            public final void a(nr0.a aVar) {
                int i16 = i15;
                InstinctActivityTrackingSettingActivity instinctActivityTrackingSettingActivity = this.f159306b;
                switch (i16) {
                    case 0:
                        int i17 = InstinctActivityTrackingSettingActivity.H0;
                        aVar.getClass();
                        instinctActivityTrackingSettingActivity.oa(aVar);
                        break;
                    default:
                        int i18 = InstinctActivityTrackingSettingActivity.H0;
                        aVar.getClass();
                        instinctActivityTrackingSettingActivity.ma(aVar);
                        break;
                }
            }
        }));
        arrayList.add(new i0(this));
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO != null) {
            for (e eVar : arrayList) {
                boolean zG = eVar.g(this, deviceSettingsDTO);
                eVar.addObserver(this);
                eVar.m(zG);
            }
            this.E.l(deviceSettingsDTO.e1());
            this.F.l(deviceSettingsDTO.e1());
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
        if (!n0.b(userSettingsDTO != null ? userSettingsDTO.t1() : null, this.Y)) {
            this.D = false;
            super.onBackPressed();
            return;
        }
        UserSettingsDTO userSettingsDTO2 = this.X;
        JSONObject jSONObjectB = userSettingsDTO2 != null ? t3.b(userSettingsDTO2.t1(), this.Y) : null;
        if (jSONObjectB == null) {
            super.onBackPressed();
            return;
        }
        UserSettingsDTO userSettingsDTO3 = this.X;
        if (userSettingsDTO3 != null) {
            showProgressOverlay();
            this.C.add(Long.valueOf(((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).a(userSettingsDTO3, jSONObjectB, this.Z)));
        }
        ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).n(this, this.f125976b, "InstinctActivityTrackingSettingActivity");
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        showProgressOverlay();
        this.C.add(Long.valueOf(((d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null)).i(this.f43122k0)));
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.fr645.FR645ActivityTrackingSettingActivity, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        DeviceSettingsDTO deviceSettingsDTO;
        nr0.a aVar;
        super.update(observable, obj);
        if (!(observable instanceof b2) || (deviceSettingsDTO = this.f125985k) == null || (aVar = deviceSettingsDTO.f33879j1) == null) {
            return;
        }
        IntensityMinutesConfigActivity.da(this, this.X, aVar.b());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/instinct/InstinctActivityTrackingSettingActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INTENSITY_MINUTES_CONFIG_REQUEST_CODE", "I", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
