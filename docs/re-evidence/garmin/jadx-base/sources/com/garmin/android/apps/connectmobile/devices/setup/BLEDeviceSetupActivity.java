package com.garmin.android.apps.connectmobile.devices.setup;

import a0.h;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.camera.camera2.internal.compat.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import bd0.h0;
import bd0.y;
import bd0.z;
import com.garmin.android.apps.connectmobile.GarminAppGateway;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.android.apps.connectmobile.devices.model.l;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q2;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.pairing.PairingException;
import com.google.android.gms.common.internal.ImagesContract;
import dv.k;
import i3.e5;
import java.util.concurrent.atomic.AtomicBoolean;
import la2.i;
import org.slf4j.Logger;
import zb0.t;

/* JADX INFO: loaded from: classes8.dex */
public class BLEDeviceSetupActivity extends com.garmin.android.apps.connectmobile.c implements k, q2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f34387q = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f34397j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34388a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f34389b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f34390c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bd0.a f34391d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bm2.d f34392e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34393f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public cd0.c f34394g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f34395h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f34396i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f34398k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f34399l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a f34400m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f34401n = new b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f34402o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f34403p = new d();

    public class a implements h0 {
        public a() {
        }

        @Override // bd0.h0
        public final void A() {
            y yVar = y.SYNC_DOWNLOAD_PREPARED;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            bLEDeviceSetupActivity.f34399l.post(new bd0.c(bLEDeviceSetupActivity, yVar, true, (String) null));
        }

        @Override // rm2.a
        public final void B(BluetoothDevice bluetoothDevice) {
            BLEDeviceSetupActivity.this.f34397j.setVisibility(0);
        }

        @Override // bd0.h0
        public final void D() {
            new com.garmin.android.apps.connectmobile.devices.setup.c(BLEDeviceSetupActivity.this, new bd0.f(this));
        }

        @Override // bd0.h0
        public final void E() {
            y yVar = y.SYNC_UPLOAD_PREPARED;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            bLEDeviceSetupActivity.f34399l.post(new bd0.c(bLEDeviceSetupActivity, yVar, true, (String) null));
        }

        @Override // bd0.h0
        public final void G() {
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, new z(y.REGISTERING_DEVICE));
        }

        @Override // bd0.h0
        public final void I() {
            z zVar = new z(y.CHECKING_FOR_FIRMWARE_UPDATE_SUCCESS);
            zVar.a(true);
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void L(yl2.e eVar) {
            q(new z(y.CHECKING_FOR_FIRMWARE_UPDATE_FAILURE), eVar);
        }

        @Override // bd0.h0
        public final void M() {
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            new com.garmin.android.apps.connectmobile.devices.setup.b((Context) bLEDeviceSetupActivity, bLEDeviceSetupActivity.f34390c.getF143516f(), false, (com.garmin.android.apps.connectmobile.devices.setup.b.a) new bd0.f(this)).show();
        }

        @Override // bd0.h0
        public final void N() {
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, new z(y.CHECKING_FOR_FIRMWARE_UPDATE));
        }

        @Override // bd0.h0
        public final void O(int i14, Runnable runnable, Intent intent) {
            int f172497e;
            a2 a2Var = a2.DEVICES;
            i2.a(a2Var, "BLEDeviceSetupActivity", "exitFlow(): has 'runnableToExecuteBeforeFinish' ".concat(runnable != null ? "[yes]" : "[no]"));
            GarminDeviceWakefulService.g("BLEDeviceSetupActivity", false);
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            bLEDeviceSetupActivity.setResult(i14);
            if (i14 == -1) {
                int i15 = BLEDeviceSetupActivity.f34387q;
                bLEDeviceSetupActivity.ka();
                if (bLEDeviceSetupActivity.f34391d != null) {
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "BLEDeviceSetupActivity", ".exitFlow(): Sending milestone FINISHED_WITH_SUCCESS to device.");
                    hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_SUCCESS, bLEDeviceSetupActivity.f34390c.getF143511a(), null, null);
                } else {
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "BLEDeviceSetupActivity", ".exitFlow(): Cannot sending milestone FINISHED_WITH_SUCCESS to device because mBLEDevice object is null! WTF!?");
                }
                if (intent == null) {
                    com.garmin.android.apps.connectmobile.navigation.b.b();
                    intent = new Intent(bLEDeviceSetupActivity, (Class<?>) DashboardActivity.class);
                    intent.addFlags(268468224);
                }
                l lVar = bLEDeviceSetupActivity.f34390c;
                bm2.d dVar = bLEDeviceSetupActivity.f34392e;
                f172497e = dVar != null ? dVar.getF92745i() : -1;
                Logger logger = yb2.b.f195700a;
                lVar.getClass();
                yb2.b.d(lVar, f172497e, null);
            } else if (i14 == 0) {
                l lVar2 = bLEDeviceSetupActivity.f34390c;
                bm2.d dVar2 = bLEDeviceSetupActivity.f34392e;
                f172497e = dVar2 != null ? dVar2.getF92745i() : -1;
                PairingException pairingException = new PairingException(yl2.e.ABORTED);
                Logger logger2 = yb2.b.f195700a;
                lVar2.getClass();
                yb2.b.c(lVar2, f172497e, null, pairingException);
            }
            if (GarminConnectMobileApp.f28687i.f28691c) {
                Intent intent2 = new Intent(bLEDeviceSetupActivity, (Class<?>) GarminAppGateway.class);
                intent2.addFlags(603979776);
                bLEDeviceSetupActivity.startActivity(intent2);
            } else {
                if (runnable != null) {
                    bLEDeviceSetupActivity.runOnUiThread(runnable);
                }
                if (intent != null) {
                    bLEDeviceSetupActivity.startActivity(intent);
                }
                bLEDeviceSetupActivity.finish();
            }
        }

        @Override // bd0.h0
        public final void P() {
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, new z(y.RETRIEVING_GARMIN_DEVICE_XML));
        }

        @Override // bd0.h0
        public final void Q() {
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, new z(y.SYNC_DOWNLOAD_SOFTWARE_UPDATE_SENDING));
        }

        @Override // bd0.h0
        public final void R() {
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, new z(y.SENDING_DEVICE_RESET_COMMAND));
        }

        @Override // bd0.h0
        public final void S(h hVar) {
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            l lVar = bLEDeviceSetupActivity.f34390c;
            if (lVar != null) {
                new com.garmin.android.apps.connectmobile.devices.setup.d(bLEDeviceSetupActivity, lVar.getF143516f(), new bd0.e(hVar, 0));
            }
        }

        @Override // bd0.h0
        public final void T() {
            z zVar = new z(y.SENDING_DEVICE_RESET_COMMAND_FAILURE);
            zVar.f17661a = 2131232307;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            BLEDeviceSetupActivity.ea(bLEDeviceSetupActivity, zVar);
            BLEDeviceSetupActivity.ga(bLEDeviceSetupActivity, new PairingException(yl2.e.RESET_FAILURE));
        }

        @Override // bd0.h0
        public final void U() {
            z zVar = new z(y.SYNC_DOWNLOAD_SOFTWARE_UPDATE_SENDING_SUCCESS);
            zVar.a(true);
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void V() {
            z zVar = new z(y.SENDING_DEVICE_RESET_COMMAND_SUCCESS);
            zVar.a(true);
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void X(String str) {
            y yVar = y.SYNC_DOWNLOAD_PREPARED;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            bLEDeviceSetupActivity.f34399l.post(new bd0.c(bLEDeviceSetupActivity, yVar, false, str));
        }

        @Override // bd0.h0
        public final void Y() {
            z zVar = new z(y.CONNECTING_SUCCESS);
            zVar.a(true);
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void Z() {
            z zVar = new z(y.RETRIEVING_GARMIN_DEVICE_XML_FAILURE);
            zVar.f17661a = 2131232307;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            BLEDeviceSetupActivity.ea(bLEDeviceSetupActivity, zVar);
            BLEDeviceSetupActivity.ga(bLEDeviceSetupActivity, new PairingException(yl2.e.XML_DOWNLOAD_FAILURE));
        }

        @Override // bd0.h0
        public final void a0() {
            z zVar = new z(y.CHECKING_DEVICE_REGISTRATION_STATUS_SUCCESS);
            zVar.a(true);
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void b() {
            z zVar = new z(y.SYNC_STARTED);
            zVar.a(true);
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void b0() {
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, new z(y.RESETTING_DEVICE));
        }

        @Override // bd0.h0
        public final void c() {
            z zVar = new z(y.AUTHENTICATION_FAILURE);
            zVar.f17661a = 2131232307;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            BLEDeviceSetupActivity.ea(bLEDeviceSetupActivity, zVar);
            bLEDeviceSetupActivity.f34397j.setVisibility(8);
        }

        @Override // bd0.h0
        public final void d() {
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            View view2 = bLEDeviceSetupActivity.f34396i;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            bLEDeviceSetupActivity.ka();
        }

        @Override // bd0.h0
        public final void d0(yl2.e eVar) {
            q(new z(y.REGISTERING_DEVICE_FAILURE), eVar);
            BLEDeviceSetupActivity.ga(BLEDeviceSetupActivity.this, new PairingException(eVar));
        }

        @Override // bd0.h0
        public final void e(int i14) {
            y yVar = y.SYNC_DOWNLOAD_PREPARED;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            bLEDeviceSetupActivity.f34399l.post(new j(bLEDeviceSetupActivity, yVar, i14, 4));
        }

        @Override // bd0.h0
        public final void e0() {
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, new z(y.DISCONNECTING));
        }

        @Override // bd0.h0
        public final void f() {
            bo1.a.a().getClass();
            bo1.a.b();
            z zVar = new z(y.SAVED_DEVICE_TO_LOCAL_DATABASE);
            zVar.a(true);
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void g(boolean z14) {
            z zVar = new z(y.SYNC_FINISHED);
            zVar.a(z14);
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            BLEDeviceSetupActivity.ea(bLEDeviceSetupActivity, zVar);
            if (z14) {
                return;
            }
            BLEDeviceSetupActivity.ga(bLEDeviceSetupActivity, new PairingException(yl2.e.SYNC_FAILURE));
        }

        @Override // bd0.h0
        public final void h() {
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, new z(y.CONNECTING));
        }

        @Override // bd0.h0
        public final void i(long j8) {
            y yVar = y.SYNC_UPLOAD_PREPARED;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            bLEDeviceSetupActivity.f34399l.post(new bd0.d(bLEDeviceSetupActivity, yVar, j8, 0));
        }

        @Override // rm2.a
        public final void j(BluetoothDevice bluetoothDevice) {
            BLEDeviceSetupActivity.this.f34397j.setVisibility(8);
        }

        @Override // bd0.h0
        public final void k(long j8) {
            z zVar = new z(y.SYNC_UPLOAD_PREPARED);
            zVar.f17665e = 0L;
            zVar.f17664d = j8;
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void l(int i14) {
            z zVar = new z(y.SYNC_DOWNLOAD_PREPARED);
            zVar.f17667g = 0;
            zVar.f17666f = i14;
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void n() {
            z zVar = new z(y.AUTHENTICATING);
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            BLEDeviceSetupActivity.ea(bLEDeviceSetupActivity, zVar);
            bLEDeviceSetupActivity.f34397j.setVisibility(8);
        }

        @Override // bd0.h0
        public final void o(String str) {
            y yVar = y.SYNC_UPLOAD_PREPARED;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            bLEDeviceSetupActivity.f34399l.post(new bd0.c(bLEDeviceSetupActivity, yVar, false, str));
        }

        @Override // bd0.h0
        public final void p(yl2.e eVar) {
            q(new z(y.CHECKING_DEVICE_REGISTRATION_STATUS_FAILURE), eVar);
            BLEDeviceSetupActivity.ga(BLEDeviceSetupActivity.this, new PairingException(eVar, "Error checking device registration status"));
        }

        public final void q(z zVar, yl2.e eVar) {
            int i14 = e.f34408a[eVar.ordinal()];
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            if (i14 != 1) {
                zVar.f17663c = eVar.name();
            } else {
                zVar.f17663c = bLEDeviceSetupActivity.getString(R.string.txt_no_internet_connection);
            }
            zVar.f17661a = 2131232307;
            BLEDeviceSetupActivity.ea(bLEDeviceSetupActivity, zVar);
        }

        @Override // bd0.h0
        public final void r() {
            z zVar = new z(y.REGISTERING_DEVICE_SUCCESS);
            zVar.a(true);
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void s(String str) {
            z zVar = new z(y.SYNC_DOWNLOAD_SOFTWARE_UPDATE_SENDING_SUCCESS);
            zVar.f17663c = str;
            zVar.f17661a = 2131232307;
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void u() {
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, new z(y.CHECKING_DEVICE_REGISTRATION_STATUS));
        }

        @Override // bd0.h0
        public final void w() {
            z zVar = new z(y.RETRIEVING_GARMIN_DEVICE_XML_SUCCESS);
            zVar.a(true);
            BLEDeviceSetupActivity.ea(BLEDeviceSetupActivity.this, zVar);
        }

        @Override // bd0.h0
        public final void y(String str) {
            z zVar = new z(y.CONNECTING_FAILURE);
            String strN = TextUtils.isEmpty(str) ? "Failed connecting to device" : fb1.c.n("Failed connecting to device: ", str);
            hk0.a aVarF = hk0.a.f();
            hk0.a.EnumC1667a enumC1667a = hk0.a.EnumC1667a.FINISHED_WITH_FAILURE;
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            aVarF.l(enumC1667a, bLEDeviceSetupActivity.f34390c.getF143511a(), null, strN);
            zVar.f17661a = 2131232307;
            BLEDeviceSetupActivity.ea(bLEDeviceSetupActivity, zVar);
            BLEDeviceSetupActivity.ga(bLEDeviceSetupActivity, new PairingException(yl2.e.CONNECTION_FAILURE, strN));
        }

        @Override // bd0.h0
        public final void z() {
            z zVar = new z(y.AUTHENTICATED);
            zVar.a(true);
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            BLEDeviceSetupActivity.ea(bLEDeviceSetupActivity, zVar);
            bLEDeviceSetupActivity.f34397j.setVisibility(8);
        }
    }

    public class b implements la2.a {
        public b() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            if (bLEDeviceSetupActivity.f34394g == null) {
                return;
            }
            bm2.d dVar = new bm2.d(bVar.f111632a);
            bLEDeviceSetupActivity.f34392e = dVar;
            bLEDeviceSetupActivity.f34390c.b(dVar.getF92746j());
            bLEDeviceSetupActivity.f34394g.d(bLEDeviceSetupActivity.f34392e, true);
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
            i iVarValueOf;
            cd0.c cVar2 = BLEDeviceSetupActivity.this.f34394g;
            if (cVar2 == null) {
                return;
            }
            String strName = cVar.f111634b.name();
            AtomicBoolean atomicBoolean = cVar2.f26776v;
            i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handleConnectingFailure(): " + strName);
            h0 h0Var = cVar2.f26816d;
            if (h0Var != null) {
                h0Var.y(strName);
            }
            try {
                iVarValueOf = i.valueOf(strName);
            } catch (IllegalArgumentException | NullPointerException unused) {
                iVarValueOf = i.UNKNOWN_ERROR;
            }
            int i14 = cd0.c.e.f26783a[iVarValueOf.ordinal()];
            if (i14 == 1 || i14 == 2) {
                if (cVar2.M(strName)) {
                    i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", "handleConnectingTimeout(" + strName + "):  Retrying...");
                    atomicBoolean.set(true);
                    cVar2.r();
                    cVar2.q();
                    return;
                }
                return;
            }
            if (x80.d.c(cVar2.f26814b.getF143517g()) || !cVar2.M(strName)) {
                return;
            }
            if (atomicBoolean.getAndSet(false)) {
                i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", "handleConnectingFailure(" + strName + "):  Retry already in progress");
                return;
            }
            i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", "handleConnectingFailure(" + strName + "):  Retrying...");
            cVar2.r();
            cVar2.q();
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            cd0.c cVar = bLEDeviceSetupActivity.f34394g;
            if (cVar == null) {
                return;
            }
            int i14 = hVar.f111674b;
            if (cVar.f26817e.l()) {
                hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_FAILURE, cVar.c(), null, am.j.h(i14, "Device Disconnected: "));
            }
            cVar.y();
            z zVar = new z(y.DISCONNECTED);
            zVar.f17661a = 2131232302;
            BLEDeviceSetupActivity.ea(bLEDeviceSetupActivity, zVar);
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String string;
            long f172494b;
            bd0.a aVar;
            l lVar;
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            BLEDeviceSetupActivity.fa(bLEDeviceSetupActivity, "global", action, extras);
            DeviceProfile deviceProfile = (DeviceProfile) intent.getParcelableExtra("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE");
            if (deviceProfile != null) {
                string = deviceProfile.getMacAddress();
                f172494b = deviceProfile.getF92746j();
            } else {
                string = intent.getExtras().getString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", null);
                f172494b = intent.getExtras().getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L);
            }
            String stringExtra = intent.getStringExtra("com.garmin.android.gdi.EXTRA_FAILURE_REASON");
            if (bLEDeviceSetupActivity.f34394g == null) {
                return;
            }
            if ((f172494b <= 0 || (lVar = bLEDeviceSetupActivity.f34390c) == null || f172494b != lVar.getF143511a()) && (TextUtils.isEmpty(string) || (aVar = bLEDeviceSetupActivity.f34391d) == null || !string.equalsIgnoreCase(aVar.f17520a))) {
                StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(f172494b, "[", string, "/");
                sbJ.append("]");
                String string2 = sbJ.toString();
                StringBuilder sb3 = new StringBuilder("[");
                bd0.a aVar2 = bLEDeviceSetupActivity.f34391d;
                if (aVar2 != null) {
                    sb3.append(aVar2.f17520a);
                }
                if (bLEDeviceSetupActivity.f34390c != null) {
                    sb3.append("/");
                    sb3.append(bLEDeviceSetupActivity.f34390c.getF143511a());
                }
                sb3.append("]");
                i2.m(a2.DEVICES, "BLEDeviceSetupActivity", "Ignoring incoming event " + string2 + ", as the device being paired is " + ((Object) sb3));
                return;
            }
            if ("com.garmin.android.gdi.ACTION_PAIRING_PASSKEY_REQUIRED".equals(action)) {
                bLEDeviceSetupActivity.f34394g.C(intent);
                return;
            }
            if ("com.garmin.android.gdi.ACTION_DEVICE_AUTHENTICATED".equals(action)) {
                cd0.c cVar = bLEDeviceSetupActivity.f34394g;
                h0 h0Var = cVar.f26816d;
                if (h0Var != null) {
                    h0Var.z();
                    cVar.f26816d.h();
                }
                pm2.a aVar3 = cVar.f26773s;
                if (aVar3 != null) {
                    aVar3.b(cVar.f26813a);
                }
                cVar.f26766l = intent.getByteArrayExtra("com.garmin.android.gdi.EXTRA_ENCRYPTED_DIVERSIFIER");
                cVar.f26767m = intent.getByteArrayExtra("com.garmin.android.gdi.EXTRA_RANDOM_NUMBER");
                cVar.f26768n = intent.getByteArrayExtra("com.garmin.android.gdi.EXTRA_LONG_TERM_KEY");
                i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handleDeviceAuthenticated()\n  ediv" + ft2.b.a(cVar.f26766l) + "\n  rand" + ft2.b.a(cVar.f26767m) + "\n  ltk" + ft2.b.a(cVar.f26768n));
                return;
            }
            if ("com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTED".equals(action)) {
                bLEDeviceSetupActivity.f34394g.E(true);
                return;
            }
            if ("com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTING_FAILURE".equals(action)) {
                bLEDeviceSetupActivity.f34394g.E(false);
                return;
            }
            if (!"com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ".equals(action)) {
                if (!"com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ_FAILURE".equals(action) || stringExtra == null) {
                    return;
                }
                bLEDeviceSetupActivity.f34394g.A(stringExtra);
                return;
            }
            if (bLEDeviceSetupActivity.f34394g == null) {
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.garmin.android.gdi.EXTRA_FILE_CONTENT");
            if (byteArrayExtra != null && byteArrayExtra.length > 0) {
                bLEDeviceSetupActivity.f34394g.B(byteArrayExtra);
                return;
            }
            String stringExtra2 = intent.getStringExtra("com.garmin.android.gdi.EXTRA_FAILURE_REASON");
            if (stringExtra2 != null) {
                bLEDeviceSetupActivity.f34394g.A(stringExtra2);
            }
        }
    }

    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            l lVar;
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            BLEDeviceSetupActivity.fa(bLEDeviceSetupActivity, ImagesContract.LOCAL, action, extras);
            long j8 = intent.getExtras().getLong("com.garmin.android.lib.connectdevicesync.EXTRA_REMOTE_DEVICE_ID", -1L);
            if (j8 <= 0 || (lVar = bLEDeviceSetupActivity.f34390c) == null || j8 != lVar.getF143511a()) {
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.ACTION_DEVICE_SYNC_STARTED".equals(action)) {
                h0 h0Var = bLEDeviceSetupActivity.f34394g.f26816d;
                if (h0Var != null) {
                    h0Var.b();
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_PREPARED".equals(action)) {
                cd0.c cVar = bLEDeviceSetupActivity.f34394g;
                long longExtra = intent.getLongExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_TOTAL_FILE_SIZE", 0L);
                h0 h0Var2 = cVar.f26816d;
                if (h0Var2 != null) {
                    h0Var2.k(longExtra);
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_DEVICE_TRANSFER_PROGRESS".equals(action)) {
                cd0.c cVar2 = bLEDeviceSetupActivity.f34394g;
                long longExtra2 = intent.getLongExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_CUMULATIVE_FILE_SIZE", 0L);
                h0 h0Var3 = cVar2.f26816d;
                if (h0Var3 != null) {
                    h0Var3.i(longExtra2);
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_UPLOAD_EXECUTED".equals(action)) {
                cd0.c cVar3 = bLEDeviceSetupActivity.f34394g;
                String stringExtra = intent.getStringExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FAILURE_REASON");
                h0 h0Var4 = cVar3.f26816d;
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
                cd0.c cVar4 = bLEDeviceSetupActivity.f34394g;
                int intExtra = intent.getIntExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_TOTAL_FILE_COUNT", 0);
                h0 h0Var5 = cVar4.f26816d;
                if (h0Var5 != null) {
                    h0Var5.l(intExtra);
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_DEVICE_TRANSFER_PROGRESS".equals(action)) {
                cd0.c cVar5 = bLEDeviceSetupActivity.f34394g;
                int intExtra2 = intent.getIntExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_CUMULATIVE_FILE_COUNT", 0);
                h0 h0Var6 = cVar5.f26816d;
                if (h0Var6 != null) {
                    h0Var6.e(intExtra2);
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_SOFTWARE_UPDATE_TRANSFER_START".equals(action)) {
                cd0.c cVar6 = bLEDeviceSetupActivity.f34394g;
                cVar6.getClass();
                i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handleSyncDownloadSoftwareUpdateStart()");
                h0 h0Var7 = cVar6.f26816d;
                if (h0Var7 != null) {
                    h0Var7.Q();
                    return;
                }
                return;
            }
            if ("com.garmin.android.lib.connectdevicesync.action.ACTION_DOWNLOAD_SOFTWARE_UPDATE_TRANSFER_COMPLETE".equals(action)) {
                cd0.c cVar7 = bLEDeviceSetupActivity.f34394g;
                String stringExtra2 = intent.getStringExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FAILURE_REASON");
                cVar7.getClass();
                i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handleSyncDownloadSoftwareUpdateComplete()");
                h0 h0Var8 = cVar7.f26816d;
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
                    bLEDeviceSetupActivity.f34394g.D(intent.getIntExtra("com.garmin.android.lib.connectdevicesync.EXTRA_OVERALL_STATUS", 1));
                    return;
                }
                return;
            }
            cd0.c cVar8 = bLEDeviceSetupActivity.f34394g;
            String stringExtra3 = intent.getStringExtra("com.garmin.android.lib.connectdevicesync.extra.EXTRA_NAME_FAILURE_REASON");
            cVar8.getClass();
            i2.a(a2.DEVICES, "AbstractDeviceSetupStrategy", ".handleSyncDownloadFinished()");
            h0 h0Var9 = cVar8.f26816d;
            if (h0Var9 != null) {
                if (stringExtra3 != null) {
                    h0Var9.X(stringExtra3);
                } else {
                    h0Var9.A();
                }
            }
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f34409b;

        static {
            int[] iArr = new int[GDIAuthPairingAndroidNotificationPressedActivity.b.values().length];
            f34409b = iArr;
            try {
                iArr[GDIAuthPairingAndroidNotificationPressedActivity.b.ENTER_PASSKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34409b[GDIAuthPairingAndroidNotificationPressedActivity.b.INIT_AUTH_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[yl2.e.values().length];
            f34408a = iArr2;
            try {
                iArr2[yl2.e.NO_INTERNET_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void ca(BLEDeviceSetupActivity bLEDeviceSetupActivity, boolean z14) {
        if (z14) {
            bLEDeviceSetupActivity.ha();
            super.onBackPressed();
        }
    }

    public static void da(BLEDeviceSetupActivity bLEDeviceSetupActivity, boolean z14) {
        if (z14) {
            bLEDeviceSetupActivity.ha();
            super.onNavigateUp();
        }
    }

    public static void ea(BLEDeviceSetupActivity bLEDeviceSetupActivity, z zVar) {
        bLEDeviceSetupActivity.f34399l.post(new ab.j(25, bLEDeviceSetupActivity, zVar));
    }

    public static void fa(BLEDeviceSetupActivity bLEDeviceSetupActivity, String str, String str2, Bundle bundle) {
        bLEDeviceSetupActivity.getClass();
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(str);
        sb3.append("] ");
        if (!TextUtils.isEmpty(str2)) {
            sb3.append(str2);
            sb3.append(":");
        }
        if (bundle == null) {
            sb3.append("no extras");
        } else {
            for (String str3 : bundle.keySet()) {
                sb3.append("\n  ");
                Object obj = bundle.get(str3);
                if (obj != null) {
                    StringBuilder sbL = e5.l(str3, " (", obj.toString(), ") (", obj.getClass().getName());
                    sbL.append(")");
                    sb3.append(sbL.toString());
                }
            }
        }
        i2.d("BLEDeviceSetupActivity#receiverExtras", sb3.toString());
    }

    public static void ga(BLEDeviceSetupActivity bLEDeviceSetupActivity, PairingException pairingException) {
        l lVar = bLEDeviceSetupActivity.f34390c;
        bm2.d dVar = bLEDeviceSetupActivity.f34392e;
        int f172497e = dVar != null ? dVar.getF92745i() : -1;
        Logger logger = yb2.b.f195700a;
        lVar.getClass();
        yb2.b.c(lVar, f172497e, null, pairingException);
    }

    public final void ha() {
        hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_CANCELED, this.f34390c.getF143511a(), null, null);
        i2.a(a2.DEVICES, "BLEDeviceSetupActivity", ".cleanupBeforeNavigatingAway(): setIsUserInPairingFlow(false)");
        GarminDeviceWakefulService.g("BLEDeviceSetupActivity", false);
        cd0.c cVar = this.f34394g;
        if (cVar != null) {
            cVar.p(true);
        }
    }

    public final void ia() {
        Toast.makeText(this, R.string.txt_error_occurred, 1).show();
        setResult(0);
        finish();
    }

    public final DeviceSetupProgressListViewFragment ja() {
        Fragment fragmentF = getSupportFragmentManager().F(R.id.frag_list_view);
        if (fragmentF != null) {
            return (DeviceSetupProgressListViewFragment) fragmentF;
        }
        return null;
    }

    public final void ka() {
        if (this.f34388a) {
            z9.a.a(this).d(this.f34403p);
            this.f34388a = false;
        }
        if (this.f34389b) {
            unregisterReceiver(this.f34402o);
            this.f34389b = false;
            da2.d.b().f58886a.i(this.f34401n);
        }
    }

    @Override // androidx.fragment.app.m
    public final void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BLEDeviceSetupActivity", "Fragment [" + fragment.getClass().getSimpleName() + "] attached.");
        if (fragment.getId() == R.id.frag_list_view) {
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.v(fragment);
            aVar.s(true, true);
            String str = "Fragment [" + fragment.getClass().getSimpleName() + "] was made hidden.";
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BLEDeviceSetupActivity", str);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        i2.a(a2.DEVICES, "BLEDeviceSetupActivity", ".onBackPressed()");
        new com.garmin.android.apps.connectmobile.devices.setup.a(this, new bd0.b(this, 0));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "BLEDeviceSetupActivity", ".onCreate()");
        GarminDeviceWakefulService.g("BLEDeviceSetupActivity", true);
        Bundle extras = getIntent().getExtras();
        if (extras == null || extras.isEmpty()) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEDeviceSetupActivity", "Missing extras. Finishing activity...");
            ia();
            return;
        }
        if (!extras.containsKey("extra_device_dto")) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEDeviceSetupActivity", "Missing extra [extra_device_dto]. Finishing activity...");
            ia();
            return;
        }
        if (!extras.containsKey("extra_ble_device")) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEDeviceSetupActivity", "Missing extra [extra_ble_device]. Finishing activity...");
            ia();
            return;
        }
        if (!extras.containsKey("extra_setup_strategy_classname")) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEDeviceSetupActivity", "Missing extra [extra_setup_strategy_classname]. Finishing activity...");
            ia();
            return;
        }
        l lVar = (l) getIntent().getParcelableExtra("extra_device_dto");
        this.f34390c = lVar;
        if (lVar == null) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEDeviceSetupActivity", "Extra [extra_device_dto] is null. Finishing activity...");
            ia();
            return;
        }
        bd0.a aVar = (bd0.a) getIntent().getParcelableExtra("extra_ble_device");
        this.f34391d = aVar;
        if (aVar == null) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEDeviceSetupActivity", "Extra [extra_ble_device] is null. Finishing activity...");
            ia();
            return;
        }
        String stringExtra = getIntent().getStringExtra("extra_setup_strategy_classname");
        this.f34393f = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "BLEDeviceSetupActivity", "Extra [extra_setup_strategy_classname] is null or empty. Finishing activity...");
            ia();
            return;
        }
        this.f34399l = new Handler(Looper.getMainLooper());
        setContentView(R.layout.gcm_devices_setup);
        this.f34396i = findViewById(R.id.device_setup_progress_container);
        this.f34397j = (TextView) findViewById(R.id.bluetooth_notification_message);
        Button button = (Button) findViewById(R.id.device_setup_details_bttn);
        this.f34398k = button;
        button.setOnClickListener(new a32.b(this, 12));
        initActionBar(true, this.f34390c.getF143516f());
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.device_setup_progress_bar);
        if (c22.b.e(this)) {
            int iC = (int) c22.b.c(this, getResources().getDimension(R.dimen.icon_default), 1.3f);
            progressBar.getLayoutParams().width = iC;
            progressBar.getLayoutParams().height = iC;
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i2.a(a2.DEVICES, "BLEDeviceSetupActivity", ".onDestroy()");
        GarminDeviceWakefulService.g("BLEDeviceSetupActivity", false);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        i2.a(a2.DEVICES, "BLEDeviceSetupActivity", ".onNavigateUp()");
        new com.garmin.android.apps.connectmobile.devices.setup.a(this, new bd0.b(this, 1));
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        BLEDeviceSetupActivity bLEDeviceSetupActivity;
        super.onStart();
        i2.a(a2.DEVICES, "BLEDeviceSetupActivity", ".onStart()");
        GarminDeviceWakefulService.g("BLEDeviceSetupActivity", true);
        getWindow().addFlags(128);
        if (!this.f34388a) {
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
            z9.a.a(this).b(intentFilter, this.f34403p);
            this.f34388a = true;
        }
        if (this.f34389b) {
            bLEDeviceSetupActivity = this;
        } else {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.garmin.android.gdi.ACTION_PAIRING_PASSKEY_REQUIRED");
            intentFilter2.addAction("com.garmin.android.gdi.ACTION_DEVICE_AUTHENTICATED");
            intentFilter2.addAction("com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ");
            intentFilter2.addAction("com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ_FAILURE");
            intentFilter2.addAction("com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTED");
            intentFilter2.addAction("com.garmin.device.pairingACTION_FACTORY_RESET_REQUESTING_FAILURE");
            bLEDeviceSetupActivity = this;
            a7.b.registerReceiver(bLEDeviceSetupActivity, this.f34402o, intentFilter2, oa2.b.d(getApplicationContext()), null, 2);
            bLEDeviceSetupActivity.f34389b = true;
            da2.d.b().f58886a.b(bLEDeviceSetupActivity.f34401n);
        }
        f fVar = new f(this, 0);
        bLEDeviceSetupActivity.f34395h = fVar;
        fVar.c(new Void[0]);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        i2.a(a2.DEVICES, "BLEDeviceSetupActivity", ".onStop()");
        ka();
        f fVar = this.f34395h;
        if (fVar != null) {
            fVar.a();
        }
        getWindow().clearFlags(128);
    }

    public class f extends g22.c<Void, Boolean> {
        private f() {
        }

        @Override // g22.c
        public final Boolean b(Void[] voidArr) {
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            if (!this.f75549a.isActive()) {
                return Boolean.FALSE;
            }
            try {
                cd0.c cVar = (cd0.c) Class.forName(bLEDeviceSetupActivity.f34393f).newInstance();
                bLEDeviceSetupActivity.f34394g = cVar;
                cVar.F(bLEDeviceSetupActivity, bLEDeviceSetupActivity.f34390c, bLEDeviceSetupActivity.f34400m, bLEDeviceSetupActivity.f34391d.b());
                i2.a(a2.DEVICES, "BLEDeviceSetupActivity", bLEDeviceSetupActivity.f34393f + " initialized.");
                return Boolean.TRUE;
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
                i2.e(a2.DEVICES, "BLEDeviceSetupActivity", e4);
                return Boolean.valueOf(e4.getMessage() == null);
            }
        }

        @Override // g22.c
        public final void d(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            BLEDeviceSetupActivity bLEDeviceSetupActivity = BLEDeviceSetupActivity.this;
            if (!zBooleanValue) {
                int i14 = BLEDeviceSetupActivity.f34387q;
                bLEDeviceSetupActivity.ia();
                return;
            }
            t.b((ImageView) bLEDeviceSetupActivity.findViewById(R.id.device_setup_image), bLEDeviceSetupActivity.f34390c);
            bLEDeviceSetupActivity.f34396i.setVisibility(0);
            bLEDeviceSetupActivity.f34398k.setTag("show");
            bLEDeviceSetupActivity.f34398k.setText(R.string.lbl_details_show);
            bLEDeviceSetupActivity.f34398k.setVisibility(0);
            i2.a(a2.DEVICES, "BLEDeviceSetupActivity", "Initialized the details button as \"show\".");
            if (!bLEDeviceSetupActivity.getIntent().getExtras().containsKey("extra_is_from_android_notification")) {
                cd0.c cVar = bLEDeviceSetupActivity.f34394g;
                if (cVar != null) {
                    cVar.q();
                    return;
                }
                return;
            }
            GDIAuthPairingAndroidNotificationPressedActivity.b bVarValueOf = GDIAuthPairingAndroidNotificationPressedActivity.b.valueOf(bLEDeviceSetupActivity.getIntent().getExtras().getString("GDIAuthPairingAndroidNotificationPressedActivity_extra_setup_action_to_execute"));
            if (bLEDeviceSetupActivity.f34394g != null) {
                int i15 = e.f34409b[bVarValueOf.ordinal()];
                if (i15 == 1) {
                    bLEDeviceSetupActivity.f34394g.C(bLEDeviceSetupActivity.getIntent());
                } else {
                    if (i15 != 2) {
                        return;
                    }
                    bLEDeviceSetupActivity.f34394g.x();
                }
            }
        }

        public /* synthetic */ f(BLEDeviceSetupActivity bLEDeviceSetupActivity, int i14) {
            this();
        }
    }
}
