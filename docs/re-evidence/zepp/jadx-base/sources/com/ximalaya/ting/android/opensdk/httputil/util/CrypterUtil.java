package com.ximalaya.ting.android.opensdk.httputil.util;

import android.util.Base64;
import com.huami.network.hmnetwork.utils.a;
import com.ximalaya.ting.android.opensdk.util.DigestUtils;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes22.dex */
public class CrypterUtil {
    private static final String CipherMode = "AES/ECB/PKCS5Padding";
    private static final String HMAC_SHA1 = "HmacSHA1";

    public static String encryptStr(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance(CipherMode);
            cipher.init(1, new SecretKeySpec(str2.getBytes(), a.a));
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] hmacSHA1(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, HMAC_SHA1);
        Mac mac = Mac.getInstance(HMAC_SHA1);
        mac.init(secretKeySpec);
        return mac.doFinal(bArr);
    }

    public static String hmacSHA1ToStr(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        return DigestUtils.md5Hex(hmacSHA1(bArr, bArr2));
    }

    public static String hmacSHA1ToStr(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (str == null || str2 == null) {
            return null;
        }
        return hmacSHA1ToStr(str.getBytes(), str2.getBytes());
    }
}
