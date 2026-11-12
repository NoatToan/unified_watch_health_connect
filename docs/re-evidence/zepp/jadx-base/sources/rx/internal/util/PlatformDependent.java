package rx.internal.util;

/* JADX INFO: loaded from: classes23.dex */
public final class PlatformDependent {
    public static final int ANDROID_API_VERSION_IS_NOT_ANDROID = 0;
    private static final int a;
    private static final boolean b;

    static {
        int iA = a();
        a = iA;
        b = iA != 0;
    }

    private PlatformDependent() {
        throw new IllegalStateException("No instances!");
    }

    private static int a() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getAndroidApiVersion() {
        return a;
    }

    public static boolean isAndroid() {
        return b;
    }
}
