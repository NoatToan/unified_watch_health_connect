package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.LogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class cnk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cka f1844c;

    private cnk() {
        this.f1844c = cka.b();
    }

    public static cnk c() {
        return e.e;
    }

    public void b(String str, DeviceInfo deviceInfo) {
        if (TextUtils.isEmpty(str) || deviceInfo == null) {
            LogUtil.e("DeviceInfoManage", "deviceUuid or deviceInfo is invalid, addDeviceInfo error.");
            return;
        }
        if (!deviceInfo.isReconnect()) {
            String strD = cpg.d();
            deviceInfo.setWearEngineDeviceId(strD);
            LogUtil.b("DeviceInfoManage", "addDeviceInfo wearEngineDeviceId: ", cpl.a(strD));
            deviceInfo.setReconnect(true);
        }
        this.f1844c.c(str, deviceInfo);
        clw.c(str, deviceInfo);
    }

    public void c(DeviceInfo deviceInfo) {
        this.f1844c.d(deviceInfo);
    }

    public DeviceInfo j(String str) {
        return this.f1844c.j(str);
    }

    public Map<String, DeviceInfo> a() {
        return this.f1844c.d();
    }

    public Map<String, DeviceInfo> b() {
        return this.f1844c.e();
    }

    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("DeviceInfoManage", "device info is invalid, removeDeviceInfo error");
            return;
        }
        LogUtil.b("DeviceInfoManage", "remove device info: ", cpl.a(deviceInfo));
        String deviceMac = deviceInfo.getDeviceMac();
        this.f1844c.h(deviceMac);
        clw.b(deviceMac);
    }

    public void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("DeviceInfoManage", "device info is invalid, removeDeviceInfo error");
            return;
        }
        LogUtil.b("DeviceInfoManage", "remove device info: ", cpl.a(deviceInfo));
        this.f1844c.h(deviceInfo.getDeviceMac());
    }

    public void d(DeviceInfo deviceInfo) {
        this.f1844c.a(deviceInfo);
    }

    public DeviceInfo a(String str) {
        return this.f1844c.b(str);
    }

    public void o(String str) {
        this.f1844c.m(str);
    }

    public void c(String str, int i) {
        if (str == null) {
            LogUtil.e("DeviceInfoManage", "updateDeviceStatus error. device is invalid.");
            return;
        }
        DeviceInfo deviceInfoJ = this.f1844c.j(str);
        if (deviceInfoJ == null) {
            LogUtil.e("DeviceInfoManage", "updateDeviceStatus error. can not find device: ", cpl.a(str));
            return;
        }
        LogUtil.b("DeviceInfoManage", "updateDeviceStatus: ", cpl.a(str), " status from ", Integer.valueOf(deviceInfoJ.getDeviceConnectState()), " to ", Integer.valueOf(i));
        deviceInfoJ.setDeviceConnectState(i);
        clw.c(str, deviceInfoJ);
        if (i == 4 || i == 3) {
            cno.a().d(deviceInfoJ);
        }
    }

    public void d(String str, boolean z) {
        if (str == null) {
            LogUtil.e("DeviceInfoManage", "updateUsing error. device is invalid.");
            return;
        }
        DeviceInfo deviceInfoJ = this.f1844c.j(str);
        if (deviceInfoJ == null) {
            LogUtil.e("DeviceInfoManage", "updateUsing error. can not find device.", cpl.a(str));
            return;
        }
        LogUtil.b("DeviceInfoManage", "updateUsing.", cpl.a(str), " from ", Boolean.valueOf(deviceInfoJ.isUsing()), " to ", Boolean.valueOf(z));
        deviceInfoJ.setUsing(z);
        clw.c(str, deviceInfoJ);
    }

    public Map<String, ExternalDeviceCapability> d() {
        return this.f1844c.a();
    }

    public void c(String str, ExternalDeviceCapability externalDeviceCapability) {
        if (TextUtils.isEmpty(str) || externalDeviceCapability == null) {
            LogUtil.e("DeviceInfoManage", "device id or capability is invalid.");
        } else {
            this.f1844c.a(str, externalDeviceCapability);
            clw.e(str, externalDeviceCapability);
        }
    }

    public void a(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            return;
        }
        String deviceMac = deviceInfo.getDeviceMac();
        DeviceInfo deviceInfoJ = j(deviceMac);
        if (deviceInfoJ != null && deviceInfoJ.getPairingTime() <= 0) {
            deviceInfo.setPairingTime(System.currentTimeMillis());
        }
        if ("assistant_relationship".equalsIgnoreCase(cpx.c(deviceMac))) {
            LogUtil.b("DeviceInfoManage", "assistant device do not need update last connected time.", cpl.a(deviceMac));
        } else {
            deviceInfo.setLastConnectedTime(System.currentTimeMillis());
        }
        clw.c(deviceMac, deviceInfo);
    }

    public void m(String str) {
        LogUtil.b("DeviceInfoManage", "enter updateDeviceAfterSimulatConnected", cpl.a(str));
        DeviceInfo deviceInfoJ = c().j(str);
        if (deviceInfoJ == null || TextUtils.isEmpty(deviceInfoJ.getDeviceMac())) {
            return;
        }
        deviceInfoJ.setLastConnectedTime(System.currentTimeMillis());
        clw.c(str, deviceInfoJ);
    }

    public void e(String str, ConnectMode connectMode) {
        if (str == null || connectMode == null) {
            LogUtil.e("DeviceInfoManage", "param is invalid, updateConnectMode fail");
            return;
        }
        cmo cmoVarG = this.f1844c.g(str);
        if (cmoVarG != null && cmoVarG.b() != null) {
            LogUtil.b("DeviceInfoManage", "connectMode is already exists.");
            return;
        }
        if (cmoVarG == null) {
            cmoVarG = new cmo();
            cmoVarG.d(str);
        }
        cmoVarG.d(connectMode);
        e(str, cmoVarG);
        clw.c(str, cmoVarG);
    }

    public void e(String str, cmo cmoVar) {
        this.f1844c.c(str, cmoVar);
    }

    public cmo f(String str) {
        return this.f1844c.g(str);
    }

    public void c(String str, boolean z) {
        if (str == null) {
            LogUtil.e("DeviceInfoManage", "setIsHandshakeRunning: identify is null");
            return;
        }
        DeviceInfo deviceInfoJ = this.f1844c.j(str);
        cmo cmoVarG = this.f1844c.g(str);
        if (cmoVarG == null) {
            LogUtil.b("DeviceInfoManage", "setIsHandshakeRunning: no deviceStatus, so create new one");
            cmoVarG = new cmo();
            this.f1844c.c(str, cmoVarG);
        }
        cmoVarG.e(z);
        if (deviceInfoJ == null) {
            LogUtil.e("DeviceInfoManage", "setIsHandshakeRunning device is not exist.", cpl.a(str));
        } else {
            clw.c(str, cmoVarG);
        }
    }

    public boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("DeviceInfoManage", "isHandshakeRunning: identify is empty");
            return false;
        }
        cmo cmoVarG = this.f1844c.g(str);
        if (cmoVarG == null) {
            return false;
        }
        return cmoVarG.a();
    }

    public cml c(String str) {
        return this.f1844c.d(str);
    }

    public void e(String str, cml cmlVar) {
        this.f1844c.c(str, cmlVar);
    }

    public cmr h(String str) {
        return this.f1844c.f(str);
    }

    public void c(String str, cmr cmrVar) {
        this.f1844c.d(str, cmrVar);
    }

    public void b(String str, DeviceCapability deviceCapability) {
        this.f1844c.d(str, deviceCapability);
    }

    public DeviceCapability d(String str) {
        return this.f1844c.c(str);
    }

    public void e(DeviceInfo deviceInfo, String str) {
        if (deviceInfo != null) {
            this.f1844c.a(deviceInfo.getDeviceMac(), cpf.c(str, deviceInfo.getDeviceMode()));
            return;
        }
        LogUtil.e("DeviceInfoManage", "addExtendDeviceCapability deviceInfo is null.");
    }

    public ExternalDeviceCapability b(String str) {
        return this.f1844c.e(str);
    }

    public void k(String str) {
        this.f1844c.k(str);
        clw.e(str, b(str));
    }

    public void c(UniteDevice uniteDevice) {
        this.f1844c.b(uniteDevice);
    }

    public void e(String str, boolean z) {
        this.f1844c.d(str, z);
    }

    public boolean i(String str) {
        return this.f1844c.i(str);
    }

    public void e(String str) {
        this.f1844c.a(str);
    }

    public void e() {
        clw.c();
    }

    static class e {
        private static cnk e = new cnk();
    }
}
