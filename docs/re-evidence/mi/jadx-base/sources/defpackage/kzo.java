package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class kzo implements sua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f24458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[][] f24459b;

    @Override // defpackage.sua
    public void a(byte[] bArr) {
        if (this.f24459b == null) {
            this.f24459b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (vj1.a(this.f24458a, bArr)) {
            return;
        }
        byte[] bArrE = vj1.e(bArr);
        this.f24458a = bArrE;
        tua.b(bArrE, this.f24459b[1]);
        long[] jArr = this.f24459b[1];
        tua.g(jArr, jArr);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr2 = this.f24459b;
            tua.d(jArr2[i >> 1], jArr2[i]);
            long[][] jArr3 = this.f24459b;
            tua.o(jArr3[i], jArr3[1], jArr3[i + 1]);
        }
    }

    @Override // defpackage.sua
    public void b(byte[] bArr) {
        long[] jArr = this.f24459b[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.f24459b[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        zgh.j(j, bArr, 0);
        zgh.j(j2, bArr, 8);
    }
}
