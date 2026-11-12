package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class j0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f22314a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f22315b = new byte[128];

    static {
        for (int i = 0; i < 128; i++) {
            f22315b[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f22315b[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f22315b[i3] = (byte) (i3 - 71);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f22315b[i4] = (byte) (i4 + 4);
        }
        byte[] bArr = f22315b;
        bArr[43] = HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT;
        bArr[47] = 63;
    }

    public static String a(String str) {
        return p0t.g(g(str));
    }

    public static byte[] b(byte[] bArr) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, CertificateException, NullPointerException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(p0t.t("EQUVT"));
        if (keyGenerator == null) {
            return null;
        }
        keyGenerator.init(256);
        byte[] encoded = keyGenerator.generateKey().getEncoded();
        PublicKey publicKeyW = p0t.w();
        if (publicKeyW == null) {
            return null;
        }
        byte[] bArrC = c(encoded, publicKeyW);
        byte[] bArrD = d(encoded, bArr);
        byte[] bArr2 = new byte[bArrC.length + bArrD.length];
        System.arraycopy(bArrC, 0, bArr2, 0, bArrC.length);
        System.arraycopy(bArrD, 0, bArr2, bArrC.length, bArrD.length);
        return bArr2;
    }

    public static byte[] c(byte[] bArr, Key key) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(p0t.t("CUlNBL0VDQi9QS0NTMVBhZGRpbmc"));
        cipher.init(1, key);
        return cipher.doFinal(bArr);
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        try {
            return j(bArr, bArr2, p0t.u());
        } catch (Throwable th) {
            j2t.e(th, "er", "asEn");
            return null;
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, p0t.t("EQUVT"));
        Cipher cipher = Cipher.getInstance(p0t.t("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr2);
    }

    public static String f(byte[] bArr) {
        try {
            return k(bArr);
        } catch (Throwable th) {
            j2t.e(th, "er", "e64");
            return null;
        }
    }

    public static byte[] g(String str) {
        int i;
        byte b2;
        int i2;
        byte b3;
        int i3 = 0;
        if (str == null) {
            return new byte[0];
        }
        byte[] bArrN = p0t.n(str);
        int length = bArrN.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                b2 = f22315b[bArrN[i3]];
                if (i >= length || b2 != -1) {
                    break;
                }
                i3 = i;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i2 = i + 1;
                b3 = f22315b[bArrN[i]];
                if (i2 >= length || b3 != -1) {
                    break;
                }
                i = i2;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & 48) >>> 4));
            while (i2 != length) {
                int i4 = i2 + 1;
                byte b4 = bArrN[i2];
                if (b4 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                byte b5 = f22315b[b4];
                if (i4 >= length || b5 != -1) {
                    if (b5 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(((b3 & 15) << 4) | ((b5 & 60) >>> 2));
                    while (i4 != length) {
                        int i5 = i4 + 1;
                        byte b6 = bArrN[i4];
                        if (b6 == 61) {
                            return byteArrayOutputStream.toByteArray();
                        }
                        byte b7 = f22315b[b6];
                        if (i5 < length && b7 == -1) {
                            i4 = i5;
                        } else {
                            if (b7 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(b7 | ((b5 & 3) << 6));
                            i3 = i5;
                        }
                    }
                    return byteArrayOutputStream.toByteArray();
                }
                i2 = i4;
            }
            return byteArrayOutputStream.toByteArray();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] h(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        return j(bArr, bArr2, bArr3);
    }

    public static String i(byte[] bArr) {
        try {
            return k(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static byte[] j(byte[] bArr, byte[] bArr2, byte[] bArr3) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, p0t.t("EQUVT"));
        Cipher cipher = Cipher.getInstance(p0t.t("CQUVTL0NCQy9QS0NTNVBhZGRpbmc"));
        try {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        return cipher.doFinal(bArr2);
    }

    public static String k(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte b2 = bArr[i];
            int i3 = b2 & 255;
            if (i2 == length) {
                char[] cArr = f22314a;
                stringBuffer.append(cArr[i3 >>> 2]);
                stringBuffer.append(cArr[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i + 2;
            byte b3 = bArr[i2];
            if (i4 == length) {
                char[] cArr2 = f22314a;
                stringBuffer.append(cArr2[i3 >>> 2]);
                stringBuffer.append(cArr2[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(cArr2[(b3 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i += 3;
            byte b4 = bArr[i4];
            char[] cArr3 = f22314a;
            stringBuffer.append(cArr3[i3 >>> 2]);
            stringBuffer.append(cArr3[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(cArr3[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(cArr3[b4 & 63]);
        }
        return stringBuffer.toString();
    }
}
