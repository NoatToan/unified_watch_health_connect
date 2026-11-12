package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.CompatibleFitterCallback;
import com.huawei.devicesdk.callback.ConnectFilter;
import com.huawei.devicesdk.callback.DeviceCompatibleCallback;
import com.huawei.devicesdk.callback.DeviceHandshakeCallback;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.FrameReceiver;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.callback.ScanCallback;
import com.huawei.devicesdk.callback.StatusCallback;
import com.huawei.devicesdk.entity.CommandMessageParcel;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceDataFrameParcel;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ScanFilterParcel;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.devicesdk.entity.SendMode;
import com.huawei.devicesdk.service.DevicesManagementBinderInterface;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.store.SharedStoreManager;
import com.huawei.health.deviceconnect.callback.PingCallback;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.unitedevice.api.EngineChannelInterface;
import com.huawei.unitedevice.api.UniteChannelInterface;
import com.huawei.unitedevice.callback.IResultAIDLCallback;
import com.huawei.unitedevice.callback.ITransferFileCallback;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.hwcommonfilemgr.entity.CommonFileInfoParcel;
import com.huawei.unitedevice.hwcommonfilemgr.entity.FileInfo;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import com.huawei.unitedevice.p2p.IdentityInfo;
import com.huawei.unitedevice.p2p.MessageParcel;
import com.huawei.unitedevice.p2p.P2pPingCallback;
import com.huawei.unitedevice.p2p.P2pReceiver;
import com.huawei.unitedevice.p2p.P2pSendCallback;
import com.huawei.unitedevice.p2p.ReceiverCallback;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class xgv implements UniteChannelInterface, EngineChannelInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f52907c;
    private static final int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder.DeathRecipient f52908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConnectFilter f52909b;
    private Context d;
    private volatile DevicesManagementBinderInterface f;
    private final StatusCallback g;
    private DeviceStatusChangeCallback h;
    private Map<String, DeviceCompatibleCallback> i;
    private final FrameReceiver j;
    private boolean k;
    private ExecutorService l;
    private boolean m;
    private ExecutorService n;
    private final Object o;
    private String q;
    private MessageReceiveCallback r;
    private ServiceConnection s;
    private String t;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        e = iAvailableProcessors;
        f52907c = iAvailableProcessors + 1;
    }

    /* JADX INFO: renamed from: xgv$23, reason: invalid class name */
    /* JADX INFO: loaded from: classes20.dex */
    class AnonymousClass23 implements ServiceConnection {
        AnonymousClass23() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (xgv.this.o) {
                ReleaseLogUtil.c("DEVMGR_UniteDeviceServiceProxy", "onServiceConnected success!");
                xgv.this.k = true;
                xgv.this.f = DevicesManagementBinderInterface.Stub.asInterface(iBinder);
                DevicesManagementBinderInterface devicesManagementBinderInterface = xgv.this.f;
                if (devicesManagementBinderInterface != null) {
                    BroadcastManagerUtil.e(BaseApplication.b(), new Intent("com.huawei.bone.action.UNITE_SERVICE_SUCCESS"));
                    LogUtil.b("UniteDeviceServiceProxy", "init enter registerDeviceStateListener");
                    try {
                        devicesManagementBinderInterface.registerDeviceStatusListener(xgv.this.g);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "registerDeviceStatusListener RemoteException!");
                    }
                    try {
                        devicesManagementBinderInterface.registerDeviceFrameListener(xgv.this.j);
                    } catch (RemoteException unused2) {
                        LogUtil.d("UniteDeviceServiceProxy", "registerDeviceFrameListener RemoteException!");
                    }
                    xgv.this.n.execute(new Runnable() { // from class: xgy
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f52961b.b();
                        }
                    });
                    try {
                        IBinder iBinderAsBinder = devicesManagementBinderInterface.asBinder();
                        if (iBinderAsBinder != null) {
                            iBinderAsBinder.linkToDeath(xgv.this.f52908a, 0);
                        }
                    } catch (RemoteException unused3) {
                        LogUtil.d("UniteDeviceServiceProxy", "linkToDeath RemoteException!");
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            try {
                if (xgv.this.m && xgv.this.f52909b != null) {
                    LogUtil.b("UniteDeviceServiceProxy", "handleDeviceHandShake registerHandshakeFilter");
                    xgv.this.e();
                }
                CompatibleFitterCallback.Stub stub = new CompatibleFitterCallback.Stub() { // from class: xgv.23.4
                    @Override // com.huawei.devicesdk.callback.CompatibleFitterCallback
                    public void adapterOperate(List<String> list) {
                        Iterator it = xgv.this.i.values().iterator();
                        while (it.hasNext()) {
                            ((DeviceCompatibleCallback) it.next()).adapterOperate(list);
                        }
                    }
                };
                DevicesManagementBinderInterface devicesManagementBinderInterface = xgv.this.f;
                if (devicesManagementBinderInterface != null) {
                    devicesManagementBinderInterface.initUniteService(stub);
                }
            } catch (RemoteException unused) {
                LogUtil.d("UniteDeviceServiceProxy", "initUniteService RemoteException!");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LogUtil.b("UniteDeviceServiceProxy", "onServiceDisconnected success!");
            xgv.this.k = false;
            xgv.this.f = null;
        }
    }

    private xgv() {
        this.o = new Object();
        this.j = new FrameReceiver.Stub() { // from class: xgv.1
            @Override // com.huawei.devicesdk.callback.FrameReceiver
            public void onFrameReceived(int i, UniteDevice uniteDevice, DeviceDataFrameParcel deviceDataFrameParcel) {
                if (uniteDevice == null || xgv.this.r == null) {
                    ReleaseLogUtil.b("DEVMGR_UniteDeviceServiceProxy", "Device is null and messageReceiveCallbacks is null");
                    return;
                }
                cmm cmmVar = new cmm();
                if (deviceDataFrameParcel != null) {
                    cmmVar.c(deviceDataFrameParcel.getCharacteristicId());
                    cmmVar.a(deviceDataFrameParcel.getData());
                } else {
                    LogUtil.d("UniteDeviceServiceProxy", "DeviceDataFrame is null");
                }
                byte[] bArrD = cmmVar.d();
                if (bArrD != null && bArrD.length > 1) {
                    byte b2 = bArrD[0];
                    byte b3 = bArrD[1];
                    if (b2 == 27 || b2 == 39) {
                        ReleaseLogUtil.c("DEVMGR_UniteDeviceServiceProxy", "response sid: ", Integer.valueOf(b2), " cid: ", Integer.valueOf(b3));
                    }
                }
                xgv.this.r.onDataReceived(xgv.this.a(uniteDevice), cmmVar, i);
            }

            @Override // com.huawei.devicesdk.callback.FrameReceiver
            public void onChannelResult(int i, UniteDevice uniteDevice, String str) {
                LogUtil.b("UniteDeviceServiceProxy", "onChannelResult :", Integer.valueOf(i));
                if (uniteDevice != null && xgv.this.r != null) {
                    xgv.this.r.onChannelEnable(xgv.this.a(uniteDevice), str, i);
                } else {
                    LogUtil.d("UniteDeviceServiceProxy", "Device is null");
                }
            }
        };
        this.g = new StatusCallback.Stub() { // from class: xgv.13
            @Override // com.huawei.devicesdk.callback.StatusCallback
            public void onStatusChanged(int i, UniteDevice uniteDevice, int i2) {
                LogUtil.b("UniteDeviceServiceProxy", "onConnectStatusChanged :", Integer.valueOf(i2), " errorCode:", Integer.valueOf(i));
                if (uniteDevice != null && xgv.this.h != null) {
                    xgv.this.h.onConnectStatusChanged(xgv.this.a(uniteDevice), i2, i);
                } else {
                    LogUtil.d("UniteDeviceServiceProxy", "Device is null");
                }
            }
        };
        this.h = null;
        this.r = null;
        this.f52909b = null;
        this.f = null;
        this.i = new ConcurrentHashMap();
        this.t = "hw.unitedevice.";
        this.q = "UniteDeviceManagement";
        this.k = false;
        this.m = false;
        this.n = new ThreadPoolExecutor(f52907c, 50, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.l = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f52908a = new IBinder.DeathRecipient() { // from class: xgv.21
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                xgv.this.f = null;
            }
        };
        this.s = new AnonymousClass23();
    }

    public static xgv b() {
        return a.e;
    }

    public void d(Context context) {
        if (context == null) {
            LogUtil.d("UniteDeviceServiceProxy", "context is null");
            context = BaseApplication.b();
        }
        this.d = context;
        c(context);
    }

    private void c(final Context context) {
        this.n.execute(new Runnable() { // from class: xgv.30
            @Override // java.lang.Runnable
            public void run() {
                xgv.this.b(context, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, boolean z) {
        if (this.f != null) {
            return;
        }
        if (context == null) {
            LogUtil.d("UniteDeviceServiceProxy", "context is null");
            context = BaseApplication.b();
        }
        if (this.d == null) {
            this.d = context;
        }
        d();
        if (!z && !cqf.d() && !clw.e()) {
            LogUtil.d("UniteDeviceServiceProxy", "Have no bounded devices");
            return;
        }
        if (!b(context)) {
            ReleaseLogUtil.d("DEVMGR_UniteDeviceServiceProxy", "bindService exception, return.");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.n.execute(new Runnable() { // from class: xgv.29
            @Override // java.lang.Runnable
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if (xgv.this.f != null) {
                        LogUtil.b("UniteDeviceServiceProxy", " devicesManagementBinder not null in: " + i);
                        countDownLatch.countDown();
                        return;
                    }
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", " bindService InterruptedException");
                        countDownLatch.countDown();
                    }
                }
            }
        });
        try {
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.d("UniteDeviceServiceProxy", " countDownLatch InterruptedException");
        }
        LogUtil.b("UniteDeviceServiceProxy", "bindService end");
    }

    private boolean b(Context context) {
        try {
            context.bindService(c(), this.s, 1);
            return true;
        } catch (Exception e2) {
            ReleaseLogUtil.b("DEVMGR_UniteDeviceServiceProxy", "bindService exception: ", ExceptionUtils.c(e2));
            return e(context);
        }
    }

    private boolean e(Context context) {
        try {
            Thread.sleep(1000L);
            context.bindService(c(), this.s, 1);
            return true;
        } catch (Exception e2) {
            ReleaseLogUtil.b("DEVMGR_UniteDeviceServiceProxy", "retryBindService exception: ", ExceptionUtils.c(e2));
            return false;
        }
    }

    private void d() {
        if ("ok".equals(SharedStoreManager.a("keyvaldb_encrypt_udsdevice").getString("sync_data", ""))) {
            return;
        }
        LogUtil.b("UniteDeviceServiceProxy", "startDaemonService");
        Intent intent = new Intent();
        intent.setAction("com.huawei.daemonservice");
        intent.setPackage(this.d.getPackageName());
        intent.putExtra("startSyncData", "startSyncData");
        try {
            this.d.startService(intent);
        } catch (IllegalStateException | SecurityException unused) {
            LogUtil.e("UniteDeviceServiceProxy", "start daemon service fail");
        }
    }

    private Intent c() {
        Intent intent = new Intent();
        String packageName = this.d.getPackageName();
        intent.setComponent(new ComponentName(packageName, "com.huawei.devicesdk.service.DevicesManagementService"));
        intent.setPackage(packageName);
        return intent;
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void scanDevice(final ScanMode scanMode, final List<cmy> list, final DeviceScanCallback deviceScanCallback) {
        LogUtil.b("UniteDeviceServiceProxy", "enter scanDevice");
        if (scanMode == null || list == null || deviceScanCallback == null) {
            LogUtil.d("UniteDeviceServiceProxy", "ScanMode , filters or DeviceScanCallback is null");
        } else {
            this.n.execute(new Runnable() { // from class: xgv.26
                @Override // java.lang.Runnable
                public void run() {
                    xgv xgvVar = xgv.this;
                    xgvVar.b(xgvVar.d, true);
                    if (xgv.this.f != null) {
                        try {
                            xgv.this.f.scanDevice(scanMode.value(), xgv.d((List<cmy>) list), new ScanCallback.Stub() { // from class: xgv.26.3
                                @Override // com.huawei.devicesdk.callback.ScanCallback
                                public void onScanResult(int i, UniteDevice uniteDevice, byte[] bArr, String str) {
                                    deviceScanCallback.scanResult(uniteDevice, bArr, str, i);
                                }
                            });
                        } catch (RemoteException unused) {
                            LogUtil.d("UniteDeviceServiceProxy", "scanDevice RemoteException!");
                        }
                    }
                }
            });
        }
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void stopScanDevice() {
        LogUtil.b("UniteDeviceServiceProxy", "enter stopScanDevice");
        this.n.execute(new Runnable() { // from class: xgv.28
            @Override // java.lang.Runnable
            public void run() {
                xgv xgvVar = xgv.this;
                xgvVar.b(xgvVar.d, false);
                if (xgv.this.f != null) {
                    try {
                        xgv.this.f.stopScanDevice();
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "scanDevice RemoteException!");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<ScanFilterParcel> d(List<cmy> list) {
        ArrayList arrayList = new ArrayList(16);
        if (list != null && list.size() != 0) {
            for (cmy cmyVar : list) {
                if (cmyVar != null) {
                    ScanFilterParcel scanFilterParcel = new ScanFilterParcel();
                    scanFilterParcel.setType(cmyVar.c());
                    scanFilterParcel.setMatcher(cmyVar.a());
                    arrayList.add(scanFilterParcel);
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void connectDevice(UniteDevice uniteDevice, boolean z, ConnectMode connectMode) {
        connectDevice(uniteDevice, z, connectMode, null);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void connectDevice(final UniteDevice uniteDevice, final boolean z, final ConnectMode connectMode, final ConnectFilter connectFilter) {
        LogUtil.b("UniteDeviceServiceProxy", "enter connectDevice");
        if (uniteDevice == null) {
            LogUtil.d("UniteDeviceServiceProxy", "Device is null");
        } else if (connectMode == null) {
            LogUtil.d("UniteDeviceServiceProxy", "connectMode is null");
        } else {
            this.n.execute(new Runnable() { // from class: xgv.27
                @Override // java.lang.Runnable
                public void run() {
                    if (connectMode == ConnectMode.SIMPLE) {
                        LogUtil.b("UniteDeviceServiceProxy", "connectDevice mode is simple.");
                        xgv xgvVar = xgv.this;
                        xgvVar.b(xgvVar.d, true);
                    } else {
                        xgv xgvVar2 = xgv.this;
                        xgvVar2.b(xgvVar2.d, false);
                    }
                    if (xgv.this.f != null) {
                        synchronized (xgv.this.o) {
                            try {
                                xgv.this.f.connectDevice(uniteDevice, z, connectMode.value(), connectFilter != null ? new DeviceHandshakeCallback.Stub() { // from class: xgv.27.5
                                    @Override // com.huawei.devicesdk.callback.DeviceHandshakeCallback
                                    public int onProcess(UniteDevice uniteDevice2, String str, CommandMessageParcel commandMessageParcel) {
                                        cmg cmgVarC = xgv.this.c(commandMessageParcel);
                                        int iOnFilter = connectFilter.onFilter(uniteDevice2, str, cmgVarC);
                                        xgv.this.d(commandMessageParcel, cmgVarC);
                                        return iOnFilter;
                                    }

                                    @Override // com.huawei.devicesdk.callback.DeviceHandshakeCallback
                                    public String preProcess(UniteDevice uniteDevice2, String str) {
                                        return connectFilter.preProcess(uniteDevice2, str);
                                    }
                                } : null);
                            } catch (RemoteException unused) {
                                LogUtil.d("UniteDeviceServiceProxy", "connectDevice RemoteException!");
                            }
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CommandMessageParcel commandMessageParcel, cmg cmgVar) {
        if (commandMessageParcel == null || cmgVar == null) {
            return;
        }
        commandMessageParcel.setCharacteristicUuid(cmgVar.c());
        if (cmgVar.f() != null) {
            commandMessageParcel.setCommandType(cmgVar.f().value());
        }
        commandMessageParcel.setCommand(cmgVar.b());
        commandMessageParcel.setServiceUuid(cmgVar.i());
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void createSystemBond(final UniteDevice uniteDevice) {
        LogUtil.b("UniteDeviceServiceProxy", "enter createSystemBond");
        if (uniteDevice == null) {
            LogUtil.d("UniteDeviceServiceProxy", "Device is null");
        } else {
            this.n.execute(new Runnable() { // from class: xgv.3
                @Override // java.lang.Runnable
                public void run() {
                    xgv xgvVar = xgv.this;
                    xgvVar.b(xgvVar.d, false);
                    if (xgv.this.f != null) {
                        try {
                            xgv.this.f.pairDevice(uniteDevice, ConnectMode.TRANSPARENT.value());
                        } catch (RemoteException unused) {
                            LogUtil.d("UniteDeviceServiceProxy", "pairDevice RemoteException!");
                        }
                    }
                }
            });
        }
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void sendCommand(final UniteDevice uniteDevice, final cmg cmgVar) {
        LogUtil.b("UniteDeviceServiceProxy", "enter sendCommand");
        if (uniteDevice == null) {
            LogUtil.d("UniteDeviceServiceProxy", "Device is null");
        } else if (cmgVar == null) {
            LogUtil.d("UniteDeviceServiceProxy", "CommandMessage is null");
        } else {
            this.l.submit(new Runnable() { // from class: xgv.4
                @Override // java.lang.Runnable
                public void run() {
                    xgv xgvVar = xgv.this;
                    xgvVar.b(xgvVar.d, false);
                    if (xgv.this.f != null) {
                        try {
                            xgv.this.f.sendCommand(uniteDevice, xgv.b(cmgVar));
                        } catch (RemoteException unused) {
                            LogUtil.d("UniteDeviceServiceProxy", "sendCommand RemoteException!");
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CommandMessageParcel b(cmg cmgVar) {
        if (cmgVar == null) {
            return null;
        }
        CommandMessageParcel commandMessageParcel = new CommandMessageParcel();
        if (cmgVar.f() != null) {
            commandMessageParcel.setCommandType(cmgVar.f().value());
        }
        commandMessageParcel.setServiceUuid(cmgVar.i());
        commandMessageParcel.setCharacteristicUuid(cmgVar.c());
        commandMessageParcel.setCommand(cmgVar.b());
        commandMessageParcel.setPriorityType(cmgVar.j());
        commandMessageParcel.setNeedEncrypt(cmgVar.k());
        commandMessageParcel.setSocketChannel(cmgVar.g());
        if (cmgVar.e() != null) {
            commandMessageParcel.setOptionsType(cmgVar.e().value());
        }
        return commandMessageParcel;
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public Map<String, UniteDevice> getDeviceList() {
        HashMap map = new HashMap(10);
        c(this.d);
        if (this.f != null) {
            try {
                List<UniteDevice> deviceList = this.f.getDeviceList();
                if (deviceList != null) {
                    for (UniteDevice uniteDevice : deviceList) {
                        if (uniteDevice == null) {
                            LogUtil.d("UniteDeviceServiceProxy", "Device is null");
                        } else {
                            map.put(uniteDevice.getIdentify(), uniteDevice);
                        }
                    }
                }
            } catch (RemoteException unused) {
                LogUtil.d("UniteDeviceServiceProxy", "getDeviceList RemoteException!");
            }
            return map;
        }
        LogUtil.d("UniteDeviceServiceProxy", "devicesManagementBinder is null");
        return map;
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unPairDevice(final UniteDevice uniteDevice) {
        LogUtil.b("UniteDeviceServiceProxy", "enter unPairDevice");
        if (uniteDevice == null) {
            LogUtil.d("UniteDeviceServiceProxy", "Device is null");
        } else {
            this.n.execute(new Runnable() { // from class: xgv.5
                @Override // java.lang.Runnable
                public void run() {
                    xgv xgvVar = xgv.this;
                    xgvVar.b(xgvVar.d, false);
                    if (xgv.this.f != null) {
                        try {
                            xgv.this.f.unpairDevice(uniteDevice);
                            LogUtil.b("UniteDeviceServiceProxy", "unpairDevice success");
                        } catch (RemoteException unused) {
                            LogUtil.d("UniteDeviceServiceProxy", "unpairDevice RemoteException!");
                        }
                    }
                }
            });
        }
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void disconnect(final UniteDevice uniteDevice) {
        LogUtil.b("UniteDeviceServiceProxy", "enter disconnect");
        if (uniteDevice == null) {
            LogUtil.d("UniteDeviceServiceProxy", "Device is null");
        } else {
            this.n.execute(new Runnable() { // from class: xgv.2
                @Override // java.lang.Runnable
                public void run() {
                    xgv xgvVar = xgv.this;
                    xgvVar.b(xgvVar.d, false);
                    if (xgv.this.f != null) {
                        try {
                            xgv.this.f.disconnectDevice(uniteDevice);
                            LogUtil.b("UniteDeviceServiceProxy", "disconnectDevice success");
                        } catch (RemoteException unused) {
                            LogUtil.d("UniteDeviceServiceProxy", "disconnectDevice RemoteException!");
                        }
                    }
                }
            });
        }
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public boolean isSupportService(UniteDevice uniteDevice, String str) {
        LogUtil.b("UniteDeviceServiceProxy", "enter isSupportService");
        if (uniteDevice == null) {
            LogUtil.d("UniteDeviceServiceProxy", "Device is null");
            return false;
        }
        if (str == null) {
            LogUtil.d("UniteDeviceServiceProxy", "serviceUuid is null");
            return false;
        }
        c(this.d);
        if (this.f != null) {
            try {
                return this.f.isSupportService(uniteDevice, str);
            } catch (RemoteException unused) {
                LogUtil.d("UniteDeviceServiceProxy", "isSupportService RemoteException!");
            }
        }
        return false;
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public boolean isSupportCharactor(UniteDevice uniteDevice, String str, String str2) {
        LogUtil.b("UniteDeviceServiceProxy", "enter isSupportCharactor");
        if (uniteDevice == null) {
            LogUtil.d("UniteDeviceServiceProxy", "Device is null");
            return false;
        }
        if (str == null) {
            LogUtil.d("UniteDeviceServiceProxy", "serviceUuid is null");
            return false;
        }
        if (str2 == null) {
            LogUtil.d("UniteDeviceServiceProxy", "charactorUuid is null");
            return false;
        }
        c(this.d);
        if (this.f != null) {
            try {
                return this.f.isSupportCharacteristic(uniteDevice, str, str2);
            } catch (RemoteException unused) {
                LogUtil.d("UniteDeviceServiceProxy", "isSupportService RemoteException!");
            }
        }
        return false;
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerDeviceStateListener(String str, DeviceStatusChangeCallback deviceStatusChangeCallback) {
        LogUtil.b("UniteDeviceServiceProxy", "enter registerDeviceStateListener");
        if (str == null) {
            LogUtil.d("UniteDeviceServiceProxy", "listenerId is null");
        } else if (deviceStatusChangeCallback == null) {
            LogUtil.d("UniteDeviceServiceProxy", "DeviceStatusChangeCallback is null");
        } else {
            this.h = deviceStatusChangeCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceInfo a(UniteDevice uniteDevice) {
        return uniteDevice.getDeviceInfo();
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerDeviceMessageListener(String str, MessageReceiveCallback messageReceiveCallback) {
        LogUtil.b("UniteDeviceServiceProxy", "enter registerDeviceMessageListener");
        if (str == null) {
            LogUtil.d("UniteDeviceServiceProxy", "listenerId is null");
        } else if (messageReceiveCallback == null) {
            LogUtil.d("UniteDeviceServiceProxy", "MessageReceiveCallback is null");
        } else {
            this.r = messageReceiveCallback;
        }
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterDeviceStateListener(String str) {
        LogUtil.b("UniteDeviceServiceProxy", "enter unregisterDeviceStateListener");
        if (str == null) {
            LogUtil.d("UniteDeviceServiceProxy", "listenerId is null");
        } else {
            this.h = null;
        }
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterDeviceMessageListener(String str) {
        LogUtil.b("UniteDeviceServiceProxy", "enter unregisterDeviceMessageListener");
        if (str == null) {
            LogUtil.d("UniteDeviceServiceProxy", "listenerId is null");
        } else {
            this.r = null;
        }
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerHandshakeFilter(ConnectFilter connectFilter) {
        LogUtil.b("UniteDeviceServiceProxy", "enter registerHandshakeFilter");
        if (connectFilter == null) {
            LogUtil.e("UniteDeviceServiceProxy", "registerHandshakeFilter filter is null");
        } else {
            this.f52909b = connectFilter;
            this.n.execute(new Runnable() { // from class: xgv.7
                @Override // java.lang.Runnable
                public void run() {
                    xgv xgvVar = xgv.this;
                    xgvVar.b(xgvVar.d, false);
                    if (xgv.this.f == null) {
                        xgv.this.m = true;
                        LogUtil.d("UniteDeviceServiceProxy", "registerHandshakeFilter time out");
                    } else {
                        xgv.this.e();
                        try {
                            xgv.this.f.initUniteService(null);
                        } catch (RemoteException unused) {
                            LogUtil.d("UniteDeviceServiceProxy", "initUniteService RemoteException!");
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        DeviceHandshakeCallback.Stub stub = new DeviceHandshakeCallback.Stub() { // from class: xgv.8
            @Override // com.huawei.devicesdk.callback.DeviceHandshakeCallback
            public int onProcess(UniteDevice uniteDevice, String str, CommandMessageParcel commandMessageParcel) {
                cmg cmgVarC = xgv.this.c(commandMessageParcel);
                int iOnFilter = xgv.this.f52909b != null ? xgv.this.f52909b.onFilter(uniteDevice, str, cmgVarC) : -1;
                xgv.this.d(commandMessageParcel, cmgVarC);
                return iOnFilter;
            }

            @Override // com.huawei.devicesdk.callback.DeviceHandshakeCallback
            public String preProcess(UniteDevice uniteDevice, String str) {
                if (xgv.this.f52909b != null) {
                    return xgv.this.f52909b.preProcess(uniteDevice, str);
                }
                return "";
            }
        };
        if (this.f == null) {
            LogUtil.d("UniteDeviceServiceProxy", "registerHandshakeCallback devicesManagementBinder is null");
            return;
        }
        try {
            this.f.registerHandshakeCallback(stub);
        } catch (RemoteException unused) {
            LogUtil.d("UniteDeviceServiceProxy", "registerHandshakeCallback RemoteException!");
        }
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void setCharacteristicNotify(final UniteDevice uniteDevice, final String str, final String str2, final SendMode sendMode, final boolean z) {
        LogUtil.b("UniteDeviceServiceProxy", "enter setCharacteristicNotify");
        if (uniteDevice == null || str == null || str2 == null) {
            LogUtil.d("UniteDeviceServiceProxy", "Device,serviceId or characteristicId is null");
        } else {
            this.n.execute(new Runnable() { // from class: xgv.10
                @Override // java.lang.Runnable
                public void run() {
                    xgv xgvVar = xgv.this;
                    xgvVar.b(xgvVar.d, false);
                    if (xgv.this.f != null) {
                        try {
                            xgv.this.f.setCharacteristicNotify(uniteDevice, str, str2, sendMode.value(), z);
                        } catch (RemoteException unused) {
                            LogUtil.d("UniteDeviceServiceProxy", "setCharacteristicNotify RemoteException!");
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cmg c(CommandMessageParcel commandMessageParcel) {
        cmg cmgVar = new cmg();
        if (commandMessageParcel != null) {
            cmgVar.b(commandMessageParcel.getServiceUuid());
            cmgVar.e(commandMessageParcel.getCharacteristicUuid());
            cmgVar.a(commandMessageParcel.getCommand());
            cmgVar.d(SendMode.getValue(commandMessageParcel.getCommandType()));
        }
        return cmgVar;
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void p2pSendForWearEngine(final Context context, final UniteDevice uniteDevice, final xgz xgzVar, final SendCallback sendCallback) {
        this.l.submit(new Runnable() { // from class: xgv.6
            @Override // java.lang.Runnable
            public void run() {
                xgv.this.b(context, false);
                if (xgv.this.f != null) {
                    try {
                        LogUtil.b("UniteDeviceServiceProxy", "enter p2pSendForWearEngine");
                        P2pSendCallback.Stub stubA = xgv.this.a(sendCallback);
                        if (TextUtils.isEmpty(xgzVar.g())) {
                            LogUtil.b("UniteDeviceServiceProxy", "enter btproxy/medta TransferFile");
                            xgv.this.f.send(uniteDevice, xit.e(xgzVar.j()), new IdentityInfo(xgv.this.t + xgzVar.e().getValue(), xgv.this.q), new IdentityInfo(xgzVar.o(), xgzVar.i()), stubA);
                            return;
                        }
                        LogUtil.b("UniteDeviceServiceProxy", "enter wearengine transferfile.");
                        xgv.this.f.send(uniteDevice, xgv.this.a(xgzVar), new IdentityInfo(xgzVar.g(), xgzVar.f()), new IdentityInfo(xgzVar.o(), xgzVar.i()), stubA);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "setCharacteristicNotify RemoteException!");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public P2pSendCallback.Stub a(final SendCallback sendCallback) {
        if (sendCallback != null) {
            return new P2pSendCallback.Stub() { // from class: xgv.9
                @Override // com.huawei.unitedevice.p2p.P2pSendCallback
                public void onSendResult(int i) throws RemoteException {
                    LogUtil.b("UniteDeviceServiceProxy", "p2pSendForWearEngine enter onSendResult:", Integer.valueOf(i));
                    sendCallback.onSendResult(i);
                }

                @Override // com.huawei.unitedevice.p2p.P2pSendCallback
                public void onSendProgress(long j) throws RemoteException {
                    LogUtil.b("UniteDeviceServiceProxy", "enter onSendProgress");
                    sendCallback.onSendProgress(j);
                }

                @Override // com.huawei.unitedevice.p2p.P2pSendCallback
                public void onFileTransferReport(String str) {
                    LogUtil.b("UniteDeviceServiceProxy", "getP2pSendCallbackStub onFileTransferReport transferWay:", str);
                    sendCallback.onFileTransferReport(str);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MessageParcel a(xgz xgzVar) {
        if (xgzVar == null) {
            return null;
        }
        MessageParcel messageParcel = new MessageParcel();
        messageParcel.setType(2);
        messageParcel.setParcelFileDescriptor(xgzVar.c());
        messageParcel.setFileName(xgzVar.b());
        messageParcel.setDescription(xgzVar.a());
        messageParcel.setFileSha256(xgzVar.h());
        messageParcel.setFilePath(xgzVar.d());
        return messageParcel;
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void startTransferFileToWear(final xhr xhrVar, final IResultAIDLCallback iResultAIDLCallback) {
        this.l.submit(new Runnable() { // from class: xgv.15
            @Override // java.lang.Runnable
            public void run() {
                xgv xgvVar = xgv.this;
                xgvVar.b(xgvVar.d, false);
                if (xgv.this.f != null) {
                    try {
                        LogUtil.b("UniteDeviceServiceProxy", "enter startTransferFile");
                        FileInfo fileInfo = new FileInfo();
                        fileInfo.setFileName(xhrVar.n());
                        fileInfo.setFileType(xhrVar.y());
                        fileInfo.setFilePath(xhrVar.t());
                        fileInfo.setSourceId(xhrVar.ae());
                        fileInfo.setPackageName(xhrVar.ab());
                        fileInfo.setAttentionTypes(xhrVar.c());
                        fileInfo.setRequestType(xhrVar.ac());
                        if (xhrVar.h() != null) {
                            fileInfo.setIdentify(xhrVar.h().getIdentify());
                        }
                        fileInfo.setFileDescriptor(xhrVar.z());
                        fileInfo.setFileSize(xhrVar.u());
                        xgv.this.f.startTransferFile(fileInfo, iResultAIDLCallback);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "setCharacteristicNotify RemoteException!");
                    }
                }
            }
        });
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void registerReceiver(final Context context, final xgz xgzVar, final P2pReceiver p2pReceiver, final SendCallback sendCallback) {
        this.l.submit(new Runnable() { // from class: xgv.14
            @Override // java.lang.Runnable
            public void run() {
                xgv.this.b(context, false);
                if (xgv.this.f != null) {
                    try {
                        String str = xgv.this.t + xgzVar.e().getValue();
                        IdentityInfo identityInfo = new IdentityInfo(str, xgv.this.q);
                        IdentityInfo identityInfo2 = new IdentityInfo(xgzVar.o(), xgzVar.i());
                        String strC = ProcessUtil.c();
                        LogUtil.b("UniteDeviceServiceProxy", "enter registerReceiver srcPkgName：", str, ",destPkgName: ", xgzVar.o(), ",processName: ", strC);
                        xgv.this.f.subscribeDeviceDataReceiver(identityInfo, identityInfo2, xgv.this.a(p2pReceiver), strC, xgv.this.d(sendCallback));
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "setCharacteristicNotify RemoteException!");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public P2pSendCallback.Stub d(final SendCallback sendCallback) {
        return new P2pSendCallback.Stub() { // from class: xgv.11
            @Override // com.huawei.unitedevice.p2p.P2pSendCallback
            public void onSendResult(int i) throws RemoteException {
                LogUtil.b("UniteDeviceServiceProxy", "registerReceiver enter onSendResult:", Integer.valueOf(i));
                sendCallback.onSendResult(i);
            }

            @Override // com.huawei.unitedevice.p2p.P2pSendCallback
            public void onSendProgress(long j) throws RemoteException {
                LogUtil.b("UniteDeviceServiceProxy", "enter onSendProgress:", Long.valueOf(j));
                sendCallback.onSendProgress(j);
            }

            @Override // com.huawei.unitedevice.p2p.P2pSendCallback
            public void onFileTransferReport(String str) {
                LogUtil.b("UniteDeviceServiceProxy", "enter onFileTransferReport:", str);
                sendCallback.onFileTransferReport(str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReceiverCallback.Stub a(final P2pReceiver p2pReceiver) {
        return new ReceiverCallback.Stub() { // from class: xgv.12
            @Override // com.huawei.unitedevice.p2p.ReceiverCallback
            public void onReceiveMessage(DeviceInfo deviceInfo, MessageParcel messageParcel) throws RemoteException {
                xiu.c cVar = new xiu.c();
                if (messageParcel != null) {
                    if (messageParcel.getType() == 2) {
                        LogUtil.d("UniteDeviceServiceProxy", "registerReceiver P2pMessage type is error");
                    } else {
                        cVar.a(messageParcel.getData());
                    }
                }
                p2pReceiver.onReceiveMessage(deviceInfo, cVar.c());
            }
        };
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void unregisterReceiver(final Context context, final P2pReceiver p2pReceiver, final xgz xgzVar) {
        this.l.submit(new Runnable() { // from class: xgv.18
            @Override // java.lang.Runnable
            public void run() {
                xgv.this.b(context, false);
                if (xgv.this.f != null) {
                    try {
                        final xiu xiuVar = null;
                        ReceiverCallback.Stub stub = new ReceiverCallback.Stub() { // from class: xgv.18.3
                            @Override // com.huawei.unitedevice.p2p.ReceiverCallback
                            public void onReceiveMessage(DeviceInfo deviceInfo, MessageParcel messageParcel) throws RemoteException {
                                p2pReceiver.onReceiveMessage(deviceInfo, xiuVar);
                            }
                        };
                        String str = xgv.this.t + xgzVar.e().getValue();
                        String strO = xgzVar.o();
                        String strC = ProcessUtil.c();
                        LogUtil.b("UniteDeviceServiceProxy", "enter unregisterReceiver srcPkgName：", str, ",destPkgName: ", strO, ",processName: ", strC);
                        xgv.this.f.unsubscribeDeviceDataReceiver(stub, strC, str, strO);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "setCharacteristicNotify RemoteException!");
                    }
                }
            }
        });
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void pingSendForWearEngine(final Context context, final UniteDevice uniteDevice, final String str, final PingCallback pingCallback, final int i) {
        this.l.submit(new Runnable() { // from class: xgv.20
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b("UniteDeviceServiceProxy", "enter pingSendForWearEngine");
                xgv.this.b(context, false);
                if (xgv.this.f != null) {
                    try {
                        LogUtil.b("UniteDeviceServiceProxy", "enter ping");
                        P2pPingCallback.Stub stub = new P2pPingCallback.Stub() { // from class: xgv.20.2
                            @Override // com.huawei.unitedevice.p2p.P2pPingCallback
                            public void onResult(int i2) throws RemoteException {
                                LogUtil.b("UniteDeviceServiceProxy", "enter pingSendForWearEngine onResult", Integer.valueOf(i2));
                                pingCallback.onPingResult(i2);
                            }
                        };
                        LogUtil.b("UniteDeviceServiceProxy", "enter ping:", "com.huawei.health");
                        xgv.this.f.ping(uniteDevice, "com.huawei.health", str, stub, i);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "setCharacteristicNotify RemoteException!");
                    }
                }
            }
        });
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void startReceiveFileFromWear(final RequestFileInfo requestFileInfo, final ITransferFileCallback iTransferFileCallback) {
        this.l.submit(new Runnable() { // from class: xgv.17
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b("UniteDeviceServiceProxy", "enter startRequestFile");
                xgv xgvVar = xgv.this;
                xgvVar.b(xgvVar.d, false);
                if (xgv.this.f != null) {
                    try {
                        LogUtil.b("UniteDeviceServiceProxy", "enter startRequestFile1");
                        xgv.this.f.startRequestFile(requestFileInfo, iTransferFileCallback);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "startRequestFile RemoteException!");
                    }
                }
            }
        });
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void stopReceiveFileFromWear(final RequestFileInfo requestFileInfo, final ITransferFileCallback iTransferFileCallback) {
        this.l.submit(new Runnable() { // from class: xgv.19
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b("UniteDeviceServiceProxy", "enter stopRequestFile");
                xgv xgvVar = xgv.this;
                xgvVar.b(xgvVar.d, false);
                if (xgv.this.f != null) {
                    try {
                        LogUtil.b("UniteDeviceServiceProxy", "enter stopRequestFile1");
                        xgv.this.f.stopRequestFile(requestFileInfo, iTransferFileCallback);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "startRequestFile RemoteException!");
                    }
                }
            }
        });
    }

    @Override // com.huawei.unitedevice.api.EngineChannelInterface
    public void stopTransferFileToWear(final xhr xhrVar, final ITransferFileCallback iTransferFileCallback) {
        this.l.submit(new Runnable() { // from class: xgv.16
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b("UniteDeviceServiceProxy", "enter stopTransferByQueue");
                xgv xgvVar = xgv.this;
                xgvVar.b(xgvVar.d, false);
                if (xgv.this.f != null) {
                    CommonFileInfoParcel commonFileInfoParcel = new CommonFileInfoParcel();
                    commonFileInfoParcel.setFileName(xhrVar.n());
                    commonFileInfoParcel.setFileType(xhrVar.y());
                    commonFileInfoParcel.setSourcePackageName(xhrVar.ag());
                    commonFileInfoParcel.setSourceCertificate(xhrVar.ai());
                    commonFileInfoParcel.setDestinationPackageName(xhrVar.i());
                    commonFileInfoParcel.setDestinationCertificate(xhrVar.g());
                    commonFileInfoParcel.setFilePath(xhrVar.t());
                    commonFileInfoParcel.setDescription(xhrVar.j());
                    commonFileInfoParcel.setSha256Result(xhrVar.ah());
                    if (xhrVar.h() != null) {
                        commonFileInfoParcel.setIdentify(xhrVar.h().getIdentify());
                    }
                    try {
                        xgv.this.f.stopTransferByQueue(commonFileInfoParcel, iTransferFileCallback);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "setCharacteristicNotify RemoteException!");
                    }
                }
            }
        });
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerDeviceCompatibleListener(String str, DeviceCompatibleCallback deviceCompatibleCallback) {
        this.i.put(str, deviceCompatibleCallback);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterDeviceCompatibleListener(String str) {
        this.i.remove(str);
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void registerListener(final String str, final String str2, final DataReceiveCallback dataReceiveCallback) {
        this.l.submit(new Runnable() { // from class: xgv.24
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b("UniteDeviceServiceProxy", "enter registerListener");
                xgv xgvVar = xgv.this;
                xgvVar.b(xgvVar.d, false);
                if (xgv.this.f != null) {
                    try {
                        LogUtil.b("UniteDeviceServiceProxy", "enter receiverCallback");
                        FrameReceiver.Stub stub = new FrameReceiver.Stub() { // from class: xgv.24.5
                            @Override // com.huawei.devicesdk.callback.FrameReceiver
                            public void onFrameReceived(int i, UniteDevice uniteDevice, DeviceDataFrameParcel deviceDataFrameParcel) {
                                LogUtil.b("UniteDeviceServiceProxy", "registerListener onFrameReceived enter");
                                if (deviceDataFrameParcel != null) {
                                    byte[] data = deviceDataFrameParcel.getData();
                                    if (uniteDevice != null) {
                                        xiq.a().a(uniteDevice, data, dataReceiveCallback);
                                        return;
                                    } else {
                                        LogUtil.d("UniteDeviceServiceProxy", "device is null");
                                        return;
                                    }
                                }
                                LogUtil.d("UniteDeviceServiceProxy", "onFrameReceived is null");
                            }

                            @Override // com.huawei.devicesdk.callback.FrameReceiver
                            public void onChannelResult(int i, UniteDevice uniteDevice, String str3) {
                                LogUtil.b("UniteDeviceServiceProxy", "onChannelResult enter", Integer.valueOf(i));
                            }
                        };
                        LogUtil.b("UniteDeviceServiceProxy", "enter registerListener:", str, str2);
                        xgv.this.f.registerListener(str, str2, stub);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "registerListener RemoteException!");
                    }
                }
            }
        });
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void unregisterListener(final String str, final String str2) {
        this.l.submit(new Runnable() { // from class: xgv.25
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b("UniteDeviceServiceProxy", "enter unregisterListener");
                xgv xgvVar = xgv.this;
                xgvVar.b(xgvVar.d, false);
                if (xgv.this.f != null) {
                    try {
                        LogUtil.b("UniteDeviceServiceProxy", "enter unregisterListener:", str, str2);
                        xgv.this.f.unregisterListener(str, str2);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "unregisterListener RemoteException!");
                    }
                }
            }
        });
    }

    public void a() {
        ServiceConnection serviceConnection;
        LogUtil.b("UniteDeviceServiceProxy", "destory");
        Context context = this.d;
        if (context != null && (serviceConnection = this.s) != null && this.k) {
            try {
                context.unbindService(serviceConnection);
            } catch (Exception unused) {
                LogUtil.d("UniteDeviceServiceProxy", "destory unbindService exception");
            }
            this.k = false;
        }
        this.f = null;
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public void updateDeviceAfterSimulatConnected(final String str) {
        LogUtil.b("UniteDeviceServiceProxy", "enter updateDeviceAfterSimulatConnected");
        this.n.execute(new Runnable() { // from class: xgv.22
            @Override // java.lang.Runnable
            public void run() {
                xgv xgvVar = xgv.this;
                xgvVar.b(xgvVar.d, false);
                if (xgv.this.f != null) {
                    try {
                        xgv.this.f.updateDeviceAfterSimulatConnected(str);
                    } catch (RemoteException unused) {
                        LogUtil.d("UniteDeviceServiceProxy", "updateDeviceAfterSimulatConnected RemoteException!");
                    }
                }
            }
        });
    }

    @Override // com.huawei.unitedevice.api.UniteChannelInterface
    public List<com.huawei.health.devicemgr.business.entity.DeviceInfo> getDeviceMgrList(int i, String str) {
        c(this.d);
        if (this.f != null) {
            try {
                return this.f.getDeviceMgrList(i, str);
            } catch (RemoteException unused) {
                LogUtil.d("UniteDeviceServiceProxy", "getDeviceMgrList RemoteException!");
            }
        } else {
            LogUtil.d("UniteDeviceServiceProxy", "devicesManagementBinder is null");
        }
        return new ArrayList(16);
    }

    /* JADX INFO: loaded from: classes20.dex */
    static class a {
        private static xgv e = new xgv();
    }
}
