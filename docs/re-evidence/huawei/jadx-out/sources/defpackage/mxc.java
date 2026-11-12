package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mxc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mxc f42630a;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mxg f42631c = mxg.b();

    private mxc() {
    }

    public static mxc e() {
        mxc mxcVar;
        synchronized (e) {
            if (f42630a == null) {
                LogUtil.a("HwMultiDeviceManager", "HwMultiDeviceManager init.");
                f42630a = new mxc();
            }
            mxcVar = f42630a;
        }
        return mxcVar;
    }

    public void e(DeviceInfo deviceInfo, int i) {
        if (TextUtils.isEmpty(deviceInfo.getRelationship())) {
            String strA = mkl.d().a(deviceInfo.getDeviceIdentify());
            LogUtil.j("HwMultiDeviceManager", "afterUnderConnectStateChanged setRelationship:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " deviceRelation: ", strA);
            deviceInfo.setRelationship(strA);
        }
        mlo.d().b(deviceInfo, i);
    }

    public void a(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null) {
            LogUtil.j("HwMultiDeviceManager", "handleMultiDevice deviceInfo is null.");
            return;
        }
        LogUtil.a("HwMultiDeviceManager", "handleMultiDevice deviceIdentify: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), ", isSwitchDevice: ", Boolean.valueOf(z));
        String strA = mkl.d().a(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwMultiDeviceManager", "handleMultiDevice deviceRelation: ", strA);
        if (!TextUtils.isEmpty(strA) && !"unactive_relationship".equals(strA) && !eel.d(deviceInfo.getProductType()) && !z) {
            LogUtil.a("HwMultiDeviceManager", "handleMultiDevice isDeal is false.");
            return;
        }
        List<DeviceInfo> listC = c();
        if (this.f42631c.e(deviceInfo.getProductType(), deviceInfo.getDeviceIdentify())) {
            LogUtil.a("HwMultiDeviceManager", "handleMultiDevice current device relation is follow, no disconnect other device");
            this.f42631c.d(deviceInfo.getDeviceIdentify(), listC);
            return;
        }
        if (this.f42631c.a(deviceInfo)) {
            if (this.f42631c.b(deviceInfo)) {
                return;
            }
            LogUtil.a("HwMultiDeviceManager", "handleMultiDevice support multi connect, is not follow device.");
            d(deviceInfo, listC);
            this.f42631c.d(listC);
            mkl.d().c(listC, "supportMultiUpdate");
            return;
        }
        if (eel.d(deviceInfo.getProductType())) {
            LogUtil.a("HwMultiDeviceManager", "handleMultiDevice isAw70Device.");
            e(deviceInfo);
        } else {
            LogUtil.a("HwMultiDeviceManager", "handleMultiDevice is not Aw70Device.");
            b(deviceInfo, listC);
        }
    }

    public List<DeviceInfo> c() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "handleMultiDevice");
        for (DeviceInfo deviceInfo : deviceList) {
            if ("assistant_relationship".equals(deviceInfo.getRelationship())) {
                deviceInfo.setDeviceActiveState(1);
            }
            if ("main_relationship".equals(deviceInfo.getRelationship()) && deviceInfo.getDeviceActiveState() != 1) {
                LogUtil.a("HwMultiDeviceManager", "getAllDeviceList deviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()));
                deviceInfo.setDeviceActiveState(1);
            }
        }
        return deviceList;
    }

    private void e(DeviceInfo deviceInfo) {
        DeviceInfo deviceInfoC;
        List<DeviceInfo> listC = c();
        if (deviceInfo.getAutoDetectSwitchStatus() == 0) {
            c(deviceInfo, listC);
            LogUtil.a("HwMultiDeviceManager", "handleAw70DeviceWorkMode workMode after caseForAw70BandMode: ", Integer.valueOf(deviceInfo.getAutoDetectSwitchStatus()));
        } else {
            if (deviceInfo.getAutoDetectSwitchStatus() == 1) {
                LogUtil.a("HwMultiDeviceManager", "handleAw70DeviceWorkMode workMode after caseForAw70RunMode: ", Integer.valueOf(deviceInfo.getAutoDetectSwitchStatus()));
                e(deviceInfo, listC);
                if (this.f42631c.b(listC) || (deviceInfoC = this.f42631c.c(listC)) == null) {
                    return;
                }
                a(deviceInfoC, listC);
                mkf.e(BaseApplication.b()).switchDevice(listC, deviceInfoC.getDeviceIdentify());
                return;
            }
            LogUtil.d("HwMultiDeviceManager", "handleAw70DeviceWorkMode else branch.");
        }
    }

    private void c(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo2 : list) {
            if (!this.f42631c.e(deviceInfo2.getProductType(), deviceInfo2.getDeviceIdentify())) {
                if (!deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                    if (deviceInfo2.getDeviceActiveState() == 1) {
                        b(deviceInfo2);
                    } else {
                        deviceInfo2.setRelationship("unactive_relationship");
                    }
                } else {
                    deviceInfo2.setRelationship("main_relationship");
                    LogUtil.a("HwMultiDeviceManager", "caseForAw70BandMode aw70 band mode set main.");
                }
            }
        }
        this.f42631c.d(list);
        mkl.d().c(list, "caseForAw70BandModeUpdate");
    }

    private void e(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo2 : list) {
            if (eel.d(deviceInfo2.getProductType())) {
                if (!deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                    if (deviceInfo2.getDeviceActiveState() == 1) {
                        LogUtil.a("HwMultiDeviceManager", "disconnectElseAw70Device has active aw70 device");
                        b(deviceInfo2);
                    } else {
                        deviceInfo2.setRelationship("unactive_relationship");
                    }
                } else {
                    LogUtil.a("HwMultiDeviceManager", "disconnectElseAw70Device aw70 run posture set main.");
                    deviceInfo2.setRelationship("followed_relationship");
                }
            }
        }
        this.f42631c.d(list);
        mkl.d().c(list, "disconnectElseAw70DeviceUpdate");
    }

    private void d(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo2 : list) {
            if (!deviceInfo2.getDeviceIdentify().equals(deviceInfo.getDeviceIdentify())) {
                if (deviceInfo2.getDeviceActiveState() == 1 && !this.f42631c.b(deviceInfo2)) {
                    c(deviceInfo2);
                }
            } else {
                deviceInfo2.setRelationship("main_relationship");
            }
        }
    }

    private void c(DeviceInfo deviceInfo) {
        if (!this.f42631c.c(deviceInfo, true)) {
            deviceInfo.setRelationship("unactive_relationship");
            a(deviceInfo.getDeviceIdentify());
        } else if ("main_relationship".equalsIgnoreCase(mkl.d().a(deviceInfo.getDeviceIdentify()))) {
            deviceInfo.setRelationship("assistant_relationship");
        }
    }

    private void b(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo2 : list) {
            if (!deviceInfo2.getDeviceIdentify().equals(deviceInfo.getDeviceIdentify())) {
                if (!h(deviceInfo2)) {
                    LogUtil.j("HwMultiDeviceManager", "handleNotAw70Device is not disconnect device.");
                } else if (deviceInfo2.getDeviceActiveState() == 1) {
                    b(deviceInfo2);
                } else {
                    LogUtil.a("HwMultiDeviceManager", "handleNotAw70Device setRelationship unactive relationship.");
                    deviceInfo2.setRelationship("unactive_relationship");
                }
            } else {
                deviceInfo2.setRelationship("main_relationship");
                LogUtil.a("HwMultiDeviceManager", "handleNotAw70Device set main.");
            }
        }
        this.f42631c.d(list);
        mkl.d().c(list, "handleNotAw70DeviceUpdate");
    }

    private void b(DeviceInfo deviceInfo) {
        if (this.f42631c.a(deviceInfo)) {
            LogUtil.a("HwMultiDeviceManager", "handleDeviceRelationship set assistant relationship.");
            deviceInfo.setRelationship("assistant_relationship");
        } else {
            deviceInfo.setRelationship("unactive_relationship");
            a(deviceInfo.getDeviceIdentify());
        }
    }

    private boolean h(DeviceInfo deviceInfo) {
        return (this.f42631c.b(deviceInfo) || (eel.d(deviceInfo.getProductType()) && deviceInfo.getAutoDetectSwitchStatus() == 1)) ? false : true;
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwMultiDeviceManager", "dealDeleteBusinessByShip deviceIdentify is empty.");
        } else {
            e(str);
        }
    }

    private void e(String str) {
        LogUtil.a("HwMultiDeviceManager", "getAssistantAndSetMainDevice deviceIdentify: ", CommonUtil.n(str));
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "mainDeviceUpdate");
        if (this.f42631c.b(str, deviceList) || !this.f42631c.b(deviceList)) {
            List<DeviceInfo> listA = this.f42631c.a(str, deviceList);
            DeviceInfo deviceInfoC = this.f42631c.c(listA);
            if (deviceInfoC != null) {
                a(deviceInfoC, listA);
                return;
            } else {
                this.f42631c.d(listA);
                mkl.d().c(listA, "isMainDeleteUpdate");
                return;
            }
        }
        List<DeviceInfo> listA2 = this.f42631c.a(str, deviceList);
        this.f42631c.d(listA2);
        mkl.d().c(listA2, "notMainDeleteUpdate");
    }

    private void a(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (DeviceInfo deviceInfo2 : list) {
            if (deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                deviceInfo2.setRelationship("main_relationship");
                break;
            }
        }
        this.f42631c.d(list);
        mkl.d().c(list, "updateMainShip");
    }

    private void a(String str) {
        LogUtil.a("HwMultiDeviceManager", "disconnectDevice deviceIdentify: ", CommonUtil.n(str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (mkm.d().a(str)) {
            LogUtil.a("HwMultiDeviceManager", "disconnectDevice isNewDeviceList");
            mkm.d().c(str);
        } else {
            LogUtil.a("HwMultiDeviceManager", "disconnectDevice disconnectDevice");
            mkf.d().e(str);
        }
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "disconnectDevice")) {
            if (deviceInfo != null && str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                d(deviceInfo);
                return;
            }
        }
    }

    private void d(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceBluetoothType() != 2 || BTDeviceMgrUtil.c().a(deviceInfo.getDeviceIdentify())) {
            return;
        }
        LogUtil.j("HwMultiDeviceManager", "removeBTDeviceInstance Remove bond device fail.");
        lng.c("MultiDeviceMessage", "deviceName: " + deviceInfo.getDeviceName() + ", removeBTDeviceInstance Remove bond device fail.");
    }

    public void a(DeviceInfo deviceInfo) {
        List<DeviceInfo> listC = c();
        for (DeviceInfo deviceInfo2 : listC) {
            if (eel.d(deviceInfo2.getProductType()) && deviceInfo2.getDeviceActiveState() == 1 && !deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                LogUtil.a("HwMultiDeviceManager", "handleSwitchScenarioAw70 has active aw70 device");
                deviceInfo.setRelationship("unactive_relationship");
                a(deviceInfo2.getDeviceIdentify());
            }
        }
        this.f42631c.d(listC);
        mkl.d().c(listC, "handleSwitchScenarioAw70");
    }

    public void d() {
        a();
    }

    private static void a() {
        synchronized (e) {
            f42630a = null;
        }
    }
}
