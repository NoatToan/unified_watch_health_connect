package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f6691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f6692b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f6691a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f6692b = cls2 != null;
    }

    private d() {
    }

    public static boolean a() {
        return (f6691a == null || f6692b) ? false : true;
    }
}
