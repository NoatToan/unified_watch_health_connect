package defpackage;

import android.text.TextUtils;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class ebo {
    private byte[] e = new byte[16];
    private byte[] d = new byte[16];

    public byte[] d() {
        return (byte[]) this.e.clone();
    }

    public byte[] c() {
        return (byte[]) this.d.clone();
    }

    public void e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            dyg.c(true, "CoapEncryptExpression", "snAppRandom or snDeviceRandom is not right!");
            return;
        }
        if (str.length() != 16 || str2.length() != 16) {
            dyg.c(true, "CoapEncryptExpression", "snAppRandom or snDeviceRandom length is not right!");
            return;
        }
        byte[] bArrC = ecj.c(str);
        byte[] bArrC2 = ecj.c(str2);
        byte[] bArr = new byte[bArrC.length + bArrC2.length];
        System.arraycopy(bArrC, 0, bArr, 0, bArrC.length);
        System.arraycopy(bArrC2, 0, bArr, bArrC.length, bArrC2.length);
        eci.d();
        byte[] bArrD = new byte[0];
        try {
            bArrD = ecj.d(bArr, 1, 32);
        } catch (InvalidKeyException e) {
            dyg.e(true, "CoapEncryptExpression", e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            dyg.e(true, "CoapEncryptExpression", e2.getMessage());
        }
        if (bArrD == null || bArrD.length != 32) {
            dyg.c(true, "CoapEncryptExpression", "get digest error! ");
            return;
        }
        byte[] bArr2 = this.e;
        System.arraycopy(bArrD, 0, bArr2, 0, bArr2.length);
        dyg.e(true, "CoapEncryptExpression", "psk = ", ecj.b(this.e));
        int length = this.e.length;
        byte[] bArr3 = this.d;
        System.arraycopy(bArrD, length, bArr3, 0, bArr3.length);
        dyg.e(true, "CoapEncryptExpression", "iv = ", ecj.b(this.d));
    }
}
