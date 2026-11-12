package defpackage;

import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class xei {
    public static void a(String str) {
        Logger.d("FITNESS.PUSH", str, Boolean.TRUE);
    }

    public static void b(String str) {
        Logger.e("FITNESS.PUSH", str);
    }

    public static void c(String str, Throwable th) {
        Logger.e("FITNESS.PUSH", str, th);
    }

    public static void d(String str) {
        Logger.i("FITNESS.PUSH", str);
    }
}
