package health.compact.a;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes.dex */
public class CloudUtils {
    private CloudUtils() {
    }

    @Deprecated
    public static boolean d() {
        if (CommonUtil.cj()) {
            return false;
        }
        String strY = CommonUtil.y();
        if (TextUtils.isEmpty(strY)) {
            com.huawei.hwlogsmodel.LogUtil.j("CloudUtils", "isNoCloudVersion, isNoCloud = ", strY);
            strY = VersionDbManager.b(BaseApplication.getContext()).d("have_cloud_or_not");
        }
        if ("1".equalsIgnoreCase(strY)) {
            com.huawei.hwlogsmodel.LogUtil.a("CloudUtils", "Health APP isNoCloudVersion = false");
            return false;
        }
        com.huawei.hwlogsmodel.LogUtil.a("CloudUtils", "Health APP isNoCloudVersion = true");
        return true;
    }

    public static boolean c() {
        if (CommonUtil.cj()) {
            return false;
        }
        String strY = CommonUtil.y();
        if (TextUtils.isEmpty(strY)) {
            com.huawei.hwlogsmodel.LogUtil.j("CloudUtils", "isOverseaVersion, isOversea = ", strY);
            strY = VersionDbManager.b(BaseApplication.getContext()).d("have_cloud_or_not");
        }
        if ("1".equalsIgnoreCase(strY)) {
            com.huawei.hwlogsmodel.LogUtil.a("CloudUtils", "Health APP isOverseaVersion = false");
            return false;
        }
        com.huawei.hwlogsmodel.LogUtil.a("CloudUtils", "Health APP isOverseaVersion = true");
        return true;
    }

    public static boolean a() {
        String strD;
        if (!EnvironmentUtils.d()) {
            strD = "";
        } else {
            strD = CommonUtil.w();
        }
        com.huawei.hwlogsmodel.LogUtil.d("CloudUtils", "CommonUtil.getIsAllowedLogin() ifAllowLogin = ", strD);
        if (TextUtils.isEmpty(strD)) {
            strD = VersionDbManager.b(BaseApplication.getContext()).d("allow_login_or_not");
            CommonUtil.aa(strD);
            com.huawei.hwlogsmodel.LogUtil.d("CloudUtils", "ifAllowLogin() = ", strD);
        }
        if ("1".equalsIgnoreCase(strD)) {
            com.huawei.hwlogsmodel.LogUtil.d("CloudUtils", "Health APP ifAllowLogin = true");
            return true;
        }
        com.huawei.hwlogsmodel.LogUtil.d("CloudUtils", "Health APP ifAllowLogin = false");
        return false;
    }
}
