package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ckl extends a87.b {
    public static final BigInteger j = new BigInteger(1, h7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));
    public ikl i;

    public ckl() {
        super(j);
        this.i = new ikl(this, null, null);
        this.f755b = m(z77.f40975a);
        this.c = m(BigInteger.valueOf(5L));
        this.d = new BigInteger(1, h7c.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 2;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new ckl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new ikl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new ikl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new gkl(bigInteger);
    }

    @Override // defpackage.a87
    public int s() {
        return j.bitLength();
    }

    @Override // defpackage.a87
    public h97 t() {
        return this.i;
    }
}
