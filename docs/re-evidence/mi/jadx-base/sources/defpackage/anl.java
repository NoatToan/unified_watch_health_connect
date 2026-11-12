package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class anl extends a87.a {
    public cnl j;

    public anl() {
        super(163, 3, 6, 7);
        this.j = new cnl(this, null, null);
        g87 g87VarM = m(BigInteger.valueOf(1L));
        this.f755b = g87VarM;
        this.c = g87VarM;
        this.d = new BigInteger(1, h7c.a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 6;
    }

    @Override // a87.a
    public boolean G() {
        return true;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new anl();
    }

    @Override // defpackage.a87
    public w87 e() {
        return new i3r();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new cnl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new cnl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new yml(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return 163;
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.j;
    }
}
