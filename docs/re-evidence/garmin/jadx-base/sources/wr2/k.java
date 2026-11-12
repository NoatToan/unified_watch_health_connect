package wr2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr2/k;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f186863a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f186864b;

    static {
        int i14 = gt2.c.f79010a;
        f186864b = gt2.b.f79005a.h("HashUtil");
    }

    private k() {
    }

    public static byte[] a(String str, qs2.a aVar, byte[] bArr, byte b14) {
        Logger logger = f186864b;
        aVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                Charset charset = d53.c.f57666b;
                byte[] bytes = str.getBytes(charset);
                bytes.getClass();
                byteArrayOutputStream.write(bytes);
                byte[] bytes2 = aVar.f147399d.getBytes(charset);
                bytes2.getClass();
                byteArrayOutputStream.write(bytes2);
                byteArrayOutputStream.write(bArr);
                byteArrayOutputStream.write(new byte[]{b14});
                byteArrayOutputStream.flush();
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                messageDigest.update(byteArrayOutputStream.toByteArray());
                byte[] bArrCopyOfRange = Arrays.copyOfRange(messageDigest.digest(), 0, 8);
                bArrCopyOfRange.getClass();
                try {
                    byteArrayOutputStream.close();
                    return bArrCopyOfRange;
                } catch (IOException e4) {
                    logger.warn("baos.close() throws", (Throwable) e4);
                    return bArrCopyOfRange;
                }
            } catch (IOException e14) {
                logger.error("calculateHash", (Throwable) e14);
                throw new IllegalStateException(e14);
            } catch (NoSuchAlgorithmException e15) {
                logger.error("calculateHash", (Throwable) e15);
                throw new IllegalStateException(e15);
            }
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e16) {
                logger.warn("baos.close() throws", (Throwable) e16);
            }
            throw th3;
        }
    }
}
