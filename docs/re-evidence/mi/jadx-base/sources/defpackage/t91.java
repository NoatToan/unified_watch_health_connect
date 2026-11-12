package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f34466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f34467b = a("libcore.io.Memory");
    public static final boolean c;

    static {
        c = (f34466a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return f34467b;
    }

    public static boolean c() {
        return f34466a || !(f34467b == null || c);
    }
}
