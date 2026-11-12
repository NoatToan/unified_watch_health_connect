package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class kkl extends a87.b {
    public static final BigInteger j = new BigInteger(1, h7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    public qkl i;

    public kkl() {
        super(j);
        this.i = new qkl(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.c = m(new BigInteger(1, h7c.a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.d = new BigInteger(1, h7c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 2;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new kkl();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new qkl(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new qkl(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new okl(bigInteger);
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
