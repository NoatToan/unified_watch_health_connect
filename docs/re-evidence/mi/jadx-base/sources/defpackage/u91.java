package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class u91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f35538a = a("libcore.io.Memory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f35539b;

    static {
        f35539b = a("org.robolectric.Robolectric") != null;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return f35538a;
    }

    public static boolean c() {
        return (f35538a == null || f35539b) ? false : true;
    }
}
