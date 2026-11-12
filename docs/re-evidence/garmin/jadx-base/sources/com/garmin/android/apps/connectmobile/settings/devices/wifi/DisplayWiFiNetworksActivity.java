package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import cd0.h0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import wn1.i0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/DisplayWiFiNetworksActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/b$a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DisplayWiFiNetworksActivity extends com.garmin.android.apps.connectmobile.c implements com.garmin.android.apps.connectmobile.settings.devices.wifi.b.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f43230m = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.l f43232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f43235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.appcompat.app.e f43236f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public di1.b f43238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public di1.c f43239i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f43231a = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f43237g = new Handler();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Timer f43240j = new Timer();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f43241k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f43242l = new h0(this, 28);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/wifi/DisplayWiFiNetworksActivity$b", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements la2.a {
        public b() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            long f92746j = bVar.f111632a.getF92746j();
            DisplayWiFiNetworksActivity displayWiFiNetworksActivity = DisplayWiFiNetworksActivity.this;
            if (f92746j != displayWiFiNetworksActivity.f43231a) {
                return;
            }
            if (!displayWiFiNetworksActivity.isFinishing()) {
                displayWiFiNetworksActivity.da();
            }
            displayWiFiNetworksActivity.fa();
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            long f92746j = hVar.f111673a.getF92746j();
            DisplayWiFiNetworksActivity displayWiFiNetworksActivity = DisplayWiFiNetworksActivity.this;
            if (f92746j != displayWiFiNetworksActivity.f43231a) {
                return;
            }
            displayWiFiNetworksActivity.ga();
            if (displayWiFiNetworksActivity.isFinishing()) {
                return;
            }
            v supportFragmentManager = displayWiFiNetworksActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            Fragment fragmentG = supportFragmentManager.G("DisplayWiFiNetworksFragment");
            if (fragmentG != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.k(fragmentG);
                aVar.s(true, true);
                displayWiFiNetworksActivity.showProgressOverlay();
                displayWiFiNetworksActivity.ea();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/wifi/DisplayWiFiNetworksActivity$c", "Ljava/util/TimerTask;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            a aVar = DisplayWiFiNetworksActivity.f43230m;
            DisplayWiFiNetworksActivity displayWiFiNetworksActivity = DisplayWiFiNetworksActivity.this;
            displayWiFiNetworksActivity.getClass();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            String str = "retrieveWiFiNetworks @" + System.currentTimeMillis();
            aVar2.getClass();
            i2.a.b(a2Var, "DisplayWiFiNetworksActivity", str);
            displayWiFiNetworksActivity.f43238h = new di1.b(displayWiFiNetworksActivity);
            i0 i0VarM = i0.M();
            long j8 = displayWiFiNetworksActivity.f43231a;
            di1.b bVar = displayWiFiNetworksActivity.f43238h;
            i0VarM.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new di1.h(j8, i0VarM), bVar);
        }
    }

    public static final void ca(DisplayWiFiNetworksActivity displayWiFiNetworksActivity, ArrayList arrayList, ArrayList arrayList2) {
        displayWiFiNetworksActivity.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "placeDisplayWiFiNetworksFragment");
        displayWiFiNetworksActivity.hideProgressOverlay();
        com.garmin.android.apps.connectmobile.settings.devices.wifi.b.C0803b c0803b = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.f43259w;
        long j8 = displayWiFiNetworksActivity.f43231a;
        c0803b.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("GCM_deviceUnitID", j8);
        if (arrayList != null && arrayList.size() > 0) {
            bundle.putParcelableArrayList("KEY_INITIAL_NETWORKS", arrayList);
        }
        if (arrayList2 != null && arrayList2.size() > 0) {
            bundle.putParcelableArrayList("KEY_INITIAL_VERIFIED_NETWORKS", arrayList2);
        }
        bundle.putInt("KEY_START_UP_MODE", 102);
        bundle.putBoolean("VERIFY_WIFI_NETWORK_AFTER_MODIFICATION", true);
        com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar = new com.garmin.android.apps.connectmobile.settings.devices.wifi.b();
        bVar.setArguments(bundle);
        v supportFragmentManager = displayWiFiNetworksActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.l(R.id.wifi_component_container, bVar, "DisplayWiFiNetworksFragment");
        aVar2.d("DisplayWiFiNetworksFragment");
        aVar2.s(true, true);
        Button button = displayWiFiNetworksActivity.f43235e;
        button.getClass();
        button.setEnabled(displayWiFiNetworksActivity.f43234d);
        Button button2 = displayWiFiNetworksActivity.f43235e;
        button2.getClass();
        button2.setVisibility(displayWiFiNetworksActivity.f43233c ? 0 : 8);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.wifi.b.a
    public final void K1() {
        this.f43234d = false;
        Button button = this.f43235e;
        button.getClass();
        button.setEnabled(false);
    }

    public final void da() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "dismissDeviceNotConnectedDialog");
        androidx.appcompat.app.e eVar = this.f43236f;
        if (eVar != null) {
            if (eVar.isShowing()) {
                i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "dismissDeviceNotConnectedDialog: dismissing dialog");
                androidx.appcompat.app.e eVar2 = this.f43236f;
                eVar2.getClass();
                eVar2.dismiss();
            }
            this.f43236f = null;
        }
    }

    public final void ea() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "showDeviceNotConnectedDialog");
        if (isFinishing() || this.f43236f != null) {
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment fragmentG = supportFragmentManager.G("SkipWiFiNetworksFragment");
        Fragment fragmentG2 = supportFragmentManager.G("DisplayWiFiNetworksFragment");
        androidx.appcompat.app.e.a aVar2 = new androidx.appcompat.app.e.a(this);
        if (fragmentG == null && fragmentG2 == null) {
            aVar2.setTitle(R.string.smart_scale_waiting_for_device_title);
            aVar2.setMessage(R.string.smart_scale_waiting_for_device_message_a);
        } else {
            aVar2.setTitle(R.string.smart_scale_device_disconnected_title);
            aVar2.setMessage(R.string.smart_scale_device_disconnected_message);
        }
        aVar2.setPositiveButton(android.R.string.ok, new di1.a(this, 0));
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "showDeviceNotConnectedDialog: showing dialog");
        androidx.appcompat.app.e eVarCreate = aVar2.create();
        this.f43236f = eVarCreate;
        eVarCreate.getClass();
        eVarCreate.show();
    }

    public final void fa() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "startRemoteDeviceInquiry");
        if (this.f43240j == null) {
            this.f43240j = new Timer();
        }
        Timer timer = this.f43240j;
        timer.getClass();
        timer.schedule(new c(), 0L, 5000L);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.wifi.b.a
    public final void g7() {
        this.f43234d = true;
        Button button = this.f43235e;
        button.getClass();
        button.setEnabled(true);
    }

    public final void ga() {
        if (this.f43240j != null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.SETTINGS;
            aVar.getClass();
            i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "stopRemoteDeviceInquiry");
            Timer timer = this.f43240j;
            timer.getClass();
            timer.cancel();
            Timer timer2 = this.f43240j;
            timer2.getClass();
            timer2.purge();
            this.f43240j = null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", ".onBackPressed()");
        if (this.f43233c && !this.f43234d) {
            new androidx.appcompat.app.e.a(this).setMessage(R.string.smart_scale_device_setup_abandon_setup_message_a).setPositiveButton(R.string.lbl_resume, new com.garmin.android.apps.connectmobile.connectiq.i(9)).setNegativeButton(R.string.lbl_cancel, new di1.a(this, 1)).setCancelable(false).show();
            return;
        }
        hk0.a.f().i(this.f43231a);
        setResult(-1);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", ".onCreate()");
        setContentView(R.layout.gcm3_wifi_display_networks);
        initActionBar(true, R.string.smart_scale_device_settings_wifi_networks);
        if (getIntent().getExtras() != null) {
            this.f43231a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
            Intent intent = getIntent();
            Parcelable parcelable = null;
            if (Build.VERSION.SDK_INT < 33) {
                Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("GCM_deviceDTO") : null;
                parcelable = (com.garmin.android.apps.connectmobile.devices.model.l) (parcelableExtra instanceof com.garmin.android.apps.connectmobile.devices.model.l ? parcelableExtra : null);
            } else if (intent != null) {
                parcelable = (Parcelable) intent.getParcelableExtra("GCM_deviceDTO", com.garmin.android.apps.connectmobile.devices.model.l.class);
            }
            this.f43232b = (com.garmin.android.apps.connectmobile.devices.model.l) parcelable;
            this.f43233c = getIntent().getBooleanExtra("GCM_extra_in_pairing_mode", false);
        }
        Button button = (Button) findViewById(R.id.button_next);
        this.f43235e = button;
        if (button != null) {
            button.setOnClickListener(new x(this, 17));
        }
        Button button2 = this.f43235e;
        if (button2 != null) {
            button2.setEnabled(false);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", ".onDestroy()");
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", ".onDestroy(): remove all callbacks & messages.");
        this.f43237g.removeCallbacksAndMessages(null);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", ".onNavigateUp()");
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", ".onPause()");
        ga();
        hideProgressOverlay();
        da();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", ".onResume()");
        showProgressOverlay();
        if (((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(this.f43231a)) {
            fa();
        } else {
            ea();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", ".onStart()");
        da2.d.b().f58886a.b(this.f43241k);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "DisplayWiFiNetworksActivity", ".onStop()");
        da2.d.b().f58886a.i(this.f43241k);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/DisplayWiFiNetworksActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REMOTE_DEVICE_INQUIRY_PERIOD_MILLISECONDS", "J", "DISCONNECTION_REMINDER_MILLISECONDS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
