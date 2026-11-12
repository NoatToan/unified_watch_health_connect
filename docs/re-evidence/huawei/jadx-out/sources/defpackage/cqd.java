package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.model.CommonUtil;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cqd {
    public static boolean c(DeviceInfo deviceInfo, int i) {
        LogUtil.b(CommonUtil.TAG, "checkSupportCapability");
        if (deviceInfo == null) {
            LogUtil.e(CommonUtil.TAG, "checkSupportCapability deviceInfo is null");
            return false;
        }
        String expandCapability = deviceInfo.getExpandCapability();
        LogUtil.b(CommonUtil.TAG, "checkSupportCapability hexString: ", expandCapability);
        if (expandCapability != null) {
            return b(cph.d(expandCapability), i);
        }
        return false;
    }

    private static boolean b(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0 || i >= bArr.length * 8) {
            return false;
        }
        if (i < 0) {
            LogUtil.e(CommonUtil.TAG, "isSupport target : ", Integer.valueOf(i));
            return false;
        }
        int i2 = bArr[i / 8];
        int i3 = 1 << (i % 8);
        return (i2 & i3) == i3;
    }
}
