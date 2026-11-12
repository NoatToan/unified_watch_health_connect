package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes20.dex */
public class zua {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f54573c;

    public static int d(Context context) {
        if (context == null) {
            zud.d("GlobalContext", "Context is null");
            return -1;
        }
        Context applicationContext = context.getApplicationContext();
        f54573c = applicationContext;
        if (applicationContext != null && !TextUtils.isEmpty(applicationContext.getPackageName())) {
            return 0;
        }
        zud.d("GlobalContext", "Invalid context.");
        return -1;
    }

    public static String d() {
        return f54573c.getPackageName();
    }
}
