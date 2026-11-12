package com.garmin.android.apps.connectmobile.bikesensors;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.view.GCMComplexBanner;
import java.util.Timer;
import rd2.j;
import t61.m;
import tv.f;
import tv.h;
import tv.i;
import tv.s;
import xv.g;
import zb0.u0;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceSettingsFirmwareUpdate extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b {
    public static final /* synthetic */ int B = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.bikesensors.c.b f30781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.bikesensors.b f30782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f30783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30784d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Timer f30786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Timer f30787g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f30788h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f30789i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f30791k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f30792l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f30793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f30794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f30795o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Button f30798r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f30799t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f30800v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f30801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexBanner f30802x;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f30785e = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30790j = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f30796p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f30797q = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f30803y = new a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f30804z = new b();
    public final c A = new c();

    public class a extends xv.i {
        public a() {
        }

        @Override // xv.i
        public final void deleteCachedFiles(xv.a aVar) {
            DeviceSettingsFirmwareUpdate.this.f30783c.a();
        }

        @Override // xv.i
        public final void fileTransferComplete(g gVar) {
            int i14 = gVar.f192267a;
            DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate = DeviceSettingsFirmwareUpdate.this;
            deviceSettingsFirmwareUpdate.f30790j = 100;
            GCMComplexBanner gCMComplexBanner = deviceSettingsFirmwareUpdate.f30802x;
            if (i14 != 0) {
                gCMComplexBanner.post(new f(deviceSettingsFirmwareUpdate, 1));
            } else {
                gCMComplexBanner.post(new f(deviceSettingsFirmwareUpdate, 2));
            }
        }

        @Override // xv.i
        public final void fileTransferProgressUpdate(xv.h hVar) {
            int i14 = (int) hVar.f192268a;
            DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate = DeviceSettingsFirmwareUpdate.this;
            deviceSettingsFirmwareUpdate.f30790j = i14;
            if (i14 >= 100) {
                deviceSettingsFirmwareUpdate.f30790j = 99;
            }
            deviceSettingsFirmwareUpdate.f30802x.post(new f(deviceSettingsFirmwareUpdate, 3));
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (TextUtils.isEmpty(intent.getAction()) || intent.getExtras() == null || !"android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                return;
            }
            long longExtra = intent.getLongExtra("extra_download_id", 0L);
            DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate = DeviceSettingsFirmwareUpdate.this;
            if (longExtra == deviceSettingsFirmwareUpdate.f30785e) {
                int i14 = DeviceSettingsFirmwareUpdate.B;
                deviceSettingsFirmwareUpdate.f30790j = 0;
                deviceSettingsFirmwareUpdate.f30802x.setProgress(0);
                GCMSettingManager.K(-1L);
                deviceSettingsFirmwareUpdate.f30782b.a(longExtra);
            }
        }
    }

    public class c implements la2.a {
        public c() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            long f172494b = hVar.f111673a.getF172494b();
            DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate = DeviceSettingsFirmwareUpdate.this;
            if (f172494b != deviceSettingsFirmwareUpdate.f30794n || deviceSettingsFirmwareUpdate.f30790j == 100) {
                return;
            }
            GCMSettingManager.K(-1L);
            deviceSettingsFirmwareUpdate.finish();
        }
    }

    public static void da(vv.f fVar, com.garmin.android.apps.connectmobile.bikesensors.c.b bVar, long j8, String str, String str2) {
        Intent intent = new Intent(fVar, (Class<?>) DeviceSettingsFirmwareUpdate.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_FIRMWARE_ITEM", bVar);
        bundle.putString("EXTRA_INSTALL_BUTTON_TEXT", str2);
        bundle.putString("EXTRA_PRODUCT_NUMBER", str);
        bundle.putLong("GCM_deviceUnitID", j8);
        intent.putExtras(bundle);
        fVar.startActivityForResult(intent, 10);
    }

    @Override // com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b
    public final void F6() {
        runOnUiThread(new f(this, 4));
    }

    @Override // com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b
    public final void O0(int i14, int i15) {
        runOnUiThread(new com.mapbox.maps.d(this, i14, i15, 5));
    }

    @Override // com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b
    public final void Y4(int i14) {
        runOnUiThread(new tv.g(this, i14, 1));
    }

    public final void ca(int i14, boolean z14) {
        modifyBottomInsets(k2.UPDATE_INSETS, this.f30802x);
        this.f30802x.setVisibility(0);
        this.f30802x.setStyle(GCMComplexBanner.c.INFO);
        this.f30802x.setPrimaryText(this.f30793m);
        this.f30802x.setSecondaryText(getString(R.string.device_settings_vector_sending_updates));
        this.f30802x.setShowProgress(true);
        this.f30802x.setMinimized(false);
        this.f30802x.setProgress(i14);
        this.f30802x.setBannerListener(null);
        this.f30798r.setVisibility(8);
        if (!z14) {
            ea();
            return;
        }
        ea();
        this.f30786f = new Timer();
        h hVar = new h(this);
        this.f30788h = hVar;
        this.f30786f.schedule(hVar, 0L, 2000L);
    }

    public final void ea() {
        h hVar = this.f30788h;
        if (hVar != null) {
            hVar.cancel();
        }
        Timer timer = this.f30786f;
        if (timer != null) {
            timer.cancel();
            this.f30786f.purge();
            this.f30786f = null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        i iVar = this.f30789i;
        if (iVar != null) {
            iVar.cancel();
        }
        Timer timer = this.f30787g;
        if (timer != null) {
            timer.cancel();
            this.f30787g.purge();
            this.f30787g = null;
        }
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_vector_firmware_update);
        this.f30799t = (TextView) findViewById(R.id.title);
        this.f30800v = (TextView) findViewById(R.id.current_version_no);
        this.f30801w = (TextView) findViewById(R.id.update_version_no);
        this.f30798r = (Button) findViewById(R.id.install_button);
        this.f30802x = (GCMComplexBanner) findViewById(R.id.status_banner);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            initActionBar(true, u0.t(extras.getString("EXTRA_PRODUCT_NUMBER")) ? getString(R.string.device_settings_vector_firmware_update_title) : getString(R.string.lbl_update));
            this.f30794n = extras.getLong("GCM_deviceUnitID");
            j jVar = rd2.f.a().f152045a;
            long j8 = this.f30794n;
            jVar.getClass();
            sd2.f fVarI = j.i(j8, null);
            this.f30793m = TextUtils.isEmpty(fVarI.getDisplayName()) ? fVarI.getProductDisplayName() : fVarI.getDisplayName();
            this.f30795o = fVarI.getSoftwareVersion();
            com.garmin.android.apps.connectmobile.bikesensors.c.b bVar = (com.garmin.android.apps.connectmobile.bikesensors.c.b) extras.getParcelable("EXTRA_FIRMWARE_ITEM");
            this.f30781a = bVar;
            if (bVar != null) {
                this.f30791k = bVar.f30868c;
                this.f30792l = bVar.f30867b;
                this.f30784d = bVar.f30866a;
            }
            this.f30797q = extras.getString("EXTRA_INSTALL_BUTTON_TEXT", getString(R.string.device_settings_vector_upload_firmware_update));
            this.f30796p = extras.getBoolean("EXTRA_NAVIGATE_TO_SETTINGS", false);
        }
        this.f30798r.setText(this.f30797q);
        String str = this.f30795o;
        if (str == null) {
            str = "";
        }
        this.f30800v.setText(getString(R.string.lbl_your_sw_version, uv.j.a(str)));
        this.f30801w.setText(getString(R.string.lbl_latest_sw_version, this.f30791k));
        this.f30783c = s.b(this, this.f30794n);
        if (TextUtils.isEmpty(this.f30791k) && TextUtils.isEmpty(this.f30792l) && TextUtils.isEmpty(this.f30784d) && GCMSettingManager.f41537c.getLong("VECTOR_FIRMWARE_DOWNLOAD_ID", -1L) == -1) {
            Toast.makeText(this, getString(R.string.txt_something_went_wrong_try_again), 0).show();
            finish();
            return;
        }
        if (this.f30783c.c()) {
            ca(0, false);
            String str2 = this.f30783c.f166541d;
            this.f30791k = str2;
            this.f30801w.setText(getString(R.string.lbl_latest_sw_version, str2));
        }
        this.f30798r.setOnClickListener(new m(this, 6));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DOWNLOAD_COMPLETE");
        a7.b.registerReceiver(this, this.f30804z, intentFilter, 2);
        da2.d.b().f58886a.b(this.A);
        com.garmin.android.apps.connectmobile.bikesensors.b bVar2 = new com.garmin.android.apps.connectmobile.bikesensors.b(this, this);
        this.f30782b = bVar2;
        bVar2.start();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.garmin.android.apps.connectmobile.bikesensors.b bVar = this.f30782b;
        if (bVar != null) {
            bVar.quit();
        }
        try {
            unregisterReceiver(this.f30804z);
            da2.d.b().f58886a.i(this.A);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        ea();
        this.f30783c.f166542e.e();
        oi2.a.b(this.f30803y);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f30785e != -1) {
            ea();
            this.f30786f = new Timer();
            h hVar = new h(this);
            this.f30788h = hVar;
            this.f30786f.schedule(hVar, 0L, 2000L);
        }
        oi2.a.a(this.f30803y);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (this.f30783c.c()) {
            return;
        }
        long j8 = GCMSettingManager.f41537c.getLong("VECTOR_FIRMWARE_DOWNLOAD_ID", -1L);
        this.f30785e = j8;
        if (j8 != -1) {
            showProgressOverlay();
            this.f30782b.c(this.f30785e);
        } else if (TextUtils.isEmpty(this.f30784d)) {
            Toast.makeText(this, getString(R.string.txt_something_went_wrong_try_again), 0).show();
            finish();
        } else if (this.f30783c.c()) {
            ca(0, false);
            String str = this.f30783c.f166541d;
            this.f30791k = str;
            this.f30801w.setText(getString(R.string.lbl_latest_sw_version, str));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.bikesensors.b.InterfaceC0491b
    public final void s3(int i14) {
        runOnUiThread(new tv.g(this, i14, 0));
    }
}
