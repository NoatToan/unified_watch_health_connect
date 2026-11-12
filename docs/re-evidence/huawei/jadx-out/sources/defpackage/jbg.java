package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class jbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f38339a;

    public static void c(Context context) {
        if (context == null) {
            throw new RuntimeException("HealthApplication context is null");
        }
        f38339a = context;
    }

    public static Context a() {
        return f38339a;
    }
}
