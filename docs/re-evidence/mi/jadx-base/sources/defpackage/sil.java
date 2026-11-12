package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class sil extends a87.b {
    public static final BigInteger j = ejl.j;
    public uil i;

    public sil() {
        super(j);
        this.i = new uil(this, null, null);
        this.f755b = m(z77.f40975a);
        this.c = m(BigInteger.valueOf(7L));
        this.d = new BigInteger(1, h7c.a("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 2;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new sil();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new uil(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new uil(this, g87Var, g87Var2, g87VarArr, z);
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
