package ng1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j extends p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public GCMComplexOneLineButton f125945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GCMComplexOneLineButton f125946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public GCMComplexOneLineButton f125947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GCMComplexTwoLineButton f125948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f125949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FrameLayout f125950r;

    public abstract int ea();

    public GCMComplexTwoLineButton fa() {
        return null;
    }

    public GCMComplexOneLineButton ga() {
        return null;
    }

    public GCMComplexOneLineButton ha() {
        return null;
    }

    public GCMComplexOneLineButton ia() {
        return null;
    }

    @SuppressLint({"SwitchIntDef"})
    public final synchronized void ja(int i14, Boolean bool) {
        try {
            if (((l80.b) KoinJavaComponent.get(l80.b.class)).a(this.f125976b)) {
                a2 a2Var = a2.SETTINGS;
                i2.a(a2Var, "BaseActivityTrackerDeviceSettings", "Settings and connected device are the same -- device ID [" + this.f125976b + "].");
                zb0.d0 d0Var = (zb0.d0) KoinJavaComponent.get(zb0.d0.class);
                if (i14 == 1) {
                    d0Var.T(this.f125976b, bool);
                    StringBuilder sb3 = new StringBuilder("  >> called DeviceManager.setAutoUploadEnabled(");
                    sb3.append(bool.booleanValue() ? BooleanUtils.ON : BooleanUtils.OFF);
                    sb3.append(") for device ID [");
                    sb3.append(this.f125976b);
                    sb3.append("].");
                    String string = sb3.toString();
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "BaseActivityTrackerDeviceSettings", string);
                } else if (i14 == 2) {
                    d0Var.W(this.f125976b, bool);
                    StringBuilder sb4 = new StringBuilder("  >> called DeviceManager.setWeatherConditionsEnabled(");
                    sb4.append(bool.booleanValue() ? BooleanUtils.ON : BooleanUtils.OFF);
                    sb4.append(") for device ID [");
                    sb4.append(this.f125976b);
                    sb4.append("].");
                    String string2 = sb4.toString();
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "BaseActivityTrackerDeviceSettings", string2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public void onBackPressed() {
        if (ca()) {
            super.onBackPressed();
        } else {
            da();
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_base_act_tracker_device_settings);
        initActionBar(true, R.string.devices_settings_device_settings);
        ((a31.e) KoinJavaComponent.get(a31.e.class)).a(this.f125976b, e31.a.ENTERED_ACTIVITY_TRACKING_SCREEN);
        this.f125950r = (FrameLayout) findViewById(R.id.device_settings_activity_tracker_container);
        if (getIntent().getExtras() != null) {
            this.f125949q = getIntent().getExtras().getString("GCM_deviceName");
        }
        this.f125950r.addView(LayoutInflater.from(this).inflate(ea(), (ViewGroup) null, false));
        this.f125945m = ga();
        this.f125946n = ha();
        this.f125947o = ia();
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f125945m;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setButtonLeftLabel(getString(R.string.title_auto_upload_on_off));
            this.f125945m.setButtonBottomHint(getString(R.string.description_auto_upload_on_off));
            this.f125945m.setRightElement(GCMComplexOneLineButton.a.SWITCH);
            rd2.h hVarD = rd2.h.d();
            long j8 = this.f125976b;
            hVarD.getClass();
            boolean zE = rd2.h.e(1, j8);
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f125945m;
            if (zE) {
                gCMComplexOneLineButton2.k();
            } else {
                gCMComplexOneLineButton2.j();
            }
            ja(1, Boolean.valueOf(zE));
            this.f125945m.setOnCheckedChangeListener(new f(this));
            this.f125945m.setEnabled(false);
        }
        GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f125946n;
        if (gCMComplexOneLineButton3 != null) {
            gCMComplexOneLineButton3.setButtonLeftLabel(getString(R.string.title_weather_on_off));
            this.f125946n.setRightElement(GCMComplexOneLineButton.a.SWITCH);
            rd2.h hVarD2 = rd2.h.d();
            long j14 = this.f125976b;
            hVarD2.getClass();
            boolean zE2 = rd2.h.e(2, j14);
            GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f125946n;
            if (zE2) {
                gCMComplexOneLineButton4.k();
            } else {
                gCMComplexOneLineButton4.j();
            }
            ja(2, Boolean.valueOf(zE2));
            this.f125946n.setOnCheckedChangeListener(new g(this));
        }
        if (this.f125947o != null) {
            rd2.h hVarD3 = rd2.h.d();
            long j15 = this.f125976b;
            hVarD3.getClass();
            boolean zE3 = rd2.h.e(2, j15);
            rd2.h hVarD4 = rd2.h.d();
            long j16 = this.f125976b;
            hVarD4.getClass();
            boolean zE4 = rd2.h.e(3, j16);
            if (zE3 || zE4) {
                this.f125947o.setVisibility(0);
                this.f125947o.setOnClickListener(new h(this));
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public void onResume() {
        super.onResume();
        GCMComplexTwoLineButton gCMComplexTwoLineButtonFa = fa();
        this.f125948p = gCMComplexTwoLineButtonFa;
        if (gCMComplexTwoLineButtonFa != null) {
            gCMComplexTwoLineButtonFa.setButtonTopLabel(getString(R.string.device_settings_audio_prompts));
            zb0.d0 d0Var = (zb0.d0) KoinJavaComponent.get(zb0.d0.class);
            boolean zN = d0Var.n(this.f125976b);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f125948p;
            if (zN) {
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.lbl_on));
            } else {
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.lbl_off));
            }
            this.f125948p.setOnClickListener(new i(this, d0Var));
        }
    }
}
