package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class JavaUnicodeEscaper extends UnicodeEscaper {
    public JavaUnicodeEscaper(int i14, int i15, boolean z14) {
        super(i14, i15, z14);
    }

    public static JavaUnicodeEscaper above(int i14) {
        return outsideOf(0, i14);
    }

    public static JavaUnicodeEscaper below(int i14) {
        return outsideOf(i14, Integer.MAX_VALUE);
    }

    public static JavaUnicodeEscaper between(int i14, int i15) {
        return new JavaUnicodeEscaper(i14, i15, true);
    }

    public static JavaUnicodeEscaper outsideOf(int i14, int i15) {
        return new JavaUnicodeEscaper(i14, i15, false);
    }

    @Override // org.apache.commons.lang3.text.translate.UnicodeEscaper
    public String toUtf16Escape(int i14) {
        char[] chars = Character.toChars(i14);
        return "\\u" + CharSequenceTranslator.hex(chars[0]) + "\\u" + CharSequenceTranslator.hex(chars[1]);
    }
}
