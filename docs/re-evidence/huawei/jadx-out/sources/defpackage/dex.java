package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes7.dex */
public class dex {
    private static String c(String str) {
        return "SportTabDataCache_" + nio.b(SharedPreferenceUtil.getInstance(BaseApplication.b()).getUserID()) + "_" + str;
    }

    public static void a(String str, String str2) {
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            LogUtil.j("Track_SportTabDataCacheUtils", "setData() is not login");
            return;
        }
        String strC = c(str);
        LogUtil.a("Track_SportTabDataCacheUtils", "setData() key: ", strC, ", data: ", str2);
        SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), strC, str2, null);
    }

    public static String b(String str) {
        if (LoginInit.getInstance(BaseApplication.b()).isBrowseMode()) {
            LogUtil.j("Track_SportTabDataCacheUtils", "getData() is not login");
            return "";
        }
        String strC = c(str);
        LogUtil.a("Track_SportTabDataCacheUtils", "getData() key: ", strC);
        return SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), strC);
    }
}
