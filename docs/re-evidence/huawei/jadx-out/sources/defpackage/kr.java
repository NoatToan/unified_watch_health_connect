package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.c.b;

/* JADX INFO: loaded from: classes4.dex */
public class kr {
    public static b e(Context context) {
        String str = Build.BRAND;
        ld.e("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new kq();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new ku();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new kv();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new kx();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new kp();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new kw();
        }
        if (str.equalsIgnoreCase("samsung")) {
            return new kt();
        }
        if (e()) {
            return new kq();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu")) {
            return new ko();
        }
        return null;
    }

    public static boolean e() {
        return (TextUtils.isEmpty(d("ro.build.version.emui")) && TextUtils.isEmpty(d("hw_sc.build.platform.version"))) ? false : true;
    }

    public static String d(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
