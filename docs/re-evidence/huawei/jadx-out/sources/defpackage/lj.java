package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class lj {
    public static void a(String str, String str2) {
        try {
            System.clearProperty(str);
        } catch (Throwable unused) {
        }
    }

    public static String e(String str) {
        try {
            System.clearProperty(str);
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
