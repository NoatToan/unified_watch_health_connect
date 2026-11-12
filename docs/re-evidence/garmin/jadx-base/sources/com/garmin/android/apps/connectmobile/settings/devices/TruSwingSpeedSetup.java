package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioGroup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import lj0.i;
import lj0.j;
import ng1.a1;
import ng1.z0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class TruSwingSpeedSetup extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f42180d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cl0.d f42181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f42182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f42183c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42184a;

        static {
            int[] iArr = new int[cl0.d.values().length];
            f42184a = iArr;
            try {
                iArr[cl0.d.MILE_PER_HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42184a[cl0.d.KILOMETER_PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42184a[cl0.d.METER_PER_SEC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000c  */
    public final String ca() {
        cl0.d dVar;
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.device_settings_truswing_group);
        if (radioGroup != null) {
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
            if (checkedRadioButtonId == R.id.device_settings_truswing_miles_per_hour) {
                dVar = cl0.d.MILE_PER_HOUR;
            } else if (checkedRadioButtonId == R.id.device_settings_truswing_kilometers_per_hour) {
                dVar = cl0.d.KILOMETER_PER_HOUR;
            } else if (checkedRadioButtonId == R.id.device_settings_truswing_meters_per_sec) {
                dVar = cl0.d.METER_PER_SEC;
            } else {
                dVar = null;
            }
        } else {
            dVar = null;
        }
        this.f42181a = dVar;
        if (dVar == null) {
            return null;
        }
        String str = dVar.f27934a;
        rl0.a.f153399c.getClass();
        str.getClass();
        return new rl0.a("SwingSpeedMeasurementSystem", str, null).F();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        j jVar = this.f42182b;
        if (jVar != null && jVar.d()) {
            super.onBackPressed();
            return;
        }
        try {
            String strCa = ca();
            if (strCa == null) {
                i2.f(a2.SETTINGS, "TruSwingSpeedSetup", "Error saving swing speed to GC.");
                finish();
                return;
            }
            lj0.f fVar = lj0.f.F;
            fVar.f113007i = strCa;
            j jVar2 = new j(new a1(this));
            this.f42183c = jVar2;
            jVar2.b(new i(fVar, new Object[0]));
        } catch (JSONException e4) {
            i2.f(a2.SETTINGS, "TruSwingSpeedSetup", "Error saving swing speed to GC: " + e4.getMessage());
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        super.setContentView(R.layout.gcm3_device_settings_truswing);
        super.initActionBar(true, getString(R.string.devices_settings_device_settings));
        if (hb2.i.a(this)) {
            showProgressOverlay();
            lj0.f fVar = lj0.f.I;
            j jVar = new j(new z0(this));
            this.f42182b = jVar;
            jVar.b(new i(fVar, new Object[0]));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        j jVar = this.f42182b;
        if (jVar != null ? jVar.d() : false) {
            this.f42182b.a();
        }
        j jVar2 = this.f42183c;
        if (jVar2 != null ? jVar2.d() : false) {
            this.f42183c.a();
        }
        super.onStop();
    }
}
