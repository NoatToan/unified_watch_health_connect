package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import defpackage.a1a;
import defpackage.ayf;
import defpackage.brl;
import defpackage.k9l;
import defpackage.rk1;
import defpackage.wlq;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements j, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f8082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j.a f8083b;
    public a[] c = new a[0];
    public long d;
    public long e;
    public long f;

    public final class a implements k9l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k9l f8084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8085b;

        public a(k9l k9lVar) {
            this.f8084a = k9lVar;
        }

        @Override // defpackage.k9l
        public void a() throws IOException {
            this.f8084a.a();
        }

        public void b() {
            this.f8085b = false;
        }

        @Override // defpackage.k9l
        public int d(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
            if (b.this.l()) {
                return -3;
            }
            if (this.f8085b) {
                decoderInputBuffer.p(4);
                return -4;
            }
            int iD = this.f8084a.d(a1aVar, decoderInputBuffer, i);
            if (iD == -5) {
                Format format = (Format) rk1.e(a1aVar.f517b);
                int i2 = format.B;
                if (i2 != 0 || format.C != 0) {
                    b bVar = b.this;
                    if (bVar.e != 0) {
                        i2 = 0;
                    }
                    a1aVar.f517b = format.a().M(i2).N(bVar.f == Long.MIN_VALUE ? format.C : 0).E();
                }
                return -5;
            }
            b bVar2 = b.this;
            long j = bVar2.f;
            if (j == Long.MIN_VALUE || ((iD != -4 || decoderInputBuffer.e < j) && !(iD == -3 && bVar2.e() == Long.MIN_VALUE && !decoderInputBuffer.d))) {
                return iD;
            }
            decoderInputBuffer.h();
            decoderInputBuffer.p(4);
            this.f8085b = true;
            return -4;
        }

        @Override // defpackage.k9l
        public boolean isReady() {
            return !b.this.l() && this.f8084a.isReady();
        }

        @Override // defpackage.k9l
        public int k(long j) {
            if (b.this.l()) {
                return -3;
            }
            return this.f8084a.k(j);
        }
    }

    public b(j jVar, boolean z, long j, long j2) {
        this.f8082a = jVar;
        this.d = z ? j : -9223372036854775807L;
        this.e = j;
        this.f = j2;
    }

    public static boolean s(long j, com.google.android.exoplayer2.trackselection.b[] bVarArr) {
        if (j != 0) {
            for (com.google.android.exoplayer2.trackselection.b bVar : bVarArr) {
                if (bVar != null) {
                    Format formatI = bVar.i();
                    if (!ayf.a(formatI.l, formatI.i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long b(long j, brl brlVar) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        return this.f8082a.b(j, d(j, brlVar));
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        return this.f8082a.c(j);
    }

    public final brl d(long j, brl brlVar) {
        long jS = wlq.s(brlVar.f4520a, 0L, j - this.e);
        long j2 = brlVar.f4521b;
        long j3 = this.f;
        long jS2 = wlq.s(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (jS == brlVar.f4520a && jS2 == brlVar.f4521b) ? brlVar : new brl(jS, jS2);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long e() {
        long jE = this.f8082a.e();
        if (jE != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jE < j) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public void f(long j) {
        this.f8082a.f(j);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long g() {
        long jG = this.f8082a.g();
        if (jG != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || jG < j) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean h() {
        return this.f8082a.h();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    @Override // com.google.android.exoplayer2.source.j
    public long i(long j) {
        this.d = -9223372036854775807L;
        boolean z = false;
        for (a aVar : this.c) {
            if (aVar != null) {
                aVar.b();
            }
        }
        long jI = this.f8082a.i(j);
        if (jI == j) {
            z = true;
        } else if (jI >= this.e) {
            long j2 = this.f;
            if (j2 == Long.MIN_VALUE || jI <= j2) {
                z = true;
            }
        }
        rk1.g(z);
        return jI;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long j() {
        if (l()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            long j2 = j();
            return j2 != -9223372036854775807L ? j2 : j;
        }
        long j3 = this.f8082a.j();
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        rk1.g(j3 >= this.e);
        long j4 = this.f;
        rk1.g(j4 == Long.MIN_VALUE || j3 <= j4);
        return j3;
    }

    public boolean l() {
        return this.d != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.j
    public TrackGroupArray n() {
        return this.f8082a.n();
    }

    @Override // com.google.android.exoplayer2.source.j.a
    public void o(j jVar) {
        ((j.a) rk1.e(this.f8083b)).o(this);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    @Override // com.google.android.exoplayer2.source.j
    public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.c = new a[k9lVarArr.length];
        k9l[] k9lVarArr2 = new k9l[k9lVarArr.length];
        int i = 0;
        while (true) {
            k9l k9lVar = null;
            if (i >= k9lVarArr.length) {
                break;
            }
            a[] aVarArr = this.c;
            a aVar = (a) k9lVarArr[i];
            aVarArr[i] = aVar;
            if (aVar != null) {
                k9lVar = aVar.f8084a;
            }
            k9lVarArr2[i] = k9lVar;
            i++;
        }
        long jP = this.f8082a.p(bVarArr, zArr, k9lVarArr2, zArr2, j);
        if (l()) {
            long j3 = this.e;
            if (j == j3 && s(j3, bVarArr)) {
                j2 = jP;
            } else {
                j2 = -9223372036854775807L;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.d = j2;
        if (jP != j) {
            if (jP >= this.e) {
                long j4 = this.f;
                z = j4 == Long.MIN_VALUE || jP <= j4;
            }
        }
        rk1.g(z);
        for (int i2 = 0; i2 < k9lVarArr.length; i2++) {
            k9l k9lVar2 = k9lVarArr2[i2];
            if (k9lVar2 == null) {
                this.c[i2] = null;
            } else {
                a[] aVarArr2 = this.c;
                a aVar2 = aVarArr2[i2];
                if (aVar2 == null || aVar2.f8084a != k9lVar2) {
                    aVarArr2[i2] = new a(k9lVar2);
                }
            }
            k9lVarArr[i2] = this.c[i2];
        }
        return jP;
    }

    @Override // com.google.android.exoplayer2.source.s.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void k(j jVar) {
        ((j.a) rk1.e(this.f8083b)).k(this);
    }

    @Override // com.google.android.exoplayer2.source.j
    public void r(j.a aVar, long j) {
        this.f8083b = aVar;
        this.f8082a.r(this, j);
    }

    @Override // com.google.android.exoplayer2.source.j
    public void t() throws IOException {
        this.f8082a.t();
    }

    @Override // com.google.android.exoplayer2.source.j
    public void u(long j, boolean z) {
        this.f8082a.u(j, z);
    }

    public void v(long j, long j2) {
        this.e = j;
        this.f = j2;
    }
}
