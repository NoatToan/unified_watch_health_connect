package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class izs {
    public static final boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("DevicesInfoUtils", "deviceInfo is null");
            return false;
        }
        int productType = deviceInfo.getProductType();
        LogUtil.a("DevicesInfoUtils", "productType:", Integer.valueOf(productType));
        if (productType == 63) {
            return true;
        }
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        return productType == 36 && deviceCapabilityA != null && deviceCapabilityA.isSupportWorkoutCapabilicy();
    }
}
