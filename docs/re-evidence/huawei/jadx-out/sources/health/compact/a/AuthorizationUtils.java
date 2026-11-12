package health.compact.a;

import android.content.Context;
import android.content.Intent;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizationUtils {
    private AuthorizationUtils() {
    }

    public static boolean c(Context context) {
        if (context == null) {
            context = BaseApplication.getContext();
        }
        boolean zEquals = "true".equals(KeyValDbManager.d(context).c("key_wether_to_auth"));
        if (!zEquals) {
            com.huawei.hwlogsmodel.LogUtil.a("AuthorizationUtils", "getAuthorizationStatus key_wether_to_auth is false");
        }
        return zEquals;
    }

    public static void b() {
        com.huawei.hwlogsmodel.LogUtil.a("AuthorizationUtils", "sendAuthChangedBroadcast enter");
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.AUTHORIZATION_CHANGED");
        BroadcastManagerUtil.e(BaseApplication.getContext(), intent);
    }
}
