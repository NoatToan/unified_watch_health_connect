package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class ayp {
    private static boolean e() {
        return true;
    }

    public static Context b(Context context) {
        return e() ? context.createDeviceProtectedStorageContext() : context;
    }
}
