package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f7574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f7575b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f7574a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f7575b = cls2 != null;
    }

    private d() {
    }

    public static boolean a() {
        return (f7574a == null || f7575b) ? false : true;
    }
}
