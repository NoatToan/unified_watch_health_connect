package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class kei {
    public boolean c;
    public boolean d;
    public boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rfp f23775a = new rfp(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f23776b = new okh();

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(okh okhVar) {
        int iE = okhVar.e();
        if (okhVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        okhVar.j(bArr, 0, 9);
        okhVar.P(iE);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    public static long m(byte[] bArr) {
        byte b2 = bArr[0];
        long j = (((((long) b2) & 56) >> 3) << 30) | ((((long) b2) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b3 = bArr[2];
        return j | (((((long) b3) & 248) >> 3) << 15) | ((((long) b3) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final int b(jl8 jl8Var) {
        this.f23776b.M(wlq.f);
        this.c = true;
        jl8Var.l();
        return 0;
    }

    public long c() {
        return this.h;
    }

    public rfp d() {
        return this.f23775a;
    }

    public boolean e() {
        return this.c;
    }

    public final int f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public int g(jl8 jl8Var, r4i r4iVar) throws IOException {
        if (!this.e) {
            return j(jl8Var, r4iVar);
        }
        if (this.g == -9223372036854775807L) {
            return b(jl8Var);
        }
        if (!this.d) {
            return h(jl8Var, r4iVar);
        }
        long j = this.f;
        if (j == -9223372036854775807L) {
            return b(jl8Var);
        }
        this.h = this.f23775a.b(this.g) - this.f23775a.b(j);
        return b(jl8Var);
    }

    public final int h(jl8 jl8Var, r4i r4iVar) throws IOException {
        int iMin = (int) Math.min(20000L, jl8Var.getLength());
        long j = 0;
        if (jl8Var.getPosition() != j) {
            r4iVar.f32179a = j;
            return 1;
        }
        this.f23776b.L(iMin);
        jl8Var.l();
        jl8Var.i(this.f23776b.d(), 0, iMin);
        this.f = i(this.f23776b);
        this.d = true;
        return 0;
    }

    public final long i(okh okhVar) {
        int iF = okhVar.f();
        for (int iE = okhVar.e(); iE < iF - 3; iE++) {
            if (f(okhVar.d(), iE) == 442) {
                okhVar.P(iE + 4);
                long jL = l(okhVar);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int j(jl8 jl8Var, r4i r4iVar) throws IOException {
        long length = jl8Var.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j = length - ((long) iMin);
        if (jl8Var.getPosition() != j) {
            r4iVar.f32179a = j;
            return 1;
        }
        this.f23776b.L(iMin);
        jl8Var.l();
        jl8Var.i(this.f23776b.d(), 0, iMin);
        this.g = k(this.f23776b);
        this.e = true;
        return 0;
    }

    public final long k(okh okhVar) {
        int iE = okhVar.e();
        for (int iF = okhVar.f() - 4; iF >= iE; iF--) {
            if (f(okhVar.d(), iF) == 442) {
                okhVar.P(iF + 4);
                long jL = l(okhVar);
                if (jL != -9223372036854775807L) {
                    return jL;
                }
            }
        }
        return -9223372036854775807L;
    }
}
