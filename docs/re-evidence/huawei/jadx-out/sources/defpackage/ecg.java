package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class ecg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f32734c = {-107, 12, 91, 10, -123, -117, -97, 113, -99, -117, -45, 51, -10, -66, -92, 39, 89};

    public static byte[] d(byte[] bArr, String str, byte[] bArr2) {
        boolean z = TextUtils.isEmpty(str) || bArr2 == null;
        if (bArr == null || z) {
            LogUtil.j("AesCryptUtils", "encrypt content or key or iv is null");
            return new byte[0];
        }
        try {
            return nio.b(Base64.b(str), bArr2, bArr);
        } catch (Exception unused) {
            LogUtil.e("AesCryptUtils", "encrypt is exception");
            return new byte[0];
        }
    }

    public static byte[] b(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || bArr.length > 64) {
            return new byte[0];
        }
        byte[] bArrE = ecn.e(1024);
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b2 = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b2;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArrE[((bArr.length + i2) * 8) - 2] = bArr[i2];
        }
        bArrE[0] = (byte) bArr.length;
        return bArrE;
    }

    public static byte[] e() {
        byte[] bArr = new byte[8];
        qrf.b().nextBytes(bArr);
        return bArr;
    }

    public static byte[] a() {
        return (byte[]) f32734c.clone();
    }

    public static byte[] e(String str, byte[] bArr, byte[] bArr2) throws BadPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        boolean z = bArr == null || bArr2 == null;
        if (TextUtils.isEmpty(str) || z) {
            LogUtil.j("AesCryptUtils", "Input Argument illegal ...");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] bytes = str.trim().getBytes(Charset.forName("UTF-8"));
            int length = bytes.length;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bytes, 0, bArr3, 0, length);
            cipher.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr3);
        } catch (NoSuchPaddingException unused) {
            LogUtil.e("AesCryptUtils", "encrypt NoSuchPaddingException");
            return null;
        }
    }

    public static String d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        boolean z = bArr2 == null || bArr3 == null;
        if (bArr == null || z) {
            LogUtil.j("AesCryptUtils", "Input Argument illegal ...");
            return "";
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr3));
            return new String(cipher.doFinal(bArr), "UTF-8").trim();
        } catch (NoSuchAlgorithmException unused) {
            LogUtil.e("AesCryptUtils", "encrypt NoSuchAlgorithmException");
            return "";
        } catch (NoSuchPaddingException unused2) {
            LogUtil.e("AesCryptUtils", "encrypt NoSuchPaddingException");
            return "";
        }
    }
}
