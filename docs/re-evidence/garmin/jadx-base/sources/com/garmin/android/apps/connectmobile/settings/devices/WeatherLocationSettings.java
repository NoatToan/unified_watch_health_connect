package com.garmin.android.apps.connectmobile.settings.devices;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import mt0.h0;
import o13.l;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class WeatherLocationSettings extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f42487g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f42488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocationManager f42489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f42490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.appcompat.app.e f42491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<mv0.g> f42492e = KoinJavaComponent.inject(mv0.g.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0 f42493f = new h0(this, 22);

    public class a implements LocationListener {
        public a() {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            i2.a(a2.LOCATION, "WeatherLocationSettings", "onLocationChanged " + location);
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            i2.a(a2.LOCATION, "WeatherLocationSettings", "onProviderDisabled " + str);
            int i14 = WeatherLocationSettings.f42487g;
            WeatherLocationSettings.this.da();
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
            i2.a(a2.LOCATION, "WeatherLocationSettings", "onProviderEnabled " + str);
            int i14 = WeatherLocationSettings.f42487g;
            WeatherLocationSettings.this.ea();
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i14, Bundle bundle) {
            i2.a(a2.LOCATION, "WeatherLocationSettings", "onStatusChanged status " + i14);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void ca() {
        l<mv0.g> lVar = this.f42492e;
        mv0.g value = lVar.getValue();
        value.getClass();
        if (!value.f121162a.a("WeatherLocationSettings")) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } else {
            lVar.getValue().x4("WeatherLocationSettings");
            ea();
        }
    }

    public final void da() {
        this.f42488a.setEnabled(true);
        this.f42488a.setOnClickListener(this.f42493f);
        this.f42488a.setButtonLeftLabel(getString(R.string.weather_location_service_enable));
        this.f42488a.setButtonBottomHint(getString(R.string.weather_location_service_enable_description));
        this.f42488a.setLeftLabelColor(getColor(R.color.gcm_text_primary_action));
        this.f42488a.c(null, null);
    }

    public final void ea() {
        this.f42488a.c(a7.b.getDrawable(this, R.drawable.check), null);
        this.f42488a.setEnabled(false);
        this.f42488a.setButtonLeftLabel(getString(R.string.weather_phone_location_enabled));
        this.f42488a.setButtonBottomHint(getString(R.string.weather_settings_footer_message_enabled));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_weather);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.weather_settings_use_phones_location_btn);
        this.f42488a = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnClickListener(this.f42493f);
        initActionBar(true, R.string.weather_settings_title);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        finish();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        androidx.appcompat.app.e eVar = this.f42491d;
        if (eVar != null && eVar.isShowing()) {
            this.f42491d.dismiss();
        }
        LocationManager locationManager = this.f42489b;
        if (locationManager != null) {
            locationManager.removeUpdates(this.f42490c);
        }
    }

    @Override // androidx.fragment.app.m, b.g, android.app.Activity
    public final void onRequestPermissionsResult(int i14, String[] strArr, int[] iArr) {
        if (i14 != 1) {
            super.onRequestPermissionsResult(i14, strArr, iArr);
            return;
        }
        j22.b.f96736a.getClass();
        if (j22.b.E(iArr)) {
            i2.a(a2.SETTINGS, "WeatherLocationSettings", "onRequestPermissionsResult:user granted permission to use location");
            ca();
        } else {
            i2.a(a2.SETTINGS, "WeatherLocationSettings", "onRequestPermissionsResult:user denied permission to use location");
            Toast.makeText(this, j22.b.f(j22.a.f96719h), 0).show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    @SuppressLint({"MissingPermission"})
    public final void onResume() {
        super.onResume();
        j22.b.f96736a.getClass();
        j22.f fVarJ = j22.b.j(this);
        j22.f fVar = j22.f.ALLOWED_ALL_TIME;
        if (fVarJ != fVar) {
            this.f42488a.setButtonLeftLabel(getString(R.string.weather_phone_location_ask_to_enable));
            this.f42488a.setButtonBottomHint(getString(R.string.weather_settings_footer_message_disabled));
            this.f42488a.setLeftLabelColor(getColor(R.color.gcm_text_primary_action));
            this.f42488a.c(null, null);
        } else {
            mv0.g value = this.f42492e.getValue();
            value.getClass();
            if (value.f121162a.a("WeatherLocationSettings")) {
                ea();
            } else {
                da();
            }
        }
        this.f42489b = (LocationManager) getSystemService(FirebaseAnalytics.Param.LOCATION);
        this.f42490c = new a();
        try {
            if (j22.b.j(this) == fVar) {
                this.f42489b.requestLocationUpdates("gps", 35000L, 10.0f, this.f42490c);
                i2.a(a2.LOCATION, "WeatherLocationSettings", "requestLocationUpdates(GPS_PROVIDER, minTimeMs[35000], minDistanceM[10]");
            }
        } catch (RuntimeException e4) {
            i2.f(a2.LOCATION, "WeatherLocationSettings", "requestLocationUpdates " + e4);
        }
    }
}
