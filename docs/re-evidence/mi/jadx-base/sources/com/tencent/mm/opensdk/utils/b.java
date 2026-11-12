package com.tencent.mm.opensdk.utils;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static final String c(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i = 0;
            for (byte b2 : bArrDigest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b2 >>> 4) & 15];
                i += 2;
                cArr2[i2] = cArr[b2 & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }
}
