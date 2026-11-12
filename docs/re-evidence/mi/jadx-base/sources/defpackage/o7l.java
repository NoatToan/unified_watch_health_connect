package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public class o7l extends a87.b {
    public static final BigInteger j = new BigInteger(1, h7c.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    public r7l i;

    public o7l() {
        super(j);
        this.i = new r7l(this, null, null);
        this.f755b = m(new BigInteger(1, h7c.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.c = m(new BigInteger(1, h7c.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.d = new BigInteger(1, h7c.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.a87
    public boolean B(int i) {
        return i == 2;
    }

    @Override // defpackage.a87
    public a87 c() {
        return new o7l();
    }

    @Override // defpackage.a87
    public h97 h(g87 g87Var, g87 g87Var2, boolean z) {
        return new r7l(this, g87Var, g87Var2, z);
    }

    @Override // defpackage.a87
    public h97 i(g87 g87Var, g87 g87Var2, g87[] g87VarArr, boolean z) {
        return new r7l(this, g87Var, g87Var2, g87VarArr, z);
    }

    @Override // defpackage.a87
    public g87 m(BigInteger bigInteger) {
        return new q7l(bigInteger);
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
