package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.b;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.v;

/* JADX INFO: loaded from: classes4.dex */
public final class mjf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f26926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26927b;
    public final k9l[] c;
    public boolean d;
    public boolean e;
    public ojf f;
    public boolean g;
    public final boolean[] h;
    public final rkk[] i;
    public final bop j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f26928k;
    public mjf l;
    public TrackGroupArray m;
    public cop n;
    public long o;

    public mjf(rkk[] rkkVarArr, long j, bop bopVar, r61 r61Var, p pVar, ojf ojfVar, cop copVar) {
        this.i = rkkVarArr;
        this.o = j;
        this.j = bopVar;
        this.f26928k = pVar;
        k.a aVar = ojfVar.f29217a;
        this.f26927b = aVar.f27977a;
        this.f = ojfVar;
        this.m = TrackGroupArray.EMPTY;
        this.n = copVar;
        this.c = new k9l[rkkVarArr.length];
        this.h = new boolean[rkkVarArr.length];
        this.f26926a = e(aVar, pVar, r61Var, ojfVar.f29218b, ojfVar.d);
    }

    public static j e(k.a aVar, p pVar, r61 r61Var, long j, long j2) {
        j jVarH = pVar.h(aVar, r61Var, j);
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? jVarH : new b(jVarH, true, 0L, j2);
    }

    public static void u(long j, p pVar, j jVar) {
        try {
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                pVar.z(jVar);
            } else {
                pVar.z(((b) jVar).f8082a);
            }
        } catch (RuntimeException e) {
            toe.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public long a(cop copVar, long j, boolean z) {
        return b(copVar, j, z, new boolean[this.i.length]);
    }

    public long b(cop copVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= copVar.f14570a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !copVar.b(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        g(this.c);
        f();
        this.n = copVar;
        h();
        long jP = this.f26926a.p(copVar.c, this.h, this.c, zArr, j);
        c(this.c);
        this.e = false;
        int i2 = 0;
        while (true) {
            k9l[] k9lVarArr = this.c;
            if (i2 >= k9lVarArr.length) {
                return jP;
            }
            if (k9lVarArr[i2] != null) {
                rk1.g(copVar.c(i2));
                if (this.i[i2].e() != 7) {
                    this.e = true;
                }
            } else {
                rk1.g(copVar.c[i2] == null);
            }
            i2++;
        }
    }

    public final void c(k9l[] k9lVarArr) {
        int i = 0;
        while (true) {
            rkk[] rkkVarArr = this.i;
            if (i >= rkkVarArr.length) {
                return;
            }
            if (rkkVarArr[i].e() == 7 && this.n.c(i)) {
                k9lVarArr[i] = new j98();
            }
            i++;
        }
    }

    public void d(long j) {
        rk1.g(r());
        this.f26926a.c(y(j));
    }

    public final void f() {
        if (!r()) {
            return;
        }
        int i = 0;
        while (true) {
            cop copVar = this.n;
            if (i >= copVar.f14570a) {
                return;
            }
            boolean zC = copVar.c(i);
            com.google.android.exoplayer2.trackselection.b bVar = this.n.c[i];
            if (zC && bVar != null) {
                bVar.disable();
            }
            i++;
        }
    }

    public final void g(k9l[] k9lVarArr) {
        int i = 0;
        while (true) {
            rkk[] rkkVarArr = this.i;
            if (i >= rkkVarArr.length) {
                return;
            }
            if (rkkVarArr[i].e() == 7) {
                k9lVarArr[i] = null;
            }
            i++;
        }
    }

    public final void h() {
        if (!r()) {
            return;
        }
        int i = 0;
        while (true) {
            cop copVar = this.n;
            if (i >= copVar.f14570a) {
                return;
            }
            boolean zC = copVar.c(i);
            com.google.android.exoplayer2.trackselection.b bVar = this.n.c[i];
            if (zC && bVar != null) {
                bVar.enable();
            }
            i++;
        }
    }

    public long i() {
        if (!this.d) {
            return this.f.f29218b;
        }
        long jE = this.e ? this.f26926a.e() : Long.MIN_VALUE;
        return jE == Long.MIN_VALUE ? this.f.e : jE;
    }

    public mjf j() {
        return this.l;
    }

    public long k() {
        if (this.d) {
            return this.f26926a.g();
        }
        return 0L;
    }

    public long l() {
        return this.o;
    }

    public long m() {
        return this.f.f29218b + this.o;
    }

    public TrackGroupArray n() {
        return this.m;
    }

    public cop o() {
        return this.n;
    }

    public void p(float f, v vVar) throws ExoPlaybackException {
        this.d = true;
        this.m = this.f26926a.n();
        cop copVarV = v(f, vVar);
        ojf ojfVar = this.f;
        long jMax = ojfVar.f29218b;
        long j = ojfVar.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(copVarV, jMax, false);
        long j2 = this.o;
        ojf ojfVar2 = this.f;
        this.o = j2 + (ojfVar2.f29218b - jA);
        this.f = ojfVar2.b(jA);
    }

    public boolean q() {
        return this.d && (!this.e || this.f26926a.e() == Long.MIN_VALUE);
    }

    public final boolean r() {
        return this.l == null;
    }

    public void s(long j) {
        rk1.g(r());
        if (this.d) {
            this.f26926a.f(y(j));
        }
    }

    public void t() {
        f();
        u(this.f.d, this.f26928k, this.f26926a);
    }

    public cop v(float f, v vVar) throws ExoPlaybackException {
        cop copVarE = this.j.e(this.i, n(), this.f.f29217a, vVar);
        for (com.google.android.exoplayer2.trackselection.b bVar : copVarE.c) {
            if (bVar != null) {
                bVar.m(f);
            }
        }
        return copVarE;
    }

    public void w(mjf mjfVar) {
        if (mjfVar == this.l) {
            return;
        }
        f();
        this.l = mjfVar;
        h();
    }

    public void x(long j) {
        this.o = j;
    }

    public long y(long j) {
        return j - l();
    }

    public long z(long j) {
        return j + l();
    }
}
