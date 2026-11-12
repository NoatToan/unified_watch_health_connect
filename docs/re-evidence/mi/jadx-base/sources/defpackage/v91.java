package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class v91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f36634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f36635b = a("libcore.io.Memory");
    public static final boolean c;

    static {
        c = (f36634a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return f36635b;
    }

    public static boolean c() {
        return f36634a || !(f36635b == null || c);
    }
}
