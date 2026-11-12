package com.huami.android.mipay.h5;

import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class URLEncoderURI {
    public static final int a = 32;
    public static BitSet b = new BitSet(256);

    static {
        for (int i = 97; i <= 122; i++) {
            b.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            b.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            b.set(i3);
        }
        b.set(32);
        b.set(45);
        b.set(95);
        b.set(46);
        b.set(42);
        b.set(58);
        b.set(47);
        b.set(63);
        b.set(59);
        b.set(38);
        b.set(61);
    }

    private URLEncoderURI() {
    }

    public static String encode(String str, String str2) throws UnsupportedEncodingException {
        BitSet bitSet;
        int i;
        char cCharAt;
        StringBuffer stringBuffer = new StringBuffer(str.length());
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        Objects.requireNonNull(str2, "charsetName");
        try {
            Charset charsetForName = Charset.forName(str2);
            int i2 = 0;
            boolean z = false;
            while (i2 < str.length()) {
                char cCharAt2 = str.charAt(i2);
                if (b.get(cCharAt2)) {
                    if (cCharAt2 == ' ') {
                        cCharAt2 = '+';
                        z = true;
                    }
                    stringBuffer.append(cCharAt2);
                    i2++;
                } else {
                    do {
                        charArrayWriter.write(cCharAt2);
                        if (cCharAt2 >= 55296 && cCharAt2 <= 56319 && (i = i2 + 1) < str.length() && (cCharAt = str.charAt(i)) >= 56320 && cCharAt <= 57343) {
                            charArrayWriter.write(cCharAt);
                            i2 = i;
                        }
                        i2++;
                        if (i2 >= str.length()) {
                            break;
                        }
                        bitSet = b;
                        cCharAt2 = str.charAt(i2);
                    } while (!bitSet.get(cCharAt2));
                    charArrayWriter.flush();
                    byte[] bytes = new String(charArrayWriter.toCharArray()).getBytes(charsetForName);
                    for (int i3 = 0; i3 < bytes.length; i3++) {
                        stringBuffer.append('%');
                        char cForDigit = Character.forDigit((bytes[i3] >> 4) & 15, 16);
                        if (Character.isLetter(cForDigit)) {
                            cForDigit = (char) (cForDigit - ' ');
                        }
                        stringBuffer.append(cForDigit);
                        char cForDigit2 = Character.forDigit(bytes[i3] & 15, 16);
                        if (Character.isLetter(cForDigit2)) {
                            cForDigit2 = (char) (cForDigit2 - ' ');
                        }
                        stringBuffer.append(cForDigit2);
                    }
                    charArrayWriter.reset();
                    z = true;
                }
            }
            return z ? stringBuffer.toString() : str;
        } catch (IllegalCharsetNameException unused) {
            throw new UnsupportedEncodingException(str2);
        } catch (UnsupportedCharsetException unused2) {
            throw new UnsupportedEncodingException(str2);
        }
    }
}
