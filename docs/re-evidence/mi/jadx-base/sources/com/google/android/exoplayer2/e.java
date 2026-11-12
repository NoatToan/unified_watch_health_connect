package com.google.android.exoplayer2;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import defpackage.a1a;
import defpackage.k9l;
import defpackage.rk1;
import defpackage.rkk;
import defpackage.skk;
import defpackage.vif;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e implements s, rkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7910a;
    public skk c;
    public int d;
    public int e;
    public k9l f;
    public Format[] g;
    public long h;
    public long i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7912k;
    public boolean l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1a f7911b = new a1a();
    public long j = Long.MIN_VALUE;

    public e(int i) {
        this.f7910a = i;
    }

    public final skk A() {
        return (skk) rk1.e(this.c);
    }

    public final a1a B() {
        this.f7911b.a();
        return this.f7911b;
    }

    public final int C() {
        return this.d;
    }

    public final Format[] D() {
        return (Format[]) rk1.e(this.g);
    }

    public final boolean E() {
        return f() ? this.f7912k : ((k9l) rk1.e(this.f)).isReady();
    }

    public abstract void F();

    public void G(boolean z, boolean z2) throws ExoPlaybackException {
    }

    public abstract void H(long j, boolean z) throws ExoPlaybackException;

    public void I() {
    }

    public void J() throws ExoPlaybackException {
    }

    public void K() {
    }

    public abstract void L(Format[] formatArr, long j, long j2) throws ExoPlaybackException;

    public final int M(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int iD = ((k9l) rk1.e(this.f)).d(a1aVar, decoderInputBuffer, i);
        if (iD == -4) {
            if (decoderInputBuffer.n()) {
                this.j = Long.MIN_VALUE;
                return this.f7912k ? -4 : -3;
            }
            long j = decoderInputBuffer.e + this.h;
            decoderInputBuffer.e = j;
            this.j = Math.max(this.j, j);
        } else if (iD == -5) {
            Format format = (Format) rk1.e(a1aVar.f517b);
            if (format.p != Long.MAX_VALUE) {
                a1aVar.f517b = format.a().i0(format.p + this.h).E();
            }
        }
        return iD;
    }

    public int N(long j) {
        return ((k9l) rk1.e(this.f)).k(j - this.h);
    }

    @Override // com.google.android.exoplayer2.s
    public final void disable() {
        rk1.g(this.e == 1);
        this.f7911b.a();
        this.e = 0;
        this.f = null;
        this.g = null;
        this.f7912k = false;
        F();
    }

    @Override // com.google.android.exoplayer2.s, defpackage.rkk
    public final int e() {
        return this.f7910a;
    }

    @Override // com.google.android.exoplayer2.s
    public final boolean f() {
        return this.j == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.s
    public final rkk getCapabilities() {
        return this;
    }

    @Override // com.google.android.exoplayer2.s
    public final int getState() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.s
    public final k9l getStream() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.r.b
    public void h(int i, Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.s
    public final void i(Format[] formatArr, k9l k9lVar, long j, long j2) throws ExoPlaybackException {
        rk1.g(!this.f7912k);
        this.f = k9lVar;
        this.j = j2;
        this.g = formatArr;
        this.h = j2;
        L(formatArr, j, j2);
    }

    @Override // com.google.android.exoplayer2.s
    public final boolean j() {
        return this.f7912k;
    }

    @Override // com.google.android.exoplayer2.s
    public final long m() {
        return this.j;
    }

    @Override // com.google.android.exoplayer2.s
    public final void n(long j) throws ExoPlaybackException {
        this.f7912k = false;
        this.i = j;
        this.j = j;
        H(j, false);
    }

    @Override // com.google.android.exoplayer2.s
    public vif o() {
        return null;
    }

    @Override // com.google.android.exoplayer2.s
    public final void q() {
        this.f7912k = true;
    }

    @Override // com.google.android.exoplayer2.s
    public final void r(skk skkVar, Format[] formatArr, k9l k9lVar, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        rk1.g(this.e == 0);
        this.c = skkVar;
        this.e = 1;
        this.i = j;
        G(z, z2);
        i(formatArr, k9lVar, j2, j3);
        H(j, z);
    }

    @Override // com.google.android.exoplayer2.s
    public final void reset() {
        rk1.g(this.e == 0);
        this.f7911b.a();
        I();
    }

    @Override // com.google.android.exoplayer2.s
    public final void setIndex(int i) {
        this.d = i;
    }

    @Override // com.google.android.exoplayer2.s
    public final void start() throws ExoPlaybackException {
        rk1.g(this.e == 1);
        this.e = 2;
        J();
    }

    @Override // com.google.android.exoplayer2.s
    public final void stop() {
        rk1.g(this.e == 2);
        this.e = 1;
        K();
    }

    @Override // com.google.android.exoplayer2.s
    public final void u() throws IOException {
        ((k9l) rk1.e(this.f)).a();
    }

    @Override // defpackage.rkk
    public int x() throws ExoPlaybackException {
        return 0;
    }

    public final ExoPlaybackException y(Throwable th, Format format) {
        return z(th, format, false);
    }

    public final ExoPlaybackException z(Throwable th, Format format, boolean z) {
        int iP;
        if (format == null || this.l) {
            iP = 4;
        } else {
            this.l = true;
            try {
                iP = rkk.p(a(format));
                this.l = false;
            } catch (ExoPlaybackException unused) {
                this.l = false;
                iP = 4;
            } catch (Throwable th2) {
                this.l = false;
                throw th2;
            }
        }
        return ExoPlaybackException.createForRenderer(th, getName(), C(), format, iP, z);
    }
}
