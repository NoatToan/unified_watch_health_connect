package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f37737a = a("libcore.io.Memory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f37738b;

    static {
        f37738b = a("org.robolectric.Robolectric") != null;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return f37737a;
    }

    public static boolean c() {
        return (f37737a == null || f37738b) ? false : true;
    }
}
