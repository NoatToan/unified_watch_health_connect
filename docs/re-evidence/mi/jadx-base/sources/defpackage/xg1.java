package defpackage;

import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class xg1 {
    public static void a(String str) {
        Logger.d("FITNESS.AppLinkLog", str, Boolean.TRUE);
    }

    public static void b(String str) {
        Logger.e("FITNESS.AppLinkLog", str);
    }

    public static void c(String str, Throwable th) {
        Logger.e("FITNESS.AppLinkLog", str, th);
    }

    public static void d(String str) {
        Logger.i("FITNESS.AppLinkLog", str);
    }
}
