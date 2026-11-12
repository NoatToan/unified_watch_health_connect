package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class sqr {
    public int a(a87 a87Var) {
        return (a87Var.s() + 7) / 8;
    }

    public int b(g87 g87Var) {
        return (g87Var.f() + 7) / 8;
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
