package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fj2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f17830b;
    public c c;
    public final int d;

    public static class a implements arl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f17831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17832b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;

        public a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f17831a = dVar;
            this.f17832b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        @Override // defpackage.arl
        public arl.a d(long j) {
            return new arl.a(new crl(j, c.h(this.f17831a.a(j), this.c, this.d, this.e, this.f, this.g)));
        }

        @Override // defpackage.arl
        public boolean e() {
            return true;
        }

        @Override // defpackage.arl
        public long i() {
            return this.f17832b;
        }

        public long k(long j) {
            return this.f17831a.a(j);
        }
    }

    public static final class b implements d {
        @Override // fj2.d
        public long a(long j) {
            return j;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f17833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17834b;
        public final long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;

        public c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f17833a = j;
            this.f17834b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = h(j2, j3, j4, j5, j6, j7);
        }

        public static long h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return wlq.s(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        public final long i() {
            return this.g;
        }

        public final long j() {
            return this.f;
        }

        public final long k() {
            return this.h;
        }

        public final long l() {
            return this.f17833a;
        }

        public final long m() {
            return this.f17834b;
        }

        public final void n() {
            this.h = h(this.f17834b, this.d, this.e, this.f, this.g, this.c);
        }

        public final void o(long j, long j2) {
            this.e = j;
            this.g = j2;
            n();
        }

        public final void p(long j, long j2) {
            this.d = j;
            this.f = j2;
            n();
        }
    }

    public interface d {
        long a(long j);
    }

    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17836b;
        public final long c;

        public e(int i, long j, long j2) {
            this.f17835a = i;
            this.f17836b = j;
            this.c = j2;
        }

        public static e d(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e e(long j) {
            return new e(0, -9223372036854775807L, j);
        }

        public static e f(long j, long j2) {
            return new e(-2, j, j2);
        }
    }

    public interface f {
        e a(jl8 jl8Var, long j) throws IOException;

        default void b() {
        }
    }

    public fj2(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f17830b = fVar;
        this.d = i;
        this.f17829a = new a(dVar, j, j2, j3, j4, j5, j6);
    }

    public c a(long j) {
        return new c(j, this.f17829a.k(j), this.f17829a.c, this.f17829a.d, this.f17829a.e, this.f17829a.f, this.f17829a.g);
    }

    public final arl b() {
        return this.f17829a;
    }

    public int c(jl8 jl8Var, r4i r4iVar) throws IOException {
        while (true) {
            c cVar = (c) rk1.i(this.c);
            long j = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j <= this.d) {
                e(false, j);
                return g(jl8Var, j, r4iVar);
            }
            if (!i(jl8Var, jK)) {
                return g(jl8Var, jK, r4iVar);
            }
            jl8Var.l();
            e eVarA = this.f17830b.a(jl8Var, cVar.m());
            int i = eVarA.f17835a;
            if (i == -3) {
                e(false, jK);
                return g(jl8Var, jK, r4iVar);
            }
            if (i == -2) {
                cVar.p(eVarA.f17836b, eVarA.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(jl8Var, eVarA.c);
                    e(true, eVarA.c);
                    return g(jl8Var, eVarA.c, r4iVar);
                }
                cVar.o(eVarA.f17836b, eVarA.c);
            }
        }
    }

    public final boolean d() {
        return this.c != null;
    }

    public final void e(boolean z, long j) {
        this.c = null;
        this.f17830b.b();
        f(z, j);
    }

    public void f(boolean z, long j) {
    }

    public final int g(jl8 jl8Var, long j, r4i r4iVar) {
        if (j == jl8Var.getPosition()) {
            return 0;
        }
        r4iVar.f32179a = j;
        return 1;
    }

    public final void h(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.l() != j) {
            this.c = a(j);
        }
    }

    public final boolean i(jl8 jl8Var, long j) throws IOException {
        long position = j - jl8Var.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        jl8Var.p((int) position);
        return true;
    }
}
