package com.google.android.exoplayer2.source;

import defpackage.brl;
import defpackage.k9l;
import defpackage.r61;
import defpackage.rk1;
import defpackage.wlq;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements j, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.a f8134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8135b;
    public final r61 c;
    public k d;
    public j e;
    public j.a f;
    public a g;
    public boolean h;
    public long i = -9223372036854775807L;

    public interface a {
        void a(k.a aVar, IOException iOException);

        void b(k.a aVar);
    }

    public h(k.a aVar, r61 r61Var, long j) {
        this.f8134a = aVar;
        this.c = r61Var;
        this.f8135b = j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long b(long j, brl brlVar) {
        return ((j) wlq.j(this.e)).b(j, brlVar);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        j jVar = this.e;
        return jVar != null && jVar.c(j);
    }

    public void d(k.a aVar) {
        long jS = s(this.f8135b);
        j jVarD = ((k) rk1.e(this.d)).d(aVar, this.c, jS);
        this.e = jVarD;
        if (this.f != null) {
            jVarD.r(this, jS);
        }
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long e() {
        return ((j) wlq.j(this.e)).e();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public void f(long j) {
        ((j) wlq.j(this.e)).f(j);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long g() {
        return ((j) wlq.j(this.e)).g();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean h() {
        j jVar = this.e;
        return jVar != null && jVar.h();
    }

    @Override // com.google.android.exoplayer2.source.j
    public long i(long j) {
        return ((j) wlq.j(this.e)).i(j);
    }

    @Override // com.google.android.exoplayer2.source.j
    public long j() {
        return ((j) wlq.j(this.e)).j();
    }

    public long l() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.source.j
    public TrackGroupArray n() {
        return ((j) wlq.j(this.e)).n();
    }

    @Override // com.google.android.exoplayer2.source.j.a
    public void o(j jVar) {
        ((j.a) wlq.j(this.f)).o(this);
        a aVar = this.g;
        if (aVar != null) {
            aVar.b(this.f8134a);
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.i;
        if (j3 == -9223372036854775807L || j != this.f8135b) {
            j2 = j;
        } else {
            this.i = -9223372036854775807L;
            j2 = j3;
        }
        return ((j) wlq.j(this.e)).p(bVarArr, zArr, k9lVarArr, zArr2, j2);
    }

    public long q() {
        return this.f8135b;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void r(j.a aVar, long j) {
        this.f = aVar;
        j jVar = this.e;
        if (jVar != null) {
            jVar.r(this, s(this.f8135b));
        }
    }

    public final long s(long j) {
        long j2 = this.i;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void t() throws IOException {
        try {
            j jVar = this.e;
            if (jVar != null) {
                jVar.t();
            } else {
                k kVar = this.d;
                if (kVar != null) {
                    kVar.f();
                }
            }
        } catch (IOException e) {
            a aVar = this.g;
            if (aVar == null) {
                throw e;
            }
            if (this.h) {
                return;
            }
            this.h = true;
            aVar.a(this.f8134a, e);
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public void u(long j, boolean z) {
        ((j) wlq.j(this.e)).u(j, z);
    }

    @Override // com.google.android.exoplayer2.source.s.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void k(j jVar) {
        ((j.a) wlq.j(this.f)).k(this);
    }

    public void w(long j) {
        this.i = j;
    }

    public void x() {
        if (this.e != null) {
            ((k) rk1.e(this.d)).j(this.e);
        }
    }

    public void y(k kVar) {
        rk1.g(this.d == null);
        this.d = kVar;
    }
}
