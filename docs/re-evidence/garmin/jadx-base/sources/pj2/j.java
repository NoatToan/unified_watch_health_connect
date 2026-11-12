package pj2;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements n, p {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Boolean> f138066t = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f138067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f138068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f138069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f138070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f138071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f138072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f138073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f138074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet<c> f138075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f138076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v f138077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f138078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f138079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f138080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f138081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f138082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SecureRandom f138083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f138084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f138085s;

    public class a extends BroadcastReceiver {
        public a() {
        }

        public final void a() {
            j jVar;
            v vVar;
            j.this.f138068b.trace("notifySystemBondingLost: auto reconnect disabled");
            j jVar2 = j.this;
            jVar2.f138068b.trace("setAutoReconnect: {}", Boolean.FALSE);
            jVar2.f138081o.set(false);
            synchronized (j.this.f138076j) {
                jVar = j.this;
                vVar = jVar.f138077k;
            }
            if (vVar != null) {
                jVar.f138068b.trace("notifySystemBondingLost: terminating connection");
                vVar.e();
                j.this.f(m.SYSTEM_BONDING_LOST);
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Bundle extras;
            String strF;
            String strF2;
            v vVar;
            String action = intent.getAction();
            j.this.f138068b.trace("mDeviceConnectionBroadcastReceiver: {}", action);
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null || !j.this.f138072f.equals(bluetoothDevice.getAddress())) {
                return;
            }
            if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
                j.this.f138068b.trace("handleConnectionStateChanged");
                synchronized (j.this.f138076j) {
                    vVar = j.this.f138077k;
                }
                if (vVar != null) {
                    v.e eVar = v.e.f138159c;
                    v.b bVar = v.b.MANUAL_SCAN_TERMINATION;
                    Handler handler = vVar.f138122f;
                    handler.sendMessage(handler.obtainMessage(1002, eVar.ordinal(), 0, bVar));
                    return;
                }
                return;
            }
            if (!"android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
                if ("android.bluetooth.device.action.KEY_MISSING".equals(action)) {
                    j.this.f138068b.trace("handleKeyMissing");
                    a();
                    return;
                } else {
                    if (!"android.bluetooth.device.action.ENCRYPTION_CHANGE".equals(action) || (extras = intent.getExtras()) == null) {
                        return;
                    }
                    boolean z14 = extras.getBoolean("android.bluetooth.device.extra.ENCRYPTION_ENABLED", false);
                    int i14 = extras.getInt("android.bluetooth.device.extra.ENCRYPTION_STATUS", -1);
                    j.this.f138068b.trace("handleEncryptionChange\n{}", extras);
                    if (z14 || i14 == 19) {
                        return;
                    }
                    a();
                    return;
                }
            }
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                int i15 = extras2.getInt("android.bluetooth.device.extra.BOND_STATE", -1);
                int i16 = extras2.getInt("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
                Logger logger = j.this.f138068b;
                switch (i16) {
                    case 10:
                        strF = "BOND_NONE";
                        break;
                    case 11:
                        strF = "BOND_BONDING";
                        break;
                    case 12:
                        strF = "BOND_BONDED";
                        break;
                    default:
                        strF = e0.f(i16, "unknown bond state [", "]");
                        break;
                }
                switch (i15) {
                    case 10:
                        strF2 = "BOND_NONE";
                        break;
                    case 11:
                        strF2 = "BOND_BONDING";
                        break;
                    case 12:
                        strF2 = "BOND_BONDED";
                        break;
                    default:
                        strF2 = e0.f(i15, "unknown bond state [", "]");
                        break;
                }
                logger.trace("handleBondStateChanged: {} -> {}", strF, strF2);
                if (i16 == 12 && i15 == 10) {
                    a();
                }
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138087a;

        static {
            int[] iArr = new int[v.b.values().length];
            f138087a = iArr;
            try {
                iArr[v.b.BLUETOOTH_UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f138087a[v.b.SCAN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f138087a[v.b.SCAN_TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f138087a[v.b.NULL_GATT_HANDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f138087a[v.b.CONNECT_GATT_NPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f138087a[v.b.CONNECT_GATT_TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f138087a[v.b.BAD_CONNECT_STATUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f138087a[v.b.CREATE_BOND_FAILURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f138087a[v.b.CREATE_BOND_NOT_FINISHED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f138087a[v.b.CREATE_BOND_TIMEOUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f138087a[v.b.BAD_DISCOVER_SERVICES_STATUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f138087a[v.b.DISCOVER_SERVICES_FAILURE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f138087a[v.b.NO_SERVICES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f138087a[v.b.DISCOVER_SERVICES_TIMEOUT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f138087a[v.b.PREMATURE_DISCONNECT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f138087a[v.b.REQUEST_MTU_FAILURE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f138087a[v.b.MANUAL_TERMINATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f138087a[v.b.MANUAL_SCAN_TERMINATION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f138087a[v.b.DISCONNECTED.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public interface c {
        void a(j jVar, k kVar);

        void b(j jVar, m mVar);

        void c(j jVar, int i14);
    }

    public enum d {
        NOT_STARTED,
        CONNECTING,
        CONNECTED,
        TERMINATED
    }

    public j(Context context, String str, boolean z14, boolean z15) {
        this.f138067a = new a();
        HandlerThread handlerThread = new HandlerThread("BleConnection_HandlerThread");
        this.f138069c = handlerThread;
        this.f138076j = new byte[0];
        this.f138078l = d.NOT_STARTED;
        this.f138079m = true;
        this.f138081o = new AtomicBoolean();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.f138082p = atomicBoolean;
        this.f138083q = new SecureRandom();
        if (context == null) {
            vb.h.s("context is null");
            throw null;
        }
        if (TextUtils.isEmpty(str) || !BluetoothAdapter.checkBluetoothAddress(str)) {
            vb.h.s("macAddress is invalid");
            throw null;
        }
        this.f138068b = LoggerFactory.getLogger(pj2.a.a("BleConnection", str, this));
        this.f138071e = context.getApplicationContext();
        this.f138072f = str;
        Boolean bool = f138066t.get(str);
        if (bool != null && bool.booleanValue()) {
            atomicBoolean.set(bool.booleanValue());
        }
        this.f138073g = z14;
        this.f138074h = z15;
        this.f138075i = new CopyOnWriteArraySet<>();
        handlerThread.start();
        this.f138070d = new Handler(handlerThread.getLooper());
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @Override // pj2.p
    public final void a() {
        h(true);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    public final void b() {
        BluetoothAdapter adapter;
        synchronized (this.f138076j) {
            if (this.f138078l != d.NOT_STARTED) {
                throw new IllegalStateException("connect can only be called once");
            }
            this.f138078l = d.CONNECTING;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        if (this.f138073g) {
            intentFilter.addAction("android.bluetooth.device.action.KEY_MISSING");
            intentFilter.addAction("android.bluetooth.device.action.ENCRYPTION_CHANGE");
        } else {
            String str = this.f138072f;
            try {
                BluetoothManager bluetoothManager = (BluetoothManager) this.f138071e.getSystemService("bluetooth");
                if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null && adapter.isEnabled() && adapter.getRemoteDevice(str).getBondState() == 12) {
                    intentFilter.addAction("android.bluetooth.device.action.KEY_MISSING");
                    intentFilter.addAction("android.bluetooth.device.action.ENCRYPTION_CHANGE");
                }
            } catch (Throwable th3) {
                this.f138068b.warn("isBonded: failed to check bond state for device {}: {}", str, th3.getMessage());
            }
        }
        this.f138071e.registerReceiver(this.f138067a, intentFilter, 2);
        this.f138080n = true;
        c(0L, true, this.f138074h);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void c(long j8, boolean z14, boolean z15) {
        BluetoothAdapter adapter;
        BluetoothDevice remoteDevice;
        boolean z16;
        v vVar;
        BluetoothDevice bluetoothDevice;
        try {
            BluetoothManager bluetoothManager = (BluetoothManager) this.f138071e.getSystemService("bluetooth");
            BluetoothLeScanner bluetoothLeScanner = null;
            if (bluetoothManager != null) {
                adapter = bluetoothManager.getAdapter();
                if (adapter != null && adapter.isEnabled()) {
                    remoteDevice = adapter.getRemoteDevice(this.f138072f);
                    if (bluetoothManager.getConnectionState(remoteDevice, 7) != 0) {
                        this.f138068b.trace("doConnect: device already connected to phone, skip scanning");
                        z14 = z14;
                        z16 = true;
                    } else if (remoteDevice.getBondState() == 12) {
                        this.f138068b.trace("doConnect: device already bonded but not connected, skip direct connection");
                        z14 = false;
                        z16 = false;
                    }
                    if (z15 && !z16 && adapter != null && adapter.isEnabled()) {
                        rj2.b bVar = new rj2.b(this.f138071e, remoteDevice, this.f138068b, true);
                        bVar.f153016e = "shouldScan";
                        bluetoothDevice = bVar.f153013b;
                        if ((bluetoothDevice != null || !bVar.d(rj2.b.a.EnumC2894a.GET_BOND_STATE) || 12 != bluetoothDevice.getBondState()) && bVar.d(rj2.b.a.EnumC2894a.SCAN) && (bluetoothDevice == null || bluetoothDevice.getType() == 0)) {
                            bluetoothLeScanner = adapter.getBluetoothLeScanner();
                            this.f138068b.trace("doConnect: scanner created");
                        }
                    }
                    vVar = new v(this.f138071e, this.f138072f, bluetoothLeScanner, this.f138073g, this, this.f138082p.get());
                    synchronized (this.f138076j) {
                        this.f138077k = vVar;
                    }
                    if (z14 && (this.f138079m || z16)) {
                        vVar.f138134r = true;
                    }
                    vVar.a(j8);
                }
                remoteDevice = null;
            } else {
                adapter = null;
                remoteDevice = null;
            }
            z16 = false;
            if (z15) {
                rj2.b bVar2 = new rj2.b(this.f138071e, remoteDevice, this.f138068b, true);
                bVar2.f153016e = "shouldScan";
                bluetoothDevice = bVar2.f153013b;
                if (bluetoothDevice != null) {
                    bluetoothLeScanner = adapter.getBluetoothLeScanner();
                    this.f138068b.trace("doConnect: scanner created");
                } else {
                    bluetoothLeScanner = adapter.getBluetoothLeScanner();
                    this.f138068b.trace("doConnect: scanner created");
                }
            }
            vVar = new v(this.f138071e, this.f138072f, bluetoothLeScanner, this.f138073g, this, this.f138082p.get());
            synchronized (this.f138076j) {
                this.f138077k = vVar;
                if (z14) {
                    vVar.f138134r = true;
                }
                vVar.a(j8);
            }
        } catch (SecurityException e4) {
            this.f138068b.warn("doConnect: terminate connection, unable to access bluetooth due to security exception: {}", e4.getMessage() != null ? e4.getMessage() : "unknown error");
            i();
        }
    }

    public final d d() {
        d dVar;
        synchronized (this.f138076j) {
            dVar = this.f138078l;
        }
        return dVar;
    }

    public final void f(m mVar) {
        String strName = mVar.name();
        Logger logger = this.f138068b;
        logger.error("notifyDeviceConnectFailed: {}", strName);
        Iterator<c> it = this.f138075i.iterator();
        while (it.hasNext()) {
            try {
                it.next().b(this, mVar);
            } catch (Exception e4) {
                logger.warn("notifying callback of 'notifyDeviceConnectFailed'", (Throwable) e4);
            }
        }
    }

    public final void g() {
        v vVar;
        this.f138068b.trace("reset");
        synchronized (this.f138076j) {
            vVar = this.f138077k;
        }
        if (vVar != null) {
            vVar.e();
        }
    }

    public final boolean h(boolean z14) {
        this.f138068b.trace("setAppMtuRequest: {}", Boolean.valueOf(z14));
        f138066t.put(this.f138072f, Boolean.valueOf(z14));
        return this.f138082p.compareAndSet(!z14, z14);
    }

    public final void i() {
        synchronized (this.f138076j) {
            try {
                d dVar = this.f138078l;
                d dVar2 = d.TERMINATED;
                if (dVar == dVar2) {
                    return;
                }
                this.f138068b.trace("terminate");
                this.f138078l = dVar2;
                v vVar = this.f138077k;
                this.f138077k = null;
                if (this.f138080n) {
                    this.f138071e.unregisterReceiver(this.f138067a);
                    this.f138080n = false;
                }
                if (vVar != null) {
                    vVar.e();
                }
                this.f138069c.quit();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public j(Context context, String str, boolean z14) {
        this(context, str, z14, true);
    }
}
