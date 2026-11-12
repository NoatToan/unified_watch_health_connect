package defpackage;

import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class hfb {
    public static void a(String str) {
        Logger.d("FITNESS.HABIT", str, Boolean.TRUE);
    }

    public static void b(String str) {
        Logger.e("FITNESS.HABIT", str);
    }

    public static void c(String str, Throwable th) {
        Logger.e("FITNESS.HABIT", str, th);
    }

    public static void d(String str) {
        Logger.i("FITNESS.HABIT", str);
    }
}
