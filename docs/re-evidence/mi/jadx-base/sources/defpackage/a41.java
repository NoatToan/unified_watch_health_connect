package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fitness.common.utils.LocaleUtil;

/* JADX INFO: loaded from: classes8.dex */
public class a41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String[] f591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String[] f592b;
    public static String c;

    public static String[] a(Resources resources) {
        return resources.getStringArray(ahi.f1027b);
    }

    public static String[] b(Resources resources) {
        return resources.getStringArray(ahi.f1026a);
    }

    public static void c(Context context) {
        String currentLocale = LocaleUtil.getCurrentLocale();
        String str = c;
        if (str == null || !str.equals(currentLocale)) {
            f591a = null;
            f592b = null;
            c = currentLocale;
        }
        Resources resources = context.getResources();
        if (f591a == null) {
            f591a = a(resources);
        }
        if (f592b == null) {
            f592b = b(resources);
        }
    }
}
