package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.r3;
import com.huawei.hwotamanager.ICheckCallback;
import com.huawei.hwotamanager.IDeviceListCallback;
import com.huawei.hwotamanager.IUpgradeCallBack;
import com.huawei.hwotamanager.IUpgradeStatusCallBack;
import com.huawei.hwotamanager.IWearHwUpdateServiceAIDL;
import com.huawei.wearengine.HiWearEngineService;
import com.huawei.wearengine.core.callback.ServiceConnectStateCallback;
import com.huawei.wearengine.core.device.VirtualDevice;
import com.huawei.wearengine.core.device.WearableDeviceCaller;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.device.FoundListener;
import com.huawei.wearengine.device.GetAttributeListener;
import com.huawei.wearengine.monitor.MonitorCallback;
import com.huawei.wearengine.monitor.QueryDataCallback;
import com.huawei.wearengine.monitor.SwitchStatusCallback;
import com.huawei.wearengine.notify.NotificationParcel;
import com.huawei.wearengine.notify.NotifySendCallback;
import com.huawei.wearengine.p2p.FileIdentificationParcel;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcelExtra;
import com.huawei.wearengine.p2p.P2pCancelFileTransferCallBack;
import com.huawei.wearengine.p2p.P2pInnerApi;
import com.huawei.wearengine.p2p.P2pPingCallback;
import com.huawei.wearengine.p2p.P2pReceiverCallback;
import com.huawei.wearengine.p2p.P2pSendCallback;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes46.dex */
public class yjd implements VirtualDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private P2pInnerApi f53429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBinder.DeathRecipient f53430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile HiWearEngineService f53431c;
    private final ymc d;
    private ServiceConnectStateCallback e;
    private ExecutorService i = Executors.newSingleThreadExecutor();

    public yjd() {
        ymc ymcVar = new ymc("com.huawei.health", "com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwUpdateService");
        this.d = ymcVar;
        this.f53430b = new IBinder.DeathRecipient() { // from class: yjd.1
            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                yit.e("WearableDeviceManager", "binderDied enter");
                if (yjd.this.f53431c != null) {
                    yjd.this.f53431c.asBinder().unlinkToDeath(yjd.this.f53430b, 0);
                    yjd.this.f53431c = null;
                }
                yjd.this.e();
            }
        };
        ServiceConnectStateCallback serviceConnectStateCallback = new ServiceConnectStateCallback() { // from class: yjd.11
            @Override // com.huawei.wearengine.core.callback.ServiceConnectStateCallback
            public void onConnectChanged(ComponentName componentName, IBinder iBinder, boolean z) {
                if (z) {
                    return;
                }
                yit.e("WearableDeviceManager", "otaService is died");
                yjg.e().d();
            }
        };
        this.e = serviceConnectStateCallback;
        ymcVar.d(serviceConnectStateCallback);
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void setBinder(String str, IBinder iBinder) {
        yit.e("WearableDeviceManager", "setBinder enter");
        try {
            this.f53431c = HiWearEngineService.Stub.asInterface(iBinder);
            yit.d("WearableDeviceManager", "mApiAidl: " + this.f53431c);
            if (this.f53431c == null) {
                yit.c("WearableDeviceManager", "onServiceConnected error !");
            } else {
                this.f53431c.asBinder().linkToDeath(this.f53430b, 0);
            }
        } catch (RemoteException unused) {
            yit.c("WearableDeviceManager", "setBinder exception");
        }
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void initModule() {
        final String string = UUID.randomUUID().toString();
        yit.d("WearableDeviceManager", string + " initModule enter");
        this.i.execute(new Runnable() { // from class: yjd.19
            @Override // java.lang.Runnable
            public void run() {
                try {
                    yjd.this.c(false, string);
                } catch (IllegalStateException unused) {
                    yit.b("WearableDeviceManager", string + " initModule IllegalStateException");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z, String str) {
        yit.a("WearableDeviceManager", str + " bindService enter");
        if (this.f53431c != null) {
            yit.a("WearableDeviceManager", str + " bindService mApiAidl != null return");
            return;
        }
        if (!z && !c()) {
            yit.b("WearableDeviceManager", str + " bindService no device");
            throw new IllegalStateException(String.valueOf(4));
        }
        yit.e("WearableDeviceManager", str + " start to invoke phone service");
        a();
        for (int i = 0; i < 70; i++) {
            if (this.f53431c != null) {
                yit.c("WearableDeviceManager", str + " mApiAidl not null in: " + i);
                return;
            }
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
                yit.c("WearableDeviceManager", str + " bindService InterruptedException");
            }
        }
    }

    private void a() {
        yit.e("WearableDeviceManager", "startPhoneService enter");
        yit.e("WearableDeviceManager", "startPhoneService start phone service");
        Intent intent = new Intent();
        intent.setAction("com.huawei.bone.action.StartPhoneService");
        intent.setPackage("com.huawei.health");
        intent.putExtra("WearEngineDataKey", "WearEngineStartPhoneService");
        try {
            yiv.a().startService(intent);
        } catch (IllegalStateException | SecurityException unused) {
            yit.c("WearableDeviceManager", "startPhoneService fail");
            throw new IllegalStateException(String.valueOf(12));
        }
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void releaseModule() {
        if (this.f53431c != null) {
            this.f53431c.asBinder().unlinkToDeath(this.f53430b, 0);
        }
        this.f53431c = null;
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void getDeviceList(final FoundListener foundListener, final String str) {
        c("getDeviceList", new WearableDeviceCaller() { // from class: yjd.24
            @Override // com.huawei.wearengine.core.device.WearableDeviceCaller
            public void onCall() throws RemoteException {
                yjd.this.f53431c.getBondedDevices(foundListener, str, yik.e().contains(str));
            }
        }, foundListener);
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void getAllDeviceList(final FoundListener foundListener, final String str) {
        c("getAllDeviceList", new WearableDeviceCaller() { // from class: yjd.22
            @Override // com.huawei.wearengine.core.device.WearableDeviceCaller
            public void onCall() throws RemoteException {
                yjd.this.f53431c.getAllBondedDevices(foundListener, str);
            }
        }, foundListener);
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void getCommonDevice(final FoundListener foundListener, final String str) {
        c("getCommonDevice", new WearableDeviceCaller() { // from class: yjd.25
            @Override // com.huawei.wearengine.core.device.WearableDeviceCaller
            public void onCall() throws RemoteException {
                yjd.this.f53431c.getCommonDevices(foundListener, str, yik.e().contains(str));
            }
        }, foundListener);
    }

    private void c(String str, final WearableDeviceCaller wearableDeviceCaller, final FoundListener foundListener) {
        final String string = UUID.randomUUID().toString();
        final String str2 = String.format(Locale.ROOT, "%s %s", string, str);
        if (foundListener == null) {
            yit.c("WearableDeviceManager", str2 + " callback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        yit.e("WearableDeviceManager", str2 + " enter");
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.23
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", str2 + " mApiAidl is null");
                        foundListener.onDeviceFound(null);
                        return 12;
                    }
                    yit.e("WearableDeviceManager", str2 + " send");
                    WearableDeviceCaller wearableDeviceCaller2 = wearableDeviceCaller;
                    if (wearableDeviceCaller2 != null) {
                        wearableDeviceCaller2.onCall();
                    }
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", str2 + " RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), str);
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void getHiLinkDeviceId(final Device device, final GetAttributeListener getAttributeListener) {
        final String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + " getHiLinkDeviceId enter");
        if (device == null) {
            yit.c("WearableDeviceManager", string + " getHiLinkDeviceId device is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (getAttributeListener == null) {
            yit.c("WearableDeviceManager", string + " getHiLinkDeviceId getAttributeListener is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.21
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " getHiLinkDeviceId mApiAidl is null");
                        getAttributeListener.onGetString(null);
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " getHiLinkDeviceId send");
                    yjd.this.f53431c.getHiLinkDeviceId(device, getAttributeListener);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " getHiLinkDeviceId RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    yit.b("WearableDeviceManager", string + " getHiLinkDeviceId IllegalStateException");
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "getHiLinkDeviceId");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void queryDeviceCapability(final Device device, final int i, final GetAttributeListener getAttributeListener) {
        final String string = UUID.randomUUID().toString();
        if (device == null) {
            yit.c("WearableDeviceManager", string + " queryDeviceCapability device is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (getAttributeListener == null) {
            yit.c("WearableDeviceManager", string + " queryDeviceCapability queryCapabilityCallback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.27
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " queryDeviceCapability mApiAidl is null");
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " queryDeviceCapability send");
                    yjd.this.f53431c.queryDeviceCapability(device, i, getAttributeListener);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " queryDeviceCapability RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    yit.b("WearableDeviceManager", string + " queryDeviceCapability IllegalStateException");
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "queryDeviceCapability");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void ping(Device device, String str, String str2, P2pPingCallback p2pPingCallback) {
        if (p2pPingCallback == null) {
            yit.c("WearableDeviceManager", "ping pingCallback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (device != null && yiv.e(str) && yiv.e(str2)) {
            yit.e("WearableDeviceManager", "ping enter");
            d(this.i.submit(d(device, str, str2, p2pPingCallback)), r3.r);
        } else {
            try {
                p2pPingCallback.onResult(5);
                yit.c("WearableDeviceManager", "ping device or pkgName is valid");
                throw new IllegalStateException(String.valueOf(5));
            } catch (RemoteException unused) {
                yit.b("WearableDeviceManager", "ping RemoteException");
                throw new IllegalStateException(String.valueOf(12));
            }
        }
    }

    private Callable<Integer> d(final Device device, final String str, final String str2, final P2pPingCallback p2pPingCallback) {
        final String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + " getPingCallable enter");
        return new Callable<Integer>() { // from class: yjd.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                return yjd.this.d(device, str, str2, p2pPingCallback, string);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer d(Device device, String str, String str2, P2pPingCallback p2pPingCallback, String str3) {
        try {
            c(false, str3);
            if (this.f53431c == null) {
                yit.b("WearableDeviceManager", str3 + " ping mApiAidl is null");
                p2pPingCallback.onResult(12);
                return 12;
            }
            yit.e("WearableDeviceManager", str3 + " ping send");
            this.f53431c.ping(device, str, str2, p2pPingCallback);
            return 0;
        } catch (RemoteException unused) {
            yit.b("WearableDeviceManager", str3 + " ping RemoteException");
            return 12;
        } catch (IllegalStateException e) {
            return Integer.valueOf(yio.e(e.getMessage()));
        }
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void send(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) {
        if (p2pSendCallback == null) {
            yit.c("WearableDeviceManager", "send sendCallback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (messageParcelExtra == null) {
            yit.c("WearableDeviceManager", "send message is null");
            d(p2pSendCallback, 5);
            throw new IllegalStateException(String.valueOf(5));
        }
        a(messageParcelExtra, p2pSendCallback);
        if (identityInfo == null || identityInfo2 == null) {
            d(p2pSendCallback, 5);
            yit.c("WearableDeviceManager", "send pkgInfo is invalid");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (!yiv.e(identityInfo.getPackageName()) || !yiv.e(identityInfo2.getPackageName())) {
            d(p2pSendCallback, 5);
            yit.c("WearableDeviceManager", "send pkgName is invalid");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (device != null && !TextUtils.isEmpty(device.getUuid())) {
            yit.e("WearableDeviceManager", "send enter");
            d(this.i.submit(a(device, messageParcelExtra, identityInfo, identityInfo2, p2pSendCallback)), "send");
        } else {
            d(p2pSendCallback, 5);
            yit.c("WearableDeviceManager", "send pkgName is null");
            throw new IllegalStateException(String.valueOf(5));
        }
    }

    private void d(Future<Integer> future, String str) {
        try {
            int iIntValue = future.get(30000L, TimeUnit.MILLISECONDS).intValue();
            if (iIntValue == 0) {
            } else {
                throw new IllegalStateException(String.valueOf(iIntValue));
            }
        } catch (InterruptedException unused) {
            yit.b("WearableDeviceManager", str + " InterruptedException");
            throw new IllegalStateException(String.valueOf(12));
        } catch (ExecutionException unused2) {
            yit.b("WearableDeviceManager", str + " ExecutionException");
            throw new IllegalStateException(String.valueOf(12));
        } catch (TimeoutException unused3) {
            yit.b("WearableDeviceManager", str + " TimeoutException");
            throw new IllegalStateException(String.valueOf(12));
        }
    }

    private int c(Future<Integer> future, String str) {
        try {
            return future.get(30000L, TimeUnit.MILLISECONDS).intValue();
        } catch (InterruptedException unused) {
            yit.b("WearableDeviceManager", str + "InterruptedException");
            return 12;
        } catch (ExecutionException unused2) {
            yit.b("WearableDeviceManager", str + "ExecutionException");
            return 12;
        } catch (TimeoutException unused3) {
            yit.b("WearableDeviceManager", str + "TimeoutException");
            return 12;
        }
    }

    private Callable<Integer> a(final Device device, final MessageParcelExtra messageParcelExtra, final IdentityInfo identityInfo, final IdentityInfo identityInfo2, final P2pSendCallback p2pSendCallback) {
        final String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + "getSendCallable enter");
        return new Callable<Integer>() { // from class: yjd.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " send mApiAidl is null");
                        yjd.this.d(p2pSendCallback, 12);
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " send send");
                    yjd.this.f53431c.send(device.getUuid(), messageParcelExtra, identityInfo, identityInfo2, p2pSendCallback);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " send RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        };
    }

    private Callable<Integer> a(final Device device, final FileIdentificationParcel fileIdentificationParcel, final IdentityInfo identityInfo, final IdentityInfo identityInfo2, final P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) {
        final String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + "getCancelFileTransferCallable enter");
        return new Callable<Integer>() { // from class: yjd.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " getCancelFileTransferCallable mApiAidl is null");
                        yjd.this.b(p2pCancelFileTransferCallBack, 12, "Internal error");
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " getCancelFileTransferCallable");
                    yjd.this.f53431c.cancelFileTransfer(device, fileIdentificationParcel, identityInfo, identityInfo2, p2pCancelFileTransferCallBack);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " getCancelFileTransferCallable RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        };
    }

    private void a(MessageParcelExtra messageParcelExtra, P2pSendCallback p2pSendCallback) {
        if (messageParcelExtra.getType() == 1) {
            byte[] data = messageParcelExtra.getData();
            if (data == null || data.length == 0) {
                yit.c("WearableDeviceManager", "send message data is valid");
                d(p2pSendCallback, 5);
                throw new IllegalStateException(String.valueOf(5));
            }
            return;
        }
        if (messageParcelExtra.getParcelFileDescriptor() != null) {
            return;
        }
        yit.c("WearableDeviceManager", "send message file is null");
        d(p2pSendCallback, 10);
        throw new IllegalStateException(String.valueOf(10));
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public int subscribeDeviceDataReceiver(final P2pReceiverCallback p2pReceiverCallback) {
        final String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + " subscribeDeviceDataReceiver enter");
        return c(this.i.submit(new Callable<Integer>() { // from class: yjd.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " mApiAidl is null");
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " start subscribeDeviceDataReceiver");
                    yjd.this.f53431c.subscribeDeviceDataReceiver(p2pReceiverCallback);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " subscribeDeviceDataReceiver RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "subscribeDeviceDataReceiver");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public int unsubscribeDeviceDataReceiver() {
        final String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + " unsubscribeDeviceDataReceiver enter");
        return c(this.i.submit(new Callable<Integer>() { // from class: yjd.9
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " mApiAidl is null");
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " start unsubscribeDeviceDataReceiver");
                    yjd.this.f53431c.unsubscribeDeviceDataReceiver();
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " unsubscribeDeviceDataReceiver RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "unsubscribeDeviceDataReceiver");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public int subscribeMonitorListener(final MonitorCallback monitorCallback) {
        final String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + " subscribeMonitorListener enter");
        return c(this.i.submit(new Callable<Integer>() { // from class: yjd.7
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " mApiAidl is null");
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " start subscribeMonitorListener");
                    yjd.this.f53431c.subscribeMonitorReceiver(monitorCallback);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " subscribeMonitorListener RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "subscribeMonitorListener");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public int unsubscribeMonitorListener() {
        final String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + " unsubscribeMonitorListener enter");
        return c(this.i.submit(new Callable<Integer>() { // from class: yjd.10
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " mApiAidl is null");
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " start unsubscribeMonitorListener");
                    yjd.this.f53431c.unsubscribeMonitorReceiver();
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " unsubscribeMonitorListener RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "unsubscribeMonitorListener");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public int switchMonitorStatus(final int i, final String str, final String str2, final SwitchStatusCallback switchStatusCallback) {
        final String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + " switchMonitorStatus enter");
        try {
            return ((Integer) this.i.submit(new Callable<Integer>() { // from class: yjd.6
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Integer call() {
                    try {
                        yjd.this.c(false, string);
                        if (yjd.this.f53431c == null) {
                            yit.b("WearableDeviceManager", string + " mApiAidl is null");
                            return 12;
                        }
                        yit.e("WearableDeviceManager", string + " start switchMonitorStatus");
                        yjd.this.f53431c.switchMonitorStatus(i, str, str2, switchStatusCallback);
                        return 0;
                    } catch (RemoteException unused) {
                        yit.b("WearableDeviceManager", string + " switchMonitorStatus RemoteException");
                        return 12;
                    } catch (IllegalStateException e) {
                        return Integer.valueOf(yio.e(e.getMessage()));
                    }
                }
            }).get(30000L, TimeUnit.MILLISECONDS)).intValue();
        } catch (InterruptedException unused) {
            yit.b("WearableDeviceManager", "switchMonitorStatus InterruptedException");
            return 12;
        } catch (ExecutionException unused2) {
            yit.b("WearableDeviceManager", "switchMonitorStatus ExecutionException");
            return 12;
        } catch (TimeoutException unused3) {
            yit.b("WearableDeviceManager", "switchMonitorStatus TimeoutException");
            return 12;
        }
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void queryMonitorData(final Device device, final String str, final QueryDataCallback queryDataCallback) {
        final String string = UUID.randomUUID().toString();
        if (queryDataCallback == null) {
            yit.c("WearableDeviceManager", string + " queryMonitorData monitorQueryCallback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (device == null || TextUtils.isEmpty(str)) {
            try {
                queryDataCallback.onDataReceived(5, null);
                yit.c("WearableDeviceManager", string + " queryMonitorData device or monitorItemType is valid");
            } catch (RemoteException unused) {
                yit.b("WearableDeviceManager", string + " queryMonitorData RemoteException");
            }
            throw new IllegalStateException(String.valueOf(5));
        }
        yit.e("WearableDeviceManager", string + " queryMonitorData enter");
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.8
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " queryMonitorData mApiAidl is null");
                        queryDataCallback.onDataReceived(5, null);
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " queryMonitorData send");
                    yjd.this.f53431c.query(device, str, queryDataCallback);
                    return 0;
                } catch (RemoteException unused2) {
                    yit.b("WearableDeviceManager", string + " queryMonitorData RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "queryMonitorData");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void notifyData(final Device device, final NotificationParcel notificationParcel, final NotifySendCallback notifySendCallback) {
        final String string = UUID.randomUUID().toString();
        if (notifySendCallback == null || notificationParcel == null) {
            yit.c("WearableDeviceManager", string + " notifySendCallback or notificationParcel is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (device == null || TextUtils.isEmpty(device.getUuid())) {
            try {
                notifySendCallback.onError(notificationParcel, 5);
                yit.c("WearableDeviceManager", string + " notifyData device or notificationParcel is valid");
            } catch (RemoteException unused) {
                yit.b("WearableDeviceManager", string + " notifyData RemoteException");
            }
            throw new IllegalStateException(String.valueOf(5));
        }
        yit.e("WearableDeviceManager", string + " notify enter");
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.12
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " notify mApiAidl is null");
                        notifySendCallback.onError(notificationParcel, 5);
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " notify send");
                    yjd.this.f53431c.notify(device.getUuid(), notificationParcel, notifySendCallback);
                    return 0;
                } catch (RemoteException unused2) {
                    yit.b("WearableDeviceManager", string + " notify RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "notify");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void setP2pInnerApi(P2pInnerApi p2pInnerApi) {
        this.f53429a = p2pInnerApi;
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public boolean isP2pReceiverExist(String str, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
        P2pInnerApi p2pInnerApi = this.f53429a;
        if (p2pInnerApi == null) {
            yit.b("WearableDeviceManager", "isP2pReceiverExist mReceiverCallbackManager is null");
            return false;
        }
        return p2pInnerApi.isP2pReceiverExist(str, identityInfo, identityInfo2);
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void getDeviceAppVersionCode(final Device device, final String str, final String str2, final P2pPingCallback p2pPingCallback) {
        final String string = UUID.randomUUID().toString();
        if (device == null || !yiv.e(str) || !yiv.e(str2)) {
            yit.c("WearableDeviceManager", string + " getDeviceAppVersionCode device or pkgName is valid");
            throw new IllegalStateException(String.valueOf(5));
        }
        if (p2pPingCallback == null) {
            yit.c("WearableDeviceManager", string + " getDeviceAppVersionCode versionCodeCallback is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.13
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    yjd.this.c(false, string);
                    if (yjd.this.f53431c == null) {
                        yit.b("WearableDeviceManager", string + " getDeviceAppVersionCode mApiAidl is null");
                        return 12;
                    }
                    yit.e("WearableDeviceManager", string + " getDeviceAppVersionCode send");
                    yjd.this.f53431c.getDeviceAppVersionCode(device, str, str2, p2pPingCallback);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " getDeviceAppVersionCode RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    yit.b("WearableDeviceManager", string + " getDeviceAppVersionCode IllegalStateException");
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "getDeviceAppVersionCode");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public int cancelFileTransfer(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) {
        if (!c(device, fileIdentificationParcel, identityInfo, identityInfo2, p2pCancelFileTransferCallBack)) {
            throw new IllegalStateException(String.valueOf(5));
        }
        yit.e("WearableDeviceManager", "cancelFileTransfer enter");
        return c(this.i.submit(a(device, fileIdentificationParcel, identityInfo, identityInfo2, p2pCancelFileTransferCallBack)), "cancelFileTransfer");
    }

    private boolean c(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) {
        if (p2pCancelFileTransferCallBack == null) {
            yit.c("WearableDeviceManager", "checkCancelFileTransferParams p2pCancelFileTransferCallBack is null");
            return false;
        }
        if (fileIdentificationParcel == null || TextUtils.isEmpty(fileIdentificationParcel.getFileName())) {
            yit.c("WearableDeviceManager", "checkCancelFileTransferParams fileIdentification is null or fileName is empty");
            b(p2pCancelFileTransferCallBack, 5, "Invalid argument");
            return false;
        }
        if (device == null || TextUtils.isEmpty(device.getUuid())) {
            yit.c("WearableDeviceManager", "checkCancelFileTransferParams device is null or device uuid is empty");
            b(p2pCancelFileTransferCallBack, 5, "Invalid argument");
            return false;
        }
        if (identityInfo == null || identityInfo2 == null) {
            b(p2pCancelFileTransferCallBack, 5, "Invalid argument");
            yit.c("WearableDeviceManager", "checkCancelFileTransferParams pkgInfo is invalid");
            return false;
        }
        if (yiv.e(identityInfo.getPackageName()) && yiv.e(identityInfo2.getPackageName())) {
            return true;
        }
        b(p2pCancelFileTransferCallBack, 5, "Invalid argument");
        yit.c("WearableDeviceManager", "checkCancelFileTransferParams pkgName is invalid");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(P2pSendCallback p2pSendCallback, int i) {
        try {
            p2pSendCallback.onSendResult(i);
            p2pSendCallback.onSendProgress(0L);
        } catch (Exception unused) {
            yit.b("WearableDeviceManager", "sendErrorResult Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack, int i, String str) {
        try {
            p2pCancelFileTransferCallBack.onCancelFileTransferResult(i, str);
        } catch (Exception unused) {
            yit.b("WearableDeviceManager", "stopSendFileErrorResult Exception");
        }
    }

    public static boolean c() {
        try {
            Class<?> cls = Class.forName("com.huawei.wearengine.utills.WearEngineReflectUtil");
            Object objInvoke = cls.getDeclaredMethod("getHasDeviceDbInfo", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException unused) {
            yit.c("WearableDeviceManager", "hasDeviceConnectedInfo ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            yit.c("WearableDeviceManager", "hasDeviceConnectedInfo IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            yit.c("WearableDeviceManager", "hasDeviceConnectedInfo NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            yit.c("WearableDeviceManager", "hasDeviceConnectedInfo InvocationTargetException");
        }
        return false;
    }

    private boolean b() {
        try {
            Class<?> cls = Class.forName("com.huawei.wearengine.utills.WearEngineReflectUtil");
            Object objInvoke = cls.getDeclaredMethod("getHasWearableDeviceDbInfo", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (ClassNotFoundException unused) {
            yit.c("WearableDeviceManager", "hasWearableDeviceInfo ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            yit.c("WearableDeviceManager", "hasWearableDeviceInfo IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            yit.c("WearableDeviceManager", "hasWearableDeviceInfo NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            yit.c("WearableDeviceManager", "hasWearableDeviceInfo InvocationTargetException");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        yjg.e().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IWearHwUpdateServiceAIDL c(String str) {
        IBinder iBinderC = this.d.c();
        if (iBinderC == null) {
            if (!b()) {
                yit.b("WearableDeviceManager", str + " syncCheckUpdateServiceStatus no bond device");
                throw new IllegalStateException(String.valueOf(16));
            }
            iBinderC = this.d.e();
        }
        if (iBinderC == null) {
            yit.b("WearableDeviceManager", str + " getWearHwUpdateService wearHwUpdateServiceAidl is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        return IWearHwUpdateServiceAIDL.Stub.asInterface(iBinderC);
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void getConnectedDevices(IDeviceListCallback iDeviceListCallback) {
        String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + " getConnectedDevices enter");
        yiq.c(iDeviceListCallback, string + " getConnectedDevices deviceListCallback is null");
        d(this.i.submit(c(string, iDeviceListCallback)), "getConnectedDevices");
    }

    private Callable<Integer> c(final String str, final IDeviceListCallback iDeviceListCallback) {
        return new Callable<Integer>() { // from class: yjd.15
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    IWearHwUpdateServiceAIDL iWearHwUpdateServiceAIDLC = yjd.this.c(str);
                    yit.e("WearableDeviceManager", str + " getConnectedDevices send");
                    iWearHwUpdateServiceAIDLC.getConnectedDevices(iDeviceListCallback);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", str + " getConnectedDevices RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    yit.b("WearableDeviceManager", str + " getConnectedDevices IllegalStateException");
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        };
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void getDeviceNewVersion(Device device, ICheckCallback iCheckCallback) {
        String string = UUID.randomUUID().toString();
        yit.e("WearableDeviceManager", string + " getDeviceNewVersion enter");
        yiq.c(device, string + " getDeviceNewVersion device is null");
        yiq.c(iCheckCallback, string + " getDeviceNewVersion checkCallback is null");
        d(this.i.submit(a(string, device, iCheckCallback)), "getDeviceNewVersion");
    }

    private Callable<Integer> a(final String str, final Device device, final ICheckCallback iCheckCallback) {
        return new Callable<Integer>() { // from class: yjd.14
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    IWearHwUpdateServiceAIDL iWearHwUpdateServiceAIDLC = yjd.this.c(str);
                    yit.e("WearableDeviceManager", str + " getDeviceNewVersion send");
                    iWearHwUpdateServiceAIDLC.getDeviceNewVersion(device.getUuid(), iCheckCallback);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", str + " getDeviceNewVersion RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    yit.b("WearableDeviceManager", str + " getDeviceNewVersion IllegalStateException");
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        };
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void doUpgrade(final Device device, final String str, final IUpgradeCallBack iUpgradeCallBack) {
        final String string = UUID.randomUUID().toString();
        yiq.c(device, string + " doUpgrade device is null");
        if (TextUtils.isEmpty(str)) {
            yit.b("WearableDeviceManager", string + " doUpgrade command is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        yiq.c(iUpgradeCallBack, string + " doUpgrade upgradeCallBack is null");
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.17
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    IWearHwUpdateServiceAIDL iWearHwUpdateServiceAIDLC = yjd.this.c(string);
                    yit.e("WearableDeviceManager", string + " doUpgrade send");
                    iWearHwUpdateServiceAIDLC.doUpgrade(device.getUuid(), str, iUpgradeCallBack);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " doUpgrade RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    yit.b("WearableDeviceManager", string + " doUpgrade IllegalStateException");
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "doUpgrade");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void getUpgradeStatus(final Device device, final IUpgradeStatusCallBack iUpgradeStatusCallBack) {
        final String string = UUID.randomUUID().toString();
        yiq.c(device, string + " getUpgradeStatus device is null");
        yiq.c(iUpgradeStatusCallBack, string + " getUpgradeStatus upgradeStatusCallBack is null");
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.16
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    IWearHwUpdateServiceAIDL iWearHwUpdateServiceAIDLC = yjd.this.c(string);
                    yit.e("WearableDeviceManager", string + " getUpgradeStatus send");
                    iWearHwUpdateServiceAIDLC.getUpgradeStatus(device.getUuid(), iUpgradeStatusCallBack);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " getUpgradeStatus RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    yit.b("WearableDeviceManager", string + " getUpgradeStatus IllegalStateException");
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "getUpgradeStatus");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void registerUpgradeListener(final Device device, final IUpgradeStatusCallBack iUpgradeStatusCallBack) {
        final String string = UUID.randomUUID().toString();
        yiq.c(device, string + " registerUpgradeListener device is null");
        yiq.c(iUpgradeStatusCallBack, string + " registerUpgradeListener upgradeStatusCallBack is null");
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.18
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    IWearHwUpdateServiceAIDL iWearHwUpdateServiceAIDLC = yjd.this.c(string);
                    yit.e("WearableDeviceManager", string + " registerUpgradeListener send");
                    iWearHwUpdateServiceAIDLC.registerUpgradeListener(device.getUuid(), iUpgradeStatusCallBack);
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " registerUpgradeListener RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    yit.b("WearableDeviceManager", string + " registerUpgradeListener IllegalStateException");
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "registerUpgradeListener");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void unRegisterUpgradeListener(final Device device) {
        final String string = UUID.randomUUID().toString();
        yiq.c(device, string + " unRegisterUpgradeListener device is null");
        d(this.i.submit(new Callable<Integer>() { // from class: yjd.20
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                try {
                    IWearHwUpdateServiceAIDL iWearHwUpdateServiceAIDLC = yjd.this.c(string);
                    yit.e("WearableDeviceManager", string + " unRegisterUpgradeListener send");
                    iWearHwUpdateServiceAIDLC.unRegisterUpgradeListener(device.getUuid());
                    return 0;
                } catch (RemoteException unused) {
                    yit.b("WearableDeviceManager", string + " unRegisterUpgradeListener RemoteException");
                    return 12;
                } catch (IllegalStateException e) {
                    yit.b("WearableDeviceManager", string + " unRegisterUpgradeListener IllegalStateException");
                    return Integer.valueOf(yio.e(e.getMessage()));
                }
            }
        }), "unRegisterUpgradeListener");
    }

    @Override // com.huawei.wearengine.core.device.VirtualDevice
    public void disconnectOtaService() {
        yit.e("WearableDeviceManager", "disconnectOtaService enter");
        this.d.b();
    }
}
