package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gfdi.configuration.SupportedCapability;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectIQAppManagementListActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f31745d = new n();

    public final void ca(l lVar) {
        Intent intent = new Intent(this, (Class<?>) ConnectIQDownloadListActivity.class);
        intent.putExtra("CONNECT_IQ_CATEGORY", lVar);
        intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", this.f31743b);
        intent.putExtra("CONNECT_IQ_DEVICE_SKU", this.f31744c);
        startActivityForResult(intent, 0);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == 999) {
            finish();
        }
    }

    public void onClickComplexOneLineButton(View view2) {
        int id3 = ((View) view2.getParent()).getId();
        if (id3 == R.id.custom_bttn_apps) {
            ca(l.APPS);
            return;
        }
        if (id3 == R.id.custom_bttn_widgets) {
            ca(l.WIDGETS);
            return;
        }
        if (id3 == R.id.custom_bttn_watchfaces) {
            ca(l.WATCH_FACES);
            return;
        }
        if (id3 == R.id.custom_bttn_datafields) {
            ca(l.DATA_FIELDS);
        } else if (id3 == R.id.custom_bttn_storage_mgt) {
            Intent intent = new Intent(this, (Class<?>) ConnectIQStorageManagementActivity.class);
            intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", this.f31743b);
            startActivityForResult(intent, 0);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_connect_iq_category_list_view);
        super.initActionBar(true, R.string.connect_iq_activities_app_management);
        this.f31743b = getIntent().getLongExtra("CONNECT_IQ_DEVICE_UNIT_ID", -1L);
        this.f31744c = getIntent().getStringExtra("CONNECT_IQ_DEVICE_SKU");
        if (km2.a.i(this.f31743b, null, SupportedCapability.CONNECTIQ_WATCH_APP_DOWNLOAD.ordinal())) {
            findViewById(R.id.custom_bttn_apps).setVisibility(0);
        }
        if (km2.a.i(this.f31743b, null, SupportedCapability.CONNECTIQ_WATCH_FACE_DOWNLOAD.ordinal())) {
            findViewById(R.id.custom_bttn_watchfaces).setVisibility(0);
        }
        if (km2.a.i(this.f31743b, null, SupportedCapability.CONNECTIQ_WIDGET_DOWNLOAD.ordinal())) {
            findViewById(R.id.custom_bttn_widgets).setVisibility(0);
        }
        if (km2.a.i(this.f31743b, null, SupportedCapability.CONNECTIQ_DATA_FIELD_DOWNLOAD.ordinal())) {
            findViewById(R.id.custom_bttn_datafields).setVisibility(0);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f31742a) {
            n nVar = this.f31745d;
            nVar.getClass();
            da2.d.b().f58886a.i(nVar);
            this.f31742a = false;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f31742a) {
            return;
        }
        this.f31745d.a(this, this.f31743b);
        this.f31742a = true;
    }
}
