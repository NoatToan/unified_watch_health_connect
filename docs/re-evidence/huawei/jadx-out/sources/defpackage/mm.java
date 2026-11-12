package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class mm {
    public static String b(Context context) {
        if (kg.f39305b) {
            return ki.b.e.d(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static void c(Context context) {
        kg.e = ki.b.e.c(context.getApplicationContext());
        kg.f39305b = true;
    }

    public static boolean c() {
        if (kg.f39305b) {
            return kg.e;
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
