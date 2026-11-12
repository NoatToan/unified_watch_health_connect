package pj2;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"MissingPermission"})
public final class v implements Handler.Callback {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final UUID f138114t = UUID.fromString("00001801-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final UUID f138115v = UUID.fromString("00002A05-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f138116w = 300000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f138117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BluetoothLeScanner f138119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f138120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f138121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f138122f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f138123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pj2.b f138124h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q f138128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f138129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PendingIntent f138130n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f138133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f138134r;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference<Message> f138125i = new AtomicReference<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f138126j = new byte[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f138127k = e.f138158b;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Timer f138131o = new Timer();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicReference<TimerTask> f138132p = new AtomicReference<>(null);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138135a;

        static {
            int[] iArr = new int[e.values().length];
            f138135a = iArr;
            try {
                iArr[e.f138163g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f138135a[e.f138161e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f138135a[e.f138159c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f138135a[e.f138160d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f138135a[e.f138162f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f138135a[e.f138164h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f138135a[e.f138165i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f138135a[e.f138158b.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum b {
        BLUETOOTH_UNAVAILABLE,
        SCAN_FAILED,
        SCAN_TIMEOUT,
        NULL_GATT_HANDLE,
        CONNECT_GATT_TIMEOUT,
        CONNECT_GATT_NPE,
        BAD_CONNECT_STATUS,
        CREATE_BOND_FAILURE,
        CREATE_BOND_TIMEOUT,
        CREATE_BOND_NOT_FINISHED,
        DISCOVER_SERVICES_FAILURE,
        DISCOVER_SERVICES_TIMEOUT,
        BAD_DISCOVER_SERVICES_STATUS,
        NO_SERVICES,
        REQUEST_MTU_FAILURE,
        PREMATURE_DISCONNECT,
        DISCONNECTED,
        MANUAL_SCAN_TERMINATION,
        MANUAL_TERMINATION
    }

    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            v vVar = v.this;
            q qVar = vVar.f138128l;
            if (qVar == null) {
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", -1);
            if (intExtra != -1) {
                qVar.onScanFailed(intExtra);
                return;
            }
            int intExtra2 = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 2);
            ArrayList<ScanResult> parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                return;
            }
            for (ScanResult scanResult : parcelableArrayListExtra) {
                if (scanResult.getDevice().getAddress().equals(vVar.f138118b)) {
                    qVar.onScanResult(intExtra2, scanResult);
                    return;
                }
            }
        }
    }

    public v(Context context, String str, BluetoothLeScanner bluetoothLeScanner, boolean z14, n nVar, boolean z15) {
        int i14 = 0;
        if (context == null) {
            vb.h.s("context is null");
            throw null;
        }
        if (TextUtils.isEmpty(str) || !BluetoothAdapter.checkBluetoothAddress(str)) {
            vb.h.s("macAddress is invalid");
            throw null;
        }
        if (nVar == null) {
            vb.h.s("connectionStatusListener is null");
            throw null;
        }
        this.f138117a = context.getApplicationContext();
        this.f138118b = str;
        this.f138119c = bluetoothLeScanner;
        this.f138120d = nVar;
        this.f138133q = z15;
        this.f138124h = new pj2.b(str, new c(this, i14));
        this.f138121e = LoggerFactory.getLogger(pj2.a.a("SingleShotConnection", str, this));
        this.f138122f = new Handler(Looper.getMainLooper(), this);
        this.f138123g = z14 ? new f(this, i14) : null;
    }

    public static String b(int i14) {
        String str;
        if (i14 < 0 || i14 >= 65) {
            switch (i14) {
                case 128:
                    str = "No Resources";
                    break;
                case 129:
                    str = "Internal Error";
                    break;
                case 130:
                    str = "Wrong State";
                    break;
                case 131:
                    str = "DB Full";
                    break;
                case 132:
                    str = "Busy";
                    break;
                case 133:
                    str = "Error";
                    break;
                case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                default:
                    str = "Unknown";
                    break;
                case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                    str = "Illegal Parameter";
                    break;
                case 137:
                    str = "Auth Fail";
                    break;
            }
        } else {
            str = o.f138107a[i14];
        }
        return str + " (" + i14 + ")";
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(long j8) {
        e eVar;
        Message messageB;
        if (j8 < 0) {
            vb.h.s("delay is negative");
            return;
        }
        synchronized (this.f138126j) {
            eVar = this.f138127k;
        }
        if (eVar == e.f138158b) {
            Handler handler = this.f138122f;
            e eVar2 = e.f138159c;
            if (!handler.hasMessages(eVar2.ordinal())) {
                Handler handler2 = this.f138122f;
                e eVar3 = e.f138160d;
                if (!handler2.hasMessages(eVar3.ordinal())) {
                    this.f138121e.info("connection requested");
                    if (this.f138123g != null) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
                        intentFilter.addAction("android.bluetooth.device.action.ENCRYPTION_CHANGE");
                        this.f138117a.registerReceiver(this.f138123g, intentFilter, 2);
                    }
                    BluetoothManager bluetoothManager = (BluetoothManager) this.f138117a.getSystemService("bluetooth");
                    BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : BluetoothAdapter.getDefaultAdapter();
                    if (adapter == null || !adapter.isEnabled()) {
                        this.f138121e.error("connection failed, no BluetoothAdapter available");
                        this.f138122f.sendMessage(e.f138165i.b(0, b.BLUETOOTH_UNAVAILABLE));
                        return;
                    } else {
                        if (this.f138119c != null) {
                            messageB = eVar2.b(0, null);
                        } else {
                            messageB = eVar3.b(this.f138134r ? 1 : 0, adapter.getRemoteDevice(this.f138118b));
                        }
                        this.f138122f.sendMessageDelayed(messageB, j8);
                        return;
                    }
                }
            }
        }
        vb.h.z("connection is already started");
    }

    public final boolean c() {
        pj2.b bVar = this.f138124h;
        BluetoothGatt bluetoothGatt = bVar.f138029o.get();
        if (bluetoothGatt == null) {
            return false;
        }
        try {
            Method method = bluetoothGatt.getClass().getMethod("refresh", null);
            if (method != null) {
                return ((Boolean) method.invoke(bluetoothGatt, null)).booleanValue();
            }
            return false;
        } catch (Exception e4) {
            bVar.f138015a.warn("Failed to refresh device cache: {}", e4.getMessage());
            return false;
        }
    }

    public final void d() {
        Logger logger = this.f138121e;
        BluetoothLeScanner bluetoothLeScanner = this.f138119c;
        if (bluetoothLeScanner != null && BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            try {
                PendingIntent pendingIntent = this.f138130n;
                if (pendingIntent != null) {
                    bluetoothLeScanner.stopScan(pendingIntent);
                }
            } catch (NullPointerException e4) {
                logger.warn("suppressing NPE from Android stack", (Throwable) e4);
            } catch (Exception e14) {
                logger.warn("suppressing exception from Android stack", (Throwable) e14);
            }
        }
        this.f138130n = null;
        this.f138128l = null;
    }

    public final void e() {
        this.f138121e.info("connection terminated");
        Handler handler = this.f138122f;
        handler.sendMessageAtFrontOfQueue(handler.obtainMessage(1001));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:127:0x0202  */
    /* JADX WARN: Code duplicated, block: B:128:0x020e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0212  */
    /* JADX WARN: Code duplicated, block: B:135:0x0226  */
    /* JADX WARN: Code duplicated, block: B:139:0x022d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:252:? A[SYNTHETIC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        e eVar;
        ListenableFuture<Void> listenableFutureImmediateFuture;
        v vVar;
        boolean z14;
        final boolean z15;
        e eVar2;
        b bVar;
        e eVar3;
        Message messageB = message;
        synchronized (this.f138126j) {
            eVar = this.f138127k;
        }
        int i14 = messageB.what;
        m mVar = null;
        final boolean z16 = false;
        switch (i14) {
            case 1000:
                Message message2 = this.f138125i.get();
                if (message2 != null) {
                    messageB = message2;
                } else {
                    int i15 = a.f138135a[eVar.ordinal()];
                    messageB = e.f138165i.b(messageB.arg1, i15 != 1 ? i15 != 2 ? b.PREMATURE_DISCONNECT : b.CREATE_BOND_NOT_FINISHED : b.DISCONNECTED);
                }
                break;
            case 1001:
                e eVar4 = e.f138164h;
                if (eVar != eVar4) {
                    b bVar2 = b.MANUAL_TERMINATION;
                    if (!eVar4.f138167a.contains(eVar)) {
                        eVar4 = e.f138165i;
                    } else if (eVar == e.f138163g) {
                        bVar2 = b.DISCONNECTED;
                    }
                    messageB = eVar4.b(0, bVar2);
                } else {
                    messageB = null;
                }
                break;
            case 1002:
                int i16 = messageB.arg1;
                e[] eVarArrValues = e.values();
                messageB = eVar != ((i16 < 0 || i16 >= eVarArrValues.length) ? null : eVarArrValues[i16]) ? null : e.f138165i.b(0, messageB.obj);
                break;
            case 1003:
            case 1004:
            case 1005:
            case 1006:
                TimerTask timerTask = this.f138132p.get();
                if (timerTask != null) {
                    timerTask.cancel();
                }
                switch (i14) {
                    case 1003:
                        eVar2 = e.f138159c;
                        bVar = b.SCAN_TIMEOUT;
                        eVar3 = e.f138165i;
                        if (eVar == eVar2) {
                            messageB = null;
                        } else {
                            messageB = eVar3.b(0, bVar);
                        }
                        break;
                    case 1004:
                        eVar2 = e.f138160d;
                        bVar = b.CONNECT_GATT_TIMEOUT;
                        eVar3 = e.f138165i;
                        if (eVar == eVar2) {
                            messageB = null;
                        } else {
                            messageB = eVar3.b(0, bVar);
                        }
                        break;
                    case 1005:
                        eVar2 = e.f138162f;
                        bVar = b.DISCOVER_SERVICES_TIMEOUT;
                        eVar3 = e.f138164h;
                        if (eVar == eVar2) {
                            messageB = null;
                        } else {
                            messageB = eVar3.b(0, bVar);
                        }
                        break;
                    case 1006:
                        eVar2 = e.f138161e;
                        bVar = b.CREATE_BOND_TIMEOUT;
                        eVar3 = e.f138164h;
                        if (eVar == eVar2) {
                            messageB = null;
                        } else {
                            messageB = eVar3.b(0, bVar);
                        }
                        break;
                    default:
                        messageB = null;
                        break;
                }
                break;
        }
        if (messageB != null) {
            int i17 = messageB.what;
            e[] eVarArrValues2 = e.values();
            e eVar5 = (i17 < 0 || i17 >= eVarArrValues2.length) ? null : eVarArrValues2[i17];
            if (eVar5 == null) {
                return false;
            }
            synchronized (this.f138126j) {
                try {
                    boolean zA = eVar5.a(this.f138127k);
                    Logger logger = this.f138121e;
                    if (zA) {
                        logger.trace("transition {} to {}", this.f138127k, eVar5);
                        this.f138127k = eVar5;
                        long j8 = 90000;
                        switch (a.f138135a[eVar5.ordinal()]) {
                            case 1:
                                s sVar = new s(this);
                                pj2.b bVar3 = this.f138124h;
                                UUID uuid = f138114t;
                                List<UUID> listN = bVar3.n(uuid);
                                UUID uuid2 = f138115v;
                                if (listN.contains(uuid2)) {
                                    this.f138121e.info("subscribing to service changed characteristic");
                                    listenableFutureImmediateFuture = bVar3.s(uuid, uuid2, true);
                                } else {
                                    listenableFutureImmediateFuture = Futures.immediateFuture(null);
                                }
                                Futures.addCallback(Futures.transformAsync(listenableFutureImmediateFuture, new t(this), MoreExecutors.directExecutor()), new u(this, sVar), MoreExecutors.directExecutor());
                                break;
                            case 2:
                                BluetoothDevice bluetoothDevice = (BluetoothDevice) messageB.obj;
                                Handler handler = this.f138122f;
                                if (bluetoothDevice.getBondState() == 10) {
                                    if (!bluetoothDevice.createBond()) {
                                        handler.sendMessage(e.f138164h.b(0, b.CREATE_BOND_FAILURE));
                                    } else {
                                        handler.sendEmptyMessageDelayed(1006, 45000L);
                                    }
                                }
                                break;
                            case 3:
                                String str = this.f138118b;
                                Context context = this.f138117a;
                                Logger logger2 = this.f138121e;
                                ScanSettings.Builder builder = new ScanSettings.Builder();
                                long j14 = f138116w;
                                if (SystemClock.elapsedRealtime() < 120000) {
                                    builder.setScanMode(1);
                                    logger2.info("startScan after phone restart on Android 8+");
                                } else {
                                    builder.setScanMode(0);
                                    j8 = j14;
                                }
                                this.f138128l = new q(this);
                                try {
                                    this.f138129m = new d();
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.garmin.device.ble.SingleShotConnection.SCAN_RESULT");
                                    a7.b.registerReceiver(context, this.f138129m, intentFilter, 4);
                                    Intent intent = new Intent();
                                    intent.setAction("com.garmin.device.ble.SingleShotConnection.SCAN_RESULT");
                                    intent.putExtra("com.garmin.device.ble.SingleShotConnection.MAC_ADDRESS", str);
                                    if (j.e()) {
                                        intent.setPackage(context.getPackageName());
                                    }
                                    int i18 = Build.VERSION.SDK_INT;
                                    this.f138130n = PendingIntent.getBroadcast(context, str.hashCode(), intent, i18 >= 31 ? 167772160 : 134217728);
                                    logger2.debug("starting scan with BroadcastReceiver for Android {}", Integer.valueOf(i18));
                                    int iStartScan = this.f138119c.startScan(i18 >= 37 ? Collections.singletonList(new ScanFilter.Builder().setDeviceAddress(str).build()) : Collections.EMPTY_LIST, builder.build(), this.f138130n);
                                    if (iStartScan != 0) {
                                        logger2.warn("startScan() returned error: {}", Integer.valueOf(iStartScan));
                                        this.f138128l.onScanFailed(iStartScan);
                                    }
                                    this.f138122f.sendEmptyMessageDelayed(1003, j8);
                                } catch (NullPointerException e4) {
                                    logger2.warn("suppressing NPE from Android stack", (Throwable) e4);
                                    this.f138128l.onScanFailed(3);
                                } catch (Exception e14) {
                                    logger2.warn("suppressing exception from Android stack", (Throwable) e14);
                                    this.f138128l.onScanFailed(3);
                                }
                                break;
                            case 4:
                                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) messageB.obj;
                                boolean z17 = messageB.arg1 != 0;
                                Logger logger3 = this.f138121e;
                                pj2.b bVar4 = this.f138124h;
                                Handler handler2 = this.f138122f;
                                try {
                                    BluetoothGatt bluetoothGattConnectGatt = bluetoothDevice2.connectGatt(this.f138117a, !z17, bVar4, 2);
                                    if (bluetoothGattConnectGatt != null) {
                                        AtomicReference<BluetoothGatt> atomicReference = bVar4.f138029o;
                                        while (!atomicReference.compareAndSet(null, bluetoothGattConnectGatt)) {
                                            if (atomicReference.get() != null) {
                                                vb.h.z("gatt is already set.");
                                                return false;
                                            }
                                        }
                                        bVar4.f138027m.set(true);
                                        handler2.sendEmptyMessageDelayed(1004, z17 ? 30000L : 90000L);
                                        r rVar = new r(this);
                                        this.f138131o.schedule(rVar, 120000L);
                                        TimerTask andSet = this.f138132p.getAndSet(rVar);
                                        if (andSet != null) {
                                            andSet.cancel();
                                        }
                                    } else {
                                        logger3.error("connectGatt() received null GATT handle");
                                        handler2.sendMessage(e.f138165i.b(0, b.NULL_GATT_HANDLE));
                                    }
                                } catch (NullPointerException e15) {
                                    logger3.error("connectGatt() threw NullPointerException", (Throwable) e15);
                                    handler2.sendMessage(e.f138165i.b(0, b.CONNECT_GATT_NPE));
                                }
                                break;
                            case 5:
                                Handler handler3 = this.f138122f;
                                BluetoothGatt bluetoothGatt = this.f138124h.f138029o.get();
                                if (bluetoothGatt != null && bluetoothGatt.discoverServices()) {
                                    handler3.sendEmptyMessageDelayed(1005, 15000L);
                                } else {
                                    handler3.sendMessage(e.f138164h.b(0, b.DISCOVER_SERVICES_FAILURE));
                                }
                                break;
                            case 6:
                                b bVar5 = (b) messageB.obj;
                                int i19 = messageB.arg1;
                                Handler handler4 = this.f138122f;
                                Message messageB2 = e.f138165i.b(i19, bVar5);
                                this.f138125i.set(messageB2);
                                pj2.b bVar6 = this.f138124h;
                                bVar6.z();
                                BluetoothGatt bluetoothGatt2 = bVar6.f138029o.get();
                                if (bluetoothGatt2 != null) {
                                    try {
                                        bluetoothGatt2.disconnect();
                                    } catch (Exception e16) {
                                        bVar6.f138015a.warn("Suppressing NPE in BT stack.", (Throwable) e16);
                                    }
                                }
                                Message message3 = new Message();
                                message3.copyFrom(messageB2);
                                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                                if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                                    handler4.sendMessageDelayed(message3, 1500L);
                                } else {
                                    handler4.sendMessage(message3);
                                }
                                break;
                            case 7:
                                b bVar7 = (b) messageB.obj;
                                int i24 = messageB.arg1;
                                d();
                                f fVar = this.f138123g;
                                if (fVar != null) {
                                    this.f138117a.unregisterReceiver(fVar);
                                }
                                d dVar = this.f138129m;
                                if (dVar != null) {
                                    this.f138117a.unregisterReceiver(dVar);
                                }
                                this.f138121e.trace("connection finished: {}; status = {}", bVar7, b(i24));
                                this.f138124h.close();
                                this.f138122f.removeCallbacksAndMessages(null);
                                this.f138131o.cancel();
                                final j jVar = (j) this.f138120d;
                                synchronized (jVar.f138076j) {
                                    jVar.f138068b.trace("onConnectionFinished");
                                    vVar = jVar.f138077k;
                                    if (jVar.f138078l == j.d.TERMINATED) {
                                        z14 = true;
                                    } else {
                                        jVar.f138078l = j.d.CONNECTING;
                                        z14 = false;
                                    }
                                    break;
                                }
                                if (!z14 && bVar7 == b.PREMATURE_DISCONNECT && i24 == 133 && jVar.f138085s == 0) {
                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnect after 133 disconnect status");
                                    jVar.f138085s++;
                                    jVar.f138070d.postDelayed(new k32.n(jVar, 28), jVar.f138083q.nextInt(250) + 450);
                                    break;
                                } else {
                                    jVar.f138085s = 0;
                                    if (bVar7 == b.DISCONNECTED) {
                                        Logger logger4 = jVar.f138068b;
                                        String strB = b(i24);
                                        CopyOnWriteArraySet<j.c> copyOnWriteArraySet = jVar.f138075i;
                                        logger4.trace("notifyDeviceDisconnected: sending status {} to {} callbacks", strB, Integer.valueOf(copyOnWriteArraySet.size()));
                                        Iterator<j.c> it = copyOnWriteArraySet.iterator();
                                        while (it.hasNext()) {
                                            try {
                                                it.next().c(jVar, i24);
                                            } catch (Exception e17) {
                                                logger4.warn("notifying callback of 'notifyDeviceDisconnected'", (Throwable) e17);
                                            }
                                        }
                                    }
                                    if (z14) {
                                        jVar.f138075i.clear();
                                        break;
                                    } else {
                                        switch (j.b.f138087a[bVar7.ordinal()]) {
                                            case 1:
                                                mVar = m.BLUETOOTH_UNAVAILABLE;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                } else {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT && vVar.f138134r) {
                                                        int i25 = jVar.f138084r + 1;
                                                        jVar.f138084r = i25;
                                                        if (i25 >= 3) {
                                                            jVar.f138068b.trace("onConnectionFinished: too many direct connect timeouts, forcing auto connection");
                                                            z15 = false;
                                                        }
                                                        if (jVar.f138074h && bVar7 != b.SCAN_FAILED) {
                                                            z16 = true;
                                                        }
                                                        jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                boolean z18 = z15;
                                                                boolean z19 = z16;
                                                                ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                                j jVar2 = jVar;
                                                                Logger logger5 = jVar2.f138068b;
                                                                logger5.trace("doAutoReconnect");
                                                                try {
                                                                    jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                                } catch (Throwable th3) {
                                                                    logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                                }
                                                            }
                                                        }, jVar.f138083q.nextInt(250) + 450);
                                                    } else {
                                                        jVar.f138084r = 0;
                                                    }
                                                    z15 = true;
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                }
                                                break;
                                            case 2:
                                                mVar = m.SCAN_FAILED;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 3:
                                                mVar = m.SCAN_TIMEOUT;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 4:
                                            case 5:
                                                mVar = m.NULL_GATT_HANDLE;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 6:
                                                mVar = m.CONNECT_GATT_TIMEOUT;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 7:
                                                mVar = m.CONNECT_GATT_FAILURE;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 8:
                                                mVar = m.CREATE_BOND_FAILURE;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 9:
                                            case 10:
                                                mVar = m.AUTHENTICATION;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 11:
                                            case 12:
                                            case 13:
                                                mVar = m.DISCOVER_SERVICE_FAILURE;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 14:
                                                mVar = m.DISCOVER_SERVICE_TIMEOUT;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 15:
                                                mVar = m.PREMATURE_DISCONNECT;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 16:
                                                mVar = m.REQUEST_MTU_FAILURE;
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            case 17:
                                            case 18:
                                            case 19:
                                                if (mVar != null) {
                                                    jVar.f(mVar);
                                                }
                                                if (!jVar.f138081o.get()) {
                                                    if (bVar7 != b.CONNECT_GATT_TIMEOUT) {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    } else {
                                                        jVar.f138084r = 0;
                                                        z15 = true;
                                                    }
                                                    if (jVar.f138074h) {
                                                        z16 = true;
                                                    }
                                                    jVar.f138070d.postDelayed(new Runnable() { // from class: pj2.i
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            boolean z18 = z15;
                                                            boolean z19 = z16;
                                                            ConcurrentHashMap<String, Boolean> concurrentHashMap = j.f138066t;
                                                            j jVar2 = jVar;
                                                            Logger logger5 = jVar2.f138068b;
                                                            logger5.trace("doAutoReconnect");
                                                            try {
                                                                jVar2.c(jVar2.f138083q.nextInt(250) + 450, z18, z19);
                                                            } catch (Throwable th3) {
                                                                logger5.warn("failed automatic reconnect after {}", "terminate", th3);
                                                            }
                                                        }
                                                    }, jVar.f138083q.nextInt(250) + 450);
                                                } else {
                                                    jVar.f138068b.trace("onConnectionFinished: automatic reconnection disabled, aborting reconnect");
                                                    jVar.i();
                                                }
                                                break;
                                            default:
                                                com.google.firebase.messaging.l.n(bVar7, "unhandled exitCondition type: ");
                                                return false;
                                        }
                                    }
                                }
                                break;
                            default:
                                com.google.firebase.messaging.l.n(eVar5, "invalid transition to ");
                                return false;
                        }
                    } else {
                        logger.warn("ignoring transition {} to {}", this.f138127k, eVar5);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return true;
    }

    public class c extends BluetoothGattCallback {
        private c() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i14, int i15) {
            Message messageB;
            v vVar = v.this;
            if (i15 == 0) {
                Logger logger = vVar.f138121e;
                Handler handler = vVar.f138122f;
                logger.info("device disconnected with status [{}]", v.b(i14));
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(1000, i14, 0));
                return;
            }
            vVar.f138122f.removeMessages(1004);
            TimerTask timerTask = vVar.f138132p.get();
            if (timerTask != null) {
                timerTask.cancel();
            }
            if (i14 != 0) {
                messageB = e.f138165i.b(i14, b.BAD_CONNECT_STATUS);
            } else if (vVar.f138123g == null || bluetoothGatt.getDevice().getBondState() == 12) {
                vVar.f138121e.info("device connected, start discover services");
                messageB = e.f138162f.b(0, null);
            } else {
                messageB = e.f138161e.b(0, bluetoothGatt.getDevice());
            }
            vVar.f138122f.sendMessage(messageB);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i14) {
            Message messageB;
            v vVar = v.this;
            vVar.f138122f.removeMessages(1005);
            if (i14 != 0) {
                messageB = e.f138164h.b(i14, b.BAD_DISCOVER_SERVICES_STATUS);
            } else {
                List<BluetoothGattService> services = bluetoothGatt.getServices();
                if (services == null || services.isEmpty()) {
                    vVar.c();
                    messageB = e.f138164h.b(0, b.NO_SERVICES);
                } else {
                    messageB = e.f138163g.b(0, null);
                }
            }
            vVar.f138122f.sendMessage(messageB);
        }

        public /* synthetic */ c(v vVar, int i14) {
            this();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f138158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f138159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f138160d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f138161e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final e f138162f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f138163g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final e f138164h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f138165i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ e[] f138166j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<e> f138167a;

        static {
            e eVar = new e("NOT_STARTED", 0, null);
            f138158b = eVar;
            e eVar2 = new e("SCANNING", 1, eVar);
            f138159c = eVar2;
            e eVar3 = new e("CONNECTING_GATT", 2, eVar, eVar2);
            f138160d = eVar3;
            e eVar4 = new e("WAITING_FOR_BOND", 3, eVar3);
            f138161e = eVar4;
            e eVar5 = new e("DISCOVERING_SERVICES", 4, eVar3, eVar4);
            f138162f = eVar5;
            e eVar6 = new e("AVAILABLE", 5, eVar5);
            f138163g = eVar6;
            e eVar7 = new e("DISCONNECTING", 6, eVar4, eVar5, eVar6);
            f138164h = eVar7;
            a aVar = new a(new e[]{null});
            f138165i = aVar;
            f138166j = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, aVar};
        }

        private e(String str, int i14, e... eVarArr) {
            super(str, i14);
            this.f138167a = Collections.unmodifiableSet(eVarArr == null ? Collections.EMPTY_SET : new HashSet(Arrays.asList(eVarArr)));
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f138166j.clone();
        }

        public boolean a(e eVar) {
            return this.f138167a.contains(eVar);
        }

        public final Message b(int i14, Object obj) {
            Message messageObtain = Message.obtain();
            messageObtain.what = ordinal();
            messageObtain.obj = obj;
            messageObtain.arg1 = i14;
            return messageObtain;
        }

        public final enum a extends e {
            public /* synthetic */ a(e[] eVarArr) {
                this("FINISHED", 7, eVarArr);
            }

            @Override // pj2.v.e
            public final boolean a(e eVar) {
                return eVar != e.f138165i;
            }

            private a(String str, int i14, e... eVarArr) {
                super(str, i14, eVarArr, 0);
            }
        }

        public /* synthetic */ e(String str, int i14, e[] eVarArr, int i15) {
            this(str, i14, eVarArr);
        }
    }

    public class f extends BroadcastReceiver {
        private f() {
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005b  */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            boolean booleanExtra;
            String action = intent.getAction();
            v vVar = v.this;
            if (action == null) {
                vVar.f138121e.warn("received null intent action in WaitingForBondBroadcastReceiver");
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null || !vVar.f138118b.equals(bluetoothDevice.getAddress())) {
                return;
            }
            if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
                if (bluetoothDevice.getBondState() == 12) {
                    vVar.f138121e.info("ACTION_BOND_STATE_CHANGED (bonded");
                    booleanExtra = true;
                } else {
                    booleanExtra = false;
                }
            } else if ("android.bluetooth.device.action.ENCRYPTION_CHANGE".equals(action)) {
                booleanExtra = intent.getBooleanExtra("android.bluetooth.device.extra.ENCRYPTION_ENABLED", false);
                vVar.f138121e.info("ACTION_ENCRYPTION_CHANGE (encryption enabled {})", Boolean.valueOf(booleanExtra));
            } else {
                booleanExtra = false;
            }
            if (booleanExtra) {
                vVar.f138122f.removeMessages(1006);
                vVar.f138122f.sendMessage(e.f138162f.b(0, null));
            }
        }

        public /* synthetic */ f(v vVar, int i14) {
            this();
        }
    }
}
