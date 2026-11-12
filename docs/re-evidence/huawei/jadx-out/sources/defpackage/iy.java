package defpackage;

import com.airbnb.lottie.LottieLogger;

/* JADX INFO: loaded from: classes21.dex */
public class iy {
    private static LottieLogger d = new iv();

    public static void b(String str) {
        d.debug(str);
    }

    public static void d(String str) {
        d.warning(str);
    }

    public static void b(String str, Throwable th) {
        d.warning(str, th);
    }

    public static void e(String str, Throwable th) {
        d.error(str, th);
    }
}
