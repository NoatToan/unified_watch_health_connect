package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class j2q {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long b(okh okhVar, int i, int i2) {
        okhVar.P(i);
        if (okhVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iN = okhVar.n();
        if ((8388608 & iN) != 0 || ((2096896 & iN) >> 8) != i2 || (iN & 32) == 0 || okhVar.D() < 7 || okhVar.a() < 7 || (okhVar.D() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        okhVar.j(bArr, 0, 6);
        return c(bArr);
    }

    public static long c(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
