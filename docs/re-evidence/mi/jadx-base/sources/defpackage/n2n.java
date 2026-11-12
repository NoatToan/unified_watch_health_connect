package defpackage;

import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class n2n {
    public static void a(String str) {
        Logger.e("FITNESS.SmartHomeLog", str);
    }

    public static void b(String str, Throwable th) {
        Logger.e("FITNESS.SmartHomeLog", str, th);
    }

    public static void c(String str) {
        Logger.i("FITNESS.SmartHomeLog", str);
    }
}
