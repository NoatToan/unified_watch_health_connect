package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class zw9 implements il8 {
    public static final nl8 o = new nl8() { // from class: yw9
        @Override // defpackage.nl8
        public final il8[] c() {
            return zw9.j();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f41742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f41743b;
    public final boolean c;
    public final ax9.a d;
    public kl8 e;
    public snp f;
    public int g;
    public Metadata h;
    public ex9 i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41744k;
    public xw9 l;
    public int m;
    public long n;

    public zw9() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] j() {
        return new il8[]{new zw9()};
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            xw9 xw9Var = this.l;
            if (xw9Var != null) {
                xw9Var.h(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.f41743b.L(0);
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.e = kl8Var;
        this.f = kl8Var.d(0, 1);
        kl8Var.m();
    }

    public final long d(okh okhVar, boolean z) {
        boolean zD;
        rk1.e(this.i);
        int iE = okhVar.e();
        while (iE <= okhVar.f() - 16) {
            okhVar.P(iE);
            if (ax9.d(okhVar, this.i, this.f41744k, this.d)) {
                okhVar.P(iE);
                return this.d.f3535a;
            }
            iE++;
        }
        if (!z) {
            okhVar.P(iE);
            return -1L;
        }
        while (iE <= okhVar.f() - this.j) {
            okhVar.P(iE);
            try {
                zD = ax9.d(okhVar, this.i, this.f41744k, this.d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (okhVar.e() <= okhVar.f() && zD) {
                okhVar.P(iE);
                return this.d.f3535a;
            }
            iE++;
        }
        okhVar.P(okhVar.f());
        return -1L;
    }

    public final void e(jl8 jl8Var) throws IOException {
        this.f41744k = bx9.b(jl8Var);
        ((kl8) wlq.j(this.e)).k(h(jl8Var.getPosition(), jl8Var.getLength()));
        this.g = 5;
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        int i = this.g;
        if (i == 0) {
            m(jl8Var);
            return 0;
        }
        if (i == 1) {
            i(jl8Var);
            return 0;
        }
        if (i == 2) {
            o(jl8Var);
            return 0;
        }
        if (i == 3) {
            n(jl8Var);
            return 0;
        }
        if (i == 4) {
            e(jl8Var);
            return 0;
        }
        if (i == 5) {
            return l(jl8Var, r4iVar);
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        bx9.c(jl8Var, false);
        return bx9.a(jl8Var);
    }

    public final arl h(long j, long j2) {
        rk1.e(this.i);
        ex9 ex9Var = this.i;
        if (ex9Var.f17151k != null) {
            return new dx9(ex9Var, j);
        }
        if (j2 == -1 || ex9Var.j <= 0) {
            return new arl.b(ex9Var.g());
        }
        xw9 xw9Var = new xw9(ex9Var, this.f41744k, j, j2);
        this.l = xw9Var;
        return xw9Var.b();
    }

    public final void i(jl8 jl8Var) throws IOException {
        byte[] bArr = this.f41742a;
        jl8Var.i(bArr, 0, bArr.length);
        jl8Var.l();
        this.g = 2;
    }

    public final void k() {
        ((snp) wlq.j(this.f)).e((this.n * FolmeCore.NANOS_TO_MS) / ((long) ((ex9) wlq.j(this.i)).e), 1, this.m, 0, null);
    }

    public final int l(jl8 jl8Var, r4i r4iVar) throws IOException {
        boolean z;
        rk1.e(this.f);
        rk1.e(this.i);
        xw9 xw9Var = this.l;
        if (xw9Var != null && xw9Var.d()) {
            return this.l.c(jl8Var, r4iVar);
        }
        if (this.n == -1) {
            this.n = ax9.i(jl8Var, this.i);
            return 0;
        }
        int iF = this.f41743b.f();
        if (iF < 32768) {
            int i = jl8Var.read(this.f41743b.d(), iF, 32768 - iF);
            z = i == -1;
            if (!z) {
                this.f41743b.O(iF + i);
            } else if (this.f41743b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z = false;
        }
        int iE = this.f41743b.e();
        int i2 = this.m;
        int i3 = this.j;
        if (i2 < i3) {
            okh okhVar = this.f41743b;
            okhVar.Q(Math.min(i3 - i2, okhVar.a()));
        }
        long jD = d(this.f41743b, z);
        int iE2 = this.f41743b.e() - iE;
        this.f41743b.P(iE);
        this.f.d(this.f41743b, iE2);
        this.m += iE2;
        if (jD != -1) {
            k();
            this.m = 0;
            this.n = jD;
        }
        if (this.f41743b.a() < 16) {
            int iA = this.f41743b.a();
            System.arraycopy(this.f41743b.d(), this.f41743b.e(), this.f41743b.d(), 0, iA);
            this.f41743b.P(0);
            this.f41743b.O(iA);
        }
        return 0;
    }

    public final void m(jl8 jl8Var) throws IOException {
        this.h = bx9.d(jl8Var, !this.c);
        this.g = 1;
    }

    public final void n(jl8 jl8Var) throws IOException {
        bx9.a aVar = new bx9.a(this.i);
        boolean zE = false;
        while (!zE) {
            zE = bx9.e(jl8Var, aVar);
            this.i = (ex9) wlq.j(aVar.f4694a);
        }
        rk1.e(this.i);
        this.j = Math.max(this.i.c, 6);
        ((snp) wlq.j(this.f)).b(this.i.h(this.f41742a, this.h));
        this.g = 4;
    }

    public final void o(jl8 jl8Var) throws IOException {
        bx9.j(jl8Var);
        this.g = 3;
    }

    @Override // defpackage.il8
    public void release() {
    }

    public zw9(int i) {
        this.f41742a = new byte[42];
        this.f41743b = new okh(new byte[32768], 0);
        this.c = (i & 1) != 0;
        this.d = new ax9.a();
        this.g = 0;
    }
}
