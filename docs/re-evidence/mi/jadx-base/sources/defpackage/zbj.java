package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zbj implements il8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Format f41099a;
    public snp c;
    public int e;
    public long f;
    public int g;
    public int h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f41100b = new okh(9);
    public int d = 0;

    public zbj(Format format) {
        this.f41099a = format;
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        this.d = 0;
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        kl8Var.k(new arl.b(-9223372036854775807L));
        snp snpVarD = kl8Var.d(0, 3);
        this.c = snpVarD;
        snpVarD.b(this.f41099a);
        kl8Var.m();
    }

    public final boolean c(jl8 jl8Var) throws IOException {
        this.f41100b.L(8);
        if (!jl8Var.e(this.f41100b.d(), 0, 8, true)) {
            return false;
        }
        if (this.f41100b.n() != 1380139777) {
            throw new IOException("Input not RawCC");
        }
        this.e = this.f41100b.D();
        return true;
    }

    public final void d(jl8 jl8Var) throws IOException {
        while (this.g > 0) {
            this.f41100b.L(3);
            jl8Var.readFully(this.f41100b.d(), 0, 3);
            this.c.d(this.f41100b, 3);
            this.h += 3;
            this.g--;
        }
        int i = this.h;
        if (i > 0) {
            this.c.e(this.f, 1, i, 0, null);
        }
    }

    public final boolean e(jl8 jl8Var) throws IOException {
        int i = this.e;
        if (i == 0) {
            this.f41100b.L(5);
            if (!jl8Var.e(this.f41100b.d(), 0, 5, true)) {
                return false;
            }
            this.f = (this.f41100b.F() * 1000) / 45;
        } else {
            if (i != 1) {
                int i2 = this.e;
                StringBuilder sb = new StringBuilder(39);
                sb.append("Unsupported version number: ");
                sb.append(i2);
                throw new ParserException(sb.toString());
            }
            this.f41100b.L(9);
            if (!jl8Var.e(this.f41100b.d(), 0, 9, true)) {
                return false;
            }
            this.f = this.f41100b.w();
        }
        this.g = this.f41100b.D();
        this.h = 0;
        return true;
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        rk1.i(this.c);
        while (true) {
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException();
                    }
                    d(jl8Var);
                    this.d = 1;
                    return 0;
                }
                if (!e(jl8Var)) {
                    this.d = 0;
                    return -1;
                }
                this.d = 2;
            } else {
                if (!c(jl8Var)) {
                    return -1;
                }
                this.d = 1;
            }
        }
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        this.f41100b.L(8);
        jl8Var.i(this.f41100b.d(), 0, 8);
        return this.f41100b.n() == 1380139777;
    }

    @Override // defpackage.il8
    public void release() {
    }
}
