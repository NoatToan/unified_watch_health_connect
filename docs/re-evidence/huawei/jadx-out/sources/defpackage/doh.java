package defpackage;

import android.util.Base64;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.WhiteBoxManager;
import java.io.UnsupportedEncodingException;
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
public class doh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f32121b = new byte[16];
    private static final byte[] d = new byte[16];

    static {
        String strB = b(25, 1025, 2025);
        String strB2 = b(26, 1026, 2026);
        String[] strArrSplit = strB.split(" ");
        String[] strArrSplit2 = strB2.split(" ");
        for (int i = 0; i < 16; i++) {
            try {
                if (i < strArrSplit.length) {
                    f32121b[i] = (byte) Integer.parseInt(strArrSplit[i], 16);
                }
                if (i < strArrSplit2.length) {
                    d[i] = (byte) Integer.parseInt(strArrSplit2[i], 16);
                }
            } catch (NumberFormatException e) {
                LogUtil.e("EncryptUtils", "EncryptUtils numException: ", e.getMessage());
            }
        }
    }

    public static String b(int i, int i2, int i3) {
        String str;
        UnsupportedEncodingException e;
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(whiteBoxManagerB.a(1, i));
        stringBuffer.append(whiteBoxManagerB.a(1, i2));
        stringBuffer.append(whiteBoxManagerB.a(1, i3));
        String string = stringBuffer.toString();
        LogUtil.d("EncryptUtils", "getKeyAndIv before decrypt: ", string);
        try {
            str = new String(whiteBoxManagerB.a(Base64.decode(string, 2)), "UTF-8");
            try {
                LogUtil.d("EncryptUtils", "getKeyAndIv decrypt: ", str);
                return str;
            } catch (UnsupportedEncodingException e2) {
                e = e2;
                LogUtil.e("EncryptUtils", "getKeyAndIv: exception:", e.getMessage());
                return str;
            }
        } catch (UnsupportedEncodingException e3) {
            str = string;
            e = e3;
        }
    }

    public static void b(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("EncryptUtils", "setKeyBytes bytes is null");
        } else {
            System.arraycopy(bArr, 0, f32121b, 0, bArr.length);
        }
    }

    public static byte[] c(byte[] bArr) {
        try {
            if (bArr != null) {
                Cipher cipher = Cipher.getInstance("AES/CTR/PKCS7Padding");
                cipher.init(1, new SecretKeySpec(f32121b, "AES"), new IvParameterSpec(d));
                return cipher.doFinal(bArr);
            }
            LogUtil.a("EncryptUtils", "encrypt sSrc is null");
            return null;
        } catch (InvalidAlgorithmParameterException e) {
            LogUtil.e("EncryptUtils", "encrypt ", e.getMessage());
            return null;
        } catch (InvalidKeyException e2) {
            LogUtil.e("EncryptUtils", "encrypt ", e2.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            LogUtil.e("EncryptUtils", "encrypt ", e3.getMessage());
            return null;
        } catch (BadPaddingException e4) {
            LogUtil.e("EncryptUtils", "encrypt ", e4.getMessage());
            return null;
        } catch (IllegalBlockSizeException e5) {
            LogUtil.e("EncryptUtils", "encrypt ", e5.getMessage());
            return null;
        } catch (NoSuchPaddingException e6) {
            LogUtil.e("EncryptUtils", "encrypt ", e6.getMessage());
            return null;
        }
    }

    public static byte[] e(byte[] bArr) {
        try {
            if (bArr != null) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(f32121b, "AES");
                Cipher cipher = Cipher.getInstance("AES/CTR/PKCS7Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(d));
                return cipher.doFinal(bArr);
            }
            LogUtil.a("EncryptUtils", "decrypt sSrc is null");
            return null;
        } catch (InvalidAlgorithmParameterException e) {
            LogUtil.e("EncryptUtils", "decrypt ", e.getMessage());
            return null;
        } catch (InvalidKeyException e2) {
            LogUtil.e("EncryptUtils", "decrypt ", e2.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            LogUtil.e("EncryptUtils", "decrypt ", e3.getMessage());
            return null;
        } catch (BadPaddingException e4) {
            LogUtil.e("EncryptUtils", "decrypt ", e4.getMessage());
            return null;
        } catch (IllegalBlockSizeException e5) {
            LogUtil.e("EncryptUtils", "decrypt ", e5.getMessage());
            return null;
        } catch (NoSuchPaddingException e6) {
            LogUtil.e("EncryptUtils", "decrypt ", e6.getMessage());
            return null;
        }
    }

    public static byte[] d(String str) {
        byte[] bArr = new byte[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            try {
                bArr[i] = (byte) Integer.parseInt(str.substring(i * 2, i2 * 2), 16);
            } catch (NumberFormatException e) {
                LogUtil.e("EncryptUtils", "stringToByte numException: ", e.getMessage());
            }
            i = i2;
        }
        return bArr;
    }
}
