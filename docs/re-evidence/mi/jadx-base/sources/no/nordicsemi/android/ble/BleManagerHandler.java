package no.nordicsemi.android.ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.xiaomi.accountsdk.account.config.SystemAdStatus;
import defpackage.an5;
import defpackage.blh;
import defpackage.ds2;
import defpackage.hs2;
import defpackage.it2;
import defpackage.ixa;
import defpackage.knq;
import defpackage.mok;
import defpackage.pr2;
import defpackage.qr2;
import java.lang.reflect.Method;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import no.nordicsemi.android.ble.data.Data;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BleManagerHandler extends mok {
    public y A;

    @Deprecated
    public knq C;
    public no.nordicsemi.android.ble.a<?> D;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BluetoothDevice f28105b;
    public BluetoothGatt c;
    public pr2 d;
    public Handler e;
    public Deque<x> g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f28106k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean t;
    public Map<BluetoothGattCharacteristic, byte[]> w;
    public Map<BluetoothGattDescriptor, byte[]> x;
    public q y;
    public x z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28104a = new Object();
    public final Deque<x> f = new LinkedBlockingDeque();
    public int l = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28107r = 0;
    public boolean s = false;
    public int u = 23;

    @IntRange(from = -1, to = 100)
    @Deprecated
    public int v = -1;
    public final HashMap<Object, knq> B = new HashMap<>();
    public final BroadcastReceiver E = new a();
    public final BroadcastReceiver F = new b();
    public final BluetoothGattCallback G = new AnonymousClass3();

    /* JADX INFO: renamed from: no.nordicsemi.android.ble.BleManagerHandler$3, reason: invalid class name */
    public class AnonymousClass3 extends BluetoothGattCallback {
        public AnonymousClass3() {
        }

        public static /* synthetic */ void A(BluetoothGatt bluetoothGatt, boolean z, qr2 qr2Var) {
            qr2Var.onServicesDiscovered(bluetoothGatt.getDevice(), z);
        }

        public static /* synthetic */ void B(BluetoothGatt bluetoothGatt, qr2 qr2Var) {
            qr2Var.onDeviceNotSupported(bluetoothGatt.getDevice());
        }

        public static /* synthetic */ void o(BluetoothGatt bluetoothGatt, int i, qr2 qr2Var) {
            qr2Var.onError(bluetoothGatt.getDevice(), "Phone has lost bonding information", i);
        }

        public static /* synthetic */ void p(BluetoothGatt bluetoothGatt, int i, qr2 qr2Var) {
            qr2Var.onError(bluetoothGatt.getDevice(), "Phone has lost bonding information", i);
        }

        public static /* synthetic */ void q(BluetoothGatt bluetoothGatt, qr2 qr2Var) {
            qr2Var.onDeviceConnected(bluetoothGatt.getDevice());
        }

        public static /* synthetic */ void u(BluetoothGatt bluetoothGatt, int i, qr2 qr2Var) {
            qr2Var.onError(bluetoothGatt.getDevice(), "Error on connection state change", i);
        }

        public static /* synthetic */ void v(BluetoothGatt bluetoothGatt, int i, qr2 qr2Var) {
            qr2Var.onError(bluetoothGatt.getDevice(), "Phone has lost bonding information", i);
        }

        public static /* synthetic */ void w(BluetoothGatt bluetoothGatt, int i, qr2 qr2Var) {
            qr2Var.onError(bluetoothGatt.getDevice(), "Phone has lost bonding information", i);
        }

        public static /* synthetic */ void x(BluetoothGatt bluetoothGatt, int i, qr2 qr2Var) {
            qr2Var.onError(bluetoothGatt.getDevice(), "Error on PHY read", i);
        }

        public static /* synthetic */ void y(BluetoothGatt bluetoothGatt, int i, qr2 qr2Var) {
            qr2Var.onError(bluetoothGatt.getDevice(), "Error on PHY update", i);
        }

        public static /* synthetic */ void z(BluetoothGatt bluetoothGatt, int i, qr2 qr2Var) {
            qr2Var.onError(bluetoothGatt.getDevice(), "Error on RSSI read", i);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0070  */
        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            boolean z;
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (BleManagerHandler.this.n1(bluetoothGattCharacteristic)) {
                if (Build.VERSION.SDK_INT <= 30) {
                    BleManagerHandler.this.G1(4, "Service Changed indication received");
                    BleManagerHandler.this.o = true;
                    BleManagerHandler.this.W1();
                    BleManagerHandler.this.R1();
                    BleManagerHandler.this.f.clear();
                    BleManagerHandler.this.g = null;
                    BleManagerHandler.this.j = true;
                    BleManagerHandler.this.G1(2, "Discovering Services...");
                    BleManagerHandler.this.G1(3, "gatt.discoverServices()");
                    bluetoothGatt.discoverServices();
                    return;
                }
                return;
            }
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(pr2.e);
            if (descriptor != null && descriptor.getValue() != null && descriptor.getValue().length == 2) {
                z = descriptor.getValue()[0] == 1;
            }
            String strC = blh.c(value);
            if (z) {
                BleManagerHandler.this.G1(4, "Notification received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + strC);
                BleManagerHandler.this.M1(bluetoothGatt, bluetoothGattCharacteristic);
            } else {
                BleManagerHandler.this.G1(4, "Indication received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + strC);
                BleManagerHandler.this.L1(bluetoothGatt, bluetoothGattCharacteristic);
            }
            if (BleManagerHandler.this.C != null && BleManagerHandler.this.h1(bluetoothGattCharacteristic)) {
                BleManagerHandler.this.C.e(bluetoothGatt.getDevice(), value);
            }
            knq knqVar = (knq) BleManagerHandler.this.B.get(bluetoothGattCharacteristic);
            if (knqVar != null && knqVar.d(value)) {
                knqVar.e(bluetoothGatt.getDevice(), value);
            }
            if ((BleManagerHandler.this.D instanceof f0) && BleManagerHandler.this.D.e == bluetoothGattCharacteristic && !BleManagerHandler.this.D.I()) {
                f0 f0Var = (f0) BleManagerHandler.this.D;
                if (f0Var.P(value)) {
                    f0Var.Q(bluetoothGatt.getDevice(), value);
                    if (!f0Var.M()) {
                        f0Var.B(bluetoothGatt.getDevice());
                        BleManagerHandler.this.D = null;
                        if (f0Var.H()) {
                            BleManagerHandler.this.I1(true);
                        }
                    }
                }
            }
            if (BleManagerHandler.this.v0()) {
                BleManagerHandler.this.I1(true);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(final BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (i == 0) {
                BleManagerHandler.this.G1(4, "Read Response received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + blh.c(value));
                BleManagerHandler.this.N1(bluetoothGatt, bluetoothGattCharacteristic);
                if (BleManagerHandler.this.z instanceof v) {
                    v vVar = (v) BleManagerHandler.this.z;
                    boolean zL = vVar.L(value);
                    if (zL) {
                        vVar.M(bluetoothGatt.getDevice(), value);
                    }
                    if (!zL || vVar.I()) {
                        BleManagerHandler.this.y0(vVar);
                    } else {
                        vVar.B(bluetoothGatt.getDevice());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    BleManagerHandler.this.G1(5, "Authentication required (" + i + ")");
                    if (bluetoothGatt.getDevice().getBondState() != 10) {
                        BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.i
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                            public final void a(qr2 qr2Var) {
                                BleManagerHandler.AnonymousClass3.o(bluetoothGatt, i, qr2Var);
                            }
                        });
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onCharacteristicRead error ");
                sb.append(i);
                if (BleManagerHandler.this.z instanceof v) {
                    BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i);
                }
                BleManagerHandler.this.D = null;
                BleManagerHandler.this.T1(bluetoothGatt.getDevice(), "Error on reading characteristic", i);
            }
            BleManagerHandler.this.v0();
            BleManagerHandler.this.I1(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(final BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (i == 0) {
                BleManagerHandler.this.G1(4, "Data written to " + bluetoothGattCharacteristic.getUuid() + ", value: " + blh.c(value));
                BleManagerHandler.this.O1(bluetoothGatt, bluetoothGattCharacteristic);
                if (BleManagerHandler.this.z instanceof g0) {
                    g0 g0Var = (g0) BleManagerHandler.this.z;
                    if (!g0Var.Q(bluetoothGatt.getDevice(), value)) {
                        y unused = BleManagerHandler.this.A;
                    }
                    if (g0Var.M()) {
                        BleManagerHandler.this.y0(g0Var);
                    } else {
                        g0Var.B(bluetoothGatt.getDevice());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    BleManagerHandler.this.G1(5, "Authentication required (" + i + ")");
                    if (bluetoothGatt.getDevice().getBondState() != 10) {
                        BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.n
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                            public final void a(qr2 qr2Var) {
                                BleManagerHandler.AnonymousClass3.p(bluetoothGatt, i, qr2Var);
                            }
                        });
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onCharacteristicWrite error ");
                sb.append(i);
                if (BleManagerHandler.this.z instanceof g0) {
                    BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i);
                    y unused2 = BleManagerHandler.this.A;
                }
                BleManagerHandler.this.D = null;
                BleManagerHandler.this.T1(bluetoothGatt.getDevice(), "Error on writing characteristic", i);
            }
            BleManagerHandler.this.v0();
            BleManagerHandler.this.I1(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onConnectionStateChange(final BluetoothGatt bluetoothGatt, final int i, int i2) {
            BleManagerHandler.this.G1(3, "[Callback] Connection state changed with status: " + i + " and new state: " + i2 + " (" + blh.g(i2) + ")");
            int iH1 = 4;
            if (i == 0 && i2 == 2) {
                if (BleManagerHandler.this.f28105b == null) {
                    BleManagerHandler.this.G1(3, "gatt.close()");
                    try {
                        bluetoothGatt.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                BleManagerHandler.this.G1(4, "Connected to " + bluetoothGatt.getDevice().getAddress());
                BleManagerHandler.this.m = true;
                BleManagerHandler.this.f28106k = 0L;
                BleManagerHandler.this.f28107r = 2;
                BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.o
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                    public final void a(qr2 qr2Var) {
                        BleManagerHandler.AnonymousClass3.q(bluetoothGatt, qr2Var);
                    }
                });
                BleManagerHandler.this.a2(new f() { // from class: qs2
                });
                if (BleManagerHandler.this.j) {
                    return;
                }
                int iZ = BleManagerHandler.this.d.z(bluetoothGatt.getDevice().getBondState() == 12);
                if (iZ > 0) {
                    BleManagerHandler.this.G1(3, "wait(" + iZ + ")");
                }
                final int iP = BleManagerHandler.P(BleManagerHandler.this);
                BleManagerHandler.this.postDelayed(new Runnable() { // from class: no.nordicsemi.android.ble.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f28114a.r(iP, bluetoothGatt);
                    }
                }, iZ);
                return;
            }
            if (i2 == 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = BleManagerHandler.this.f28106k > 0;
                boolean z2 = z && jElapsedRealtime > BleManagerHandler.this.f28106k + 20000;
                if (i != 0) {
                    BleManagerHandler.this.G1(5, "Error: (0x" + Integer.toHexString(i) + "): " + ixa.b(i));
                }
                if (i != 0 && z && !z2 && BleManagerHandler.this.y != null && BleManagerHandler.this.y.G()) {
                    int iL = BleManagerHandler.this.y.L();
                    if (iL > 0) {
                        BleManagerHandler.this.G1(3, "wait(" + iL + ")");
                    }
                    BleManagerHandler.this.postDelayed(new Runnable() { // from class: no.nordicsemi.android.ble.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f28116a.s(bluetoothGatt);
                        }
                    }, iL);
                    return;
                }
                if (BleManagerHandler.this.y != null && BleManagerHandler.this.y.Q() && BleManagerHandler.this.q && bluetoothGatt.getDevice().getBondState() == 12) {
                    BleManagerHandler.this.G1(3, "autoConnect = false called failed; retrying with autoConnect = true");
                    BleManagerHandler.this.post(new Runnable() { // from class: no.nordicsemi.android.ble.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f28121a.t(bluetoothGatt);
                        }
                    });
                    return;
                }
                BleManagerHandler.this.o = true;
                BleManagerHandler.this.f.clear();
                BleManagerHandler.this.g = null;
                BleManagerHandler.this.n = false;
                boolean z3 = BleManagerHandler.this.m;
                boolean z4 = BleManagerHandler.this.i;
                BleManagerHandler bleManagerHandler = BleManagerHandler.this;
                BluetoothDevice device = bluetoothGatt.getDevice();
                if (z2) {
                    iH1 = 10;
                } else if (!z4) {
                    iH1 = BleManagerHandler.this.H1(i);
                }
                bleManagerHandler.J1(device, iH1);
                int i3 = -1;
                if (BleManagerHandler.this.z != null && BleManagerHandler.this.z.d != x.a.DISCONNECT && BleManagerHandler.this.z.d != x.a.REMOVE_BOND) {
                    BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i == 0 ? -1 : i);
                    BleManagerHandler.this.z = null;
                }
                if (BleManagerHandler.this.D != null) {
                    BleManagerHandler.this.D.y(bluetoothGatt.getDevice(), -1);
                    BleManagerHandler.this.D = null;
                }
                if (BleManagerHandler.this.y != null) {
                    if (z4) {
                        i3 = -2;
                    } else if (i != 0) {
                        i3 = (i == 133 && z2) ? -5 : i;
                    }
                    BleManagerHandler.this.y.y(bluetoothGatt.getDevice(), i3);
                    BleManagerHandler.this.y = null;
                }
                BleManagerHandler.this.o = false;
                if (z3 && BleManagerHandler.this.q) {
                    BleManagerHandler.this.K0(bluetoothGatt.getDevice(), null);
                } else {
                    BleManagerHandler.this.q = false;
                    BleManagerHandler.this.I1(false);
                }
                if (z3 || i == 0) {
                    return;
                }
            } else if (i != 0) {
                BleManagerHandler.this.G1(6, "Error (0x" + Integer.toHexString(i) + "): " + ixa.b(i));
            }
            BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.f
                @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                public final void a(qr2 qr2Var) {
                    BleManagerHandler.AnonymousClass3.u(bluetoothGatt, i, qr2Var);
                }
            });
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(final BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
            byte[] value = bluetoothGattDescriptor.getValue();
            if (i == 0) {
                BleManagerHandler.this.G1(4, "Read Response received from descr. " + bluetoothGattDescriptor.getUuid() + ", value: " + blh.c(value));
                BleManagerHandler.this.P1(bluetoothGatt, bluetoothGattDescriptor);
                if (BleManagerHandler.this.z instanceof v) {
                    v vVar = (v) BleManagerHandler.this.z;
                    vVar.M(bluetoothGatt.getDevice(), value);
                    if (vVar.I()) {
                        BleManagerHandler.this.y0(vVar);
                    } else {
                        vVar.B(bluetoothGatt.getDevice());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    BleManagerHandler.this.G1(5, "Authentication required (" + i + ")");
                    if (bluetoothGatt.getDevice().getBondState() != 10) {
                        BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.h
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                            public final void a(qr2 qr2Var) {
                                BleManagerHandler.AnonymousClass3.v(bluetoothGatt, i, qr2Var);
                            }
                        });
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onDescriptorRead error ");
                sb.append(i);
                if (BleManagerHandler.this.z instanceof v) {
                    BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i);
                }
                BleManagerHandler.this.D = null;
                BleManagerHandler.this.T1(bluetoothGatt.getDevice(), "Error on reading descriptor", i);
            }
            BleManagerHandler.this.v0();
            BleManagerHandler.this.I1(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(final BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
            byte[] value = bluetoothGattDescriptor.getValue();
            if (i == 0) {
                BleManagerHandler.this.G1(4, "Data written to descr. " + bluetoothGattDescriptor.getUuid() + ", value: " + blh.c(value));
                if (BleManagerHandler.this.m1(bluetoothGattDescriptor)) {
                    BleManagerHandler.this.G1(4, "Service Changed notifications enabled");
                } else if (!BleManagerHandler.this.i1(bluetoothGattDescriptor)) {
                    BleManagerHandler.this.Q1(bluetoothGatt, bluetoothGattDescriptor);
                } else if (value != null && value.length == 2 && value[1] == 0) {
                    byte b2 = value[0];
                    if (b2 == 0) {
                        BleManagerHandler.this.G1(4, "Notifications and indications disabled");
                    } else if (b2 == 1) {
                        BleManagerHandler.this.G1(4, "Notifications enabled");
                    } else if (b2 == 2) {
                        BleManagerHandler.this.G1(4, "Indications enabled");
                    }
                    BleManagerHandler.this.Q1(bluetoothGatt, bluetoothGattDescriptor);
                }
                if (BleManagerHandler.this.z instanceof g0) {
                    g0 g0Var = (g0) BleManagerHandler.this.z;
                    if (!g0Var.Q(bluetoothGatt.getDevice(), value)) {
                        y unused = BleManagerHandler.this.A;
                    }
                    if (g0Var.M()) {
                        BleManagerHandler.this.y0(g0Var);
                    } else {
                        g0Var.B(bluetoothGatt.getDevice());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    BleManagerHandler.this.G1(5, "Authentication required (" + i + ")");
                    if (bluetoothGatt.getDevice().getBondState() != 10) {
                        BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.m
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                            public final void a(qr2 qr2Var) {
                                BleManagerHandler.AnonymousClass3.w(bluetoothGatt, i, qr2Var);
                            }
                        });
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("onDescriptorWrite error ");
                sb.append(i);
                if (BleManagerHandler.this.z instanceof g0) {
                    BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i);
                    y unused2 = BleManagerHandler.this.A;
                }
                BleManagerHandler.this.D = null;
                BleManagerHandler.this.T1(bluetoothGatt.getDevice(), "Error on writing descriptor", i);
            }
            BleManagerHandler.this.v0();
            BleManagerHandler.this.I1(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @RequiresApi(api = 21)
        public final void onMtuChanged(BluetoothGatt bluetoothGatt, @IntRange(from = 23, to = 517) int i, int i2) {
            if (i2 == 0) {
                BleManagerHandler.this.G1(4, "MTU changed to: " + i);
                BleManagerHandler.this.u = i;
                BleManagerHandler.this.V1(bluetoothGatt, i);
                if (BleManagerHandler.this.z instanceof t) {
                    ((t) BleManagerHandler.this.z).L(bluetoothGatt.getDevice(), i);
                    BleManagerHandler.this.z.B(bluetoothGatt.getDevice());
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("onMtuChanged error: ");
                sb.append(i2);
                sb.append(", mtu: ");
                sb.append(i);
                if (BleManagerHandler.this.z instanceof t) {
                    BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i2);
                    BleManagerHandler.this.D = null;
                }
                BleManagerHandler.this.T1(bluetoothGatt.getDevice(), "Error on mtu request", i2);
            }
            BleManagerHandler.this.v0();
            BleManagerHandler.this.I1(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @RequiresApi(api = 26)
        public final void onPhyRead(final BluetoothGatt bluetoothGatt, int i, int i2, final int i3) {
            if (i3 == 0) {
                BleManagerHandler.this.G1(4, "PHY read (TX: " + blh.f(i) + ", RX: " + blh.f(i2) + ")");
                if (BleManagerHandler.this.z instanceof u) {
                    ((u) BleManagerHandler.this.z).N(bluetoothGatt.getDevice(), i, i2);
                    BleManagerHandler.this.z.B(bluetoothGatt.getDevice());
                }
            } else {
                BleManagerHandler.this.G1(5, "PHY read failed with status " + i3);
                if (BleManagerHandler.this.z instanceof u) {
                    BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i3);
                }
                BleManagerHandler.this.D = null;
                BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.b
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                    public final void a(qr2 qr2Var) {
                        BleManagerHandler.AnonymousClass3.x(bluetoothGatt, i3, qr2Var);
                    }
                });
            }
            BleManagerHandler.this.v0();
            BleManagerHandler.this.I1(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @RequiresApi(api = 26)
        public final void onPhyUpdate(final BluetoothGatt bluetoothGatt, int i, int i2, final int i3) {
            if (i3 == 0) {
                BleManagerHandler.this.G1(4, "PHY updated (TX: " + blh.f(i) + ", RX: " + blh.f(i2) + ")");
                if (BleManagerHandler.this.z instanceof u) {
                    ((u) BleManagerHandler.this.z).N(bluetoothGatt.getDevice(), i, i2);
                    BleManagerHandler.this.z.B(bluetoothGatt.getDevice());
                }
            } else {
                BleManagerHandler.this.G1(5, "PHY updated failed with status " + i3);
                if (BleManagerHandler.this.z instanceof u) {
                    BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i3);
                    BleManagerHandler.this.D = null;
                }
                BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.g
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                    public final void a(qr2 qr2Var) {
                        BleManagerHandler.AnonymousClass3.y(bluetoothGatt, i3, qr2Var);
                    }
                });
            }
            if (BleManagerHandler.this.v0() || (BleManagerHandler.this.z instanceof u)) {
                BleManagerHandler.this.I1(true);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onReadRemoteRssi(final BluetoothGatt bluetoothGatt, @IntRange(from = -128, to = 20) int i, final int i2) {
            if (i2 == 0) {
                BleManagerHandler.this.G1(4, "Remote RSSI received: " + i + " dBm");
                if (BleManagerHandler.this.z instanceof w) {
                    ((w) BleManagerHandler.this.z).K(bluetoothGatt.getDevice(), i);
                    BleManagerHandler.this.z.B(bluetoothGatt.getDevice());
                }
            } else {
                BleManagerHandler.this.G1(5, "Reading remote RSSI failed with status " + i2);
                if (BleManagerHandler.this.z instanceof w) {
                    BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i2);
                }
                BleManagerHandler.this.D = null;
                BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.j
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                    public final void a(qr2 qr2Var) {
                        BleManagerHandler.AnonymousClass3.z(bluetoothGatt, i2, qr2Var);
                    }
                });
            }
            BleManagerHandler.this.v0();
            BleManagerHandler.this.I1(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            boolean z = BleManagerHandler.this.z.d == x.a.EXECUTE_RELIABLE_WRITE;
            BleManagerHandler.this.t = false;
            if (i != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("onReliableWriteCompleted execute ");
                sb.append(z);
                sb.append(", error ");
                sb.append(i);
                BleManagerHandler.this.z.y(bluetoothGatt.getDevice(), i);
                BleManagerHandler.this.T1(bluetoothGatt.getDevice(), "Error on Execute Reliable Write", i);
            } else if (z) {
                BleManagerHandler.this.G1(4, "Reliable Write executed");
                BleManagerHandler.this.z.B(bluetoothGatt.getDevice());
            } else {
                BleManagerHandler.this.G1(5, "Reliable Write aborted");
                BleManagerHandler.this.z.B(bluetoothGatt.getDevice());
                BleManagerHandler.this.A.y(bluetoothGatt.getDevice(), -4);
            }
            BleManagerHandler.this.v0();
            BleManagerHandler.this.I1(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @Keep
        public final void onServiceChanged(BluetoothGatt bluetoothGatt) {
            BleManagerHandler.this.G1(4, "Service changed, invalidating services");
            BleManagerHandler.this.o = true;
            BleManagerHandler.this.W1();
            BleManagerHandler.this.R1();
            BleManagerHandler.this.f.clear();
            BleManagerHandler.this.g = null;
            BleManagerHandler.this.j = true;
            BleManagerHandler.this.h = false;
            BleManagerHandler.this.G1(2, "Discovering Services...");
            BleManagerHandler.this.G1(3, "gatt.discoverServices()");
            BleManagerHandler.this.c.discoverServices();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onServicesDiscovered(final BluetoothGatt bluetoothGatt, int i) {
            if (BleManagerHandler.this.j) {
                BleManagerHandler.this.j = false;
                if (i != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onServicesDiscovered error ");
                    sb.append(i);
                    BleManagerHandler.this.T1(bluetoothGatt.getDevice(), "Error on discovering services", i);
                    if (BleManagerHandler.this.y != null) {
                        BleManagerHandler.this.y.y(bluetoothGatt.getDevice(), -4);
                        BleManagerHandler.this.y = null;
                    }
                    BleManagerHandler.this.O0(-1);
                    return;
                }
                BleManagerHandler.this.G1(4, "Services discovered");
                BleManagerHandler.this.h = true;
                if (!BleManagerHandler.this.l1(bluetoothGatt)) {
                    BleManagerHandler.this.G1(5, "Device is not supported");
                    BleManagerHandler.this.i = true;
                    BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.l
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                        public final void a(qr2 qr2Var) {
                            BleManagerHandler.AnonymousClass3.B(bluetoothGatt, qr2Var);
                        }
                    });
                    BleManagerHandler.this.O0(4);
                    return;
                }
                BleManagerHandler.this.G1(2, "Primary service found");
                BleManagerHandler.this.i = false;
                final boolean zK1 = BleManagerHandler.this.k1(bluetoothGatt);
                if (zK1) {
                    BleManagerHandler.this.G1(2, "Secondary service found");
                }
                BleManagerHandler.this.Z1(new e() { // from class: no.nordicsemi.android.ble.k
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                    public final void a(qr2 qr2Var) {
                        BleManagerHandler.AnonymousClass3.A(bluetoothGatt, zK1, qr2Var);
                    }
                });
                BleManagerHandler.X(BleManagerHandler.this);
                BleManagerHandler.this.o = true;
                BleManagerHandler bleManagerHandler = BleManagerHandler.this;
                bleManagerHandler.g = bleManagerHandler.G0(bluetoothGatt);
                boolean z = BleManagerHandler.this.g != null;
                if (z) {
                    for (x xVar : BleManagerHandler.this.g) {
                        xVar.D(BleManagerHandler.this);
                        xVar.n = true;
                    }
                }
                if (BleManagerHandler.this.g == null) {
                    BleManagerHandler.this.g = new LinkedBlockingDeque();
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 26 || i2 == 27 || i2 == 28) {
                    BleManagerHandler.this.y0(x.t().D(BleManagerHandler.this));
                    BleManagerHandler.this.o = true;
                }
                if (z) {
                    BleManagerHandler.this.d.G();
                    if (BleManagerHandler.this.d.c != null && BleManagerHandler.this.d.c.shouldEnableBatteryLevelNotifications(bluetoothGatt.getDevice())) {
                        BleManagerHandler.this.d.u();
                    }
                }
                BleManagerHandler.this.H0();
                BleManagerHandler.this.I1(true);
            }
        }

        public final /* synthetic */ void r(int i, BluetoothGatt bluetoothGatt) {
            if (i != BleManagerHandler.this.l || !BleManagerHandler.this.m || BleManagerHandler.this.h || BleManagerHandler.this.j || bluetoothGatt.getDevice().getBondState() == 11) {
                return;
            }
            BleManagerHandler.this.j = true;
            BleManagerHandler.this.G1(2, "Discovering services...");
            BleManagerHandler.this.G1(3, "gatt.discoverServices()");
            bluetoothGatt.discoverServices();
        }

        public final /* synthetic */ void s(BluetoothGatt bluetoothGatt) {
            BleManagerHandler.this.K0(bluetoothGatt.getDevice(), BleManagerHandler.this.y);
        }

        public final /* synthetic */ void t(BluetoothGatt bluetoothGatt) {
            BleManagerHandler.this.K0(bluetoothGatt.getDevice(), BleManagerHandler.this.y);
        }
    }

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
            BleManagerHandler.this.G1(3, "[Broadcast] Action received: android.bluetooth.adapter.action.STATE_CHANGED, state changed to " + a(intExtra));
            if (intExtra == 10 || intExtra == 13) {
                if (intExtra2 == 13 || intExtra2 == 10) {
                    BleManagerHandler.this.w0();
                    return;
                }
                BleManagerHandler.this.o = true;
                BleManagerHandler.this.f.clear();
                BleManagerHandler.this.g = null;
                BluetoothDevice bluetoothDevice = BleManagerHandler.this.f28105b;
                if (bluetoothDevice != null) {
                    if (BleManagerHandler.this.z != null && BleManagerHandler.this.z.d != x.a.DISCONNECT) {
                        BleManagerHandler.this.z.y(bluetoothDevice, -100);
                        BleManagerHandler.this.z = null;
                    }
                    if (BleManagerHandler.this.D != null) {
                        BleManagerHandler.this.D.y(bluetoothDevice, -100);
                        BleManagerHandler.this.D = null;
                    }
                    if (BleManagerHandler.this.y != null) {
                        BleManagerHandler.this.y.y(bluetoothDevice, -100);
                        BleManagerHandler.this.y = null;
                    }
                }
                BleManagerHandler.this.p = true;
                BleManagerHandler.this.o = false;
                if (bluetoothDevice != null) {
                    BleManagerHandler.this.J1(bluetoothDevice, 1);
                }
            }
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        public final /* synthetic */ void h() {
            BleManagerHandler.this.j = true;
            BleManagerHandler.this.G1(2, "Discovering services...");
            BleManagerHandler.this.G1(3, "gatt.discoverServices()");
            BleManagerHandler.this.c.discoverServices();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
            if (BleManagerHandler.this.f28105b == null || bluetoothDevice == null || !bluetoothDevice.getAddress().equals(BleManagerHandler.this.f28105b.getAddress())) {
                return;
            }
            BleManagerHandler.this.G1(3, "[Broadcast] Action received: android.bluetooth.device.action.BOND_STATE_CHANGED, bond state changed to: " + blh.a(intExtra) + " (" + intExtra + ")");
            switch (intExtra) {
                case 10:
                    if (intExtra2 == 11) {
                        BleManagerHandler.this.Z1(new e() { // from class: ls2
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                            public final void a(qr2 qr2Var) {
                                qr2Var.onBondingFailed(bluetoothDevice);
                            }
                        });
                        BleManagerHandler.this.Y1(new d() { // from class: ms2
                        });
                        BleManagerHandler.this.G1(5, "Bonding failed");
                        if (BleManagerHandler.this.z != null) {
                            BleManagerHandler.this.z.y(bluetoothDevice, -4);
                            BleManagerHandler.this.z = null;
                        }
                    } else if (intExtra2 == 12) {
                        if (BleManagerHandler.this.z != null && BleManagerHandler.this.z.d == x.a.REMOVE_BOND) {
                            BleManagerHandler.this.G1(4, "Bond information removed");
                            BleManagerHandler.this.z.B(bluetoothDevice);
                            BleManagerHandler.this.z = null;
                        }
                        BleManagerHandler.this.w0();
                    }
                    break;
                case 11:
                    BleManagerHandler.this.Z1(new e() { // from class: ns2
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                        public final void a(qr2 qr2Var) {
                            qr2Var.onBondingRequired(bluetoothDevice);
                        }
                    });
                    BleManagerHandler.this.Y1(new d() { // from class: ms2
                    });
                    return;
                case 12:
                    BleManagerHandler.this.G1(4, "Device bonded");
                    BleManagerHandler.this.Z1(new e() { // from class: os2
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                        public final void a(qr2 qr2Var) {
                            qr2Var.onBonded(bluetoothDevice);
                        }
                    });
                    BleManagerHandler.this.Y1(new d() { // from class: ms2
                    });
                    if (BleManagerHandler.this.z == null || BleManagerHandler.this.z.d != x.a.CREATE_BOND) {
                        if (BleManagerHandler.this.h || BleManagerHandler.this.j) {
                            return;
                        }
                        BleManagerHandler.this.post(new Runnable() { // from class: ps2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f30695a.h();
                            }
                        });
                        return;
                    }
                    BleManagerHandler.this.z.B(bluetoothDevice);
                    BleManagerHandler.this.z = null;
                    break;
            }
            BleManagerHandler.this.I1(true);
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28111a;

        static {
            int[] iArr = new int[x.a.values().length];
            f28111a = iArr;
            try {
                iArr[x.a.NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28111a[x.a.INDICATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28111a[x.a.WAIT_FOR_NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28111a[x.a.WAIT_FOR_INDICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28111a[x.a.WAIT_FOR_READ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28111a[x.a.WAIT_FOR_WRITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28111a[x.a.CONNECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28111a[x.a.DISCONNECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28111a[x.a.ENSURE_BOND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28111a[x.a.CREATE_BOND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28111a[x.a.REMOVE_BOND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28111a[x.a.SET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28111a[x.a.READ.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28111a[x.a.WRITE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28111a[x.a.READ_DESCRIPTOR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28111a[x.a.WRITE_DESCRIPTOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28111a[x.a.SET_VALUE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28111a[x.a.SET_DESCRIPTOR_VALUE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f28111a[x.a.BEGIN_RELIABLE_WRITE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f28111a[x.a.EXECUTE_RELIABLE_WRITE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f28111a[x.a.ABORT_RELIABLE_WRITE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f28111a[x.a.ENABLE_NOTIFICATIONS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f28111a[x.a.ENABLE_INDICATIONS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f28111a[x.a.DISABLE_NOTIFICATIONS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f28111a[x.a.DISABLE_INDICATIONS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f28111a[x.a.READ_BATTERY_LEVEL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f28111a[x.a.ENABLE_BATTERY_LEVEL_NOTIFICATIONS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f28111a[x.a.DISABLE_BATTERY_LEVEL_NOTIFICATIONS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f28111a[x.a.ENABLE_SERVICE_CHANGED_INDICATIONS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f28111a[x.a.REQUEST_MTU.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f28111a[x.a.REQUEST_CONNECTION_PRIORITY.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f28111a[x.a.SET_PREFERRED_PHY.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f28111a[x.a.READ_PHY.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f28111a[x.a.READ_RSSI.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f28111a[x.a.REFRESH_CACHE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f28111a[x.a.SLEEP.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    public interface d {
    }

    @Deprecated
    public interface e {
        void a(qr2 qr2Var);
    }

    public interface f {
    }

    public static BluetoothGattDescriptor C0(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (bluetoothGattCharacteristic == null || (i & bluetoothGattCharacteristic.getProperties()) == 0) {
            return null;
        }
        return bluetoothGattCharacteristic.getDescriptor(pr2.e);
    }

    public static /* synthetic */ int P(BleManagerHandler bleManagerHandler) {
        int i = bleManagerHandler.l + 1;
        bleManagerHandler.l = i;
        return i;
    }

    public static /* synthetic */ it2 X(BleManagerHandler bleManagerHandler) {
        bleManagerHandler.getClass();
        return null;
    }

    @Deprecated
    public an5 A0() {
        return new an5() { // from class: tr2
            @Override // defpackage.an5
            public final void a(BluetoothDevice bluetoothDevice, Data data) {
                this.f34953a.o1(bluetoothDevice, data);
            }
        };
    }

    public BluetoothDevice B0() {
        return this.f28105b;
    }

    public final int D0() {
        return this.u;
    }

    public knq E0(Object obj) {
        knq knqVar = this.B.get(obj);
        if (knqVar == null) {
            knqVar = new knq(this);
            if (obj != null) {
                this.B.put(obj, knqVar);
            }
        }
        return knqVar.b();
    }

    public void F0(pr2 pr2Var, Handler handler) {
        this.d = pr2Var;
        this.e = handler;
    }

    public final /* synthetic */ void F1(final BluetoothDevice bluetoothDevice, Data data) {
        if (data.e() == 1) {
            final int iIntValue = data.a(17, 0).intValue();
            this.v = iIntValue;
            K1(this.c, iIntValue);
            Z1(new e() { // from class: bs2
                @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                public final void a(qr2 qr2Var) {
                    qr2Var.onBatteryValueReceived(bluetoothDevice, iIntValue);
                }
            });
        }
    }

    @Deprecated
    public Deque<x> G0(BluetoothGatt bluetoothGatt) {
        return null;
    }

    public final void G1(int i, String str) {
        this.d.D(i, str);
    }

    public abstract void H0();

    public final int H1(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 8) {
            return 10;
        }
        if (i != 19) {
            return i != 22 ? -1 : 1;
        }
        return 2;
    }

    public final boolean I0() {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m || !this.t) {
            return false;
        }
        G1(2, "Aborting reliable write...");
        G1(3, "gatt.abortReliableWrite()");
        bluetoothGatt.abortReliableWrite();
        return true;
    }

    @SuppressLint({"MissingPermission"})
    public final synchronized void I1(boolean z) {
        final x xVarG;
        boolean zB1;
        int i;
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        if (z) {
            try {
                if (this.o) {
                    this.o = this.D != null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.o) {
            return;
        }
        final BluetoothDevice bluetoothDevice = this.f28105b;
        try {
            y yVar = this.A;
            if (yVar == null) {
                xVarG = null;
            } else if (yVar.I()) {
                xVarG = this.A.H().D(this);
            } else {
                this.A.B(bluetoothDevice);
                this.A = null;
                xVarG = null;
            }
            if (xVarG == null) {
                Deque<x> deque = this.g;
                xVarG = deque != null ? deque.poll() : null;
            }
        } catch (Exception unused) {
        }
        if (xVarG == null) {
            if (this.g != null) {
                this.g = null;
                this.o = true;
                this.n = true;
                S1();
                if (bluetoothDevice != null) {
                    Z1(new e() { // from class: gs2
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                        public final void a(qr2 qr2Var) {
                            qr2Var.onDeviceReady(bluetoothDevice);
                        }
                    });
                    a2(new hs2(bluetoothDevice));
                }
                q qVar = this.y;
                if (qVar != null) {
                    qVar.B(qVar.J());
                    this.y = null;
                }
            }
            try {
                xVarG = this.f.remove();
            } catch (Exception unused2) {
                this.o = false;
                this.z = null;
                U1();
                return;
            }
        }
        this.o = true;
        this.z = xVarG;
        if (xVarG instanceof no.nordicsemi.android.ble.a) {
            no.nordicsemi.android.ble.a<?> aVar = (no.nordicsemi.android.ble.a) xVarG;
            int i2 = c.f28111a[xVarG.d.ordinal()];
            if (i2 == 3) {
                i = 16;
            } else if (i2 == 4) {
                i = 32;
            } else if (i2 != 5) {
                i = i2 != 6 ? 0 : 76;
            } else {
                i = 2;
            }
            zB1 = this.m && bluetoothDevice != null && ((bluetoothGattCharacteristic = aVar.e) == null || (i & bluetoothGattCharacteristic.getProperties()) != 0);
            if (zB1) {
                if (aVar instanceof p) {
                    p pVar = (p) aVar;
                    if (pVar.M()) {
                        pVar.A(bluetoothDevice);
                        pVar.B(bluetoothDevice);
                        I1(true);
                        return;
                    }
                }
                this.D = aVar;
                if (aVar.G() != null) {
                    aVar.A(bluetoothDevice);
                    xVarG = aVar.G();
                    this.z = xVarG;
                }
            }
        } else {
            zB1 = false;
        }
        if (xVarG.d == x.a.CONNECT) {
            q qVar2 = (q) xVarG;
            qVar2.A(qVar2.J());
        } else {
            if (bluetoothDevice == null) {
                xVarG.z();
                this.D = null;
                I1(true);
                return;
            }
            xVarG.A(bluetoothDevice);
        }
        int i3 = c.f28111a[xVarG.d.ordinal()];
        if (i3 != 1 && i3 != 2) {
            switch (i3) {
                case 7:
                    q qVar3 = (q) xVarG;
                    this.y = qVar3;
                    this.z = null;
                    zB1 = K0(qVar3.J(), qVar3);
                    break;
                case 8:
                    zB1 = O0(0);
                    break;
                case 9:
                    zB1 = L0(true);
                    break;
                case 10:
                    zB1 = L0(false);
                    break;
                case 11:
                    zB1 = Y0();
                    break;
                case 12:
                    this.A = (y) xVarG;
                    I1(true);
                    return;
                case 13:
                    zB1 = T0(xVarG.e);
                    break;
                case 14:
                    g0 g0Var = (g0) xVarG;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = xVarG.e;
                    if (bluetoothGattCharacteristic2 != null) {
                        bluetoothGattCharacteristic2.setValue(g0Var.K(this.u));
                        bluetoothGattCharacteristic2.setWriteType(g0Var.L());
                    }
                    zB1 = e1(bluetoothGattCharacteristic2);
                    break;
                case 15:
                    zB1 = U0(xVarG.f);
                    break;
                case 16:
                    g0 g0Var2 = (g0) xVarG;
                    BluetoothGattDescriptor bluetoothGattDescriptor = xVarG.f;
                    if (bluetoothGattDescriptor != null) {
                        bluetoothGattDescriptor.setValue(g0Var2.K(this.u));
                    }
                    zB1 = f1(bluetoothGattDescriptor);
                    break;
                case 17:
                    z zVar = (z) xVarG;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic3 = zVar.e;
                    if (bluetoothGattCharacteristic3 != null) {
                        Map<BluetoothGattCharacteristic, byte[]> map = this.w;
                        if (map == null || !map.containsKey(bluetoothGattCharacteristic3)) {
                            zVar.e.setValue(zVar.G(this.u));
                        } else {
                            this.w.put(zVar.e, zVar.G(this.u));
                        }
                        zVar.B(bluetoothDevice);
                        I1(true);
                    }
                case 18:
                    z zVar2 = (z) xVarG;
                    BluetoothGattDescriptor bluetoothGattDescriptor2 = zVar2.f;
                    if (bluetoothGattDescriptor2 != null) {
                        Map<BluetoothGattDescriptor, byte[]> map2 = this.x;
                        if (map2 == null || !map2.containsKey(bluetoothGattDescriptor2)) {
                            zVar2.f.setValue(zVar2.G(this.u));
                        } else {
                            this.x.put(zVar2.f, zVar2.G(this.u));
                        }
                        zVar2.B(bluetoothDevice);
                        I1(true);
                    }
                case 19:
                    zB1 = J0();
                    if (zB1) {
                        this.z.B(bluetoothDevice);
                        I1(true);
                        return;
                    }
                    break;
                case 20:
                    zB1 = R0();
                    break;
                case 21:
                    zB1 = I0();
                    break;
                case 22:
                    zB1 = Q0(xVarG.e);
                    break;
                case 23:
                    zB1 = P0(xVarG.e);
                    break;
                case 24:
                    zB1 = N0(xVarG.e);
                    break;
                case 25:
                    zB1 = M0(xVarG.e);
                    break;
                case 26:
                    zB1 = S0();
                    break;
                case 27:
                    zB1 = c1(true);
                    break;
                case 28:
                    zB1 = c1(false);
                    break;
                case 29:
                    zB1 = z0();
                    break;
                case 30:
                    t tVar = (t) xVarG;
                    if (this.u != tVar.I()) {
                        zB1 = a1(tVar.I());
                    } else {
                        zB1 = this.m;
                        if (zB1) {
                            tVar.L(bluetoothDevice, this.u);
                            tVar.B(bluetoothDevice);
                            I1(true);
                            return;
                        }
                    }
                    break;
                case 31:
                    final r rVar = (r) xVarG;
                    this.s = true;
                    zB1 = Z0(rVar.H());
                    if (!zB1) {
                        this.s = false;
                    } else {
                        postDelayed(new Runnable() { // from class: is2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f22034a.v1(rVar, bluetoothDevice);
                            }
                        }, 200L);
                    }
                    break;
                case 32:
                    u uVar = (u) xVarG;
                    zB1 = d1(uVar.K(), uVar.J(), uVar.I());
                    break;
                case 33:
                    zB1 = V0();
                    break;
                case 34:
                    zB1 = W0();
                    if (zB1) {
                        postDelayed(new Runnable() { // from class: js2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f23080a.w1(xVarG, bluetoothDevice);
                            }
                        }, 1000L);
                    }
                    break;
                case 35:
                    zB1 = X0();
                    if (zB1) {
                        postDelayed(new Runnable() { // from class: ks2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f24248a.x1(xVarG, bluetoothDevice);
                            }
                        }, 200L);
                    }
                    break;
                case 36:
                    final c0 c0Var = (c0) xVarG;
                    G1(3, "sleep(" + c0Var.G() + ")");
                    postDelayed(new Runnable() { // from class: sr2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f33902a.y1(c0Var, bluetoothDevice);
                        }
                    }, c0Var.G());
                default:
                    break;
            }
        } else {
            g0 g0Var3 = (g0) xVarG;
            BluetoothGattCharacteristic bluetoothGattCharacteristic4 = xVarG.e;
            if (bluetoothGattCharacteristic4 != null) {
                bluetoothGattCharacteristic4.setValue(g0Var3.K(this.u));
                Map<BluetoothGattCharacteristic, byte[]> map3 = this.w;
                if (map3 != null && map3.containsKey(bluetoothGattCharacteristic4)) {
                    this.w.put(bluetoothGattCharacteristic4, bluetoothGattCharacteristic4.getValue());
                }
            }
            zB1 = b1(xVarG.e, xVarG.d == x.a.INDICATE);
        }
        if (!zB1 && bluetoothDevice != null) {
            xVarG.y(bluetoothDevice, this.m ? -3 : BluetoothAdapter.getDefaultAdapter().isEnabled() ? -1 : -100);
            this.D = null;
            this.s = false;
            I1(true);
        }
    }

    public final boolean J0() {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m) {
            return false;
        }
        if (this.t) {
            return true;
        }
        G1(2, "Beginning reliable write...");
        G1(3, "gatt.beginReliableWrite()");
        boolean zBeginReliableWrite = bluetoothGatt.beginReliableWrite();
        this.t = zBeginReliableWrite;
        return zBeginReliableWrite;
    }

    public final void J1(final BluetoothDevice bluetoothDevice, int i) {
        boolean z = this.m;
        this.m = false;
        this.h = false;
        this.j = false;
        this.i = false;
        this.u = 23;
        this.f28107r = 0;
        v0();
        if (!z) {
            G1(5, "Connection attempt timed out");
            w0();
            Z1(new e() { // from class: cs2
                @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                public final void a(qr2 qr2Var) {
                    qr2Var.onDeviceDisconnected(bluetoothDevice);
                }
            });
            a2(new ds2(bluetoothDevice, i));
        } else if (this.p) {
            G1(4, "Disconnected");
            w0();
            Z1(new e() { // from class: es2
                @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                public final void a(qr2 qr2Var) {
                    qr2Var.onDeviceDisconnected(bluetoothDevice);
                }
            });
            a2(new ds2(bluetoothDevice, i));
            x xVar = this.z;
            if (xVar != null && xVar.d == x.a.DISCONNECT) {
                xVar.B(bluetoothDevice);
            }
        } else {
            G1(5, "Connection lost");
            Z1(new e() { // from class: fs2
                @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                public final void a(qr2 qr2Var) {
                    qr2Var.onLinkLossOccurred(bluetoothDevice);
                }
            });
            a2(new ds2(bluetoothDevice, i != 2 ? 3 : 2));
        }
        W1();
        R1();
    }

    public final boolean K0(final BluetoothDevice bluetoothDevice, q qVar) {
        boolean zIsEnabled = BluetoothAdapter.getDefaultAdapter().isEnabled();
        if (this.m || !zIsEnabled) {
            BluetoothDevice bluetoothDevice2 = this.f28105b;
            if (zIsEnabled && bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
                this.y.B(bluetoothDevice);
            } else {
                q qVar2 = this.y;
                if (qVar2 != null) {
                    qVar2.y(bluetoothDevice, zIsEnabled ? -4 : -100);
                }
            }
            this.y = null;
            I1(true);
            return true;
        }
        Context contextW = this.d.w();
        synchronized (this.f28104a) {
            if (this.c != null) {
                if (this.q) {
                    this.q = false;
                    this.f28106k = 0L;
                    this.f28107r = 1;
                    G1(2, "Connecting...");
                    Z1(new e() { // from class: xr2
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                        public final void a(qr2 qr2Var) {
                            qr2Var.onDeviceConnecting(bluetoothDevice);
                        }
                    });
                    a2(new hs2(bluetoothDevice));
                    G1(3, "gatt.connect()");
                    this.c.connect();
                    return true;
                }
                G1(3, "gatt.close()");
                try {
                    this.c.close();
                } catch (Throwable unused) {
                }
                this.c = null;
                try {
                    G1(3, "wait(200)");
                    Thread.sleep(200L);
                } catch (InterruptedException unused2) {
                }
            } else if (qVar != null) {
                contextW.registerReceiver(this.E, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                contextW.registerReceiver(this.F, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
            }
            if (qVar == null) {
                return false;
            }
            boolean zQ = qVar.Q();
            this.p = !zQ;
            if (zQ) {
                this.q = true;
            }
            this.f28105b = bluetoothDevice;
            G1(2, qVar.N() ? "Connecting..." : "Retrying...");
            this.f28107r = 1;
            Z1(new e() { // from class: yr2
                @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                public final void a(qr2 qr2Var) {
                    qr2Var.onDeviceConnecting(bluetoothDevice);
                }
            });
            a2(new hs2(bluetoothDevice));
            this.f28106k = SystemClock.elapsedRealtime();
            int i = Build.VERSION.SDK_INT;
            if (i > 26) {
                int iK = qVar.K();
                G1(3, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, " + blh.e(iK) + ")");
                this.c = bluetoothDevice.connectGatt(contextW, false, this.G, 2, iK, this.e);
            } else if (i == 26) {
                int iK2 = qVar.K();
                G1(3, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, " + blh.e(iK2) + ")");
                this.c = bluetoothDevice.connectGatt(contextW, false, this.G, 2, iK2);
            } else {
                G1(3, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE)");
                this.c = bluetoothDevice.connectGatt(contextW, false, this.G, 2);
            }
            return true;
        }
    }

    @Deprecated
    public void K1(BluetoothGatt bluetoothGatt, @IntRange(from = 0, to = 100) int i) {
    }

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    public final boolean L0(boolean z) {
        BluetoothDevice bluetoothDevice = this.f28105b;
        if (bluetoothDevice == null) {
            return false;
        }
        if (z) {
            G1(2, "Ensuring bonding...");
        } else {
            G1(2, "Starting bonding...");
        }
        if (!z && bluetoothDevice.getBondState() == 12) {
            G1(5, "Bond information present on client, skipping bonding");
            this.z.B(bluetoothDevice);
            I1(true);
            return true;
        }
        boolean zX0 = x0(bluetoothDevice);
        if (!z || zX0) {
            return zX0;
        }
        x xVarD = x.g().D(this);
        x xVar = this.z;
        xVarD.h = xVar.h;
        xVarD.j = xVar.j;
        xVarD.i = xVar.i;
        xVarD.l = xVar.l;
        xVarD.m = xVar.m;
        xVar.h = null;
        xVar.j = null;
        xVar.i = null;
        xVar.l = null;
        xVar.m = null;
        y0(xVarD);
        y0(x.C().D(this));
        I1(true);
        return true;
    }

    @Deprecated
    public void L1(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    public final boolean M0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return N0(bluetoothGattCharacteristic);
    }

    @Deprecated
    public void M1(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    public final boolean N0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorC0;
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.m || (bluetoothGattDescriptorC0 = C0(bluetoothGattCharacteristic, 16)) == null) {
            return false;
        }
        G1(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", false)");
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false);
        bluetoothGattDescriptorC0.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        G1(2, "Disabling notifications and indications for " + bluetoothGattCharacteristic.getUuid());
        G1(3, "gatt.writeDescriptor(" + pr2.e + ", value=0x00-00)");
        return g1(bluetoothGattDescriptorC0);
    }

    @Deprecated
    public void N1(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    public final boolean O0(int i) {
        this.p = true;
        this.q = false;
        this.n = false;
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt != null) {
            boolean z = this.m;
            this.f28107r = 3;
            G1(2, z ? "Disconnecting..." : "Cancelling connection...");
            final BluetoothDevice device = bluetoothGatt.getDevice();
            if (z) {
                Z1(new e() { // from class: vr2
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                    public final void a(qr2 qr2Var) {
                        qr2Var.onDeviceDisconnecting(device);
                    }
                });
                a2(new hs2(device));
            }
            G1(3, "gatt.disconnect()");
            bluetoothGatt.disconnect();
            if (z) {
                return true;
            }
            this.f28107r = 0;
            G1(4, "Disconnected");
            w0();
            Z1(new e() { // from class: wr2
                @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                public final void a(qr2 qr2Var) {
                    qr2Var.onDeviceDisconnected(device);
                }
            });
            a2(new ds2(device, i));
        }
        x xVar = this.z;
        if (xVar != null && xVar.d == x.a.DISCONNECT) {
            BluetoothDevice device2 = this.f28105b;
            if (device2 == null && bluetoothGatt == null) {
                xVar.z();
            } else {
                if (device2 == null) {
                    device2 = bluetoothGatt.getDevice();
                }
                xVar.B(device2);
            }
        }
        I1(true);
        return true;
    }

    @Deprecated
    public void O1(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    public final boolean P0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorC0;
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.m || (bluetoothGattDescriptorC0 = C0(bluetoothGattCharacteristic, 32)) == null) {
            return false;
        }
        G1(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)");
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        bluetoothGattDescriptorC0.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        G1(2, "Enabling indications for " + bluetoothGattCharacteristic.getUuid());
        G1(3, "gatt.writeDescriptor(" + pr2.e + ", value=0x02-00)");
        return g1(bluetoothGattDescriptorC0);
    }

    @Deprecated
    public void P1(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
    }

    public final boolean Q0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorC0;
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.m || (bluetoothGattDescriptorC0 = C0(bluetoothGattCharacteristic, 16)) == null) {
            return false;
        }
        G1(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)");
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        bluetoothGattDescriptorC0.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        G1(2, "Enabling notifications for " + bluetoothGattCharacteristic.getUuid());
        G1(3, "gatt.writeDescriptor(" + pr2.e + ", value=0x01-00)");
        return g1(bluetoothGattDescriptorC0);
    }

    @Deprecated
    public void Q1(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
    }

    public final boolean R0() {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m || !this.t) {
            return false;
        }
        G1(2, "Executing reliable write...");
        G1(3, "gatt.executeReliableWrite()");
        return bluetoothGatt.executeReliableWrite();
    }

    @Deprecated
    public void R1() {
    }

    @Deprecated
    public final boolean S0() {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m || (service = bluetoothGatt.getService(pr2.f)) == null) {
            return false;
        }
        return T0(service.getCharacteristic(pr2.g));
    }

    public void S1() {
    }

    public final boolean T0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.m || (bluetoothGattCharacteristic.getProperties() & 2) == 0) {
            return false;
        }
        G1(2, "Reading characteristic " + bluetoothGattCharacteristic.getUuid());
        G1(3, "gatt.readCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
        return bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
    }

    public final void T1(final BluetoothDevice bluetoothDevice, final String str, final int i) {
        G1(6, "Error (0x" + Integer.toHexString(i) + "): " + ixa.a(i));
        Z1(new e() { // from class: rr2
            @Override // no.nordicsemi.android.ble.BleManagerHandler.e
            public final void a(qr2 qr2Var) {
                qr2Var.onError(bluetoothDevice, str, i);
            }
        });
    }

    public final boolean U0(BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || bluetoothGattDescriptor == null || !this.m) {
            return false;
        }
        G1(2, "Reading descriptor " + bluetoothGattDescriptor.getUuid());
        G1(3, "gatt.readDescriptor(" + bluetoothGattDescriptor.getUuid() + ")");
        return bluetoothGatt.readDescriptor(bluetoothGattDescriptor);
    }

    public void U1() {
    }

    @RequiresApi(api = 26)
    public final boolean V0() {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m) {
            return false;
        }
        G1(2, "Reading PHY...");
        G1(3, "gatt.readPhy()");
        bluetoothGatt.readPhy();
        return true;
    }

    @Deprecated
    public void V1(BluetoothGatt bluetoothGatt, @IntRange(from = 23, to = 517) int i) {
    }

    public final boolean W0() {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m) {
            return false;
        }
        G1(2, "Reading remote RSSI...");
        G1(3, "gatt.readRemoteRssi()");
        return bluetoothGatt.readRemoteRssi();
    }

    public abstract void W1();

    public final boolean X0() {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null) {
            return false;
        }
        G1(2, "Refreshing device cache...");
        G1(3, "gatt.refresh() (hidden)");
        try {
            return bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0]) == Boolean.TRUE;
        } catch (Exception unused) {
            G1(5, "gatt.refresh() method not found");
            return false;
        }
    }

    public final void X1(@IntRange(from = 23, to = 517) int i) {
        this.u = i;
    }

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    public final boolean Y0() {
        BluetoothDevice bluetoothDevice = this.f28105b;
        if (bluetoothDevice == null) {
            return false;
        }
        G1(2, "Removing bond information...");
        if (bluetoothDevice.getBondState() == 10) {
            G1(5, "Device is not bonded");
            this.z.B(bluetoothDevice);
            I1(true);
            return true;
        }
        try {
            Method method = bluetoothDevice.getClass().getMethod("removeBond", new Class[0]);
            G1(3, "device.removeBond() (hidden)");
            return method.invoke(bluetoothDevice, new Object[0]) == Boolean.TRUE;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void Y1(d dVar) {
        this.d.getClass();
    }

    @RequiresApi(api = 21)
    public final boolean Z0(int i) {
        String str;
        String str2;
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m) {
            return false;
        }
        if (i == 1) {
            str = "HIGH (11.25–15ms, 0, 20s)";
            str2 = "HIGH";
        } else if (i != 2) {
            str = "BALANCED (30–50ms, 0, 20s)";
            str2 = "BALANCED";
        } else {
            str = "LOW POWER (100–125ms, 2, 20s)";
            str2 = "LOW POWER";
        }
        G1(2, "Requesting connection priority: " + str + "...");
        G1(3, "gatt.requestConnectionPriority(" + str2 + ")");
        return bluetoothGatt.requestConnectionPriority(i);
    }

    @Deprecated
    public final void Z1(final e eVar) {
        final qr2 qr2Var = this.d.c;
        if (qr2Var != null) {
            post(new Runnable() { // from class: ur2
                @Override // java.lang.Runnable
                public final void run() {
                    eVar.a(qr2Var);
                }
            });
        }
    }

    @Override // defpackage.bb3
    public void a(Runnable runnable) {
        this.e.removeCallbacks(runnable);
    }

    @RequiresApi(api = 21)
    public final boolean a1(@IntRange(from = 23, to = 517) int i) {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m) {
            return false;
        }
        G1(2, "Requesting new MTU...");
        G1(3, "gatt.requestMtu(" + i + ")");
        return bluetoothGatt.requestMtu(i);
    }

    public final void a2(f fVar) {
        this.d.getClass();
    }

    @Override // defpackage.mok
    public final void b(x xVar) {
        Deque<x> deque = this.g;
        if (deque == null) {
            deque = this.f;
        }
        deque.add(xVar);
        xVar.n = true;
        I1(false);
    }

    public final boolean b1(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return false;
    }

    @Deprecated
    public void b2() {
        if (this.C == null) {
            this.C = new knq(this).f(new an5() { // from class: zr2
                @Override // defpackage.an5
                public final void a(BluetoothDevice bluetoothDevice, Data data) {
                    this.f41589a.F1(bluetoothDevice, data);
                }
            });
        }
    }

    @Override // defpackage.mok
    public final void c(d0 d0Var) {
        this.z = null;
        this.D = null;
        x.a aVar = d0Var.d;
        if (aVar == x.a.CONNECT) {
            this.y = null;
            O0(10);
        } else if (aVar == x.a.DISCONNECT) {
            w0();
        } else {
            I1(true);
        }
    }

    @Deprecated
    public final boolean c1(boolean z) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m || (service = bluetoothGatt.getService(pr2.f)) == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(pr2.g);
        return z ? Q0(characteristic) : N0(characteristic);
    }

    @RequiresApi(api = 26)
    public final boolean d1(int i, int i2, int i3) {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m) {
            return false;
        }
        G1(2, "Requesting preferred PHYs...");
        G1(3, "gatt.setPreferredPhy(" + blh.e(i) + ", " + blh.e(i2) + ", coding option = " + blh.d(i3) + ")");
        bluetoothGatt.setPreferredPhy(i, i2, i3);
        return true;
    }

    public final boolean e1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.m || (bluetoothGattCharacteristic.getProperties() & 12) == 0) {
            return false;
        }
        G1(2, "Writing characteristic " + bluetoothGattCharacteristic.getUuid() + " (" + blh.h(bluetoothGattCharacteristic.getWriteType()) + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("gatt.writeCharacteristic(");
        sb.append(bluetoothGattCharacteristic.getUuid());
        sb.append(")");
        G1(3, sb.toString());
        return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
    }

    public final boolean f1(BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (this.c == null || bluetoothGattDescriptor == null || !this.m) {
            return false;
        }
        G1(2, "Writing descriptor " + bluetoothGattDescriptor.getUuid());
        G1(3, "gatt.writeDescriptor(" + bluetoothGattDescriptor.getUuid() + ")");
        return g1(bluetoothGattDescriptor);
    }

    public final boolean g1(BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || bluetoothGattDescriptor == null || !this.m) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(2);
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
        characteristic.setWriteType(writeType);
        return zWriteDescriptor;
    }

    @Deprecated
    public final boolean h1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic != null && pr2.g.equals(bluetoothGattCharacteristic.getUuid());
    }

    public final boolean i1(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return bluetoothGattDescriptor != null && pr2.e.equals(bluetoothGattDescriptor.getUuid());
    }

    public final boolean j1() {
        return this.m;
    }

    public boolean k1(BluetoothGatt bluetoothGatt) {
        return false;
    }

    public abstract boolean l1(BluetoothGatt bluetoothGatt);

    public final boolean m1(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return bluetoothGattDescriptor != null && pr2.i.equals(bluetoothGattDescriptor.getCharacteristic().getUuid());
    }

    public final boolean n1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic != null && pr2.i.equals(bluetoothGattCharacteristic.getUuid());
    }

    public final /* synthetic */ void o1(final BluetoothDevice bluetoothDevice, Data data) {
        if (data.e() == 1) {
            final int iIntValue = data.a(17, 0).intValue();
            G1(4, "Battery Level received: " + iIntValue + "%");
            this.v = iIntValue;
            K1(this.c, iIntValue);
            Z1(new e() { // from class: as2
                @Override // no.nordicsemi.android.ble.BleManagerHandler.e
                public final void a(qr2 qr2Var) {
                    qr2Var.onBatteryValueReceived(bluetoothDevice, iIntValue);
                }
            });
        }
    }

    @Override // defpackage.bb3
    public void post(Runnable runnable) {
        this.e.post(runnable);
    }

    @Override // defpackage.bb3
    public void postDelayed(Runnable runnable, long j) {
        this.e.postDelayed(runnable, j);
    }

    public final boolean v0() {
        no.nordicsemi.android.ble.a<?> aVar = this.D;
        if (!(aVar instanceof p)) {
            return false;
        }
        p pVar = (p) aVar;
        if (!pVar.M()) {
            return false;
        }
        pVar.B(this.f28105b);
        this.D = null;
        return true;
    }

    public final /* synthetic */ void v1(r rVar, BluetoothDevice bluetoothDevice) {
        if (rVar.B(bluetoothDevice)) {
            this.s = false;
            I1(true);
        }
    }

    public void w0() {
        try {
            Context contextW = this.d.w();
            contextW.unregisterReceiver(this.E);
            contextW.unregisterReceiver(this.F);
        } catch (Exception unused) {
        }
        synchronized (this.f28104a) {
            try {
                if (this.c != null) {
                    if (this.d.N()) {
                        if (X0()) {
                            G1(4, "Cache refreshed");
                        } else {
                            G1(5, "Refreshing failed");
                        }
                    }
                    G1(3, "gatt.close()");
                    try {
                        this.c.close();
                    } catch (Throwable unused2) {
                    }
                    this.c = null;
                }
                this.t = false;
                this.q = false;
                this.B.clear();
                this.f.clear();
                this.g = null;
                this.f28105b = null;
                this.m = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void w1(x xVar, BluetoothDevice bluetoothDevice) {
        if (this.z == xVar) {
            xVar.y(bluetoothDevice, -5);
            I1(true);
        }
    }

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    public final boolean x0(BluetoothDevice bluetoothDevice) {
        G1(3, "device.createBond()");
        return bluetoothDevice.createBond();
    }

    public final /* synthetic */ void x1(x xVar, BluetoothDevice bluetoothDevice) {
        G1(4, "Cache refreshed");
        xVar.B(bluetoothDevice);
        this.z = null;
        no.nordicsemi.android.ble.a<?> aVar = this.D;
        if (aVar != null) {
            aVar.y(bluetoothDevice, -3);
            this.D = null;
        }
        this.f.clear();
        this.g = null;
        if (this.m) {
            W1();
            R1();
            this.j = true;
            this.h = false;
            G1(2, "Discovering Services...");
            G1(3, "gatt.discoverServices()");
            this.c.discoverServices();
        }
    }

    public final void y0(x xVar) {
        y yVar = this.A;
        if (yVar == null) {
            Deque<x> deque = this.g;
            if (deque == null) {
                deque = this.f;
            }
            deque.addFirst(xVar);
        } else {
            yVar.E(xVar);
        }
        xVar.n = true;
        this.o = false;
    }

    public final /* synthetic */ void y1(c0 c0Var, BluetoothDevice bluetoothDevice) {
        c0Var.B(bluetoothDevice);
        I1(true);
    }

    public final boolean z0() {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        BluetoothGatt bluetoothGatt = this.c;
        if (bluetoothGatt == null || !this.m || bluetoothGatt.getDevice().getBondState() != 12 || (service = bluetoothGatt.getService(pr2.h)) == null || (characteristic = service.getCharacteristic(pr2.i)) == null) {
            return false;
        }
        G1(4, "Service Changed characteristic found on a bonded device");
        return P0(characteristic);
    }
}
