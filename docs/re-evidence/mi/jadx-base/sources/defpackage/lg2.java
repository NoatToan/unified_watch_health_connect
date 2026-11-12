package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class lg2 implements rua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f25025a;

    @Override // defpackage.rua
    public void a(byte[] bArr) {
        this.f25025a = tua.c(bArr);
    }

    @Override // defpackage.rua
    public void b(long j, byte[] bArr) {
        long[] jArrH = tua.h();
        if (j > 0) {
            long[] jArrH2 = vj1.h(this.f25025a);
            do {
                if ((1 & j) != 0) {
                    tua.f(jArrH, jArrH2);
                }
                tua.i(jArrH2, jArrH2);
                j >>>= 1;
            } while (j > 0);
        }
        tua.a(jArrH, bArr);
    }
}
