package defpackage;

import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import health.compact.a.WhiteBoxManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class doi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<String, String> f32123c;
    private static String d;
    private static final byte[] e = eeq.c(WhiteBoxManager.b().a(1, 1033));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f32122a = eeq.c(WhiteBoxManager.b().a(1, 2033));

    private static void c(String str, byte[] bArr) {
        String strE = eeq.e(bArr);
        if (f32123c == null) {
            f32123c = new HashMap(4);
        }
        f32123c.put(str, strE);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return new byte[0];
        }
        byte[] bArr4 = new byte[bArr.length];
        if (bArr.length != bArr2.length) {
            return new byte[0];
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr4[i] = (byte) ((bArr[i] << 4) ^ bArr2[i]);
        }
        byte[] bArrB = b(bArr4);
        String strE = eeq.e(bArrB);
        int length = bArrB.length;
        byte[] bArr5 = new byte[length];
        if (length == 0 || bArr3.length == 0) {
            LogUtil.a("HagridEncryptUtil", "keydata len or C_3 len = 0.");
            return new byte[0];
        }
        if (strE == null) {
            return new byte[0];
        }
        for (int i2 = 0; i2 < bArrB.length; i2++) {
            int i3 = i2 * 2;
            try {
                bArr5[i2] = (byte) ((Integer.parseInt(strE.substring(i3, i3 + 2), 16) >> 6) ^ bArr3[i2]);
            } catch (NumberFormatException unused) {
                LogUtil.e("HagridEncryptUtil", "getRootKey exception");
            }
        }
        byte[] bArrB2 = b(bArr5);
        if (bArrB2.length != 0) {
            return bArrB2;
        }
        LogUtil.a("HagridEncryptUtil", "createKeyData() keymes is null");
        return new byte[0];
    }

    public static byte[] d(String str) {
        byte[] bArrD;
        LogUtil.a("HagridEncryptUtil", "createKey() begin ");
        Map<String, String> map = f32123c;
        String str2 = (map == null || !map.containsKey(str)) ? "" : f32123c.get(str);
        if (TextUtils.isEmpty(str2)) {
            byte[] bArrA = new byte[0];
            try {
                bArrA = dnz.a(16);
            } catch (NoSuchAlgorithmException e2) {
                LogUtil.e("HagridEncryptUtil", "sendData NoSuchAlgorithmException", e2.getMessage());
            }
            byte[] bArrC = c(e, f32122a, eeq.c(eeq.a(str.replace(":", "") + AgdConstant.INSTALL_TYPE_DEFAULT)));
            bArrD = e();
            if (bArrA != null) {
                byte[] bArrA2 = a(bArrD, bArrC, bArrA);
                if (bArrA2 != null) {
                    str2 = eeq.e(bArrA) + eeq.e(bArrA2);
                } else {
                    LogUtil.e("HagridEncryptUtil", "keysencrypt is null.");
                }
            } else {
                LogUtil.e("HagridEncryptUtil", "randIV is null");
            }
            c(str, eeq.c(str2));
        } else {
            byte[] bArr = new byte[16];
            byte[] bArrC2 = eeq.c(str2);
            System.arraycopy(bArrC2, 0, bArr, 0, 16);
            byte[] bArr2 = new byte[bArrC2.length - 16];
            System.arraycopy(bArrC2, 16, bArr2, 0, bArrC2.length - 16);
            bArrD = d(bArr2, c(e, f32122a, eeq.c(eeq.a(str.replace(":", "") + AgdConstant.INSTALL_TYPE_DEFAULT))), bArr);
        }
        LogUtil.a("HagridEncryptUtil", "createKey() finish");
        return bArrD;
    }

    public static byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(e);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                IoUtils.c(byteArrayOutputStream);
                return byteArray;
            } catch (IOException unused) {
                IoUtils.c(byteArrayOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                IoUtils.c(byteArrayOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] d() {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(f32122a);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                IoUtils.c(byteArrayOutputStream);
                return byteArray;
            } catch (IOException unused) {
                IoUtils.c(byteArrayOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                IoUtils.c(byteArrayOutputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static byte[] b(byte[] bArr) {
        if (bArr == null) {
            return (byte[]) new byte[0].clone();
        }
        byte[] bArr2 = new byte[16];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            System.arraycopy(messageDigest.digest(), 0, bArr2, 0, 16);
            return bArr2;
        } catch (NoSuchAlgorithmException unused) {
            return (byte[]) new byte[0].clone();
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return (byte[]) new byte[0].clone();
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (BadPaddingException e2) {
            LogUtil.j("HagridEncryptUtil", "encrypt BadPaddingException is", e2.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (IllegalBlockSizeException e3) {
            LogUtil.j("HagridEncryptUtil", "encrypt IllegalBlockSizeException is", e3.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (InvalidKeyException e4) {
            LogUtil.j("HagridEncryptUtil", "encrypt InvalidKeyException is", e4.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (InvalidAlgorithmParameterException e5) {
            LogUtil.j("HagridEncryptUtil", "encrypt InvalidAlgorithmParameterException is", e5.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (NoSuchPaddingException e6) {
            LogUtil.j("HagridEncryptUtil", "encrypt NoSuchPaddingException is", e6.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (NoSuchAlgorithmException e7) {
            LogUtil.j("HagridEncryptUtil", "encrypt NoSuchAlgorithmException is", e7.getMessage());
            return (byte[]) new byte[0].clone();
        } finally {
            LogUtil.j("HagridEncryptUtil", "encrypt finally");
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return (byte[]) new byte[0].clone();
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (BadPaddingException e2) {
            LogUtil.j("HagridEncryptUtil", "desEncrypt BadPaddingException is", e2.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (NoSuchAlgorithmException e3) {
            LogUtil.j("HagridEncryptUtil", "desEncrypt NoSuchAlgorithmException is", e3.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (NoSuchPaddingException e4) {
            LogUtil.j("HagridEncryptUtil", "desEncrypt NoSuchPaddingException is", e4.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (InvalidKeyException e5) {
            LogUtil.j("HagridEncryptUtil", "desEncrypt InvalidKeyException is", e5.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (InvalidAlgorithmParameterException e6) {
            LogUtil.j("HagridEncryptUtil", "desEncrypt InvalidAlgorithmParameterException is", e6.getMessage());
            return (byte[]) new byte[0].clone();
        } catch (IllegalBlockSizeException e7) {
            LogUtil.j("HagridEncryptUtil", "desEncrypt IllegalBlockSizeException is", e7.getMessage());
            return (byte[]) new byte[0].clone();
        } finally {
            LogUtil.j("HagridEncryptUtil", "desEncrypt finally");
        }
    }

    private static byte[] e() {
        SecureRandom secureRandom = new SecureRandom();
        d = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] charArray = "abcdefghijklmnopqrstuvwxyz0123456789".toCharArray();
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) charArray[secureRandom.nextInt(36)];
        }
        return bArr;
    }
}
