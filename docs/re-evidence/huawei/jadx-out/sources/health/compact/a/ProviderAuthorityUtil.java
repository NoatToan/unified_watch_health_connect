package health.compact.a;

import android.content.Context;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.hihealthservice.hmsauth.HmsAuthApi;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.grw;

/* JADX INFO: loaded from: classes2.dex */
public class ProviderAuthorityUtil {
    private ProviderAuthorityUtil() {
    }

    public static boolean b(Context context, String str) {
        if (context == null || str == null) {
            com.huawei.hwlogsmodel.LogUtil.e("ProviderAuthorityUtil", "context or callingPackage is null");
            return false;
        }
        String strB = grw.b(context, str);
        if (Constants.HW_INTELLIEGNT_PACKAGE.equals(str) && ("3dc48303b51039c862bbbaff279d47bfdd44a3af7919356dbe212fdd3f1c884b".equals(strB) || "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05".equals(strB) || "1e3eee2a88a6df75fb4af56adc8373bb818f3cb90a4935c7821582b8cebb694c".equals(strB))) {
            return true;
        }
        if ("com.huawei.bone".equals(str) && "9dc745a5f9f60b611ab03a19166ee505834026f4f4a971aa704094f2a2c0072d".equals(strB)) {
            return true;
        }
        if ("com.huawei.camera".equals(str) && ("fac41ea711512ad971465bacb63d269cd2fc90c7ff5c37d043d3fdd89a9e6009".equals(strB) || "4e8442c0a958e311edb4c08f3c2fd5654a274aa31ae07fdaed6baea739c8e639".equals(strB))) {
            return true;
        }
        return e(str, strB);
    }

    private static boolean e(String str, String str2) {
        if (grw.f35964c.equals(str) && ("3dc48303b51039c862bbbaff279d47bfdd44a3af7919356dbe212fdd3f1c884b".equals(str2) || "50787dff857ccc7423352c5273275ad14b21f2b977ca3c124cf4684c1a9bc05c".equals(str2) || "ab6fc17da5e9341ad643d711f64c4c763799cc8d11791170692fb7942c7149a6".equals(str2))) {
            return true;
        }
        if ("com.android.keyguard".equals(str) && "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05".equals(str2)) {
            return true;
        }
        if ("com.android.systemui".equals(str) && "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05".equals(str2)) {
            return true;
        }
        return d(str, str2);
    }

    private static boolean d(String str, String str2) {
        if ("com.huawei.android.launcher".equals(str) && "1e3eee2a88a6df75fb4af56adc8373bb818f3cb90a4935c7821582b8cebb694c".equals(str2)) {
            return true;
        }
        if ("com.huawei.hiboard".equals(str) && "b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05".equals(str2)) {
            return true;
        }
        return (FaCardAgdsApi.STEP_FA_CARD_PACKAGE_NAME.equals(str) || FaCardAgdsApi.FA_CARD_PACKAGE_NAME.equals(str)) && "b2881b2ee3d4efa03342ae07dafc0466b63ede959ec2e2f58c05a54266f45748".equals(str2);
    }

    public static boolean a(String str, int i, boolean z) {
        HmsAuthApi hmsAuthApi = (HmsAuthApi) Services.d("HealthKit", HmsAuthApi.class);
        if (hmsAuthApi == null) {
            return false;
        }
        int iHmsAuth = hmsAuthApi.hmsAuth(str, i, z);
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("ProviderAuthorityUtil", "hmsAuth code = ", Integer.valueOf(iHmsAuth));
        return iHmsAuth == 0;
    }
}
