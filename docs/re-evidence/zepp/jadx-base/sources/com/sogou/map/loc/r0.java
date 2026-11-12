package com.sogou.map.loc;

import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes18.dex */
final class r0 {
    private static Method[] a;

    static {
        Method[] methodArr = new Method[7];
        a = methodArr;
        try {
            methodArr[2] = Log.class.getMethod("v", String.class, String.class);
            a[3] = Log.class.getMethod(GoogleApiAvailabilityLight.a, String.class, String.class);
            a[4] = Log.class.getMethod("i", String.class, String.class);
            a[5] = Log.class.getMethod("w", String.class, String.class);
            a[6] = Log.class.getMethod("e", String.class, String.class);
        } catch (NoSuchMethodException unused) {
        }
        f0.c = new p0();
    }

    public static void a(int i, String str, String str2) {
        p0 p0Var = f0.c;
        if (p0Var != null) {
            p0Var.a(i, str, str2);
        }
    }

    public static void b(String str) {
        a(3, "locate", str);
    }
}
