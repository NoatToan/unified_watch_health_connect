package com.google.android.exoplayer2;

import defpackage.jj4;
import defpackage.n0i;

/* JADX INFO: loaded from: classes4.dex */
public class f implements jj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v.c f7916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7917b;
    public long c;

    public f() {
        this(15000L, 5000L);
    }

    public static void o(q qVar, long j) {
        long currentPosition = qVar.getCurrentPosition() + j;
        long duration = qVar.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        qVar.G(qVar.y(), Math.max(currentPosition, 0L));
    }

    @Override // defpackage.jj4
    public boolean a(q qVar, int i, long j) {
        qVar.G(i, j);
        return true;
    }

    @Override // defpackage.jj4
    public boolean b(q qVar, boolean z) {
        qVar.o(z);
        return true;
    }

    @Override // defpackage.jj4
    public boolean c(q qVar, int i) {
        qVar.setRepeatMode(i);
        return true;
    }

    @Override // defpackage.jj4
    public boolean d(q qVar) {
        if (!l() || !qVar.x()) {
            return true;
        }
        o(qVar, this.c);
        return true;
    }

    @Override // defpackage.jj4
    public boolean e() {
        return this.f7917b > 0;
    }

    @Override // defpackage.jj4
    public boolean f(q qVar) {
        qVar.prepare();
        return true;
    }

    @Override // defpackage.jj4
    public boolean g(q qVar) {
        v vVarC = qVar.C();
        if (!vVarC.q() && !qVar.a()) {
            int iY = qVar.y();
            vVarC.n(iY, this.f7916a);
            int iL = qVar.L();
            boolean z = this.f7916a.f() && !this.f7916a.h;
            if (iL != -1 && (qVar.getCurrentPosition() <= 3000 || z)) {
                qVar.G(iL, -9223372036854775807L);
            } else if (!z) {
                qVar.G(iY, 0L);
            }
        }
        return true;
    }

    @Override // defpackage.jj4
    public boolean h(q qVar, n0i n0iVar) {
        qVar.d(n0iVar);
        return true;
    }

    @Override // defpackage.jj4
    public boolean i(q qVar) {
        v vVarC = qVar.C();
        if (!vVarC.q() && !qVar.a()) {
            int iY = qVar.y();
            vVarC.n(iY, this.f7916a);
            int iN = qVar.N();
            if (iN != -1) {
                qVar.G(iN, -9223372036854775807L);
            } else if (this.f7916a.f() && this.f7916a.i) {
                qVar.G(iY, -9223372036854775807L);
            }
        }
        return true;
    }

    @Override // defpackage.jj4
    public boolean j(q qVar, boolean z) {
        qVar.z(z);
        return true;
    }

    @Override // defpackage.jj4
    public boolean k(q qVar) {
        if (!e() || !qVar.x()) {
            return true;
        }
        o(qVar, -this.f7917b);
        return true;
    }

    @Override // defpackage.jj4
    public boolean l() {
        return this.c > 0;
    }

    public long m() {
        return this.c;
    }

    public long n() {
        return this.f7917b;
    }

    @Deprecated
    public void p(long j) {
        this.c = j;
    }

    @Deprecated
    public void q(long j) {
        this.f7917b = j;
    }

    public f(long j, long j2) {
        this.c = j;
        this.f7917b = j2;
        this.f7916a = new v.c();
    }
}
