package com.xiaomi.phonenum.utils;

import android.util.Base64;
import com.xiaomi.accountsdk.utils.AccountLogger;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public class AESCoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKeySpec f14018a;

    public AESCoder(byte[] bArr) {
        if (bArr == null) {
            throw new SecurityException("aes key is null");
        }
        if (bArr.length != 16) {
            AccountLogger.log(com.xiaomi.accountsdk.utils.AESCoder.TAG, "aesKey is invalid");
        }
        this.f14018a = new SecretKeySpec(bArr, "AES");
    }

    public String a(String str) throws CipherException {
        if (str == null) {
            AccountLogger.log(com.xiaomi.accountsdk.utils.AESCoder.TAG, "decrypt failed for empty data");
            return null;
        }
        try {
            return new String(b(Base64.decode(str, 2)), "UTF-8");
        } catch (Exception e) {
            throw new CipherException("fail to decrypt by aescoder", e);
        }
    }

    public final byte[] b(byte[] bArr) throws CipherException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, this.f14018a, new IvParameterSpec(e()));
            if (bArr != null) {
                return cipher.doFinal(bArr);
            }
            throw new IllegalBlockSizeException("no block data");
        } catch (Exception e) {
            throw new CipherException("fail to decrypt by aescoder", e);
        }
    }

    public String c(String str) throws CipherException {
        try {
            return Base64.encodeToString(d(str.getBytes("UTF-8")), 10);
        } catch (Exception e) {
            throw new CipherException("fail to encrypt by aescoder", e);
        }
    }

    public final byte[] d(byte[] bArr) throws CipherException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, this.f14018a, new IvParameterSpec(e()));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new CipherException("fail to encrypt by aescoder", e);
        }
    }

    public final byte[] e() {
        return "0102030405060708".getBytes();
    }

    public class CipherException extends Exception {
        private static final long serialVersionUID = -1479750857131098427L;

        public CipherException(String str) {
            super(str);
        }

        public CipherException(String str, Throwable th) {
            super(str, th);
        }

        public CipherException(Throwable th) {
            super(th);
        }
    }
}
