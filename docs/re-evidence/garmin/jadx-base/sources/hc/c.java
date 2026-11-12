package hc;

import com.google.android.exoplayer2.C;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements bb.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f82830a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.r f82831b = new fa.r(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82832c;

    @Override // bb.n
    public final int b(bb.o oVar, bb.f0 f0Var) {
        fa.r rVar = this.f82831b;
        int i14 = oVar.read(rVar.f70054a, 0, 16384);
        if (i14 == -1) {
            return -1;
        }
        rVar.G(0);
        rVar.F(i14);
        boolean z14 = this.f82832c;
        d dVar = this.f82830a;
        if (!z14) {
            dVar.f82849m = 0L;
            this.f82832c = true;
        }
        dVar.b(rVar);
        return 0;
    }

    @Override // bb.n
    public final void c(bb.p pVar) {
        this.f82830a.c(pVar, new f0.d(0, 1));
        pVar.endTracks();
        pVar.a(new bb.g0.b(C.TIME_UNSET));
    }

    @Override // bb.n
    public final boolean d(bb.o oVar) throws EOFException, InterruptedIOException {
        bb.i iVar;
        int i14;
        fa.r rVar = new fa.r(10);
        int i15 = 0;
        while (true) {
            iVar = (bb.i) oVar;
            iVar.peekFully(rVar.f70054a, 0, 10, false);
            rVar.G(0);
            if (rVar.x() != 4801587) {
                break;
            }
            rVar.H(3);
            int iT = rVar.t();
            i15 += iT + 10;
            iVar.advancePeekPosition(iT, false);
        }
        iVar.f17193f = 0;
        iVar.advancePeekPosition(i15, false);
        int i16 = 0;
        int i17 = i15;
        while (true) {
            int i18 = 7;
            iVar.peekFully(rVar.f70054a, 0, 7, false);
            rVar.G(0);
            int iA = rVar.A();
            if (iA == 44096 || iA == 44097) {
                i16++;
                if (i16 >= 4) {
                    return true;
                }
                byte[] bArr = rVar.f70054a;
                if (bArr.length < 7) {
                    i14 = -1;
                } else {
                    int i19 = ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE);
                    if (i19 == 65535) {
                        i19 = ((bArr[4] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[5] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[6] & UnsignedBytes.MAX_VALUE);
                    } else {
                        i18 = 4;
                    }
                    if (iA == 44097) {
                        i18 += 2;
                    }
                    i14 = i19 + i18;
                }
                if (i14 == -1) {
                    break;
                }
                iVar.advancePeekPosition(i14 - 7, false);
            } else {
                iVar.f17193f = 0;
                i17++;
                if (i17 - i15 >= 8192) {
                    break;
                }
                iVar.advancePeekPosition(i17, false);
                i16 = 0;
            }
        }
        return false;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f82832c = false;
        this.f82830a.seek();
    }
}
