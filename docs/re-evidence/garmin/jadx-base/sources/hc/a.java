package hc;

import com.google.android.exoplayer2.C;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements bb.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f82805a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.r f82806b = new fa.r(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82807c;

    @Override // bb.n
    public final int b(bb.o oVar, bb.f0 f0Var) {
        fa.r rVar = this.f82806b;
        int i14 = oVar.read(rVar.f70054a, 0, 2786);
        if (i14 == -1) {
            return -1;
        }
        rVar.G(0);
        rVar.F(i14);
        boolean z14 = this.f82807c;
        b bVar = this.f82805a;
        if (!z14) {
            bVar.f82826m = 0L;
            this.f82807c = true;
        }
        bVar.b(rVar);
        return 0;
    }

    @Override // bb.n
    public final void c(bb.p pVar) {
        this.f82805a.c(pVar, new f0.d(0, 1));
        pVar.endTracks();
        pVar.a(new bb.g0.b(C.TIME_UNSET));
    }

    @Override // bb.n
    public final boolean d(bb.o oVar) throws EOFException, InterruptedIOException {
        bb.i iVar;
        int iA;
        fa.r rVar = new fa.r(10);
        int i14 = 0;
        while (true) {
            iVar = (bb.i) oVar;
            iVar.peekFully(rVar.f70054a, 0, 10, false);
            rVar.G(0);
            if (rVar.x() != 4801587) {
                break;
            }
            rVar.H(3);
            int iT = rVar.t();
            i14 += iT + 10;
            iVar.advancePeekPosition(iT, false);
        }
        iVar.f17193f = 0;
        iVar.advancePeekPosition(i14, false);
        int i15 = 0;
        int i16 = i14;
        while (true) {
            iVar.peekFully(rVar.f70054a, 0, 6, false);
            rVar.G(0);
            if (rVar.A() != 2935) {
                iVar.f17193f = 0;
                i16++;
                if (i16 - i14 >= 8192) {
                    break;
                }
                iVar.advancePeekPosition(i16, false);
                i15 = 0;
            } else {
                i15++;
                if (i15 >= 4) {
                    return true;
                }
                byte[] bArr = rVar.f70054a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE)) + 1) * 2;
                } else {
                    byte b14 = bArr[4];
                    iA = bb.b.a((b14 & 192) >> 6, b14 & 63);
                }
                if (iA == -1) {
                    break;
                }
                iVar.advancePeekPosition(iA - 6, false);
            }
        }
        return false;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f82807c = false;
        this.f82805a.seek();
    }
}
