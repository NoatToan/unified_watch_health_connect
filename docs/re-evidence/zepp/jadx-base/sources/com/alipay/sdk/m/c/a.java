package com.alipay.sdk.m.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static final String a = "ro.build.version.emui";
    public static final String b = "hw_sc.build.platform.version";

    public static com.alipay.sdk.m.b.b a(Context context) {
        String str = Build.BRAND;
        com.alipay.sdk.m.d.a.b(BaseDeviceStatusActivity.KEY_DEVICE, "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new b();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new i();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new h();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new f();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new c();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new e();
        }
        if (str.equalsIgnoreCase("samsung")) {
            return new g();
        }
        if (a()) {
            return new b();
        }
        if (str.equalsIgnoreCase("meizu") || str.equalsIgnoreCase("mblu")) {
            return new d();
        }
        return null;
    }

    public static boolean a() {
        return (TextUtils.isEmpty(a(a)) && TextUtils.isEmpty(a(b))) ? false : true;
    }

    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
