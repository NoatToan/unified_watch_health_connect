package defpackage;

import java.io.ByteArrayOutputStream;
import org.spongycastle.util.encoders.EncoderException;

/* JADX INFO: loaded from: classes3.dex */
public class n12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w98 f27429a = new u12();

    public static byte[] a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((i2 + 2) / 3) * 4);
        try {
            f27429a.encode(bArr, i, i2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            throw new EncoderException("exception encoding base64 string: " + e.getMessage(), e);
        }
    }
}
