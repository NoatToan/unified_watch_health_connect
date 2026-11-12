package defpackage;

import android.text.TextUtils;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class qr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile float f31761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f31762b;
    public static boolean c;

    public static float a() {
        return f31761a;
    }

    public static void b() {
        String str;
        try {
            str = SystemProperties.get("log.tag.autodensity.debug.enable");
            f31762b = str;
            if (str == null) {
                str = "0";
            }
        } catch (Exception unused) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("autodensity debugEnable = ");
        sb.append(str);
        try {
            f31761a = Float.parseFloat(str);
        } catch (NumberFormatException unused2) {
            f31761a = 0.0f;
        }
    }

    public static boolean c() {
        return c || (f31761a >= 0.0f && !TextUtils.isEmpty(f31762b));
    }

    public static void d(String str) {
        c();
    }
}
