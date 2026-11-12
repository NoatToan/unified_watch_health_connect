package com.xiaomi.accountsdk.diagnosis.encrypt;

import android.util.Log;

/* JADX INFO: loaded from: classes18.dex */
class e {
    private e() {
    }

    private static int a(int i, String str, String str2) throws Throwable {
        com.xiaomi.accountsdk.diagnosis.b.a.a(com.xiaomi.accountsdk.diagnosis.b.b.a(com.xiaomi.accountsdk.diagnosis.b.c.a(i), str) + str2);
        return Log.println(i, str, str2);
    }

    public static e c() {
        return new e();
    }

    private String d(String str) {
        try {
            PassportEnvEncryptUtils.EncryptResult encryptResultEncrypt = PassportEnvEncryptUtils.encrypt(str);
            return String.format("#&^%s!!%s^&#", encryptResultEncrypt.encryptedKey, encryptResultEncrypt.content);
        } catch (PassportEnvEncryptUtils.EncryptException e) {
            e.printStackTrace();
            return str;
        }
    }

    public int b(int i, String str, String str2, Throwable th) {
        int iA = a(i, str, d(str2)) + 0;
        return th != null ? iA + a(i, str, d(Log.getStackTraceString(th))) : iA;
    }
}
