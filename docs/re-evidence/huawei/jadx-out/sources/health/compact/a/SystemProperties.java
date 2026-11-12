package health.compact.a;

/* JADX INFO: loaded from: classes.dex */
public final class SystemProperties {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SystemPropertiesReader f36661c;

    static {
        try {
            f36661c = new SystemPropertiesReader("android.os.SystemProperties");
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            LogUtil.d("HAF_SystemProperties", "init SystemProperties ex=", LogUtil.c(e));
        }
    }

    private SystemProperties() {
    }

    public static String d(String str) {
        return d(str, "");
    }

    public static String d(String str, String str2) {
        SystemPropertiesReader systemPropertiesReader = f36661c;
        return systemPropertiesReader != null ? systemPropertiesReader.e(str, str2) : str2;
    }

    public static boolean e(String str, boolean z) {
        SystemPropertiesReader systemPropertiesReader = f36661c;
        return systemPropertiesReader != null ? systemPropertiesReader.e(str, z) : z;
    }

    public static int c(String str, int i) {
        SystemPropertiesReader systemPropertiesReader = f36661c;
        return systemPropertiesReader != null ? systemPropertiesReader.e(str, i) : i;
    }
}
