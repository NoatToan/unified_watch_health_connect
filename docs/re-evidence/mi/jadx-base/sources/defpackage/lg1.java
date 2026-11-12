package defpackage;

import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes2.dex */
public class lg1 {
    public static void a(String str) {
        Logger.d("FITNESS.AppInstall", str, Boolean.TRUE);
    }

    public static void b(String str) {
        Logger.e("FITNESS.AppInstall", str);
    }

    public static void c(String str, Throwable th) {
        Logger.e("FITNESS.AppInstall", str, th);
    }

    public static void d(String str) {
        Logger.i("FITNESS.AppInstall", str);
    }
}
