package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.unitedevice.entity.UniteDevice;
import com.huawei.unitedevice.p2p.EnumCapabilityItem;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class col {
    public static boolean b(String str, EnumCapabilityItem enumCapabilityItem) {
        if (TextUtils.isEmpty(str) || enumCapabilityItem == null) {
            LogUtil.e("CapabilityUtils", "isSupport deviceId or item is empty.");
            return false;
        }
        UniteDevice uniteDeviceE = xio.c().e(str);
        if (uniteDeviceE == null) {
            LogUtil.e("CapabilityUtils", "getOtherConnectedDevice is invalid.");
            return false;
        }
        if (!str.equals(uniteDeviceE.getIdentify())) {
            LogUtil.e("CapabilityUtils", "deviceId not equal");
            return false;
        }
        if (b(uniteDeviceE, enumCapabilityItem.getValue())) {
            return true;
        }
        return e(uniteDeviceE, enumCapabilityItem);
    }

    private static boolean e(UniteDevice uniteDevice, EnumCapabilityItem enumCapabilityItem) {
        if (uniteDevice == null) {
            LogUtil.e("CapabilityUtils", "isSupportOldCapability deviceInfo is null");
            return false;
        }
        if (TextUtils.isEmpty(uniteDevice.getIdentify())) {
            LogUtil.e("CapabilityUtils", "isSupportOldCapability deviceIdentify is empty");
            return false;
        }
        ExternalDeviceCapability capability = uniteDevice.getCapability();
        DeviceCapability compatibleCapacity = capability != null ? capability.getCompatibleCapacity() : null;
        if (compatibleCapacity == null) {
            LogUtil.e("CapabilityUtils", "isSupportOldCapability deviceCapability is null");
            return false;
        }
        if (enumCapabilityItem.getValue() == 2) {
            return compatibleCapacity.isSupportHiWear();
        }
        if (enumCapabilityItem.getValue() >= 3 && enumCapabilityItem.getValue() <= 12) {
            return compatibleCapacity.isSupportWearEngine();
        }
        if (enumCapabilityItem.getValue() == 13) {
            return compatibleCapacity.isSupportCheckDeviceSpace();
        }
        return false;
    }

    public static boolean b(UniteDevice uniteDevice, int i) {
        if (uniteDevice == null) {
            LogUtil.e("CapabilityUtils", "checkSupportCapability deviceInfo is null");
            return false;
        }
        if (uniteDevice.getCapability() == null) {
            LogUtil.e("CapabilityUtils", "device Capability is null");
            return false;
        }
        String capacity = uniteDevice.getCapability().getCapacity();
        LogUtil.b("CapabilityUtils", "checkSupportCapability hexString: ", capacity);
        boolean zB = capacity != null ? b(cph.d(capacity), i) : false;
        LogUtil.b("CapabilityUtils", "checkSupportCapability isSupport: ", Boolean.valueOf(zB));
        return zB;
    }

    public static boolean b(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0 || i >= bArr.length * 8) {
            return false;
        }
        if (i < 0) {
            LogUtil.e("CapabilityUtils", "isSupport target: ", Integer.valueOf(i));
            return false;
        }
        int i2 = bArr[i / 8];
        int i3 = 1 << (i % 8);
        return (i2 & i3) == i3;
    }
}
