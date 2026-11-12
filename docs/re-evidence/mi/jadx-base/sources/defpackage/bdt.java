package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class bdt {
    public static String a(String str, String str2) {
        try {
            return (String) odt.c(null, "android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            x9s.o("SystemProperties.get: " + e);
            return str2;
        }
    }
}
