package com.garmin.android.apps.connectmobile.devices;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import zb0.b0;
import zb0.g1;

/* JADX INFO: loaded from: classes8.dex */
public class FindDeviceMapActivity extends v implements OnMapReadyCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f33823a;

    @Override // com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_find_device_map);
        this.f33823a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        ((SupportMapFragment) getSupportFragmentManager().F(R.id.map)).getMapAsync(this);
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(GoogleMap googleMap) {
        if (this.f33823a != -1) {
            g1 g1VarA = g1.a(getApplicationContext());
            long j8 = this.f33823a;
            g1VarA.getClass();
            b0 b0VarC = g1.c(j8);
            LatLng latLng = new LatLng(Double.valueOf(b0VarC.f203431b).doubleValue(), Double.valueOf(b0VarC.f203432c).doubleValue());
            googleMap.addMarker(new MarkerOptions().position(latLng).title(getString(R.string.edge_location_lbl)));
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        }
    }
}
