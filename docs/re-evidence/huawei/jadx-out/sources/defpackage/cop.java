package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.BuildConfigProperties;
import health.compact.a.CommonUtils;
import health.compact.a.EmuiBuild;
import health.compact.a.HarmonyBuild;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SystemProperties;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class cop extends CommonUtils {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f31227c;

    public static boolean a(byte[] bArr, int i) {
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

    public static boolean i() {
        return "StoreDemo".equals(BuildConfigProperties.d());
    }

    public static String b(String str) {
        String strD = d(str);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            return new File(strD).getCanonicalPath();
        } catch (IOException e) {
            LogUtil.e(CommonUtil.TAG, "filterFilePath IOException :", e.getMessage());
            return null;
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".contains(String.valueOf(str.charAt(i)))) {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static boolean b() {
        return EmuiBuild.f36544b || HarmonyBuild.e;
    }

    public static boolean c() {
        return HarmonyBuild.e;
    }

    public static boolean e() {
        String strD = BuildConfigProperties.d();
        return "beta".equals(strD) || "BetaPay".equals(strD);
    }

    public static boolean h() {
        return "release".equals(BuildConfigProperties.d());
    }

    public static boolean a() {
        return 21 <= EmuiBuild.e;
    }

    public static boolean d() {
        return 25 <= EmuiBuild.e;
    }

    public static boolean f() {
        if (f31227c == null) {
            Boolean boolValueOf = Boolean.valueOf(Build.VERSION.SDK_INT >= 29 && b() && "3.0.0".compareTo(SystemProperties.d("hw_sc.build.platform.version")) <= 0);
            f31227c = boolValueOf;
            ReleaseLogUtil.c("DEVMGR_CommonUtil", "sIsSystemSupportFreezing = ", boolValueOf);
        }
        return f31227c.booleanValue();
    }

    public static boolean g() {
        return BaseApplication.APP_PACKAGE_HEALTH_TV.equals(com.huawei.haf.application.BaseApplication.d());
    }

    public static String c(String str) {
        if (str == null || str.length() < 5) {
            return str;
        }
        if (str.length() > 10) {
            return cpl.e(str.substring(0, 9));
        }
        return cpl.e(str);
    }

    public static String e(String str) {
        if (str == null || str.length() < 10) {
            return cpl.e(str);
        }
        return cpl.e(str.substring(0, 9));
    }
}
