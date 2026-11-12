package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class b7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3885b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;
    public final int[] j = new int[255];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final okh f3886k = new okh(255);

    public static boolean a(jl8 jl8Var, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return jl8Var.k(bArr, i, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public boolean b(jl8 jl8Var, boolean z) throws IOException {
        c();
        this.f3886k.L(27);
        if (!a(jl8Var, this.f3886k.d(), 0, 27, z) || this.f3886k.F() != 1332176723) {
            return false;
        }
        int iD = this.f3886k.D();
        this.f3884a = iD;
        if (iD != 0) {
            if (z) {
                return false;
            }
            throw new ParserException("unsupported bit stream revision");
        }
        this.f3885b = this.f3886k.D();
        this.c = this.f3886k.r();
        this.d = this.f3886k.t();
        this.e = this.f3886k.t();
        this.f = this.f3886k.t();
        int iD2 = this.f3886k.D();
        this.g = iD2;
        this.h = iD2 + 27;
        this.f3886k.L(iD2);
        jl8Var.i(this.f3886k.d(), 0, this.g);
        for (int i = 0; i < this.g; i++) {
            this.j[i] = this.f3886k.D();
            this.i += this.j[i];
        }
        return true;
    }

    public void c() {
        this.f3884a = 0;
        this.f3885b = 0;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public boolean d(jl8 jl8Var) throws IOException {
        return e(jl8Var, -1L);
    }

    public boolean e(jl8 jl8Var, long j) throws IOException {
        rk1.a(jl8Var.getPosition() == jl8Var.n());
        this.f3886k.L(4);
        while (true) {
            if ((j != -1 && jl8Var.getPosition() + 4 >= j) || !a(jl8Var, this.f3886k.d(), 0, 4, true)) {
                break;
            }
            this.f3886k.P(0);
            if (this.f3886k.F() == 1332176723) {
                jl8Var.l();
                return true;
            }
            jl8Var.p(1);
        }
        do {
            if (j != -1 && jl8Var.getPosition() >= j) {
                break;
            }
        } while (jl8Var.a(1) != -1);
        return false;
    }
}
