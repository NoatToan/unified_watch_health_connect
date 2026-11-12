package bb;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f17213a = new byte[4096];

    @Override // bb.l0
    public final void a(fa.r rVar, int i14, int i15) {
        rVar.H(i14);
    }

    @Override // bb.l0
    public final void c(long j8, int i14, int i15, int i16, l0.a aVar) {
    }

    @Override // bb.l0
    public final void d(androidx.media3.common.q qVar) {
    }

    @Override // bb.l0
    public final int e(androidx.media3.common.j jVar, int i14, boolean z14) throws EOFException {
        byte[] bArr = this.f17213a;
        int i15 = jVar.read(bArr, 0, Math.min(bArr.length, i14));
        if (i15 != -1) {
            return i15;
        }
        if (z14) {
            return -1;
        }
        vb.h.m();
        return 0;
    }
}
