package defpackage;

import cn.hutool.core.text.StrBuilder;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class lio extends tt3 {
    public static StringBuilder A0() {
        return new StringBuilder();
    }

    public static StringBuilder B0(int i) {
        return new StringBuilder(i);
    }

    public static StringWriter C0() {
        return new StringWriter();
    }

    public static String D0(Object obj, Charset charset) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof byte[]) {
            return F0((byte[]) obj, charset);
        }
        if (obj instanceof Byte[]) {
            return G0((Byte[]) obj, charset);
        }
        if (obj instanceof ByteBuffer) {
            return E0((ByteBuffer) obj, charset);
        }
        return qj1.B(obj) ? qj1.Q(obj) : obj.toString();
    }

    public static String E0(ByteBuffer byteBuffer, Charset charset) {
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        return charset.decode(byteBuffer).toString();
    }

    public static String F0(byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        return charset == null ? new String(bArr) : new String(bArr, charset);
    }

    public static String G0(Byte[] bArr, Charset charset) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            Byte b2 = bArr[i];
            bArr2[i] = b2 == null ? (byte) -1 : b2.byteValue();
        }
        return F0(bArr2, charset);
    }

    public static StrBuilder H0() {
        return StrBuilder.create();
    }

    public static String I0(Object obj) {
        return String.valueOf(obj);
    }

    public static String J0(Object obj) {
        return D0(obj, au3.f3449b);
    }
}
