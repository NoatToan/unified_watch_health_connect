package health.compact.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.huawei.operation.utils.Constants;
import defpackage.nio;
import defpackage.nit;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class HwEncryptUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile HwEncryptUtil f36582c;
    private static final Object e = new Object();
    private WhiteBoxManager d = WhiteBoxManager.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36583a = -1;

    private HwEncryptUtil() {
    }

    private int d() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (this.f36583a == -1) {
            this.f36583a = Cipher.getInstance("AES/CBC/PKCS7Padding").getBlockSize();
        }
        return this.f36583a;
    }

    public static HwEncryptUtil b(Context context) {
        if (f36582c == null && context != null) {
            synchronized (e) {
                if (f36582c == null) {
                    f36582c = new HwEncryptUtil();
                }
            }
        }
        return f36582c;
    }

    public static void e() {
        KeyManager.e();
    }

    public String e(int i, String str) throws GeneralSecurityException {
        if (a(i)) {
            int iD = d();
            if (str != null) {
                byte[] bytes = str.trim().getBytes(StandardCharsets.UTF_8);
                int length = bytes.length;
                if (iD != 0) {
                    int i2 = length % iD;
                    length += i2 != 0 ? iD - i2 : 0;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bytes, 0, bArr, 0, bytes.length);
                byte[] bArrE = KeyManager.e(i);
                com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "encryptData getworkkey ", Integer.valueOf(i), str);
                byte[] bArrB = KeyManager.b();
                if (bArrE != null && bArrB != null) {
                    byte[] bArrB2 = nio.b(bArrE, bArrB, bArr);
                    String str2 = Base64.b(bArrB) + Base64.b(bArrB2);
                    com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "encryptData secret is not null");
                    return str2;
                }
                com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "encryptData secret is null");
                return str;
            }
            com.huawei.hwlogsmodel.LogUtil.e("HwEncryptUtil", "content is null!");
            return null;
        }
        com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "not need encrypt");
        return str;
    }

    public String c(int i, String str) throws GeneralSecurityException, IllegalArgumentException {
        if (a(i)) {
            if (TextUtils.isEmpty(str) || str.length() <= 24) {
                com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "decryptData content is: ", str);
                return "";
            }
            String strSubstring = str.substring(0, 24);
            String strSubstring2 = str.substring(24, str.length());
            com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "decryptData secret ivString:", strSubstring, ";dataString:", strSubstring2);
            byte[] bArrE = KeyManager.e(i);
            byte[] bArrB = Base64.b(strSubstring);
            byte[] bArrB2 = Base64.b(strSubstring2);
            if (bArrE == null || bArrB == null || bArrB2 == null) {
                com.huawei.hwlogsmodel.LogUtil.j("HwEncryptUtil", "secrets is null, ivBytes and dataBytes is null, decryptData failed, maybe clone data.");
                return "";
            }
            byte[] bArrA = nio.a(bArrE, bArrB, bArrB2);
            if (CommonUtil.ao()) {
                com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "decryptData secret original is:", HEXUtils.a(bArrA));
            }
            if (bArrA == null) {
                com.huawei.hwlogsmodel.LogUtil.j("HwEncryptUtil", "originalBytes is null, decryptData failed, maybe clone data.");
                return "";
            }
            return new String(bArrA, StandardCharsets.UTF_8).trim();
        }
        com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "decryptData11 ");
        return str;
    }

    public String a(String str) {
        return a(str, 0);
    }

    private boolean a(int i) {
        return nit.a(i);
    }

    private String a(String str, int i) {
        byte[] bArrC;
        if (str != null) {
            try {
                if (str.length() < 32) {
                    return null;
                }
                String strSubstring = str.substring(0, 32);
                if (i == 1) {
                    bArrC = b();
                } else {
                    bArrC = c();
                }
                return c(str.substring(32), bArrC, HEXUtils.e(strSubstring));
            } catch (Exception unused) {
                com.huawei.hwlogsmodel.LogUtil.e("HwEncryptUtil", "decryptString Exception");
            }
        }
        return null;
    }

    private byte[] c() {
        return Base64.b(String.valueOf(a("D4AAC76288A23005828B8FEF937D5650gjQUAXCxflcmPZ2H4/deJyHSeFoU71xl67CeEsCdM8UbcYpdKUEGhxRdwBmol2/q", 1)));
    }

    private byte[] b() {
        char[] charArray = this.d.a(1, 32).toCharArray();
        char[] charArray2 = this.d.a(1, AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED).toCharArray();
        String strE = e(this.d.a(1, Constants.START_TO_MAIN_ACTIVITY));
        if (strE == null || strE.isEmpty()) {
            return new byte[1];
        }
        char[] charArray3 = strE.toCharArray();
        char[] cArr = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            cArr[i] = (char) ((((charArray3[i] ^ (charArray2[i] << 2)) << 3) ^ charArray[i]) >> 4);
        }
        return Base64.b(String.valueOf(cArr));
    }

    private String c(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrB = Base64.b(str);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new String(cipher.doFinal(bArrB), StandardCharsets.UTF_8).trim();
    }

    private String e(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((("0123456789ABCDEF".indexOf(charArray[i2]) * 16) + "0123456789ABCDEF".indexOf(charArray[i2 + 1])) & 255);
        }
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("HwEncryptUtil", "hexToString() UnsupportedEncodingException");
            return null;
        }
    }

    public byte[] e(int i, byte[] bArr) throws Exception {
        if (a(i)) {
            int iD = d();
            int length = bArr.length;
            if (iD != 0) {
                int i2 = length % iD;
                length += i2 != 0 ? iD - i2 : 0;
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArrE = KeyManager.e(i);
            byte[] bArrB = KeyManager.b();
            if (bArrE != null && bArrB != null) {
                byte[] bArrB2 = nio.b(bArrE, bArrB, bArr2);
                String str = Base64.b(bArrB) + Base64.b(bArrB2);
                com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "encryptData secret is not null");
                return str.getBytes(StandardCharsets.UTF_8);
            }
            com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "encryptData secret is null");
            return bArr;
        }
        com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "not need encrypt");
        return bArr;
    }

    public byte[] a(int i, String str) throws Exception {
        if (str == null) {
            com.huawei.hwlogsmodel.LogUtil.a("HwEncryptUtil", "decryptByteData content is null");
            return new byte[0];
        }
        if (str.length() < 24 || !a(i)) {
            com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "decryptByteData else branch");
            return str.getBytes("utf-8");
        }
        com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "decryptData dataType:", Integer.valueOf(i));
        String strSubstring = str.substring(0, 24);
        String strSubstring2 = str.substring(24);
        byte[] bArrE = KeyManager.e(i);
        if (bArrE == null) {
            com.huawei.hwlogsmodel.LogUtil.d("HwEncryptUtil", "secretBytes == null");
            return str.getBytes("utf-8");
        }
        return nio.a(bArrE, Base64.b(strSubstring), Base64.b(strSubstring2));
    }
}
