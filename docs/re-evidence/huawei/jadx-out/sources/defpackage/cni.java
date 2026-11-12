package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class cni {
    public static boolean b(int i) {
        return 3 == i || 2 == i || 8 == i;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return cnh.d().h(str);
    }

    public static String d(String str, int i) {
        if (str == null) {
            LogUtil.e("HiChainLiteCommandUtil", "getSecretKey null");
            return "";
        }
        return c(cpv.a(str, i));
    }

    public static String c(String str) {
        byte[] bArrB;
        if (!TextUtils.isEmpty(str) && (bArrB = cqo.b(str)) != null) {
            try {
                return e(bArrB, "utf-8");
            } catch (CharacterCodingException unused) {
                LogUtil.d("HiChainLiteCommandUtil", "thisKey null");
                return "";
            }
        }
        return "";
    }

    private static String e(byte[] bArr, String str) throws CharacterCodingException {
        return Charset.forName(str).newDecoder().decode(ByteBuffer.wrap(bArr)).toString();
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return cnh.d().a(str);
    }

    public static byte[] d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.e("HiChainLiteCommandUtil", "getAuthenticToken null");
            return cng.f1834c;
        }
        cnh.d().c(str, 1);
        return a(str, str2, str3);
    }

    private static byte[] a(String str, String str2, String str3) {
        LogUtil.b("HiChainLiteCommandUtil", "getPbkToken");
        if (str2 == null || str3 == null) {
            LogUtil.e("HiChainLiteCommandUtil", "getPbkToken params incorrect");
            return cng.f1834c;
        }
        try {
            return SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(new PBEKeySpec(str2.toCharArray(), str3.getBytes("utf-8"), 1000, 256)).getEncoded();
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("HiChainLiteCommandUtil", "UnsupportedEncodingException");
            return cng.f1834c;
        } catch (NoSuchAlgorithmException unused2) {
            LogUtil.e("HiChainLiteCommandUtil", "NoSuchAlgorithmException");
            return b(str, str2, str3);
        } catch (InvalidKeySpecException unused3) {
            LogUtil.e("HiChainLiteCommandUtil", "InvalidKeySpecException");
            return cng.f1834c;
        }
    }

    private static byte[] b(String str, String str2, String str3) {
        LogUtil.b("HiChainLiteCommandUtil", "getMacShaToken");
        cnh.d().c(str, 2);
        return d(str2, str3);
    }

    public static byte[] d(String str, String str2) {
        try {
            return ckg.c(cph.d(str), cph.d(str2));
        } catch (UnsupportedEncodingException unused) {
            LogUtil.d("HiChainLiteCommandUtil", "HMac256 occur exception with info is UnsupportedEncodingException");
            return cng.f1834c;
        } catch (InvalidKeyException unused2) {
            LogUtil.d("HiChainLiteCommandUtil", "HMac256 occur exception with info is InvalidKeyException");
            return cng.f1834c;
        } catch (NoSuchAlgorithmException unused3) {
            LogUtil.d("HiChainLiteCommandUtil", "HMac256 occur exception with info is NoSuchAlgorithmException");
            return cng.f1834c;
        }
    }

    public static String d(DeviceInfo deviceInfo, String str, String str2, int i) {
        if (deviceInfo == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        String deviceMac = deviceInfo.getDeviceMac();
        if (cnh.d().g(deviceMac)) {
            String strF = cnh.d().f(deviceMac);
            if (TextUtils.isEmpty(strF)) {
                LogUtil.d("HiChainLiteCommandUtil", "secret lost");
                cpv.d();
                return "";
            }
            return cph.d(d(strF + str, str2));
        }
        return e(str, i, str2, deviceMac);
    }

    public static String e(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bArrD = cph.d(cqq.b(cku.c(str3), "SHA-256"));
        byte[] bArrD2 = cph.d(cku.a(i));
        for (int i2 = 0; i2 < bArrD2.length; i2++) {
            bArrD2[i2] = (byte) (bArrD[i2] ^ bArrD2[i2]);
        }
        String strD = cph.d(d(str3, cph.d(bArrD2) + str, str2));
        LogUtil.b("HiChainLiteCommandUtil", "hichainlate authentic Kn knZero:", cpl.a(strD));
        if (str.equals("0100")) {
            cnh.d().e(str3, strD.substring(0, strD.length() / 2));
        }
        return cph.d(d(strD, str2));
    }

    public static byte[] e() {
        try {
            return ckg.b(16);
        } catch (NoSuchAlgorithmException unused) {
            LogUtil.d("HiChainLiteCommandUtil", "getRandomNum exception");
            return cng.f1834c;
        }
    }
}
