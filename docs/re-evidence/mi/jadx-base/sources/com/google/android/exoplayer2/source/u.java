package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.Loader;
import defpackage.a1a;
import defpackage.ayf;
import defpackage.brl;
import defpackage.fxp;
import defpackage.g83;
import defpackage.jdo;
import defpackage.k9l;
import defpackage.ljf;
import defpackage.mie;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements j, Loader.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.b f8277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8278b;
    public final fxp c;
    public final com.google.android.exoplayer2.upstream.h d;
    public final l.a e;
    public final TrackGroupArray f;
    public final long h;
    public final Format j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8279k;
    public boolean l;
    public byte[] m;
    public int n;
    public final ArrayList<b> g = new ArrayList<>();
    public final Loader i = new Loader("SingleSampleMediaPeriod");

    public final class b implements k9l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8281b;

        public b() {
        }

        @Override // defpackage.k9l
        public void a() throws IOException {
            u uVar = u.this;
            if (uVar.f8279k) {
                return;
            }
            uVar.i.a();
        }

        public final void b() {
            if (this.f8281b) {
                return;
            }
            u.this.e.i(ayf.l(u.this.j.l), u.this.j, 0, null, 0L);
            this.f8281b = true;
        }

        public void c() {
            if (this.f8280a == 2) {
                this.f8280a = 1;
            }
        }

        @Override // defpackage.k9l
        public int d(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
            b();
            int i2 = this.f8280a;
            if (i2 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                a1aVar.f517b = u.this.j;
                this.f8280a = 1;
                return -5;
            }
            u uVar = u.this;
            if (!uVar.l) {
                return -3;
            }
            if (uVar.m == null) {
                decoderInputBuffer.e(4);
                this.f8280a = 2;
                return -4;
            }
            decoderInputBuffer.e(1);
            decoderInputBuffer.e = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.s(u.this.n);
                ByteBuffer byteBuffer = decoderInputBuffer.c;
                u uVar2 = u.this;
                byteBuffer.put(uVar2.m, 0, uVar2.n);
            }
            if ((i & 1) == 0) {
                this.f8280a = 2;
            }
            return -4;
        }

        @Override // defpackage.k9l
        public boolean isReady() {
            return u.this.l;
        }

        @Override // defpackage.k9l
        public int k(long j) {
            b();
            if (j <= 0 || this.f8280a == 2) {
                return 0;
            }
            this.f8280a = 2;
            return 1;
        }
    }

    public static final class c implements Loader.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8282a = mie.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.b f8283b;
        public final jdo c;
        public byte[] d;

        public c(com.google.android.exoplayer2.upstream.b bVar, com.google.android.exoplayer2.upstream.a aVar) {
            this.f8283b = bVar;
            this.c = new jdo(aVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() throws IOException {
            int iR;
            jdo jdoVar;
            byte[] bArr;
            this.c.u();
            try {
                this.c.b(this.f8283b);
                do {
                    iR = (int) this.c.r();
                    byte[] bArr2 = this.d;
                    if (bArr2 == null) {
                        this.d = new byte[1024];
                    } else if (iR == bArr2.length) {
                        this.d = Arrays.copyOf(bArr2, bArr2.length * 2);
                    }
                    jdoVar = this.c;
                    bArr = this.d;
                } while (jdoVar.read(bArr, iR, bArr.length - iR) != -1);
            } finally {
                wlq.n(this.c);
            }
        }
    }

    public u(com.google.android.exoplayer2.upstream.b bVar, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, fxp fxpVar, Format format, long j, com.google.android.exoplayer2.upstream.h hVar, l.a aVar, boolean z) {
        this.f8277a = bVar;
        this.f8278b = interfaceC0205a;
        this.c = fxpVar;
        this.j = format;
        this.h = j;
        this.d = hVar;
        this.e = aVar;
        this.f8279k = z;
        this.f = new TrackGroupArray(new TrackGroup(format));
    }

    @Override // com.google.android.exoplayer2.source.j
    public long b(long j, brl brlVar) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        if (this.l || this.i.j() || this.i.i()) {
            return false;
        }
        com.google.android.exoplayer2.upstream.a aVarA = this.f8278b.a();
        fxp fxpVar = this.c;
        if (fxpVar != null) {
            aVarA.f(fxpVar);
        }
        c cVar = new c(this.f8277a, aVarA);
        this.e.A(new mie(cVar.f8282a, this.f8277a, this.i.n(cVar, this, this.d.e(1))), 1, -1, this.j, 0, null, 0L, this.h);
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void o(c cVar, long j, long j2, boolean z) {
        jdo jdoVar = cVar.c;
        mie mieVar = new mie(cVar.f8282a, cVar.f8283b, jdoVar.s(), jdoVar.t(), j, j2, jdoVar.r());
        this.d.d(cVar.f8282a);
        this.e.r(mieVar, 1, -1, null, 0, null, 0L, this.h);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long e() {
        return this.l ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public void f(long j) {
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long g() {
        return (this.l || this.i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean h() {
        return this.i.j();
    }

    @Override // com.google.android.exoplayer2.source.j
    public long i(long j) {
        for (int i = 0; i < this.g.size(); i++) {
            this.g.get(i).c();
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long j() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void q(c cVar, long j, long j2) {
        this.n = (int) cVar.c.r();
        this.m = (byte[]) rk1.e(cVar.d);
        this.l = true;
        jdo jdoVar = cVar.c;
        mie mieVar = new mie(cVar.f8282a, cVar.f8283b, jdoVar.s(), jdoVar.t(), j, j2, this.n);
        this.d.d(cVar.f8282a);
        this.e.u(mieVar, 1, -1, this.j, 0, null, 0L, this.h);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Loader.c s(c cVar, long j, long j2, IOException iOException, int i) {
        Loader.c cVarH;
        jdo jdoVar = cVar.c;
        mie mieVar = new mie(cVar.f8282a, cVar.f8283b, jdoVar.s(), jdoVar.t(), j, j2, jdoVar.r());
        long jA = this.d.a(new com.google.android.exoplayer2.upstream.h.a(mieVar, new ljf(1, -1, this.j, 0, null, 0L, g83.d(this.h)), iOException, i));
        boolean z = jA == -9223372036854775807L || i >= this.d.e(1);
        if (this.f8279k && z) {
            toe.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.l = true;
            cVarH = Loader.f;
        } else {
            cVarH = jA != -9223372036854775807L ? Loader.h(false, jA) : Loader.g;
        }
        Loader.c cVar2 = cVarH;
        boolean z2 = !cVar2.c();
        this.e.w(mieVar, 1, -1, this.j, 0, null, 0L, this.h, iOException, z2);
        if (z2) {
            this.d.d(cVar.f8282a);
        }
        return cVar2;
    }

    public void m() {
        this.i.l();
    }

    @Override // com.google.android.exoplayer2.source.j
    public TrackGroupArray n() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < bVarArr.length; i++) {
            k9l k9lVar = k9lVarArr[i];
            if (k9lVar != null && (bVarArr[i] == null || !zArr[i])) {
                this.g.remove(k9lVar);
                k9lVarArr[i] = null;
            }
            if (k9lVarArr[i] == null && bVarArr[i] != null) {
                b bVar = new b();
                this.g.add(bVar);
                k9lVarArr[i] = bVar;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void r(j.a aVar, long j) {
        aVar.o(this);
    }

    @Override // com.google.android.exoplayer2.source.j
    public void t() {
    }

    @Override // com.google.android.exoplayer2.source.j
    public void u(long j, boolean z) {
    }
}
