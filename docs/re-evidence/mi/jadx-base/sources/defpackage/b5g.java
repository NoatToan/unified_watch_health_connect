package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.mipay.sdk.account.BuildConfig;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes7.dex */
public class b5g {
    public static void a(String str) throws Exception {
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!j(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return BuildConfig.VERSION_NAME;
        }
    }

    public static String d() {
        try {
            String str = Build.BRAND;
            a(str);
            return str;
        } catch (Exception unused) {
            return "UnknownBrand";
        }
    }

    public static String e() {
        try {
            String str = Build.MODEL;
            a(str);
            return str;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public static String f() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String g() {
        return YRNConstants.PLATFORM;
    }

    public static String h() {
        String str = Build.VERSION.RELEASE;
        return !TextUtils.isEmpty(str) ? str : "unknown";
    }

    public static String i(Context context) {
        return k(g().replace("-", "") + "-" + h().replace("-", "") + "-" + c(context).replace("-", "") + "-" + d().replace("-", "") + "-" + e().replace("-", "") + "-" + f().replace("-", "") + "--watch");
    }

    public static boolean j(char c) {
        return c > 31 && c < 127;
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (b(str)) {
            return str;
        }
        try {
            StringBuilder sb = new StringBuilder(str.length());
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (j(cCharAt)) {
                    sb.append(cCharAt);
                } else {
                    sb.append(URLEncoder.encode(cCharAt + "", "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
