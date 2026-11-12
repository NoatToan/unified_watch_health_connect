package com.xiaomi.smarthome.library.bluetooth.encryption;

import com.xiaomi.smarthome.library.bluetooth.utils.AESCryptUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class AESEncryption implements Encryption {
    @Override // com.xiaomi.smarthome.library.bluetooth.encryption.Encryption
    public String decrypt(String str, String str2) {
        try {
            return AESCryptUtils.decrypt(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.encryption.Encryption
    public String encrypt(String str, String str2) {
        try {
            return AESCryptUtils.encrypt(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
