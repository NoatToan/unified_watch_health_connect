package kg;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static ig.a a() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new b();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new j();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new i();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new g();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new c();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new e();
        }
        if (str.equalsIgnoreCase("samsung")) {
            return new h();
        }
        String strB = b("ro.build.version.emui");
        String strB2 = b("hw_sc.build.platform.version");
        if (!TextUtils.isEmpty(strB) || !TextUtils.isEmpty(strB2)) {
            return new b();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu")) {
            return new d();
        }
        return null;
    }

    public static String b(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
