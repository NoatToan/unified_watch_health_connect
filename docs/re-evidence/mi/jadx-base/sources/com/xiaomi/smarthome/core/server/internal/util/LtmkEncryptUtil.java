package com.xiaomi.smarthome.core.server.internal.util;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class LtmkEncryptUtil {
    private static final String AES_CBC_IV = "7aa4c68c590d4031b980d98b41023800";
    private static final String AES_CBC_MODE = "AES/CBC/NoPadding";
    public static final int ENCRYPT_TYPE_AES_CBC = 1;
    public static final int ENCRYPT_TYPE_NO_ENCRYPT = 0;
    public static final String KEY_SHOW_SECURE_PIN = "show_secure_pin";
    public static final String VALUE_HIDE_SECURE_PIN = "0";
    public static final String VALUE_SHOW_SECURE_PIN = "1";

    private static String decryptAesCbc(String str, String str2) {
        try {
            SecretKeySpec secretKeySpecGenerateAesMd5Key = generateAesMd5Key(str);
            Cipher cipher = Cipher.getInstance(AES_CBC_MODE);
            cipher.init(2, secretKeySpecGenerateAesMd5Key, new IvParameterSpec(ByteUtils.stringToBytes(AES_CBC_IV)));
            return ByteUtils.byteToString(cipher.doFinal(ByteUtils.stringToBytes(str2)));
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static String decryptLtmk(String str, String str2, int i) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !isValidType(i) || i != 1) ? str2 : decryptAesCbc(str, str2);
    }

    private static String encryptAesCbc(String str, String str2) {
        try {
            SecretKeySpec secretKeySpecGenerateAesMd5Key = generateAesMd5Key(str);
            Cipher cipher = Cipher.getInstance(AES_CBC_MODE);
            cipher.init(1, secretKeySpecGenerateAesMd5Key, new IvParameterSpec(ByteUtils.stringToBytes(AES_CBC_IV)));
            return ByteUtils.byteToString(cipher.doFinal(ByteUtils.stringToBytes(str2)));
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static String encryptLtmk(String str, String str2, int i) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !isValidType(i) || i != 1) ? str2 : encryptAesCbc(str, str2);
    }

    private static SecretKeySpec generateAesMd5Key(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
        byte[] bytes = str.getBytes("UTF-8");
        messageDigest.update(bytes, 0, bytes.length);
        return new SecretKeySpec(messageDigest.digest(), "AES");
    }

    private static boolean isValidType(int i) {
        return i == 0 || i == 1;
    }
}
