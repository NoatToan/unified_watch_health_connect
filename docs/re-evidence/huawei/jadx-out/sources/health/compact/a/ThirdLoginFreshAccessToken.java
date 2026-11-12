package health.compact.a;

/* JADX INFO: loaded from: classes.dex */
public class ThirdLoginFreshAccessToken {
    private ThirdLoginFreshAccessToken() {
    }

    public static void b() {
        if ("0".equalsIgnoreCase(CommonUtil.w()) || CommonUtil.bg()) {
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.a("ThirdLoginFreshAccessToken", "enter reflectionFreshAccessToken");
        Class<?> clsB = ReflectionUtils.b("com.huawei.login.huaweilogin.ThirdPartyLoginManager");
        if (clsB == null) {
            return;
        }
        Object objE = ReflectionUtils.e(clsB, "getInstance");
        if (objE == null) {
            com.huawei.hwlogsmodel.LogUtil.e("ThirdLoginFreshAccessToken", "reflectionFreshAccessToken instance is null!");
        } else {
            ReflectionUtils.d(objE, "immediatelyFreshAt");
        }
    }

    public static String d() {
        com.huawei.hwlogsmodel.LogUtil.d("ThirdLoginFreshAccessToken", "enter reflectionLogoutByLite");
        Class<?> clsB = ReflectionUtils.b("com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil");
        if (clsB == null) {
            com.huawei.hwlogsmodel.LogUtil.e("ThirdLoginFreshAccessToken", "reflectionLogoutByLite myClass is null!");
            return "";
        }
        Object objE = ReflectionUtils.e(clsB, "getLogoutFlag");
        return objE instanceof String ? (String) objE : "";
    }

    public static void c() {
        com.huawei.hwlogsmodel.LogUtil.d("ThirdLoginFreshAccessToken", "enter reflectionLoginStatusByHms");
        Class<?> clsB = ReflectionUtils.b("com.huawei.login.ui.login.LoginInit");
        if (clsB == null) {
            com.huawei.hwlogsmodel.LogUtil.e("ThirdLoginFreshAccessToken", "reflectionLoginStatusByHms myClass is null!");
        } else {
            ReflectionUtils.e(clsB, "checkHmsHasLogin");
        }
    }
}
