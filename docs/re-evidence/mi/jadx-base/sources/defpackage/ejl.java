package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ejl extends a87.b {
    public static final BigInteger j = new BigInteger(1, h7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    public kjl i;

    public ejl() {
        super(j);
        this.i = new kjl(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.c = m(new BigInteger(1, h7c.a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.d = new BigInteger(1, h7c.a("0100000000000000000000351EE786A818F3A1A16B"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 2;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new ejl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new kjl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new kjl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new ijl(bigInteger);
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
