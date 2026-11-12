package defpackage;

import android.content.Context;
import com.huawei.wear.healthadapter.HealthAdapter;

/* JADX INFO: loaded from: classes20.dex */
public class xml {
    private static HealthAdapter d;
    private static Context e;

    public static Context d() {
        return e;
    }

    public static void d(Context context) {
        e = context;
    }

    public static HealthAdapter a() {
        return d;
    }

    public static void e(HealthAdapter healthAdapter) {
        d = healthAdapter;
    }
}
