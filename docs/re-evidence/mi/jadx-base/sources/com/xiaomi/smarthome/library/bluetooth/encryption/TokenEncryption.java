package com.xiaomi.smarthome.library.bluetooth.encryption;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenEncryption implements Encryption {
    private static final String TOKEN_KEY = "token.key";
    private Encryption mEncryption;

    public static class TokenEncryptionHolder {
        private static TokenEncryption instance = new TokenEncryption();

        private TokenEncryptionHolder() {
        }
    }

    public static TokenEncryption getInstance() {
        return TokenEncryptionHolder.instance;
    }

    private String getPassword(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        return String.format("%s.%s", TOKEN_KEY, str);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.encryption.Encryption
    public String decrypt(String str, String str2) {
        return TextUtils.isEmpty(str2) ? "" : this.mEncryption.decrypt(str, str2);
    }

    public String decryptToken(String str, String str2) {
        return decrypt(getPassword(str), str2);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.encryption.Encryption
    public String encrypt(String str, String str2) {
        return TextUtils.isEmpty(str2) ? "" : this.mEncryption.encrypt(str, str2);
    }

    public String encryptToken(String str, String str2) {
        return encrypt(getPassword(str), str2);
    }

    private TokenEncryption() {
        this.mEncryption = new AESEncryption();
    }
}
