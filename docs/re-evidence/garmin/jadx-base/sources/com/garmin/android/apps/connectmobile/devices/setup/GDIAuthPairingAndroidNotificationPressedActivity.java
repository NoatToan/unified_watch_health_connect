package com.garmin.android.apps.connectmobile.devices.setup;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import bd0.f0;
import bd0.g0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import o13.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/setup/GDIAuthPairingAndroidNotificationPressedActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "b", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GDIAuthPairingAndroidNotificationPressedActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34440f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34441a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34444d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.b f34442b = (l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f34443c = new w1(s0.f105811a.b(f0.class), new f(this), new e(this), new g(null, this));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f34445e = new c();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/setup/GDIAuthPairingAndroidNotificationPressedActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        ENTER_PASSKEY,
        INIT_AUTH_DEVICE
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/devices/setup/GDIAuthPairingAndroidNotificationPressedActivity$c", "Landroid/content/BroadcastReceiver;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Parcelable parcelable;
            context.getClass();
            intent.getClass();
            String action = intent.getAction();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (!(parcelableExtra instanceof BluetoothDevice)) {
                    parcelableExtra = null;
                }
                parcelable = (BluetoothDevice) parcelableExtra;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelable;
            if (bluetoothDevice != null) {
                String address = bluetoothDevice.getAddress();
                GDIAuthPairingAndroidNotificationPressedActivity gDIAuthPairingAndroidNotificationPressedActivity = GDIAuthPairingAndroidNotificationPressedActivity.this;
                String str = gDIAuthPairingAndroidNotificationPressedActivity.f34441a;
                if (str == null) {
                    s.m("macAddress");
                    throw null;
                }
                if (s.g(address, str)) {
                    if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
                        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
                        if (intExtra == 11) {
                            return;
                        }
                        try {
                            if (intExtra == 12) {
                                a2 a2Var = a2.DEVICES;
                                String str2 = "Device bond restored " + bluetoothDevice.getAddress();
                                i2.f36769a.getClass();
                                i2.a.k(a2Var, "GDIAuthPairingAndroidNotificationPressedActivity", str2);
                                la2.e eVar = da2.d.b().f58886a;
                                String address2 = bluetoothDevice.getAddress();
                                address2.getClass();
                                eVar.k(address2);
                                ed0.a.m("GDIAuthPairingAndroidNotificationPressedActivity", null);
                            } else {
                                i2.f36769a.getClass();
                                i2.a.f(a2.DEVICES, "GDIAuthPairingAndroidNotificationPressedActivity", "Failed to bond [" + intExtra + "]. Aborting activity...");
                            }
                        } catch (Exception e4) {
                            a2 a2Var2 = a2.DEVICES;
                            i2.f36769a.getClass();
                            i2.a.g(a2Var2, "GDIAuthPairingAndroidNotificationPressedActivity", e4);
                        }
                    }
                    gDIAuthPairingAndroidNotificationPressedActivity.finish();
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f34450a;

        public d(l lVar) {
            lVar.getClass();
            this.f34450a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f34450a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34450a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34451a;

        public e(b.g gVar) {
            this.f34451a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f34451a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34452a;

        public f(b.g gVar) {
            this.f34452a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34452a.getF185700a();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f34454b;

        public g(e23.a aVar, b.g gVar) {
            this.f34453a = aVar;
            this.f34454b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34453a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34454b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).c()) {
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra("GDIAuthPairingAndroidNotificationPressedActivity_extra_mac_address");
        if (stringExtra == null) {
            finish();
        } else {
            this.f34441a = stringExtra;
            initActionBar(false, getIntent().getStringExtra("GDIAuthPairingAndroidNotificationPressedActivity_extra_product_displayname"));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (!this.f34444d) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            registerReceiver(this.f34445e, intentFilter);
            this.f34444d = true;
        }
        showProgressOverlay(getString(R.string.txt_loading));
        f0 f0Var = (f0) this.f34443c.getValue();
        String str = this.f34441a;
        if (str == null) {
            s.m("macAddress");
            throw null;
        }
        l80.b bVar = this.f34442b;
        bVar.getClass();
        m.a(v1.a(f0Var).f183565a, new g0(bVar, str, null), 2).f(this, new d(new b41.a(this, 1)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        if (this.f34444d) {
            unregisterReceiver(this.f34445e);
            this.f34444d = false;
        }
        super.onStop();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/setup/GDIAuthPairingAndroidNotificationPressedActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_MAC_ADDRESS", "EXTRA_PRODUCT_NUMBER", "EXTRA_PRODUCT_DISPLAYNAME", "EXTRA_PAIRING_PASSKEY_TIMEOUT", "EXTRA_SETUP_ACTION_TO_EXECUTE", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
