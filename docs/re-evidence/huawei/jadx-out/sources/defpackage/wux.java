package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class wux {
    public static String e() {
        DeviceInfo deviceInfoC = mgg.c("PressureMeasureUtils");
        if (deviceInfoC != null) {
            String deviceName = deviceInfoC.getDeviceName();
            LogUtil.d("PressureMeasureUtils", "deviceName = " + deviceName);
            return deviceName;
        }
        return "";
    }
}
