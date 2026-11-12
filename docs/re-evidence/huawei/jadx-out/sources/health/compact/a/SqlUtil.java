package health.compact.a;

/* JADX INFO: loaded from: classes2.dex */
public class SqlUtil {
    private SqlUtil() {
    }

    public static String d(String str) {
        if (str == null) {
            return "";
        }
        return str.replaceAll(".*([';]+|(--)+).*", " ");
    }
}
