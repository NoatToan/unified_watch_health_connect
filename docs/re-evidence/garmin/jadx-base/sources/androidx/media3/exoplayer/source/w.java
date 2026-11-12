package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.x0;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class w implements i, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i.a f9688c;

    public static final class a implements sa.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sa.n f9689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9690b;

        public a(sa.n nVar, long j8) {
            this.f9689a = nVar;
            this.f9690b = j8;
        }

        @Override // sa.n
        public final int a(a0 a0Var, DecoderInputBuffer decoderInputBuffer, int i14) {
            int iA = this.f9689a.a(a0Var, decoderInputBuffer, i14);
            if (iA == -4) {
                decoderInputBuffer.f8633f += this.f9690b;
            }
            return iA;
        }

        @Override // sa.n
        public final boolean isReady() {
            return this.f9689a.isReady();
        }

        @Override // sa.n
        public final void maybeThrowError() {
            this.f9689a.maybeThrowError();
        }

        @Override // sa.n
        public final int skipData(long j8) {
            return this.f9689a.skipData(j8 - this.f9690b);
        }
    }

    public w(i iVar, long j8) {
        this.f9686a = iVar;
        this.f9687b = j8;
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final void a(i iVar) {
        i.a aVar = this.f9688c;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // androidx.media3.exoplayer.source.s.a
    public final void b(s sVar) {
        i.a aVar = this.f9688c;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void c(i.a aVar, long j8) {
        this.f9688c = aVar;
        this.f9686a.c(this, j8 - this.f9687b);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long d(wa.g[] gVarArr, boolean[] zArr, sa.n[] nVarArr, boolean[] zArr2, long j8) {
        sa.n[] nVarArr2 = new sa.n[nVarArr.length];
        int i14 = 0;
        while (true) {
            sa.n nVar = null;
            if (i14 >= nVarArr.length) {
                break;
            }
            a aVar = (a) nVarArr[i14];
            if (aVar != null) {
                nVar = aVar.f9689a;
            }
            nVarArr2[i14] = nVar;
            i14++;
        }
        i iVar = this.f9686a;
        long j14 = this.f9687b;
        long jD = iVar.d(gVarArr, zArr, nVarArr2, zArr2, j8 - j14);
        for (int i15 = 0; i15 < nVarArr.length; i15++) {
            sa.n nVar2 = nVarArr2[i15];
            if (nVar2 == null) {
                nVarArr[i15] = null;
            } else {
                sa.n nVar3 = nVarArr[i15];
                if (nVar3 == null || ((a) nVar3).f9689a != nVar2) {
                    nVarArr[i15] = new a(nVar2, j14);
                }
            }
        }
        return jD + j14;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void discardBuffer(long j8, boolean z14) {
        this.f9686a.discardBuffer(j8 - this.f9687b, z14);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long e(long j8, x0 x0Var) {
        long j14 = this.f9687b;
        return this.f9686a.e(j8 - j14, x0Var) + j14;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean f(d0 d0Var) {
        d0.b bVar = new d0.b();
        bVar.f8815a = d0Var.f8812a - this.f9687b;
        return this.f9686a.f(bVar.a());
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f9686a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f9687b;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f9686a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f9687b;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final sa.r getTrackGroups() {
        return this.f9686a.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean isLoading() {
        return this.f9686a.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowPrepareError() {
        this.f9686a.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long readDiscontinuity() {
        long discontinuity = this.f9686a.readDiscontinuity();
        return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : discontinuity + this.f9687b;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void reevaluateBuffer(long j8) {
        this.f9686a.reevaluateBuffer(j8 - this.f9687b);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long seekToUs(long j8) {
        long j14 = this.f9687b;
        return this.f9686a.seekToUs(j8 - j14) + j14;
    }
}
