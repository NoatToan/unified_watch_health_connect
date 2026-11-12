package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyValDbManager;

/* JADX INFO: loaded from: classes.dex */
public class ipc {
    public static boolean d() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "CapabilityUtils");
        if (deviceInfo == null) {
            LogUtil.j("CapabilityUtils", "Device info is null");
            return false;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            return deviceInfo.getProductType() == 105;
        }
        LogUtil.j("CapabilityUtils", "Device is unconnected");
        return false;
    }

    public static boolean b() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("hide_arkui_key");
        return !TextUtils.isEmpty(strC) && Boolean.parseBoolean(strC);
    }

    public static boolean c() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "CapabilityUtils");
        if (deviceInfo == null) {
            LogUtil.j("CapabilityUtils", "Device info is null");
            return true;
        }
        boolean zD = eey.d(deviceInfo, 333);
        boolean zD2 = eey.d(deviceInfo, 243);
        LogUtil.a("CapabilityUtils", "isSupportHeathInsight: ", Boolean.valueOf(zD), " ,isSupportCloudSideAddExtraField: ", Boolean.valueOf(zD2));
        return zD || !zD2;
    }
}
