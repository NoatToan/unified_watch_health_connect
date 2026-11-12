package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import c22.n0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup;
import com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackingPulseOXSetting;
import com.garmin.android.apps.connectmobile.settings.devices.vivomove3.Vivomove3ClassicWatchFaceSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4HighHeartRateSettings;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4SoundsAndAlertsActivity;
import hb2.i;
import org.koin.java.KoinJavaComponent;
import vg1.u;
import vg1.v;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSettingsActivityTrackerSetupDefault extends ActivityTrackerSetup {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f42727r = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public DeviceSettingsDTO f42728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f42729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f42730q = false;

    public enum a {
        APPEARANCE("appearance"),
        SOUND_AND_ALERT("sound_and_alert"),
        ACTIVITY_OPTIONS("activity_options"),
        ACTIVITY_TRACKING("activity_tracking"),
        USER_SETTING("activity_tracking"),
        GENERAL_SETTINGS("general"),
        RELAX_REMINDER("relax_reminder"),
        PULSE_OX_SETTINGS("pulse_ox"),
        HEART_RATE_DETAILS("heart_rate_details"),
        HEART_RATE_ALERTS("heart_rate_ALERTS"),
        CUSTOMIZE_WATCH_FACE("customize_watch_face"),
        MANAGE_PEOPLE("manage_people");

        a(String str) {
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup
    public final Intent ca() {
        Intent intentDa = da();
        intentDa.putExtra("GCM_deviceSettings", this.f42728o);
        switch (this.f42729p) {
            case APPEARANCE:
                intentDa.setClassName(this, this.f41780h.getF178172e());
                break;
            case SOUND_AND_ALERT:
                intentDa.setClassName(this, this.f41780h.getF178173f());
                break;
            case ACTIVITY_OPTIONS:
                intentDa.setClassName(this, this.f41780h.getF178174g());
                break;
            case ACTIVITY_TRACKING:
                intentDa.setClassName(this, this.f41780h.getF178175h());
                break;
            case USER_SETTING:
            default:
                intentDa.setClassName(this, ((d0) KoinJavaComponent.get(d0.class)).y(this.f41774b));
                break;
            case GENERAL_SETTINGS:
                intentDa.setClassName(this, this.f41780h.getF178177j());
                break;
            case RELAX_REMINDER:
                intentDa.setClassName(this, VivoSmart4SoundsAndAlertsActivity.class.getName());
                break;
            case PULSE_OX_SETTINGS:
                intentDa.putExtra("GCM_saveAsExit", true);
                intentDa.putExtra("GCM_extra_request_code", 10);
                intentDa.putExtra("GCM_deviceName", this.f41775c);
                this.f42730q = true;
                intentDa.setClassName(this, ActivityTrackingPulseOXSetting.class.getName());
                break;
            case HEART_RATE_DETAILS:
                intentDa.putExtra("GCM_saveAsExit", true);
                intentDa.putExtra("GCM_extra_request_code", 10);
                this.f42730q = true;
                intentDa.setClassName(this, VivoSmart4HighHeartRateSettings.class.getName());
                break;
            case HEART_RATE_ALERTS:
                intentDa.putExtra("GCM_saveAsExit", true);
                intentDa.putExtra("GCM_extra_request_code", 10);
                this.f42730q = true;
                intentDa.setClassName(this, HighHeartRateSettings.class.getName());
                break;
            case CUSTOMIZE_WATCH_FACE:
                intentDa.putExtra("GCM_saveAsExit", true);
                intentDa.putExtra("GCM_extra_request_code", 10);
                intentDa.putExtra("GCM_deviceSettingsTitle", getString(R.string.device_setting_watch_face));
                this.f42730q = true;
                intentDa.setClassName(this, Vivomove3ClassicWatchFaceSettingsActivity.class.getName());
                break;
        }
        return intentDa;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup
    public final void ea() {
        if (this.f41778f.get() == 2) {
            hideProgressOverlay();
            Intent intentCa = ca();
            if (this.f42730q) {
                startActivityForResult(intentCa, 10);
            } else {
                startActivity(intentCa);
                finish();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 != -1 || i14 != 10 || intent == null || intent.getExtras() == null) {
            return;
        }
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
        if (this.f42728o == null || deviceSettingsDTO == null || !this.f42730q) {
            return;
        }
        String strA = n0.a(deviceSettingsDTO.Y1(), this.f42728o.Y1(), null);
        i2.a(a2.SETTINGS, "DeviceSettingsActivityTrackerSetupDefault", "Settings JSON delta = " + strA);
        if (!n0.b(this.f42728o.Y1(), deviceSettingsDTO.Y1())) {
            finish();
            return;
        }
        if (!i.a(this)) {
            if (km2.a.d(this.f41773a, km2.a.b())) {
                Toast.makeText(this, getText(R.string.msg_settings_saved_successfully), 0).show();
                finish();
                return;
            }
            return;
        }
        showProgressOverlay();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f41773a;
        v vVar = new v(this, deviceSettingsDTO);
        eVarN.getClass();
        com.garmin.android.apps.connectmobile.settings.devices.e.Q(j8, strA, vVar);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.get("setting_name") == null) {
            finish();
        } else {
            this.f42729p = (a) extras.get("setting_name");
        }
        if (i.a(this)) {
            showProgressOverlay();
            com.garmin.android.apps.connectmobile.settings.devices.e.N().r(this.f41773a, new u(this));
        } else if (km2.a.d(this.f41773a, km2.a.b()) && this.f42729p == a.ACTIVITY_OPTIONS) {
            startActivity(ca());
        }
    }
}
