package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ad5 extends a87.b {
    public static final BigInteger j = bhg.H(cd5.f5205a);
    public gd5 i;

    public ad5() {
        super(j);
        this.i = new gd5(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.c = m(new BigInteger(1, h7c.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.d = new BigInteger(1, h7c.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.e = BigInteger.valueOf(8L);
        this.f = 4;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 4;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new ad5();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new gd5(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new gd5(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new ed5(bigInteger);
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
