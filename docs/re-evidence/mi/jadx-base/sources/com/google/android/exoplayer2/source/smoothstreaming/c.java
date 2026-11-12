package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.upstream.h;
import defpackage.brl;
import defpackage.fxp;
import defpackage.gw3;
import defpackage.k9l;
import defpackage.r61;
import defpackage.ra4;
import defpackage.sie;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements j, s.a<gw3<b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.a f8258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fxp f8259b;
    public final sie c;
    public final com.google.android.exoplayer2.drm.c d;
    public final com.google.android.exoplayer2.drm.b.a e;
    public final h f;
    public final l.a g;
    public final r61 h;
    public final TrackGroupArray i;
    public final ra4 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j.a f8260k;
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a l;
    public gw3<b>[] m;
    public s n;

    public c(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, b.a aVar2, fxp fxpVar, ra4 ra4Var, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.drm.b.a aVar3, h hVar, l.a aVar4, sie sieVar, r61 r61Var) {
        this.l = aVar;
        this.f8258a = aVar2;
        this.f8259b = fxpVar;
        this.c = sieVar;
        this.d = cVar;
        this.e = aVar3;
        this.f = hVar;
        this.g = aVar4;
        this.h = r61Var;
        this.j = ra4Var;
        this.i = l(aVar, cVar);
        gw3<b>[] gw3VarArrQ = q(0);
        this.m = gw3VarArrQ;
        this.n = ra4Var.a(gw3VarArrQ);
    }

    public static TrackGroupArray l(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, com.google.android.exoplayer2.drm.c cVar) {
        TrackGroup[] trackGroupArr = new TrackGroup[aVar.f.length];
        int i = 0;
        while (true) {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = aVar.f;
            if (i >= bVarArr.length) {
                return new TrackGroupArray(trackGroupArr);
            }
            Format[] formatArr = bVarArr[i].j;
            Format[] formatArr2 = new Format[formatArr.length];
            for (int i2 = 0; i2 < formatArr.length; i2++) {
                Format format = formatArr[i2];
                formatArr2[i2] = format.c(cVar.c(format));
            }
            trackGroupArr[i] = new TrackGroup(formatArr2);
            i++;
        }
    }

    private static gw3<b>[] q(int i) {
        return new gw3[i];
    }

    @Override // com.google.android.exoplayer2.source.j
    public long b(long j, brl brlVar) {
        for (gw3<b> gw3Var : this.m) {
            if (gw3Var.f19386a == 2) {
                return gw3Var.b(j, brlVar);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        return this.n.c(j);
    }

    public final gw3<b> d(com.google.android.exoplayer2.trackselection.b bVar, long j) {
        int iC = this.i.c(bVar.f());
        return new gw3<>(this.l.f[iC].f8271a, null, null, this.f8258a.a(this.c, this.l, iC, bVar, this.f8259b), this, this.h, j, this.d, this.e, this.f, this.g);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long e() {
        return this.n.e();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public void f(long j) {
        this.n.f(j);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long g() {
        return this.n.g();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean h() {
        return this.n.h();
    }

    @Override // com.google.android.exoplayer2.source.j
    public long i(long j) {
        for (gw3<b> gw3Var : this.m) {
            gw3Var.R(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long j() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.j
    public TrackGroupArray n() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
        com.google.android.exoplayer2.trackselection.b bVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bVarArr.length; i++) {
            k9l k9lVar = k9lVarArr[i];
            if (k9lVar != null) {
                gw3 gw3Var = (gw3) k9lVar;
                if (bVarArr[i] == null || !zArr[i]) {
                    gw3Var.O();
                    k9lVarArr[i] = null;
                } else {
                    ((b) gw3Var.D()).c(bVarArr[i]);
                    arrayList.add(gw3Var);
                }
            }
            if (k9lVarArr[i] == null && (bVar = bVarArr[i]) != null) {
                gw3<b> gw3VarD = d(bVar, j);
                arrayList.add(gw3VarD);
                k9lVarArr[i] = gw3VarD;
                zArr2[i] = true;
            }
        }
        gw3<b>[] gw3VarArrQ = q(arrayList.size());
        this.m = gw3VarArrQ;
        arrayList.toArray(gw3VarArrQ);
        this.n = this.j.a(this.m);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void r(j.a aVar, long j) {
        this.f8260k = aVar;
        aVar.o(this);
    }

    @Override // com.google.android.exoplayer2.source.s.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void k(gw3<b> gw3Var) {
        this.f8260k.k(this);
    }

    @Override // com.google.android.exoplayer2.source.j
    public void t() throws IOException {
        this.c.a();
    }

    @Override // com.google.android.exoplayer2.source.j
    public void u(long j, boolean z) {
        for (gw3<b> gw3Var : this.m) {
            gw3Var.u(j, z);
        }
    }

    public void v() {
        for (gw3<b> gw3Var : this.m) {
            gw3Var.O();
        }
        this.f8260k = null;
    }

    public void w(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        this.l = aVar;
        for (gw3<b> gw3Var : this.m) {
            ((b) gw3Var.D()).i(aVar);
        }
        this.f8260k.k(this);
    }
}
