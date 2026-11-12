package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xio {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public snp f39168b;
    public kl8 c;
    public c7h d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f39169k;
    public boolean l;
    public boolean m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a7h f39167a = new a7h();
    public b j = new b();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Format f39170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c7h f39171b;
    }

    public static final class c implements c7h {
        public c() {
        }

        @Override // defpackage.c7h
        public long a(jl8 jl8Var) {
            return -1L;
        }

        @Override // defpackage.c7h
        public arl b() {
            return new arl.b(-9223372036854775807L);
        }

        @Override // defpackage.c7h
        public void c(long j) {
        }
    }

    public final void a() {
        rk1.i(this.f39168b);
        wlq.j(this.c);
    }

    public long b(long j) {
        return (j * FolmeCore.NANOS_TO_MS) / ((long) this.i);
    }

    public long c(long j) {
        return (((long) this.i) * j) / FolmeCore.NANOS_TO_MS;
    }

    public void d(kl8 kl8Var, snp snpVar) {
        this.c = kl8Var;
        this.f39168b = snpVar;
        l(true);
    }

    public void e(long j) {
        this.g = j;
    }

    public abstract long f(okh okhVar);

    public final int g(jl8 jl8Var, r4i r4iVar) throws IOException {
        a();
        int i = this.h;
        if (i == 0) {
            return j(jl8Var);
        }
        if (i == 1) {
            jl8Var.p((int) this.f);
            this.h = 2;
            return 0;
        }
        if (i == 2) {
            wlq.j(this.d);
            return k(jl8Var, r4iVar);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public final boolean h(jl8 jl8Var) throws IOException {
        while (this.f39167a.d(jl8Var)) {
            this.f39169k = jl8Var.getPosition() - this.f;
            if (!i(this.f39167a.c(), this.f, this.j)) {
                return true;
            }
            this.f = jl8Var.getPosition();
        }
        this.h = 3;
        return false;
    }

    public abstract boolean i(okh okhVar, long j, b bVar) throws IOException;

    public final int j(jl8 jl8Var) throws IOException {
        if (!h(jl8Var)) {
            return -1;
        }
        Format format = this.j.f39170a;
        this.i = format.z;
        if (!this.m) {
            this.f39168b.b(format);
            this.m = true;
        }
        c7h c7hVar = this.j.f39171b;
        if (c7hVar != null) {
            this.d = c7hVar;
        } else if (jl8Var.getLength() == -1) {
            this.d = new c();
        } else {
            b7h b7hVarB = this.f39167a.b();
            this.d = new hw5(this, this.f, jl8Var.getLength(), b7hVarB.h + b7hVarB.i, b7hVarB.c, (b7hVarB.f3885b & 4) != 0);
        }
        this.h = 2;
        this.f39167a.f();
        return 0;
    }

    public final int k(jl8 jl8Var, r4i r4iVar) throws IOException {
        long jA = this.d.a(jl8Var);
        if (jA >= 0) {
            r4iVar.f32179a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.l) {
            this.c.k((arl) rk1.i(this.d.b()));
            this.l = true;
        }
        if (this.f39169k <= 0 && !this.f39167a.d(jl8Var)) {
            this.h = 3;
            return -1;
        }
        this.f39169k = 0L;
        okh okhVarC = this.f39167a.c();
        long jF = f(okhVarC);
        if (jF >= 0) {
            long j = this.g;
            if (j + jF >= this.e) {
                long jB = b(j);
                this.f39168b.d(okhVarC, okhVarC.f());
                this.f39168b.e(jB, 1, okhVarC.f(), 0, null);
                this.e = -1L;
            }
        }
        this.g += jF;
        return 0;
    }

    public void l(boolean z) {
        if (z) {
            this.j = new b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public final void m(long j, long j2) {
        this.f39167a.e();
        if (j == 0) {
            l(!this.l);
        } else if (this.h != 0) {
            this.e = c(j2);
            ((c7h) wlq.j(this.d)).c(this.e);
            this.h = 2;
        }
    }
}
