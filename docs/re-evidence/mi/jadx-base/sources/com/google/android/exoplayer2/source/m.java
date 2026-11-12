package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import defpackage.a1a;
import defpackage.brl;
import defpackage.k9l;
import defpackage.ra4;
import defpackage.rk1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements j, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j[] f8177a;
    public final ra4 c;
    public j.a e;
    public TrackGroupArray f;
    public s h;
    public final ArrayList<j> d = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentityHashMap<k9l, Integer> f8178b = new IdentityHashMap<>();
    public j[] g = new j[0];

    public static final class a implements j, j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f8179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8180b;
        public j.a c;

        public a(j jVar, long j) {
            this.f8179a = jVar;
            this.f8180b = j;
        }

        @Override // com.google.android.exoplayer2.source.j
        public long b(long j, brl brlVar) {
            return this.f8179a.b(j - this.f8180b, brlVar) + this.f8180b;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
        public boolean c(long j) {
            return this.f8179a.c(j - this.f8180b);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
        public long e() {
            long jE = this.f8179a.e();
            if (jE == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f8180b + jE;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
        public void f(long j) {
            this.f8179a.f(j - this.f8180b);
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
        public long g() {
            long jG = this.f8179a.g();
            if (jG == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f8180b + jG;
        }

        @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
        public boolean h() {
            return this.f8179a.h();
        }

        @Override // com.google.android.exoplayer2.source.j
        public long i(long j) {
            return this.f8179a.i(j - this.f8180b) + this.f8180b;
        }

        @Override // com.google.android.exoplayer2.source.j
        public long j() {
            long j = this.f8179a.j();
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f8180b + j;
        }

        @Override // com.google.android.exoplayer2.source.s.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void k(j jVar) {
            ((j.a) rk1.e(this.c)).k(this);
        }

        @Override // com.google.android.exoplayer2.source.j
        public TrackGroupArray n() {
            return this.f8179a.n();
        }

        @Override // com.google.android.exoplayer2.source.j.a
        public void o(j jVar) {
            ((j.a) rk1.e(this.c)).o(this);
        }

        @Override // com.google.android.exoplayer2.source.j
        public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
            k9l[] k9lVarArr2 = new k9l[k9lVarArr.length];
            int i = 0;
            while (true) {
                k9l k9lVarB = null;
                if (i >= k9lVarArr.length) {
                    break;
                }
                b bVar = (b) k9lVarArr[i];
                if (bVar != null) {
                    k9lVarB = bVar.b();
                }
                k9lVarArr2[i] = k9lVarB;
                i++;
            }
            long jP = this.f8179a.p(bVarArr, zArr, k9lVarArr2, zArr2, j - this.f8180b);
            for (int i2 = 0; i2 < k9lVarArr.length; i2++) {
                k9l k9lVar = k9lVarArr2[i2];
                if (k9lVar == null) {
                    k9lVarArr[i2] = null;
                } else {
                    k9l k9lVar2 = k9lVarArr[i2];
                    if (k9lVar2 == null || ((b) k9lVar2).b() != k9lVar) {
                        k9lVarArr[i2] = new b(k9lVar, this.f8180b);
                    }
                }
            }
            return jP + this.f8180b;
        }

        @Override // com.google.android.exoplayer2.source.j
        public void r(j.a aVar, long j) {
            this.c = aVar;
            this.f8179a.r(this, j - this.f8180b);
        }

        @Override // com.google.android.exoplayer2.source.j
        public void t() throws IOException {
            this.f8179a.t();
        }

        @Override // com.google.android.exoplayer2.source.j
        public void u(long j, boolean z) {
            this.f8179a.u(j - this.f8180b, z);
        }
    }

    public static final class b implements k9l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k9l f8181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8182b;

        public b(k9l k9lVar, long j) {
            this.f8181a = k9lVar;
            this.f8182b = j;
        }

        @Override // defpackage.k9l
        public void a() throws IOException {
            this.f8181a.a();
        }

        public k9l b() {
            return this.f8181a;
        }

        @Override // defpackage.k9l
        public int d(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
            int iD = this.f8181a.d(a1aVar, decoderInputBuffer, i);
            if (iD == -4) {
                decoderInputBuffer.e = Math.max(0L, decoderInputBuffer.e + this.f8182b);
            }
            return iD;
        }

        @Override // defpackage.k9l
        public boolean isReady() {
            return this.f8181a.isReady();
        }

        @Override // defpackage.k9l
        public int k(long j) {
            return this.f8181a.k(j - this.f8182b);
        }
    }

    public m(ra4 ra4Var, long[] jArr, j... jVarArr) {
        this.c = ra4Var;
        this.f8177a = jVarArr;
        this.h = ra4Var.a(new s[0]);
        for (int i = 0; i < jVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f8177a[i] = new a(jVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public long b(long j, brl brlVar) {
        j[] jVarArr = this.g;
        return (jVarArr.length > 0 ? jVarArr[0] : this.f8177a[0]).b(j, brlVar);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        if (this.d.isEmpty()) {
            return this.h.c(j);
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.get(i).c(j);
        }
        return false;
    }

    public j d(int i) {
        j jVar = this.f8177a[i];
        return jVar instanceof a ? ((a) jVar).f8179a : jVar;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long e() {
        return this.h.e();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public void f(long j) {
        this.h.f(j);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long g() {
        return this.h.g();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean h() {
        return this.h.h();
    }

    @Override // com.google.android.exoplayer2.source.j
    public long i(long j) {
        long jI = this.g[0].i(j);
        int i = 1;
        while (true) {
            j[] jVarArr = this.g;
            if (i >= jVarArr.length) {
                return jI;
            }
            if (jVarArr[i].i(jI) != jI) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public long j() {
        long j = -9223372036854775807L;
        for (j jVar : this.g) {
            long j2 = jVar.j();
            if (j2 == -9223372036854775807L) {
                if (j != -9223372036854775807L && jVar.i(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (j jVar2 : this.g) {
                    if (jVar2 == jVar) {
                        break;
                    }
                    if (jVar2.i(j2) != j2) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = j2;
            } else if (j2 != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.s.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void k(j jVar) {
        ((j.a) rk1.e(this.e)).k(this);
    }

    @Override // com.google.android.exoplayer2.source.j
    public TrackGroupArray n() {
        return (TrackGroupArray) rk1.e(this.f);
    }

    @Override // com.google.android.exoplayer2.source.j.a
    public void o(j jVar) {
        this.d.remove(jVar);
        if (this.d.isEmpty()) {
            int i = 0;
            for (j jVar2 : this.f8177a) {
                i += jVar2.n().f8078a;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i];
            int i2 = 0;
            for (j jVar3 : this.f8177a) {
                TrackGroupArray trackGroupArrayN = jVar3.n();
                int i3 = trackGroupArrayN.f8078a;
                int i4 = 0;
                while (i4 < i3) {
                    trackGroupArr[i2] = trackGroupArrayN.a(i4);
                    i4++;
                    i2++;
                }
            }
            this.f = new TrackGroupArray(trackGroupArr);
            ((j.a) rk1.e(this.e)).o(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
        int[] iArr = new int[bVarArr.length];
        int[] iArr2 = new int[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            k9l k9lVar = k9lVarArr[i];
            Integer num = k9lVar == null ? null : this.f8178b.get(k9lVar);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            com.google.android.exoplayer2.trackselection.b bVar = bVarArr[i];
            if (bVar != null) {
                TrackGroup trackGroupF = bVar.f();
                int i2 = 0;
                while (true) {
                    j[] jVarArr = this.f8177a;
                    if (i2 >= jVarArr.length) {
                        break;
                    }
                    if (jVarArr[i2].n().c(trackGroupF) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.f8178b.clear();
        int length = bVarArr.length;
        k9l[] k9lVarArr2 = new k9l[length];
        k9l[] k9lVarArr3 = new k9l[bVarArr.length];
        com.google.android.exoplayer2.trackselection.b[] bVarArr2 = new com.google.android.exoplayer2.trackselection.b[bVarArr.length];
        ArrayList arrayList = new ArrayList(this.f8177a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f8177a.length) {
            for (int i4 = 0; i4 < bVarArr.length; i4++) {
                k9lVarArr3[i4] = iArr[i4] == i3 ? k9lVarArr[i4] : null;
                bVarArr2[i4] = iArr2[i4] == i3 ? bVarArr[i4] : null;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            com.google.android.exoplayer2.trackselection.b[] bVarArr3 = bVarArr2;
            long jP = this.f8177a[i3].p(bVarArr2, zArr, k9lVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jP;
            } else if (jP != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < bVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    k9l k9lVar2 = (k9l) rk1.e(k9lVarArr3[i6]);
                    k9lVarArr2[i6] = k9lVarArr3[i6];
                    this.f8178b.put(k9lVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    rk1.g(k9lVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.f8177a[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            bVarArr2 = bVarArr3;
        }
        System.arraycopy(k9lVarArr2, 0, k9lVarArr, 0, length);
        j[] jVarArr2 = (j[]) arrayList.toArray(new j[0]);
        this.g = jVarArr2;
        this.h = this.c.a(jVarArr2);
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void r(j.a aVar, long j) {
        this.e = aVar;
        Collections.addAll(this.d, this.f8177a);
        for (j jVar : this.f8177a) {
            jVar.r(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public void t() throws IOException {
        for (j jVar : this.f8177a) {
            jVar.t();
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public void u(long j, boolean z) {
        for (j jVar : this.g) {
            jVar.u(j, z);
        }
    }
}
