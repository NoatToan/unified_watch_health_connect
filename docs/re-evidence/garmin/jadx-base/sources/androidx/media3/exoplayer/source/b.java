package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.x0;
import com.google.android.exoplayer2.C;
import fa.z;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i, i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f9425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i.a f9426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a[] f9427c = new a[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ClippingMediaSource.IllegalClippingException f9431g;

    public final class a implements sa.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sa.n f9432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9433b;

        public a(sa.n nVar) {
            this.f9432a = nVar;
        }

        @Override // sa.n
        public final int a(a0 a0Var, DecoderInputBuffer decoderInputBuffer, int i14) {
            b bVar = b.this;
            if (bVar.g()) {
                return -3;
            }
            if (this.f9433b) {
                decoderInputBuffer.f92372a = 4;
                return -4;
            }
            long bufferedPositionUs = bVar.getBufferedPositionUs();
            int iA = this.f9432a.a(a0Var, decoderInputBuffer, i14);
            if (iA != -5) {
                long j8 = bVar.f9430f;
                if (j8 == Long.MIN_VALUE || ((iA != -4 || decoderInputBuffer.f8633f < j8) && !(iA == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.f8632e))) {
                    return iA;
                }
                decoderInputBuffer.c();
                decoderInputBuffer.f92372a = 4;
                this.f9433b = true;
                return -4;
            }
            androidx.media3.common.q qVar = a0Var.f8667b;
            qVar.getClass();
            int i15 = qVar.G;
            int i16 = qVar.F;
            if (i16 == 0 && i15 == 0) {
                return -5;
            }
            if (bVar.f9429e != 0) {
                i16 = 0;
            }
            if (bVar.f9430f != Long.MIN_VALUE) {
                i15 = 0;
            }
            androidx.media3.common.q.b bVarA = qVar.a();
            bVarA.E = i16;
            bVarA.F = i15;
            a0Var.f8667b = bVarA.a();
            return -5;
        }

        @Override // sa.n
        public final boolean isReady() {
            return !b.this.g() && this.f9432a.isReady();
        }

        @Override // sa.n
        public final void maybeThrowError() {
            this.f9432a.maybeThrowError();
        }

        @Override // sa.n
        public final int skipData(long j8) {
            if (b.this.g()) {
                return -3;
            }
            return this.f9432a.skipData(j8);
        }
    }

    public b(i iVar, boolean z14, long j8, long j14) {
        this.f9425a = iVar;
        this.f9428d = z14 ? j8 : C.TIME_UNSET;
        this.f9429e = j8;
        this.f9430f = j14;
    }

    @Override // androidx.media3.exoplayer.source.i.a
    public final void a(i iVar) {
        if (this.f9431g != null) {
            return;
        }
        i.a aVar = this.f9426b;
        aVar.getClass();
        aVar.a(this);
    }

    @Override // androidx.media3.exoplayer.source.s.a
    public final void b(s sVar) {
        i.a aVar = this.f9426b;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void c(i.a aVar, long j8) {
        this.f9426b = aVar;
        this.f9425a.c(this, j8);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    @Override // androidx.media3.exoplayer.source.i
    public final long d(wa.g[] gVarArr, boolean[] zArr, sa.n[] nVarArr, boolean[] zArr2, long j8) {
        long j14;
        androidx.media3.common.x.b bVarF;
        int iA;
        this.f9427c = new a[nVarArr.length];
        sa.n[] nVarArr2 = new sa.n[nVarArr.length];
        int i14 = 0;
        while (true) {
            sa.n nVar = null;
            if (i14 >= nVarArr.length) {
                break;
            }
            a[] aVarArr = this.f9427c;
            a aVar = (a) nVarArr[i14];
            aVarArr[i14] = aVar;
            if (aVar != null) {
                nVar = aVar.f9432a;
            }
            nVarArr2[i14] = nVar;
            i14++;
        }
        long jD = this.f9425a.d(gVarArr, zArr, nVarArr2, zArr2, j8);
        boolean z14 = true;
        if (g()) {
            long j15 = this.f9429e;
            if (j8 != j15 || j15 == 0) {
                j14 = C.TIME_UNSET;
            } else {
                int length = gVarArr.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        j14 = C.TIME_UNSET;
                    } else {
                        wa.g gVar = gVarArr[i15];
                        if (gVar != null) {
                            androidx.media3.common.q selectedFormat = gVar.getSelectedFormat();
                            String str = selectedFormat.f8386n;
                            String str2 = selectedFormat.f8383k;
                            ArrayList<androidx.media3.common.x.a> arrayList = androidx.media3.common.x.f8576a;
                            if (str != null) {
                                switch (str) {
                                    case "audio/eac3-joc":
                                    case "audio/mpeg-L1":
                                    case "audio/mpeg-L2":
                                    case "audio/ac3":
                                    case "audio/raw":
                                    case "audio/eac3":
                                    case "audio/flac":
                                    case "audio/mpeg":
                                    case "audio/g711-alaw":
                                    case "audio/g711-mlaw":
                                        continue;
                                        break;
                                    case "audio/mp4a-latm":
                                        if (str2 != null && (bVarF = androidx.media3.common.x.f(str2)) != null && (iA = bVarF.a()) != 0 && iA != 16) {
                                            break;
                                        } else {
                                            break;
                                        }
                                        break;
                                }
                            }
                            j14 = jD;
                        }
                        i15++;
                    }
                }
            }
        } else {
            j14 = C.TIME_UNSET;
        }
        this.f9428d = j14;
        if (jD != j8) {
            if (jD >= this.f9429e) {
                long j16 = this.f9430f;
                if (j16 != Long.MIN_VALUE && jD > j16) {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
        }
        fa.a.d(z14);
        for (int i16 = 0; i16 < nVarArr.length; i16++) {
            sa.n nVar2 = nVarArr2[i16];
            a[] aVarArr2 = this.f9427c;
            if (nVar2 == null) {
                aVarArr2[i16] = null;
            } else {
                a aVar2 = aVarArr2[i16];
                if (aVar2 == null || aVar2.f9432a != nVar2) {
                    aVarArr2[i16] = new a(nVar2);
                }
            }
            nVarArr[i16] = this.f9427c[i16];
        }
        return jD;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void discardBuffer(long j8, boolean z14) {
        this.f9425a.discardBuffer(j8, z14);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long e(long j8, x0 x0Var) {
        long j14 = this.f9429e;
        if (j8 == j14) {
            return j14;
        }
        long j15 = z.j(x0Var.f9877a, 0L, j8 - j14);
        long j16 = x0Var.f9878b;
        long j17 = this.f9430f;
        long j18 = z.j(j16, 0L, j17 == Long.MIN_VALUE ? Long.MAX_VALUE : j17 - j8);
        if (j15 != x0Var.f9877a || j18 != x0Var.f9878b) {
            x0Var = new x0(j15, j18);
        }
        return this.f9425a.e(j8, x0Var);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean f(d0 d0Var) {
        return this.f9425a.f(d0Var);
    }

    public final boolean g() {
        return this.f9428d != C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f9425a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j8 = this.f9430f;
            if (j8 == Long.MIN_VALUE || bufferedPositionUs < j8) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f9425a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j8 = this.f9430f;
            if (j8 == Long.MIN_VALUE || nextLoadPositionUs < j8) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final sa.r getTrackGroups() {
        return this.f9425a.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean isLoading() {
        return this.f9425a.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowPrepareError() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f9431g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f9425a.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long readDiscontinuity() {
        if (g()) {
            long j8 = this.f9428d;
            this.f9428d = C.TIME_UNSET;
            long discontinuity = readDiscontinuity();
            return discontinuity != C.TIME_UNSET ? discontinuity : j8;
        }
        long discontinuity2 = this.f9425a.readDiscontinuity();
        if (discontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        fa.a.d(discontinuity2 >= this.f9429e);
        long j14 = this.f9430f;
        fa.a.d(j14 == Long.MIN_VALUE || discontinuity2 <= j14);
        return discontinuity2;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void reevaluateBuffer(long j8) {
        this.f9425a.reevaluateBuffer(j8);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // androidx.media3.exoplayer.source.i
    public final long seekToUs(long j8) {
        this.f9428d = C.TIME_UNSET;
        boolean z14 = false;
        for (a aVar : this.f9427c) {
            if (aVar != null) {
                aVar.f9433b = false;
            }
        }
        long jSeekToUs = this.f9425a.seekToUs(j8);
        if (jSeekToUs == j8) {
            z14 = true;
        } else if (jSeekToUs >= this.f9429e) {
            long j14 = this.f9430f;
            if (j14 == Long.MIN_VALUE || jSeekToUs <= j14) {
                z14 = true;
            }
        }
        fa.a.d(z14);
        return jSeekToUs;
    }
}
