package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fitness.common.utils.LocaleUtil;

/* JADX INFO: loaded from: classes8.dex */
public class b41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f3768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String[] f3769b;
    public static String c;

    public static String[] a(Context context, boolean z) {
        return z ? new String[]{context.getString(wzi.M), context.getString(wzi.J), context.getString(wzi.K2), context.getString(wzi.j2), context.getString(wzi.M1)} : new String[]{context.getString(wzi.M), context.getString(wzi.J), context.getString(wzi.M1)};
    }

    public static String[] b(Context context) {
        return new String[]{context.getString(wzi.M), context.getString(wzi.J), context.getString(wzi.M1)};
    }

    public static String[] c(Resources resources) {
        return resources.getStringArray(lhi.i);
    }

    public static String[] d(Resources resources) {
        return resources.getStringArray(lhi.h);
    }

    public static void e(Context context) {
        String currentLocale = LocaleUtil.getCurrentLocale();
        String str = c;
        if (str == null || !str.equals(currentLocale)) {
            f3768a = null;
            f3769b = null;
            c = currentLocale;
        }
        Resources resources = context.getResources();
        if (f3768a == null) {
            f3768a = c(resources);
        }
        if (f3769b == null) {
            f3769b = d(resources);
        }
    }
}
