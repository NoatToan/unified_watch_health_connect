package defpackage;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class xee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f39043a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f39044b = {0, 0, 0, 0};
    public static final byte[] c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};
    public static final byte[] d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    public static SecretKey a(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f39043a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(qcd.a(length / 2));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes(mbo.f25981a));
            if (bArr != null) {
                byteArrayOutputStream.write(qcd.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f39044b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(qcd.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f39044b);
            }
            byteArrayOutputStream.write(c);
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray());
                int length2 = bArrDigest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArrDigest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, "AES");
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    public static SecretKey b(SecretKey secretKey, EncryptionMethod encryptionMethod, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f39043a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(qcd.a(length));
            byteArrayOutputStream.write(encryptionMethod.toString().getBytes(mbo.f25981a));
            if (bArr != null) {
                byteArrayOutputStream.write(qcd.a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f39044b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(qcd.a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f39044b);
            }
            byteArrayOutputStream.write(d);
            try {
                return new SecretKeySpec(MessageDigest.getInstance("SHA-" + length).digest(byteArrayOutputStream.toByteArray()), "HMACSHA" + length);
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }
}
