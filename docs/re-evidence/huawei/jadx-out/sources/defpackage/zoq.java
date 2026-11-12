package defpackage;

import net.lingala.zip4j.crypto.PBKDF2.PRF;

/* JADX INFO: loaded from: classes20.dex */
public class zoq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zou f54403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PRF f54404c;

    public zoq(zou zouVar) {
        this(zouVar, null);
    }

    public zoq(zou zouVar, PRF prf) {
        this.f54403b = zouVar;
        this.f54404c = prf;
    }

    public byte[] a(char[] cArr, int i, boolean z) {
        cArr.getClass();
        e(zqp.b(cArr, z));
        if (i == 0) {
            i = this.f54404c.getHLen();
        }
        return b(this.f54404c, this.f54403b.c(), this.f54403b.e(), i);
    }

    private void e(byte[] bArr) {
        if (this.f54404c == null) {
            this.f54404c = new zol(this.f54403b.a());
        }
        this.f54404c.init(bArr);
    }

    private byte[] b(PRF prf, byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr == null ? new byte[0] : bArr;
        int hLen = prf.getHLen();
        int iD = d(i2, hLen);
        byte[] bArr3 = new byte[iD * hLen];
        int i3 = 0;
        for (int i4 = 1; i4 <= iD; i4++) {
            b(bArr3, i3, prf, bArr2, i, i4);
            i3 += hLen;
        }
        if (i2 - ((iD - 1) * hLen) >= hLen) {
            return bArr3;
        }
        byte[] bArr4 = new byte[i2];
        System.arraycopy(bArr3, 0, bArr4, 0, i2);
        return bArr4;
    }

    private int d(int i, int i2) {
        return (i / i2) + (i % i2 > 0 ? 1 : 0);
    }

    private void b(byte[] bArr, int i, PRF prf, byte[] bArr2, int i2, int i3) {
        int hLen = prf.getHLen();
        byte[] bArr3 = new byte[hLen];
        byte[] bArrDoFinal = new byte[bArr2.length + 4];
        System.arraycopy(bArr2, 0, bArrDoFinal, 0, bArr2.length);
        b(bArrDoFinal, bArr2.length, i3);
        for (int i4 = 0; i4 < i2; i4++) {
            bArrDoFinal = prf.doFinal(bArrDoFinal);
            d(bArr3, bArrDoFinal);
        }
        System.arraycopy(bArr3, 0, bArr, i, hLen);
    }

    private void d(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    protected void b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 / 16777216);
        bArr[i + 1] = (byte) (i2 / 65536);
        bArr[i + 2] = (byte) (i2 / 256);
        bArr[i + 3] = (byte) i2;
    }
}
