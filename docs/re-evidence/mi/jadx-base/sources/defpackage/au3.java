package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: loaded from: classes.dex */
public class au3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f3448a = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f3449b = StandardCharsets.UTF_8;
    public static final Charset c;

    static {
        Charset charsetForName;
        try {
            charsetForName = Charset.forName("GBK");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        c = charsetForName;
    }

    public static Charset a(String str) throws UnsupportedCharsetException {
        return tt3.F(str) ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static String b(String str, Charset charset, Charset charset2) {
        if (charset == null) {
            charset = StandardCharsets.ISO_8859_1;
        }
        if (charset2 == null) {
            charset2 = StandardCharsets.UTF_8;
        }
        return (tt3.F(str) || charset.equals(charset2)) ? str : new String(str.getBytes(charset), charset2);
    }

    public static Charset c() {
        return Charset.defaultCharset();
    }

    public static Charset d() {
        return jm9.B() ? c : c();
    }

    public static String e() {
        return d().name();
    }
}
