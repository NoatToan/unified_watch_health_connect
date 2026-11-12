package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class mwy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, String> f42617c = new ConcurrentHashMap(24);

    public static void a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.j("HwMultiDeviceSettingUtils", "copyDeviceRelationMap deviceRelationMap is empty.");
            return;
        }
        f42617c.clear();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            f42617c.put(entry.getKey(), entry.getValue());
        }
    }

    public static void d(List<DeviceInfo> list) {
        if (cpx.e()) {
            LogUtil.j("HwMultiDeviceSettingUtils", "setMultiDeviceState is not debug version.");
            return;
        }
        if (coq.d(list)) {
            LogUtil.j("HwMultiDeviceSettingUtils", "setMultiDeviceState deviceInfoList is empty.");
            return;
        }
        String strE = e(list);
        ArrayList arrayList = new ArrayList(5);
        List<DeviceInfo> listE = mkm.d().e();
        for (DeviceInfo deviceInfo : list) {
            if (!mxg.b().a(deviceInfo)) {
                LogUtil.j("HwMultiDeviceSettingUtils", "setMultiDeviceState no support multi device connect.");
            } else if (TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                LogUtil.j("HwMultiDeviceSettingUtils", "setMultiDeviceState deviceIdentify is empty.");
            } else if (!b(deviceInfo.getDeviceIdentify(), listE)) {
                LogUtil.j("HwMultiDeviceSettingUtils", "deviceInfo is not connected: ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            } else {
                String str = f42617c.get(deviceInfo.getDeviceIdentify());
                String relationship = deviceInfo.getRelationship();
                if ("main_relationship".equalsIgnoreCase(str) && "assistant_relationship".equalsIgnoreCase(relationship)) {
                    arrayList.add(deviceInfo);
                }
                if ("assistant_relationship".equalsIgnoreCase(str) && "main_relationship".equalsIgnoreCase(relationship)) {
                    ReleaseLogUtil.d("DEVMGR_HwMultiDeviceSettingUtils", "setMultiDeviceState main device name: ", deviceInfo.getDeviceName());
                    deviceInfo.setDeviceConnectState(1);
                    mkn.e().a(deviceInfo, 1);
                    mlo.d().d(deviceInfo, 1, strE, 0);
                }
            }
        }
        c(arrayList, strE);
    }

    private static void c(List<DeviceInfo> list, String str) {
        for (DeviceInfo deviceInfo : list) {
            ReleaseLogUtil.d("DEVMGR_HwMultiDeviceSettingUtils", "setMainToAssistantDeviceState assistant device name: ", deviceInfo.getDeviceName());
            mlo.d().d(deviceInfo, 2, str, 0);
            deviceInfo.setDeviceConnectState(3);
            mkn.e().a(deviceInfo, 3);
        }
    }

    private static boolean b(String str, List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && str.equals(deviceInfo.getDeviceIdentify())) {
                return deviceInfo.getDeviceConnectState() == 2;
            }
        }
        return false;
    }

    private static String e(List<DeviceInfo> list) {
        String deviceName = "";
        for (DeviceInfo deviceInfo : list) {
            if ("main_relationship".equalsIgnoreCase(deviceInfo.getRelationship())) {
                deviceName = deviceInfo.getDeviceName();
            }
        }
        ReleaseLogUtil.d("DEVMGR_HwMultiDeviceSettingUtils", "getMainDeviceName mainDeviceName: ", deviceName);
        return deviceName;
    }
}
