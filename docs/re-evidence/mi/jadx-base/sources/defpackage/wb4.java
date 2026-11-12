package defpackage;

import com.typesafe.config.ConfigException;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class wb4 {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 != null) {
            return false;
        }
        if (obj != null && obj2 == null) {
            return false;
        }
        if (obj == obj2) {
            return true;
        }
        return obj.equals(obj2);
    }

    public static ConfigException b(ExceptionInInitializerError exceptionInInitializerError) {
        Throwable cause = exceptionInInitializerError.getCause();
        if (cause == null || !(cause instanceof ConfigException)) {
            throw exceptionInInitializerError;
        }
        return (ConfigException) cause;
    }

    public static boolean c(int i) {
        if (i == 10 || i == 32 || i == 160 || i == 8199 || i == 8239 || i == 65279) {
            return true;
        }
        return Character.isWhitespace(i);
    }

    public static jc4 d(ObjectInputStream objectInputStream) throws IOException {
        return rwl.i0(objectInputStream, null);
    }

    public static String e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                sb.append("\\f");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        sb.append("\\b");
                        break;
                    case '\t':
                        sb.append("\\t");
                        break;
                    case '\n':
                        sb.append("\\n");
                        break;
                    default:
                        if (Character.isISOControl(cCharAt)) {
                            sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb.append(cCharAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        sb.append('\"');
        return sb.toString();
    }

    public static String f(String str) {
        if (str.length() == 0) {
            return e(str);
        }
        int iCodePointAt = str.codePointAt(0);
        if (Character.isDigit(iCodePointAt) || iCodePointAt == 45) {
            return e(str);
        }
        if (str.startsWith("include") || str.startsWith("true") || str.startsWith("false") || str.startsWith(AbstractJsonLexerKt.NULL) || str.contains("//")) {
            return e(str);
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt) && !Character.isDigit(cCharAt) && cCharAt != '-') {
                return e(str);
            }
        }
        return str;
    }

    public static String g(String str) {
        int iCodePointAt;
        int i;
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int iCharCount = 0;
        while (iCharCount < length) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt != ' ' && cCharAt != '\n') {
                int iCodePointAt2 = str.codePointAt(iCharCount);
                if (!c(iCodePointAt2)) {
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt2);
            } else {
                iCharCount++;
            }
        }
        while (length > iCharCount) {
            int i2 = length - 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 != ' ' && cCharAt2 != '\n') {
                if (Character.isLowSurrogate(cCharAt2)) {
                    iCodePointAt = str.codePointAt(length - 2);
                    i = 2;
                } else {
                    iCodePointAt = str.codePointAt(i2);
                    i = 1;
                }
                if (!c(iCodePointAt)) {
                    break;
                }
                length -= i;
            } else {
                length--;
            }
        }
        return str.substring(iCharCount, length);
    }

    public static File h(URL url) {
        try {
            return new File(url.toURI());
        } catch (IllegalArgumentException unused) {
            return new File(url.getPath());
        } catch (URISyntaxException unused2) {
            return new File(url.getPath());
        }
    }

    public static void i(ObjectOutputStream objectOutputStream, jc4 jc4Var) throws IOException {
        rwl.p0(new DataOutputStream(objectOutputStream), (ocm) jc4Var, null);
    }
}
