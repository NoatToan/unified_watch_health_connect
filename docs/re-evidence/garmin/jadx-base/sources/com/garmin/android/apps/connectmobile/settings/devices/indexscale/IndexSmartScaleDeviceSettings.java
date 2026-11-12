package com.garmin.android.apps.connectmobile.settings.devices.indexscale;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.index.ManagePeopleActivity;
import com.garmin.android.apps.connectmobile.settings.devices.indexscale.IndexSmartScaleDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import hb2.i;
import oh1.a;
import rd2.f;
import rd2.j;

/* JADX INFO: loaded from: classes10.dex */
public class IndexSmartScaleDeviceSettings extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f43084d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f43085a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f43086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f43087c;

    /* JADX WARN: Type inference failed for: r0v1, types: [oh1.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [oh1.a] */
    public IndexSmartScaleDeviceSettings() {
        final int i14 = 0;
        this.f43086b = new View.OnClickListener(this) { // from class: oh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexSmartScaleDeviceSettings f132163b;

            {
                this.f132163b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                IndexSmartScaleDeviceSettings indexSmartScaleDeviceSettings = this.f132163b;
                switch (i15) {
                    case 0:
                        int i16 = IndexSmartScaleDeviceSettings.f43084d;
                        if (i.a(indexSmartScaleDeviceSettings)) {
                            j jVar = f.a().f152045a;
                            long j8 = indexSmartScaleDeviceSettings.f43085a;
                            jVar.getClass();
                            sd2.f fVarI = j.i(j8, null);
                            String productDisplayName = fVarI != null ? fVarI.getProductDisplayName() : null;
                            if (productDisplayName == null) {
                                productDisplayName = indexSmartScaleDeviceSettings.getString(R.string.device_index_smart_scale);
                            }
                            long j14 = indexSmartScaleDeviceSettings.f43085a;
                            ManagePeopleActivity.f43042n.getClass();
                            productDisplayName.getClass();
                            Intent intent = new Intent(indexSmartScaleDeviceSettings, (Class<?>) ManagePeopleActivity.class);
                            intent.putExtra("GCM_deviceUnitID", j14);
                            intent.putExtra("GCM_deviceDisplayName", productDisplayName);
                            indexSmartScaleDeviceSettings.startActivity(intent);
                        }
                        break;
                    default:
                        int i17 = IndexSmartScaleDeviceSettings.f43084d;
                        j jVar2 = f.a().f152045a;
                        long j15 = indexSmartScaleDeviceSettings.f43085a;
                        jVar2.getClass();
                        if (j.i(j15, null) == null) {
                            i2.f(a2.SETTINGS, "IndexSmartScaleDeviceSettings", "No record found in device database for " + indexSmartScaleDeviceSettings.f43085a);
                        } else {
                            long j16 = indexSmartScaleDeviceSettings.f43085a;
                            DisplayWiFiNetworksActivity.f43230m.getClass();
                            Intent intent2 = new Intent(indexSmartScaleDeviceSettings, (Class<?>) DisplayWiFiNetworksActivity.class);
                            intent2.putExtra("GCM_deviceUnitID", j16);
                            indexSmartScaleDeviceSettings.startActivity(intent2);
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f43087c = new View.OnClickListener(this) { // from class: oh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndexSmartScaleDeviceSettings f132163b;

            {
                this.f132163b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                IndexSmartScaleDeviceSettings indexSmartScaleDeviceSettings = this.f132163b;
                switch (i16) {
                    case 0:
                        int i17 = IndexSmartScaleDeviceSettings.f43084d;
                        if (i.a(indexSmartScaleDeviceSettings)) {
                            j jVar = f.a().f152045a;
                            long j8 = indexSmartScaleDeviceSettings.f43085a;
                            jVar.getClass();
                            sd2.f fVarI = j.i(j8, null);
                            String productDisplayName = fVarI != null ? fVarI.getProductDisplayName() : null;
                            if (productDisplayName == null) {
                                productDisplayName = indexSmartScaleDeviceSettings.getString(R.string.device_index_smart_scale);
                            }
                            long j14 = indexSmartScaleDeviceSettings.f43085a;
                            ManagePeopleActivity.f43042n.getClass();
                            productDisplayName.getClass();
                            Intent intent = new Intent(indexSmartScaleDeviceSettings, (Class<?>) ManagePeopleActivity.class);
                            intent.putExtra("GCM_deviceUnitID", j14);
                            intent.putExtra("GCM_deviceDisplayName", productDisplayName);
                            indexSmartScaleDeviceSettings.startActivity(intent);
                        }
                        break;
                    default:
                        int i18 = IndexSmartScaleDeviceSettings.f43084d;
                        j jVar2 = f.a().f152045a;
                        long j15 = indexSmartScaleDeviceSettings.f43085a;
                        jVar2.getClass();
                        if (j.i(j15, null) == null) {
                            i2.f(a2.SETTINGS, "IndexSmartScaleDeviceSettings", "No record found in device database for " + indexSmartScaleDeviceSettings.f43085a);
                        } else {
                            long j16 = indexSmartScaleDeviceSettings.f43085a;
                            DisplayWiFiNetworksActivity.f43230m.getClass();
                            Intent intent2 = new Intent(indexSmartScaleDeviceSettings, (Class<?>) DisplayWiFiNetworksActivity.class);
                            intent2.putExtra("GCM_deviceUnitID", j16);
                            indexSmartScaleDeviceSettings.startActivity(intent2);
                        }
                        break;
                }
            }
        };
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_index_smart_scale);
        initActionBar(true, R.string.devices_settings_device_settings);
        if (getIntent().getExtras() != null) {
            this.f43085a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        }
        if (this.f43085a < 0) {
            i2.f(a2.SETTINGS, "IndexSmartScaleDeviceSettings", "Invalid unit ID!");
            finish();
            return;
        }
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildIndex");
        }
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_indexss_manage_people_btn)).setOnClickListener(this.f43086b);
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_indexss_wifi_networks_btn)).setOnClickListener(this.f43087c);
    }
}
