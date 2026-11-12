package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwdevicestatusmgr.HwDeviceStatusPushManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mlo implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mlo f41881a;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, Integer> f41882c = new HashMap(16);

    private mlo() {
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        if (cpx.e()) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "getResult is not debug version.");
            return;
        }
        if (deviceInfo == null || bArr == null) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "getResult deviceInfo is null or dataInfos is null.");
            return;
        }
        String strE = eeq.e(bArr);
        LogUtil.a("DEVMGR_AutoSwitchManager", "getResult message:", strE, " deviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        if (strE.length() < 4) {
            lng.c("MultiDeviceMessage", "deviceName: " + deviceInfo.getDeviceName() + ", tlv length is error");
            return;
        }
        try {
            List<eew> listE = new eet().b(strE.substring(4)).e();
            byte b2 = bArr[1];
            if (b2 == 61) {
                d(listE, deviceInfo);
            } else if (b2 == 62) {
                a(listE, deviceInfo);
            } else {
                LogUtil.j("DEVMGR_AutoSwitchManager", "Unsupported command");
            }
        } catch (eeu unused) {
            lng.c("MultiDeviceMessage", "deviceName: " + deviceInfo.getDeviceName() + ", tlv structure is error");
            LogUtil.e("DEVMGR_AutoSwitchManager", "getResult TlvException");
        }
    }

    private void d(List<eew> list, DeviceInfo deviceInfo) {
        if (list == null || list.size() == 0) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "receiveDeviceReportStatus tlvList is error.");
            return;
        }
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) != 1) {
                LogUtil.j("DEVMGR_AutoSwitchManager", "receiveDeviceReportStatus parameter is invalid.");
            } else {
                int iV = CommonUtil.v(eewVar.b());
                d(deviceInfo, iV);
                HwDeviceStatusPushManager.b().d(iV, deviceInfo);
            }
        }
    }

    private void a(List<eew> list, DeviceInfo deviceInfo) {
        if (list == null || list.size() == 0) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "receiveDevicePreempt tlvList is error.");
            return;
        }
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 1) {
                c(deviceInfo, CommonUtil.v(eewVar.b()));
            } else if (iV != 2) {
                LogUtil.j("DEVMGR_AutoSwitchManager", "receiveDeviceReportStatus parameter is invalid.");
            } else {
                LogUtil.j("DEVMGR_AutoSwitchManager", "receiveDevicePreempt usedDeviceName :", eeq.d(eewVar.b()));
            }
        }
    }

    private void c(DeviceInfo deviceInfo, int i) {
        if (i != 1) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "handleDevicePreempt state is invalid.");
            lng.c("MultiDeviceMessage", "deviceName: " + deviceInfo.getDeviceName() + ", handleDevicePreempt state is invalid.");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "DEVMGR_AutoSwitchManager");
        DeviceInfo deviceInfo2 = (deviceList == null || deviceList.size() == 0) ? null : deviceList.get(0);
        if (deviceInfo2 == null) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "handleDevicePreempt mainDevice is null.");
            a((DeviceInfo) null, deviceInfo);
        } else {
            a(deviceInfo2, deviceInfo);
        }
    }

    private void d(DeviceInfo deviceInfo, int i) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "deviceIdentify is empty.");
            return;
        }
        int iIntValue = f41882c.containsKey(deviceIdentify) ? f41882c.get(deviceIdentify).intValue() : 1;
        LogUtil.a("DEVMGR_AutoSwitchManager", "wearState change oldWearState: ", Integer.valueOf(iIntValue), " newWearState: ", Integer.valueOf(i), " deviceIdentify:", CommonUtil.n(deviceIdentify));
        f41882c.put(deviceIdentify, Integer.valueOf(i == 3 ? 1 : i));
        if (iIntValue == i) {
            return;
        }
        if (i == 3) {
            i = 1;
        }
        e(deviceInfo, i);
    }

    private void e(final DeviceInfo deviceInfo, final int i) {
        mhs.a().getSwitchSetting("device_auto_switch", new IBaseResponseCallback() { // from class: mlo.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LogUtil.a("DEVMGR_AutoSwitchManager", "getAutoSwitchSetting errorCode: ", Integer.valueOf(i2));
                boolean zEquals = (i2 == 0 && (obj instanceof String)) ? "1".equals((String) obj) : true;
                LogUtil.a("DEVMGR_AutoSwitchManager", "getAutoSwitchSetting isEnable: ", Boolean.valueOf(zEquals));
                if (zEquals) {
                    mlo.this.a(deviceInfo, i);
                } else {
                    LogUtil.a("DEVMGR_AutoSwitchManager", "getAutoSwitchSetting wearing status switch is not on");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo, int i) {
        for (DeviceInfo deviceInfo2 : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DEVMGR_AutoSwitchManager")) {
            if (deviceInfo.getDeviceIdentify().equals(deviceInfo2.getDeviceIdentify())) {
                String relationship = deviceInfo2.getRelationship();
                if ("main_relationship".equals(relationship)) {
                    f(deviceInfo, i);
                    return;
                } else if ("assistant_relationship".equals(relationship)) {
                    h(deviceInfo, i);
                    return;
                } else {
                    LogUtil.j("DEVMGR_AutoSwitchManager", "The device status is not main or assistant relationship: ", relationship);
                    return;
                }
            }
        }
    }

    private void f(DeviceInfo deviceInfo, int i) {
        if (i == 2) {
            LogUtil.a("DEVMGR_AutoSwitchManager", "processMainDeviceStateChange device is already main: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            return;
        }
        if (i != 1) {
            LogUtil.a("DEVMGR_AutoSwitchManager", "processMainDeviceStateChange wearState is error");
            return;
        }
        if (lre.b(deviceInfo.getDeviceIdentify()) || mkb.q(deviceInfo.getDeviceIdentify())) {
            LogUtil.a("DEVMGR_AutoSwitchManager", "doSwitchDevice main device is ota updating, return");
            return;
        }
        DeviceInfo deviceInfo2 = null;
        for (DeviceInfo deviceInfo3 : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DEVMGR_AutoSwitchManager")) {
            LogUtil.a("DEVMGR_AutoSwitchManager", "processMainDeviceStateChange connectDeviceInfo: ", CommonUtil.n(deviceInfo3.getDeviceIdentify()), " relationship: ", deviceInfo3.getRelationship());
            if ("assistant_relationship".equals(deviceInfo3.getRelationship())) {
                String deviceIdentify = deviceInfo3.getDeviceIdentify();
                int iE = e(deviceIdentify);
                LogUtil.a("DEVMGR_AutoSwitchManager", "processMainDeviceStateChange assistantDeviceIdentify: ", CommonUtil.n(deviceIdentify), " assistantDeviceWearState: ", Integer.valueOf(iE), " lastConnectedTime: ", Long.valueOf(deviceInfo.getLastConnectedTime()));
                if (iE == 2) {
                    if (deviceInfo2 != null) {
                        if (deviceInfo3.getLastConnectedTime() > deviceInfo2.getLastConnectedTime()) {
                        }
                    }
                    deviceInfo2 = deviceInfo3;
                }
            }
        }
        if (deviceInfo2 == null) {
            LogUtil.a("DEVMGR_AutoSwitchManager", "processMainDeviceStateChange cannot find the device to switch");
        } else {
            a(deviceInfo, deviceInfo2);
        }
    }

    private boolean e(DeviceInfo deviceInfo) {
        LogUtil.j("DEVMGR_AutoSwitchManager", "isSetUpDeviceStatus main device: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        if (!mxg.b().a(deviceInfo)) {
            LogUtil.a("DEVMGR_AutoSwitchManager", "isSetUpDeviceStatus main device no support multi connect.");
            return true;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (e(deviceIdentify) == 2) {
            LogUtil.a("DEVMGR_AutoSwitchManager", "isSetUpDeviceStatus main device is wore.");
            return true;
        }
        if (!lre.b(deviceIdentify) && !mkb.q(deviceIdentify)) {
            return false;
        }
        LogUtil.a("DEVMGR_AutoSwitchManager", "isSetUpDeviceStatus main device is ota updating.");
        return true;
    }

    private int e(String str) {
        Integer num = f41882c.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private void h(DeviceInfo deviceInfo, int i) {
        if (i == 1) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "processAssistantDeviceStateChange device is already assistant: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            return;
        }
        if (i == 2) {
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "DEVMGR_AutoSwitchManager");
            DeviceInfo deviceInfo2 = (deviceList == null || deviceList.size() == 0) ? null : deviceList.get(0);
            if (deviceInfo2 == null) {
                LogUtil.a("DEVMGR_AutoSwitchManager", "processAssistantDeviceStateChange have no mainDevice");
                a((DeviceInfo) null, deviceInfo);
                return;
            }
            if (deviceInfo2.getDeviceConnectState() == 1) {
                LogUtil.a("DEVMGR_AutoSwitchManager", "processAssistantDeviceStateChange mainDevice is connecting, return.");
                return;
            }
            if (deviceInfo2.getDeviceConnectState() != 2) {
                LogUtil.a("DEVMGR_AutoSwitchManager", "processAssistantDeviceStateChange mainDevice is not connected");
                a(deviceInfo2, deviceInfo);
                return;
            }
            int iE = e(deviceInfo2.getDeviceIdentify());
            if (e(deviceInfo2)) {
                ReleaseLogUtil.d("DEVMGR_AutoSwitchManager", "processAssistantDeviceStateChange mainDeviceWearState is wear");
                d(deviceInfo, 2, deviceInfo2.getDeviceName(), 1);
                return;
            } else {
                LogUtil.a("DEVMGR_AutoSwitchManager", "processAssistantDeviceStateChange mainDeviceWearState is not wear: ", Integer.valueOf(iE));
                a(deviceInfo2, deviceInfo);
                return;
            }
        }
        LogUtil.a("DEVMGR_AutoSwitchManager", "processAssistantDeviceStateChange wearState is error");
    }

    private void a(DeviceInfo deviceInfo, DeviceInfo deviceInfo2) {
        String deviceIdentify;
        String deviceIdentify2 = "";
        if (deviceInfo == null) {
            deviceIdentify = "";
        } else {
            deviceIdentify = deviceInfo.getDeviceIdentify();
        }
        if (deviceInfo2 != null) {
            deviceIdentify2 = deviceInfo2.getDeviceIdentify();
            b(deviceInfo2.getDeviceName());
        }
        ReleaseLogUtil.d("DEVMGR_AutoSwitchManager", "doSwitchDevice oldIdentify: ", CommonUtil.n(deviceIdentify), " newIdentify: ", CommonUtil.n(deviceIdentify2));
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DEVMGR_AutoSwitchManager");
        for (DeviceInfo deviceInfo3 : deviceList) {
            if (deviceIdentify2 != null && deviceIdentify2.equals(deviceInfo3.getDeviceIdentify())) {
                deviceInfo3.setDeviceActiveState(1);
            }
        }
        mkf.e(BaseApplication.getContext()).switchDevice(deviceList, deviceIdentify2);
    }

    private void b(String str) {
        if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "firstReportSwitch"))) {
            LogUtil.a("DEVMGR_AutoSwitchManager", "handleFirstReportSwitch sp value is empty.", CommonUtil.n(str));
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "firstReportSwitch", "1", new StorageParams());
            if (TextUtils.isEmpty(str)) {
                return;
            }
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10024), "firstReportSwitchDeviceName", str, new StorageParams());
        }
    }

    public void d(DeviceInfo deviceInfo, int i, String str, int i2) {
        if (cpx.e()) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "setUpDeviceStatus is not debug version.");
            return;
        }
        if (!mxg.b().a(deviceInfo)) {
            LogUtil.a("DEVMGR_AutoSwitchManager", "setUpDeviceStatus current device is not support dual device: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(62);
        String strD = eeq.d(i);
        String str2 = eeq.d(1) + eeq.d(strD.length() / 2) + strD;
        String strA = eeq.a(str);
        String str3 = eeq.d(2) + eeq.b(strA.length() / 2) + strA;
        String strD2 = eeq.d(i2);
        String str4 = str2 + str3 + (eeq.d(3) + eeq.d(strD2.length() / 2) + strD2);
        deviceCommand.setDataContent(eeq.c(str4));
        deviceCommand.setDataLen(eeq.c(str4).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("DEVMGR_AutoSwitchManager", "setUpDeviceStatus: ", deviceCommand.toString(), " device: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    public static mlo d() {
        mlo mloVar;
        synchronized (e) {
            if (f41881a == null) {
                f41881a = new mlo();
            }
            mloVar = f41881a;
        }
        return mloVar;
    }

    public void b(DeviceInfo deviceInfo, int i) {
        if (cpx.e()) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "afterUnderConnectStateChanged is not debug version.");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "deviceInfo is null");
            return;
        }
        if (!mxg.b().a(deviceInfo)) {
            LogUtil.j("DEVMGR_AutoSwitchManager", "afterUnderConnectStateChanged current device is not support dual device: ", CommonUtil.n(deviceInfo.getDeviceIdentify()), " btState:", Integer.valueOf(i));
            return;
        }
        LogUtil.a("DEVMGR_AutoSwitchManager", "afterUnderConnectStateChanged deviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " btState:", Integer.valueOf(i));
        if (i == 3) {
            d(deviceInfo, 3);
        } else if (i == 2) {
            d(deviceInfo);
            c(deviceInfo);
        } else {
            LogUtil.a("DEVMGR_AutoSwitchManager", "afterUnderConnectStateChanged other connect state");
        }
    }

    private void d(DeviceInfo deviceInfo) {
        String deviceName;
        DeviceInfo deviceInfo2 = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "DEVMGR_AutoSwitchManager");
        if (deviceList != null && deviceList.size() != 0) {
            deviceInfo2 = deviceList.get(0);
        }
        if (deviceInfo2 == null) {
            deviceName = "";
        } else {
            deviceName = deviceInfo2.getDeviceName();
        }
        if ("main_relationship".equals(deviceInfo.getRelationship())) {
            d(deviceInfo, 1, deviceName, 0);
        } else if ("assistant_relationship".equals(deviceInfo.getRelationship())) {
            d(deviceInfo, 2, deviceName, 0);
        } else {
            LogUtil.a("DEVMGR_AutoSwitchManager", "beforeSendConnectStateBroadcast relationship is :", deviceInfo.getRelationship());
        }
    }

    private void c(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(61);
        String str = eeq.d(1) + eeq.d(0);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("DEVMGR_AutoSwitchManager", "queryWearStatus: ", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }
}
