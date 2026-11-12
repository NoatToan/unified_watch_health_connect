package health.compact.a;

/* JADX INFO: loaded from: classes.dex */
public class CompileParameterUtil {
    private CompileParameterUtil() {
    }

    public static String e(String str) {
        return BuildConfigProperties.d(str);
    }

    public static String b(String str, String str2) {
        return BuildConfigProperties.a(str, str2);
    }

    public static boolean d(String str) {
        return BuildConfigProperties.a(str, false);
    }

    public static boolean c(String str, boolean z) {
        return BuildConfigProperties.a(str, z);
    }
}
