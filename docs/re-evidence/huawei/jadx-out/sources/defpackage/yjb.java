package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.hwotamanager.ICheckCallback;
import com.huawei.hwotamanager.IDeviceListCallback;
import com.huawei.hwotamanager.IUpgradeCallBack;
import com.huawei.hwotamanager.IUpgradeStatusCallBack;
import com.huawei.operation.ble.BleConstants;
import com.huawei.wearengine.connect.ServiceConnectCallback;
import com.huawei.wearengine.connect.ServiceConnectCallbackManager;
import com.huawei.wearengine.core.device.VirtualDevice;
import com.huawei.wearengine.core.device.VirtualDeviceCaller;
import com.huawei.wearengine.device.Device;
import com.huawei.wearengine.device.FoundListener;
import com.huawei.wearengine.device.GetAttributeListener;
import com.huawei.wearengine.monitor.MonitorCallback;
import com.huawei.wearengine.monitor.MonitorData;
import com.huawei.wearengine.monitor.MonitorItem;
import com.huawei.wearengine.monitor.MonitorMessage;
import com.huawei.wearengine.monitor.QueryDataCallback;
import com.huawei.wearengine.monitor.SwitchStatusCallback;
import com.huawei.wearengine.notify.NotificationParcel;
import com.huawei.wearengine.notify.NotifySendCallback;
import com.huawei.wearengine.ota.CheckBinderCallback;
import com.huawei.wearengine.ota.DeviceListBinderCallback;
import com.huawei.wearengine.ota.UpgradeBinderCallBack;
import com.huawei.wearengine.ota.UpgradeStatusBinderCallBack;
import com.huawei.wearengine.p2p.FileIdentificationParcel;
import com.huawei.wearengine.p2p.IdentityInfo;
import com.huawei.wearengine.p2p.MessageParcel;
import com.huawei.wearengine.p2p.MessageParcelExtra;
import com.huawei.wearengine.p2p.P2pCancelFileTransferCallBack;
import com.huawei.wearengine.p2p.P2pInnerApi;
import com.huawei.wearengine.p2p.P2pPingCallback;
import com.huawei.wearengine.p2p.P2pReceiverCallback;
import com.huawei.wearengine.p2p.P2pSendCallback;
import com.huawei.wearengine.p2p.ReceiveResultCallback;
import defpackage.yit;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class yjb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f53411a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private yiw f53413c;
    private yiy d;
    private P2pInnerApi e;
    private ThreadFactory f;
    private yiz g;
    private final ymc j;
    private P2pReceiverCallback h = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MonitorCallback f53412b = null;

    public yjb(yiw yiwVar) {
        ymc ymcVar = new ymc("com.huawei.health", "com.huawei.wearengine.service.WearEngineService");
        this.j = ymcVar;
        this.e = new P2pInnerApi() { // from class: yjb.1
            @Override // com.huawei.wearengine.p2p.P2pInnerApi
            public boolean isP2pReceiverExist(String str, IdentityInfo identityInfo, IdentityInfo identityInfo2) {
                return yjb.this.g.d(str, identityInfo, identityInfo2);
            }
        };
        this.f = new ThreadFactory() { // from class: yjb.7
            private final AtomicInteger d = new AtomicInteger();

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "common-device-manager-thread-" + this.d.getAndIncrement());
            }
        };
        this.f53411a = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), this.f);
        this.g = new yiz();
        this.d = new yiy();
        this.f53413c = yiwVar;
        ymcVar.e("com.huawei.wearengine.action.REGISTER_CALLBACK_MANAGER");
    }

    public List<Device> a() throws RemoteException {
        return c("getBondedDevices", new VirtualDeviceCaller() { // from class: yjb.6
            @Override // com.huawei.wearengine.core.device.VirtualDeviceCaller
            public void onCall(VirtualDevice virtualDevice, FoundListener foundListener, String str, yiu yiuVar) {
                if (virtualDevice == null) {
                    yit.b("CommonDeviceManager", "getBondedDevices virtualDevice is null");
                    return;
                }
                if (foundListener == null) {
                    yit.b("CommonDeviceManager", "getBondedDevices listener is null");
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    yit.b("CommonDeviceManager", "callingPackageName listener is null or empty");
                    return;
                }
                if (yiuVar == null) {
                    yit.b("CommonDeviceManager", "getBondedDevices asynToSyncListener is null");
                    return;
                }
                try {
                    virtualDevice.getDeviceList(foundListener, str);
                } catch (IllegalStateException unused) {
                    yiuVar.onFinish();
                    yit.b("CommonDeviceManager", "getBondedDevices IllegalStateException");
                }
            }
        });
    }

    public List<Device> b() throws RemoteException {
        return c("getAllBondedDevices", new VirtualDeviceCaller() { // from class: yjb.9
            @Override // com.huawei.wearengine.core.device.VirtualDeviceCaller
            public void onCall(VirtualDevice virtualDevice, FoundListener foundListener, String str, yiu yiuVar) {
                if (virtualDevice == null) {
                    yit.b("CommonDeviceManager", "getAllBondedDevices virtualDevice is null");
                    return;
                }
                if (foundListener == null) {
                    yit.b("CommonDeviceManager", "getAllBondedDevices listener is null");
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    yit.b("CommonDeviceManager", "getAllBondedDevices callingPackageName is null");
                    return;
                }
                if (yiuVar == null) {
                    yit.b("CommonDeviceManager", "getAllBondedDevices asynToSyncListener is null");
                    return;
                }
                try {
                    virtualDevice.getAllDeviceList(foundListener, str);
                } catch (IllegalStateException unused) {
                    yiuVar.onFinish();
                    yit.b("CommonDeviceManager", "getAllBondedDevices IllegalStateException");
                }
            }
        });
    }

    public List<Device> e() {
        return c("getCommonDevice", new VirtualDeviceCaller() { // from class: yjb.11
            @Override // com.huawei.wearengine.core.device.VirtualDeviceCaller
            public void onCall(VirtualDevice virtualDevice, FoundListener foundListener, String str, yiu yiuVar) {
                if (virtualDevice == null || foundListener == null || yiuVar == null) {
                    yit.b("CommonDeviceManager", "getCommonDevice device or listener or asynToSyncListener is null");
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    yit.b("CommonDeviceManager", "getCommonDevice callingPackageName is null");
                    return;
                }
                try {
                    virtualDevice.getCommonDevice(foundListener, str);
                } catch (IllegalStateException unused) {
                    yiuVar.onFinish();
                    yit.b("CommonDeviceManager", "getCommonDevice IllegalStateException");
                }
            }
        });
    }

    private List<Device> c(String str, VirtualDeviceCaller virtualDeviceCaller) {
        final ArrayList arrayList = new ArrayList();
        if (virtualDeviceCaller == null) {
            yit.b("CommonDeviceManager", str + " caller is null");
            return arrayList;
        }
        VirtualDevice[] virtualDeviceArrA = yix.b().a();
        final yiu yiuVar = new yiu(virtualDeviceArrA.length);
        FoundListener.Stub stub = new FoundListener.Stub() { // from class: com.huawei.wearengine.core.device.CommonDeviceManager$6
            @Override // com.huawei.wearengine.device.FoundListener
            public void onDeviceFound(List<Device> list) {
                if (list != null) {
                    arrayList.addAll(list);
                }
                yiuVar.onFinish();
            }
        };
        String strB = yln.b(Binder.getCallingUid(), yiv.a(), this.f53413c.getApplicationIdByPid(Integer.valueOf(Binder.getCallingPid())));
        for (VirtualDevice virtualDevice : virtualDeviceArrA) {
            if (virtualDevice == null) {
                yit.b("CommonDeviceManager", str + "virtualDevice is null");
            } else {
                try {
                    virtualDeviceCaller.onCall(virtualDevice, stub, strB, yiuVar);
                } catch (IllegalStateException unused) {
                    yiuVar.onFinish();
                    yit.b("CommonDeviceManager", str + " IllegalStateException");
                }
            }
        }
        try {
            if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
                yit.b("CommonDeviceManager", str + " asyncToSyncListener timeout");
            }
        } catch (InterruptedException unused2) {
            yit.b("CommonDeviceManager", "asynToSyncListener await error");
        }
        return arrayList;
    }

    public boolean h() throws RemoteException {
        List<Device> listA = a();
        if (listA.isEmpty()) {
            return false;
        }
        Iterator<Device> it = listA.iterator();
        while (it.hasNext()) {
            if (it.next().isConnected()) {
                return true;
            }
        }
        return false;
    }

    public String d(Device device) throws RemoteException {
        yiq.c(device, "device must not be null!");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        final String[] strArr = new String[1];
        final yiu yiuVar = new yiu(1);
        GetAttributeListener.Stub stub = new GetAttributeListener.Stub() { // from class: com.huawei.wearengine.core.device.CommonDeviceManager$7
            @Override // com.huawei.wearengine.device.GetAttributeListener
            public void onGetString(String str) throws RemoteException {
                strArr[0] = str;
                yiuVar.onFinish();
            }
        };
        if (virtualDeviceE != null) {
            virtualDeviceE.getHiLinkDeviceId(device, stub);
            try {
                if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
                    yit.b("CommonDeviceManager", "getHiLinkDeviceId asyncToSyncListener timeout");
                    throw new IllegalStateException(String.valueOf(12));
                }
                return strArr[0];
            } catch (InterruptedException unused) {
                yit.b("CommonDeviceManager", "getHiLinkDeviceId asynToSyncListener await error");
                throw new IllegalStateException(String.valueOf(12));
            }
        }
        throw new IllegalStateException(String.valueOf(12));
    }

    public int a(Device device, int i) throws RemoteException {
        yiq.c(device, "device must not be null!");
        final int[] iArr = {1};
        final yiu yiuVar = new yiu(1);
        GetAttributeListener.Stub stub = new GetAttributeListener.Stub() { // from class: com.huawei.wearengine.core.device.CommonDeviceManager$8
            @Override // com.huawei.wearengine.device.GetAttributeListener
            public void onGetString(String str) throws RemoteException {
                try {
                    iArr[0] = Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    yit.b("CommonDeviceManager", "queryDeviceCapability callback NumberFormatException");
                }
                yiuVar.onFinish();
            }
        };
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE != null) {
            virtualDeviceE.queryDeviceCapability(device, i, stub);
            try {
                if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
                    yit.b("CommonDeviceManager", "queryDeviceCapability asyncToSyncListener timeout");
                    throw new IllegalStateException(String.valueOf(12));
                }
                return iArr[0];
            } catch (InterruptedException unused) {
                yit.b("CommonDeviceManager", "queryDeviceCapability asynToSyncListener await error");
                throw new IllegalStateException(String.valueOf(12));
            }
        }
        throw new IllegalStateException(String.valueOf(12));
    }

    public String c(Device device) {
        yiq.c(device, "device must not be null!");
        if (TextUtils.isEmpty(device.getUuid())) {
            yit.c("CommonDeviceManager", "getDeviceSn queryDevice.Uuid is empty");
            return "";
        }
        List<Device> listE = e();
        if (listE.isEmpty()) {
            yit.c("CommonDeviceManager", "getDeviceSn deviceList is empty");
            return "";
        }
        String uuid = device.getUuid();
        for (Device device2 : listE) {
            if (device2 == null || !uuid.equals(device2.getUuid())) {
                yit.c("CommonDeviceManager", "getDeviceSn device is null or uuid not equal");
            } else {
                String strC = yja.c(device2);
                if (TextUtils.isEmpty(strC)) {
                    yit.c("CommonDeviceManager", "getDeviceSn deviceJsonString is null");
                    break;
                }
                try {
                    return new JSONObject(new yja(strC).b()).getString(HealthEngineRequestManager.PARAMS_DEVICE_SN);
                } catch (JSONException unused) {
                    yit.b("CommonDeviceManager", "getDeviceSn has an JSONException");
                    break;
                }
            }
        }
        return "";
    }

    public boolean b(String str) throws RemoteException {
        List<Device> listE = e();
        if (listE.isEmpty()) {
            return false;
        }
        for (Device device : listE) {
            if (device.getUuid().equals(str) && device.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public void a(Device device, String str, String str2, P2pPingCallback p2pPingCallback) throws RemoteException {
        yiq.c(device, "device must not be null!");
        yiq.c(str, "srcPkgName must not be null!");
        yiq.c(str2, "destPkgName must not be null!");
        yiq.c(p2pPingCallback, "pingCallback must not be null!");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE != null) {
            virtualDeviceE.ping(device, str, str2, p2pPingCallback);
            return;
        }
        throw new IllegalStateException(String.valueOf(12));
    }

    public void d(Device device, MessageParcelExtra messageParcelExtra, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pSendCallback p2pSendCallback) throws RemoteException {
        yiq.c(device, "device must not be null!");
        yiq.c(messageParcelExtra, "message must not be null!");
        yiq.c(identityInfo, "srcInfo must not be null!");
        yiq.c(identityInfo2, "destInfo must not be null!");
        yiq.c(p2pSendCallback, "sendCallback must not be null!");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE != null) {
            virtualDeviceE.send(device, messageParcelExtra, identityInfo, identityInfo2, p2pSendCallback);
            return;
        }
        throw new IllegalStateException(String.valueOf(12));
    }

    public int d(Device device, IdentityInfo identityInfo, IdentityInfo identityInfo2, ykh ykhVar) {
        yiq.c(identityInfo, "srcInfo must not be null!");
        yiq.c(identityInfo2, "destInfo must not be null!");
        if (!d(device, identityInfo.getPackageName(), identityInfo2.getPackageName(), ykhVar)) {
            yit.b("CommonDeviceManager", "registerReceiver parameters is invalid");
            return 5;
        }
        a(identityInfo, identityInfo2, device, 0);
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "registerReceiver deviceAdapter is null");
            return 12;
        }
        int iB = this.g.b(device.getUuid(), identityInfo, identityInfo2, ykhVar);
        if (iB != 0) {
            return iB;
        }
        if (this.h == null) {
            yit.e("CommonDeviceManager", "new p2pReceiverCallback");
            this.h = new P2pReceiverCallback.Stub() { // from class: com.huawei.wearengine.core.device.CommonDeviceManager$9
                @Override // com.huawei.wearengine.p2p.P2pReceiverCallback
                public void onDataReceived(Device device2, MessageParcel messageParcel, IdentityInfo identityInfo3, IdentityInfo identityInfo4, ReceiveResultCallback receiveResultCallback) throws RemoteException {
                    this.this$0.d(device2, messageParcel, identityInfo3, identityInfo4, receiveResultCallback);
                }
            };
        }
        return virtualDeviceE.subscribeDeviceDataReceiver(this.h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Device device, MessageParcel messageParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, ReceiveResultCallback receiveResultCallback) {
        yit.e("CommonDeviceManager", "onDataReceived enter");
        if (device == null || messageParcel == null || identityInfo == null || identityInfo2 == null) {
            yit.b("CommonDeviceManager", "onDataReceived para is null");
            return;
        }
        a(identityInfo2, identityInfo, device, 1);
        try {
            byte[] data = messageParcel.getData();
            if (data != null) {
                yit.a("CommonDeviceManager", "onDataReceived: data=".concat(new String(data, "UTF-8")));
            }
        } catch (UnsupportedEncodingException unused) {
            yit.b("CommonDeviceManager", "UnsupportedEncodingException");
        }
        yit.e("CommonDeviceManager", "receive file:" + messageParcel.getFileName());
        this.g.c(device.getUuid(), messageParcel, identityInfo, identityInfo2, receiveResultCallback);
    }

    private boolean d(Device device, String str, String str2, ykh ykhVar) {
        return (device == null || ykhVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !yiv.e(str) || !yiv.e(str2)) ? false : true;
    }

    public int e(ykh ykhVar) {
        if (ykhVar == null) {
            yit.b("CommonDeviceManager", "unregisterReceiver receiverCallbackProxy is null");
            return 5;
        }
        this.g.b(ykhVar);
        return m();
    }

    public yiz g() {
        return this.g;
    }

    private int m() {
        if (this.g.e() != 0) {
            return 0;
        }
        int iK = k();
        this.h = null;
        return iK;
    }

    private int k() {
        int iUnsubscribeDeviceDataReceiver;
        int i = 0;
        for (VirtualDevice virtualDevice : yix.b().a()) {
            if (virtualDevice != null && (iUnsubscribeDeviceDataReceiver = virtualDevice.unsubscribeDeviceDataReceiver()) != 0) {
                i = iUnsubscribeDeviceDataReceiver;
            }
        }
        yit.e("CommonDeviceManager", "unSubscribeDeviceDataReciverInter result: " + i);
        return i;
    }

    public void c() {
        yit.e("CommonDeviceManager", "cleanDiedCallbackByBinderDied enter");
        this.g.b();
        m();
    }

    public int d(Device device, List<MonitorItem> list, yjn yjnVar) {
        if (!e(device, list, yjnVar)) {
            yit.b("CommonDeviceManager", "registerMonitor parameters is invalid");
            return 5;
        }
        yit.a("CommonDeviceManager", "registerMonitor monitorItemType is:" + list + ", device uuid is:" + device.getUuid());
        return a(device, list, yjnVar);
    }

    private int a(Device device, List<MonitorItem> list, yjn yjnVar) {
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "registerMonitor deviceAdapter is null");
            return 12;
        }
        ArrayList arrayList = new ArrayList();
        int iC = c(device, list, virtualDeviceE, arrayList);
        if (iC != 0) {
            return iC;
        }
        int iE = this.d.e(device.getUuid(), list, yjnVar);
        if (iE != 0) {
            yit.b("CommonDeviceManager", "registerMonitor handleMonitorCallbackProxy failed, result: " + iE);
            b(virtualDeviceE, device.getUuid(), arrayList);
            return iE;
        }
        if (this.f53412b == null) {
            yit.e("CommonDeviceManager", "new monitorCallback");
            this.f53412b = l();
        }
        int iSubscribeMonitorListener = virtualDeviceE.subscribeMonitorListener(this.f53412b);
        if (iSubscribeMonitorListener != 0) {
            yit.b("CommonDeviceManager", "registerMonitor subscribeMonitorListener failed, result: " + iSubscribeMonitorListener);
            this.d.d(yjnVar);
            b(virtualDeviceE, device.getUuid(), arrayList);
        }
        return iSubscribeMonitorListener;
    }

    private MonitorCallback l() {
        return new MonitorCallback.Stub() { // from class: com.huawei.wearengine.core.device.CommonDeviceManager$10
            @Override // com.huawei.wearengine.monitor.MonitorCallback
            public void onChanged(int i, MonitorMessage monitorMessage) throws RemoteException {
                yit.e("CommonDeviceManager", "MonitorCallback.onChanged errorCode is:" + i);
                yit.a("CommonDeviceManager", "onDataReceived: data=" + monitorMessage);
                this.this$0.d.c(i, monitorMessage);
                if (this.this$0.e(i, monitorMessage)) {
                    this.this$0.d(monitorMessage);
                }
            }
        };
    }

    private int c(Device device, List<MonitorItem> list, VirtualDevice virtualDevice, List<String> list2) {
        for (MonitorItem monitorItem : list) {
            if (!this.d.c(monitorItem.getName())) {
                int iC = c(virtualDevice, 1, device.getUuid(), monitorItem.getName());
                if (iC != 0) {
                    yit.b("CommonDeviceManager", "registerMonitor open switch fail");
                    yit.a("CommonDeviceManager", "device id: " + device.getUuid());
                    b(virtualDevice, device.getUuid(), list2);
                    return iC;
                }
                list2.add(monitorItem.getName());
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i, MonitorMessage monitorMessage) {
        return monitorMessage != null && !TextUtils.isEmpty(monitorMessage.getMonitorItemType()) && monitorMessage.getMonitorItemType().equals(MonitorItem.MONITOR_ITEM_CONNECTION.getName()) && monitorMessage.getIntData() == 2 && i == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final MonitorMessage monitorMessage) {
        if (monitorMessage == null) {
            return;
        }
        this.f53411a.execute(new Runnable() { // from class: yjb.4
            @Override // java.lang.Runnable
            public void run() {
                String deviceId = monitorMessage.getDeviceId();
                Set<String> setE = yjb.this.d.e(deviceId);
                if (setE.size() == 0) {
                    yit.a("CommonDeviceManager", "reopenSwitchStatus monitorItemTypeSet is empty");
                    return;
                }
                setE.remove(MonitorItem.MONITOR_ITEM_CONNECTION.getName());
                setE.remove(MonitorItem.MONITOR_ITEM_POWER_MODE.getName());
                if (setE.size() == 0) {
                    yit.a("CommonDeviceManager", "reopenSwitchStatus this device not other monitor type except connect");
                    return;
                }
                Device device = new Device();
                device.setProductType(monitorMessage.getProductType());
                device.setUuid(deviceId);
                VirtualDevice virtualDeviceE = yix.b().e(device);
                if (virtualDeviceE == null) {
                    yit.b("CommonDeviceManager", "reopenSwitchStatus deviceAdapter is null");
                    return;
                }
                for (String str : setE) {
                    yit.e("CommonDeviceManager", "reopenSwitchStatus " + str + " result:" + yjb.this.c(virtualDeviceE, 1, deviceId, str));
                }
            }
        });
    }

    private void b(VirtualDevice virtualDevice, String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            c(virtualDevice, 2, str, it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c(VirtualDevice virtualDevice, int i, String str, String str2) {
        yit.e("CommonDeviceManager", "switchMonitorStatus monitorItem:" + str2 + ", switchStatus:" + i);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            yit.b("CommonDeviceManager", "switchMonitorStatus parameters is invalid");
            return 5;
        }
        if (this.d.c(str2)) {
            yit.e("CommonDeviceManager", "switchMonitorStatus monitorItem is defaultOpenStatus, return");
            return 0;
        }
        final int[] iArr = {12};
        final yiu yiuVar = new yiu(1);
        int iSwitchMonitorStatus = virtualDevice.switchMonitorStatus(i, str, str2, new SwitchStatusCallback.Stub() { // from class: com.huawei.wearengine.core.device.CommonDeviceManager$12
            @Override // com.huawei.wearengine.monitor.SwitchStatusCallback
            public void onResult(int i2) {
                iArr[0] = i2;
                yiuVar.onFinish();
            }
        });
        if (iSwitchMonitorStatus != 0) {
            yit.b("CommonDeviceManager", "deviceAdapter switchMonitorStatus failed, result: " + iSwitchMonitorStatus);
            return iSwitchMonitorStatus;
        }
        try {
            if (!yiuVar.a(5000L, TimeUnit.MILLISECONDS)) {
                yit.b("CommonDeviceManager", "switchMonitorStatus asyncToSyncListener timeout");
                return 12;
            }
            return iArr[0];
        } catch (InterruptedException unused) {
            yit.b("CommonDeviceManager", "asynToSyncListener await error");
            return 12;
        }
    }

    private boolean e(Device device, List<MonitorItem> list, yjn yjnVar) {
        if (device == null || TextUtils.isEmpty(device.getUuid()) || yjnVar == null || list == null || list.size() == 0) {
            return false;
        }
        for (MonitorItem monitorItem : list) {
            if (monitorItem == null || TextUtils.isEmpty(monitorItem.getName())) {
                return false;
            }
        }
        return true;
    }

    public int b(yjn yjnVar) {
        yit.e("CommonDeviceManager", "enter unregisterMonitor");
        if (yjnVar == null) {
            yit.b("CommonDeviceManager", "unregisterMonitor monitorCallbackProxy is null");
            return 5;
        }
        Map<String, List<String>> mapC = this.d.c(yjnVar);
        VirtualDevice virtualDeviceE = yix.b().e(yjnVar.b());
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "deviceAdapter is null");
            return 12;
        }
        for (Map.Entry<String, List<String>> entry : mapC.entrySet()) {
            int iD = d(virtualDeviceE, entry.getKey(), entry.getValue());
            if (iD != 0) {
                yit.e("CommonDeviceManager", "unregisterMonitor closeMonitorStatusByUnregister result: " + iD);
            }
        }
        this.d.d(yjnVar);
        yit.e("CommonDeviceManager", "unregisterMonitor removeMonitorCallback result: " + o());
        return 0;
    }

    private int d(VirtualDevice virtualDevice, String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            int iC = c(virtualDevice, 2, str, it.next());
            if (iC != 0) {
                return iC;
            }
        }
        return 0;
    }

    public yiy f() {
        return this.d;
    }

    private int o() {
        int iUnsubscribeMonitorListener;
        if (this.d.c() != 0) {
            return 0;
        }
        int i = 0;
        for (VirtualDevice virtualDevice : yix.b().a()) {
            if (virtualDevice != null && (iUnsubscribeMonitorListener = virtualDevice.unsubscribeMonitorListener()) != 0) {
                i = iUnsubscribeMonitorListener;
            }
        }
        this.f53412b = null;
        return i;
    }

    public void i() {
        yit.e("CommonDeviceManager", "unregisterMonitor enter");
        this.d.e();
        o();
    }

    public void e(String str) {
        yit.e("CommonDeviceManager", "clearDiedMonitorByClientName enter");
        this.d.b(str);
        o();
    }

    public void c(String str) {
        this.d.a(str);
        o();
    }

    public MonitorData c(Device device, MonitorItem monitorItem) throws RemoteException {
        if (device == null || monitorItem == null) {
            yit.b("CommonDeviceManager", "queryMonitorData parameters is invalid");
            throw new IllegalStateException(String.valueOf(5));
        }
        yit.e("CommonDeviceManager", "enter queryMonitorData, monitorItem:" + monitorItem.getName());
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "queryMonitorData deviceAdapter is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        MonitorData[] monitorDataArr = new MonitorData[1];
        yiu yiuVar = new yiu(1);
        virtualDeviceE.queryMonitorData(device, monitorItem.getName(), a(monitorDataArr, yiuVar));
        try {
            if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
                yit.b("CommonDeviceManager", "queryMonitorData asyncToSyncListener timeout");
                throw new IllegalStateException(String.valueOf(12));
            }
            return monitorDataArr[0];
        } catch (InterruptedException unused) {
            yit.b("CommonDeviceManager", "asynToSyncListener await error");
            throw new IllegalStateException(String.valueOf(12));
        }
    }

    private QueryDataCallback a(final MonitorData[] monitorDataArr, final yiu yiuVar) {
        return new QueryDataCallback.Stub() { // from class: com.huawei.wearengine.core.device.CommonDeviceManager$13
            @Override // com.huawei.wearengine.monitor.QueryDataCallback
            public void onDataReceived(int i, MonitorMessage monitorMessage) {
                if (i == 0) {
                    monitorDataArr[0] = this.this$0.d.e(monitorMessage);
                }
                yiuVar.onFinish();
            }
        };
    }

    public void e(Device device, NotificationParcel notificationParcel, NotifySendCallback notifySendCallback) {
        if (device == null || notificationParcel == null || notifySendCallback == null) {
            yit.b("CommonDeviceManager", "notifyData parameters is invalid");
            return;
        }
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE != null) {
            virtualDeviceE.notifyData(device, notificationParcel, notifySendCallback);
        }
    }

    public int e(int i, ServiceConnectCallback serviceConnectCallback) {
        return c("registerConnectCallback", i, serviceConnectCallback);
    }

    public int a(int i, ServiceConnectCallback serviceConnectCallback) {
        return c("unregisterConnectCallback", i, serviceConnectCallback);
    }

    public void j() {
        for (VirtualDevice virtualDevice : yix.b().a()) {
            virtualDevice.setP2pInnerApi(this.e);
        }
    }

    public int a(int i) {
        this.g.a(i);
        return m();
    }

    public int a(String str) {
        this.g.d(str);
        return m();
    }

    private void a(IdentityInfo identityInfo, IdentityInfo identityInfo2, Device device, int i) {
        if (device.getUuid().isEmpty()) {
            yit.b("CommonDeviceManager", "device Uuid is invalid");
            return;
        }
        StringBuilder sb = new StringBuilder(512);
        if (identityInfo.getPackageName().length() >= 128 || identityInfo2.getFingerPrint().length() >= 128 || device.getUuid().length() >= 128) {
            return;
        }
        if (i == 0) {
            sb.append("registerReceiver srcPkgName is:");
        } else if (i == 1) {
            sb.append("handleReceive srcPkgName is:");
        }
        sb.append(identityInfo.getPackageName());
        sb.append(", srcFingerPrint is:");
        sb.append(yln.b(identityInfo.getFingerPrint()));
        sb.append(", destPkgName is:");
        sb.append(identityInfo2.getPackageName());
        sb.append(", destFingerPrint is:");
        sb.append(yln.b(identityInfo2.getFingerPrint()));
        sb.append(", deviceId is:");
        sb.append(yln.b(device.getUuid()));
        yit.e("CommonDeviceManager", sb.toString());
    }

    public int e(Device device, String str, String str2) {
        yiq.c(device, "device must not be null!");
        yiq.e(str, "srcPkgName must not be null!");
        yiq.e(str2, "destPkgName must not be null!");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "getDeviceAppVersionCode deviceAdapter is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        final int[] iArr = {-1};
        final yiu yiuVar = new yiu(1);
        virtualDeviceE.getDeviceAppVersionCode(device, str, str2, new P2pPingCallback.Stub() { // from class: com.huawei.wearengine.core.device.CommonDeviceManager$14
            @Override // com.huawei.wearengine.p2p.P2pPingCallback
            public void onResult(int i) {
                iArr[0] = i;
                yiuVar.onFinish();
            }
        });
        try {
            if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
                yit.b("CommonDeviceManager", "getDeviceAppVersionCode asyncToSyncListener timeout");
                throw new IllegalStateException(String.valueOf(12));
            }
            return iArr[0];
        } catch (InterruptedException unused) {
            yit.b("CommonDeviceManager", "getDeviceAppVersionCode asynToSyncListener await error");
            throw new IllegalStateException(String.valueOf(12));
        }
    }

    public int d(Device device, FileIdentificationParcel fileIdentificationParcel, IdentityInfo identityInfo, IdentityInfo identityInfo2, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack) {
        yiq.c(device, "device must not be null!");
        yiq.c(fileIdentificationParcel, "fileIdentification must not be null!");
        yiq.c(identityInfo, "srcInfo must not be null!");
        yiq.c(identityInfo2, "destInfo must not be null!");
        yiq.c(p2pCancelFileTransferCallBack, "p2pCancelFileTransferCallBack must not be null!");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "cancelFileTransfer deviceAdapter is null");
            return 12;
        }
        return virtualDeviceE.cancelFileTransfer(device, fileIdentificationParcel, identityInfo, identityInfo2, p2pCancelFileTransferCallBack);
    }

    public void d(DeviceListBinderCallback deviceListBinderCallback) {
        yiq.c(deviceListBinderCallback, "deviceListBinderCallback must not be null");
        Device device = new Device();
        device.setProductType(0);
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "getConnectedDevices deviceAdapter is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        final ArrayList arrayList = new ArrayList();
        final yiu yiuVar = new yiu(1);
        virtualDeviceE.getConnectedDevices(new IDeviceListCallback.Stub() { // from class: yjb.5
            @Override // com.huawei.hwotamanager.IDeviceListCallback
            public void onDeviceListObtain(String str) {
                arrayList.addAll(yjb.this.d(str));
                yiuVar.onFinish();
            }
        });
        try {
            if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
                yit.b("CommonDeviceManager", "getConnectedDevices asyncToSyncListener timeout");
            }
            deviceListBinderCallback.onDeviceListObtain(arrayList);
        } catch (RemoteException unused) {
            yit.b("CommonDeviceManager", "getConnectedDevices RemoteException");
            throw new IllegalStateException(String.valueOf(12));
        } catch (InterruptedException unused2) {
            yit.b("CommonDeviceManager", "asynToSyncListener await error");
            throw new IllegalStateException(String.valueOf(12));
        } catch (Exception unused3) {
            yit.b("CommonDeviceManager", "getConnectedDevices deviceListBinderCallback Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Device> d(String str) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayD = yly.d(str, "deviceList");
        if (jSONArrayD == null) {
            yit.c("CommonDeviceManager", " parseDevice deviceList is null");
            return arrayList;
        }
        if (jSONArrayD.length() == 0) {
            yit.e("CommonDeviceManager", "parseDevice deviceList is empty");
            return arrayList;
        }
        for (int i = 0; i < jSONArrayD.length(); i++) {
            JSONObject jSONObjectC = yly.c(jSONArrayD, i);
            Device device = new Device();
            device.setName(yly.b(jSONObjectC, "name"));
            device.setUuid(yly.b(jSONObjectC, "uuid"));
            device.setModel(yly.b(jSONObjectC, "model"));
            device.setProductType(0);
            device.setConnectState(yly.d(jSONObjectC, BleConstants.KEY_CONNECTSTATE, 2));
            yja yjaVarE = new yja.b().c("").e(yly.b(jSONObjectC, "version")).d(yly.e(jSONObjectC, "supportOTA", false)).a(yly.b(jSONObjectC, KnitFragment.KEY_EXTRA)).e();
            device.setReservedness(yjaVarE == null ? "{}" : yjaVarE.toString());
            arrayList.add(device);
        }
        yit.e("CommonDeviceManager", " devicesList size is " + arrayList.size());
        return arrayList;
    }

    public void d(Device device, CheckBinderCallback checkBinderCallback) {
        yiq.c(device, "device must not be null!");
        yiq.c(checkBinderCallback, "checkBinderCallback must not be null");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "getDeviceNewVersion deviceAdapter is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        final String[] strArr = {device.getUuid(), ""};
        final yiu yiuVar = new yiu(1);
        virtualDeviceE.getDeviceNewVersion(device, new ICheckCallback.Stub() { // from class: yjb.2
            @Override // com.huawei.hwotamanager.ICheckCallback
            public void onCheckComplete(String str, String str2) {
                yit.e("CommonDeviceManager", "getDeviceNewVersion resultInfo :" + str2);
                JSONObject jSONObjectE = yly.e(str2, "newVersionInfo");
                if (str != null && jSONObjectE != null) {
                    String[] strArr2 = strArr;
                    strArr2[0] = str;
                    strArr2[1] = jSONObjectE.toString();
                    yit.e("CommonDeviceManager", " getDeviceNewVersion newVersionInfo is not null");
                }
                yiuVar.onFinish();
            }
        });
        try {
            if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
                yit.b("CommonDeviceManager", "getDeviceNewVersion asyncToSyncListener timeout");
                throw new IllegalStateException(String.valueOf(19));
            }
            if (!TextUtils.equals(strArr[0], device.getUuid())) {
                yit.c("CommonDeviceManager", "getDeviceNewVersion device uuid is't equal");
                return;
            }
            yit.e("CommonDeviceManager", "getDeviceNewVersion callback resultInfo:" + strArr[1]);
            checkBinderCallback.onCheckComplete(device, strArr[1]);
        } catch (RemoteException unused) {
            yit.b("CommonDeviceManager", "getDeviceNewVersion RemoteException");
            throw new IllegalStateException(String.valueOf(12));
        } catch (IllegalStateException e) {
            throw e;
        } catch (InterruptedException unused2) {
            yit.b("CommonDeviceManager", "asynToSyncListener await error");
            throw new IllegalStateException(String.valueOf(12));
        } catch (Exception unused3) {
            yit.b("CommonDeviceManager", "getDeviceNewVersion checkBinderCallback Exception");
        }
    }

    public void b(Device device, String str, UpgradeBinderCallBack upgradeBinderCallBack) {
        yiq.c(device, "device must not be null!");
        if (TextUtils.isEmpty(str)) {
            yit.b("CommonDeviceManager", "doUpgrade command is null");
            throw new IllegalStateException(String.valueOf(5));
        }
        yiq.c(upgradeBinderCallBack, "upgradeBinderCallBack must not be null");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "doUpgrade deviceAdapter is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        final String[] strArr = {device.getUuid(), ""};
        final yiu yiuVar = new yiu(1);
        virtualDeviceE.doUpgrade(device, str, new IUpgradeCallBack.Stub() { // from class: yjb.3
            @Override // com.huawei.hwotamanager.IUpgradeCallBack
            public void onUpgradeStatus(String str2, String str3) {
                yit.e("CommonDeviceManager", "doUpgrade upgradeStatus:" + str3);
                if (str2 != null && str3 != null) {
                    String[] strArr2 = strArr;
                    strArr2[0] = str2;
                    strArr2[1] = str3;
                }
                yiuVar.onFinish();
            }
        });
        try {
            b(device, upgradeBinderCallBack, strArr, yiuVar);
        } catch (RemoteException unused) {
            yit.b("CommonDeviceManager", "doUpgrade RemoteException");
            throw new IllegalStateException(String.valueOf(12));
        } catch (IllegalStateException e) {
            throw e;
        } catch (InterruptedException unused2) {
            yit.b("CommonDeviceManager", "asynToSyncListener await error");
            throw new IllegalStateException(String.valueOf(12));
        } catch (Exception unused3) {
            yit.b("CommonDeviceManager", "doUpgrade upgradeBinderCallBack Exception");
        }
    }

    private void b(Device device, UpgradeBinderCallBack upgradeBinderCallBack, String[] strArr, yiu yiuVar) throws InterruptedException, RemoteException {
        if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
            yit.b("CommonDeviceManager", "doUpgrade asyncToSyncListener timeout");
            throw new IllegalStateException(String.valueOf(19));
        }
        if (!TextUtils.equals(strArr[0], device.getUuid())) {
            yit.c("CommonDeviceManager", "doUpgrade device uuid is't equal");
            return;
        }
        yit.e("CommonDeviceManager", "doUpgrade callback upgradeStatus:" + strArr[1]);
        upgradeBinderCallBack.onUpgradeStatus(device, strArr[1]);
    }

    public void d(Device device, UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) {
        yiq.c(device, "device must not be null!");
        yiq.c(upgradeStatusBinderCallBack, "upgradeStatusBinderCallBack must not be null");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "getUpgradeStatus deviceAdapter is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        final String[] strArr = {device.getUuid(), ""};
        final yiu yiuVar = new yiu(1);
        virtualDeviceE.getUpgradeStatus(device, new IUpgradeStatusCallBack.Stub() { // from class: yjb.10
            @Override // com.huawei.hwotamanager.IUpgradeStatusCallBack
            public void onStatus(String str, String str2) {
                yit.e("CommonDeviceManager", "getUpgradeStatus upgradeStatus:" + str2);
                if (str != null && str2 != null) {
                    String[] strArr2 = strArr;
                    strArr2[0] = str;
                    strArr2[1] = str2;
                }
                yiuVar.onFinish();
            }
        });
        try {
            if (!yiuVar.a(30000L, TimeUnit.MILLISECONDS)) {
                yit.b("CommonDeviceManager", "getUpgradeStatus asyncToSyncListener timeout");
                throw new IllegalStateException(String.valueOf(19));
            }
            if (!TextUtils.equals(strArr[0], device.getUuid())) {
                yit.c("CommonDeviceManager", "getUpgradeStatus device uuid is't equal");
                return;
            }
            yit.e("CommonDeviceManager", "getUpgradeStatus callback upgradeStatus:" + strArr[1]);
            upgradeStatusBinderCallBack.onStatus(device, strArr[1]);
        } catch (RemoteException unused) {
            yit.b("CommonDeviceManager", "getUpgradeStatus RemoteException");
            throw new IllegalStateException(String.valueOf(12));
        } catch (IllegalStateException e) {
            throw e;
        } catch (InterruptedException unused2) {
            yit.b("CommonDeviceManager", "asynToSyncListener await error");
            throw new IllegalStateException(String.valueOf(12));
        } catch (Exception unused3) {
            yit.b("CommonDeviceManager", "getUpgradeStatus upgradeStatusBinderCallBack Exception");
        }
    }

    public void e(final Device device, final UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) {
        yiq.c(device, "device must not be null!");
        yiq.c(upgradeStatusBinderCallBack, "upgradeStatusBinderCallBack must not be null");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "registerUpgradeListener deviceAdapter is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        virtualDeviceE.registerUpgradeListener(device, new IUpgradeStatusCallBack.Stub() { // from class: yjb.8
            @Override // com.huawei.hwotamanager.IUpgradeStatusCallBack
            public void onStatus(String str, String str2) {
                yjb.this.a(str, str2, device, upgradeStatusBinderCallBack);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Device device, UpgradeStatusBinderCallBack upgradeStatusBinderCallBack) {
        yit.e("CommonDeviceManager", "registerUpgradeListener upgradeStatus:" + str2);
        try {
            if (TextUtils.equals(str, device.getUuid())) {
                upgradeStatusBinderCallBack.onStatus(device, str2);
            } else {
                yit.c("CommonDeviceManager", "registerUpgradeListener device uuid is't equal");
            }
        } catch (RemoteException unused) {
            yit.b("CommonDeviceManager", "registerUpgradeListener RemoteException");
            throw new IllegalStateException(String.valueOf(12));
        } catch (Exception unused2) {
            yit.b("CommonDeviceManager", "registerUpgradeListener upgradeStatusBinderCallBack Exception");
        }
    }

    public void b(Device device) {
        yiq.c(device, "device must not be null!");
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "unRegisterUpgradeListener deviceAdapter is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        virtualDeviceE.unRegisterUpgradeListener(device);
    }

    public int b(int i, ServiceConnectCallback serviceConnectCallback) {
        return c("registerOtaServiceConnectCallback", i, serviceConnectCallback);
    }

    public int d(int i, ServiceConnectCallback serviceConnectCallback) {
        return c("unregisterOtaServiceConnectCallback", i, serviceConnectCallback);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
    private int c(String str, int i, ServiceConnectCallback serviceConnectCallback) {
        byte b2;
        int iA;
        yjg yjgVarE = yjg.e();
        str.hashCode();
        switch (str) {
            case "registerConnectCallback":
                b2 = 0;
                break;
            case "registerOtaServiceConnectCallback":
                b2 = 1;
                break;
            case "unregisterOtaServiceConnectCallback":
                b2 = 2;
                break;
            case "unregisterConnectCallback":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            iA = yjgVarE.a(serviceConnectCallback);
        } else if (b2 == 1) {
            iA = yjgVarE.d(serviceConnectCallback);
        } else if (b2 != 2) {
            iA = b2 != 3 ? 12 : yjgVarE.b(serviceConnectCallback);
        } else {
            iA = yjgVarE.e(serviceConnectCallback);
        }
        yit.e("CommonDeviceManager", "handlePhoneServiceConnect: " + str + ", " + i + ", " + iA);
        return (i < 11 && iA == 0) ? e(str, serviceConnectCallback) : iA;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private int e(String str, ServiceConnectCallback serviceConnectCallback) {
        byte b2;
        int iRegisterConnectCallback = 12;
        try {
            try {
                ServiceConnectCallbackManager serviceConnectCallbackManagerN = n();
                switch (str.hashCode()) {
                    case -1999273428:
                        if (!str.equals("registerConnectCallback")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case -1590673229:
                        if (!str.equals("registerOtaServiceConnectCallback")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case -437900998:
                        if (!str.equals("unregisterOtaServiceConnectCallback")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 999561075:
                        if (!str.equals("unregisterConnectCallback")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    iRegisterConnectCallback = serviceConnectCallbackManagerN.registerConnectCallback(serviceConnectCallback);
                } else if (b2 == 1) {
                    iRegisterConnectCallback = serviceConnectCallbackManagerN.unregisterConnectCallback(serviceConnectCallback);
                } else if (b2 == 2) {
                    iRegisterConnectCallback = serviceConnectCallbackManagerN.registerOtaServiceConnectCallback(serviceConnectCallback);
                } else if (b2 == 3) {
                    iRegisterConnectCallback = serviceConnectCallbackManagerN.unregisterOtaServiceConnectCallback(serviceConnectCallback);
                }
                this.j.b();
                yit.e("CommonDeviceManager", "handleDaemonServiceConnect: " + str + ", " + iRegisterConnectCallback);
                return iRegisterConnectCallback;
            } catch (RemoteException unused) {
                yit.b("CommonDeviceManager", "handleDaemonServiceConnect " + str + " has RemoteException");
                throw new IllegalStateException(String.valueOf(12));
            }
        } catch (Throwable th) {
            this.j.b();
            throw th;
        }
    }

    private ServiceConnectCallbackManager n() {
        IBinder iBinderE = this.j.e();
        if (iBinderE == null) {
            yit.b("CommonDeviceManager", "getServiceConnectCallbackManager serviceBinder is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        return ServiceConnectCallbackManager.Stub.asInterface(iBinderE);
    }

    public void d() {
        Device device = new Device();
        device.setProductType(0);
        VirtualDevice virtualDeviceE = yix.b().e(device);
        if (virtualDeviceE == null) {
            yit.b("CommonDeviceManager", "disconnectOtaService deviceAdapter is null");
            throw new IllegalStateException(String.valueOf(12));
        }
        virtualDeviceE.disconnectOtaService();
    }
}
