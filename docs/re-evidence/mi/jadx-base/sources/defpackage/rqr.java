package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class rqr {
    public int a(b87 b87Var) {
        return (b87Var.p() + 7) / 8;
    }

    public int b(h87 h87Var) {
        return (h87Var.f() + 7) / 8;
    }

    public byte[] c(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
            return bArr;
        }
        if (i <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
        return bArr2;
    }
}
