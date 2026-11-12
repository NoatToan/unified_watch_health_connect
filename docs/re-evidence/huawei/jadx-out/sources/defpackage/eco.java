package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class eco {
    private static int e;

    private static void c(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 + i;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i3]);
        }
    }

    private static void b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void c(Mac mac, byte[] bArr, byte[] bArr2, int i, int i2) {
        int macLength = mac.getMacLength();
        byte[] bArrDoFinal = new byte[bArr2.length + 4];
        System.arraycopy(bArr2, 0, bArrDoFinal, 0, bArr2.length);
        b(bArrDoFinal, bArr2.length, i2);
        for (int i3 = 0; i3 < i; i3++) {
            bArrDoFinal = mac.doFinal(bArrDoFinal);
            c(bArr, e, bArrDoFinal, macLength);
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i, int i2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (bArr == null || bArr2 == null) {
            return new byte[0];
        }
        if (i2 <= 0 || i == 0) {
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        int macLength = mac.getMacLength();
        if (macLength == 0) {
            return new byte[0];
        }
        int i3 = ((macLength - 1) + i2) / macLength;
        byte[] bArr3 = new byte[i3 * macLength];
        e = 0;
        for (int i4 = 1; i4 <= i3; i4++) {
            c(mac, bArr3, bArr2, i, i4);
            e += macLength;
        }
        if (i2 % macLength == 0) {
            return bArr3;
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArr3, 0, bArr4, 0, i2);
        return bArr4;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return mac.doFinal(bArr2);
        } catch (InvalidKeyException unused) {
            LogUtil.e("Pbkdf2CipherUtil", "getHmacSha256 catch InvalidKeyException");
            return new byte[0];
        } catch (NoSuchAlgorithmException unused2) {
            LogUtil.e("Pbkdf2CipherUtil", "getHmacSha256 catch NoSuchAlgorithmException");
            return new byte[0];
        }
    }
}
