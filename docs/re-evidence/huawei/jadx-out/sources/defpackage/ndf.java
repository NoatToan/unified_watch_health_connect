package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ndf {
    private static List<String> d = new ArrayList(5);

    public static void c(Intent intent) {
        if (intent == null) {
            LogUtil.j("HwNotificationBleBroadcast", "intent is null.");
            return;
        }
        String stringExtra = intent.getStringExtra("devType");
        if (("09C".equals(stringExtra) || "02E".equals(stringExtra)) && e(intent.getStringExtra("reqId"))) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("targetDevice");
        int intExtra = intent.getIntExtra("reconnectAble", 0);
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            LogUtil.j("HwNotificationBleBroadcast", "deviceType or targetDevice is null");
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwNotificationBleBroadcast");
        LogUtil.a("HwNotificationBleBroadcast", "deviceInfoList size", Integer.valueOf(deviceList.size()), "deviceType", stringExtra);
        if (intExtra == 1) {
            LogUtil.a("HwNotificationBleBroadcast", "enter reconnectAble");
            DeviceInfo deviceInfoA = a(stringExtra2);
            if (deviceInfoA == null) {
                return;
            }
            a(deviceInfoA, deviceList);
            c(deviceInfoA);
            return;
        }
        a(intent, stringExtra, stringExtra2);
    }

    private static void a(Intent intent, String str, String str2) {
        if ("09C".equals(str) || "02E".equals(str)) {
            if (c()) {
                String strC = c(str2);
                if (TextUtils.isEmpty(strC)) {
                    LogUtil.j("HwNotificationBleBroadcast", "identify is empty");
                    return;
                } else if (lre.b(strC) || mkb.q(strC)) {
                    LogUtil.j("HwNotificationBleBroadcast", "OTA is update");
                    return;
                } else {
                    mkf.e(BaseApplication.getContext()).unPair(Arrays.asList(strC), false);
                    return;
                }
            }
            if (d()) {
                d(intent, str2, str);
                return;
            } else {
                LogUtil.j("HwNotificationBleBroadcast", "SingleLink and MultiLink is not support");
                return;
            }
        }
        g(str2);
    }

    private static void d(Intent intent, String str, String str2) {
        if (d(str)) {
            DeviceInfo deviceInfoA = a(str);
            if (deviceInfoA == null) {
                LogUtil.j("HwNotificationBleBroadcast", "dealMultiLinkMessage deviceInfo is null");
                return;
            }
            int sportVersion = deviceInfoA.getSportVersion();
            if (sportVersion != -1) {
                LogUtil.a("HwNotificationBleBroadcast", "dealMultiLinkMessage sportVersion not default value, use new logic");
                if (sportVersion == 1) {
                    LogUtil.a("HwNotificationBleBroadcast", "dealMultiLinkMessage sportVersion is one");
                    a();
                    return;
                } else {
                    b(intent, str, str2);
                    return;
                }
            }
            DeviceCapability deviceCapabilityC = mkb.c(c(str));
            if (deviceCapabilityC != null && deviceCapabilityC.isSupportSmartWatchVersionStatus()) {
                LogUtil.a("HwNotificationBleBroadcast", "enter sendSeizeMessageToDevice");
                a();
            } else {
                b(intent, str, str2);
            }
        }
    }

    private static void b(Intent intent, String str, String str2) {
        LogUtil.a("HwNotificationBleBroadcast", "dealSportDeviceSeize exercise sport enter.");
        DeviceCommand deviceCommandD = d(intent.getStringExtra("reqId"), str2, intent.getIntExtra("timeout", 30), c(str));
        if (deviceCommandD == null) {
            LogUtil.j("HwNotificationBleBroadcast", "cloud push info is wrong, please check cloud data.");
        } else {
            mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommandD);
        }
    }

    private static DeviceInfo a(String str) {
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwNotificationBleBroadcast")) {
            if (deviceInfo.getDeviceIdentify().replace(":", "").endsWith(str)) {
                LogUtil.d("HwNotificationBleBroadcast", "btDeviceIdentify", deviceInfo.getDeviceIdentify());
                return deviceInfo;
            }
        }
        return null;
    }

    private static void g(String str) {
        if (c()) {
            String strC = c(str);
            if (TextUtils.isEmpty(strC)) {
                LogUtil.j("HwNotificationBleBroadcast", "identify is empty");
                return;
            } else if (lre.b(strC) || mkb.q(strC)) {
                LogUtil.j("HwNotificationBleBroadcast", "OTA is update");
                return;
            } else {
                mkf.e(BaseApplication.getContext()).unPair(Arrays.asList(strC), false);
                return;
            }
        }
        LogUtil.j("HwNotificationBleBroadcast", "SingleLink and MultiLink is not support");
    }

    private static String c(String str) {
        for (DeviceInfo deviceInfo : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwNotificationBleBroadcast")) {
            if (deviceInfo.getDeviceIdentify().replace(":", "").endsWith(str)) {
                LogUtil.d("HwNotificationBleBroadcast", "getDeviceIdentify", deviceInfo.getDeviceIdentify());
                return deviceInfo.getDeviceIdentify();
            }
        }
        return "";
    }

    private static boolean c() {
        DeviceInfo deviceInfoE = e();
        if (deviceInfoE == null) {
            LogUtil.j("HwNotificationBleBroadcast", "isSupportSingleLink: no device connect. can not push device.");
            return false;
        }
        boolean zA = CommonUtil.a(eeq.c(deviceInfoE.getExpandCapability()), 51);
        LogUtil.a("HwNotificationBleBroadcast", "isSupportSingleLink: ", Boolean.valueOf(zA));
        return zA;
    }

    private static boolean d() {
        DeviceInfo deviceInfoE = e();
        if (deviceInfoE == null) {
            LogUtil.j("HwNotificationBleBroadcast", "no device connect. can not push device.");
            return false;
        }
        boolean zA = CommonUtil.a(eeq.c(deviceInfoE.getExpandCapability()), 25);
        LogUtil.a("HwNotificationBleBroadcast", "isSupportMultiLink: ", Boolean.valueOf(zA));
        return zA;
    }

    private static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        DeviceInfo deviceInfoE = e();
        if (deviceInfoE == null) {
            LogUtil.j("HwNotificationBleBroadcast", "no device connect. can not push device.");
            return false;
        }
        if (str.equalsIgnoreCase(b(deviceInfoE.getMultiLinkBleMac()))) {
            return true;
        }
        LogUtil.j("HwNotificationBleBroadcast", "not target device : ", str);
        return false;
    }

    private static void a(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        if (deviceInfo == null || list == null) {
            return;
        }
        if (eel.d(deviceInfo.getProductType())) {
            LogUtil.a("HwNotificationBleBroadcast", "handleWorkMode goingReConnected == AW70");
            for (DeviceInfo deviceInfo2 : list) {
                if (deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                    LogUtil.a("HwNotificationBleBroadcast", "Reconnected AW70 set device enable");
                    deviceInfo2.setDeviceActiveState(1);
                    deviceInfo2.setDeviceConnectState(1);
                } else if (eel.d(deviceInfo2.getProductType())) {
                    LogUtil.a("HwNotificationBleBroadcast", "Connected AW70 target device disable");
                    deviceInfo2.setDeviceActiveState(0);
                    deviceInfo2.setDeviceConnectState(3);
                } else {
                    LogUtil.j("HwNotificationBleBroadcast", "handleDeviceState is other");
                }
            }
            return;
        }
        LogUtil.a("HwNotificationBleBroadcast", "handleWorkMode goingConnected == DeviceWorkMode.BAND_MODE");
        for (DeviceInfo deviceInfo3 : list) {
            if (deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo3.getDeviceIdentify())) {
                LogUtil.a("HwNotificationBleBroadcast", "handleWorkMode set device enable");
                deviceInfo3.setDeviceActiveState(1);
                deviceInfo3.setDeviceConnectState(1);
            }
            if (!deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo3.getDeviceIdentify()) && deviceInfo3.getAutoDetectSwitchStatus() != 1 && deviceInfo3.getDeviceActiveState() == 1) {
                LogUtil.a("HwNotificationBleBroadcast", "handleWorkMode target device disable");
                deviceInfo3.setDeviceActiveState(0);
                deviceInfo3.setDeviceConnectState(3);
            }
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplaceAll = str.replaceAll(":", "");
        int length = strReplaceAll.length();
        if (length > 3) {
            return strReplaceAll.substring(length - 3, length);
        }
        return null;
    }

    private static DeviceCommand d(String str, String str2, int i, String str3) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwNotificationBleBroadcast", "requestId is empty.");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("HwNotificationBleBroadcast", "deviceType is empty.");
            return null;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceId(2);
        deviceCommand.setCommandId(15);
        StringBuilder sb = new StringBuilder(16);
        String strA = eeq.a(str);
        sb.append(eeq.d(1));
        sb.append(eeq.b(strA.length() / 2));
        sb.append(strA);
        String strA2 = eeq.a(str2);
        sb.append(eeq.d(2));
        sb.append(eeq.b(strA2.length() / 2));
        sb.append(strA2);
        String strD = eeq.d(i);
        sb.append(eeq.d(3));
        sb.append(eeq.b(strD.length() / 2));
        sb.append(strD);
        byte[] bArrC = eeq.c(sb.toString());
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setmIdentify(str3);
        return deviceCommand;
    }

    private static DeviceInfo e() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwNotificationBleBroadcast");
        if (deviceList != null && deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }

    private static void a() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(1);
        deviceCommand.setCommandID(58);
        String strD = eeq.d(1);
        StringBuilder sb = new StringBuilder(16);
        sb.append(eeq.d(1));
        sb.append(eeq.d(1));
        sb.append(strD);
        deviceCommand.setDataLen(sb.length());
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("HwNotificationBleBroadcast", "sendSeizeMessage:", deviceCommand.toString());
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private static void c(DeviceInfo deviceInfo) {
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo2 = new com.huawei.devicesdk.entity.DeviceInfo();
        deviceInfo2.setDeviceBtType(deviceInfo.getDeviceBluetoothType());
        deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
        deviceInfo2.setDeviceMac(deviceInfo.getDeviceIdentify());
        deviceInfo2.setDeviceType(deviceInfo.getProductType());
        mkf.e(BaseApplication.getContext()).connectDevice(deviceInfo2, 0);
    }

    private static boolean e(String str) {
        for (int i = 0; i < d.size(); i++) {
            if (str.equals(d.get(i))) {
                LogUtil.a("HwNotificationBleBroadcast", "requestId is repeated");
                return true;
            }
        }
        if (d.size() >= 5) {
            d.remove(0);
        }
        d.add(str);
        return false;
    }
}
