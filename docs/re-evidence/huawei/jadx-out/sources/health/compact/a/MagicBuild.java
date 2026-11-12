package health.compact.a;

/* JADX INFO: loaded from: classes.dex */
public final class MagicBuild extends BaseBuild {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f36615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36616b;
    public static final String e;

    static {
        boolean z = ReflectionUtils.b("com.hihonor.android.os.Build") != null;
        f36615a = z;
        f36616b = a(z ? ReflectionUtils.b("com.hihonor.android.os.Build$VERSION") : null, "MAGIC_SDK_INT", 0);
        e = z ? SystemProperties.d("ro.build.version.magic") : "";
    }

    private MagicBuild() {
    }

    private static int a(Class cls, String str, int i) {
        if (cls != null) {
            Object objB = ReflectionUtils.b((Class<?>) cls, str);
            if (objB instanceof Integer) {
                return ((Integer) objB).intValue();
            }
        }
        return i;
    }
}
