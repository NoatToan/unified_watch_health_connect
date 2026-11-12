package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.huawei.operation.utils.Constants;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class cqr {
    public static String e(String str) {
        return e(str, 0);
    }

    private static String e(String str, int i) {
        byte[] bArrD;
        if (str != null) {
            try {
                if (str.length() < 32) {
                    return null;
                }
                String strSubstring = str.substring(0, 32);
                if (i == 1) {
                    bArrD = c();
                } else {
                    bArrD = d();
                }
                return e(str.substring(32), bArrD, cph.c(strSubstring));
            } catch (Exception unused) {
                LogUtil.d("HwEncryptUtil", "decryptString Exception");
            }
        }
        return null;
    }

    private static byte[] d() {
        return cqv.d(String.valueOf(e("D4AAC76288A23005828B8FEF937D5650gjQUAXCxflcmPZ2H4/deJyHSeFoU71xl67CeEsCdM8UbcYpdKUEGhxRdwBmol2/q", 1)));
    }

    private static byte[] c() {
        char[] charArray = cqh.c(1, 32).toCharArray();
        char[] charArray2 = cqh.c(1, AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED).toCharArray();
        String strC = c(cqh.c(1, Constants.START_TO_MAIN_ACTIVITY));
        if (strC == null || strC.isEmpty()) {
            return new byte[1];
        }
        char[] charArray3 = strC.toCharArray();
        char[] cArr = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            cArr[i] = (char) ((((charArray3[i] ^ (charArray2[i] << 2)) << 3) ^ charArray[i]) >> 4);
        }
        return cqv.d(String.valueOf(cArr));
    }

    private static String e(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrD = cqv.d(str);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return new String(cipher.doFinal(bArrD), StandardCharsets.UTF_8).trim();
    }

    private static String c(String str) {
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
            LogUtil.d("HwEncryptUtil", "hexToString() UnsupportedEncodingException");
            return null;
        }
    }
}
