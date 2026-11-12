package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes3.dex */
public class phr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f45391a = "";

    public static String d(String str, String str2) {
        f45391a = "";
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("ConfigurationPointUtils", "configurationPoint or deviceType is empty");
            return f45391a;
        }
        f45391a = str + "?";
        b(str2);
        return f45391a;
    }

    public static String d(Context context, String str) {
        f45391a = "";
        if (context == null) {
            LogUtil.j("ConfigurationPointUtils", "context == null");
            return f45391a;
        }
        if (CloudUtils.d()) {
            if (CommonUtil.af(context)) {
                e(str);
            } else if (CommonUtil.cl() && pip.f45449c.containsKey(str)) {
                f45391a = pip.f45448b.get(str) + "?";
                b(str);
            } else {
                d(str);
            }
        } else if (pip.f45449c.containsKey(str)) {
            if (CommonUtil.af(context)) {
                f45391a = pip.e.get(str) + "?";
            } else {
                f45391a = pip.f45448b.get(str) + "?";
            }
            b(str);
        }
        return f45391a;
    }

    private static String b(String str) {
        LogUtil.a("ConfigurationPointUtils", "deviceType = " + str);
        if (pip.d.containsKey(str)) {
            f45391a += pip.d.get(str);
        } else {
            LogUtil.j("ConfigurationPointUtils", "No MatchRules");
        }
        return f45391a;
    }

    private static String e(String str) {
        if ("HDK_WEIGHT".equals(str) || "HDK_BLOOD_SUGAR".equals(str) || "HDK_BLOOD_PRESSURE".equals(str) || "HDK_HEART_RATE".equals(str) || "HDK_BODY_TEMPERATURE".equals(str) || "HDK_BLOOD_OXYGEN".equals(str) || "HDK_ROPE_SKIPPING".equals(str)) {
            f45391a = "com.huawei.health_ThirdPartyDevice_deviceConfig?";
        } else if ("HDK_TREADMILL".equals(str) || "HDK_EXERCISE_BIKE".equals(str) || "HDK_ROWING_MACHINE".equals(str) || "HDK_ELLIPTICAL_MACHINE".equals(str) || "HDK_WALKING_MACHINE".equals(str)) {
            f45391a = "com.huawei.health_ThirdPartyDevice_deviceConfig_20200811?";
        } else {
            LogUtil.j("ConfigurationPointUtils", "release this is other device");
        }
        String str2 = f45391a + pip.e(str);
        f45391a = str2;
        return str2;
    }

    private static String d(String str) {
        if ("HDK_WEIGHT".equals(str) || "HDK_BLOOD_SUGAR".equals(str) || "HDK_BLOOD_PRESSURE".equals(str) || "HDK_HEART_RATE".equals(str) || "HDK_BODY_TEMPERATURE".equals(str) || "HDK_BLOOD_OXYGEN".equals(str) || "HDK_ROPE_SKIPPING".equals(str)) {
            f45391a = "com.huawei.health_ThirdPartyDevice_deviceConfigBeta?";
        } else if ("HDK_TREADMILL".equals(str) || "HDK_EXERCISE_BIKE".equals(str) || "HDK_ROWING_MACHINE".equals(str) || "HDK_ELLIPTICAL_MACHINE".equals(str) || "HDK_WALKING_MACHINE".equals(str)) {
            f45391a = "com.huawei.health_ThirdPartyDevice_deviceConfigBeta_20200811?";
        } else {
            LogUtil.j("ConfigurationPointUtils", "beta this is other device");
        }
        String str2 = f45391a + pip.e(str);
        f45391a = str2;
        return str2;
    }
}
