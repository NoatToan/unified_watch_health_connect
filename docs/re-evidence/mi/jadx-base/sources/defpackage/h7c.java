package defpackage;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.encoders.DecoderException;
import org.bouncycastle.util.encoders.EncoderException;

/* JADX INFO: loaded from: classes3.dex */
public class h7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v98 f19775a = new l7c();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f19775a.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new DecoderException("exception decoding Hex string: " + e.getMessage(), e);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f19775a.encode(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding Hex string: " + e.getMessage(), e);
        }
    }

    public static String d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static String e(byte[] bArr, int i, int i2) {
        return olo.b(c(bArr, i, i2));
    }
}
