package defpackage;

import com.google.android.exoplayer2.extractor.flv.a;
import com.google.android.exoplayer2.extractor.flv.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class kz9 implements il8 {
    public static final nl8 q = new nl8() { // from class: jz9
        @Override // defpackage.nl8
        public final il8[] c() {
            return kz9.h();
        }
    };
    public kl8 f;
    public boolean h;
    public long i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24442k;
    public int l;
    public long m;
    public boolean n;
    public a o;
    public b p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f24440a = new okh(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f24441b = new okh(9);
    public final okh c = new okh(11);
    public final okh d = new okh();
    public final uhl e = new uhl();
    public int g = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] h() {
        return new il8[]{new kz9()};
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.f = kl8Var;
    }

    public final void d() {
        if (this.n) {
            return;
        }
        this.f.k(new arl.b(-9223372036854775807L));
        this.n = true;
    }

    public final long e() {
        if (this.h) {
            return this.i + this.m;
        }
        if (this.e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.m;
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        rk1.i(this.f);
        while (true) {
            int i = this.g;
            if (i != 1) {
                if (i == 2) {
                    m(jl8Var);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (k(jl8Var)) {
                        return 0;
                    }
                } else if (!l(jl8Var)) {
                    return -1;
                }
            } else if (!j(jl8Var)) {
                return -1;
            }
        }
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        jl8Var.i(this.f24440a.d(), 0, 3);
        this.f24440a.P(0);
        if (this.f24440a.G() != 4607062) {
            return false;
        }
        jl8Var.i(this.f24440a.d(), 0, 2);
        this.f24440a.P(0);
        if ((this.f24440a.J() & 250) != 0) {
            return false;
        }
        jl8Var.i(this.f24440a.d(), 0, 4);
        this.f24440a.P(0);
        int iN = this.f24440a.n();
        jl8Var.l();
        jl8Var.o(iN);
        jl8Var.i(this.f24440a.d(), 0, 4);
        this.f24440a.P(0);
        return this.f24440a.n() == 0;
    }

    public final okh i(jl8 jl8Var) throws IOException {
        if (this.l > this.d.b()) {
            okh okhVar = this.d;
            okhVar.N(new byte[Math.max(okhVar.b() * 2, this.l)], 0);
        } else {
            this.d.P(0);
        }
        this.d.O(this.l);
        jl8Var.readFully(this.d.d(), 0, this.l);
        return this.d;
    }

    public final boolean j(jl8 jl8Var) throws IOException {
        if (!jl8Var.e(this.f24441b.d(), 0, 9, true)) {
            return false;
        }
        this.f24441b.P(0);
        this.f24441b.Q(4);
        int iD = this.f24441b.D();
        boolean z = (iD & 4) != 0;
        boolean z2 = (iD & 1) != 0;
        if (z && this.o == null) {
            this.o = new a(this.f.d(8, 1));
        }
        if (z2 && this.p == null) {
            this.p = new b(this.f.d(9, 2));
        }
        this.f.m();
        this.j = this.f24441b.n() - 5;
        this.g = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    public final boolean k(jl8 jl8Var) throws IOException {
        boolean zA;
        boolean z;
        long j;
        long jE = e();
        int i = this.f24442k;
        if (i == 8 && this.o != null) {
            d();
            zA = this.o.a(i(jl8Var), jE);
        } else {
            if (i != 9 || this.p == null) {
                if (i != 18 || this.n) {
                    jl8Var.p(this.l);
                    zA = false;
                    z = false;
                } else {
                    zA = this.e.a(i(jl8Var), jE);
                    long jD = this.e.d();
                    if (jD != -9223372036854775807L) {
                        this.f.k(new p7d(this.e.e(), this.e.f(), jD));
                        this.n = true;
                    }
                }
                if (!this.h && zA) {
                    this.h = true;
                    if (this.e.d() == -9223372036854775807L) {
                        j = -this.m;
                    } else {
                        j = 0;
                    }
                    this.i = j;
                }
                this.j = 4;
                this.g = 2;
                return z;
            }
            d();
            zA = this.p.a(i(jl8Var), jE);
        }
        z = true;
        if (!this.h) {
            this.h = true;
            if (this.e.d() == -9223372036854775807L) {
                j = -this.m;
            } else {
                j = 0;
            }
            this.i = j;
        }
        this.j = 4;
        this.g = 2;
        return z;
    }

    public final boolean l(jl8 jl8Var) throws IOException {
        if (!jl8Var.e(this.c.d(), 0, 11, true)) {
            return false;
        }
        this.c.P(0);
        this.f24442k = this.c.D();
        this.l = this.c.G();
        this.m = this.c.G();
        this.m = (((long) (this.c.D() << 24)) | this.m) * 1000;
        this.c.Q(3);
        this.g = 4;
        return true;
    }

    public final void m(jl8 jl8Var) throws IOException {
        jl8Var.p(this.j);
        this.j = 0;
        this.g = 3;
    }

    @Override // defpackage.il8
    public void release() {
    }
}
