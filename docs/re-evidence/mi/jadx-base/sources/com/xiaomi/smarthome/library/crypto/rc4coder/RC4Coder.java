package com.xiaomi.smarthome.library.crypto.rc4coder;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class RC4Coder {
    public static final String RC4_ALGORITHM = "RC4";
    private SecretKeySpec keySpec;

    public RC4Coder(byte[] bArr) throws SecurityException {
        if (isEmpty(bArr)) {
            throw new SecurityException("rc4 key is null");
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException("rc4Key is invalid");
        }
        this.keySpec = new SecretKeySpec(bArr, RC4_ALGORITHM);
    }

    private static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public byte[] decrypt(byte[] bArr) throws SecurityException {
        try {
            Cipher cipher = Cipher.getInstance(RC4_ALGORITHM);
            cipher.init(2, this.keySpec);
            if (bArr != null) {
                return cipher.doFinal(bArr);
            }
            throw new IllegalBlockSizeException("no block data");
        } catch (InvalidKeyException e) {
            throw new SecurityException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new SecurityException(e2);
        } catch (BadPaddingException e3) {
            throw new SecurityException(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new SecurityException(e4);
        } catch (NoSuchPaddingException e5) {
            throw new SecurityException(e5);
        }
    }

    public byte[] encrypt(byte[] bArr) throws SecurityException {
        try {
            Cipher cipher = Cipher.getInstance(RC4_ALGORITHM);
            cipher.init(1, this.keySpec);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException e) {
            throw new SecurityException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new SecurityException(e2);
        } catch (BadPaddingException e3) {
            throw new SecurityException(e3);
        } catch (IllegalBlockSizeException e4) {
            throw new SecurityException(e4);
        } catch (NoSuchPaddingException e5) {
            throw new SecurityException(e5);
        }
    }
}
