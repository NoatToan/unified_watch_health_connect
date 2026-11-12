package defpackage;

import com.huawei.hms.android.SystemUtils;

/* JADX INFO: loaded from: classes4.dex */
public class cie {
    private static final String d = chz.c(SystemUtils.PRODUCT_BRAND, "");
    private static final String e = chz.c("ro.product.manufacturer", "");

    public static boolean b() {
        return "honor".equalsIgnoreCase(d) && "honor".equalsIgnoreCase(e);
    }

    public static boolean e() {
        return b() && d();
    }

    public static boolean d() {
        return chz.b("ro.build.version.sdk", 0) >= 31;
    }
}
