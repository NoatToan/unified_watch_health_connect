package com.xiaomi.account.utils;

import com.xiaomi.accountsdk.diagnosis.encrypt.PassportEnvEncryptUtils;

/* JADX INFO: loaded from: classes18.dex */
public class LogEncryptUtils {
    public static String generateEncryptMessageLine(String str) {
        try {
            PassportEnvEncryptUtils.EncryptResult encryptResultEncrypt = PassportEnvEncryptUtils.encrypt(str);
            return String.format("#&^%s!!%s^&#", encryptResultEncrypt.encryptedKey, encryptResultEncrypt.content);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }
}
