package com.xiaomi.accountsdk.diagnosis.encrypt;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SecretKeySpec f10846a;

    public a(byte[] bArr) {
        if (bArr == null) {
            throw new SecurityException("aes key is null");
        }
        this.f10846a = new SecretKeySpec(bArr, "AES");
    }

    public String a(String str) throws b {
        try {
            return Base64.encodeToString(a(str.getBytes("UTF-8")), 2);
        } catch (Exception e) {
            throw new b("fail to encrypt by aescoder", e);
        }
    }

    public byte[] a() {
        return "0102030405060708".getBytes();
    }

    public byte[] a(byte[] bArr) throws b {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, this.f10846a, new IvParameterSpec(a()));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new b("fail to encrypt by aescoder", e);
        }
    }
}
