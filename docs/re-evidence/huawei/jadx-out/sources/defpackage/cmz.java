package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cmz {
    public static boolean c(int i) {
        return 4 == i;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return cnd.a().d(str);
    }

    public static boolean a(String str) {
        if (b(str)) {
            return cnd.a().b(str);
        }
        return false;
    }

    public static void a(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null) {
            LogUtil.e("HiChain3CommandUtil", "setIsHiChain3DeviceOn btDeviceInfo is null");
        } else if (b(deviceInfo.getDeviceMac())) {
            cnd.a().b(deviceInfo.getDeviceMac(), z);
        }
    }
}
