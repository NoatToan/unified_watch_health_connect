package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class jp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f22990a = jp2.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22991b = b();
    public static int c = 384;
    public static volatile ip2 d;

    public static ip2 a() {
        if (d == null) {
            synchronized (jp2.class) {
                try {
                    if (d == null) {
                        d = new ip2(c, f22991b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }
}
