package defpackage;

import android.content.Context;
import com.xiaomi.mipush.sdk.d;

/* JADX INFO: loaded from: classes11.dex */
public class xdb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f39014a = false;

    public static boolean a() {
        return f39014a;
    }

    public static void b(Context context) {
        m10 m10VarC = pns.e(context).c(d.ASSEMBLE_PUSH_HUAWEI);
        if (m10VarC != null) {
            m10VarC.a();
        }
    }

    public static synchronized void c(Context context) {
        context.getSharedPreferences("mipush_extra", 0).edit().putLong("last_connect_time", System.currentTimeMillis()).commit();
    }

    public static synchronized boolean d(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_connect_time", -1L)) > 5000;
    }
}
