package health.compact.a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class HuaweiHealth {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f36581c;

    private HuaweiHealth() {
    }

    public static void e(Context context) {
        f36581c = context;
    }

    public static Context a() {
        return f36581c;
    }

    public static String c() {
        Context context = f36581c;
        if (context != null) {
            return context.getPackageName();
        }
        return "com.huawei.health";
    }
}
