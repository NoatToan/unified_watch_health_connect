package defpackage;

import com.miuipub.internal.hybrid.SignUtils;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class u9j {
    public static byte[] a(byte[] bArr, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
        cipher.init(1, publicKey);
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = length - i;
            if (i3 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byte[] bArrDoFinal = i3 > 117 ? cipher.doFinal(bArr, i, 117) : cipher.doFinal(bArr, i, i3);
            byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            i2++;
            i = i2 * 117;
        }
    }

    public static PublicKey b(String str) throws Exception {
        try {
            return (RSAPublicKey) KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(q12.e(str)));
        } catch (NullPointerException unused) {
            throw new Exception("Public key data is empty");
        } catch (NoSuchAlgorithmException unused2) {
            throw new Exception("There is no such algorithm");
        } catch (InvalidKeySpecException unused3) {
            throw new Exception("Illegal public key");
        }
    }
}
