package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class lln {
    private static final String[] d = {""};

    public static boolean e(String str) {
        if (str == null) {
            return false;
        }
        for (String str2 : d) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
