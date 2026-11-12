package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes30.dex */
public class gqv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f35939b;
    private static String e;

    public static void d(Context context) {
        grn.d("LocationSdkUtil", "setContext start");
        f35939b = context;
        gra.e();
    }

    public static Context d() {
        return f35939b;
    }

    public static void e(String str) {
        grn.d("LocationSdkUtil", "setSerCountry start");
        e = str;
    }

    public static String e() {
        return e;
    }
}
