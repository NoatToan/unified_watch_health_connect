package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.callback.ConnectStatusInterface;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.connect.physical.PhysicalLayerBase;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, PhysicalLayerBase> f1732a = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConnectStatusInterface f1733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MessageReceiveCallback f1734c;
    private DeviceStatusChangeCallback e = new DeviceStatusChangeCallback() { // from class: cll.2
        @Override // com.huawei.devicesdk.callback.DeviceStatusChangeCallback
        public void onConnectStatusChanged(DeviceInfo deviceInfo, int i, int i2) {
            ReleaseLogUtil.c("DEVMGR_PhysicalServiceManage", "status: ", Integer.valueOf(i));
            if (cll.this.f1733b != null) {
                if (i == 0) {
                    cll.this.f1733b.onPhysicalLayerDisconnected(deviceInfo, i2);
                    return;
                }
                if (i == 2) {
                    cll.this.f1733b.onPhysicalLayerConnected(deviceInfo);
                    return;
                }
                if (i != 3) {
                    switch (i) {
                        case 30:
                            cll.this.f1733b.onDeviceBond(deviceInfo, 30);
                            break;
                        case 31:
                            cll.this.f1733b.onDeviceBond(deviceInfo, 31);
                            break;
                        case 32:
                            cll.this.f1733b.onDeviceBond(deviceInfo, 32);
                            break;
                        case 33:
                            cll.this.f1733b.onDeviceBond(deviceInfo, 33);
                            break;
                        case 34:
                            cll.this.f1733b.onDeviceBond(deviceInfo, 34);
                            break;
                        default:
                            LogUtil.b("PhysicalServiceManage", "mDeviceStatusClientCallback default");
                            break;
                    }
                    return;
                }
                cll.this.f1733b.onPhysicalLayerConnectFailed(deviceInfo, i2);
            }
        }
    };

    public static cll c() {
        return e.f1735b;
    }

    public PhysicalLayerBase a(String str, ConnectMode connectMode, int i) {
        PhysicalLayerBase cliVar;
        if (str == null || connectMode == null) {
            return null;
        }
        LogUtil.b("PhysicalServiceManage", "getPhysicalLayerStrategy ", cpl.a(str), ", bt type: ", Integer.valueOf(i));
        PhysicalLayerBase physicalLayerBase = f1732a.get(str);
        if (physicalLayerBase != null) {
            return physicalLayerBase;
        }
        try {
            if (connectMode == ConnectMode.SIMPLE) {
                cliVar = new clm();
            } else if (connectMode == ConnectMode.GENERAL && i == 2) {
                cliVar = new cld();
            } else if (connectMode == ConnectMode.GENERAL && i == 1) {
                cliVar = new cli();
            } else if (connectMode == ConnectMode.GENERAL && i == 0) {
                cliVar = new clk();
            } else if (connectMode != ConnectMode.TRANSPARENT || i != 2) {
                ReleaseLogUtil.c("DEVMGR_PhysicalServiceManage", "unkown btType, use br service");
                cliVar = new cli();
            } else {
                cliVar = new cln();
            }
            physicalLayerBase = cliVar;
            f1732a.put(str, physicalLayerBase);
            return physicalLayerBase;
        } catch (OutOfMemoryError e2) {
            ReleaseLogUtil.c("DEVMGR_PhysicalServiceManage", "getPhysicalLayerStrategy outOfMemoryError, ", ExceptionUtils.c(e2), "memoryInfo is ", coy.b());
            lng.c("ConnectMessage", "getPhysicalLayerStrategy memoryInfo is" + coy.b());
            return physicalLayerBase;
        }
    }

    public PhysicalLayerBase d(String str) {
        if (str == null) {
            return null;
        }
        return f1732a.get(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("PhysicalServiceManage", "clearPhysicalLayerStrategy: id is empty");
            return;
        }
        PhysicalLayerBase physicalLayerBaseRemove = f1732a.remove(str);
        if (physicalLayerBaseRemove != null) {
            physicalLayerBaseRemove.destroy();
        }
    }

    public void d(ConnectMode connectMode, DeviceInfo deviceInfo) {
        if (connectMode == null || deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.d("PhysicalServiceManage", "device or mac address or protocol is null");
            a(deviceInfo);
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        String strA = cpl.a(deviceMac);
        LogUtil.b("PhysicalServiceManage", "connect device. ", strA);
        PhysicalLayerBase physicalLayerBaseA = c().a(deviceMac, connectMode, deviceInfo.getDeviceBtType());
        if (physicalLayerBaseA == null) {
            LogUtil.d("PhysicalServiceManage", "connect device failed, can not find physical layer.", strA);
            a(deviceInfo);
        } else {
            physicalLayerBaseA.init(deviceInfo, this.e, this.f1734c);
            physicalLayerBaseA.connectDevice(deviceInfo);
        }
    }

    public void b(String str, List<cmd> list) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("PhysicalServiceManage", "sendData error. device mac is null");
            return;
        }
        PhysicalLayerBase physicalLayerBaseD = d(str);
        if (physicalLayerBaseD == null) {
            LogUtil.d("PhysicalServiceManage", "sendData error. physicalLayerBase is null");
            return;
        }
        if (coq.d(list)) {
            LogUtil.d("PhysicalServiceManage", "can not get physical layer.", cpl.a(str));
        }
        Iterator<cmd> it = list.iterator();
        while (it.hasNext()) {
            if (!physicalLayerBaseD.sendData(it.next(), str)) {
                if (this.f1734c == null) {
                    LogUtil.d("PhysicalServiceManage", "mMessageReceiveCallback is null");
                    return;
                } else {
                    this.f1734c.onDataReceived(physicalLayerBaseD.getCurrentDeviceInfo(), null, 1);
                }
            }
        }
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.d("PhysicalServiceManage", "device is null");
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        if (TextUtils.isEmpty(deviceMac)) {
            LogUtil.d("PhysicalServiceManage", "deviceId is empty");
            return;
        }
        PhysicalLayerBase physicalLayerBaseD = c().d(deviceMac);
        if (physicalLayerBaseD == null) {
            LogUtil.d("PhysicalServiceManage", "physicalLayer is null");
        } else {
            physicalLayerBaseD.disconnectDevice();
        }
    }

    private void a(DeviceInfo deviceInfo) {
        LogUtil.b("PhysicalServiceManage", "notifyDeviceConnectError", cpl.a(deviceInfo));
        DeviceStatusChangeCallback deviceStatusChangeCallback = this.e;
        if (deviceStatusChangeCallback != null) {
            deviceStatusChangeCallback.onConnectStatusChanged(deviceInfo, 3, cpi.c(7, 303));
        } else {
            LogUtil.d("PhysicalServiceManage", "notifyDeviceConnectError error. mDeviceStatusClientCallback is invalid");
        }
    }

    public boolean e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.d("PhysicalServiceManage", "query device is SupportService error");
            return false;
        }
        PhysicalLayerBase physicalLayerBaseD = d(str);
        if (physicalLayerBaseD == null) {
            LogUtil.d("PhysicalServiceManage", "isSupportService physicalLayer is null");
            return false;
        }
        return physicalLayerBaseD.isSupportService(str2);
    }

    public boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.d("PhysicalServiceManage", "query device is supportCharacter error");
            return false;
        }
        PhysicalLayerBase physicalLayerBaseD = d(str);
        if (physicalLayerBaseD == null) {
            LogUtil.d("PhysicalServiceManage", "isSupportCharacter physicalLayer is null");
            return false;
        }
        return physicalLayerBaseD.isSupportCharactor(str2, str3);
    }

    public void c(ConnectStatusInterface connectStatusInterface) {
        this.f1733b = connectStatusInterface;
    }

    public void e(MessageReceiveCallback messageReceiveCallback) {
        this.f1734c = messageReceiveCallback;
    }

    public void d(DeviceInfo deviceInfo, ConnectMode connectMode) {
        PhysicalLayerBase physicalLayerBaseA;
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null) {
            LogUtil.e("PhysicalServiceManage", "PhysicalServiceManage unPairDevice device null");
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        PhysicalLayerBase physicalLayerBaseD = c().d(deviceMac);
        if (physicalLayerBaseD != null) {
            LogUtil.b("PhysicalServiceManage", "unPairDevice", cpl.a(deviceInfo));
            physicalLayerBaseD.init(deviceInfo, this.e, this.f1734c);
            physicalLayerBaseD.unPairDevice(deviceInfo);
        } else {
            if (connectMode == null || (physicalLayerBaseA = c().a(deviceMac, connectMode, deviceInfo.getDeviceBtType())) == null) {
                return;
            }
            physicalLayerBaseA.init(deviceInfo, this.e, this.f1734c);
            physicalLayerBaseA.unPairDevice(deviceInfo);
        }
    }

    public void c(DeviceInfo deviceInfo, ConnectMode connectMode) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null || connectMode == null) {
            LogUtil.e("PhysicalServiceManage", "pair device error. device or connect mode is invalid.");
            return;
        }
        PhysicalLayerBase physicalLayerBaseA = c().a(deviceInfo.getDeviceMac(), connectMode, deviceInfo.getDeviceBtType());
        if (physicalLayerBaseA != null) {
            LogUtil.b("PhysicalServiceManage", "pairDevice", cpl.a(deviceInfo));
            physicalLayerBaseA.init(deviceInfo, this.e, this.f1734c);
            physicalLayerBaseA.pairDevice(deviceInfo);
        }
    }

    public void e(DeviceInfo deviceInfo, int i) {
        LogUtil.b("PhysicalServiceManage", "handleDualSocket enter.");
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("PhysicalServiceManage", "handleDualSocket deviceInfo is invalid.");
            return;
        }
        PhysicalLayerBase physicalLayerBaseD = d(deviceInfo.getDeviceMac());
        if (physicalLayerBaseD == null) {
            LogUtil.e("PhysicalServiceManage", "isSupportService physicalLayer is null");
        } else if (physicalLayerBaseD instanceof cli) {
            ((cli) physicalLayerBaseD).c(i);
        }
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static cll f1735b = new cll();
    }
}
