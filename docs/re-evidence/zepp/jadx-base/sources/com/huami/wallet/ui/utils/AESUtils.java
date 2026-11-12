package com.huami.wallet.ui.utils;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes16.dex */
public class AESUtils {
    private static final String a = "sdf4ddfsFD86Vdf2";
    private static final String b = "UTF-8";

    public static String decryptAes(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        byte[] bArrDecode = Base64.decode(URLDecoder.decode(str, "UTF-8"), 0);
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), com.huami.network.hmnetwork.utils.a.a);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(a.getBytes("UTF-8"));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArrDecode), "UTF-8");
    }

    public static String encryptAes(String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        byte[] bytes = str.getBytes("UTF-8");
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), com.huami.network.hmnetwork.utils.a.a);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(a.getBytes("UTF-8"));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return URLEncoder.encode(Base64.encodeToString(cipher.doFinal(bytes), 0), "UTF-8");
    }
}
