package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class gqu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f35938c = Pattern.compile("(.*([/\\\\]{1}[\\.\\.]{1,2}|[\\.\\.]{1,2}[/\\\\]{1}|\\.\\.).*|\\.)");

    public static boolean d(String str) {
        return !f35938c.matcher(str).matches();
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            for (int i2 = 0; i2 < 94; i2++) {
                if (str.charAt(i) == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".charAt(i2)) {
                    stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890-=[];\\',./ ~!@#$%^&*()_+\"{}|:<>?".charAt(i2));
                    break;
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String a(String str) {
        if (d(str)) {
            return e(str);
        }
        throw new RuntimeException("Invalid file path");
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() || file.mkdirs();
    }
}
