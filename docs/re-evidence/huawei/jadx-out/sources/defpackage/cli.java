package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.huawei.devicesdk.callback.BtDevicePairCallback;
import com.huawei.devicesdk.connect.physical.ConsumerHandler;
import com.huawei.devicesdk.connect.physical.PhysicalLayerBase;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.network.embedded.y1;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class cli extends PhysicalLayerBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f1711b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1712c = new Object();
    private static final Object e = new Object();
    private int d;
    private e k;
    private a l;
    private d m;
    private a n;
    private boolean q = false;
    private DeviceInfo g = null;
    private BluetoothDevice f = null;
    private volatile int s = 0;
    private volatile int t = 0;
    private volatile boolean o = false;
    private BtDevicePairCallback j = new BtDevicePairCallback() { // from class: cli.1
        @Override // com.huawei.devicesdk.callback.BtDevicePairCallback
        public void onDevicePairing(BluetoothDevice bluetoothDevice) {
        }

        @Override // com.huawei.devicesdk.callback.BtDevicePairCallback
        public void onDevicePaired(BluetoothDevice bluetoothDevice) {
            ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "btDevice paired.");
            try {
                if (cli.this.d(bluetoothDevice)) {
                    cli.this.c();
                    cli.this.q = false;
                    if (!cli.this.f1713a.c(bluetoothDevice)) {
                        ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "Need to connect hfp profile.");
                        cqp.a(100055, cqc.a((Object) bluetoothDevice.getName()), "", "");
                        cli.this.q = true;
                        cli.this.f1713a.a(bluetoothDevice);
                    }
                    LogUtil.b("InoperableBrPhysicalService", "Start to connect btDevice.");
                    cli.this.c(bluetoothDevice);
                    return;
                }
                LogUtil.e("InoperableBrPhysicalService", "not current device.");
            } catch (SecurityException e2) {
                LogUtil.d("InoperableBrPhysicalService", "onDevicePaired SecurityException", ExceptionUtils.c(e2));
            }
        }

        @Override // com.huawei.devicesdk.callback.BtDevicePairCallback
        public void onDevicePairNone(BluetoothDevice bluetoothDevice) {
            try {
                if (!cli.this.d(bluetoothDevice)) {
                    LogUtil.e("InoperableBrPhysicalService", "onDevicePairNone: not current device.");
                } else {
                    ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", " btDevice pair fail, so connect btDevice fail.");
                    cli.this.d(3, 60032);
                }
            } catch (SecurityException e2) {
                LogUtil.d("InoperableBrPhysicalService", "onDevicePairNone SecurityException", ExceptionUtils.c(e2));
            }
        }
    };
    private ConsumerHandler<Message> i = new ConsumerHandler() { // from class: clh
        @Override // com.huawei.devicesdk.connect.physical.ConsumerHandler
        public final void accept(Object obj) {
            this.d.a((Message) obj);
        }
    };
    private clp h = new clp(this.i);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cok f1713a = cok.d();

    static /* synthetic */ int e(cli cliVar) {
        int i = cliVar.t;
        cliVar.t = i + 1;
        return i;
    }

    static /* synthetic */ int i(cli cliVar) {
        int i = cliVar.s;
        cliVar.s = i + 1;
        return i;
    }

    /* synthetic */ void a(Message message) {
        DeviceInfo deviceInfo;
        if (message == null || (deviceInfo = this.g) == null) {
            LogUtil.e("InoperableBrPhysicalService", "message or mBtDeviceInfo is null");
            return;
        }
        reportMonitorResult(message, deviceInfo, 100034);
        if (message.what != 4) {
            LogUtil.e("InoperableBrPhysicalService", "unknown message.");
        } else {
            ReleaseLogUtil.d("DEVMGR_InoperableBrPhysicalService", "timeout fail, errorCode: ", Integer.valueOf(message.arg1));
            d(3, message.arg1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(BluetoothDevice bluetoothDevice) {
        DeviceInfo deviceInfo = this.g;
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("InoperableBrPhysicalService", "isCurrentDevice mBtDeviceInfo is invalid");
            return false;
        }
        if (bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress())) {
            LogUtil.e("InoperableBrPhysicalService", "isCurrentDevice btDevice is invalid");
            return false;
        }
        return this.g.getDeviceMac().equals(bluetoothDevice.getAddress());
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void connectDevice(DeviceInfo deviceInfo) {
        ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "connectDevice.");
        if (deviceInfo == null) {
            LogUtil.e("InoperableBrPhysicalService", "btDevice is null.");
            d(3, cpi.c(7, 303));
            return;
        }
        this.g = deviceInfo;
        LogUtil.b("InoperableBrPhysicalService", "Start to report connecting state.");
        synchronized (e) {
            if (this.d == 2) {
                ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", " This is connected state.");
                d(2, 100000);
                return;
            }
            d(1, 100000);
            this.mBluetoothDevice = this.mCommonAdapterUtil.a(deviceInfo.getDeviceMac());
            if (this.mBluetoothDevice == null) {
                LogUtil.b("InoperableBrPhysicalService", " Get bluetooth device failed.");
                d(3, cpi.c(7, 303));
                return;
            }
            try {
                if (!TextUtils.isEmpty(this.mBluetoothDevice.getName())) {
                    this.g.setDeviceName(this.mBluetoothDevice.getName());
                    ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "refreshDeviceName: ", this.mBluetoothDevice.getName());
                }
                d(deviceInfo);
            } catch (SecurityException unused) {
                ReleaseLogUtil.b("DEVMGR_InoperableBrPhysicalService", "BluetoothDevice getName SecurityException");
                d(3, cpi.c(7, 305));
            }
        }
    }

    private void d(DeviceInfo deviceInfo) {
        try {
            if (this.mBluetoothDevice.getBondState() != 12) {
                ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "Need to pair btDevice.");
                sendTimeoutMessage(this.h, 6, 60000L);
                cqp.a(100085, cqc.a((Object) deviceInfo.getDeviceName()), "", "");
                if (!this.mCommonAdapterUtil.c(this.mBluetoothDevice, this.j)) {
                    ReleaseLogUtil.d("DEVMGR_InoperableBrPhysicalService", "btDevice pair failed.");
                    d(3, 60032);
                }
            } else {
                a(deviceInfo);
                ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "Device has been bonded.");
                c(this.mBluetoothDevice);
            }
            this.mCommonAdapterUtil.a(deviceInfo.getDeviceMac(), false);
        } catch (SecurityException e2) {
            LogUtil.d("InoperableBrPhysicalService", "bondBtDevice SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private void a(DeviceInfo deviceInfo) {
        if (this.mCommonAdapterUtil.d(deviceInfo.getDeviceMac())) {
            return;
        }
        this.q = false;
        if (this.f1713a.c(this.mBluetoothDevice)) {
            return;
        }
        ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "mIsHidAction is false, Need to connect hfp profile.");
        cqp.a(100030, cqc.a((Object) deviceInfo.getDeviceName()), "", "");
        this.q = true;
        this.f1713a.a(this.mBluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        c();
        synchronized (e) {
            if (i == this.d) {
                LogUtil.b("InoperableBrPhysicalService", "connectState no change");
                return;
            }
            this.d = i;
            setTriggerType(i, this.g);
            if (this.mStatusChangeCallback == null || this.g == null) {
                return;
            }
            ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "report connect state: ", Integer.valueOf(i));
            this.mStatusChangeCallback.onConnectStatusChanged(this.g, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        clp clpVar = this.h;
        if (clpVar == null) {
            LogUtil.e("InoperableBrPhysicalService", "mConnectHandler is null, removeTimeoutMessage fail.");
        } else {
            clpVar.a(4);
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void disconnectDevice() {
        ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "Enter disconnectDevice.");
        this.o = true;
        destroy();
        d(0, cpi.d(6));
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public boolean sendData(cmd cmdVar, String str) {
        if (cmdVar == null || cmdVar.a() == null) {
            LogUtil.e("InoperableBrPhysicalService", "date is null when sending frame");
            return false;
        }
        LogUtil.b("InoperableBrPhysicalService", "sendData socketChannel: ", Integer.valueOf(cmdVar.h()));
        List<cmb> listA = cmdVar.a();
        int iH = cmdVar.h() != 0 ? cmdVar.h() : 0;
        for (cmb cmbVar : listA) {
            if (cmbVar == null || !d(cmbVar.a(), iH)) {
                LogUtil.e("InoperableBrPhysicalService", "sendLinkDataCommond has write false");
                return false;
            }
            try {
                if (cmbVar.b() > 0) {
                    Thread.sleep(cmbVar.b());
                }
            } catch (InterruptedException unused) {
                LogUtil.d("InoperableBrPhysicalService", "send command occur InterruptedException.");
            }
        }
        return true;
    }

    private boolean d(byte[] bArr, int i) {
        if (bArr == null) {
            LogUtil.e("InoperableBrPhysicalService", "btDeviceData is null");
            return false;
        }
        synchronized (e) {
            if (this.d != 2) {
                LogUtil.e("InoperableBrPhysicalService", "Connect State is not connect.");
                return false;
            }
            synchronized (f1712c) {
                if (i != 0) {
                    if (this.l != null) {
                        LogUtil.b("InoperableBrPhysicalService", "dataTransferThread2 send data.");
                        this.l.e(bArr);
                        return true;
                    }
                }
                a aVar = this.n;
                if (aVar == null) {
                    return false;
                }
                aVar.e(bArr);
                return true;
            }
        }
    }

    @Override // com.huawei.devicesdk.connect.physical.PhysicalLayerBase
    public void destroy() {
        synchronized (f1711b) {
            e eVar = this.k;
            if (eVar != null) {
                eVar.c();
                this.k = null;
            }
        }
        synchronized (f1712c) {
            a aVar = this.n;
            if (aVar != null) {
                aVar.b();
                this.n = null;
            }
            a aVar2 = this.l;
            if (aVar2 != null) {
                aVar2.b();
                this.l = null;
            }
        }
        this.h.a();
        this.i = null;
        this.mCommonAdapterUtil.b(this.mBluetoothDevice);
    }

    public void c(final int i) {
        synchronized (f1711b) {
            d dVar = this.m;
            if (dVar != null) {
                dVar.a();
                this.m = null;
            }
            ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "Start createDualSocket.channel ", Integer.valueOf(i));
            d dVar2 = new d(this.f, i);
            this.m = dVar2;
            dVar2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: cli.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    LogUtil.e("InoperableBrPhysicalService", "connect2 thread occur uncaughtException.");
                    synchronized (cli.f1711b) {
                        if (cli.this.m != null) {
                            cli.this.m.a();
                            cli.this.m = null;
                        }
                    }
                    if (cli.this.t < 3) {
                        cli.this.c(i);
                    } else {
                        LogUtil.e("InoperableBrPhysicalService", "createDualSocket reconnect fail.");
                    }
                }
            });
            this.m.start();
        }
        synchronized (f1712c) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.b();
                this.l = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final BluetoothSocket bluetoothSocket) {
        synchronized (f1712c) {
            a aVar = this.n;
            if (aVar != null) {
                aVar.b();
                this.n = null;
            }
            this.o = false;
            a aVar2 = new a(bluetoothSocket, 0);
            this.n = aVar2;
            aVar2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: cli.5
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    LogUtil.d("InoperableBrPhysicalService", "data transfer thread occur uncaughtException.");
                    synchronized (cli.f1712c) {
                        if (cli.this.n != null) {
                            cli.this.n.b();
                            cli.this.n = null;
                        }
                        cli.this.n = new a(bluetoothSocket, 0);
                        cli.this.n.start();
                    }
                }
            });
            this.n.start();
        }
        LogUtil.b("InoperableBrPhysicalService", "Connect success, so report state.");
        d(2, 100000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final BluetoothSocket bluetoothSocket, final int i) {
        synchronized (f1712c) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.b();
                this.l = null;
            }
            ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "Start startDataTransferThread2.mChannel ", Integer.valueOf(i));
            a aVar2 = new a(bluetoothSocket, i);
            this.l = aVar2;
            aVar2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: cli.4
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    LogUtil.e("InoperableBrPhysicalService", "data transfer thread occur uncaughtException.");
                    synchronized (cli.f1712c) {
                        if (cli.this.l != null) {
                            cli.this.l.b();
                            cli.this.l = null;
                        }
                        cli.this.l = new a(bluetoothSocket, i);
                        cli.this.l.start();
                    }
                }
            });
            this.l.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.b("InoperableBrPhysicalService", "Connect lost.");
        d(0, 30002);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final BluetoothDevice bluetoothDevice) {
        ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "Enter connectBTDeviceThread().");
        synchronized (f1711b) {
            e eVar = this.k;
            if (eVar != null) {
                eVar.c();
                this.k = null;
            }
            LogUtil.b("InoperableBrPhysicalService", "Start ConnectThread.");
            this.f = bluetoothDevice;
            e eVar2 = new e(bluetoothDevice);
            this.k = eVar2;
            eVar2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: cli.3
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    ReleaseLogUtil.b("DEVMGR_InoperableBrPhysicalService", "connect thread occur uncaughtException.");
                    synchronized (cli.f1711b) {
                        if (cli.this.k != null) {
                            cli.this.k.c();
                            cli.this.k = null;
                        }
                    }
                    if (cli.this.s < 3) {
                        cli.this.c();
                        cli.this.c(bluetoothDevice);
                    } else {
                        ReleaseLogUtil.d("DEVMGR_InoperableBrPhysicalService", "trigger reconnect fail.");
                        cli.this.d(3, cpi.c(7, 304));
                    }
                }
            });
            sendTimeoutMessage(this.h, 7);
            this.k.start();
        }
        synchronized (f1712c) {
            a aVar = this.n;
            if (aVar != null) {
                aVar.b();
                this.n = null;
            }
            a aVar2 = this.l;
            if (aVar2 != null) {
                aVar2.b();
                this.l = null;
            }
        }
    }

    class e extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BluetoothDevice f1725a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1727c;
        private final BluetoothSocket d;
        private boolean e;
        private String g;

        private e(BluetoothDevice bluetoothDevice) {
            UUID uuidFromString;
            this.g = y1.f15624a;
            this.e = false;
            this.f1727c = 0;
            BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord = null;
            this.f1725a = null;
            LogUtil.b("InoperableBrPhysicalService", "Enter ConnectThread.");
            if (bluetoothDevice == null) {
                LogUtil.e("InoperableBrPhysicalService", "ConnectThread: device parameter is null.");
                this.d = null;
                return;
            }
            this.f1725a = bluetoothDevice;
            try {
                if (cop.h()) {
                    uuidFromString = UUID.fromString("82ff3820-8411-400c-b85a-55bdb32cf060");
                } else {
                    boolean zB = SharedPreferenceManager.b(Integer.toString(1000), "wearable_emulator_connection_switch", false);
                    LogUtil.b("InoperableBrPhysicalService", "ConnectThread isEmulator:", Boolean.valueOf(zB));
                    if (zB) {
                        uuidFromString = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
                    } else {
                        uuidFromString = UUID.fromString("82ff3820-8411-400c-b85a-55bdb32cf060");
                    }
                }
                bluetoothSocketCreateRfcommSocketToServiceRecord = bluetoothDevice.createRfcommSocketToServiceRecord(uuidFromString);
            } catch (IOException | SecurityException e) {
                LogUtil.d("InoperableBrPhysicalService", "ConnectThread Exception:", ExceptionUtils.c(e));
            }
            this.d = bluetoothSocketCreateRfcommSocketToServiceRecord;
        }

        public boolean b() {
            return this.e;
        }

        public void d(boolean z) {
            this.e = z;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0105 A[Catch: SecurityException -> 0x0115, TryCatch #2 {SecurityException -> 0x0115, blocks: (B:3:0x0006, B:5:0x0038, B:7:0x0043, B:10:0x0052, B:12:0x0060, B:13:0x0077, B:16:0x007f, B:18:0x009f, B:21:0x00a6, B:22:0x00af, B:24:0x00c1, B:26:0x00dd, B:28:0x00e1, B:30:0x00ee, B:31:0x00f2, B:36:0x0105, B:37:0x010d, B:34:0x00f9, B:9:0x0049), top: B:47:0x0006, inners: #3, #4 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x010d A[Catch: SecurityException -> 0x0115, TRY_LEAVE, TryCatch #2 {SecurityException -> 0x0115, blocks: (B:3:0x0006, B:5:0x0038, B:7:0x0043, B:10:0x0052, B:12:0x0060, B:13:0x0077, B:16:0x007f, B:18:0x009f, B:21:0x00a6, B:22:0x00af, B:24:0x00c1, B:26:0x00dd, B:28:0x00e1, B:30:0x00ee, B:31:0x00f2, B:36:0x0105, B:37:0x010d, B:34:0x00f9, B:9:0x0049), top: B:47:0x0006, inners: #3, #4 }] */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean zE;
            try {
                cli.i(cli.this);
                LogUtil.b("InoperableBrPhysicalService", " start connect thread, time: ", Integer.valueOf(cli.this.s));
                setName("ConnectThread" + this.g);
                try {
                    Thread.sleep(500L);
                    if (cli.this.q) {
                        Thread.sleep(1000L);
                    }
                } catch (InterruptedException unused) {
                    LogUtil.d("InoperableBrPhysicalService", "Occur exception when thread sleeping");
                }
                cli.this.f1713a.c();
                if (this.d == null) {
                    LogUtil.d("InoperableBrPhysicalService", "mBTSocket is null");
                    cli.this.d(3, cpi.c(3, 303));
                    return;
                }
                if (b()) {
                    return;
                }
                cqp.a(100032, cqc.a((Object) cli.this.g.getDeviceName()), "", "");
                ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "mBTSocket start connect.");
                long jCurrentTimeMillis = 0;
                while (!b()) {
                    try {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        this.d.connect();
                        LogUtil.b("InoperableBrPhysicalService", "Start DataTransferThread.");
                        cli.this.c(this.d);
                        return;
                    } catch (IOException e) {
                        ReleaseLogUtil.b("DEVMGR_InoperableBrPhysicalService", "mBTSocket in connect occur exception : ", ExceptionUtils.c(e));
                        if ("Connect refused".equals(e.getMessage()) && this.f1727c < 2) {
                            d();
                            ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "connectRefused mBTSocket connect");
                        } else {
                            try {
                                zE = e(jCurrentTimeMillis);
                                try {
                                    this.d.close();
                                } catch (IOException unused2) {
                                    LogUtil.d("InoperableBrPhysicalService", "mBTSocket close occur exception in catch exception");
                                    if (zE) {
                                        cli.this.d(3, 30002);
                                        return;
                                    } else {
                                        cli.this.d(3, OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                                        return;
                                    }
                                }
                            } catch (IOException unused3) {
                                zE = true;
                            }
                            if (zE) {
                                cli.this.d(3, 30002);
                                return;
                            } else {
                                cli.this.d(3, OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                                return;
                            }
                        }
                    }
                }
            } catch (SecurityException e2) {
                LogUtil.d("InoperableBrPhysicalService", "ConnectThread#run SecurityException:", ExceptionUtils.c(e2));
            }
        }

        private boolean e(long j) {
            BluetoothDevice bluetoothDevice;
            boolean z = System.currentTimeMillis() - j > 100;
            ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "reportSocketException:", Boolean.valueOf(z));
            String string = Boolean.toString(z);
            if (z && (bluetoothDevice = this.f1725a) != null) {
                try {
                    Object objInvoke = bluetoothDevice.getClass().getMethod("isConnected", new Class[0]).invoke(this.f1725a, new Object[0]);
                    if (objInvoke instanceof Boolean) {
                        Boolean bool = (Boolean) objInvoke;
                        ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "isConnected reportSocketException:", bool);
                        if (!bool.booleanValue()) {
                            return false;
                        }
                        cqp.a(100033, cqc.a((Object) cli.this.g.getDeviceName()), "", string);
                        return true;
                    }
                } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                    ReleaseLogUtil.b("InoperableBrPhysicalService", "BluetoothDevice isConnected exception;");
                    cqp.a(100033, cqc.a((Object) cli.this.g.getDeviceName()), "", string);
                }
            } else {
                cqp.a(100033, cqc.a((Object) cli.this.g.getDeviceName()), "", string);
            }
            return true;
        }

        private void d() {
            LogUtil.b("InoperableBrPhysicalService", "connectRefused mConnectNumber:", Integer.valueOf(this.f1727c));
            try {
                Thread.sleep(5000L);
                cqp.a(100074, cqc.a((Object) cli.this.g.getDeviceName()), "", "");
                this.f1727c++;
            } catch (InterruptedException unused) {
                LogUtil.d("InoperableBrPhysicalService", "connectRefused InterruptedException");
            }
        }

        public void c() {
            ReleaseLogUtil.c("DEVMGR_InoperableBrPhysicalService", "connect thread cancel");
            try {
                if (this.d != null) {
                    this.f1727c = 0;
                    cli.this.k.d(true);
                    this.d.close();
                }
                if (cli.this.m != null) {
                    cli.this.m.a();
                    cli.this.m = null;
                }
            } catch (Exception unused) {
                ReleaseLogUtil.b("DEVMGR_InoperableBrPhysicalService", "Close socket occur exception");
            }
        }
    }

    class d extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1724c;
        private final BluetoothSocket d;
        private BluetoothDevice e;
        private String i;

        private d(BluetoothDevice bluetoothDevice, int i) {
            this.i = y1.f15624a;
            this.f1723b = false;
            this.f1724c = 0;
            LogUtil.b("ConnectThread2", "Enter ConnectThread2.channel ", Integer.valueOf(i));
            BluetoothSocket bluetoothSocket = null;
            if (bluetoothDevice == null || i <= 0) {
                ReleaseLogUtil.d("DEVMGR_ConnectThread2", "ConnectThread2 device parameter is null.");
                this.d = null;
                this.f1724c = 0;
                return;
            }
            this.e = bluetoothDevice;
            try {
                Object objInvoke = bluetoothDevice.getClass().getMethod("createRfcommSocket", Integer.TYPE).invoke(bluetoothDevice, Integer.valueOf(i));
                if (objInvoke instanceof BluetoothSocket) {
                    bluetoothSocket = (BluetoothSocket) objInvoke;
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                ReleaseLogUtil.b("DEVMGR_ConnectThread2", "create socket2 exception", ExceptionUtils.c(e));
            }
            this.d = bluetoothSocket;
            this.f1724c = i;
            ReleaseLogUtil.c("DEVMGR_ConnectThread2", "Enter ConnectThread2. mChannel ", Integer.valueOf(i));
        }

        public boolean c() {
            return this.f1723b;
        }

        public void d(boolean z) {
            this.f1723b = z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                cli.e(cli.this);
                ReleaseLogUtil.c("DEVMGR_ConnectThread2", " start connect thread2, time: ", Integer.valueOf(cli.this.s));
                setName("ConnectThread" + this.i);
                cli.this.f1713a.c();
                if (this.d == null) {
                    LogUtil.e("InoperableBrPhysicalService", "mBTSocket2 is null");
                    return;
                }
                try {
                    if (c()) {
                        return;
                    }
                    ReleaseLogUtil.c("DEVMGR_ConnectThread2", "mBTSocket2 start connect.");
                    cqp.a(100086, cqc.a((Object) cli.this.g.getDeviceName()), "", "");
                    this.d.connect();
                    ReleaseLogUtil.c("DEVMGR_ConnectThread2", "Start DataTransferThread2.mChannel ", Integer.valueOf(this.f1724c));
                    cli.this.c(this.d, this.f1724c);
                    return;
                } catch (IOException e) {
                    try {
                        ReleaseLogUtil.b("DEVMGR_ConnectThread2", "mBTSocket2 in connect occur exception : ", ExceptionUtils.c(e));
                        this.d.close();
                    } catch (IOException unused) {
                        LogUtil.d("ConnectThread2", "mBTSocket2 close occur exception in catch exception");
                    }
                    cqp.a(100087, cqc.a((Object) cli.this.g.getDeviceName()), "", "");
                    b();
                    return;
                }
                LogUtil.d("InoperableBrPhysicalService", "ConnectThread2#run SecurityException:", ExceptionUtils.c(e));
            } catch (SecurityException e2) {
                LogUtil.d("InoperableBrPhysicalService", "ConnectThread2#run SecurityException:", ExceptionUtils.c(e2));
            }
        }

        private void b() {
            ExternalDeviceCapability externalDeviceCapabilityB = cnk.c().b(this.e.getAddress());
            if (externalDeviceCapabilityB == null) {
                ReleaseLogUtil.d("DEVMGR_ConnectThread2", "mBTSocket2 close occur exception externalDeviceCapability is null");
                return;
            }
            LogUtil.b("ConnectThread2", "mBTSocket2 close occur exception deviceIdentify: ", cpl.e(this.e.getAddress()));
            UniteDevice uniteDevice = new UniteDevice();
            uniteDevice.setIdentify(this.e.getAddress());
            uniteDevice.setCapability(externalDeviceCapabilityB);
            boolean zB = col.b(uniteDevice, 158);
            ReleaseLogUtil.c("DEVMGR_ConnectThread2", "mBTSocket2 close occur exception isSupportDualDisconnectAp: ", Boolean.valueOf(zB));
            if (zB) {
                cqp.a(100075, cqc.a((Object) cli.this.g.getDeviceName()), "", "");
                synchronized (cli.f1711b) {
                    if (cli.this.k != null) {
                        cli.this.k.c();
                        cli.this.k = null;
                    }
                }
                synchronized (cli.f1712c) {
                    if (cli.this.n != null) {
                        cli.this.n.b();
                        cli.this.n = null;
                    }
                }
            }
        }

        public void a() {
            LogUtil.b("ConnectThread2", "connect thread cancel");
            try {
                if (this.d != null) {
                    cli.this.m.d(true);
                    this.d.close();
                }
            } catch (IOException unused) {
                ReleaseLogUtil.b("DEVMGR_ConnectThread2", "Close socket occur exception");
            }
        }
    }

    class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BluetoothSocket f1719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final OutputStream f1720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InputStream f1721c;
        private boolean e;
        private cny h;
        private int i;
        private String j;

        private a(BluetoothSocket bluetoothSocket, int i) {
            InputStream inputStream;
            this.f1719a = bluetoothSocket;
            this.i = i;
            String str = "InoperableBrPhysicalService" + i;
            this.j = str;
            LogUtil.b("InoperableBrPhysicalService", "Start DataTransferThread2.mSocketChannel ", Integer.valueOf(this.i), "mTag: ", str);
            OutputStream outputStream = null;
            try {
                inputStream = bluetoothSocket.getInputStream();
                try {
                    outputStream = bluetoothSocket.getOutputStream();
                } catch (IOException unused) {
                    LogUtil.d(this.j, "Get Input Stream Handle exception");
                }
            } catch (IOException unused2) {
                inputStream = null;
            }
            this.f1721c = inputStream;
            this.f1720b = outputStream;
            cny cnyVar = new cny(cli.this.mDeviceInfo, cli.this.mMessageReceiveCallback, i);
            this.h = cnyVar;
            cnyVar.start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (this.f1721c == null) {
                LogUtil.b("InoperableBrPhysicalService", "mBTInStream is null");
                this.h.a();
                cli.this.e();
                return;
            }
            byte[] bArr = new byte[AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED];
            this.e = true;
            while (this.e) {
                try {
                    Arrays.fill(bArr, (byte) 0);
                    this.h.e(Arrays.copyOfRange(bArr, 0, this.f1721c.read(bArr)));
                } catch (IOException unused) {
                    ReleaseLogUtil.b("DEVMGR_" + this.j, "SPP Socket read occur Exception", ", mIsDisconnectRead:", Boolean.valueOf(cli.this.o));
                    cqp.a(100035, cqc.a((Object) cli.this.g.getDeviceName()), "", Boolean.toString(cli.this.o));
                    this.h.a();
                    cli.this.e();
                    return;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(byte[] bArr) {
            try {
                if (this.f1720b != null) {
                    cpl.e(this.j, bArr, cpl.a(cli.this.mDeviceInfo), " SDK-->Device: ");
                    this.f1720b.write(bArr);
                    this.f1720b.flush();
                    return;
                }
                LogUtil.b(this.j, "Send BT Data with mBTOutStream is null.");
            } catch (Exception unused) {
                LogUtil.d(this.j, "SPP Socket send occur Exception");
                cli.this.e();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:8:0x0021
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        public void b() {
            /*
                r5 = this;
                java.lang.String r0 = r5.j
                java.lang.String r1 = "data transfer thread cancel"
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                health.compact.a.LogUtil.b(r0, r1)
                r0 = 1
                r1 = 0
                java.io.InputStream r2 = r5.f1721c     // Catch: java.lang.Exception -> L21
                if (r2 == 0) goto L15
                r2.close()     // Catch: java.lang.Exception -> L21
                goto L2c
            L15:
                java.lang.String r2 = r5.j     // Catch: java.lang.Exception -> L21
                java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L21
                java.lang.String r4 = "Cancel Spp Socket with mBTInStream is null."
                r3[r1] = r4     // Catch: java.lang.Exception -> L21
                health.compact.a.LogUtil.e(r2, r3)     // Catch: java.lang.Exception -> L21
                goto L2c
            L21:
                java.lang.String r2 = r5.j
                java.lang.String r3 = "In Stream close occur Exception"
                java.lang.Object[] r3 = new java.lang.Object[]{r3}
                health.compact.a.LogUtil.d(r2, r3)
            L2c:
                java.io.OutputStream r2 = r5.f1720b     // Catch: java.lang.Exception -> L40
                if (r2 == 0) goto L34
                r2.close()     // Catch: java.lang.Exception -> L40
                goto L4b
            L34:
                java.lang.String r2 = r5.j     // Catch: java.lang.Exception -> L40
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L40
                java.lang.String r3 = "Cancel Spp Socket with mBTOutStream is null."
                r0[r1] = r3     // Catch: java.lang.Exception -> L40
                health.compact.a.LogUtil.b(r2, r0)     // Catch: java.lang.Exception -> L40
                goto L4b
            L40:
                java.lang.String r0 = r5.j
                java.lang.String r2 = "Out Stream close occur Exception"
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                health.compact.a.LogUtil.d(r0, r2)
            L4b:
                android.bluetooth.BluetoothSocket r0 = r5.f1719a     // Catch: java.lang.Exception -> L51
                r0.close()     // Catch: java.lang.Exception -> L51
                goto L5c
            L51:
                java.lang.String r0 = r5.j
                java.lang.String r2 = "Socket close occur Exception"
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                health.compact.a.LogUtil.d(r0, r2)
            L5c:
                r5.e = r1
                cny r0 = r5.h
                r0.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cli.a.b():void");
        }
    }
}
