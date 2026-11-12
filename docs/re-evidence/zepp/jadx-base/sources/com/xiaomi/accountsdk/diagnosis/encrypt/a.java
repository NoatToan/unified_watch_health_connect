package com.xiaomi.accountsdk.diagnosis.encrypt;

import android.util.Base64;
import android.util.Log;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes18.dex */
public class a {
    private SecretKeySpec a;

    public a(byte[] bArr) {
        if (bArr == null) {
            throw new SecurityException("aes key is null");
        }
        if (bArr.length != 16) {
            Log.e("AESCoder", "aesKey is invalid");
        }
        this.a = new SecretKeySpec(bArr, com.huami.network.hmnetwork.utils.a.a);
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
            cipher.init(1, this.a, new IvParameterSpec(a()));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new b("fail to encrypt by aescoder", e);
        }
    }
}
