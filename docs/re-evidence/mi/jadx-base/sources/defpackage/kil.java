package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class kil extends a87.b {
    public static final BigInteger j = new BigInteger(1, h7c.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    public qil i;

    public kil() {
        super(j);
        this.i = new qil(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = m(new BigInteger(1, h7c.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.d = new BigInteger(1, h7c.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 2;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new kil();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new qil(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new qil(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new oil(bigInteger);
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
