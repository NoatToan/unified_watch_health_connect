package defpackage;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.Base64URL;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public class g0 {
    public static Cipher a(SecretKey secretKey, boolean z, byte[] bArr, Provider provider) throws JOSEException {
        try {
            Cipher cipherA = kw3.a("AES/CBC/PKCS5Padding", provider);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            if (z) {
                cipherA.init(1, secretKeySpec, ivParameterSpec);
            } else {
                cipherA.init(2, secretKeySpec, ivParameterSpec);
            }
            return cipherA;
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr, byte[] bArr2, Provider provider) throws JOSEException {
        try {
            return a(secretKey, true, bArr, provider).doFinal(bArr2);
        } catch (Exception e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }

    public static xq1 c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider, Provider provider2) throws JOSEException {
        oa4 oa4Var = new oa4(secretKey);
        byte[] bArrB = b(oa4Var.a(), bArr, bArr2, provider);
        byte[] bArrA = k.a(bArr3);
        return new xq1(bArrB, Arrays.copyOf(vcb.a(oa4Var.b(), ByteBuffer.allocate(bArr3.length + bArr.length + bArrB.length + bArrA.length).put(bArr3).put(bArr).put(bArrB).put(bArrA).array(), provider2), oa4Var.c()));
    }

    public static xq1 d(JWEHeader jWEHeader, SecretKey secretKey, Base64URL base64URL, byte[] bArr, byte[] bArr2, Provider provider, Provider provider2) throws JOSEException {
        byte[] bArrDecode = jWEHeader.getCustomParam("epu") instanceof String ? new Base64URL((String) jWEHeader.getCustomParam("epu")).decode() : null;
        byte[] bArrDecode2 = jWEHeader.getCustomParam("epv") instanceof String ? new Base64URL((String) jWEHeader.getCustomParam("epv")).decode() : null;
        byte[] bArrB = b(xee.a(secretKey, jWEHeader.getEncryptionMethod(), bArrDecode, bArrDecode2), bArr, bArr2, provider);
        return new xq1(bArrB, vcb.a(xee.b(secretKey, jWEHeader.getEncryptionMethod(), bArrDecode, bArrDecode2), (jWEHeader.toBase64URL().toString() + "." + base64URL.toString() + "." + Base64URL.encode(bArr).toString() + "." + Base64URL.encode(bArrB)).getBytes(mbo.f25981a), provider2));
    }

    public static byte[] e(SecureRandom secureRandom) {
        byte[] bArr = new byte[y73.c(128)];
        secureRandom.nextBytes(bArr);
        return bArr;
    }
}
