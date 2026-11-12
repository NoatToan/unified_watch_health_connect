package defpackage;

import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.devicesdk.api.DevicesManagementInterface;
import com.huawei.devicesdk.callback.ConnectFilter;
import com.huawei.devicesdk.callback.DeviceCompatibleCallback;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.callback.MessageReceiveCallback;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class cju implements DevicesManagementInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f1654c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1653a = new Object();

    private cju() {
    }

    public static cju d() {
        return e.f1655b;
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void initUniteService(final DeviceCompatibleCallback deviceCompatibleCallback) {
        ThreadPoolManager.c().a("DevicesManagement", new Runnable() { // from class: cju.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (cju.f1653a) {
                    LogUtil.b("DevicesManagement", "DevicesManagement initUniteService initUniteService()-tagExecute()");
                    cnk.c().e();
                    List<String> listE = cju.this.e();
                    DeviceCompatibleCallback deviceCompatibleCallback2 = deviceCompatibleCallback;
                    if (deviceCompatibleCallback2 != null) {
                        deviceCompatibleCallback2.adapterOperate(listE);
                    }
                }
                if (cnf.d().a() != null) {
                    cno.a().e(1);
                }
            }
        });
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void scanDevice(ScanMode scanMode, List<cmy> list, DeviceScanCallback deviceScanCallback) {
        LogUtil.b("DevicesManagement", "DevicesManagement scanDevice ");
        if (scanMode == null || deviceScanCallback == null || list == null) {
            LogUtil.b("DevicesManagement", "DevicesManagement scanDevice fail");
        } else {
            cnj.c().b(scanMode, list, deviceScanCallback);
        }
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void stopScanDevice() {
        cnj.c().b();
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void connectDevice(DeviceInfo deviceInfo, boolean z, ConnectMode connectMode) {
        if (connectMode == null || deviceInfo == null) {
            LogUtil.d("DevicesManagement", "device or connectMode is invalid.");
            return;
        }
        LogUtil.b("DevicesManagement", "connectDevice start.", cpl.a(deviceInfo), " reconnect:", Boolean.valueOf(z));
        if (TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        DeviceInfo deviceInfoA = cnk.c().a(deviceMac);
        if (deviceInfoA != null && deviceInfoA.getDeviceConnectState() == 1) {
            LogUtil.b("DevicesManagement", "currentDevice is already connecting.");
        } else {
            if (!cqf.b(deviceInfo)) {
                LogUtil.b("DevicesManagement", "isReconnectionDevice false");
                return;
            }
            cnk.c().e(deviceMac, connectMode);
            ReleaseLogUtil.c("DEVMGR_DevicesManagement", "connectDevice deviceSoftVersion: ", deviceInfo.getDeviceSoftVersion());
            cnf.d().c(connectMode, deviceInfo, z);
        }
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void createSystemBond(DeviceInfo deviceInfo, ConnectMode connectMode) {
        if (deviceInfo == null || connectMode == null) {
            LogUtil.d("DevicesManagement", "createSystemBond error. device or connect mode is invalid");
            return;
        }
        cnk.c().d(deviceInfo);
        LogUtil.b("DevicesManagement", "createSystemBond", cpl.a(deviceInfo.getDeviceMac()));
        cnf.d().a(deviceInfo, connectMode);
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void sendCommand(DeviceInfo deviceInfo, cmg cmgVar) {
        byte b2;
        if (deviceInfo == null || cmgVar == null) {
            LogUtil.e("DevicesManagement", "sendCommand error. device or command is null");
            return;
        }
        if (cmgVar.c() == null) {
            cmgVar.e("");
        }
        byte[] bArrB = cmgVar.b();
        byte b3 = 0;
        if (bArrB == null || bArrB.length <= 1) {
            b2 = 0;
        } else {
            b3 = bArrB[0];
            b2 = bArrB[1];
            if (cpx.a(b3, b2, deviceInfo.getDeviceMac(), "send to device")) {
                return;
            }
            if (b3 == 52 || b3 == 55) {
                cmgVar.d(cou.a().a(deviceInfo, b3, bArrB));
            } else {
                cmgVar.d(cou.a().a(deviceInfo, cmgVar, b3, b2));
            }
        }
        DeviceInfo deviceInfoJ = cnk.c().j(deviceInfo.getDeviceMac());
        if (b3 != 26 || b2 != 6) {
            deviceInfo = deviceInfoJ;
        }
        ReleaseLogUtil.c("DEVMGR_DevicesManagement", "sendCommand command socketChannel: ", Integer.valueOf(cmgVar.g()), " serviceId: ", Integer.valueOf(b3), " commandId: ", Integer.valueOf(b2));
        cnm.d().e(deviceInfo, cmgVar);
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public Map<String, UniteDevice> getDeviceList() {
        Map<String, UniteDevice> mapC;
        synchronized (f1653a) {
            mapC = cpg.c(cnk.c().a(), cnk.c().d());
        }
        return mapC;
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void unPairDevice(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("DevicesManagement", "unPairDevice device null");
        } else {
            ReleaseLogUtil.c("DEVMGR_DevicesManagement", "unPairDevice", cpl.a(deviceInfo.getDeviceMac()));
            cnf.d().c(deviceInfo, true);
        }
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void disconnect(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.d("DevicesManagement", "device is invalid.");
            return;
        }
        DeviceInfo deviceInfoJ = cnk.c().j(deviceInfo.getDeviceMac());
        if (deviceInfoJ != null) {
            if (deviceInfoJ.getDeviceConnectState() != 3) {
                LogUtil.b("DevicesManagement", "disconnect device start.", cpl.a(deviceInfoJ));
                cnf.d().d(deviceInfoJ);
            } else {
                cnk.c().d(deviceInfo.getDeviceMac(), false);
                LogUtil.b("DevicesManagement", "currentDevice is already disconnected.");
            }
        }
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public boolean isSupportService(DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac()) || str == null) {
            LogUtil.d("DevicesManagement", "query device is SupportService error");
            return false;
        }
        return cll.c().e(deviceInfo.getDeviceMac(), str);
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public boolean isSupportCharacter(DeviceInfo deviceInfo, String str, String str2) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac()) || str == null || str2 == null) {
            LogUtil.d("DevicesManagement", "query device is SupportCharacter error");
            return false;
        }
        return cll.c().a(deviceInfo.getDeviceMac(), str, str2);
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void registerDeviceStateListener(DeviceStatusChangeCallback deviceStatusChangeCallback) {
        LogUtil.b("DevicesManagement", "registerDeviceStateListener");
        if (deviceStatusChangeCallback != null) {
            cnf.d().d(deviceStatusChangeCallback);
        }
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void unregisterDeviceStateListener() {
        LogUtil.b("DevicesManagement", "unregisterDeviceStateListener");
        cnf.d().e();
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void registerDeviceMessageListener(MessageReceiveCallback messageReceiveCallback) {
        LogUtil.b("DevicesManagement", "registerDeviceMessageListener");
        if (messageReceiveCallback != null) {
            cnm.d().c(messageReceiveCallback);
        }
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void unregisterDeviceMessageListener() {
        LogUtil.b("DevicesManagement", "unregisterDeviceMessageListener");
        cnm.d().c();
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void registerHandshakeFilter(ConnectFilter connectFilter) {
        if (connectFilter == null) {
            LogUtil.d("DevicesManagement", "registerHandshakeFilter error, input param is invalid. device or filter is null");
        } else {
            LogUtil.b("DevicesManagement", "registerHandshakeFilter");
            cnf.d().a(connectFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<String> e() {
        String deviceMac;
        ExternalDeviceCapability externalDeviceCapabilityB;
        ArrayList arrayList = new ArrayList(16);
        if (!f1654c.get()) {
            String strE = cpk.e("fix_multi_status", "");
            LogUtil.b("DevicesManagement", "fixMultiDeviceStatus isUpdated is ", strE);
            if (!TextUtils.isEmpty(strE)) {
                f1654c.set(true);
                return arrayList;
            }
            cpk.d("fix_multi_status", "true");
            for (DeviceInfo deviceInfo : cnk.c().a().values()) {
                if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getDeviceMac()) && (externalDeviceCapabilityB = cnk.c().b((deviceMac = deviceInfo.getDeviceMac()))) != null) {
                    com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfo2 = new com.huawei.health.devicemgr.business.entity.DeviceInfo();
                    deviceInfo2.setExpandCapability(externalDeviceCapabilityB.getCapacity());
                    if (cqd.c(deviceInfo2, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY) && !deviceInfo.isUsing()) {
                        LogUtil.e("DevicesManagement", "isSupportMultiConnect but not is using", cpl.a(deviceInfo));
                        deviceInfo.setUsing(true);
                        cnk.c().b(deviceMac, deviceInfo);
                        arrayList.add(deviceMac);
                        cno.a().d(deviceInfo);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.devicesdk.api.DevicesManagementInterface
    public void destory() {
        cno.a().c();
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static cju f1655b = new cju();
    }
}
