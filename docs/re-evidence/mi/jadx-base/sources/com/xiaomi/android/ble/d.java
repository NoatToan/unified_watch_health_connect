package com.xiaomi.android.ble;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.xiaomi.accountsdk.account.config.SystemAdStatus;
import com.xiaomi.miot.core.bluetooth.TransferLoggerKt;
import defpackage.clh;
import defpackage.jxa;
import defpackage.lnq;
import defpackage.nfp;
import defpackage.qr2;
import defpackage.rye;
import java.lang.reflect.Method;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d<E extends qr2> extends nfp implements rye.c {
    public static final UUID A = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final UUID B = UUID.fromString("00001801-0000-1000-8000-00805f9b34fb");
    public static final UUID C = UUID.fromString("00002A05-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11118b;
    public rye d;
    public BluetoothDevice e;
    public d<E>.e f;
    public E g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f11119k;
    public boolean l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.xiaomi.android.ble.a f11120r;
    public com.xiaomi.android.ble.a s;
    public v t;
    public w u;
    public c0 w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11117a = new Object();
    public int o = 0;
    public int p = 0;
    public int q = 23;
    public final HashMap<BluetoothGattCharacteristic, lnq> v = new HashMap<>();
    public final BroadcastReceiver x = new a();
    public BroadcastReceiver y = new b();
    public final BroadcastReceiver z = new c();
    public final Handler c = new Handler(Looper.getMainLooper());

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final String a(int i) {
            switch (i) {
                case 10:
                    return SystemAdStatus.SYSTEM_AD_OFF;
                case 11:
                    return "TURNING ON";
                case 12:
                    return SystemAdStatus.SYSTEM_AD_ON;
                case 13:
                    return "TURNING OFF";
                default:
                    return "UNKNOWN (" + i + ")";
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
            d.this.d1(3, "[Broadcast] Action received: android.bluetooth.adapter.action.STATE_CHANGED, state changed to " + a(intExtra));
            if (intExtra == 10 || intExtra == 13) {
                if (intExtra2 == 13 || intExtra2 == 10) {
                    d.this.close();
                    return;
                }
                e eVar = d.this.f;
                if (eVar != null) {
                    eVar.e = true;
                    eVar.Y();
                    eVar.c = null;
                }
                BluetoothDevice bluetoothDevice = d.this.e;
                if (bluetoothDevice != null) {
                    if (d.this.t != null && d.this.t.c != v.a.DISCONNECT) {
                        d.this.t.n(bluetoothDevice, -100);
                        d.this.t = null;
                    }
                    if (d.this.w != null) {
                        d.this.w.n(bluetoothDevice, -100);
                        d.this.w = null;
                    }
                    if (d.this.f11120r != null) {
                        d.this.f11120r.n(bluetoothDevice, -100);
                        d dVar = d.this;
                        dVar.s = dVar.f11120r;
                        d.this.f11120r = null;
                    }
                }
                d.this.h = true;
                if (eVar != null) {
                    eVar.e = false;
                    if (bluetoothDevice != null) {
                        eVar.n0(bluetoothDevice);
                    }
                }
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        public final /* synthetic */ void b() {
            d.this.d1(2, "Discovering services...");
            d.this.d1(3, "gatt.discoverServices()");
            try {
                d.this.d.q();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
            if (d.this.e == null || !bluetoothDevice.getAddress().equals(d.this.e.getAddress())) {
                return;
            }
            d.this.d1(3, "[Broadcast] Action received: android.bluetooth.device.action.BOND_STATE_CHANGED, bond state changed to: " + d.this.v0(intExtra) + " (" + intExtra + ")");
            switch (intExtra) {
                case 10:
                    if (intExtra2 == 11) {
                        d.this.g.onBondingFailed(bluetoothDevice);
                        d.this.d1(5, "Bonding failed");
                        if (d.this.t != null) {
                            d.this.t.n(bluetoothDevice, -4);
                            d.this.t = null;
                        }
                    } else if (intExtra2 == 12 && d.this.t != null && d.this.t.c == v.a.REMOVE_BOND) {
                        d.this.d1(4, "Bond information removed");
                        d.this.t.q(bluetoothDevice);
                        d.this.t = null;
                    }
                    break;
                case 11:
                    d.this.g.onBondingRequired(bluetoothDevice);
                    return;
                case 12:
                    d.this.d1(4, "Device bonded");
                    d.this.g.onBonded(bluetoothDevice);
                    if (d.this.t == null || d.this.t.c != v.a.CREATE_BOND) {
                        if (d.this.m || d.this.n) {
                            return;
                        }
                        d.this.n = true;
                        d.this.c.post(new Runnable() { // from class: mye
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f27346a.b();
                            }
                        });
                        return;
                    }
                    d.this.t.q(bluetoothDevice);
                    d.this.t = null;
                    break;
            }
            d.this.f.m0(true);
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (d.this.e == null || bluetoothDevice == null || !bluetoothDevice.getAddress().equals(d.this.e.getAddress())) {
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", 0);
            d.this.d1(3, "[Broadcast] Action received: android.bluetooth.device.action.PAIRING_REQUEST, pairing variant: " + d.this.g1(intExtra) + " (" + intExtra + ")");
            d.this.e1(bluetoothDevice, intExtra);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.android.ble.d$d, reason: collision with other inner class name */
    public static /* synthetic */ class C0350d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11124a;

        static {
            int[] iArr = new int[v.a.values().length];
            f11124a = iArr;
            try {
                iArr[v.a.WAIT_FOR_INDICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11124a[v.a.WAIT_FOR_NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11124a[v.a.CONNECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11124a[v.a.DISCONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11124a[v.a.CREATE_BOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11124a[v.a.REMOVE_BOND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11124a[v.a.SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11124a[v.a.READ.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11124a[v.a.WRITE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11124a[v.a.READ_DESCRIPTOR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11124a[v.a.WRITE_DESCRIPTOR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11124a[v.a.ENABLE_NOTIFICATIONS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11124a[v.a.ENABLE_INDICATIONS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11124a[v.a.DISABLE_NOTIFICATIONS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11124a[v.a.DISABLE_INDICATIONS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11124a[v.a.ENABLE_SERVICE_CHANGED_INDICATIONS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11124a[v.a.REQUEST_MTU.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11124a[v.a.REQUEST_CONNECTION_PRIORITY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f11124a[v.a.SET_PREFERRED_PHY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11124a[v.a.READ_PHY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11124a[v.a.READ_RSSI.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f11124a[v.a.REFRESH_CACHE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f11124a[v.a.SLEEP.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public abstract class e extends MainThreadBluetoothGattCallback {
        public Deque<v> c;
        public boolean d;
        public boolean e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Deque<v> f11125b = new LinkedList();
        public boolean f = false;

        public e() {
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0056  */
        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        /* JADX INFO: renamed from: A */
        public final void n(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            boolean z;
            if (h0(bluetoothGattCharacteristic)) {
                this.e = true;
                Y();
                this.c = null;
                d.this.d1(4, "Service Changed indication received");
                d.this.d1(2, "Discovering Services...");
                d.this.d1(3, "gatt.discoverServices()");
                try {
                    d.this.d.q();
                    return;
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return;
                }
            }
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(d.A);
            if (descriptor != null && descriptor.getValue() != null && descriptor.getValue().length == 2) {
                z = descriptor.getValue()[0] == 1;
            }
            String strA = clh.a(bArr);
            if (z) {
                d.this.d1(4, "Notification received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + strA);
                p0(bluetoothGatt, bluetoothGattCharacteristic);
            } else {
                d.this.d1(4, "Indication received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + strA);
                o0(bluetoothGatt, bluetoothGattCharacteristic);
            }
            lnq lnqVar = (lnq) d.this.v.get(bluetoothGattCharacteristic);
            if (lnqVar != null) {
                lnqVar.b(d.this.d.s(), bArr);
            }
            c0 c0Var = d.this.w;
            if (c0Var == null || c0Var.d != bluetoothGattCharacteristic || c0Var.C()) {
                return;
            }
            c0Var.D(d.this.d.s(), bArr);
            if (c0Var.z()) {
                return;
            }
            c0Var.q(d.this.d.s());
            d.this.w = null;
            if (c0Var.B()) {
                m0(true);
            }
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        public final void B(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
            if (i == 0) {
                d.this.d1(4, "Read Response received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + clh.a(bArr));
                q0(bluetoothGatt, bluetoothGattCharacteristic);
                if (d.this.t instanceof t) {
                    t tVar = (t) d.this.t;
                    tVar.y(d.this.d.s(), bArr);
                    if (tVar.w()) {
                        a0(tVar);
                    } else {
                        tVar.q(d.this.d.s());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    d.this.d1(5, "Authentication required (" + i + ")");
                    if (d.this.d.s().getBondState() != 10) {
                        d dVar = d.this;
                        dVar.g.onError(dVar.d.s(), "Phone has lost bonding information", i);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onCharacteristicRead error ");
                sb.append(i);
                if (d.this.t instanceof t) {
                    d.this.t.n(d.this.d.s(), i);
                }
                d.this.w = null;
                x0(d.this.d.s(), "Error on reading characteristic", i);
            }
            m0(true);
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        public final void C(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
            if (i == 0) {
                d.this.d1(4, "Data written to " + bluetoothGattCharacteristic.getUuid() + ", value: " + clh.a(bArr));
                r0(bluetoothGatt, bluetoothGattCharacteristic);
                if (d.this.t instanceof d0) {
                    d0 d0Var = (d0) d.this.t;
                    d0Var.B(d.this.d.s(), bArr);
                    if (d0Var.z()) {
                        a0(d0Var);
                    } else {
                        d0Var.q(d.this.d.s());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    d.this.d1(5, "Authentication required (" + i + ")");
                    if (d.this.d.s().getBondState() != 10) {
                        d dVar = d.this;
                        dVar.g.onError(dVar.d.s(), "Phone has lost bonding information", i);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onCharacteristicWrite error ");
                sb.append(i);
                if (d.this.t instanceof d0) {
                    d.this.t.n(d.this.d.s(), i);
                }
                d.this.w = null;
                x0(d.this.d.s(), "Error on writing characteristic", i);
            }
            m0(true);
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        public void D(BluetoothGatt bluetoothGatt, int i, int i2) {
            d.this.d1(3, "[Callback] Connection state changed with status: " + i + " and new state: " + i2 + " (" + d.this.r1(i2) + ")");
            if (i == 0 && i2 == 2) {
                if (d.this.e == null) {
                    d.this.d1(3, "gatt.close()");
                    d.this.d.n();
                    return;
                }
                d.this.d1(4, "Connected to " + d.this.d.s().getAddress());
                d.this.j = true;
                d.this.f11119k = 0L;
                d.this.p = 2;
                d dVar = d.this;
                dVar.g.onDeviceConnected(dVar.d.s());
                if (d.this.n) {
                    return;
                }
                int iG0 = d.this.G0(d.this.d.s().getBondState() == 12);
                if (iG0 > 0) {
                    d.this.d1(3, "wait(" + iG0 + ")");
                }
                d dVar2 = d.this;
                final int i3 = dVar2.o + 1;
                dVar2.o = i3;
                d.this.c.postDelayed(new Runnable() { // from class: nye
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28566a.k0(i3);
                    }
                }, iG0);
                return;
            }
            if (i2 == 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = d.this.f11119k > 0;
                boolean z2 = z && jElapsedRealtime > d.this.f11119k + 20000;
                if (i != 0) {
                    d.this.d1(5, "Error: (0x" + Integer.toHexString(i) + "): " + jxa.b(i));
                }
                if (i != 0 && z && !z2 && d.this.f11120r != null && d.this.f11120r.w()) {
                    int iA = d.this.f11120r.A();
                    if (iA > 0) {
                        d.this.d1(3, "wait(" + iA + ")");
                    }
                    d.this.c.postDelayed(new Runnable() { // from class: oye
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f29816a.l0();
                        }
                    }, iA);
                    return;
                }
                this.e = true;
                Y();
                this.c = null;
                d.this.l = false;
                boolean z3 = d.this.j;
                n0(d.this.d.s());
                int i4 = -1;
                if (d.this.t != null && d.this.t.c != v.a.DISCONNECT && d.this.t.c != v.a.REMOVE_BOND) {
                    d.this.t.n(d.this.d.s(), i == 0 ? -1 : i);
                    d.this.t = null;
                }
                if (d.this.w != null) {
                    d.this.w.n(d.this.e, -1);
                    d.this.w = null;
                }
                if (d.this.f11120r != null) {
                    if (d.this.m) {
                        i4 = -2;
                    } else if (i != 0) {
                        i4 = (i == 133 && z2) ? -5 : i;
                    }
                    d.this.f11120r.n(d.this.d.s(), i4);
                    d dVar3 = d.this;
                    dVar3.s = dVar3.f11120r;
                    d.this.f11120r = null;
                }
                this.e = false;
                d dVar4 = d.this;
                dVar4.f11120r = dVar4.s;
                d.this.f11120r.l = false;
                if (z3 && d.this.i) {
                    d dVar5 = d.this;
                    dVar5.H0(dVar5.d.s(), null);
                } else {
                    d.this.i = false;
                    m0(false);
                }
                d.this.i = false;
                m0(false);
                if (z3 || i == 0) {
                    return;
                }
            } else if (i != 0) {
                d.this.d1(6, "Error (0x" + Integer.toHexString(i) + "): " + jxa.b(i));
            }
            d dVar6 = d.this;
            dVar6.g.onError(dVar6.d.s(), "Error on connection state change", i);
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        @RequiresApi(api = 26)
        public final void E(BluetoothGatt bluetoothGatt, @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS, to = 3200) int i, @IntRange(from = 0, to = 499) int i2, @IntRange(from = 10, to = 3200) int i3, int i4) {
            if (i4 == 0) {
                d.this.d1(4, "Connection parameters updated (interval: " + (((double) i) * 1.25d) + "ms, latency: " + i2 + ", timeout: " + (i3 * 10) + "ms)");
                s0(bluetoothGatt, i, i2, i3);
                if (d.this.t instanceof com.xiaomi.android.ble.b) {
                    ((com.xiaomi.android.ble.b) d.this.t).y(d.this.d.s(), i, i2, i3);
                    d.this.t.q(d.this.d.s());
                }
            } else if (i4 == 59) {
                StringBuilder sb = new StringBuilder();
                sb.append("onConnectionUpdated received status: Unacceptable connection interval, interval: ");
                sb.append(i);
                sb.append(", latency: ");
                sb.append(i2);
                sb.append(", timeout: ");
                sb.append(i3);
                d.this.d1(5, "Connection parameters update failed with status: UNACCEPT CONN INTERVAL (0x3b) (interval: " + (((double) i) * 1.25d) + "ms, latency: " + i2 + ", timeout: " + (i3 * 10) + "ms)");
                if (d.this.t instanceof com.xiaomi.android.ble.b) {
                    d.this.t.n(d.this.d.s(), i4);
                    d.this.w = null;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onConnectionUpdated received status: ");
                sb2.append(i4);
                sb2.append(", interval: ");
                sb2.append(i);
                sb2.append(", latency: ");
                sb2.append(i2);
                sb2.append(", timeout: ");
                sb2.append(i3);
                d.this.d1(5, "Connection parameters update failed with status " + i4 + " (interval: " + (((double) i) * 1.25d) + "ms, latency: " + i2 + ", timeout: " + (i3 * 10) + "ms)");
                if (d.this.t instanceof com.xiaomi.android.ble.b) {
                    d.this.t.n(d.this.d.s(), i4);
                    d.this.w = null;
                }
                d dVar = d.this;
                dVar.g.onError(dVar.d.s(), "Error on connection priority request", i4);
            }
            if (this.f) {
                this.f = false;
                m0(true);
            }
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        /* JADX INFO: renamed from: F */
        public void s(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr, int i) {
            if (i == 0) {
                d.this.d1(4, "Read Response received from descr. " + bluetoothGattDescriptor.getUuid() + ", value: " + clh.a(bArr));
                t0(bluetoothGatt, bluetoothGattDescriptor);
                if (d.this.t instanceof t) {
                    t tVar = (t) d.this.t;
                    tVar.y(d.this.d.s(), bArr);
                    if (tVar.w()) {
                        a0(tVar);
                    } else {
                        tVar.q(d.this.d.s());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    d.this.d1(5, "Authentication required (" + i + ")");
                    if (d.this.d.s().getBondState() != 10) {
                        d dVar = d.this;
                        dVar.g.onError(dVar.d.s(), "Phone has lost bonding information", i);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onDescriptorRead error ");
                sb.append(i);
                if (d.this.t instanceof t) {
                    d.this.t.n(d.this.d.s(), i);
                }
                d.this.w = null;
                x0(d.this.d.s(), "Error on reading descriptor", i);
            }
            m0(true);
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        /* JADX INFO: renamed from: G */
        public final void t(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr, int i) {
            if (i == 0) {
                d.this.d1(4, "Data written to descr. " + bluetoothGattDescriptor.getUuid() + ", value: " + clh.a(bArr));
                if (g0(bluetoothGattDescriptor)) {
                    d.this.d1(4, "Service Changed notifications enabled");
                } else if (!d0(bluetoothGattDescriptor)) {
                    u0(bluetoothGatt, bluetoothGattDescriptor);
                } else if (bArr != null && bArr.length == 2 && bArr[1] == 0) {
                    byte b2 = bArr[0];
                    if (b2 == 0) {
                        d.this.v.remove(bluetoothGattDescriptor.getCharacteristic());
                        d.this.d1(4, "Notifications and indications disabled");
                    } else if (b2 == 1) {
                        d.this.d1(4, "Notifications enabled");
                    } else if (b2 == 2) {
                        d.this.d1(4, "Indications enabled");
                    }
                    u0(bluetoothGatt, bluetoothGattDescriptor);
                }
                if (d.this.t instanceof d0) {
                    d0 d0Var = (d0) d.this.t;
                    d0Var.B(d.this.d.s(), bArr);
                    if (d0Var.z()) {
                        a0(d0Var);
                    } else {
                        d0Var.q(d.this.d.s());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    d.this.d1(5, "Authentication required (" + i + ")");
                    if (d.this.d.s().getBondState() != 10) {
                        d dVar = d.this;
                        dVar.g.onError(dVar.d.s(), "Phone has lost bonding information", i);
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onDescriptorWrite error ");
                sb.append(i);
                if (d.this.t instanceof d0) {
                    d.this.t.n(d.this.d.s(), i);
                }
                d.this.w = null;
                x0(d.this.d.s(), "Error on writing descriptor", i);
            }
            m0(true);
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        @RequiresApi(api = 21)
        public final void H(BluetoothGatt bluetoothGatt, @IntRange(from = 23, to = 517) int i, int i2) {
            if (i2 == 0) {
                d.this.d1(4, "MTU changed to: " + i);
                d.this.q = i;
                z0(bluetoothGatt, i);
                if (d.this.t instanceof r) {
                    ((r) d.this.t).y(d.this.d.s(), i);
                    d.this.t.q(d.this.d.s());
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("onMtuChanged error: ");
                sb.append(i2);
                sb.append(", mtu: ");
                sb.append(i);
                if (d.this.t instanceof r) {
                    d.this.t.n(d.this.d.s(), i2);
                    d.this.w = null;
                }
                x0(d.this.d.s(), "Error on mtu request", i2);
            }
            m0(true);
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        @RequiresApi(api = 26)
        public final void I(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            if (i3 == 0) {
                d.this.d1(4, "PHY read (TX: " + d.this.j1(i) + ", RX: " + d.this.j1(i2) + ")");
                if (d.this.t instanceof s) {
                    ((s) d.this.t).A(d.this.d.s(), i, i2);
                    d.this.t.q(d.this.d.s());
                }
            } else {
                d.this.d1(5, "PHY read failed with status " + i3);
                if (d.this.t instanceof s) {
                    d.this.t.n(d.this.d.s(), i3);
                }
                d.this.w = null;
                d dVar = d.this;
                dVar.g.onError(dVar.d.s(), "Error on PHY read", i3);
            }
            m0(true);
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        @RequiresApi(api = 26)
        public final void J(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            if (i3 == 0) {
                d.this.d1(4, "PHY updated (TX: " + d.this.j1(i) + ", RX: " + d.this.j1(i2) + ")");
                if (d.this.t instanceof s) {
                    ((s) d.this.t).A(d.this.d.s(), i, i2);
                    d.this.t.q(d.this.d.s());
                }
            } else {
                d.this.d1(5, "PHY updated failed with status " + i3);
                if (d.this.t instanceof s) {
                    d.this.t.n(d.this.d.s(), i3);
                    d.this.w = null;
                }
                d dVar = d.this;
                dVar.g.onError(dVar.d.s(), "Error on PHY update", i3);
            }
            if (d.this.t instanceof s) {
                m0(true);
            }
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        public final void K(BluetoothGatt bluetoothGatt, @IntRange(from = -128, to = 20) int i, int i2) {
            if (i2 == 0) {
                d.this.d1(4, "Remote RSSI received: " + i + " dBm");
                if (d.this.t instanceof u) {
                    ((u) d.this.t).x(d.this.d.s(), i);
                    d.this.t.q(d.this.d.s());
                }
            } else {
                d.this.d1(5, "Reading remote RSSI failed with status " + i2);
                if (d.this.t instanceof u) {
                    d.this.t.n(d.this.d.s(), i2);
                }
                d.this.w = null;
                d dVar = d.this;
                dVar.g.onError(dVar.d.s(), "Error on RSSI read", i2);
            }
            m0(true);
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        public final void L(BluetoothGatt bluetoothGatt, int i) {
        }

        @Override // com.xiaomi.android.ble.MainThreadBluetoothGattCallback
        public final void M(BluetoothGatt bluetoothGatt, int i) {
            d.this.n = false;
            if (i != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("onServicesDiscovered error ");
                sb.append(i);
                x0(d.this.d.s(), "Error on discovering services", i);
                if (d.this.f11120r != null) {
                    d.this.f11120r.n(d.this.d.s(), -4);
                    d dVar = d.this;
                    dVar.s = dVar.f11120r;
                    d.this.f11120r = null;
                }
                d.this.L0();
                return;
            }
            d.this.d1(4, "Services discovered");
            d.this.m = true;
            if (!f0(d.this.d)) {
                d.this.d1(5, "Device is not supported");
                d dVar2 = d.this;
                dVar2.g.onDeviceNotSupported(dVar2.d.s());
                d.this.L0();
                return;
            }
            d.this.d1(2, "Primary service found");
            boolean zE0 = e0(bluetoothGatt);
            if (zE0) {
                d.this.d1(2, "Secondary service found");
            }
            d dVar3 = d.this;
            dVar3.g.onServicesDiscovered(dVar3.d.s(), zE0);
            this.d = true;
            this.e = true;
            Deque<v> dequeB0 = b0(bluetoothGatt);
            this.c = dequeB0;
            if (dequeB0 != null) {
                Iterator<v> it = dequeB0.iterator();
                while (it.hasNext()) {
                    it.next().f11169k = true;
                }
            }
            if (this.c == null) {
                this.c = new LinkedList();
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 == 26 || i2 == 27 || i2 == 28) {
                a0(v.j().s(d.this));
            }
            c0();
            this.d = false;
            m0(true);
        }

        public void Y() {
            this.f11125b.clear();
        }

        public final void Z(v vVar) {
            (this.d ? this.c : this.f11125b).add(vVar);
            vVar.f11169k = true;
        }

        public final void a0(v vVar) {
            (this.d ? this.c : this.f11125b).addFirst(vVar);
            vVar.f11169k = true;
        }

        @Deprecated
        public Deque<v> b0(BluetoothGatt bluetoothGatt) {
            return null;
        }

        public abstract void c0();

        public final boolean d0(BluetoothGattDescriptor bluetoothGattDescriptor) {
            return bluetoothGattDescriptor != null && d.A.equals(bluetoothGattDescriptor.getUuid());
        }

        public boolean e0(BluetoothGatt bluetoothGatt) {
            return false;
        }

        public abstract boolean f0(rye ryeVar);

        public final boolean g0(BluetoothGattDescriptor bluetoothGattDescriptor) {
            return bluetoothGattDescriptor != null && d.C.equals(bluetoothGattDescriptor.getCharacteristic().getUuid());
        }

        public final boolean h0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return bluetoothGattCharacteristic != null && d.C.equals(bluetoothGattCharacteristic.getUuid());
        }

        public final /* synthetic */ void i0(BluetoothDevice bluetoothDevice) {
            d.this.d1(4, "Cache refreshed");
            d.this.t.q(bluetoothDevice);
            d.this.t = null;
            if (d.this.w != null) {
                d.this.w.n(bluetoothDevice, -3);
                d.this.w = null;
            }
            Y();
            this.c = null;
            if (d.this.j) {
                v0();
                d.this.d1(2, "Discovering Services...");
                d.this.d1(3, "gatt.discoverServices()");
                try {
                    d.this.d.q();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        public final /* synthetic */ void j0(z zVar, BluetoothDevice bluetoothDevice) {
            zVar.q(bluetoothDevice);
            m0(true);
        }

        public final /* synthetic */ void k0(int i) {
            if (i == d.this.o && d.this.j && d.this.d.s().getBondState() != 11) {
                d.this.n = true;
                d.this.d1(2, "Discovering services...");
                d.this.d1(3, "gatt.discoverServices()");
                try {
                    d.this.d.q();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        public final /* synthetic */ void l0() {
            d dVar = d.this;
            dVar.H0(dVar.d.s(), d.this.f11120r);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x02e1 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:101:0x02eb A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:102:0x02f5 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:103:0x02ff A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:105:0x0306 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:107:0x031a A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:108:0x0323 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:110:0x032a A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:112:0x0345 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:113:0x034e A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:116:0x035a A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:117:0x0361 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:118:0x0368 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:119:0x036f A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:120:0x0385 A[DONT_INVERT, PHI: r4
          0x0385: PHI (r4v39 boolean) = 
          (r4v11 boolean)
          (r4v12 boolean)
          (r4v13 boolean)
          (r4v14 boolean)
          (r4v15 boolean)
          (r4v16 boolean)
          (r4v20 boolean)
          (r4v21 boolean)
          (r4v24 boolean)
          (r4v25 boolean)
          (r4v26 boolean)
          (r4v27 boolean)
          (r4v28 boolean)
          (r4v30 boolean)
          (r4v31 boolean)
          (r4v32 boolean)
          (r4v34 boolean)
          (r4v35 boolean)
          (r4v36 boolean)
          (r4v37 boolean)
          (r4v37 boolean)
          (r4v9 boolean)
          (r4v9 boolean)
         binds: [B:119:0x036f, B:118:0x0368, B:117:0x0361, B:116:0x035a, B:112:0x0345, B:111:0x033e, B:107:0x031a, B:106:0x0313, B:102:0x02f5, B:101:0x02eb, B:100:0x02e1, B:99:0x02d7, B:98:0x02cf, B:94:0x02b0, B:92:0x029e, B:89:0x0280, B:88:0x026a, B:87:0x0260, B:86:0x0258, B:84:0x0240, B:85:0x0242, B:81:0x0204, B:79:0x01fc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:121:0x0387 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:123:0x039b  */
        /* JADX WARN: Code duplicated, block: B:124:0x039d A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:126:0x03a7  */
        /* JADX WARN: Code duplicated, block: B:127:0x03a9  */
        /* JADX WARN: Code duplicated, block: B:131:0x03ba A[Catch: all -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x01d5 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x01e0 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:76:0x01e8 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:80:0x01fe A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0206 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:83:0x023a A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0242 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:86:0x0258 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:87:0x0260 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:88:0x026a A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:89:0x0280 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x0290 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x029e A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:93:0x02aa A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:95:0x02b2 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:98:0x02cf A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:99:0x02d7 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:3:0x0001, B:9:0x000f, B:13:0x001a, B:16:0x0020, B:21:0x0053, B:23:0x005b, B:25:0x0067, B:29:0x008f, B:31:0x0093, B:35:0x009d, B:37:0x00bb, B:39:0x00fb, B:41:0x0103, B:43:0x0114, B:45:0x0121, B:44:0x011b, B:46:0x0145, B:48:0x0168, B:51:0x0174, B:71:0x01cf, B:73:0x01d5, B:77:0x01f1, B:78:0x01f9, B:121:0x0387, B:128:0x03ab, B:124:0x039d, B:80:0x01fe, B:82:0x0206, B:83:0x023a, B:85:0x0242, B:86:0x0258, B:87:0x0260, B:88:0x026a, B:89:0x0280, B:90:0x0290, B:92:0x029e, B:93:0x02aa, B:95:0x02b2, B:98:0x02cf, B:99:0x02d7, B:100:0x02e1, B:101:0x02eb, B:102:0x02f5, B:103:0x02ff, B:105:0x0306, B:106:0x0313, B:107:0x031a, B:108:0x0323, B:110:0x032a, B:111:0x033e, B:112:0x0345, B:113:0x034e, B:116:0x035a, B:117:0x0361, B:118:0x0368, B:119:0x036f, B:74:0x01e0, B:76:0x01e8, B:131:0x03ba, B:58:0x0191, B:60:0x019c, B:62:0x01a4, B:67:0x01b1, B:70:0x01c6, B:26:0x0078), top: B:141:0x0001, inners: #1 }] */
        /* JADX WARN: Instruction removed from duplicated block: B:82:0x0206, please report this as an issue */
        public final synchronized void m0(boolean z) {
            v vVarY;
            int i;
            boolean zH0;
            d0 d0Var;
            BluetoothGattCharacteristic bluetoothGattCharacteristic;
            d0 d0Var2;
            BluetoothGattDescriptor bluetoothGattDescriptor;
            r rVar;
            final BluetoothDevice bluetoothDevice;
            int i2;
            try {
                if (d.this.f == null) {
                    return;
                }
                if (z) {
                    this.e = d.this.w != null;
                }
                d.this.d1(4, "mOperationInProgress (" + this.e + "), current request (" + d.this.t + ")");
                if (this.e) {
                    return;
                }
                try {
                    if (d.this.u == null) {
                        vVarY = null;
                    } else if (d.this.u.w()) {
                        vVarY = d.this.u.v().s(d.this);
                    } else {
                        d.this.u.q(d.this.e);
                        d.this.u = null;
                        vVarY = null;
                    }
                    if (vVarY == null) {
                        Deque<v> deque = this.c;
                        vVarY = deque != null ? deque.poll() : null;
                    }
                } catch (Exception unused) {
                }
                if (vVarY == null) {
                    TransferLoggerKt.logger.i("MIBleManager", "nextRequest: mInitQueue: " + this.c);
                    if (this.c != null) {
                        this.c = null;
                        this.e = true;
                        d.this.l = true;
                        w0();
                        TransferLoggerKt.logger.i("MIBleManager", "nextRequest: notify connect success request:" + d.this.f11120r + ", bak: " + d.this.s);
                        if (d.this.f11120r != null || d.this.s != null) {
                            TransferLoggerKt.logger.i("MIBleManager", "nextRequest: notify connect success");
                            d dVar = d.this;
                            dVar.f11120r = dVar.f11120r == null ? d.this.s : d.this.f11120r;
                            d.this.f11120r.q(d.this.f11120r.z());
                            d dVar2 = d.this;
                            dVar2.s = dVar2.f11120r;
                            d.this.f11120r = null;
                        }
                    }
                    try {
                        TransferLoggerKt.logger.i("MIBleManager", "nextRequest mTaskQueue: " + this.f11125b);
                        vVarY = this.f11125b.remove();
                    } catch (Exception unused2) {
                        this.e = false;
                        d.this.t = null;
                        y0();
                        return;
                    }
                }
                this.e = true;
                d.this.t = vVarY;
                int[] iArr = C0350d.f11124a;
                int i3 = iArr[vVarY.c.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        zH0 = false;
                    } else {
                        i = 16;
                    }
                    if (vVarY.c == v.a.CONNECT) {
                        com.xiaomi.android.ble.a aVar = (com.xiaomi.android.ble.a) vVarY;
                        aVar.p(aVar.z());
                    } else {
                        if (d.this.e == null) {
                            vVarY.o();
                            d.this.w = null;
                            m0(true);
                            return;
                        }
                        vVarY.p(d.this.e);
                    }
                    switch (iArr[vVarY.c.ordinal()]) {
                        case 3:
                            com.xiaomi.android.ble.a aVar2 = (com.xiaomi.android.ble.a) vVarY;
                            d.this.f11120r = aVar2;
                            d.this.t = null;
                            zH0 = d.this.H0(aVar2.z(), aVar2);
                            if (!zH0) {
                                v vVar = d.this.t;
                                BluetoothDevice bluetoothDevice2 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar.n(bluetoothDevice2, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 4:
                            zH0 = d.this.L0();
                            if (!zH0) {
                                v vVar2 = d.this.t;
                                BluetoothDevice bluetoothDevice3 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar2.n(bluetoothDevice3, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 5:
                            zH0 = d.this.I0();
                            if (!zH0) {
                                v vVar3 = d.this.t;
                                BluetoothDevice bluetoothDevice4 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar3.n(bluetoothDevice4, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 6:
                            zH0 = d.this.T0();
                            if (!zH0) {
                                v vVar4 = d.this.t;
                                BluetoothDevice bluetoothDevice5 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar4.n(bluetoothDevice5, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 7:
                            d.this.u = (w) vVarY;
                            m0(true);
                            return;
                        case 8:
                            zH0 = d.this.O0(vVarY.d);
                            if (!zH0) {
                                v vVar5 = d.this.t;
                                BluetoothDevice bluetoothDevice6 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar5.n(bluetoothDevice6, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 9:
                            d0Var = (d0) vVarY;
                            bluetoothGattCharacteristic = vVarY.d;
                            if (bluetoothGattCharacteristic != null) {
                                bluetoothGattCharacteristic.setValue(d0Var.x(d.this.q));
                                bluetoothGattCharacteristic.setWriteType(d0Var.y());
                            }
                            zH0 = d.this.X0(bluetoothGattCharacteristic);
                            if (!zH0) {
                                v vVar6 = d.this.t;
                                BluetoothDevice bluetoothDevice7 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar6.n(bluetoothDevice7, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 10:
                            zH0 = d.this.P0(vVarY.e);
                            if (!zH0) {
                                v vVar7 = d.this.t;
                                BluetoothDevice bluetoothDevice8 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar7.n(bluetoothDevice8, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 11:
                            d0Var2 = (d0) vVarY;
                            bluetoothGattDescriptor = vVarY.e;
                            if (bluetoothGattDescriptor != null) {
                                bluetoothGattDescriptor.setValue(d0Var2.x(d.this.q));
                            }
                            zH0 = d.this.Y0(bluetoothGattDescriptor);
                            if (!zH0) {
                                v vVar8 = d.this.t;
                                BluetoothDevice bluetoothDevice9 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar8.n(bluetoothDevice9, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 12:
                            zH0 = d.this.N0(vVarY.d);
                            if (!zH0) {
                                v vVar9 = d.this.t;
                                BluetoothDevice bluetoothDevice10 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar9.n(bluetoothDevice10, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 13:
                            zH0 = d.this.M0(vVarY.d);
                            if (!zH0) {
                                v vVar10 = d.this.t;
                                BluetoothDevice bluetoothDevice11 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar10.n(bluetoothDevice11, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 14:
                            zH0 = d.this.K0(vVarY.d);
                            if (!zH0) {
                                v vVar11 = d.this.t;
                                BluetoothDevice bluetoothDevice12 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar11.n(bluetoothDevice12, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 15:
                            zH0 = d.this.J0(vVarY.d);
                            if (!zH0) {
                                v vVar12 = d.this.t;
                                BluetoothDevice bluetoothDevice13 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar12.n(bluetoothDevice13, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 16:
                            zH0 = d.this.C0();
                            if (!zH0) {
                                v vVar13 = d.this.t;
                                BluetoothDevice bluetoothDevice14 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar13.n(bluetoothDevice14, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 17:
                            rVar = (r) vVarY;
                            if (d.this.q != rVar.w()) {
                                zH0 = d.this.V0(rVar.w());
                            } else {
                                zH0 = d.this.j;
                                if (zH0) {
                                    rVar.y(d.this.e, d.this.q);
                                    rVar.q(d.this.e);
                                    m0(true);
                                    return;
                                }
                            }
                            if (!zH0) {
                                v vVar14 = d.this.t;
                                BluetoothDevice bluetoothDevice15 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar14.n(bluetoothDevice15, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 18:
                            this.f = true;
                            zH0 = d.this.U0(((com.xiaomi.android.ble.b) vVarY).w());
                            if (!zH0) {
                                v vVar15 = d.this.t;
                                BluetoothDevice bluetoothDevice16 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar15.n(bluetoothDevice16, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 19:
                            s sVar = (s) vVarY;
                            zH0 = d.this.W0(sVar.y(), sVar.x(), sVar.w());
                            if (!zH0) {
                                v vVar16 = d.this.t;
                                BluetoothDevice bluetoothDevice17 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar16.n(bluetoothDevice17, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 20:
                            zH0 = d.this.Q0();
                            if (!zH0) {
                                v vVar17 = d.this.t;
                                BluetoothDevice bluetoothDevice18 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar17.n(bluetoothDevice18, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 21:
                            zH0 = d.this.R0();
                            if (!zH0) {
                                v vVar18 = d.this.t;
                                BluetoothDevice bluetoothDevice19 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar18.n(bluetoothDevice19, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 22:
                            zH0 = d.this.S0();
                            if (zH0) {
                                final BluetoothDevice bluetoothDevice20 = d.this.e;
                                d.this.c.postDelayed(new Runnable() { // from class: pye
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f30897a.i0(bluetoothDevice20);
                                    }
                                }, 200L);
                            }
                            if (!zH0) {
                                v vVar19 = d.this.t;
                                BluetoothDevice bluetoothDevice110 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar19.n(bluetoothDevice110, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        case 23:
                            bluetoothDevice = d.this.e;
                            if (bluetoothDevice != null) {
                                final z zVar = (z) vVarY;
                                d.this.d1(3, "sleep(" + zVar.v() + ")");
                                d.this.c.postDelayed(new Runnable() { // from class: qye
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f31969a.j0(zVar, bluetoothDevice);
                                    }
                                }, zVar.v());
                            } else if (!zH0) {
                                v vVar110 = d.this.t;
                                BluetoothDevice bluetoothDevice111 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar110.n(bluetoothDevice111, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                        default:
                            if (!zH0) {
                                v vVar111 = d.this.t;
                                BluetoothDevice bluetoothDevice112 = d.this.e;
                                if (d.this.j) {
                                    i2 = -3;
                                } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                    i2 = -1;
                                } else {
                                    i2 = -100;
                                }
                                vVar111.n(bluetoothDevice112, i2);
                                d.this.w = null;
                                this.f = false;
                                m0(true);
                            }
                            return;
                    }
                }
                i = 32;
                c0 c0Var = (c0) vVarY;
                zH0 = (!d.this.j || d.this.e == null || d.D0(c0Var.d, i) == null) ? false : true;
                if (zH0) {
                    d.this.w = c0Var;
                    c0Var.p(d.this.e);
                    if (c0Var.y() != null) {
                        vVarY = c0Var.y();
                        d.this.t = vVarY;
                        if (vVarY.c == v.a.CONNECT) {
                            com.xiaomi.android.ble.a aVar3 = (com.xiaomi.android.ble.a) vVarY;
                            aVar3.p(aVar3.z());
                        } else {
                            if (d.this.e == null) {
                                vVarY.o();
                                d.this.w = null;
                                m0(true);
                                return;
                            }
                            vVarY.p(d.this.e);
                        }
                    }
                } else if (vVarY.c == v.a.CONNECT) {
                    com.xiaomi.android.ble.a aVar4 = (com.xiaomi.android.ble.a) vVarY;
                    aVar4.p(aVar4.z());
                } else {
                    if (d.this.e == null) {
                        vVarY.o();
                        d.this.w = null;
                        m0(true);
                        return;
                    }
                    vVarY.p(d.this.e);
                }
                switch (iArr[vVarY.c.ordinal()]) {
                    case 3:
                        com.xiaomi.android.ble.a aVar5 = (com.xiaomi.android.ble.a) vVarY;
                        d.this.f11120r = aVar5;
                        d.this.t = null;
                        zH0 = d.this.H0(aVar5.z(), aVar5);
                        if (!zH0) {
                            v vVar112 = d.this.t;
                            BluetoothDevice bluetoothDevice113 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar112.n(bluetoothDevice113, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 4:
                        zH0 = d.this.L0();
                        if (!zH0) {
                            v vVar113 = d.this.t;
                            BluetoothDevice bluetoothDevice114 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar113.n(bluetoothDevice114, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 5:
                        zH0 = d.this.I0();
                        if (!zH0) {
                            v vVar114 = d.this.t;
                            BluetoothDevice bluetoothDevice115 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar114.n(bluetoothDevice115, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 6:
                        zH0 = d.this.T0();
                        if (!zH0) {
                            v vVar115 = d.this.t;
                            BluetoothDevice bluetoothDevice116 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar115.n(bluetoothDevice116, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 7:
                        d.this.u = (w) vVarY;
                        m0(true);
                        return;
                    case 8:
                        zH0 = d.this.O0(vVarY.d);
                        if (!zH0) {
                            v vVar116 = d.this.t;
                            BluetoothDevice bluetoothDevice117 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar116.n(bluetoothDevice117, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 9:
                        d0Var = (d0) vVarY;
                        bluetoothGattCharacteristic = vVarY.d;
                        if (bluetoothGattCharacteristic != null) {
                            bluetoothGattCharacteristic.setValue(d0Var.x(d.this.q));
                            bluetoothGattCharacteristic.setWriteType(d0Var.y());
                        }
                        zH0 = d.this.X0(bluetoothGattCharacteristic);
                        if (!zH0) {
                            v vVar117 = d.this.t;
                            BluetoothDevice bluetoothDevice118 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar117.n(bluetoothDevice118, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 10:
                        zH0 = d.this.P0(vVarY.e);
                        if (!zH0) {
                            v vVar118 = d.this.t;
                            BluetoothDevice bluetoothDevice119 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar118.n(bluetoothDevice119, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 11:
                        d0Var2 = (d0) vVarY;
                        bluetoothGattDescriptor = vVarY.e;
                        if (bluetoothGattDescriptor != null) {
                            bluetoothGattDescriptor.setValue(d0Var2.x(d.this.q));
                        }
                        zH0 = d.this.Y0(bluetoothGattDescriptor);
                        if (!zH0) {
                            v vVar119 = d.this.t;
                            BluetoothDevice bluetoothDevice1110 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar119.n(bluetoothDevice1110, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 12:
                        zH0 = d.this.N0(vVarY.d);
                        if (!zH0) {
                            v vVar1110 = d.this.t;
                            BluetoothDevice bluetoothDevice1111 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1110.n(bluetoothDevice1111, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 13:
                        zH0 = d.this.M0(vVarY.d);
                        if (!zH0) {
                            v vVar1111 = d.this.t;
                            BluetoothDevice bluetoothDevice1112 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1111.n(bluetoothDevice1112, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 14:
                        zH0 = d.this.K0(vVarY.d);
                        if (!zH0) {
                            v vVar1112 = d.this.t;
                            BluetoothDevice bluetoothDevice1113 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1112.n(bluetoothDevice1113, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 15:
                        zH0 = d.this.J0(vVarY.d);
                        if (!zH0) {
                            v vVar1113 = d.this.t;
                            BluetoothDevice bluetoothDevice1114 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1113.n(bluetoothDevice1114, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 16:
                        zH0 = d.this.C0();
                        if (!zH0) {
                            v vVar1114 = d.this.t;
                            BluetoothDevice bluetoothDevice1115 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1114.n(bluetoothDevice1115, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 17:
                        rVar = (r) vVarY;
                        if (d.this.q != rVar.w()) {
                            zH0 = d.this.V0(rVar.w());
                        } else {
                            zH0 = d.this.j;
                            if (zH0) {
                                rVar.y(d.this.e, d.this.q);
                                rVar.q(d.this.e);
                                m0(true);
                                return;
                            }
                        }
                        if (!zH0) {
                            v vVar1115 = d.this.t;
                            BluetoothDevice bluetoothDevice1116 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1115.n(bluetoothDevice1116, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 18:
                        this.f = true;
                        zH0 = d.this.U0(((com.xiaomi.android.ble.b) vVarY).w());
                        if (!zH0) {
                            v vVar1116 = d.this.t;
                            BluetoothDevice bluetoothDevice1117 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1116.n(bluetoothDevice1117, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 19:
                        s sVar2 = (s) vVarY;
                        zH0 = d.this.W0(sVar2.y(), sVar2.x(), sVar2.w());
                        if (!zH0) {
                            v vVar1117 = d.this.t;
                            BluetoothDevice bluetoothDevice1118 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1117.n(bluetoothDevice1118, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 20:
                        zH0 = d.this.Q0();
                        if (!zH0) {
                            v vVar1118 = d.this.t;
                            BluetoothDevice bluetoothDevice1119 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1118.n(bluetoothDevice1119, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 21:
                        zH0 = d.this.R0();
                        if (!zH0) {
                            v vVar1119 = d.this.t;
                            BluetoothDevice bluetoothDevice11110 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar1119.n(bluetoothDevice11110, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 22:
                        zH0 = d.this.S0();
                        if (zH0) {
                            final BluetoothDevice bluetoothDevice21 = d.this.e;
                            d.this.c.postDelayed(new Runnable() { // from class: pye
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f30897a.i0(bluetoothDevice21);
                                }
                            }, 200L);
                        }
                        if (!zH0) {
                            v vVar11110 = d.this.t;
                            BluetoothDevice bluetoothDevice11111 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar11110.n(bluetoothDevice11111, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    case 23:
                        bluetoothDevice = d.this.e;
                        if (bluetoothDevice != null) {
                            final z zVar2 = (z) vVarY;
                            d.this.d1(3, "sleep(" + zVar2.v() + ")");
                            d.this.c.postDelayed(new Runnable() { // from class: qye
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f31969a.j0(zVar2, bluetoothDevice);
                                }
                            }, zVar2.v());
                        } else if (!zH0) {
                            v vVar11111 = d.this.t;
                            BluetoothDevice bluetoothDevice11112 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar11111.n(bluetoothDevice11112, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                    default:
                        if (!zH0) {
                            v vVar11112 = d.this.t;
                            BluetoothDevice bluetoothDevice11113 = d.this.e;
                            if (d.this.j) {
                                i2 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i2 = -1;
                            } else {
                                i2 = -100;
                            }
                            vVar11112.n(bluetoothDevice11113, i2);
                            d.this.w = null;
                            this.f = false;
                            m0(true);
                        }
                        return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final void n0(BluetoothDevice bluetoothDevice) {
            boolean z = d.this.j;
            d.this.j = false;
            d.this.m = false;
            d.this.n = false;
            this.d = false;
            d.this.p = 0;
            if (!z) {
                d.this.d1(5, "Connection attempt timed out");
                d.this.close();
                d.this.g.onDeviceDisconnected(bluetoothDevice);
            } else if (d.this.h) {
                d.this.d1(4, "Disconnected");
                d.this.close();
                d.this.g.onDeviceDisconnected(bluetoothDevice);
                v vVar = d.this.t;
                if (vVar != null && vVar.c == v.a.DISCONNECT) {
                    vVar.q(bluetoothDevice);
                }
            } else {
                d.this.d1(5, "Connection lost");
                d.this.g.onLinkLossOccurred(bluetoothDevice);
            }
            v0();
        }

        @Deprecated
        public void o0(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        }

        @Deprecated
        public void p0(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        }

        @Deprecated
        public void q0(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        }

        @Deprecated
        public void r0(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        }

        @TargetApi(26)
        @Deprecated
        public void s0(BluetoothGatt bluetoothGatt, @IntRange(from = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS, to = 3200) int i, @IntRange(from = 0, to = 499) int i2, @IntRange(from = 10, to = 3200) int i3) {
        }

        @Deprecated
        public void t0(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
        }

        @Deprecated
        public void u0(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
        }

        public abstract void v0();

        public void w0() {
            d dVar = d.this;
            dVar.g.onDeviceReady(dVar.d.s());
        }

        public final void x0(BluetoothDevice bluetoothDevice, String str, int i) {
            d.this.d1(6, "Error (0x" + Integer.toHexString(i) + "): " + jxa.a(i));
            d.this.g.onError(bluetoothDevice, str, i);
        }

        public void y0() {
        }

        @Deprecated
        public void z0(BluetoothGatt bluetoothGatt, @IntRange(from = 23, to = 517) int i) {
        }
    }

    public d(Context context) {
        this.f11118b = context.getApplicationContext();
    }

    public static BluetoothGattDescriptor D0(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (bluetoothGattCharacteristic == null || (i & bluetoothGattCharacteristic.getProperties()) == 0) {
            return null;
        }
        return bluetoothGattCharacteristic.getDescriptor(A);
    }

    public final d0 A0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return v.i(bluetoothGattCharacteristic).s(this);
    }

    @Deprecated
    public final void B0(v vVar) {
        final d<E>.e eVarE0 = this.f;
        if (eVarE0 == null) {
            eVarE0 = E0();
            this.f = eVarE0;
        }
        eVarE0.Z(vVar);
        d1(4, "enqueue request: (" + vVar + ")");
        final boolean z = vVar.c == v.a.DISCONNECT;
        n1(new Runnable() { // from class: lye
            @Override // java.lang.Runnable
            public final void run() {
                eVarE0.m0(z);
            }
        });
    }

    public final boolean C0() {
        BluetoothGattService bluetoothGattServiceU;
        BluetoothGattCharacteristic characteristic;
        rye ryeVar = this.d;
        if (ryeVar == null || !this.j || ryeVar.s().getBondState() != 12 || (bluetoothGattServiceU = ryeVar.u(B)) == null || (characteristic = bluetoothGattServiceU.getCharacteristic(C)) == null) {
            return false;
        }
        d1(4, "Service Changed characteristic found on a bonded device");
        return M0(characteristic);
    }

    public abstract d<E>.e E0();

    @IntRange(from = 23, to = 517)
    public final int F0() {
        return this.q;
    }

    @IntRange(from = 0)
    public int G0(boolean z) {
        return z ? 1600 : 300;
    }

    public final boolean H0(BluetoothDevice bluetoothDevice, com.xiaomi.android.ble.a aVar) {
        boolean zIsEnabled = BluetoothAdapter.getDefaultAdapter().isEnabled();
        if (this.j || !zIsEnabled) {
            BluetoothDevice bluetoothDevice2 = this.e;
            if (zIsEnabled && bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
                TransferLoggerKt.logger.i("MIBleManager", "internalConnect: is connect ready: " + b1());
                if (b1()) {
                    this.f11120r.q(bluetoothDevice);
                }
            } else {
                com.xiaomi.android.ble.a aVar2 = this.f11120r;
                if (aVar2 != null) {
                    aVar2.n(bluetoothDevice, zIsEnabled ? -4 : -100);
                }
            }
            this.s = this.f11120r;
            this.f11120r = null;
            d<E>.e eVar = this.f;
            if (eVar != null) {
                eVar.m0(true);
            }
            return true;
        }
        synchronized (this.f11117a) {
            try {
                if (this.d == null) {
                    this.f11118b.registerReceiver(this.x, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                    this.f11118b.registerReceiver(this.y, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
                    this.f11118b.registerReceiver(this.z, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
                } else if (this.i) {
                    this.i = false;
                    this.f11119k = 0L;
                    this.p = 1;
                    d1(2, "Connecting...");
                    this.g.onDeviceConnecting(bluetoothDevice);
                    d1(3, "gatt.connect()");
                    if (!this.d.o()) {
                        m();
                    }
                    return true;
                }
                if (aVar == null) {
                    return false;
                }
                boolean zG = aVar.G();
                this.h = !zG;
                if (zG) {
                    this.i = true;
                }
                this.e = bluetoothDevice;
                this.f.O(this.c);
                d1(2, aVar.C() ? "Connecting..." : "Retrying...");
                this.p = 1;
                this.g.onDeviceConnecting(bluetoothDevice);
                this.f11119k = SystemClock.elapsedRealtime();
                u0();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean I0() {
        BluetoothDevice bluetoothDevice = this.e;
        if (bluetoothDevice == null) {
            return false;
        }
        d1(2, "Starting pairing...");
        if (bluetoothDevice.getBondState() != 12) {
            d1(3, "device.createBond()");
            return bluetoothDevice.createBond();
        }
        d1(5, "Device already bonded");
        this.t.q(bluetoothDevice);
        this.f.m0(true);
        return true;
    }

    public final boolean J0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return K0(bluetoothGattCharacteristic);
    }

    public final boolean K0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorD0;
        rye ryeVar = this.d;
        if (ryeVar == null || bluetoothGattCharacteristic == null || !this.j || (bluetoothGattDescriptorD0 = D0(bluetoothGattCharacteristic, 16)) == null) {
            return false;
        }
        d1(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", false)");
        try {
            ryeVar.D(bluetoothGattCharacteristic, false);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
        bluetoothGattDescriptorD0.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        d1(2, "Disabling notifications and indications for " + bluetoothGattCharacteristic.getUuid());
        d1(3, "gatt.writeDescriptor(" + A + ", value=0x00-00)");
        return Z0(bluetoothGattDescriptorD0);
    }

    public final boolean L0() {
        this.h = true;
        this.i = false;
        this.l = false;
        if (this.d != null) {
            this.p = 3;
            d1(2, this.j ? "Disconnecting..." : "Cancelling connection...");
            this.g.onDeviceDisconnecting(this.d.s());
            boolean z = this.j;
            d1(3, "gatt.disconnect()");
            this.d.p();
            if (z) {
                this.f.D(null, 0, 0);
                return true;
            }
            this.p = 0;
            d1(4, "Disconnected");
            this.g.onDeviceDisconnected(this.d.s());
        }
        v vVar = this.t;
        if (vVar != null && vVar.c == v.a.DISCONNECT) {
            BluetoothDevice bluetoothDevice = this.e;
            if (bluetoothDevice != null) {
                vVar.q(bluetoothDevice);
            } else {
                vVar.o();
            }
        }
        d<E>.e eVar = this.f;
        if (eVar != null) {
            eVar.m0(true);
        }
        return true;
    }

    public final boolean M0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorD0;
        rye ryeVar = this.d;
        if (ryeVar == null || bluetoothGattCharacteristic == null || !this.j || (bluetoothGattDescriptorD0 = D0(bluetoothGattCharacteristic, 32)) == null) {
            return false;
        }
        d1(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)");
        try {
            ryeVar.D(bluetoothGattCharacteristic, true);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
        bluetoothGattDescriptorD0.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        d1(2, "Enabling indications for " + bluetoothGattCharacteristic.getUuid());
        d1(3, "gatt.writeDescriptor(" + A + ", value=0x02-00)");
        return Z0(bluetoothGattDescriptorD0);
    }

    public final boolean N0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorD0;
        rye ryeVar = this.d;
        if (ryeVar == null || bluetoothGattCharacteristic == null || !this.j || (bluetoothGattDescriptorD0 = D0(bluetoothGattCharacteristic, 16)) == null) {
            return false;
        }
        d1(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)");
        try {
            ryeVar.D(bluetoothGattCharacteristic, true);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            d1(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true), e = " + e2.getMessage());
        }
        bluetoothGattDescriptorD0.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        d1(2, "Enabling notifications for " + bluetoothGattCharacteristic.getUuid());
        d1(3, "gatt.writeDescriptor(" + A + ", value=0x01-00)");
        return Z0(bluetoothGattDescriptorD0);
    }

    public final boolean O0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        rye ryeVar = this.d;
        if (ryeVar == null || bluetoothGattCharacteristic == null || !this.j || (bluetoothGattCharacteristic.getProperties() & 2) == 0) {
            return false;
        }
        d1(2, "Reading characteristic " + bluetoothGattCharacteristic.getUuid());
        d1(3, "gatt.readCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
        try {
            return ryeVar.w(bluetoothGattCharacteristic);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            d1(3, "gatt.readCharacteristic(" + bluetoothGattCharacteristic.getUuid() + "), e = " + e2.getMessage());
            return false;
        }
    }

    public final boolean P0(BluetoothGattDescriptor bluetoothGattDescriptor) {
        rye ryeVar = this.d;
        if (ryeVar != null && bluetoothGattDescriptor != null && this.j) {
            d1(2, "Reading descriptor " + bluetoothGattDescriptor.getUuid());
            d1(3, "gatt.readDescriptor(" + bluetoothGattDescriptor.getUuid() + ")");
            try {
                return ryeVar.x(bluetoothGattDescriptor);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    @RequiresApi(api = 26)
    public final boolean Q0() {
        rye ryeVar = this.d;
        if (ryeVar == null || !this.j) {
            return false;
        }
        d1(2, "Reading PHY...");
        d1(3, "gatt.readPhy()");
        ryeVar.y();
        return true;
    }

    public final boolean R0() {
        rye ryeVar = this.d;
        if (ryeVar != null && this.j) {
            d1(2, "Reading remote RSSI...");
            d1(3, "gatt.readRemoteRssi()");
            try {
                return ryeVar.z();
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public final boolean S0() {
        rye ryeVar = this.d;
        if (ryeVar == null) {
            return false;
        }
        d1(2, "Refreshing device cache...");
        d1(3, "gatt.refresh() (hidden)");
        try {
            return ryeVar.A();
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final boolean T0() {
        BluetoothDevice bluetoothDevice = this.e;
        if (bluetoothDevice == null) {
            return false;
        }
        d1(2, "Removing bond information...");
        if (bluetoothDevice.getBondState() == 10) {
            d1(5, "Device is not bonded");
            this.t.q(bluetoothDevice);
            this.f.m0(true);
            return true;
        }
        rye ryeVar = this.d;
        if (ryeVar != null) {
            ryeVar.p();
        }
        try {
            Method method = bluetoothDevice.getClass().getMethod("removeBond", new Class[0]);
            d1(3, "device.removeBond() (hidden)");
            return ((Boolean) method.invoke(bluetoothDevice, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @RequiresApi(api = 21)
    public final boolean U0(int i) {
        String str;
        String str2;
        rye ryeVar = this.d;
        if (ryeVar == null || !this.j) {
            return false;
        }
        if (i == 1) {
            str = "HIGH (11.25–15ms, 0, 20s)";
            str2 = "HIGH";
        } else if (i != 2) {
            str = "LOW POWER (100–125ms, 2, 20s)";
            str2 = "BALANCED";
        } else {
            str = "BALANCED (30–50ms, 0, 20s)";
            str2 = "LOW POWER";
        }
        d1(2, "Requesting connection priority: " + str + "...");
        d1(3, "gatt.requestConnectionPriority(" + str2 + ")");
        return ryeVar.B(i);
    }

    @RequiresApi(api = 21)
    public final boolean V0(@IntRange(from = 23, to = 517) int i) {
        rye ryeVar = this.d;
        if (ryeVar != null && this.j) {
            d1(2, "Requesting new MTU...");
            d1(3, "gatt.requestMtu(" + i + ")");
            try {
                return ryeVar.C(i);
            } catch (RemoteException e2) {
                e2.printStackTrace();
                d1(3, "gatt.requestMtu(" + i + "), e = " + e2.getMessage());
            }
        }
        return false;
    }

    @RequiresApi(api = 26)
    public final boolean W0(int i, int i2, int i3) {
        rye ryeVar = this.d;
        if (ryeVar == null || !this.j) {
            return false;
        }
        d1(2, "Requesting preferred PHYs...");
        d1(3, "gatt.setPreferredPhy(" + i1(i) + ", " + i1(i2) + ", coding option = " + h1(i3) + ")");
        ryeVar.F(i, i2, i3);
        return true;
    }

    public final boolean X0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        rye ryeVar = this.d;
        if (ryeVar == null || bluetoothGattCharacteristic == null || !this.j || (bluetoothGattCharacteristic.getProperties() & 12) == 0) {
            return false;
        }
        d1(2, "Writing characteristic " + bluetoothGattCharacteristic.getUuid() + " (" + t1(bluetoothGattCharacteristic.getWriteType()) + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("gatt.writeCharacteristic(");
        sb.append(bluetoothGattCharacteristic.getUuid());
        sb.append(")");
        d1(3, sb.toString());
        try {
            return ryeVar.H(bluetoothGattCharacteristic);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            d1(3, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ") e = " + e2.getMessage());
            return false;
        }
    }

    public final boolean Y0(BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (this.d == null || bluetoothGattDescriptor == null || !this.j) {
            return false;
        }
        d1(2, "Writing descriptor " + bluetoothGattDescriptor.getUuid());
        d1(3, "gatt.writeDescriptor(" + bluetoothGattDescriptor.getUuid() + ")");
        return Z0(bluetoothGattDescriptor);
    }

    public final boolean Z0(BluetoothGattDescriptor bluetoothGattDescriptor) {
        rye ryeVar = this.d;
        boolean zI = false;
        if (ryeVar != null && bluetoothGattDescriptor != null && this.j) {
            BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            int writeType = characteristic.getWriteType();
            characteristic.setWriteType(2);
            try {
                zI = ryeVar.I(bluetoothGattDescriptor);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
            characteristic.setWriteType(writeType);
        }
        return zI;
    }

    public final boolean a1() {
        BluetoothDevice bluetoothDevice = this.e;
        return bluetoothDevice != null && bluetoothDevice.getBondState() == 12;
    }

    public final boolean b1() {
        return this.l;
    }

    public void close() {
        try {
            this.f11118b.unregisterReceiver(this.x);
            this.f11118b.unregisterReceiver(this.y);
            this.f11118b.unregisterReceiver(this.z);
        } catch (Exception unused) {
        }
        synchronized (this.f11117a) {
            try {
                if (this.d != null) {
                    if (q1()) {
                        if (S0()) {
                            d1(4, "Cache refreshed");
                        } else {
                            d1(5, "Refreshing failed");
                        }
                    }
                    d1(3, "gatt.close()");
                    this.d.n();
                }
                this.j = false;
                this.i = false;
                this.v.clear();
                this.p = 0;
                d<E>.e eVar = this.f;
                if (eVar != null) {
                    eVar.Y();
                    this.f.c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void d1(int i, String str);

    public void destroy() {
        rye ryeVar = this.d;
        if (ryeVar != null) {
            ryeVar.p();
            this.d.G();
        }
    }

    public void e1(BluetoothDevice bluetoothDevice, int i) {
    }

    public final void f1(@IntRange(from = 23, to = 517) int i) {
        this.q = i;
    }

    public String g1(int i) {
        switch (i) {
            case 0:
                return "PAIRING_VARIANT_PIN";
            case 1:
                return "PAIRING_VARIANT_PASSKEY";
            case 2:
                return "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
            case 3:
                return "PAIRING_VARIANT_CONSENT";
            case 4:
                return "PAIRING_VARIANT_DISPLAY_PASSKEY";
            case 5:
                return "PAIRING_VARIANT_DISPLAY_PIN";
            case 6:
                return "PAIRING_VARIANT_OOB_CONSENT";
            default:
                return DeviceTypes.UNKNOWN;
        }
    }

    public BluetoothDevice h() {
        return this.e;
    }

    @RequiresApi(26)
    public final String h1(int i) {
        if (i == 0) {
            return "No preferred";
        }
        if (i == 1) {
            return "S2";
        }
        if (i == 2) {
            return "S8";
        }
        return "UNKNOWN (" + i + ")";
    }

    @Override // rye.c
    public void i() {
        if (this.d == null) {
            return;
        }
        com.xiaomi.android.ble.a aVar = this.f11120r;
        if (aVar == null || !aVar.D()) {
            d1(4, "onGattConnected connectGatt");
            if (this.d.o()) {
                return;
            }
            m();
            return;
        }
        d1(4, "onGattConnected: unregister request");
        this.d.p();
        this.d.G();
        this.f11120r.q(this.e);
    }

    @RequiresApi(26)
    public final String i1(int i) {
        switch (i) {
            case 1:
                return "LE 1M";
            case 2:
                return "LE 2M";
            case 3:
                return "LE 1M or LE 2M";
            case 4:
                return "LE Coded";
            case 5:
                return "LE 1M or LE Coded";
            case 6:
                return "LE 2M or LE Coded";
            case 7:
                return "LE 1M, LE 2M or LE Coded";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    public final boolean isConnected() {
        return this.j;
    }

    @RequiresApi(26)
    public final String j1(int i) {
        if (i == 1) {
            return "LE 1M";
        }
        if (i == 2) {
            return "LE 2M";
        }
        if (i == 3) {
            return "LE Coded";
        }
        return "UNKNOWN (" + i + ")";
    }

    public final t k1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return v.l(bluetoothGattCharacteristic).s(this);
    }

    public final v l1() {
        return v.r().s(this);
    }

    @Override // rye.c
    public void m() {
        d<E>.e eVar = this.f;
        if (eVar != null) {
            eVar.n0(this.e);
        }
        com.xiaomi.android.ble.a aVar = this.f11120r;
        if (aVar != null) {
            aVar.n(this.e, -10);
            this.s = this.f11120r;
            this.f11120r = null;
            return;
        }
        d1(4, "onGattConnectError: connect request == null");
        com.xiaomi.android.ble.a aVar2 = this.s;
        if (aVar2 != null) {
            this.f11120r = aVar2;
            aVar2.l = false;
            aVar2.n(this.e, -10);
            this.f11120r = null;
        }
    }

    public final r m1(@IntRange(from = 23, to = 517) int i) {
        return v.k(i).s(this);
    }

    public final void n1(Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.c.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void o1(E e2) {
        this.g = e2;
    }

    public final lnq p1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        lnq lnqVar = this.v.get(bluetoothGattCharacteristic);
        if (lnqVar == null) {
            lnqVar = new lnq();
            if (bluetoothGattCharacteristic != null) {
                this.v.put(bluetoothGattCharacteristic, lnqVar);
            }
        }
        return lnqVar.a();
    }

    @Override // defpackage.nfp
    public void q(a0 a0Var) {
        this.t = null;
        this.w = null;
        v.a aVar = a0Var.c;
        if (aVar == v.a.CONNECT) {
            this.s = this.f11120r;
            this.f11120r = null;
            L0();
        } else {
            if (aVar == v.a.DISCONNECT) {
                close();
                return;
            }
            d<E>.e eVar = this.f;
            if (eVar != null) {
                eVar.m0(true);
            }
        }
    }

    public abstract boolean q1();

    public String r1(int i) {
        if (i == 1) {
            return "CONNECTING";
        }
        if (i != 2) {
            return i != 3 ? "DISCONNECTED" : "DISCONNECTING";
        }
        return "CONNECTED";
    }

    public final d0 s1(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return v.m(bluetoothGattCharacteristic, bArr).s(this);
    }

    public String t1(int i) {
        if (i == 1) {
            return "WRITE COMMAND";
        }
        if (i == 2) {
            return "WRITE REQUEST";
        }
        if (i == 4) {
            return "WRITE SIGNED";
        }
        return "UNKNOWN: " + i;
    }

    public final void u0() {
        this.d = new rye(this.e, this);
        if (this.f == null) {
            this.f = E0();
        }
        this.d.E(this.f);
        this.d.m();
    }

    public String v0(int i) {
        switch (i) {
            case 10:
                return "BOND_NONE";
            case 11:
                return "BOND_BONDING";
            case 12:
                return "BOND_BONDED";
            default:
                return DeviceTypes.UNKNOWN;
        }
    }

    public final com.xiaomi.android.ble.a w0(BluetoothDevice bluetoothDevice, boolean z) {
        if (this.g == null) {
            throw new NullPointerException("Set callbacks using setGattCallbacks(E callbacks) before connecting");
        }
        if (bluetoothDevice != null) {
            return v.a(bluetoothDevice, z).s(this);
        }
        throw new NullPointerException("Bluetooth device not specified");
    }

    public final v x0() {
        return v.b().s(this);
    }

    public final d0 y0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return v.h(bluetoothGattCharacteristic).s(this);
    }

    public final com.xiaomi.android.ble.c z0() {
        return v.c().s(this);
    }
}
