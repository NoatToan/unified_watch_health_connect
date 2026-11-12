package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class enl extends a87.a {
    public gnl j;

    public enl() {
        super(163, 3, 6, 7);
        this.j = new gnl(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.c = m(new BigInteger(1, h7c.a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.d = new BigInteger(1, h7c.a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 6;
    }

    @Override // a87.a
    public boolean G() {
        return false;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new enl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new gnl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new gnl(this, g87Var, g87Var2, g87VarArr, z);
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
