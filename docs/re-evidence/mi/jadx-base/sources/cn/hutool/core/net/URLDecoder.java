package cn.hutool.core.net;

import defpackage.lio;
import defpackage.tt3;
import defpackage.yt3;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class URLDecoder implements Serializable {
    private static final byte ESCAPE_CHAR = 37;
    private static final long serialVersionUID = 1;

    public static String decode(String str, Charset charset) {
        return decode(str, charset, true);
    }

    public static String decodeForPath(String str, Charset charset) {
        return decode(str, charset, false);
    }

    public static String decode(String str, Charset charset, boolean z) {
        return lio.F0(decode(tt3.g(str, charset), z), charset);
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, true);
    }

    public static byte[] decode(byte[] bArr, boolean z) {
        int iA;
        int i;
        int iA2;
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        int i2 = 0;
        while (i2 < bArr.length) {
            byte b2 = bArr[i2];
            if (b2 == 43) {
                if (z) {
                    b2 = 32;
                }
                byteArrayOutputStream.write(b2);
            } else if (b2 == 37) {
                int i3 = i2 + 1;
                if (i3 < bArr.length && (iA = yt3.a(bArr[i3])) >= 0 && (i = i2 + 2) < bArr.length && (iA2 = yt3.a(bArr[i])) >= 0) {
                    byteArrayOutputStream.write((char) ((iA << 4) + iA2));
                    i2 = i;
                } else {
                    byteArrayOutputStream.write(b2);
                }
            } else {
                byteArrayOutputStream.write(b2);
            }
            i2++;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
