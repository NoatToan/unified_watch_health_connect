package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class Hkdf {
    public static byte[] computeEciesHkdfSymmetricKey(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, byte[] bArr4, int i14) {
        return computeHkdf(str, Bytes.concat(bArr, bArr2), bArr3, bArr4, i14);
    }

    public static byte[] computeHkdf(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i14) throws GeneralSecurityException {
        Mac engineFactory = EngineFactory.MAC.getInstance(str);
        if (i14 > engineFactory.getMacLength() * 255) {
            a.t("size too large");
            return null;
        }
        if (bArr2 == null || bArr2.length == 0) {
            engineFactory.init(new SecretKeySpec(new byte[engineFactory.getMacLength()], str));
        } else {
            engineFactory.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i14];
        engineFactory.init(new SecretKeySpec(engineFactory.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i15 = 1;
        int length = 0;
        while (true) {
            engineFactory.update(bArrDoFinal);
            engineFactory.update(bArr3);
            engineFactory.update((byte) i15);
            bArrDoFinal = engineFactory.doFinal();
            if (bArrDoFinal.length + length >= i14) {
                System.arraycopy(bArrDoFinal, 0, bArr4, length, i14 - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i15++;
        }
    }
}
