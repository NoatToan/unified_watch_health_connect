package com.garmin.android.apps.connectmobile.devices.setup.wizard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import bd0.h0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.devices.setup.GDIAuthPairingAndroidNotificationPressedActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import com.google.android.gms.common.internal.ImagesContract;
import dv.k;
import i3.e5;
import la2.h;
import n23.j;

/* JADX INFO: loaded from: classes8.dex */
public class BLEDeviceSetupWizardActivity extends dd0.a implements com.garmin.android.apps.connectmobile.devices.setup.wizard.a.InterfaceC0581a, e.a, com.garmin.android.apps.connectmobile.devices.setup.wizard.d.a, com.garmin.android.apps.connectmobile.devices.setup.wizard.c.a, k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dd0.d f34460c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bd0.a f34462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Intent f34465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34466i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Fragment f34468k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f34461d = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34467j = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f34469l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f34470m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f34471n = new c();

    public class a implements la2.a {
        public a() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            bm2.d dVar = new bm2.d(bVar.f111632a);
            BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = BLEDeviceSetupWizardActivity.this;
            bLEDeviceSetupWizardActivity.f34461d.b(dVar.getF92746j());
            bLEDeviceSetupWizardActivity.f59153b.d(dVar, true);
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
            cd0.g gVar = BLEDeviceSetupWizardActivity.this.f59153b;
            String strName = cVar.f111634b.name();
            gVar.getClass();
            i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handleConnectingFailure(): " + strName);
            h0 h0Var = gVar.f26816d;
            if (h0Var != null) {
                h0Var.y(strName);
            }
        }

        @Override // la2.a
        public final void onDeviceDisconnected(h hVar) {
            BLEDeviceSetupWizardActivity.this.f59153b.H();
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            long f92746j;
            String macAddress;
            bd0.a aVar;
            l lVar;
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = BLEDeviceSetupWizardActivity.this;
            BLEDeviceSetupWizardActivity.ha(bLEDeviceSetupWizardActivity, "global", action, extras);
            DeviceProfile deviceProfile = (DeviceProfile) intent.getParcelableExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE");
            if (deviceProfile != null) {
                macAddress = deviceProfile.getMacAddress();
                f92746j = deviceProfile.getF92746j();
            } else {
                String string = extras != null ? extras.getString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", "") : "";
                f92746j = extras != null ? extras.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L) : -1L;
                macAddress = string;
            }
            cd0.g gVar = bLEDeviceSetupWizardActivity.f59153b;
            if ((f92746j <= 0 || (lVar = bLEDeviceSetupWizardActivity.f34461d) == null || f92746j != lVar.getF143511a()) && (TextUtils.isEmpty(macAddress) || (aVar = bLEDeviceSetupWizardActivity.f34462e) == null || !macAddress.equalsIgnoreCase(aVar.f17520a))) {
                StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(f92746j, "[", macAddress, "/");
                sbJ.append("]");
                String string2 = sbJ.toString();
                StringBuilder sb3 = new StringBuilder("[");
                bd0.a aVar2 = bLEDeviceSetupWizardActivity.f34462e;
                if (aVar2 != null) {
                    sb3.append(aVar2.f17520a);
                }
                if (bLEDeviceSetupWizardActivity.f34461d != null) {
                    sb3.append("/");
                    sb3.append(bLEDeviceSetupWizardActivity.f34461d.getF143511a());
                }
                sb3.append("]");
                i2.m(a2.DEVICES, "BLEDeviceSetupWizardActivity", "Ignoring incoming event " + string2 + ", as the device being paired is " + ((Object) sb3));
                return;
            }
            if ("com.garmin.android.gdi.ACTION_PAIRING_PASSKEY_REQUIRED".equals(action)) {
                gVar.L(intent);
                return;
            }
            if ("com.garmin.android.gdi.ACTION_DEVICE_AUTHENTICATED".equals(action)) {
                h0 h0Var = gVar.f26816d;
                if (h0Var != null) {
                    h0Var.z();
                    gVar.f26816d.h();
                }
                gVar.f26802m = intent.getByteArrayExtra("com.garmin.android.gdi.EXTRA_ENCRYPTED_DIVERSIFIER");
                gVar.f26803n = intent.getByteArrayExtra("com.garmin.android.gdi.EXTRA_RANDOM_NUMBER");
                gVar.f26804o = intent.getByteArrayExtra("com.garmin.android.gdi.EXTRA_LONG_TERM_KEY");
                i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handleDeviceAuthenticated()\n  ediv" + ft2.b.a(gVar.f26802m) + "\n  rand" + ft2.b.a(gVar.f26803n) + "\n  ltk" + ft2.b.a(gVar.f26804o));
                return;
            }
            if ("com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTED".equals(action)) {
                gVar.N(true);
                return;
            }
            if ("com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTING_FAILURE".equals(action)) {
                gVar.N(false);
                return;
            }
            if (!"com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ".equals(action)) {
                if ("com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ_FAILURE".equals(action)) {
                    gVar.J();
                }
            } else {
                byte[] byteArrayExtra = intent.getByteArrayExtra("com.garmin.android.gdi.EXTRA_FILE_CONTENT");
                if (byteArrayExtra == null || byteArrayExtra.length <= 0) {
                    gVar.J();
                } else {
                    gVar.K(byteArrayExtra);
                }
            }
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            l lVar;
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity = BLEDeviceSetupWizardActivity.this;
            BLEDeviceSetupWizardActivity.ha(bLEDeviceSetupWizardActivity, ImagesContract.LOCAL, action, extras);
            long j8 = extras != null ? extras.getLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", -1L) : -1L;
            cd0.g gVar = bLEDeviceSetupWizardActivity.f59153b;
            if (j8 <= 0 || (lVar = bLEDeviceSetupWizardActivity.f34461d) == null || j8 != lVar.getF143511a()) {
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_STARTED".equals(action)) {
                h0 h0Var = gVar.f26816d;
                if (h0Var != null) {
                    h0Var.b();
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_PREPARED".equals(action)) {
                long longExtra = intent.getLongExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_TOTAL_FILE_SIZE", 0L);
                h0 h0Var2 = gVar.f26816d;
                if (h0Var2 != null) {
                    h0Var2.k(longExtra);
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_DEVICE_TRANSFER_PROGRESS".equals(action)) {
                long longExtra2 = intent.getLongExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_CUMULATIVE_FILE_SIZE", 0L);
                h0 h0Var3 = gVar.f26816d;
                if (h0Var3 != null) {
                    h0Var3.i(longExtra2);
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_EXECUTED".equals(action)) {
                String stringExtra = intent.getStringExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FAILURE_REASON");
                h0 h0Var4 = gVar.f26816d;
                if (h0Var4 != null) {
                    if (stringExtra != null) {
                        h0Var4.o(stringExtra);
                        return;
                    } else {
                        h0Var4.E();
                        return;
                    }
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_PREPARED".equals(action)) {
                int intExtra = intent.getIntExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_TOTAL_FILE_COUNT", 0);
                h0 h0Var5 = gVar.f26816d;
                if (h0Var5 != null) {
                    h0Var5.l(intExtra);
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_DEVICE_TRANSFER_PROGRESS".equals(action)) {
                int intExtra2 = intent.getIntExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_CUMULATIVE_FILE_COUNT", 0);
                h0 h0Var6 = gVar.f26816d;
                if (h0Var6 != null) {
                    h0Var6.e(intExtra2);
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_SOFTWARE_UPDATE_TRANSFER_START".equals(action)) {
                gVar.getClass();
                i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handleSyncDownloadSoftwareUpdateStart()");
                h0 h0Var7 = gVar.f26816d;
                if (h0Var7 != null) {
                    h0Var7.Q();
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_SOFTWARE_UPDATE_TRANSFER_COMPLETE".equals(action)) {
                String stringExtra2 = intent.getStringExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FAILURE_REASON");
                gVar.getClass();
                i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handleSyncDownloadSoftwareUpdateComplete()");
                h0 h0Var8 = gVar.f26816d;
                if (h0Var8 != null) {
                    if (stringExtra2 != null) {
                        h0Var8.s(stringExtra2);
                        return;
                    } else {
                        h0Var8.U();
                        return;
                    }
                }
                return;
            }
            if (!"com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_EXECUTED".equals(action)) {
                if ("com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_FINISHED".equals(action)) {
                    gVar.M(intent.getIntExtra("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS", 1));
                    return;
                }
                return;
            }
            String stringExtra3 = intent.getStringExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FAILURE_REASON");
            gVar.getClass();
            i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handleSyncDownloadFinished()");
            h0 h0Var9 = gVar.f26816d;
            if (h0Var9 != null) {
                if (stringExtra3 != null) {
                    h0Var9.X(stringExtra3);
                } else {
                    h0Var9.A();
                }
            }
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34475a;

        static {
            int[] iArr = new int[GDIAuthPairingAndroidNotificationPressedActivity.b.values().length];
            f34475a = iArr;
            try {
                iArr[GDIAuthPairingAndroidNotificationPressedActivity.b.ENTER_PASSKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34475a[GDIAuthPairingAndroidNotificationPressedActivity.b.INIT_AUTH_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void ga(BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity, boolean z14, boolean z15) {
        if (z15) {
            bLEDeviceSetupWizardActivity.f59153b.o(true);
            if (z14) {
                super.onBackPressed();
            } else {
                super.onNavigateUp();
            }
        }
    }

    public static void ha(BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity, String str, String str2, Bundle bundle) {
        bLEDeviceSetupWizardActivity.getClass();
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(str);
        sb3.append("] ");
        sb3.append(str2);
        sb3.append(":");
        if (bundle == null) {
            sb3.append("no extras");
        } else {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                sb3.append("\n  ");
                if (obj != null) {
                    StringBuilder sbL = e5.l(str3, " (", obj.toString(), ") (", obj.getClass().getName());
                    sbL.append(")");
                    sb3.append(sbL.toString());
                } else {
                    sb3.append(str3 + " (NULL value)");
                }
            }
        }
        i2.d("BLEDeviceSetupWizardActivity#receiverExtras", sb3.toString());
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.wizard.d.a
    public final void C8() {
        Fragment fragmentW = this.f59153b.w();
        if (fragmentW != null) {
            ia(fragmentW, null, false);
            return;
        }
        Intent intent = this.f34465h;
        if (intent != null) {
            startActivity(intent);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.wizard.c.a
    public final void L3() {
        Intent intent = this.f34465h;
        if (intent != null) {
            startActivity(intent);
        }
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.wizard.e.a
    public final void V0() {
        l lVar = this.f59152a;
        Intent intent = new Intent(this, (Class<?>) BLEScanningWizardActivity.class);
        intent.putExtra("GCM_deviceDTO", lVar);
        startActivity(intent);
        this.f34467j = true;
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.wizard.a.InterfaceC0581a
    public final void a8(String str, boolean z14) {
        if (!str.equals("REQUEST_DEVICE_RESET")) {
            if (str.equals("REPLACE_ACTIVITY_TRACKER")) {
                if (getSupportFragmentManager().M() > 0) {
                    getSupportFragmentManager().Z();
                }
                cd0.g gVar = this.f59153b;
                if (gVar != null) {
                    gVar.O(z14);
                    return;
                }
                return;
            }
            return;
        }
        if (getSupportFragmentManager().M() > 0) {
            getSupportFragmentManager().Z();
        }
        cd0.g gVar2 = this.f59153b;
        if (gVar2 != null) {
            if (!z14) {
                gVar2.r(0, true, null, null);
                return;
            }
            i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".resetDevice()");
            h0 h0Var = gVar2.f26816d;
            if (h0Var != null) {
                h0Var.R();
            }
            hk0.a.f().h(gVar2.c());
        }
    }

    @Override // dd0.a
    public final void ea() {
        cd0.g gVar = this.f59153b;
        l lVar = this.f59152a;
        dd0.c cVar = new dd0.c(this);
        bm2.a aVarB = this.f34462e.b();
        gVar.f26813a = this;
        gVar.f26814b = lVar;
        gVar.f26816d = cVar;
        gVar.f26796g = aVarB;
    }

    @Override // dd0.a
    public final void fa(Bundle bundle) {
        super.fa(bundle);
        if (bundle != null) {
            this.f34461d = (l) bundle.getParcelable("GCM_deviceDTO");
            this.f34462e = (bd0.a) bundle.getParcelable("GCM_bleDevice");
        }
        if (this.f34461d == null || this.f34462e == null) {
            da();
        }
    }

    public final void ia(Fragment fragment, String str, boolean z14) {
        if (isFinishing()) {
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarC = j.c(supportFragmentManager, supportFragmentManager, R.id.device_setup_wizard_fragment, fragment, str);
        if (z14) {
            aVarC.d(null);
        }
        aVarC.e();
    }

    public final void ja(int i14) {
        com.garmin.android.apps.connectmobile.devices.setup.wizard.d dVar = (com.garmin.android.apps.connectmobile.devices.setup.wizard.d) getSupportFragmentManager().G("DEVICE_SETUP_FRAGMENT");
        if (dVar == null || !dVar.isAdded() || i14 <= dVar.f34519a.getProgress()) {
            return;
        }
        dVar.f34519a.setProgress(i14);
    }

    public final void ka() {
        String string = getString(R.string.lbl_setup_failed);
        String strF = this.f59153b.F();
        boolean z14 = this.f59153b.A() != -1;
        cd0.g gVar = this.f59153b;
        ia(z14 ? e.v6(gVar.A(), string, strF) : e.u6(gVar.B(), string, strF), null, false);
    }

    public final void la() {
        if (this.f34463f) {
            z9.a.a(this).d(this.f34471n);
            this.f34463f = false;
        }
        if (this.f34464g) {
            unregisterReceiver(this.f34470m);
            this.f34464g = false;
            da2.d.b().f58886a.i(this.f34469l);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f34466i) {
            super.onBackPressed();
        } else {
            new com.garmin.android.apps.connectmobile.devices.setup.a(this, new com.google.android.exoplayer2.trackselection.b(this, true, 1));
        }
    }

    @Override // dd0.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GarminDeviceWakefulService.g("BLEDeviceSetupWizardActivity", true);
        i2.a(a2.DEVICES, "BLEDeviceSetupWizardActivity", ".onCreate(): setIsUserInPairingFlow(true)");
        this.f34460c = (dd0.d) new x1(this).a(dd0.d.class);
    }

    @Override // dd0.a, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f34467j) {
            return;
        }
        GarminDeviceWakefulService.g("BLEDeviceSetupWizardActivity", false);
        i2.a(a2.DEVICES, "BLEDeviceSetupWizardActivity", ".onDestroy(): setIsUserInPairingFlow(false)");
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        if (this.f34466i) {
            return super.onNavigateUp();
        }
        new com.garmin.android.apps.connectmobile.devices.setup.a(this, new com.google.android.exoplayer2.trackselection.b(this, false, 1));
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        BLEDeviceSetupWizardActivity bLEDeviceSetupWizardActivity;
        super.onStart();
        getWindow().addFlags(128);
        if (this.f34466i) {
            return;
        }
        if (!this.f34463f) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_STARTED");
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_PREPARED");
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_DEVICE_TRANSFER_PROGRESS");
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_EXECUTED");
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_PREPARED");
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_DEVICE_TRANSFER_PROGRESS");
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_SOFTWARE_UPDATE_TRANSFER_START");
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_SOFTWARE_UPDATE_TRANSFER_COMPLETE");
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_EXECUTED");
            intentFilter.addAction("com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_FINISHED");
            z9.a.a(this).b(intentFilter, this.f34471n);
            this.f34463f = true;
        }
        if (this.f34464g) {
            bLEDeviceSetupWizardActivity = this;
        } else {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.garmin.android.gdi.ACTION_PAIRING_PASSKEY_REQUIRED");
            intentFilter2.addAction("com.garmin.android.gdi.ACTION_DEVICE_AUTHENTICATED");
            intentFilter2.addAction("com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ");
            intentFilter2.addAction("com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ_FAILURE");
            intentFilter2.addAction("com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTED");
            intentFilter2.addAction("com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTING_FAILURE");
            bLEDeviceSetupWizardActivity = this;
            a7.b.registerReceiver(bLEDeviceSetupWizardActivity, this.f34470m, intentFilter2, oa2.b.d(getApplicationContext()), null, 2);
            bLEDeviceSetupWizardActivity.f34464g = true;
            da2.d.b().f58886a.b(bLEDeviceSetupWizardActivity.f34469l);
        }
        cd0.g gVar = bLEDeviceSetupWizardActivity.f59153b;
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("GCM_isFromAndroidNotification")) {
            int i14 = d.f34475a[GDIAuthPairingAndroidNotificationPressedActivity.b.valueOf(extras.getString("GDIAuthPairingAndroidNotificationPressedActivity_extra_setup_action_to_execute")).ordinal()];
            if (i14 == 1) {
                gVar.L(getIntent());
                return;
            } else {
                if (i14 != 2) {
                    return;
                }
                gVar.G();
                return;
            }
        }
        gVar.p();
        int iZ = bLEDeviceSetupWizardActivity.f59153b.z();
        int iX = bLEDeviceSetupWizardActivity.f59153b.x();
        String strY = bLEDeviceSetupWizardActivity.f59153b.y();
        com.garmin.android.apps.connectmobile.devices.setup.wizard.d dVar = new com.garmin.android.apps.connectmobile.devices.setup.wizard.d();
        Bundle bundle = new Bundle();
        bundle.putInt("DEVICE_SETUP_PROGRESS_IMAGE_RES_ID", iZ);
        bundle.putInt("DEVICE_SETUP_COMPLETE_IMAGE_RES_ID", iX);
        bundle.putString("DEVICE_SETUP_MESSAGE", strY);
        bundle.putInt("DEVICE_SETUP_PROGRESS_MAX", 11);
        dVar.setArguments(bundle);
        ia(dVar, "DEVICE_SETUP_FRAGMENT", false);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        getWindow().clearFlags(128);
        la();
    }
}
