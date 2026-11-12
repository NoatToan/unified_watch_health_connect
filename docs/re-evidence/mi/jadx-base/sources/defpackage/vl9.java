package defpackage;

import java.io.File;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class vl9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f36999a = Pattern.compile("[\\\\/:*?\"<>|]");

    public static String a(File file) {
        if (file == null || file.isDirectory()) {
            return null;
        }
        return b(file.getName());
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return "";
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        return tt3.k(strSubstring, '/', AbstractJsonLexerKt.STRING_ESC) ? "" : strSubstring;
    }

    public static String c(String str) {
        int i;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return str;
        }
        if (yt3.f(str.charAt(length - 1))) {
            length--;
        }
        for (int i2 = length - 1; i2 > -1; i2--) {
            if (yt3.f(str.charAt(i2))) {
                i = i2 + 1;
                return str.substring(i, length);
            }
        }
        i = 0;
        return str.substring(i, length);
    }
}
