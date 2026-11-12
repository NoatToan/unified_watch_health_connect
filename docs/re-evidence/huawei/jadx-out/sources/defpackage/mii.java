package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.SharedPreferenceManager;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mii {
    public static boolean d(String str) {
        Map<String, DeviceCapability> mapD;
        if (EnvironmentUtils.e()) {
            mapD = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, str, "HwAcquireAgreementUtils");
        } else {
            mapD = lvb.e().d(1, str, "HwAcquireAgreementUtils");
        }
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.a("HwAcquireAgreementUtils", "isSupportHarmonyAgreement deviceCapabilityHashMaps is empty");
            return false;
        }
        DeviceCapability deviceCapability = mapD.get(str);
        boolean z = deviceCapability != null && deviceCapability.isSupportHarmonyAgreement();
        LogUtil.a("HwAcquireAgreementUtils", "isSupportHarmonyAgreement: ", Boolean.valueOf(z));
        return z;
    }

    public static String e(String str) {
        String strB = SharedPreferenceManager.b(String.valueOf(10024), nio.b(str) + "harmonyAgreement", "");
        LogUtil.a("HwAcquireAgreementUtils", "getHarmonyAgreementByDevice deviceIdentify: ", CommonUtil.n(str), ", harmonyAgreementUrl: ", CommonUtil.n(strB));
        return strB;
    }

    public static void d(String str, String str2) {
        LogUtil.a("HwAcquireAgreementUtils", "saveHarmonyAgreement deviceIdentify: ", CommonUtil.n(str), ", harmonyAgreementUrl: ", CommonUtil.n(str2));
        SharedPreferenceManager.c(String.valueOf(10024), nio.b(str) + "harmonyAgreement", str2);
    }
}
