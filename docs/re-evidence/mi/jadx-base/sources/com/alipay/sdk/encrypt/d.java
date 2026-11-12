package com.alipay.sdk.encrypt;

import com.miuipub.internal.hybrid.SignUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public class d {
    /* JADX WARN: Code duplicated, block: B:35:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] a(String str, String str2) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray = null;
        byteArray = null;
        byteArray = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                PublicKey publicKeyB = b(SignUtils.KEY_RSA, str2);
                Cipher cipher = Cipher.getInstance(SignUtils.CIPHER_RSA);
                cipher.init(1, publicKeyB);
                byte[] bytes = str.getBytes("UTF-8");
                int blockSize = cipher.getBlockSize();
                byteArrayOutputStream = new ByteArrayOutputStream();
                for (int i = 0; i < bytes.length; i += blockSize) {
                    try {
                        try {
                            byteArrayOutputStream.write(cipher.doFinal(bytes, i, bytes.length - i < blockSize ? bytes.length - i : blockSize));
                        } catch (Exception e) {
                            e = e;
                            com.alipay.sdk.util.c.d(e);
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        }
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        if (byteArrayOutputStream2 != null) {
                            try {
                                byteArrayOutputStream2.close();
                            } catch (IOException e2) {
                                com.alipay.sdk.util.c.d(e2);
                            }
                        }
                        throw th;
                    }
                }
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                com.alipay.sdk.util.c.d(e3);
            }
        } catch (Exception e4) {
            e = e4;
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayOutputStream2 != null) {
                byteArrayOutputStream2.close();
            }
            throw th;
        }
        return byteArray;
    }

    public static PublicKey b(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(a.d(str2)));
    }
}
