package hc;

import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements bb.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f82860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fa.r f82861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fa.r f82862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fa.q f82863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bb.p f82864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f82865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f82866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f82868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f82869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f82870l;

    public e(int i14) {
        this.f82859a = (i14 & 2) != 0 ? i14 | 1 : i14;
        this.f82860b = new f(true);
        this.f82861c = new fa.r(2048);
        this.f82867i = -1;
        this.f82866h = -1L;
        fa.r rVar = new fa.r(10);
        this.f82862d = rVar;
        this.f82863e = new fa.q(rVar.f70054a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x010b  */
    @Override // bb.n
    public final int b(bb.o oVar, bb.f0 f0Var) throws ParserException {
        boolean z14;
        fa.a.f(this.f82864f);
        long length = oVar.getLength();
        int i14 = this.f82859a;
        int i15 = i14 & 2;
        int i16 = -1;
        int i17 = 0;
        if (i15 != 0 || ((i14 & 1) != 0 && length != -1)) {
            fa.q qVar = this.f82863e;
            fa.r rVar = this.f82862d;
            if (!this.f82868j) {
                this.f82867i = -1;
                oVar.resetPeekPosition();
                long j8 = 0;
                if (oVar.getPosition() == 0) {
                    f(oVar);
                }
                int i18 = 0;
                while (true) {
                    try {
                        if (oVar.peekFully(rVar.f70054a, i17, 2, true)) {
                            rVar.G(i17);
                            if (((rVar.A() & 65526) == 65520 ? 1 : i17) == 0) {
                                i18 = i17;
                            } else if (oVar.peekFully(rVar.f70054a, i17, 4, true)) {
                                qVar.m(14);
                                int iG = qVar.g(13);
                                if (iG > 6) {
                                    j8 += (long) iG;
                                    i18++;
                                    if (i18 != 1000) {
                                        try {
                                            if (oVar.advancePeekPosition(iG - 6, true)) {
                                                i17 = 0;
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } else {
                                    try {
                                        this.f82868j = true;
                                        throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                                    } catch (EOFException unused2) {
                                    }
                                }
                            }
                            oVar.resetPeekPosition();
                            if (i18 > 0) {
                                this.f82867i = (int) (j8 / ((long) i18));
                            } else {
                                this.f82867i = -1;
                            }
                            this.f82868j = true;
                        }
                        j8 = j8;
                    } catch (EOFException unused3) {
                    }
                    oVar.resetPeekPosition();
                    if (i18 > 0) {
                        this.f82867i = (int) (j8 / ((long) i18));
                    } else {
                        this.f82867i = -1;
                    }
                    this.f82868j = true;
                }
            }
        }
        fa.r rVar2 = this.f82861c;
        int i19 = oVar.read(rVar2.f70054a, 0, 2048);
        boolean z15 = i19 == -1;
        boolean z16 = this.f82870l;
        f fVar = this.f82860b;
        if (z16) {
            i16 = -1;
            z14 = true;
        } else {
            boolean z17 = (i14 & 1) != 0 && this.f82867i > 0;
            if (z17 && fVar.f82917r == C.TIME_UNSET && !z15) {
                i16 = -1;
                z14 = true;
            } else {
                if (z17) {
                    long j14 = fVar.f82917r;
                    if (j14 != C.TIME_UNSET) {
                        bb.p pVar = this.f82864f;
                        boolean z18 = i15 != 0;
                        int i24 = this.f82867i;
                        pVar.a(new bb.h(length, this.f82866h, (int) ((((long) i24) * 8000000) / j14), i24, z18));
                    } else {
                        this.f82864f.a(new bb.g0.b(C.TIME_UNSET));
                    }
                } else {
                    this.f82864f.a(new bb.g0.b(C.TIME_UNSET));
                }
                z14 = true;
                this.f82870l = true;
            }
        }
        if (z15) {
            return i16;
        }
        rVar2.G(0);
        rVar2.F(i19);
        if (!this.f82869k) {
            fVar.f82919t = this.f82865g;
            this.f82869k = z14;
        }
        fVar.b(rVar2);
        return 0;
    }

    @Override // bb.n
    public final void c(bb.p pVar) {
        this.f82864f = pVar;
        this.f82860b.c(pVar, new f0.d(0, 1));
        pVar.endTracks();
    }

    @Override // bb.n
    public final boolean d(bb.o oVar) throws EOFException, InterruptedIOException {
        int iF = f(oVar);
        int i14 = iF;
        int i15 = 0;
        int i16 = 0;
        do {
            fa.r rVar = this.f82862d;
            bb.i iVar = (bb.i) oVar;
            iVar.peekFully(rVar.f70054a, 0, 2, false);
            rVar.G(0);
            if ((rVar.A() & 65526) == 65520) {
                i15++;
                if (i15 >= 4 && i16 > 188) {
                    return true;
                }
                iVar.peekFully(rVar.f70054a, 0, 4, false);
                fa.q qVar = this.f82863e;
                qVar.m(14);
                int iG = qVar.g(13);
                if (iG <= 6) {
                    i14++;
                    iVar.f17193f = 0;
                    iVar.advancePeekPosition(i14, false);
                } else {
                    iVar.advancePeekPosition(iG - 6, false);
                    i16 += iG;
                }
            } else {
                i14++;
                iVar.f17193f = 0;
                iVar.advancePeekPosition(i14, false);
            }
            i15 = 0;
            i16 = 0;
        } while (i14 - iF < 8192);
        return false;
    }

    public final int f(bb.o oVar) {
        int i14 = 0;
        while (true) {
            fa.r rVar = this.f82862d;
            oVar.peekFully(rVar.f70054a, 0, 10);
            rVar.G(0);
            if (rVar.x() != 4801587) {
                break;
            }
            rVar.H(3);
            int iT = rVar.t();
            i14 += iT + 10;
            oVar.advancePeekPosition(iT);
        }
        oVar.resetPeekPosition();
        oVar.advancePeekPosition(i14);
        if (this.f82866h == -1) {
            this.f82866h = i14;
        }
        return i14;
    }

    @Override // bb.n
    public final void release() {
    }

    @Override // bb.n
    public final void seek(long j8, long j14) {
        this.f82869k = false;
        this.f82860b.seek();
        this.f82865g = j14;
    }

    public e() {
        this(0);
    }
}
