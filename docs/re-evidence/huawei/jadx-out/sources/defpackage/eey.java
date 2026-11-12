package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class eey {
    public static boolean d(DeviceInfo deviceInfo, int i) {
        return e(deviceInfo, i);
    }

    private static boolean d(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0 || i >= bArr.length * 8) {
            return false;
        }
        if (i < 0) {
            LogUtil.j(CommonUtil.TAG, "isSupport target : ", Integer.valueOf(i));
            return false;
        }
        int i2 = bArr[i / 8];
        int i3 = 1 << (i % 8);
        return (i2 & i3) == i3;
    }

    public static boolean e(DeviceInfo deviceInfo, int... iArr) {
        if (deviceInfo == null || iArr == null || iArr.length < 1) {
            LogUtil.j(CommonUtil.TAG, "checkSupportAndCapability deviceInfo is null, or bitIndexs is empty");
            return false;
        }
        String expandCapability = deviceInfo.getExpandCapability();
        LogUtil.a(CommonUtil.TAG, "checkSupportAndCapability hexString: ", expandCapability);
        if (expandCapability == null) {
            return false;
        }
        byte[] bArrC = eeq.c(expandCapability);
        for (int i : iArr) {
            if (!d(bArrC, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(DeviceInfo deviceInfo, int... iArr) {
        if (deviceInfo == null || iArr == null || iArr.length < 1) {
            LogUtil.j(CommonUtil.TAG, "checkSupportOrCapability deviceInfo is null, or bitIndexs is empty");
            return false;
        }
        String expandCapability = deviceInfo.getExpandCapability();
        LogUtil.a(CommonUtil.TAG, "checkSupportOrCapability hexString: ", expandCapability);
        if (expandCapability != null) {
            byte[] bArrC = eeq.c(expandCapability);
            for (int i : iArr) {
                if (d(bArrC, i)) {
                    return true;
                }
            }
        }
        return false;
    }
}
