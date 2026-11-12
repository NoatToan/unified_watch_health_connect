package androidx.media3.exoplayer.source;

import androidx.media3.common.e0;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.x0;
import com.google.android.exoplayer2.C;
import fa.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o62.b0;

/* JADX INFO: loaded from: classes.dex */
public final class u implements i, Loader.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha.g f9653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha.d.a f9654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ha.n f9655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f9656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k.a f9657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sa.r f9658f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9660h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.media3.common.q f9662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f9665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9666n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<b> f9659g = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Loader f9661i = new Loader("SingleSampleMediaPeriod");

    public final class b implements sa.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9668b;

        private b() {
        }

        @Override // sa.n
        public final int a(a0 a0Var, DecoderInputBuffer decoderInputBuffer, int i14) {
            b();
            u uVar = u.this;
            boolean z14 = uVar.f9664l;
            if (z14 && uVar.f9665m == null) {
                this.f9667a = 2;
            }
            int i15 = this.f9667a;
            if (i15 == 2) {
                decoderInputBuffer.a(4);
                return -4;
            }
            if ((i14 & 2) != 0 || i15 == 0) {
                a0Var.f8667b = uVar.f9662j;
                this.f9667a = 1;
                return -5;
            }
            if (!z14) {
                return -3;
            }
            uVar.f9665m.getClass();
            decoderInputBuffer.a(1);
            decoderInputBuffer.f8633f = 0L;
            if ((i14 & 4) == 0) {
                decoderInputBuffer.e(uVar.f9666n);
                decoderInputBuffer.f8631d.put(uVar.f9665m, 0, uVar.f9666n);
            }
            if ((i14 & 1) == 0) {
                this.f9667a = 2;
            }
            return -4;
        }

        public final void b() {
            if (this.f9668b) {
                return;
            }
            u uVar = u.this;
            k.a aVar = uVar.f9657e;
            int iH = androidx.media3.common.x.h(uVar.f9662j.f8386n);
            androidx.media3.common.q qVar = uVar.f9662j;
            aVar.getClass();
            aVar.a(new b0(12, aVar, new sa.j(1, iH, qVar, 0, null, z.Y(0L), C.TIME_UNSET)));
            this.f9668b = true;
        }

        @Override // sa.n
        public final boolean isReady() {
            return u.this.f9664l;
        }

        @Override // sa.n
        public final void maybeThrowError() throws IOException {
            u uVar = u.this;
            if (uVar.f9663k) {
                return;
            }
            Loader loader = uVar.f9661i;
            IOException iOException = loader.f9702c;
            if (iOException != null) {
                throw iOException;
            }
            Loader.d<? extends Loader.e> dVar = loader.f9701b;
            if (dVar != null) {
                int i14 = dVar.f9705a;
                IOException iOException2 = dVar.f9709e;
                if (iOException2 != null && dVar.f9710f > i14) {
                    throw iOException2;
                }
            }
        }

        @Override // sa.n
        public final int skipData(long j8) {
            b();
            if (j8 <= 0 || this.f9667a == 2) {
                return 0;
            }
            this.f9667a = 2;
            return 1;
        }
    }

    public static final class c implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9670a = sa.i.f158115c.getAndIncrement();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ha.g f9671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ha.m f9672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f9673d;

        public c(ha.g gVar, ha.d dVar) {
            this.f9671b = gVar;
            this.f9672c = new ha.m(dVar);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public final void cancelLoad() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public final void load() {
            ha.m mVar = this.f9672c;
            mVar.f82617b = 0L;
            try {
                mVar.b(this.f9671b);
                int i14 = 0;
                while (i14 != -1) {
                    int i15 = (int) mVar.f82617b;
                    byte[] bArr = this.f9673d;
                    if (bArr == null) {
                        this.f9673d = new byte[1024];
                    } else if (i15 == bArr.length) {
                        this.f9673d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f9673d;
                    i14 = mVar.read(bArr2, i15, bArr2.length - i15);
                }
            } finally {
                ha.f.a(mVar);
            }
        }
    }

    public u(ha.g gVar, ha.d.a aVar, ha.n nVar, androidx.media3.common.q qVar, long j8, androidx.media3.exoplayer.upstream.b bVar, k.a aVar2, boolean z14) {
        this.f9653a = gVar;
        this.f9654b = aVar;
        this.f9655c = nVar;
        this.f9662j = qVar;
        this.f9660h = j8;
        this.f9656d = bVar;
        this.f9657e = aVar2;
        this.f9663k = z14;
        this.f9658f = new sa.r(new e0(qVar));
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void c(i.a aVar, long j8) {
        aVar.a(this);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long d(wa.g[] gVarArr, boolean[] zArr, sa.n[] nVarArr, boolean[] zArr2, long j8) {
        for (int i14 = 0; i14 < gVarArr.length; i14++) {
            sa.n nVar = nVarArr[i14];
            ArrayList<b> arrayList = this.f9659g;
            if (nVar != null && (gVarArr[i14] == null || !zArr[i14])) {
                arrayList.remove(nVar);
                nVarArr[i14] = null;
            }
            if (nVarArr[i14] == null && gVarArr[i14] != null) {
                b bVar = new b();
                arrayList.add(bVar);
                nVarArr[i14] = bVar;
                zArr2[i14] = true;
            }
        }
        return j8;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void discardBuffer(long j8, boolean z14) {
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long e(long j8, x0 x0Var) {
        return j8;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean f(d0 d0Var) {
        if (this.f9664l) {
            return false;
        }
        Loader loader = this.f9661i;
        if (loader.c() || loader.f9702c != null) {
            return false;
        }
        ha.d dVarCreateDataSource = this.f9654b.createDataSource();
        ha.n nVar = this.f9655c;
        if (nVar != null) {
            dVarCreateDataSource.a(nVar);
        }
        c cVar = new c(this.f9653a, dVarCreateDataSource);
        this.f9657e.f(new sa.i(cVar.f9670a, this.f9653a, loader.e(cVar, this, this.f9656d.getMinimumLoadableRetryCount(1))), 1, -1, this.f9662j, 0, null, 0L, this.f9660h);
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void g(Loader.e eVar, long j8, long j14) {
        c cVar = (c) eVar;
        this.f9666n = (int) cVar.f9672c.f82617b;
        byte[] bArr = cVar.f9673d;
        bArr.getClass();
        this.f9665m = bArr;
        this.f9664l = true;
        ha.m mVar = cVar.f9672c;
        sa.i iVar = new sa.i(cVar.f9670a, cVar.f9671b, mVar.f82618c, mVar.f82619d, j8, j14, this.f9666n);
        this.f9656d.getClass();
        this.f9657e.c(iVar, 1, -1, this.f9662j, 0, null, 0L, this.f9660h);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getBufferedPositionUs() {
        return this.f9664l ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getNextLoadPositionUs() {
        return (this.f9664l || this.f9661i.c()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final sa.r getTrackGroups() {
        return this.f9658f;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final Loader.c i(Loader.e eVar, long j8, long j14, IOException iOException, int i14) {
        Loader.c cVarB;
        c cVar = (c) eVar;
        ha.m mVar = cVar.f9672c;
        sa.i iVar = new sa.i(cVar.f9670a, cVar.f9671b, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        androidx.media3.exoplayer.upstream.b.c cVar2 = new androidx.media3.exoplayer.upstream.b.c(iVar, new sa.j(1, -1, this.f9662j, 0, null, 0L, z.Y(this.f9660h)), iOException, i14);
        androidx.media3.exoplayer.upstream.b bVar = this.f9656d;
        long jB = bVar.b(cVar2);
        boolean z14 = jB == C.TIME_UNSET || i14 >= bVar.getMinimumLoadableRetryCount(1);
        if (this.f9663k && z14) {
            fa.k.h("Loading failed, treating as end-of-stream.", iOException);
            this.f9664l = true;
            cVarB = Loader.f9698e;
        } else {
            cVarB = jB != C.TIME_UNSET ? Loader.b(jB, false) : Loader.f9699f;
        }
        Loader.c cVar3 = cVarB;
        int i15 = cVar3.f9703a;
        this.f9657e.d(iVar, 1, -1, this.f9662j, 0, null, 0L, this.f9660h, iOException, !(i15 == 0 || i15 == 1));
        return cVar3;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean isLoading() {
        return this.f9661i.c();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void l(Loader.e eVar, long j8, long j14, boolean z14) {
        c cVar = (c) eVar;
        ha.m mVar = cVar.f9672c;
        sa.i iVar = new sa.i(cVar.f9670a, cVar.f9671b, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        this.f9656d.getClass();
        this.f9657e.b(iVar, 1, -1, null, 0, null, 0L, this.f9660h);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowPrepareError() {
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void reevaluateBuffer(long j8) {
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long seekToUs(long j8) {
        int i14 = 0;
        while (true) {
            ArrayList<b> arrayList = this.f9659g;
            if (i14 >= arrayList.size()) {
                return j8;
            }
            b bVar = arrayList.get(i14);
            if (bVar.f9667a == 2) {
                bVar.f9667a = 1;
            }
            i14++;
        }
    }
}
