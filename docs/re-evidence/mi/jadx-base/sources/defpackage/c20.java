package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class c20 implements il8 {
    public static final nl8 d = new nl8() { // from class: b20
        @Override // defpackage.nl8
        public final il8[] c() {
            return c20.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d20 f4846a = new d20();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f4847b = new okh(2786);
    public boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] d() {
        return new il8[]{new c20()};
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        this.c = false;
        this.f4846a.c();
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.f4846a.f(kl8Var, new i2q.d(0, 1));
        kl8Var.m();
        kl8Var.k(new arl.b(-9223372036854775807L));
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        int i = jl8Var.read(this.f4847b.d(), 0, 2786);
        if (i == -1) {
            return -1;
        }
        this.f4847b.P(0);
        this.f4847b.O(i);
        if (!this.c) {
            this.f4846a.e(0L, 4);
            this.c = true;
        }
        this.f4846a.a(this.f4847b);
        return 0;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        okh okhVar = new okh(10);
        int i = 0;
        while (true) {
            jl8Var.i(okhVar.d(), 0, 10);
            okhVar.P(0);
            if (okhVar.G() != 4801587) {
                break;
            }
            okhVar.Q(3);
            int iC = okhVar.C();
            i += iC + 10;
            jl8Var.o(iC);
        }
        jl8Var.l();
        jl8Var.o(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            jl8Var.i(okhVar.d(), 0, 6);
            okhVar.P(0);
            if (okhVar.J() != 2935) {
                jl8Var.l();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                jl8Var.o(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iF = e20.f(okhVar.d());
                if (iF == -1) {
                    return false;
                }
                jl8Var.o(iF - 6);
            }
        }
    }

    @Override // defpackage.il8
    public void release() {
    }
}
