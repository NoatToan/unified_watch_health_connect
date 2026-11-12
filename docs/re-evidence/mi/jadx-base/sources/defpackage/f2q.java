package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class f2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17343a;
    public boolean d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rfp f17344b = new rfp(0);
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public final okh c = new okh();

    public f2q(int i) {
        this.f17343a = i;
    }

    public final int a(jl8 jl8Var) {
        this.c.M(wlq.f);
        this.d = true;
        jl8Var.l();
        return 0;
    }

    public long b() {
        return this.i;
    }

    public rfp c() {
        return this.f17344b;
    }

    public boolean d() {
        return this.d;
    }

    public int e(jl8 jl8Var, r4i r4iVar, int i) throws IOException {
        if (i <= 0) {
            return a(jl8Var);
        }
        if (!this.f) {
            return h(jl8Var, r4iVar, i);
        }
        if (this.h == -9223372036854775807L) {
            return a(jl8Var);
        }
        if (!this.e) {
            return f(jl8Var, r4iVar, i);
        }
        long j = this.g;
        if (j == -9223372036854775807L) {
            return a(jl8Var);
        }
        this.i = this.f17344b.b(this.h) - this.f17344b.b(j);
        return a(jl8Var);
    }

    public final int f(jl8 jl8Var, r4i r4iVar, int i) throws IOException {
        int iMin = (int) Math.min(this.f17343a, jl8Var.getLength());
        long j = 0;
        if (jl8Var.getPosition() != j) {
            r4iVar.f32179a = j;
            return 1;
        }
        this.c.L(iMin);
        jl8Var.l();
        jl8Var.i(this.c.d(), 0, iMin);
        this.g = g(this.c, i);
        this.e = true;
        return 0;
    }

    public final long g(okh okhVar, int i) {
        int iF = okhVar.f();
        for (int iE = okhVar.e(); iE < iF; iE++) {
            if (okhVar.d()[iE] == 71) {
                long jB = j2q.b(okhVar, iE, i);
                if (jB != -9223372036854775807L) {
                    return jB;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(jl8 jl8Var, r4i r4iVar, int i) throws IOException {
        long length = jl8Var.getLength();
        int iMin = (int) Math.min(this.f17343a, length);
        long j = length - ((long) iMin);
        if (jl8Var.getPosition() != j) {
            r4iVar.f32179a = j;
            return 1;
        }
        this.c.L(iMin);
        jl8Var.l();
        jl8Var.i(this.c.d(), 0, iMin);
        this.h = i(this.c, i);
        this.f = true;
        return 0;
    }

    public final long i(okh okhVar, int i) {
        int iE = okhVar.e();
        int iF = okhVar.f();
        while (true) {
            iF--;
            if (iF < iE) {
                return -9223372036854775807L;
            }
            if (okhVar.d()[iF] == 71) {
                long jB = j2q.b(okhVar, iF, i);
                if (jB != -9223372036854775807L) {
                    return jB;
                }
            }
        }
    }
}
