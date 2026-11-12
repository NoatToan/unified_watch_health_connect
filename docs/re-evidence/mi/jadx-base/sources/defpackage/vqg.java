package defpackage;

import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes9.dex */
public class vqg {
    public static void a(String str) {
        Logger.d("FITNESS.TSM", str, Boolean.TRUE);
    }

    public static void b(String str) {
        Logger.e("FITNESS.TSM", str);
    }

    public static void c(String str, Throwable th) {
        Logger.e("FITNESS.TSM", str, th);
    }

    public static void d(String str) {
        Logger.i("FITNESS.TSM", str);
    }
}
