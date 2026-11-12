package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class tu0 implements il8 {
    public static final nl8 m = new nl8() { // from class: su0
        @Override // defpackage.nl8
        public final il8[] c() {
            return tu0.i();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uu0 f35041b;
    public final okh c;
    public final okh d;
    public final nkh e;
    public kl8 f;
    public long g;
    public long h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f35042k;
    public boolean l;

    public tu0() {
        this(0);
    }

    private static int e(int i, long j) {
        return (int) ((((long) (i * 8)) * FolmeCore.NANOS_TO_MS) / j);
    }

    private arl h(long j) {
        return new kf4(j, this.h, e(this.i, this.f35041b.k()), this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] i() {
        return new il8[]{new tu0()};
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        this.f35042k = false;
        this.f35041b.c();
        this.g = j2;
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.f = kl8Var;
        this.f35041b.f(kl8Var, new i2q.d(0, 1));
        kl8Var.m();
    }

    public final void d(jl8 jl8Var) throws IOException {
        if (this.j) {
            return;
        }
        this.i = -1;
        jl8Var.l();
        long j = 0;
        if (jl8Var.getPosition() == 0) {
            k(jl8Var);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (jl8Var.k(this.d.d(), 0, 2, true)) {
                    this.d.P(0);
                    if (!uu0.m(this.d.J())) {
                        break;
                    }
                    if (jl8Var.k(this.d.d(), 0, 4, true)) {
                        this.e.p(14);
                        int iH = this.e.h(13);
                        if (iH <= 6) {
                            this.j = true;
                            throw new ParserException("Malformed ADTS stream");
                        }
                        j += (long) iH;
                        i2++;
                        if (i2 != 1000 && jl8Var.q(iH - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i = i2;
            break;
        }
        jl8Var.l();
        if (i > 0) {
            this.i = (int) (j / ((long) i));
        } else {
            this.i = -1;
        }
        this.j = true;
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        rk1.i(this.f);
        long length = jl8Var.getLength();
        boolean z = ((this.f35040a & 1) == 0 || length == -1) ? false : true;
        if (z) {
            d(jl8Var);
        }
        int i = jl8Var.read(this.c.d(), 0, 2048);
        boolean z2 = i == -1;
        j(length, z, z2);
        if (z2) {
            return -1;
        }
        this.c.P(0);
        this.c.O(i);
        if (!this.f35042k) {
            this.f35041b.e(this.g, 4);
            this.f35042k = true;
        }
        this.f35041b.a(this.c);
        return 0;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        int iK = k(jl8Var);
        int i = iK;
        while (true) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                jl8Var.i(this.d.d(), 0, 2);
                this.d.P(0);
                if (!uu0.m(this.d.J())) {
                    break;
                }
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                jl8Var.i(this.d.d(), 0, 4);
                this.e.p(14);
                int iH = this.e.h(13);
                if (iH <= 6) {
                    return false;
                }
                jl8Var.o(iH - 6);
                i3 += iH;
            }
            jl8Var.l();
            i++;
            if (i - iK >= 8192) {
                return false;
            }
            jl8Var.o(i);
        }
    }

    public final void j(long j, boolean z, boolean z2) {
        if (this.l) {
            return;
        }
        boolean z3 = z && this.i > 0;
        if (z3 && this.f35041b.k() == -9223372036854775807L && !z2) {
            return;
        }
        if (!z3 || this.f35041b.k() == -9223372036854775807L) {
            this.f.k(new arl.b(-9223372036854775807L));
        } else {
            this.f.k(h(j));
        }
        this.l = true;
    }

    public final int k(jl8 jl8Var) throws IOException {
        int i = 0;
        while (true) {
            jl8Var.i(this.d.d(), 0, 10);
            this.d.P(0);
            if (this.d.G() != 4801587) {
                break;
            }
            this.d.Q(3);
            int iC = this.d.C();
            i += iC + 10;
            jl8Var.o(iC);
        }
        jl8Var.l();
        jl8Var.o(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // defpackage.il8
    public void release() {
    }

    public tu0(int i) {
        this.f35040a = i;
        this.f35041b = new uu0(true);
        this.c = new okh(2048);
        this.i = -1;
        this.h = -1L;
        okh okhVar = new okh(10);
        this.d = okhVar;
        this.e = new nkh(okhVar.d());
    }
}
