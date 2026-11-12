package defpackage;

import android.content.Context;
import android.text.TextUtils;
import miuix.core.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
public class efm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16602b;
    public static float c;
    public static float d;
    public static final String e;
    public static final String f;
    public static int g;
    public static int h;

    static {
        String str = SystemProperties.get("ro.miui.density.primaryscale", null);
        f16601a = str;
        String str2 = SystemProperties.get("ro.miui.density.secondaryscale", null);
        f16602b = str2;
        c = 0.0f;
        d = 0.0f;
        String str3 = SystemProperties.get("ro.miui.density.primaryppi", null);
        e = str3;
        String str4 = SystemProperties.get("ro.miui.density.secondaryppi", null);
        f = str4;
        g = 0;
        h = 0;
        if (!TextUtils.isEmpty(str)) {
            c = f(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            d = f(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            g = e(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            h = e(str4);
        }
        if (d == 0.0f) {
            d = c;
        }
    }

    public static int a(Context context, boolean z) {
        return z ? g : h;
    }

    public static float b(Context context) {
        float f2 = c;
        if ((b63.e || b63.h) && tc8.e(context) > 640) {
            f2 = d;
        }
        return (b63.f && p56.c(context)) ? d : f2;
    }

    public static boolean c() {
        return (g == 0 && h == 0) ? false : true;
    }

    public static boolean d() {
        return (c == 0.0f && d == 0.0f) ? false : true;
    }

    public static int e(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static float f(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }
}
