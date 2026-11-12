package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthkit.context.QuickAppInfo;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes10.dex */
public class ljp {
    private static final int e = Process.myUid();

    public static String d(int i) {
        if (i != 1) {
            if (i == 2) {
                return "com.huawei.bone";
            }
            if (i != 1001) {
                if (i == 1002) {
                    return "com.huawei.bone";
                }
                return "unknown";
            }
        }
        return HuaweiHealth.c();
    }

    public static int a(String str) {
        if (HuaweiHealth.c().equals(str)) {
            return 1;
        }
        return "com.huawei.bone".equals(str) ? 2 : 0;
    }

    public static String d(String str) {
        if (HuaweiHealth.c().equals(str)) {
            return HuaweiHealth.c();
        }
        if ("com.huawei.bone".equals(str)) {
            return "华为穿戴";
        }
        if ("com.huawei.ah100".equals(str)) {
            return "华为体脂称";
        }
        return "未知APP";
    }

    public static String e(Context context) {
        if (context == null) {
            return null;
        }
        if (Binder.getCallingUid() == e) {
            return HuaweiHealth.c();
        }
        String strD = lkf.d(context);
        if (!TextUtils.isEmpty(strD)) {
            if (!Utils.h()) {
                if ("com.huawei.bone".compareTo(strD) == 0 && !HsfSignValidator.c(strD)) {
                    LogUtil.j("HiH_HiAppUtil", "getBinderPackageName isAppValid verify fail packageName = ", strD);
                    throw new SecurityException("getBinderPackageName isAppValid Illegal APP");
                }
                if (lkc.b(strD) && HsfSignValidator.c(strD)) {
                    LogUtil.a("HiH_HiAppUtil", "getBinderPackageName currentapp will change packageName to health, current is ", strD);
                    return HuaweiHealth.c();
                }
            }
            if (strD.contains("android.uid.system")) {
                LogUtil.a("HiH_HiAppUtil", "getBinderPackageName packageName = ", strD);
                return HuaweiHealth.c();
            }
        }
        LogUtil.d("HiH_HiAppUtil", "getBinderPackageName packageName = ", strD);
        return strD;
    }

    public static String d(Context context) {
        return c(context, e(context));
    }

    public static String c(Context context, String str) {
        if (context == null) {
            LogUtil.j("HiH_HiAppUtil", "getInsertBinderPackageName context is null");
            return null;
        }
        if (HuaweiHealth.c().equals(str)) {
            return HuaweiHealth.c();
        }
        if (b(context, str)) {
            int iB = kwi.b().b(str);
            if (iB <= 0) {
                iB = (int) kwi.b().d(d(context, str), 0);
            }
            LogUtil.a("HiH_HiAppUtil", "getInsertBinderPackageName() app = ", Integer.valueOf(iB), ", packageName = ", str);
            String strD = kwg.b().d(iB);
            if (strD == null || "0".equals(strD) || str.equals(strD)) {
                LogUtil.a("HiH_HiAppUtil", "getInsertBinderPackageName() change packageName : com.huawei.health");
                return HuaweiHealth.c();
            }
        }
        LogUtil.a("HiH_HiAppUtil", "getInsertBinderPackageName packageName = ", str);
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    public static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.hashCode();
        switch (str) {
            case "com.huawei.bone":
            case "com.huawei.ah100":
                if (!HsfSignValidator.c(str)) {
                    LogUtil.j("HiH_HiAppUtil", "isAppValid verify fail packageName = ", str);
                    return false;
                }
            case "com.huawei.health":
            case "com.betterme.health":
            case "com.huawei.ohos.healthservice":
            case "com.huawei.ohos.health":
            case "com.huawei.ohos.health.device":
            case "com.huawei.audioaccessorymanager":
                return true;
            default:
                return false;
        }
    }

    public static HiAppInfo d(Context context, String str) {
        if (context == null) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        HiAppInfo hiAppInfo = new HiAppInfo();
        hiAppInfo.setPackageName(str);
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            hiAppInfo.setVersion(packageInfo.versionName);
            hiAppInfo.setAppName((String) packageManager.getApplicationLabel(applicationInfo));
            hiAppInfo.setSignature(HiJsonUtil.d(packageInfo.signatures));
            return hiAppInfo;
        } catch (PackageManager.NameNotFoundException e2) {
            LogUtil.e("HiH_HiAppUtil", "createExplicitIntent() exception = ", e2.getMessage());
            return hiAppInfo;
        }
    }

    public static HiAppInfo a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        HiAppInfo hiAppInfo = new HiAppInfo();
        hiAppInfo.setPackageName(str);
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            String strA = HsfSignValidator.a(context, str);
            int i = applicationInfo.uid;
            hiAppInfo.setVersion(packageInfo.versionName);
            if (packageManager.getApplicationLabel(applicationInfo) instanceof String) {
                hiAppInfo.setAppName((String) packageManager.getApplicationLabel(applicationInfo));
            }
            hiAppInfo.setSignature(d(strA, i));
            return hiAppInfo;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HiH_HiAppUtil", "getKitAppInfo() NameNotFoundException");
            return hiAppInfo;
        }
    }

    public static HiAppInfo b(QuickAppInfo quickAppInfo) {
        if (quickAppInfo == null) {
            return null;
        }
        HiAppInfo hiAppInfo = new HiAppInfo();
        hiAppInfo.setPackageName(quickAppInfo.getPackageName());
        hiAppInfo.setAppName("QuickApp_".concat(quickAppInfo.getName()));
        hiAppInfo.setSignature(quickAppInfo.getFingerPrint() + "##" + quickAppInfo.getAppId());
        return hiAppInfo;
    }

    public static com.huawei.health.HiAppInfo a(QuickAppInfo quickAppInfo) {
        if (quickAppInfo == null) {
            return null;
        }
        com.huawei.health.HiAppInfo hiAppInfo = new com.huawei.health.HiAppInfo();
        hiAppInfo.setPackageName(quickAppInfo.getPackageName());
        hiAppInfo.setAppName(quickAppInfo.getName());
        return hiAppInfo;
    }

    public static com.huawei.health.HiAppInfo b(Context context) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        String strD = lkf.d(context);
        if (strD == null) {
            return new com.huawei.health.HiAppInfo();
        }
        try {
            string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(strD, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HiH_HiAppUtil", "getPhoneKitAppInfo NameNotFoundException");
            string = null;
        }
        com.huawei.health.HiAppInfo hiAppInfo = new com.huawei.health.HiAppInfo();
        hiAppInfo.setPackageName(strD);
        hiAppInfo.setAppName(string);
        return hiAppInfo;
    }

    public static String d(String str, int i) {
        return str + "##" + String.valueOf(i);
    }
}
